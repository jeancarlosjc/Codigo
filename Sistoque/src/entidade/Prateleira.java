package entidade;

import entidade.*;
import conexao.*;
import entidade.Lista;
import entidade.Produto;
import java.util.*;

/**
 *
 * @author Jean Lucas
 */
public class Prateleira {

     Lista lista = new Lista();
    Conexao conexao = new Conexao();

   
    private int id;
    private String descricao;
    private int qntd;
    private float precoVenda;
    private float precoCompra;
    

    public void adicionarProdutoPrateleira(int ID_Estabelecimento, int id_produto, int qntd, String descricao, float precoVenda, float precoCompra, String nome_produto) {
        conexao.adicionarProdutoPrateleira(ID_Estabelecimento,id_produto,qntd,descricao,precoVenda,precoCompra,nome_produto);
                            
    }
    public void update_prateleira(){
        
    }
    public void retirar_Produto() {
        conexao.retirarProdutoPrateleira(id, qntd);
    }
    public List<Produto> consultarProdutoPrateleira(){
        return  conexao.consultarProdutoPrateleira();
    }
    public List<Produto> consultarProduto() {
        return  conexao.consultarProduto();
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQntd() {
        return qntd;
    }

    public void setQntd() {
        this.qntd = qntd;
    }
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

   
 
}
