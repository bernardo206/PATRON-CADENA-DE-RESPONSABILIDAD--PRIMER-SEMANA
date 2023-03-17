package cadenaderesponsabilidad;

import model.Email;

public class ManagerEmailHandler extends EmailHandler{
    public ManagerEmailHandler(EmailHandler succesor) {
        super(succesor);
    }

    public ManagerEmailHandler() {

    }

    @Override
    protected String processEmail(Email email) {
        return "El correo para Gerencia ha sido procesado con éxito";
    }

    @Override
    protected boolean isMyResponsability(Email email) {
        return email.getSubject().equals("gerencia") || email.getTo().equals("gerencia@colmena.com");
    }
}
