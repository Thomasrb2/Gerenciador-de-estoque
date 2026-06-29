import java.util.ArrayList;
import java.util.Scanner;

public class MainLista {
    public static void main(String[] args) {

        Scanner adicionar = new Scanner(System.in);
        ArrayList<Itens> listaItens = new ArrayList<>();
        boolean rodando = true;

        while (rodando) {
            System.out.println("""
                    Como posso te ajudar hoje?
                    
                    ---------------------------
                    1 - Consultar lista
                    2 - Adicionar item à lista
                    3 - Fechar app
                    ---------------------------""");

            int opcao = adicionar.nextInt();
            adicionar.nextLine();

            switch (opcao) {
                case 1:
                    if (listaItens.isEmpty()) {
                        System.out.println("Não tem nada na lista! \n\n");
                    } else {
                        for (Itens item : listaItens) {
                            System.out.println("- " + item.getNome() + " | quantidade em estoque: " + item.getQuantidade());
                        }
                    }
                    break;

                case 2:
                    System.out.print("Qual item você quer adicionar?");
                    String nomeItem = adicionar.nextLine();
                    System.out.print("Qual a quantidade do item?");
                    int quantidade = adicionar.nextInt();
                    adicionar.nextLine();
                    listaItens.add(new Itens(nomeItem, quantidade));
                    System.out.println("Novos itens adicionado á lista! \n\n");
                    break;

                case 3:
                    System.out.println("Fechando o app...");
                    rodando = false;
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }

        adicionar.close();
    }
}