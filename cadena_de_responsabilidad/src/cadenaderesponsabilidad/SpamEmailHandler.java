package cadenaderesponsabilidad;

import model.Email;

public class SpamEmailHandler extends EmailHandler{
    public SpamEmailHandler(EmailHandler succesor) {
        super(succesor);
    }

    public SpamEmailHandler() {
        this.setSuccesor(null);
    }

    @Override
    protected String processEmail(Email email) {
        return "El correo es spam";
    }

    @Override
    protected boolean isMyResponsability(Email email) {
        return true;
    }
}
