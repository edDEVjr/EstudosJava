
import java.util.Scanner;

public class MenuBDN {
    public static void main(String[] args) {
        BlocoDeNotas BDN = new BlocoDeNotas();
        int opcao =0;
        while (opcao != 4) {
            Scanner scanf = new Scanner(System.in);
            System.out.println("------------Digite uma opcao-------------");
            System.out.println("1:Criar Bloco de Notas");
            System.out.println("2:Adicionar Nota");
            System.out.println("3:Excluir Nota");
            System.out.println("4:Salvar e Sair");

            opcao = scanf.nextInt();

            switch (opcao) {
                case 1:
                    clearScreen();
                    BDN.criarArquivo();
                    System.out.println("Seu bloco foi criado");
                    break;

                case 2:
                    clearScreen();
                    System.out.println("Digite a nota");
                    scanf.nextLine();
                    String nota = scanf.nextLine();
                    BDN.addNota(nota);
                    break;

                case 3:
                    clearScreen();
                    System.out.println(" Digite a posicao da nota que sera excluida");
                    scanf.nextLine();
                    nota = scanf.nextLine();
                    BDN.excluirNota(nota);
                    break;

                default:
                    System.out.println("Opção inválida. Por favor, digite novamente.");
                    break;
            }
            BDN.mostrarNotas();

        }
        
        clearScreen();
        System.out.println("------------Suas Notas-----------");
        BDN.mostrarNotas();

        
        
    }


    public static void clearScreen() {
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }
}
