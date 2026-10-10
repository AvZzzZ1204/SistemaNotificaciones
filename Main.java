
public class Main {

    public static void main(String[] args) {

        // Creamos una notificacion basica.
        Notificacion notificacion = new NotificacionBasica();

        // Aplicamos los decoradores.
        notificacion = new NotificacionConPrioridad(
                notificacion, "ALTA"
        );

        notificacion = new NotificacionConRegistro(
                notificacion
        );

        notificacion = new NotificacionConFirma(
                notificacion, "UNAN Leon"
        );

        notificacion = new NotificacionConFechaHora(
                notificacion
        );

        // Enviamos la notificacion decorada.
        System.out.println("=== ENVIO DE NOTIFICACION ===");
        notificacion.enviar();

        // Mostramos su descripcion.
        System.out.println();
        System.out.println("=== DESCRIPCION FINAL ===");
        System.out.println(notificacion.descripcion());
    }
}
