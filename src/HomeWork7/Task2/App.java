package HomeWork7.Task2;

import java.lang.reflect.InvocationTargetException;

public class App {
    public static void main(String[] args) throws NoSuchMethodException, NoSuchFieldException, IllegalAccessException, IllegalArgumentException,NoSuchFieldException, InvocationTargetException {
        User user = new User(12);
        Person person = new Person(123);

        Class <User> userClass = (Class<User>) user.getClass();
        Class<Person> personClass = (Class<Person>) person.getClass();

        ForDev dev = new ForDev();

       //  1 часть задания

        dev.methods(userClass, personClass);
        dev.fields(userClass, personClass);

        //  2 часть задания
        dev.declaredMethods(userClass,personClass);
        dev.declaredFields(userClass, personClass);

        // 3 часть задания

        dev.setField(person,user,userClass, personClass);




    }
}
