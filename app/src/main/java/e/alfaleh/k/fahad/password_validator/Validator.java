package e.alfaleh.k.fahad.password_validator;

public class Validator {

    public int valid(String t){
        int strength=0;
        if(t.length()>=8)
            strength++;
        if(!t.equals("password"))
            strength++;
        return strength;
    }
}
