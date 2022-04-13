import java.util.Scanner;

public class Aula08_ex04 {
    public static void main(String[] args) {
        Scanner console1 = new Scanner(System.in);
        System.out.print("Digite o saldo inicial: ");
        double saldo = console1.nextFloat();
        NovaConta c1 = new NovaConta();
        c1.setsaldo(saldo);
        c1.exibedados();
        Scanner console2 = new Scanner(System.in);
        System.out.print("Digite o saldo inicial: ");
        saldo = console2.nextFloat();        
        NovaConta c2 = new NovaConta(saldo);
        c2.exibedados();
        c1.credito(500);
        c1.exibedados(); 
        c1.debito(200);
        c1.exibedados();  
        c2.credito(1000);
        c2.exibedados(); 
        c2.debito(500);
        c2.exibedados();                   
    }        
}
