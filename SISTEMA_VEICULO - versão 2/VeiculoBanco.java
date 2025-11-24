import java.util.ArrayList;
import java.util.List;

public class VeiculoBanco {
    //atributos
    private List<Veiculo> lista;
    private int numeroVeiculo;

    //construtor
    public VeiculoBanco () {
        lista = new ArrayList<Veiculo>();
        numeroVeiculo = 0;
    }

    //propriedades - adicionar
    public void adicionar(Veiculo veiculo) {
        lista.add(veiculo);
        numeroVeiculo = numeroVeiculo + 1;
        System.out.println("Marca adicionada!");
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
    public int getNumeroVeiculo() {
        return this.numeroVeiculo;
    }

//imprimir todos
public List<Veiculo> imprimirTodos() {
    return this.lista;
}
}
