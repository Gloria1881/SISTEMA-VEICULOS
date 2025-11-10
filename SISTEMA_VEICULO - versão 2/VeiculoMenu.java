import java.util.Scanner;
import java.util.List;

public class VeiculoMenu {
    //atributos
    private Scanner teclado;
    private VeiculoBanco bancoVeiculo = new VeiculoBanco();

    //metodo construtor recebe Scanner compartilhado
    public VeiculoMenu(Scanner teclado) {
        this.teclado = teclado;
        this.exibir();
    }

    //propriedades
    private void exibir() {
        int opcao = 0;

        do {
            System.out.println("==============================");
            System.out.println("            Veículos         ");
            System.out.println("==============================");
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
            Veiculo veiculo = new Veiculo();
            
            System.out.print("Digite o código: ");
            veiculo.setCodigo(teclado.nextInt());
            teclado.nextLine(); 

            System.out.print("Digite o nome: ");
            veiculo.setNome(teclado.nextLine());

            System.out.print("Digite a sigla: ");
            veiculo.setSigla(teclado.nextLine()); 
            
            bancoVeiculo.adicionar(veiculo);

        } else if (opcao == 12) {
                Veiculo veiculoAlterar = new Veiculo();

            System.out.println("Digite o nome do veículo para alterar:");
            int codigo = teclado.nextInt();
            teclado.nextLine();
            veiculoAlterar.setCodigo(codigo);

            System.out.println("Digite o novo nome do veículo:");
            veiculoAlterar.setNome(teclado.nextLine());

            System.out.println("Digite a nova sigla da marca:");
            veiculoAlterar.setSigla(teclado.nextLine());

            bancoVeiculo.alterar(veiculoAlterar);

        } else if (opcao == 13) {
            System.out.print("Digite o código da marca para excluir: ");
            int codigo = teclado.nextInt();
            teclado.nextLine(); 
            bancoVeiculo.excluir(codigo);
            
        } else if (opcao == 14) {
            System.out.print("Digite o código da marca para pesquisar: ");
            int codigo = teclado.nextInt();
            teclado.nextLine(); 
            
            Veiculo veiculoEncontrada = bancoVeiculo.pesquisar(codigo);
            if (veiculoEncontrada != null) {
                System.out.println("Veículo Encontrado: ");
                System.out.println("Código: " + veiculoEncontrada.getCodigo());
                System.out.println("Nome: " + veiculoEncontrada.getNome());
                System.out.println("Sigla: " + veiculoEncontrada.getSigla());
            } else {
                System.out.println("Vepiculo não encontrado!");
            
            }  
        } else if (opcao == 15) {
    // Lógica para Imprimir Todos
    List<Veiculo> todosVeiculos = bancoVeiculo.imprimirTodos();
    
    if (todosVeiculos.isEmpty()) {
        System.out.println("Não há veículos cadastrados.");
    } else {
        System.out.println("--- Lista de Veículos Cadastrados ---");
        for (Veiculo veiculo : todosVeiculos) {
            System.out.println("Código: " + veiculo.getCodigo() + 
                               ", Nome: " + veiculo.getNome() + 
                               ", Sigla: " + veiculo.getSigla());
        }
        System.out.println("------------------------------------");
    }

} else if (opcao == 16) {
    // Lógica para Obter Número de Itens Cadastrados
    int total = bancoVeiculo.getNumeroVeiculo();
    System.out.println("Total de veículos cadastrados: " + total);
}

} while (opcao != 19);
        }
    }