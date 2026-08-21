import java.util.Scanner;

public class LivrosFavoritos{
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println(" Digite os seusa 5 livros favoritos:");
        System.out.println();

        System.out.println("Digite seu primeiro livro favorito: ");
        String livro1 = entrada.nextLine();

        System.out.println("Digite seu livro segundo favorito: ");
        String livro2 = entrada.nextLine();

        System.out.println("Digite seu livro terceiro favorito: ");
        String livro3 = entrada.nextLine();

        System.out.println("Digite seu livro quarto favorito: ");
        String livro4 = entrada.nextLine();

        System.out.println("Digite seu livro quinto favorito: ");
        String livro5 = entrada.nextLine();

        System.out.println("\nSeus livros favoritos são");
        System.out.println("1." + livro1);
        System.out.println("2." + livro2);
        System.out.println("3." + livro3);
        System.out.println("4." + livro4);
        System.out.println("5." + livro5);

        entrada.close();
    }
}