public class Marca  extends CadastroBase {    //agora é uma subclasse
    private String sigla;

    public void setSigla(String sigla) {this.sigla = sigla;}
    public String getSigla() {return this.sigla;}

    //SOBRESCRIÇÃO DE MÉTODOS
    @Override
    public String toString() {
        return this.getCodigo()
          + " - " + this.getNome() 
          + " - " + this.getSigla();
    }

    //SOBRESCRIÇÃO 2
    @Override
    public void setCodigo(int value) {    //setCodigo (adiciona uma regra dw validação mais específica)
        if (value < 100) {
            System.out.println("Código inválido, informe maior que 100!");
        } else {
            super.setCodigo(value);
        }
    }

}