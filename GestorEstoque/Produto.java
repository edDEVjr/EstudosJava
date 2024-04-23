public class Produto {
    private String nome;
    private int quantidade;
    private int quantidadeMin;
    private int quantidadeMax ;

    public Produto() {
        this.nome = nome;
        this.quantidade = 0;
        this.quantidadeMin = 50;
        this.quantidadeMax = 200;

    }
    
    public int getQuantidade() {
        return this.quantidade;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public int getQuantidadeMax() {
        return this.quantidadeMax;
    }
    
    public int getQuantidadeMin() {
        return this.quantidadeMin;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setQuantidade(int qtd) {
        if(qtd > this.quantidadeMax) {
            System.out.println("A quantidade maxima é "+this.getQuantidadeMax());
        }
        if(qtd < this.quantidadeMin) {
            System.out.println("A quantidade minima é "+this.getQuantidadeMin());
        } else{
            this.quantidade = qtd;
            System.out.println("Quantidade adicionada");
        }

    }

    
    public void setQuantidadeMax(int max){
        this.quantidadeMax = max;
    }

    public void setQuantidadeMin(int min){
        this.quantidadeMin = min;
    }

    public void aumentarQtd(int qtd){
        if((qtd+this.quantidade) <= this.quantidadeMax) {
            this.quantidade += qtd;
        }else {
            System.out.println("Não pode adcionar essa quantidade,pois supera o limite de "+this.quantidadeMax);
        }

    }

    public void diminuirQtd(int qtd){
        if((this.quantidade-qtd) >= this.quantidadeMin) {
            this.quantidade -= qtd;
        }else {
            System.out.println("Não pode retirar essa quantidade,pois deixará abaixo do minimo de "+this.quantidadeMax);
        }

    }
   
}