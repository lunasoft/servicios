using System;
using System.IO;
using Timbrado.Autenticacion;
using Timbrado.Timbrar;

namespace Timbrado
{
    class Timbra
    {
        static void Main(string[] args)
        {
            try
            {
                wsAutenticacionSoapClient Autentica = new wsAutenticacionSoapClient();
                wsTimbradoSoapClient Timbrado = new wsTimbradoSoapClient();
                string Token = Autentica.AutenticarBasico("demo", "123456789");
                string XML = File.ReadAllText(@"Files\factura1peso.xml");
                Console.WriteLine("Seleccione una opcion:\n1. TimbrarXML\n2. TimbrarXMLV2");
                string Result;
                switch ((char)Console.Read())
                {
                    case '1':
                        Result = Timbrado.TimbrarXML(XML, Token);
                        break;
                    case '2':
                        Result = Timbrado.TimbrarXMLV2(XML, Token);
                        break;
                    default:
                        Result = "Ingreso una operacion no valida";
                        break;
                }
                Console.WriteLine(Result);
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

        public static void Pause()
        {
            Console.Write("Presione una tecla para continuar . . .");
            Console.ReadKey(false);
        }
    }
}
