import java.util.ArrayList;
import java.util.List;

public class MarcaBanco {
    //atributos
    private List<Marca> lista;
    private int numeroMarca;
    private int proximoCodigo = 100; //geração automática de códigos.

    //construtor
    public MarcaBanco () {
        lista = new ArrayList<Marca>();
        numeroMarca = 0;
    }

    /* Gera o próximo código sequencial para novos registros. */
    public int gerarCodigo() {
        return proximoCodigo++;
    }

    /*propriedades - adicionar
    Se o código no objeto marca for menor ou igual a 0, atribui um código gerado automaticamente (a partir de 100). Mantém a checagem de duplicidade pelo código para evitar registros repetidos.
     */
    public void adicionar(Marca marca) {
        if (marca.getCodigo() <= 0) {  // se não tiver código definido, gera automaticamente
            marca.setCodigo(gerarCodigo());
        }

        Marca localizado = this.pesquisar(marca.getCodigo());

        if (localizado == null) {
            lista.add(marca);
            numeroMarca = numeroMarca + 1;
            System.out.println("Marca adicionada!");
        } else {
            System.out.println("Já existe uma marca com esse código!");
        }
    }

    //excluir
    public void excluir(int codigo) {
        Marca localizado = null;

        for (Marca item : lista) {
            if (item.getCodigo() == codigo) {
                localizado = item;
                break;
            }
        }

        if (localizado == null) {
            System.out.println("A marca não está disponível!");
        } else {
            lista.remove(localizado);
            this.numeroMarca = this.numeroMarca - 1;
            System.out.println("Marca removido!");
        }
    }
    
    //alterar
   public void alterar(Marca marca) {
        Boolean localizado = false;

        for (Marca item : lista) {
            if (item.getCodigo() == marca.getCodigo()) {
                item.setNome(marca.getNome());
                item.setSigla(marca.getSigla());
                localizado = true;
                break;
            }
        }

        if (localizado == false) {
            System.out.println("Marca não localizada!");
        } else {
            System.out.println("Marca alterada!");
        }
    }

    public Marca pesquisar(int codigo) {
        Marca localizado = null;

        for (Marca item : lista) {
            if (item.getCodigo() == codigo) {
                localizado = item;
                break;
            }
        }

        if (localizado == null) {
            return null;
        } else {
            return localizado;            
        }
    }

    public Marca pesquisar(String sigla) {
        Marca localizado = null;

        for (Marca item : lista) {
            if (item.getSigla().equals(sigla) == true) {
                localizado = item;
                break;
            }
        }

        if (localizado == null) {
            return null;
        } else {
            return localizado;            
        }
    }

    public int getNumeroMarca() {
        return this.numeroMarca;
    }

    public List<Marca> imprimirTodos() {
        return this.lista;
    }

}
