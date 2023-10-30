package verificaridadevotar;
import java.util.Scanner;

public class VerificarIdadeVotar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Insira sua idade:");
        int idade = input.nextInt();
        
        if (idade > -1 && idade < 16){
            System.out.println("Você não tem idade para votar.");
        }
        else if (idade > 16){
            System.out.println("Você já tem idade para votar.");
        }
        else{
            System.out.println("Por favor insira um valor válido.");
        }
    }
    
}
