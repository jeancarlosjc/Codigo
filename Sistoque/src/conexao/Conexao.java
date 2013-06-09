package conexao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jean Lucas
 */
 public class Conexao{
    public List<classes.Produto> produtos = new ArrayList<classes.Produto>();
    classes.Produto produto = new classes.Produto();
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

    public void insereCliente(String nome, boolean pessoaJuridica, int cpf, int cnpj) {
    }
    //Deleta cliente baseado em número de cpf que é uma identificação única.

    public void deleteCliente(String nome, int cpf) {
    }

    //Estoque (Adicionar Produto , deletar Produto).
    public void adicionarProdutoEstoque(int id, String nome, String descricao, int qntd , float precoVenda, float precoCompra) {
        
    }

    public void deletarProdutoEstoque(int id , String nome) {
    }

    public void atualizarQuantidadeEstoque(int id,String nome, int quantidade) {
    }
    public void consultarProdutoEstoque(String nome){
        
    }
    //Produto (Inserir Produto).

    public void inserirProduto(String nome, String descricao, int quantidade, float precoVenda, float precoCompra) {
    }

    public List consultarProduto(String id) {
        if(id.equals("")){
        try{
                    openConnectionMySql();
                    stmt = con.createStatement();
                    
                    String SQL = "select * from produto";
                   rs = stmt.executeQuery(SQL);
                   while (rs.next()){
                    produto.setId(rs.getString("ID_Produto"));
                    produto.setNome(rs.getString("nome"));
                    produto.setDescricao(rs.getString("descricao"));
                    produto.setQuantidade(rs.getInt("Quantidade_produto"));
                    produto.setPrecoCompra(rs.getFloat("PrecoVenda"));
                    produto.setPrecoVenda(rs.getFloat("PrecoCompra"));
                    produtos.add(produto);
                   }
                   return produtos;
                }catch(Exception e){
                    System.out.println("Erro na conexao com o banco"+e);
                }
        }
        
        return produtos;
    }

    public void atualizarProduto(String nome, String descricao, int quantidade, float precoVenda, float precoCompra) {
    }
    // Prateleira (Adicionar Produto , Retirar Produto, Adicionar Preco Final).	

    public void adicionarProdutoPrateleira(String id, int qntd) {
        try{
            PreparedStatement pst = null;
        
            openConnectionMySql();
                    
             pst = con.prepareStatement("INSERT INTO Prateleira(ID_Prateleira,localizacao,Estabelecimento_ID_Estabelecimento) VALUES("+id+","+qntd+",2)");
             pst.executeUpdate();
        }catch(Exception e){
            System.out.println("ERRO :"+e);
        }
    }

    public void retirarProdutoPrateleira(String id, int qntd) {
    }

    public void atualizarPrecoFinal(String id, String precoFinal) {
    try{
            PreparedStatement pst = null;
        
            openConnectionMySql();
                    
             pst = con.prepareStatement("update PRATELEIRA set precofinal = "+precoFinal+"");
             pst.executeUpdate();
        }catch(Exception e){
            System.out.println("ERRO :"+e);
        }
    }

    public void atualizarProduto_prateleira(String id, String qntd) {
    }
    //Venda (Inserir Venda , Consultar Venda , Deletar Venda).

    public void inserirVenda(String id, String data, String precoTotal, String comprador, String vendedor, String idprodutos) {
    }

    public void consultarVenda(String id) {
    }

    public void deletarVenda(String id) {
    }

}
