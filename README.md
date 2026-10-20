Este programa está diseñado para modelar un sistema de notificaciones multiplataforma aplicando los pilares fundamentales de la programación orientada a objetos en Java: herencia, encapsulamiento, reutilización mediante la palabra clave super y polimorfismo a través de la sobrescritura de métodos (@Override).

A continuación se detalla exactamente lo que hace cada parte del programa:

Define la clase base Notificacion: Concentra los atributos comunes a cualquier alerta o mensaje (mensaje y fechaEnvio), junto con un constructor centralizado y un método genérico enviar().

Desarrolla las clases hijas (NotificacionEmail, NotificacionSMS y NotificacionPush): Extienden de Notificacion añadiendo los atributos particulares de cada canal de comunicación (dirección de correo, número telefónico e identificador de dispositivo, respectivamente).

Sobrescribe el método enviar(): Cada subclase implementa su propia versión de envío simulando el protocolo tecnológico o la traza específica correspondiente a su canal.

Ejecuta la prueba en el main: Crea una lista polimórfica de diferentes tipos de notificaciones, recorre la colección ejecutando el envío de cada una y muestra las trazas detalladas por consola.
