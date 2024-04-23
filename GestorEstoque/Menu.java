import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Categoria perecivel = new Categoria();
        Categoria bebida = new Categoria();

        Produto produto = new Produto();

        int opcao=0;
        while (opcao != -1){
            System.out.printf("Digite o nome do produto%n");
            Scanner scanf = new Scanner(System.in);
            produto.setNome(scanf.nextLine());

            System.out.printf("Digite a quantidade%n");
            produto.setQuantidade(scanf.nextInt());
            limparTela();
            System.out.printf("Quer adicionar outro produto s=1 n=-1 ?%n");
            perecivel.adicionarProduto(produto.getNome(), produto.getQuantidade());
            opcao = scanf.nextInt();
        }
        perecivel.mostrarProdutos();




    }

    public static void limparTela() {
        // Imprime uma sequência de caracteres especiais para limpar a tela
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}
