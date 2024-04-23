
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File; 


public class BlocoDeNotas {

    private ArrayList<String> bloco;

    public BlocoDeNotas() {
        this.bloco = new ArrayList<String>();

    }
    
    public void addNota(String novaNota) {
        boolean existe = false;
        for (String nota : bloco) {
            if (nota.equals(novaNota)) {
                System.out.println("Essa nota já existe");
                existe = true;
                break;
            }

        }
        if (!(existe)) {
            this.bloco.add(novaNota);
            
        }
        editarArquivo();

    }
    
    public void mostrarNotas() {
        int i = 1;
        for (String nota : bloco) {
            System.out.println(i + ":" + nota);
            i++;
        }
    }
    
    public void excluirNota(String nota) {
        boolean existe = false;
        for (String note : bloco) {
            if (note.equals(nota)) {
                System.out.println("Nota excluida");
                this.bloco.remove(nota);
                existe = true;

                break;
            }

        }
        editarArquivo();
        if (!(existe)) {
            System.out.println("Nota não existe");

        }
    }

    public void criarArquivo() {
        try {
            File myObj = new File("bloco.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
    
    public void editarArquivo() {
        try {
            int i=1;
            FileWriter myWriter = new FileWriter("bloco.txt");
            for( String nota : bloco){
                myWriter.write(i+ ":" + nota + "\n");
                i++;
            }  
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }


    
}
