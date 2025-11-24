import java.util.ArrayList;
import java.util.List;

public class ModeloBanco {
    //atributos
    private List<Modelo> lista;
    private int numeroModelo;

    //construtor
    public ModeloBanco () {
        lista = new ArrayList<Modelo>();
        numeroModelo = 0;
    }

    //propriedades - adicionar
    public void adicionar(Modelo modelo) {
        lista.add(modelo);
        numeroModelo = numeroModelo + 1;
        System.out.println("Modelo adicionado!");
    }


    //excluir
    public void excluir(int codigo) {
        Modelo localizado = null;

        for (Modelo item : lista) {
            if (item.getCodigo() == codigo) {
                localizado = item;
                break;
            }
        }

        if (localizado == null) {
            System.out.println("O modelo não está disponível!");
        } else {
            lista.remove(localizado);
            this.numeroModelo = this.numeroModelo - 1;
            System.out.println("Modelo removido!");
        }
    }
    
    //alterar
    public void alterar(Modelo modelo) {
        Modelo localizado = this.pesquisar(modelo.getCodigo());

        if(localizado == null) {
            System.out.println("O modelo não foi encontrado para alterar");
        } else {
            localizado.setNome(modelo.getNome());
            localizado.setSigla(modelo.getSigla());
            System.out.println("Modelo alterado com sucesso");
        }
    }

//pesquisar
    public Modelo pesquisar(int codigo) {
        for (Modelo item : lista) {
            if (item.getCodigo() == codigo) {
            return item;
        }
            } return null;
        }
    public int getNumeroModelo() {
        return this.numeroModelo;
    }

//imprimir todos
public List<Modelo> imprimirTodos() {
    return this.lista;
}
}
