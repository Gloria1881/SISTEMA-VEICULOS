public class Veiculo {
    private int codigo;
    private String nome;
    private String sigla;


    //codigo
    public void setCodigo(int codigo) {
        if(codigo <= 0) {
            System.out.println("Código inválido, informe valores acima de 0"); //mensagens
        } else {
        this.codigo = codigo;
        }
    }
    public int getCodigo() {return this.codigo;}

    //nome
    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            System.out.println("Campo nome não pode ser nulo");
        } else if (nome.toString().trim().length() <=3) {
            System.out.println("Campo nome deve conter ao menos 3 caracteres!");
        } else {
        this.nome = nome.trim();
        }
    }
    public String getNome() {return this.nome;}

    //sigla
    public void setSigla(String sigla) {this.sigla = sigla;}
    public String getSigla() {return this.sigla;}
}
