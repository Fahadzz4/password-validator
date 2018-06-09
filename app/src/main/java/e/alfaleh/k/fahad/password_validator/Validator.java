package e.alfaleh.k.fahad.password_validator;

import java.util.regex.Pattern;

public class Validator {
//some code was taken from https://stackoverflow.com/questions/36097097/password-validate-8-digits-contains-upper-lowercase-and-a-special-character
    public static int valid(String t){
        Pattern specailCharPatten = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
        Pattern UpperCasePatten = Pattern.compile("[A-Z]");
        Pattern digitCasePatten = Pattern.compile("[0-9 ]");

        int strength=0;

        if(t.length()>=8)
            strength++;

        if(!t.toLowerCase().equals("password"))
            strength++;

        if (specailCharPatten.matcher(t).find())
            strength++;

        if (UpperCasePatten.matcher(t).find())
            strength++;

        if (digitCasePatten.matcher(t).find())
            strength++;

        return strength;
    }
}
