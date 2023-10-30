package anobissexto;
import java.util.Scanner;

public class AnoBissexto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Insira um ano: ");
        int ano = input.nextInt();
        
        if (ano % 4 == 0){
            if (ano % 100 != 0 || ano % 400 == 0){
                System.out.println(ano + " é um ano bissexto");
            }
            else{
                System.out.println(ano + " não é um ano bissexto.");
            }
        }
        else{
                System.out.println(ano + " não é um ano bissexto.");
            }
    }
}
