package entidade;

import conexao.Conexao;



/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fernando
 */
public class Estoque {
    conexao.Conexao conexao = new conexao.Conexao();
    Produto produto = new Produto();
    private String id;
    private String nome;
    private String descricao;
    private String precoVenda;
    double precoCompra;
    private int quant;

    public Conexao getConexao() {
        return conexao;
    }

    public void setConexao(Conexao conexao) {
        this.conexao = conexao;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(String precoVenda) {
        this.precoVenda = precoVenda;
    }

    public double getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(double precoCompra) {
        this.precoCompra = precoCompra;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }
    public void adicionarProdutoEstoque(String id, String descricao, int qntd, float precoVenda, float precoCompra){
        
    }
    public void retirarProdutoEstoque(String id , String nome){
        
    }
    public Produto consultarProdutoEstoque(String nome){
        return conexao.consultarProdutoEstoque(nome);
    }
    public void atualizaProdutoEstoque(String id, String nome, int qntd){
        
    }
}
