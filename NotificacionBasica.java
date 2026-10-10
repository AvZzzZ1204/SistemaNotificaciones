
public class NotificacionBasica implements Notificacion {

    @Override
    public void enviar() {
        System.out.println("Enviando notificacion basica...");
    }

    @Override
    public String descripcion() {
        return "Notificacion basica";
    }
}
