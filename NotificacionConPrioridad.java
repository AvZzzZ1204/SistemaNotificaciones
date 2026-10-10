
public class NotificacionConPrioridad extends NotificacionDecorador {

    private String prioridad;

    public NotificacionConPrioridad(
            Notificacion notificacion,
            String prioridad) {

        super(notificacion);
        this.prioridad = prioridad;
    }

    @Override
    public void enviar() {
        notificacion.enviar();
        System.out.println("[PRIORIDAD: " + prioridad + "]");
    }

    @Override
    public String descripcion() {
        return super.descripcion()
                + " + Prioridad (" + prioridad + ")";
    }
}
