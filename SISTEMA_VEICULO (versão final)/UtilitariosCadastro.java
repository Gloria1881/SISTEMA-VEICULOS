/**
 * Classe utilitária com métodos estáticos para operações comuns do sistema.
 * Demonstra uso de métodos estáticos para funcionalidades reutilizáveis.
 */
public class UtilitariosCadastro {
    
    /**
     * Método estático para validar código.
     * Pode ser utilizado por qualquer entidade.
     */
    public static boolean validarCodigo(int codigo, int minimo) {
        return codigo >= minimo;
    }
    
    /**
     * Método estático para validar nome.
     * Verifica se não é nulo e tem comprimento mínimo.
     */
    public static boolean validarNome(String nome, int minimo) {
        return nome != null && nome.trim().length() >= minimo;
    }
    
    /**
     * Método estático para exibir cabeçalho formatado.
     */
    public static void exibirCabecalho(String titulo) {
        System.out.println("==============================");
        System.out.println("     " + titulo);
        System.out.println("==============================");
    }
    
    /**
     * Método estático para exibir separador.
     */
    public static void exibirSeparador() {
        System.out.println("------------------------------------");
    }
    
    /**
     * Método estático para validar se uma lista está vazia.
     */
    public static <T> boolean estaVazia(java.util.List<T> lista) {
        return lista == null || lista.isEmpty();
    }
    
    /**
     * Método estático para exibir mensagem de erro formatada.
     */
    public static void exibirErro(String mensagem) {
        System.out.println("❌ ERRO: " + mensagem);
    }
    
    /**
     * Método estático para exibir mensagem de sucesso formatada.
     */
    public static void exibirSucesso(String mensagem) {
        System.out.println("✓ SUCESSO: " + mensagem);
    }
}
