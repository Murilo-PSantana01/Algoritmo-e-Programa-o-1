import java.util.Scanner;

public class Exerc12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); 

        System.out.print("Digite um número: ");
        double num = entrada.nextDouble(); 

        double Quadrado = Math.pow(num, 2);
        double Cubo = Math.pow(num, 3);
        double raizQuadrada = Math.sqrt(num);
        double potencia10 = Math.pow(num, 10);

        System.out.println("Elevado ao quadrado: " + Quadrado);
        System.out.println("Elevado ao cubo: " + Cubo);
        System.out.println("Raiz quadrada: " + raizQuadrada);
        System.out.println("Elevado à potência 10: " + potencia10);

        entrada.close();
    }
}