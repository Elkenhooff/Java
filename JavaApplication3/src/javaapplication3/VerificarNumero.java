package javaapplication3;
import java.util.Scanner;

public class VerificarNumero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Insira um número: ");
        float numero = input.nextFloat();
        
        if (numero > 0){
            System.out.println("O número é positivo.");
        }
        else if (numero < 0){
            System.out.println("O número é negativo.");
        }
        else{
            System.out.println("O número é 0");
        }
    }
}
