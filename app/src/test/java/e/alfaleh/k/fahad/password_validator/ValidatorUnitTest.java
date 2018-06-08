package e.alfaleh.k.fahad.password_validator;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ValidatorUnitTest {
    static String t1="IloveMyself";
    static String t2="password";
    static String t3="cool";
    static String t4="cool!12";
    static String t5="PassWo--rdIsCool!";
    static Validator validator;
    @BeforeClass
    public static void testing(){
        validator= new Validator();
    }
    @Test
    public void t1Valid(){

        assertEquals(3,validator.valid(t1));
    }
    @Test
    public void t2Valid(){
        assertEquals(1,validator.valid(t2));
    }
    @Test
    public void t3Valid(){
        assertEquals(1,validator.valid(t3));
    }
    @Test
    public void t4Valid(){
        assertEquals(4,validator.valid(t4));
    }
    @Test
    public void t5Valid(){
        assertEquals(5,validator.valid(t5));
    }
}
