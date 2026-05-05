import java.util.Scanner;
import java.util.ArrayList;

public class ArrayList {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();

        int i;
        int escolha = 0;
        int names = -1;

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
                names++;
            }


            if(escolha == 2) {

                for (i = 0; i <= names; i++) {
                    System.out.println("- " + nomes.get(i));
                }
                System.out.println("\nQual nome deseja remover? \n\n");
                String nome = scan.nextLine();

                if (nomes.remove(nome)) {
                    System.out.println(ANSI_RED + "\nNome removido com sucesso!\n" + ANSI_RESET);
                } else {
                    System.out.println(ANSI_RED + "\nNome não encontrado!\n" + ANSI_RESET);
                }
            }
            if(escolha == 3) {
                System.out.println("\n===NOMES REGISTRADOS===\n");
                for (i = 0; i <= names; i++) {
                    System.out.println("- " + nomes.get(i));
                }
                System.out.print("\n");
            }
            if(escolha == 4) {
                System.out.println("Tchau");
            }
        }

    }
}
