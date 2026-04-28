import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();

        int escolha = 0;

        while(escolha != 4) {

            System.out.println("1 - Adicionar um nome");
            System.out.println("2 - Remover um nome");
            System.out.println("3 - Mostrar Lista");
            System.out.println("4 - Sair\n");
            System.out.print("O que você deseja fazer? ");

            escolha = Integer.parseInt(scan.nextLine());;

            if(escolha == 1) {
                System.out.print("\nDigite um nome para adicionar: ");

                nomes.add(scan.nextLine());

                System.out.println(ANSI_GREEN + "\nNome adicionado com sucesso\n" + ANSI_RESET);
            }


            if(escolha == 2) {
                System.out.println("\nQual nome deseja remover? \n");

                System.out.println(nomes + "\n");

                String nome = scan.nextLine();

                if (nomes.remove(nome)) {
                    System.out.println(ANSI_RED + "\nNome removido com sucesso!\n" + ANSI_RESET);
                } else {
                    System.out.println(ANSI_RED + "\nNome não encontrado!\n" + ANSI_RESET);
                }
            }

            if(escolha == 3) {
                System.out.println("\nNomes Registrados:\n");
                System.out.println(nomes + "\n\n");
            }

            if(escolha == 4) {
                System.out.println("Tchau");
            }
        }

    }
}