package yana.kulyk.exceptions;

public class PasswordValidator {

    public static boolean isValid(String login, String password, String confirmPassword) {
        try {
            if (login.length() >= 20 || !login.matches("A-Za-z")) {
                throw new WrongLoginException("Login.length>20");
            }
            if (password.length() > 20 || !password.equals(confirmPassword)) {
                throw new WrongPasswordException("Wrong password");
            }
        } catch (WrongLoginException e) {
            return false;
        } catch (WrongPasswordException e) {
            return false;
        }
        return true;

        /*
        - выучить что такое регулярные выражения (просмотреть мой урок или любой другой в инете
        - выучить что такое конструктор
        - разобраться что такое конструктор с параметрами и без параметров
        - разобраться как создавать объект и как вызвать конструктор
         */
    }
}
