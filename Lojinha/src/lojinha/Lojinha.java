package lojinha;
import java.util.Scanner;

public class Lojinha {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Escreva seu nome social: ");
        String nome = input.nextLine();
        System.out.print("Escreva o valor da sua compra em reais: ");
        double compra = input.nextDouble();
        int i = 1;
        while (i == 1){
            System.out.println("Escreva o seu gênero");
            System.out.println("1 - Masculino\n2 - Feminino\n3 - Outro");
            int resposta = input.nextInt();
            switch (resposta){
                case 1:
                    System.out.println("Ao efetuar suas compra você receberá 5% de desconto");
                    compra -= compra * 0.05;
                    System.out.println("O novo valor da suas compras é de: " + compra + "reais");
                    i = -1;
                    break;
                case 2:
                    System.out.println("Ao efetuar suas compra você receberá 15% de desconto");
                    compra -= compra * 0.15;
                    System.out.println("O novo valor da suas compras é de: " + compra + "reais");
                    i = -1;
                    break;
                case 3:
                    System.out.println("Ao efetuar suas compra você receberá 5% de desconto");
                    compra -= compra * 0.05;
                    System.out.println("O novo valor da suas compras é de: " + compra + "reais");
                    i = -1;
                    break;
                default:
                    System.out.println("Insira um valor válido (1 | 2 | 3)");
                    break;
            }
        }
    }   
}
