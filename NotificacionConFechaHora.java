
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class NotificacionConFechaHora
        extends NotificacionDecorador {

    public NotificacionConFechaHora(Notificacion notificacion) {
        super(notificacion);
    }

    @Override
    public void enviar() {
        notificacion.enviar();

        String fechaHora = LocalDateTime.now().format(
                DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")
        );

        System.out.println("[FECHA/HORA: " + fechaHora + "]");
    }

    @Override
    public String descripcion() {
        return super.descripcion() + " + Fecha y hora";
    }
}
