import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
    
        

            System.out.println ("------------------------");
            System.out.println ("        CONTADOR        ");
            System.out.println ("------------------------");
            System.out.println (" ");

            System.out.println ("Digite o primeiro parâmetro:");
            int parametroUm = leitor.nextInt();

            System.out.println ("Digite o segundo parâmetro:");
            int parametroDois = leitor.nextInt();


            
            
        try{

            contar (parametroUm, parametroDois);

        } catch (ParametrosInvalidosException Exception) {
            System.out.println ("O primeiro parâmetro deve ser menor do que o segundo");
        }
        

    }
    

    public static void contar (int parametroUm, int parametroDois) throws ParametrosInvalidosException{

        if (parametroUm > parametroDois) {

            throw new ParametrosInvalidosException();
        }

        int contagem = (parametroDois - parametroUm);


        for (int i=1 ; parametroUm < parametroDois; i++) {
            System.out.println ("Imprimindo o numero: " + ++parametroUm);
            
        }
        

        System.out.println ("Foram contados "+ contagem + " números.");

       
    }


}
