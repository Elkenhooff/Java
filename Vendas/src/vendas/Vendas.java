package vendas;
import java.util.Scanner;

public class Vendas {
    public static void clearConsole(){
           for (int i = 0; i < 60; i++){
               System.out.println("");
           } 
        }
    public static void main(String[] args) {
        double valor[] = new double[10];
        double valorTotal[] = new double[10];
        int quantidade[] = new int[10];
        String[] produtos = {"Salgado","Refrigerante","Suco","Água","Whey","Creatina","Laranja","Banana","Melão","Ovos"};
        double vendaTotal = 0;
        int i = -1;
        
        Scanner input = new Scanner(System.in);
        
        while (i == -1)
        {
            System.out.println("┌────────────────────────┐\r\n│           Lojinha do Pedrão           │\r\n│                                       │\r\n│ 1 - Salgado                           │\r\n│ 2 - Refrigerante                      │\r\n│ 3 - Suco                              │\r\n│ 4 - Água                              │\r\n│ 5 - Whey                              │\r\n│ 6 - Creatina                          │\r\n│ 7 - Laranja                           │\r\n│ 8 - Banana                            │\r\n│ 9 - Melão                             │\r\n│ 10 - Ovos                             │\r\n│ 11 - Finalizar                        │\r\n└────────────────────────┘");
        
            int escolha = input.nextInt(); 
            clearConsole();
            
            switch (escolha) 
            {
                case 1:
                    System.out.println("Produto escolhido: " + produtos[0]);
                    System.out.print("Insira a quantidade que você deseja levar: ");
                    quantidade[0] += input.nextInt();
                    if (valor[0] == 0)
                    {
                    System.out.print("Insira o valor unitário: ");
                    valor[0] = input.nextDouble();
                    }
                    valorTotal[0] = valor[0] * quantidade[0];
                    break;

                case 2:
                    System.out.println("Produto escolhido: " + produtos[1]);
                    System.out.print("Insira a quantidade que você deseja levar: ");
                    quantidade[1] += input.nextInt();
                    if (valor[1] == 0)
                    {
                    System.out.print("Insira o valor unitário: ");
                    valor[1] = input.nextDouble();
                    }
                    valorTotal[1] = valor[1] * quantidade[1];
                    break;

                case 3:
                    System.out.println("Produto escolhido: " + produtos[2]);
                    System.out.print("Insira a quantidade que você deseja levar: ");
                    quantidade[2] += input.nextInt();
                    if (valor[2] == 0)
                    {
                    System.out.print("Insira o valor unitário: ");
                    valor[2] = input.nextDouble();
                    }
                    valorTotal[2] = valor[2] * quantidade[2];
                    break;

                case 4:
                    System.out.println("Produto escolhido: " + produtos[3]);
                    System.out.print("Insira a quantidade que você deseja levar: ");
                    quantidade[3] += input.nextInt();
                    if (valor[3] == 0)
                    {
                    System.out.print("Insira o valor unitário: ");
                    valor[3] = input.nextDouble();
                    }
                    valorTotal[3] = valor[3] * quantidade[3];
                    break;

                case 5:
                    System.out.println("Produto escolhido: " + produtos[4]);
                    System.out.print("Insira a quantidade que você deseja levar: ");
                    quantidade[4] += input.nextInt();
                    if (valor[4] == 0)
                    {
                    System.out.print("Insira o valor unitário: ");
                    valor[4] = input.nextDouble();
                    }
                    valorTotal[4] = valor[4] * quantidade[4];
                    break;

                case 6:
                    System.out.println("Produto escolhido: " + produtos[5]);
                    System.out.print("Insira a quantidade que você deseja levar: ");
                    quantidade[5] += input.nextInt();
                    if (valor[5] == 0)
                    {
                    System.out.print("Insira o valor unitário: ");
                    valor[5] = input.nextDouble();
                    }
                    valorTotal[5] = valor[5] * quantidade[5];
                    break;

                case 7:
                    System.out.println("Produto escolhido: " + produtos[6]);
                    System.out.print("Insira a quantidade que você deseja levar: ");
                    quantidade[6] += input.nextInt();
                    if (valor[6] == 0)
                    {
                    System.out.print("Insira o valor unitário: ");
                    valor[6] = input.nextDouble();
                    }
                    valorTotal[6] = valor[6] * quantidade[6];
                    break;

                case 8:
                    System.out.println("Produto escolhido: " + produtos[7]);
                    System.out.print("Insira a quantidade que você deseja levar: ");
                    quantidade[7] += input.nextInt();
                    if (valor[7] == 0)
                    {
                    System.out.print("Insira o valor unitário: ");
                    valor[7] = input.nextDouble();
                    }
                    valorTotal[7] = valor[7] * quantidade[7];
                    break;

                case 9:
                    System.out.println("Produto escolhido: " + produtos[8]);
                    System.out.print("Insira a quantidade que você deseja levar: ");
                    quantidade[8] += input.nextInt();
                    if (valor[8] == 0)
                    {
                    System.out.print("Insira o valor unitário: ");
                    valor[8] = input.nextDouble();
                    }
                    valorTotal[8] = valor[8] * quantidade[8];
                    break;

                case 10:
                    System.out.println("Produto escolhido: " + produtos[9]);
                    System.out.print("Insira a quantidade que você deseja levar: ");
                    quantidade[9] += input.nextInt();
                    if (valor[9] == 0)
                    {
                    System.out.print("Insira o valor unitário: ");
                    valor[9] = input.nextDouble();
                    }
                    valorTotal[9] = valor[9] * quantidade[9];
                    break;
                    
                case 11:
                    i = 1;
                    System.out.println("┌────────────────────────┐");
                    System.out.println("│            Lojinha do Pedrão          │");
                    System.out.println("│CNPJ 20.204.333/0001-32                │");
                    System.out.println("│R. Espirito Santo, 866 - Ipiranga      │");
                    System.out.println("│14014-103 - Ribeirão Preto SP          │");
                    System.out.println("│+55 (16) 93212-3829                    │");
                    System.out.println("└────────────────────────┘");
                    for (int j = 0; j < 10; j++)
                    {
                        
                        if (valorTotal[j] != 0){

                            System.out.println("┌────────────────────────┐");
                            System.out.println("│Produto: " + produtos[j] + "                       │");
                            System.out.println("│Valor Unitário: R$" + valor[j] + "                  │");
                            System.out.println("│Quantidade: " + quantidade[j] + "      │");
                            System.out.println("│Preço total: R$" + valorTotal[j] + "   │");
                            System.out.println("└────────────────────────┘");
                            vendaTotal += valorTotal[j];
                        }
                    }
                    break;

                default:
                        System.out.println("Insira um número válido");
                        input.next();
                        break;
            }
        }
        System.out.println("O preço total da venda é de: R$" + vendaTotal);
    }
}
