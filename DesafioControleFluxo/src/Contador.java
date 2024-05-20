
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        
        Scanner terminal = new Scanner(System.in);

        System.out.println("Informe o primeiro número:");
        int parametroUm = terminal.nextInt();
        System.out.println("Informe o segundo número:");
        int parametroDois = terminal.nextInt();

        try {
            
            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException e) {
            System.out.println("O primeiro número não pode ser maior que o segundo.");
        } finally {
            terminal.close();
        }
    }
    
    static void contar(int parametroUm, int parametroDois) throws  ParametrosInvalidosException {

        if(parametroDois < parametroUm) {
            throw new ParametrosInvalidosException();
        }

        int result = parametroDois - parametroUm;

        for(int i = 1; i <= result; i++) {
            System.out.println(i);
        }
    }
}