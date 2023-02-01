package HomeWork7.Task2;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.spec.RSAOtherPrimeInfo;

public class ForDev {


    public void methods(Class<User> userClass, Class<Person> personClass) throws NoSuchMethodException {

        // Methods

        Method methodPerson = personClass.getMethod("getDateOfBirth");
        Method[] methodsPerson = personClass.getMethods();

        Method methodsUser = userClass.getMethod("getPaswwrod");
        Method[] methodsUserr = userClass.getMethods();
        System.out.println("Method - Methods ---------------------------");
        System.out.println(methodPerson);
        System.out.println(methodsPerson);
        System.out.println(methodsUser);
        System.out.println(methodsUser);
        System.out.println("---------------------------- Method - Methods");
    }

    // Fields
    public void fields(Class<User> userClass, Class<Person> personClass) throws NoSuchFieldException {
        Field fieldPerson = personClass.getField("firstName");
        Field[] fieldPers = personClass.getFields();

        Field fieldUser = userClass.getField("login");
        Field[] fieldsdUser = userClass.getFields();

        System.out.println("Field - Fields -------------------");
        System.out.println(fieldPerson);
        System.out.println(fieldPers);
        System.out.println(fieldUser);
        System.out.println(fieldsdUser);
        System.out.println("---------------------------Field - Fields");
    }

    // DecleredMethod

    public void declaredMethods(Class<User> userClass, Class<Person> personClass) throws NoSuchMethodException {

        Method DeclaredPersonMethod = personClass.getDeclaredMethod("getDateOfBirth");
        Method DeclaredUserMethod = userClass.getDeclaredMethod("getEmail");

        Method[] methods = personClass.getDeclaredMethods();
        Method[] userMeth = userClass.getDeclaredMethods();

        System.out.println("DeclaredMethods ---------------------------------------");
        for (Method method1 : methods) {
            System.out.println(method1);
        }
        for (Method method1 : userMeth) {
            System.out.println(method1);
        }
        System.out.println("--------------------------------------  DeclaredMethods");
    }


    // DecleredFields
    public void declaredFields(Class<User> userClass, Class<Person> personClass) throws NoSuchFieldException {
        Field DeclaredFieldPerson = personClass.getDeclaredField("firstName");
        Field DeclaredFieldUser = userClass.getDeclaredField("login");

        System.out.println(DeclaredFieldPerson);
        System.out.println(DeclaredFieldUser);


        Field[] decFieldPerson = personClass.getDeclaredFields();
        Field[] decFieldUser = userClass.getDeclaredFields();

        System.out.println("DeclaredFields (foreach) ---------------------------------------");

        for (Field field1 : decFieldPerson) {
            System.out.println(field1);
        }

        for (Field field1 : decFieldUser) {
            System.out.println(field1);
        }
        System.out.println("--------------------------------------  DeclaredFields (foreach)");

    }

    public void setField(Person person, User user, Class<User> userClass, Class<Person> personClass) throws NoSuchMethodException, NoSuchFieldException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

        // Просестать занчения эелементов

        Field field1 = personClass.getDeclaredField("age");
        Field field2 = personClass.getDeclaredField("firstName");
        Field field3 = personClass.getDeclaredField("lastName");
        Field field4 = personClass.getDeclaredField("dateOfBirth");
        field1.setAccessible(true);
        field1.setInt(person, 1377);
        field2.set(person, "NewSet");
        field3.set(person, "NewLast");
        field4.setDouble(person, 12.12);


        // .field.get
        System.out.println("After set -  Age: " + field1.getInt(person));
        System.out.println("FirstName: " + field2.get(person));
        System.out.println("LastName: " + field3.get(person));
        System.out.println("Date of Birth: " + field4.getDouble(person));


        // .invoke() через .toString()
        Method methods = userClass.getDeclaredMethod("printUserInfo");
        methods.setAccessible(true);
        System.out.println(methods.invoke(user).toString());

    }

}

