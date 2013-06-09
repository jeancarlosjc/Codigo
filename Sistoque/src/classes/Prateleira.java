package classes;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Jean Lucas
 */
public class Prateleira {

    public List<classes.Produto> produtos = new ArrayList<classes.Produto>();
    conexao.Conexao conexao;
    String id;
    private int qntd;
    private String localizacao;

    public Prateleira() {
        this.conexao = new conexao.Conexao();
    }

    public void adicionar_Produto() {
        conexao.adicionarProdutoPrateleira("1298712", 10);
    }

    public void retirar_Produto() {
        conexao.retirarProdutoPrateleira(id, qntd);
    }

    public List consultarProduto() {
    return conexao.consultarProduto("");
    }

    public static void main(String[] args) {
    }
}
