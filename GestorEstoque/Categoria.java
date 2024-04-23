import java.util.ArrayList;

 
public class Categoria {
    private ArrayList<String> nomeProduto = new ArrayList<String>();
    private ArrayList<Integer> qtdProduto = new ArrayList<Integer>();


    public Categoria() {
        this.nomeProduto= nomeProduto;
        this.qtdProduto = qtdProduto;


    }
    
    public void adicionarProduto(String nome, int qtd) {
        boolean foiAdd = true;
        for (int i=0; i<this.nomeProduto.size(); i++) {
            if ((this.nomeProduto.get(i)).equals(nome)) {
                foiAdd = false;
                break;
            }
        }
        if(foiAdd){
            this.nomeProduto.add(nome);
            this.qtdProduto.add(qtd);
        }else{
            System.out.println("O produto já existe");
        }

    }
    
    public void excluirProduto(String nome) {
        boolean foiExc = false;
        for(int i=0; i<this.nomeProduto.size(); i++) {
            if (this.nomeProduto.get(i).equals(nome)) {
                this.nomeProduto.remove(i);
                this.qtdProduto.remove(i);
                System.out.println("O produto foi excluido");
                foiExc = true;
                break;
            }
        }
        if(!(foiExc)){
            System.out.println("O produto não existe");
        }

    }

    public void mostrarProdutos() {
        System.out.printf("----------Produtos---------%n");
        for (int i=0;i<getTamanhoLista();i++){
            System.out.printf("Produto:%s%n",this.nomeProduto.get(i));
            System.out.printf("Quantidade:%d%n",this.qtdProduto.get(i));
            System.out.printf("-----------------%n");
        }
    }



    private int getTamanhoLista(){
        return this.nomeProduto.size();
    }
}
