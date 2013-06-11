package classes;


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
    String id;
    private int qntd;
    private String localizacao;

   

    public void adicionar_Produto() {
        conexao.adicionarProdutoPrateleira("1298712", 10);
    }

    public void retirar_Produto() {
        conexao.retirarProdutoPrateleira(id, qntd);
    }

    public List<Produto> consultarProduto() {
     return conexao.consultarProduto("");  
    }

  
}
