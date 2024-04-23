package Calculo;

public class Bhaskara {
    
    public void quadratica(float a,float b,float c) {
        float discriminante = (b * b) - (4 * a * c);
        if (discriminante == 0) {
            float raiz = (-b) / (2 * a);
            System.out.println("Raiz Unica:"+raiz);

        } else if (discriminante > 0) {
            float raiz1 = (float) ((-b + (Math.sqrt(discriminante))) / 2);
            float raiz2 = (float) ((-b - (Math.sqrt(discriminante))) / 2);
            System.out.println("Raiz1:" + raiz1);
            System.out.println("Raiz2:" + raiz2);



        } else {
            
            System.out.println("As raizes são complexas");

        }
        

    }

    
    
}