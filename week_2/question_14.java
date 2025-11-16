package week_2;

public class question_14 {
    public static String checkChar(String character){

        String result = "";
        if (character.matches("[a-zA-Z]")) {
            if (character.matches("[aAeEiIoOuU]")) {
                result = "vowel";
            }
            else{
                result = "consonant";
            }
        }
        else if (character.matches("[0-9]")) {
            result = "digit";
        }
        else{
            result = "special symbol";
        }
        return result;
    }
}
