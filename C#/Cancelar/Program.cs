using Cancelar.Autenticacion;
using Cancelar.Cancelacion;
using System;
using System.IO;

namespace Test
{
    class Program
    {
        static void Main(string[] args)
        {
            try
            {
                wsAutenticacionSoapClient Autentica = new wsAutenticacionSoapClient();
                wsCancelacionSoapClient Cancelacion = new wsCancelacionSoapClient();
                string Token = Autentica.AutenticarBasico("demo", "123456789");
                Console.WriteLine("Seleccione una opcion:\n1. CancelaCSD\n2. CancelaPEM");
                string Result;
                byte[] CerBytes;
                byte[] KeyBytes;
                string CerB64;
                string KeyB64;
                // Los UUIDs para este ejemplo fueron generados de manera aleatoria
                string[] UUIDs = 
                {
                    "17aeeccc-6ec0-49af-b786-0878d34e0b27",
                    "a3216283-078c-418e-bf2c-2fb62e418d45"
                };
                switch ((char)Console.Read())
                {
                    case '1':
                        CerBytes = File.ReadAllBytes(@"Files\aad990814bp7_1210261233s.cer");
                        KeyBytes = File.ReadAllBytes(@"Files\aad990814bp7_1210261233s.key");
                        CerB64 = Convert.ToBase64String(CerBytes);
                        KeyB64 = Convert.ToBase64String(KeyBytes);
                        Result = Cancelacion.CancelarCSD(CerB64, KeyB64, "12345678a", "AAD990814BP7", UUIDs, Token);
                        break;
                    case '2':
                        CerBytes = File.ReadAllBytes(@"Files\aad990814bp7_1210261233s.cer.pem");
                        KeyBytes = File.ReadAllBytes(@"Files\aad990814bp7_1210261233s.key.pem");
                        CerB64 = Convert.ToBase64String(CerBytes);
                        KeyB64 = Convert.ToBase64String(KeyBytes);
                        Result = Cancelacion.CancelarPEM(CerB64, KeyB64, "AAD990814BP7", UUIDs, Token);
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