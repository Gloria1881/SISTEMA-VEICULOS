/**
 * Classe abstrata que serve como base para todas as entidades do sistema.
 * Define responsabilidades comuns: código e nome com validações.
 * Força que subclasses implementem toString().
 */
public abstract class CadastroBase {
    private int codigo;
    private String nome;

    public void setCodigo(int value) {
        if (value <= 0) {
            System.out.println("Código inválido, deve ser maior 0!");
        } else {
            this.codigo = value;
        }
    }
    public int getCodigo() {return this.codigo;}

    public void setNome(String value) {
        if (value == null) {
            System.out.println("Nome inválido, não pode ser nulo!");
        } else if (value.toString().trim().length() < 3) {
            System.out.println("Nome inválido, informe ao menos 3 caracteres!");
        } else {
            this.nome = value;
        }        
    }
    public String getNome() {return this.nome;}

    /**
     * Método abstrato que força subclasses a implementarem toString()
     */
    @Override
    public abstract String toString();
}
