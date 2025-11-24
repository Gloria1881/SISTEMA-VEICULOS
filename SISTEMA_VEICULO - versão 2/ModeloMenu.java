import java.util.Scanner;
import java.util.List;

public class ModeloMenu {
    //atributos
    private Scanner teclado;
    private ModeloBanco bancoModelo = new ModeloBanco();

    //metodo construtor recebe Scanner compartilhado
    public ModeloMenu(Scanner teclado) {
        this.teclado = teclado;
        this.exibir();
    }

    //propriedades
    private void exibir() {
        int opcao = 0;

        do {
            System.out.println("==============================");
            System.out.println("             Modelos           ");
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
            Modelo modelo = new Modelo();
            
            System.out.print("Digite o código: ");
            modelo.setCodigo(teclado.nextInt());
            teclado.nextLine(); 

            System.out.print("Digite o nome: ");
            modelo.setNome(teclado.nextLine());

            System.out.print("Digite a sigla: ");
            modelo.setSigla(teclado.nextLine()); 
            
            bancoModelo.adicionar(modelo);

        } else if (opcao == 12) {
                Modelo modeloAlterar = new Modelo();

            System.out.println("Digite o nome do modelo para alterar:");
            int codigo = teclado.nextInt();
            teclado.nextLine();
            modeloAlterar.setCodigo(codigo);

            System.out.println("Digite o novo nome do modelo:");
            modeloAlterar.setNome(teclado.nextLine());

            System.out.println("Digite a nova sigla da modelo:");
            modeloAlterar.setSigla(teclado.nextLine());

            bancoModelo.alterar(modeloAlterar);

        } else if (opcao == 13) {
            System.out.print("Digite o código do modelo para excluir: ");
            int codigo = teclado.nextInt();
            teclado.nextLine(); 
            bancoModelo.excluir(codigo);
            
        } else if (opcao == 14) {
            System.out.print("Digite o código do modelo para pesquisar: ");
            int codigo = teclado.nextInt();
            teclado.nextLine(); 
            
            Modelo modeloEncontrado = bancoModelo.pesquisar(codigo);
            if (modeloEncontrado != null) {
                System.out.println("Modelo Encontrado: ");
                System.out.println("Código: " + modeloEncontrado.getCodigo());
                System.out.println("Nome: " + modeloEncontrado.getNome());
                System.out.println("Sigla: " + modeloEncontrado.getSigla());
            } else {
                System.out.println("Modelo não encontrado!");
            
            }  
        } else if (opcao == 15) {
    // Lógica para Imprimir Todos
    List<Modelo> todosVeiculos = bancoModelo.imprimirTodos();
    
    if (todosVeiculos.isEmpty()) {
        System.out.println("Não há modelos cadastrados.");
    } else {
        System.out.println("--- Lista de Modelos Cadastrados ---");
        for (Modelo modelos : todosVeiculos) {
            System.out.println("Código: " + modelos.getCodigo() + 
                               ", Nome: " + modelos.getNome() + 
                               ", Sigla: " + modelos.getSigla());
        }
        System.out.println("------------------------------------");
    }

} else if (opcao == 16) {
    // Lógica para Obter Número de Itens Cadastrados
    int total = bancoModelo.getNumeroModelo();
    System.out.println("Total de modelos cadastrados: " + total);
}

} while (opcao != 19);
        }
    }