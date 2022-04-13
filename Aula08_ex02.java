import java.util.Scanner;

public class Aula08_ex02 {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();// criando um objeto
        Scanner console = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");
        String nome = console.nextLine();
        p.setnome(nome);
        System.out.print("Digite a sua data de  aniversário: ");
        String datanascimento = console.nextLine();
        p.setdatanascimento(datanascimento);
        System.out.print("Digite a sua altura: ");
        float altura = console.nextFloat();
        p.setaltura(altura);
        p.exibedados();
    }
}

