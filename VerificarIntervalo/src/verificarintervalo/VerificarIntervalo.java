package verificarintervalo;
import java.util.Scanner;

public class VerificarIntervalo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Insira um número: ");
        int numero = input.nextInt();
        
        if (numero > 10 && numero < 50){
            System.out.println("O número está no intervalo de 10 a 50.");
        }
        else if (numero < 0){
            System.out.println("Número negativo");
        }
        else{
            System.out.println("O número não está no intervalo de 10 a 50.");
        }
    }
}
