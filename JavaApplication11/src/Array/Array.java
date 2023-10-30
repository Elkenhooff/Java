package Array;
import java.util.Random;

public class Array {
    public static void main(String[] args) 
    {
        Random numeroaleatorio = new Random();
        int numeros[] = new int[100];
        
        for (int i = 0; i < numeros.length; i++)
        {
            numeros[i] = numeroaleatorio.nextInt(1001);
        }
        
        System.out.println("Os " + numeros.length + " números presente no array");
        for (int i : numeros)
        {
            System.out.println(i);
        }
    }
}