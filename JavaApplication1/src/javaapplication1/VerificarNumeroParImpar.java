package javaapplication1;
import java.util.Scanner;


public class VerificarNumeroParImpar {
    public static void main(String[] args) {
        int i = 1;
	Scanner input = new Scanner(System.in);
        while (i == 1)
        {
            System.out.print("Insira um número: ");
            int num = input.nextInt();
            if (num % 2 == 0)
            {
                System.out.println("O número inserido é par");
                System.out.println("Deseja verificar outro número?");
                System.out.println("1 - Sim\n2 - Não");
                int j = 1;
                while (j == 1)
                {
                    System.out.print("Insira sua resposta: ");
                    int resposta = input.nextInt();
                    switch (resposta)
                    {
                        case 1:
                            j = -1;
                            break;
                        case 2:
                            System.out.println("Obrigado por utilizar o programa");
                            i = -1;
                            j = -1;
                            break;
                        default:
                            System.out.println("Por favor insira um número válido");
                            break;
                    }
                }
            }
            else
            {
                System.out.println("O número inserido é impar");
                System.out.println("Deseja verificar outro número?");
                System.out.println("1 - Sim\n2 - Não");
                int j = 1;
                while (j == 1)
                {
                    System.out.print("Insira sua resposta: ");
                    int resposta = input.nextInt();
                    switch (resposta)
                    {
                        case 1:
                            j = -1;
                            break;
                        case 2:
                            System.out.println("Obrigado por utilizar o programa");
                            i = -1;
                            j = -1;
                            break;
                        default:
                            System.out.println("Por favor insira um número válido");
                            break;
                    }
                }
            }
        }
    }
}
