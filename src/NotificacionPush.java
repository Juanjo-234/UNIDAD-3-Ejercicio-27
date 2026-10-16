public class NotificacionPush extends Notificacion{
    String identificadorDispositivo;

    public NotificacionPush(String mensaje, String fechaEnvio, String identificadorDispositivo){
        super(mensaje, fechaEnvio);
        this.identificadorDispositivo = identificadorDispositivo;
    }

    @Override
    public String enviar() {
        System.out.println("[PUSH] Conectando con APNs / FCM (Cloud Messaging)...");
        System.out.println("Enviando notificación al dispositivo ID: " + identificadorDispositivo);
        System.out.println("Contenido: " + mensaje + " | Fecha: " + fechaEnvio);
        System.out.println("Estado: Notificación push enviada al dispositivo.\n");
        return "";
    }
}
