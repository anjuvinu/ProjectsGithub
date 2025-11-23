import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidation {
//validate length Rule 1: Length (e.g., 8 to 20 characters)
//validate alphanumeric (one special characters,uppercase  using regex)
    public static boolean  isValidPassword(String pwd){
        //can be expanded later
        final Set<String> COMMON_WORDS = new HashSet<>(Arrays.asList("admin","user","qwerty","password","123"));

        if(pwd.length()< 8 || pwd.length()>20){
             System.out.println("length mismatch");
            return false;
        }
        Pattern pattern = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{8,20}$");
        Matcher matcher = pattern.matcher(pwd);
        if(matcher.matches()!=true){
             System.out.println("pattern mismatch");
            return false;
           
        }
        for(String words:COMMON_WORDS){
            if(pwd.toLowerCase().contains(words)){
                System.out.println("contains common words");
                return false;
            }
        }
        System.out.println("valid password");
        return true;

    }
  


public static void main(String[] args) {
    
        System.out.println("Test 1 (Valid): " + isValidPassword("MyStrongP@ssw0rd")); // Should be true
        System.out.println("Test 2 (Too short): " + isValidPassword("Short1@")); // Should be false
        System.out.println("Test 3 (No uppercase): " + isValidPassword("mystrongp@ssw0rd")); // Should be false
        System.out.println("Test 4 (No digit): " + isValidPassword("MyStrongP@ssword")); // Should be false
        System.out.println("Test 5 (No special char): " + isValidPassword("MyStrongPassword0")); // Should be false
        System.out.println("Test 6 (Common word): " + isValidPassword("MyPassword1@")); // Should be false
   // PasswordValidation.isValidPassword(passWord);

}
}
