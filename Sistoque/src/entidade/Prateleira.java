package entidade;

import entidade.Produto;
import conexao.Conexao;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jean Lucas
 */
public class Prateleira {

    Lista lista = new Lista();
     Conexao conexao = new Conexao();
    private String id;
    private String descricao;
    private int qntd;
    private float precoVenda;
    private float precoCompra;
    

    public void adicionar_Produto() {
        conexao.adicionarProdutoPrateleira("1298712", 10);
    }

    public void retirar_Produto() {
        conexao.retirarProdutoPrateleira(id, qntd);
    }

    public List<Produto> consultarProduto() {
        return conexao.consultarProduto("");
    }

    public float getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(float precoVenda) {
        this.precoVenda = precoVenda;
    }

    public float getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(float precoCompra) {
        this.precoCompra = precoCompra;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getQntd() {
        return qntd;
    }

    public void setQntd() {
        this.qntd = qntd;
    }
}
