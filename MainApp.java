import java.util.List;
import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Agenda agenda = new Agenda();

        System.out.print("Digite a quantidade de contatos que deseja adicionar: ");
        int quantidadeContatos = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do teclado

        for (int i = 0; i < quantidadeContatos; i++) {
            System.out.print("Digite o nome do contato " + (i + 1) + ": ");
            String nome = scanner.nextLine();
            System.out.print("Digite o telefone do contato " + (i + 1) + ": ");
            String telefone = scanner.nextLine();
            Contato novoContato = new Contato(nome, telefone);
            agenda.adicionarContato(novoContato);
        }

        List<Contato> contatos = agenda.listarContatos();
        if (!contatos.isEmpty()) {
            System.out.println("\nLista de Contatos:");
            for (Contato c : contatos) {
                System.out.println(c);
            }
        } else {
            System.out.println("A agenda está vazia.");
        }

        scanner.close();
    }
}