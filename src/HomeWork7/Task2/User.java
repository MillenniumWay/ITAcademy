package HomeWork7.Task2;
//a) Создать свой класс Person с полями: firstName, lastName, age, dateOfBirth
//b) Добавить класс User, который наследуется от Person, с полями: login, password, email
//c) Добавить гетеры, сетеры. Добавить метод printUserInfo в User. Вывести с помощью рефлексии все поля и методы
public class User  extends Person{


    public String login;
    public int paswwrod;
    public String email;




    User  (String login, int paswwrod, String email) {
        this.login = login;
        this.paswwrod = paswwrod;
        this.email = email;
    }


    public String printUserInfo () {
        return "You in method printUserInfo () ";
    }



    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPaswwrod() {
        return paswwrod;
    }

    public void setPaswwrod(int paswwrod) {
        this.paswwrod = paswwrod;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}
