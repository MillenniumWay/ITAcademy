package HomeWork3;

public class AppBelarusPhoneValid {
        static Validator belarusianPhoneValidator = new BelarusPhoneValdator();
        static Validator emailValidator = new EmailValid();

        public static void main(String... args) {

            System.out.println(belarusianPhoneValidator.isValid("+375331231232"));
            System.out.println(emailValidator.isValid("noname@jabber.org"));
        }
    }

