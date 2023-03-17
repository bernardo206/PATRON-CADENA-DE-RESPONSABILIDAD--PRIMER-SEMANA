package cadenaderesponsabilidad;

import model.Email;

public class SalesEmailHandler extends EmailHandler{
    public SalesEmailHandler(EmailHandler succesor) {
        super(succesor);
    }

    public SalesEmailHandler() {

    }

    @Override
    protected String processEmail(Email email) {
        return "El correo para el dpto. Comercial ha sido procesado con éxito";
    }

    @Override
    protected boolean isMyResponsability(Email email) {
        return email.getSubject().equals("comercial") || email.getTo().equals("comercial@colmena.com");
    }
}
