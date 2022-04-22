package utilities;

import com.github.javafaker.Faker;
import org.junit.Test;

import java.util.Random;

public class Utilities {

    static Faker faker = new Faker();

    public static String randomUserName(){
        String randomUserName = faker.name().username();
        return randomUserName;
    }

    public static String randomPassword(){
        String randomPassword = faker.name().username() ;
        return randomPassword;
    }

    public static String randomEmail(){
        String baseEmail = "@gmail.com";
        String randomEmail = randomUserName().concat(baseEmail);
        return randomEmail;
    }

    public static String randomFirstName(){
        String firstName = faker.name().firstName();
        return firstName;
    }

    public static String randomLastName(){
        String lastName = faker.name().lastName();
        return  lastName;
    }

}
