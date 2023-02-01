package HomeWork7.Task2;

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.spec.RSAOtherPrimeInfo;

public class ForDev {

    // Methods //  19 -33
    // Fields //   37-50
    // DeclaredMethod // 54 - 70
    // DeclaredField //  75-94
    // Field.set (Person) // 99 - 120
    // Field.set (User) //  125 - 145
    // invoke().toString //  149 - 159

    public void methods(Class<User> userClass, Class<Person> personClass) throws NoSuchMethodException {


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

    // DecleredMethod //

    public void declaredMethods(Class<User> userClass, Class<Person> personClass) throws NoSuchMethodException {

        Method DeclaredPersonMethod = personClass.getDeclaredMethod("getDateOfBirth");
        Method DeclaredUserMethod = userClass.getDeclaredMethod("getEmail");

        Method[] methods = personClass.getDeclaredMethods();
        Method[] userMeth = userClass.getDeclaredMethods();

        System.out.println("DeclaredMethods ---------------------------------------");
        for (Method method1 : methods) {
            System.out.println(method1.toString());
        }
        for (Method method1 : userMeth) {
            System.out.println(method1);
        }
        System.out.println("----------------------------------------");
    }


    // DecleredFields //

    public void declaredFields(User user,Person person,Class<User> userClass, Class<Person> personClass) throws NoSuchFieldException, IllegalAccessException {

        Field DeclaredFieldPerson = personClass.getDeclaredField("firstName");
        Field DeclaredFieldUser = userClass.getDeclaredField("login");

        System.out.println(DeclaredFieldPerson);
        System.out.println(DeclaredFieldUser);


        Field[] decFieldPerson = personClass.getDeclaredFields();
        Field[] decFieldUser = userClass.getDeclaredFields();

        System.out.println("------------------------------------------");

        for (Field field1 : decFieldPerson) {System.out.println("Object Person: " +field1.get(person));}

        for (Field field1 : decFieldUser) {System.out.println("Object User: "+ field1.get(user));}
        System.out.println("--------------------------------------------------");

    }


    // Просетал Person

    public void setFieldForPerson(Person person, User user, Class<User> userClass, Class<Person> personClass) throws NoSuchMethodException, NoSuchFieldException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

        // Просетать занчения эелементов / For Person
        Field field1 = personClass.getDeclaredField("age");
        Field field2 = personClass.getDeclaredField("firstName");
        Field field3 = personClass.getDeclaredField("lastName");
        Field field4 = personClass.getDeclaredField("dateOfBirth");

        field1.setInt(person, 1337);
        field2.set(person, "NewSet");
        field3.set(person, "NewLast");
        field4.setDouble(person, 12.12);

        System.out.println("--------SetFieldForPerson----------");
        // .field.get
        System.out.println("After set -  Age: " + field1.getInt(person));
          System.out.println("FirstName: " + field2.get(person));
            System.out.println("LastName: " + field3.get(person));
              System.out.println("Date of Birth: " + field4.getDouble(person));
               System.out.println("-------------------------------");

    }


    // Просетал User

    public void setFieldForUser(Person person, User user, Class<User> userClass, Class<Person> personClass) throws NoSuchMethodException, NoSuchFieldException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

    Field field = userClass.getDeclaredField("login");
     Field field1 = userClass.getDeclaredField("paswwrod");
       Field field2 = userClass.getDeclaredField("email");
//          field.setAccessible(true);
//           field1.setAccessible(true);
//            field2.setAccessible(true);

        System.out.println("-------SetFieldForUser--------");
          field.set(user, "MoscowOfiice");
             field1.setInt(user, 9090990);
               field2.set(user,"nagibator@jabber.org");

    System.out.println("Login: " + field.get(user));
        System.out.println("Password: " + field1.getInt(user));
           System.out.println("Email: " + field2.get(user));

        System.out.println("---------------------------");

    }

    // Добавил invoke()

    public void invoke(Person person, User user, Class<User> userClass, Class<Person> personClass) throws NoSuchMethodException, NoSuchFieldException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

        System.out.println("------------Invoke().toString-------------");
          // .invoke() через .toString()
           Method methods = userClass.getDeclaredMethod("printUserInfo");
             methods.setAccessible(true);
                System.out.println(methods.invoke(user).toString());

    }

    }

