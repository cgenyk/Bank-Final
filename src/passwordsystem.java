import java.util.Arrays;

public class passwordsystem {
    public static boolean login(char[] entry) {
        boolean found = true;
        char[]login = { 'p', 'a', 's', 's','w','o','r','d'};

        if (entry.length != login.length) {
            found = false;
        } else {
            found = Arrays.equals (entry, login);

        }

        return found;
    }
}

// Important Note: Code for this class was based off of https://docs.oracle.com/javase/tutorial/uiswing/components/passwordfield.html