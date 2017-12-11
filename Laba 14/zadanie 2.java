package snippet;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
 
public class zadanie2 {
 
    public static void main(String[] args) {
 
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader bis = new BufferedReader(is);
        String l = "привет";
 
        try {
            System.out.print("Пожалуйста, введите пароль: ");
            String n = bis.readLine();
 
            if (n.equals(l)) {
                System.out.println("Пароль верный");
                System.out.println("Input String is: " + n + "\n" + "Comparing with String " + l);
            } else {
                System.out.println("Пароль не верный");
                System.out.println("Input String is: " + n + "\n" + "Comparing with String: " + l);
            }
        } catch (IOException e) {
            System.err.print(e);
 
        }
    }
}