import java.util.ArrayList;
import java.util.List;

public class MarcaBanco {
    //atributos
    private List<Marca> lista;
    private int numeroMarca;

    //construtor
    public MarcaBanco () {
        lista = new ArrayList<Marca>();
        numeroMarca = 0;
    }

    //propriedades - adicionar
    public void adicionar(Marca marca) {
        lista.add(marca);
        numeroMarca = numeroMarca + 1;
        System.out.println("Marca adicionada!");
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
        Marca localizado = this.pesquisar(marca.getCodigo());

        if(localizado == null) {
            System.out.println("A marca não foi encontrada para alterar");
        } else {
            localizado.setNome(marca.getNome());
            localizado.setSigla(marca.getSigla());
            System.out.println("Marca alterada com sucesso");
        }
    }

//pesquisar
    public Marca pesquisar(int codigo) {
        for (Marca item : lista) {
            if (item.getCodigo() == codigo) {
            return item;
        }
            } return null;
        }
    public int getNumeroMarca() {
        return this.numeroMarca;
    }

//imprimir todos
public List<Marca> imprimirTodos() {
    return this.lista;
}
}
