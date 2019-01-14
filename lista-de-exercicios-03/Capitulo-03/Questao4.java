public class Questao4 {

    public static void main(String[] args) {
        
        int n,
            fatorial=1;
        
        for(n=1 ; n<=10 ; n++){
            fatorial = fatorial * n;
            System.out.println("O fatorial de "+ n + " eh (" +(n-1)+"!) * "+n+" = "+fatorial);            
        }
        
    }

}