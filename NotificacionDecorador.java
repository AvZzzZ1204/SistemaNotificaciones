
public abstract class NotificacionDecorador implements Notificacion {

    protected Notificacion notificacion;

    public NotificacionDecorador(Notificacion notificacion) {
        this.notificacion = notificacion;
    }

    @Override
    public void enviar() {
        notificacion.enviar();
    }

    @Override
    public String descripcion() {
        return notificacion.descripcion();
    }
}
