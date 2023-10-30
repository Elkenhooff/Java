package verificarvogal;
import java.util.Scanner;

public class VerificarVogal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Insira sua letra: ");
        char vogal = input.next().toLowerCase().charAt(0);
        
        if ("aeiou".contains(String.valueOf(vogal))){
            System.out.println("É uma vogal");
        }
        else
        {
            System.out.println("É uma consoante");
        }
    }
}
