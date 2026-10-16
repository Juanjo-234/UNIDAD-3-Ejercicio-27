Resolución del ejercicio N°27 de la unidad 3 de programación 2.
Este programa modela un sistema de gestión de notificaciones que administra diferentes canales de comunicación mediante el uso de herencia, atributos protegidos, polimorfismo y sobrescritura de métodos en Java.

Clases utilizadas
Notificacion: Clase base que almacena los datos comunes (mensaje, fechaEnvio) y define el método general enviar().
NotificacionEmail: Clase hija que extiende de Notificacion e incorpora la dirección de correo electrónico, sobrescribiendo el método enviar().
NotificacionSMS: Clase hija que extiende de Notificacion e incorpora el número telefónico, sobrescribiendo el método enviar().
NotificacionPush: Clase hija que extiende de Notificacion e incorpora el identificador de dispositivo, sobrescribiendo el método enviar().
