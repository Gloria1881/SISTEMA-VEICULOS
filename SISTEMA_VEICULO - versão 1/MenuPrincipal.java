import java.util.Scanner;

public class MenuPrincipal {
    // Atributo
    private Scanner teclado = new Scanner(System.in);

    // propriedades
    public void exibir() {
        int opcao = 0;
        
        do {
                System.out.println("Sistema de cadastro de veículos");
                System.out.println("1. Marca");
                System.out.println("2. Veículos");
                System.out.println("3. Modelo");
                System.out.println("9. Sair");
                System.out.print("Digite a opção: ");  
                opcao = teclado.nextInt();
               

                if (opcao == 1) {
                    new MarcaMenu(); 
                } else if (opcao == 2) {
                    new VeiculoMenu(teclado); 
                } else if (opcao == 3) {
                    new ModeloMenu(teclado); 
                }
            
        } while (opcao != 9); 
    }
}