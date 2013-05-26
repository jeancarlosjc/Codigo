package conexao;

import java.sql.*;

/**
 *
 * @author Jean Lucas
 */
 public class Conexao{
    Connection con;
    Statement stmt;
    ResultSet rs;
    String url = "jdbc:mysql://127.0.0.1:3306/mydb";
    String user = "root";
    String password = "1234567890";
    String driver = "com.mysql.jdbc.Driver";

    public void openConnectionMySql() {
        try {
            Class.forName(driver).newInstance();
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
        } catch (Exception e) {
            System.out.println("Erro na conexao com o banco" + e);
        }
    }
    //Cliente (Inserir Cliente , Deletar Cliente ).

    public void insere_cliente(String nome, boolean pessoaJuridica, int cpf, int cnpj) {
    }
    //Deleta cliente baseado em número de cpf que é uma identificação única.

    public void delete_cliente(String nome, int cpf) {
    }

    //Estoque (Adicionar Produto , deletar Produto).
    public void adicionar_produto() {
    }

    public void deletar_produto(String id) {
    }

    public void atualizar_quantidade(int id, int quantidade) {
    }
    //Produto (Inserir Produto).

    public void inserir_produto(String nome, String descricao, int quantidade, float precoVenda, float precoCompra) {
    }

    public void consultar_produto(String id) {
    }

    public void atualizar_produto(String nome, String descricao, int quantidade, float precoVenda, float precoCompra) {
    }
    // Prateleira (Adicionar Produto , Retirar Produto, Adicionar Preco Final).	

    public void adicionar_produto_prateleira(String id, int qntd) {
        try{
            PreparedStatement pst = null;
        
            openConnectionMySql();
                    
             pst = con.prepareStatement("INSERT INTO Prateleira(ID_Prateleira,localizacao,Estabelecimento_ID_Estabelecimento) VALUES("+id+","+qntd+",2)");
             pst.executeUpdate();
        }catch(Exception e){
            System.out.println("ERRO :"+e);
        }
    }

    public void retirar_produto_prateleira(String id, int qntd) {
    }

    public void atualizar_precoFinal(String id, String precoFinal) {
    }

    public void atualizar_produto_prateleira(String id, String qntd) {
    }
    //Venda (Inserir Venda , Consultar Venda , Deletar Venda).

    public void inserir_venda(String id, String data, String precoTotal, String comprador, String vendedor, String idprodutos) {
    }

    public void consultar_venda(String id) {
    }

    public void deletar_venda(String id) {
    }

    public void estocar(String id, int quant) {
        
    }

    public void DadosEstab(String NomeEstabelecimento, Float Caixa) {
       
    }
}
