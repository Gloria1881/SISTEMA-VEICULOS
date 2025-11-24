/**
 * Classe Modelo - Entidade que representa um modelo de veículo.
 * Implementa a classe abstrata CadastroBase.
 * Demonstra: herança, encapsulamento, sobrescrita de métodos.
 */
public class Modelo extends CadastroBase {
    private String sigla;

    public void setSigla(String sigla) {this.sigla = sigla;}
    public String getSigla() {return this.sigla;}

    /**
     * SOBRESCRIÇÃO DE MÉTODOS - toString()
     * Implementação obrigatória da classe abstrata.
     */
    @Override
    public String toString() {
        return this.getCodigo()
          + " - " + this.getNome() 
          + " - " + this.getSigla();
    }

    /**
     * SOBRESCRIÇÃO - setCodigo()
     * Adiciona validação mais específica para Modelo.
     */
    @Override
    public void setCodigo(int value) {
        if (value < 100) {
            System.out.println("Código inválido, informe maior que 100!");
        } else {
            super.setCodigo(value);
        }
    }
}