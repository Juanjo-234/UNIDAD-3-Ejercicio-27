public class NotificacionEmail extends Notificacion{
    private String direccionCorreo;

    public NotificacionEmail(String mensaje, String fechaEnvio, String direccionCorreo){
        super(mensaje, fechaEnvio);
        this.direccionCorreo = direccionCorreo;
    }

    @Override
    public String enviar() {
        System.out.println("[EMAIL] Conectando al servidor SMTP...");
        System.out.println("Enviando correo a: " + direccionCorreo);
        System.out.println("Contenido: " + mensaje + " | Fecha: " + fechaEnvio);
        System.out.println("Estado: Correo enviado exitosamente.\n");
        return "";
    }
}
