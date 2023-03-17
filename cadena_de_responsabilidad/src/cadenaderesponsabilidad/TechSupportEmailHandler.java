package cadenaderesponsabilidad;

import model.Email;

public class TechSupportEmailHandler extends EmailHandler{
    public TechSupportEmailHandler(EmailHandler succesor) {
        super(succesor);
    }

    public TechSupportEmailHandler() {

    }

    @Override
    protected String processEmail(Email email) {
        return "El correo para el dpto. de Soporte Técnico ha sido procesado con éxito";
    }

    @Override
    protected boolean isMyResponsability(Email email) {
        return email.getSubject().equals("técnica") || email.getTo().equals("tecnica@colmena.com");
    }
}
