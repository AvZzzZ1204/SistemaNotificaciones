
public class NotificacionConFirma extends NotificacionDecorador {

    private String firma;

    public NotificacionConFirma(
            Notificacion notificacion,
            String firma) {

        super(notificacion);
        this.firma = firma;
    }

    @Override
    public void enviar() {
        notificacion.enviar();
        System.out.println("[FIRMA] - " + firma);
    }

    @Override
    public String descripcion() {
        return super.descripcion() + " + Firma (" + firma + ")";
    }
}
