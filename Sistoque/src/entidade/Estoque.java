package entidade;

import conexao.Conexao;

/**
 *
 * @author Fernando
 */
public class Estoque {
    Lista lista = new Lista();
     Conexao conexao = new Conexao();
    Produto produto = new Produto();
    
    private int id;
    private String nome;
    private String descricao;
    private float precoVenda;
    float precoCompra;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
        this.precoCompra =  precoCompra;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }
    public void adicionarProdutoEstoque(int id,String nome, String descricao, int qntd, float precoVenda, float precoCompra){
        conexao.adicionarProdutoEstoque(qntd, nome, descricao, qntd, precoVenda, precoCompra);
    }
    public void retirarProdutoEstoque(int id , String nome){
        
    }
    public Produto consultarProdutoEstoque(String nome){
        return conexao.consultarProdutoEstoque(nome);
    }
    public void atualizaProdutoEstoque(String id, String nome, int qntd){
        
    }
    
}
