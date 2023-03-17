import business.EmailProcessorXCompany;

public class Main {
    public static void main(String[] args) {
        EmailProcessorXCompany emailProcessor = new EmailProcessorXCompany();

        emailProcessor.procesarEmail("gerencia", "bla@bla.com");
    }
}