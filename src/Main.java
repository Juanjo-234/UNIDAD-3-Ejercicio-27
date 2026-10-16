//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Notificacion email = new NotificacionEmail("¡Tu pedido ha sido despachado con éxito!", "2026-10-15", "cliente@example.com");
    Notificacion sms = new NotificacionSMS("Tu código de verificación bancaria es 8392.", "2026-10-15", "+5492615551234");
    Notificacion push = new NotificacionPush("Tienes un nuevo mensaje directo de Carlos.", "2026-10-15", "device_token_abc987xyz");
    
    System.out.println("=== SIMULANDO ENVÍO DE NOTIFICACIONES ===\n");
    email.enviar();
    sms.enviar();
    push.enviar();
}
