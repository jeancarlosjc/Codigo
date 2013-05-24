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
    String id;
    private int quant;
    //double preco_entrada;
    public void estocar_produto(){
        conexao.estocar(id, quant);
    }
    public void colocar_na_prateleira(){
        conexao.adicionar_produto_prateleira(id, quant);
    }
    
    
}
