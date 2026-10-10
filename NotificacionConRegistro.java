
public class NotificacionConRegistro extends NotificacionDecorador {

    public NotificacionConRegistro(Notificacion notificacion) {
        super(notificacion);
    }

    @Override
    public void enviar() {
        notificacion.enviar();
        System.out.println(
                "[REGISTRO] Notificacion registrada en el sistema."
        );
    }

    @Override
    public String descripcion() {
        return super.descripcion() + " + Registro";
    }
}
