import java.util.ArrayList;
import java.util.List;

public class ModeloBanco {
    //atributos
    private List<Modelo> lista;
    private int numeroModelo;
    // contador interno para geração automática de códigos. Começa em 100 conforme solicitado.
    private int proximoCodigo = 100;

    //construtor
    public ModeloBanco () {
        lista = new ArrayList<Modelo>();
        numeroModelo = 0;
    }

    /**
     * Gera o próximo código sequencial para novos modelos.
     */
    public int gerarCodigo() {
        return proximoCodigo++;
    }

    //propriedades - adicionar
    public void adicionar(Modelo modelo) {
        if (modelo.getCodigo() <= 0) {
            modelo.setCodigo(gerarCodigo());
        }
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
    /**
     * SOBRECARGA: pesquisa por sigla (mesmo nome, tipo diferente).
     */
    public Modelo pesquisar(String sigla) {
        for (Modelo item : lista) {
            if (item.getSigla() != null && item.getSigla().equals(sigla)) {
                return item;
            }
        }
        return null;
    }
    public int getNumeroModelo() {
        return this.numeroModelo;
    }

//imprimir todos
public List<Modelo> imprimirTodos() {
    return this.lista;
}
}
