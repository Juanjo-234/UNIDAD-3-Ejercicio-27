public class NotificacionSMS extends Notificacion{
    private String numeroTelefono;

    public NotificacionSMS(String mensaje, String fechaEnvio, String numeroTelefono){
        super(mensaje, fechaEnvio);
        this.numeroTelefono = numeroTelefono;
    }

    @Override
    public String enviar() {
        System.out.println("[SMS] Conectando con la pasarela de mensajería (Gateway)...");
        System.out.println("Enviando SMS al número: " + numeroTelefono);
        System.out.println("Contenido: " + mensaje + " | Fecha: " + fechaEnvio);
        System.out.println("Estado: SMS entregado al operador.\n");
        return "";
    }
}
