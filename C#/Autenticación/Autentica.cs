using System;
using Autenticación.Autenticacion;

namespace Test
{
    class Autentica
    {
        static void Main(string[] args)
        {
            try
            {
                wsAutenticacionSoapClient Autentica = new wsAutenticacionSoapClient();
                string Token = Autentica.AutenticarBasico("demo", "123456789");
                Console.WriteLine("El token generado es:\n" + Token);
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