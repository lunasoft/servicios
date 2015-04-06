using Saldo.Account;
using Saldo.Autenticacion;
using System;
using System.Net;
using System.Net.Security;
using System.Security.Cryptography.X509Certificates;
using System.ServiceModel;
using System.ServiceModel.Channels;

namespace Saldo
{
    class Program
    {
        static void Main(string[] args)
        {
            wsAutenticacionSoapClient Autentica = new wsAutenticacionSoapClient();
            string Token = Autentica.AutenticarBasico("demo", "123456789");
            IwsAccountClient Account = new IwsAccountClient();

            //Debido a que se usa un certificado de pruebas, se debe agregar este bloque de codigo
            ServicePointManager.ServerCertificateValidationCallback +=
                delegate(object sender, X509Certificate certificate, X509Chain chain, SslPolicyErrors sslPolicyErrors)
                {
                    return true;
                };
            using (new OperationContextScope(Account.InnerChannel))
            {
                OperationContext.Current.OutgoingMessageProperties[HttpRequestMessageProperty.Name] = new HttpRequestMessageProperty()
                {
                    Headers = { { "token", Token } }
                };
                try
                {
                    SaldoCliente Saldo = Account.GetSaldoClientById(null);
                    Console.WriteLine(Saldo.SaldoTimbres);
                    Console.WriteLine(Saldo.TimbresUtilizados);
                }
                catch (Exception e)
                {
                    Console.WriteLine(e.Message);
                }
                finally
                {
                    Pause();
                }
            }
        }

        public static void Pause()
        {
            Console.Write("Presione una tecla para continuar . . .");
            Console.ReadKey(false);
        }
    }
}
