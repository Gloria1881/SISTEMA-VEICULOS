import java.util.Scanner;
import java.util.List;

public class MarcaMenu {
    //atributos
    private Scanner teclado = new Scanner(System.in);
    private MarcaBanco bancoMarcas = new MarcaBanco();

    //metodo construtor
    public MarcaMenu() {
        this.exibir();
    }

    //propriedades
    private void exibir() {
        int opcao = 0;

        do {
            System.out.println("Marcas");
            System.out.println("11. Adicionar");
            System.out.println("12. Alterar");
            System.out.println("13. Excluir");
            System.out.println("14. Pesquisar");
            System.out.println("15. Imprimir todos");
            System.out.println("16. Obter número de itens cadastrados");
            System.out.println("19. Sair");
            System.out.println("Digite a opcao: ");
            opcao = teclado.nextInt();

           if (opcao == 11) {
            Marca marca = new Marca();
            
            System.out.print("Digite o código: ");
            marca.setCodigo(teclado.nextInt());
            teclado.nextLine(); 

            System.out.print("Digite o nome: ");
             marca.setNome(teclado.nextLine());

            System.out.print("Digite a sigla: ");
            marca.setSigla(teclado.nextLine()); 
            
            bancoMarcas.adicionar(marca);

        } else if (opcao == 12) {
                Marca marcaAlterar = new Marca();

            System.out.println("Digite o nome da marca para alterar:");
            int codigo = teclado.nextInt();
            teclado.nextLine();
            marcaAlterar.setCodigo(codigo);

            System.out.println("Digite o novo nome da marca:");
            marcaAlterar.setNome(teclado.nextLine());

            System.out.println("Digite a nova sigla da marca:");
            marcaAlterar.setSigla(teclado.nextLine());

            bancoMarcas.alterar(marcaAlterar);

        } else if (opcao == 13) {
            System.out.print("Digite o código da marca para excluir: ");
            int codigo = teclado.nextInt();
            teclado.nextLine(); 
            bancoMarcas.excluir(codigo);
            
        } else if (opcao == 14) {
            System.out.print("Digite o código da marca para pesquisar: ");
            int codigo = teclado.nextInt();
            teclado.nextLine(); 
            
            Marca marcaEncontrada = bancoMarcas.pesquisar(codigo);
            if (marcaEncontrada != null) {
                System.out.println("Marca Encontrada: ");
                System.out.println("Código: " + marcaEncontrada.getCodigo());
                System.out.println("Nome: " + marcaEncontrada.getNome());
                System.out.println("Sigla: " + marcaEncontrada.getSigla());
            } else {
                System.out.println("Marca não encontrada!");
            
            }  
        } else if (opcao == 15) {
    // Lógica para Imprimir Todos
    List<Marca> todasMarcas = bancoMarcas.imprimirTodos();
    
    if (todasMarcas.isEmpty()) {
        System.out.println("Não há marcas cadastradas.");
    } else {
        System.out.println("--- Lista de Marcas Cadastradas ---");
        for (Marca marca : todasMarcas) {
            System.out.println("Código: " + marca.getCodigo() + 
                               ", Nome: " + marca.getNome() + 
                               ", Sigla: " + marca.getSigla());
        }
        System.out.println("------------------------------------");
    }

} else if (opcao == 16) {
    // Lógica para Obter Número de Itens Cadastrados
    int total = bancoMarcas.getNumeroMarca();
    System.out.println("Total de marcas cadastradas: " + total);
}

} while (opcao != 19);
        }
    }