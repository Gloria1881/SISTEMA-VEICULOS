import java.util.ArrayList;
import java.util.List;

public class VeiculoBanco {
    //atributos
    private List<Veiculo> lista;
    private int numeroVeiculo;
    // contador interno para geração automática de códigos. Começa em 100 conforme solicitado.
    private int proximoCodigo = 100;

    //construtor
    public VeiculoBanco () {
        lista = new ArrayList<Veiculo>();
        numeroVeiculo = 0;
    }

    /**
     * Gera o próximo código sequencial para novos veículos.
     */
    public int gerarCodigo() {
        return proximoCodigo++;
    }

    //propriedades - adicionar
    /**
     * Adiciona um veículo. Se o objeto não contém código, gera automaticamente.
     */
    public void adicionar(Veiculo veiculo) {
        if (veiculo.getCodigo() <= 0) {
            veiculo.setCodigo(gerarCodigo());
        }
        lista.add(veiculo);
        numeroVeiculo = numeroVeiculo + 1;
        System.out.println("Veículo adicionado!");
    }


    //excluir
    public void excluir(int codigo) {
        Veiculo localizado = null;

        for (Veiculo item : lista) {
            if (item.getCodigo() == codigo) {
                localizado = item;
                break;
            }
        }

        if (localizado == null) {
            System.out.println("O veículo não está disponível!");
        } else {
            lista.remove(localizado);
            this.numeroVeiculo = this.numeroVeiculo - 1;
            System.out.println("Veículo removido!");
        }
    }
    
    //alterar
    public void alterar(Veiculo veiculo) {
        Veiculo localizado = this.pesquisar(veiculo.getCodigo());

        if(localizado == null) {
            System.out.println("O veículo não foi encontrado para alterar");
        } else {
            localizado.setNome(veiculo.getNome());
            localizado.setSigla(veiculo.getSigla());
            System.out.println("Veículo alterado com sucesso");
        }
    }

//pesquisar
    public Veiculo pesquisar(int codigo) {
        for (Veiculo item : lista) {
            if (item.getCodigo() == codigo) {
            return item;
        }
            } return null;
        }
    /**
     * SOBRECARGA: pesquisa por sigla (mesmo nome do método, tipo diferente).
     * Retorna o Veiculo correspondente à sigla ou null se não encontrado.
     */
    public Veiculo pesquisar(String sigla) {
        for (Veiculo item : lista) {
            if (item.getSigla() != null && item.getSigla().equals(sigla)) {
                return item;
            }
        }
        return null;
    }
    public int getNumeroVeiculo() {
        return this.numeroVeiculo;
    }

//imprimir todos
public List<Veiculo> imprimirTodos() {
    return this.lista;
}
}
