# Introducción
Las siguientes carpetas contienen código ejemplo para poder consumir los
servicios de SmarterWeb.

En cada carpeta se encuentra la forma de consumir dicho WebService en el
ambiente de pruebas. Para obtener el ambiente productivo es necesario contratar
un paquete.

Todos los ejemplos fueron creados usando la librería nativa SoapClient, por lo
que se recomienda incluirla en el archivo de configuración si tiene algún
problema al ejecutar los ejemplos.

## Autenticación
Antes de realizar cualquier otra operación es necesario autenticarse; este
ejemplo realiza un ejemplo sencillo de autenticación e imprime en pantalla el
token generado.

## Timbrado
El servicio de timbrado recibe el contenido de un XML y el token de
autenticación; este ejemplo da 2 opciones para consumir este servicio, siendo:
TimbrarXML y TimbrarXMLV2. La diferencia entre uno y otro es que TimbrarXML
solo devuelve el nodo timbre y TimbrarXMLV2 devuelve el XML ya timbrado.

En el ejemplo presentado se muestra en pantalla el resultado de haber consumido
el servicio.

## Cancelar
Para cancelar una factura electrónica se cuenta con 2 servicios distintos:
CancelarCSD y CancelarPEM. Con ambos servicios se pueden cancelar hasta 200
facturas de un mismo emisor.

En el ejemplo presentado se muestra en pantalla el acuse de cancelación después
de haber consumido el servicio. 

### CancelarCSD
Este servicio recibe los archivos cer y key, la contraseña del archivo key, el
RFC del receptor, los UUIDs a cancelar y el token de autenticación.

### CancelarPEM
Este servicio recibe los archivos cer y key en formato PEM, el RFC del
receptor, los UUIDs a cancelar y el token de autenticación.

## Saldo
Con este servicio se puede consultar los timbres utilizados y disponibles.
Debido a que debe utilizar una conexión segura y a que usa certificados de
prueba, se debe saltar la seguridad.