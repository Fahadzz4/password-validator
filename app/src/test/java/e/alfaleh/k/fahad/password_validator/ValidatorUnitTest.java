package e.alfaleh.k.fahad.password_validator;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ValidatorUnitTest {
    static String t1="IloveMyself";
    static String t2="password";
    static String t3="cool";
    static Validator validator;
    @BeforeClass
    public static void testing(){
        validator= new Validator();
    }

    @Test
    public void t1Valid(){

        assertEquals(2,validator.valid(t1));
    }

    @Test
    public void t2Valid(){
        assertEquals(2,validator.valid(t2));
    }

    @Test
    public void t3Valid(){
        assertEquals(2,validator.valid(t3));
    }
}
