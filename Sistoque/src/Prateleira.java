
import java.util.ArrayList;


/**
 *
 * @author Jean Lucas
 */
public class Prateleira {
    conexao.Conexao conexao = new conexao.Conexao();
   String id;
    private int qntd;
    private String localizacao;
   public void adicionar_Produto(){
       conexao.adicionar_produto_prateleira("1298712", 10);
   }
   public void retirar_Produto(){
      conexao.retirar_produto_prateleira(id, qntd);
   }
   public static void main(String []args){
       Prateleira a = new Prateleira();
       a.adicionar_Produto();
   }
}
