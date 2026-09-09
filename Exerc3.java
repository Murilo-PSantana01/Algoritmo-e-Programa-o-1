import java.util.Scanner;

public class Exerc3 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("insira o numero");
        int numero1=entrada.nextInt();

        System.out.println("insira o seugundo numero");
        int numero2=entrada.nextInt();

        int produto = numero1 * numero2;

        System.out.println("O produto é: " + produto );


        entrada.close();

    }
}
