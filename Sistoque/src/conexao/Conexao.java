package conexao;

import entidade.*;
import java.sql.*;

import java.util.List;

/**
 *
 * @author Jean Lucas
 */
public class Conexao {

    Lista listaprodutos = new Lista();
    Produto produto = new Produto();
    Produto[] produtos = new Produto[1000];
    Connection con;
    Statement stmt;
    ResultSet rs;
    String url = "jdbc:mysql://localhost:3306/mydb";
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
    public void adicionarProdutoEstoque(int id_produto, String nome, String descricao, int qntd, float precoVenda, float precoCompra) {
        try {
            PreparedStatement pst = null;

            openConnectionMySql();

            pst = con.prepareStatement("INSERT INTO ESTOQUE(id_estoque, Estabelecimento_ID_Estabelecimento,produto,nome_produto, quantidade_produto, descricao, precoVenda, precoCompra) VALUES(1,2," + id_produto + "," + nome + "," + qntd + "," + descricao + "," + precoVenda + "," + precoCompra + ")");
            pst.executeUpdate();
        } catch (Exception e) {
            System.out.println("ERRO :" + e);
        }
    }

    public void deletarProdutoEstoque(int id, String nome) {
    }

    public void atualizarQuantidadeEstoque(int id, String nome, int quantidade) {
    }

    public Produto consultarProdutoEstoque(String nome) {
        return produto;
    }
    //Produto (Inserir Produto).

    public void inserirProduto(String nome, String descricao, int quantidade, float precoVenda, float precoCompra) {
    }

    public List<Produto> consultarProduto() {

        int i = 0;
        try {
            for (int j = 0; j < 1000; j++) {
                produtos[j] = new Produto();
            }
            openConnectionMySql();
            stmt = con.createStatement();

            String SQL = "select * from estoque";
            rs = stmt.executeQuery(SQL);
            while (rs.next()) {
                produtos[i].setId(rs.getString("ID_Produto"));
                produtos[i].setNome(rs.getString("nome_produto"));
                produtos[i].setDescricao(rs.getString("descricao"));
                produtos[i].setQntd(rs.getInt("quantidade_produto"));
                produtos[i].setPrecoCompra(rs.getFloat("PrecoVenda"));
                produtos[i].setPrecoVenda(rs.getFloat("PrecoCompra"));
                listaprodutos.produtos.add(produtos[i]);
                i++;
            }
            return (List<Produto>) listaprodutos.produtos;
        } catch (Exception e) {
            System.out.println("Erro na conexao com o banco" + e);


        }

        return (List<Produto>) listaprodutos.produtos;
    }

    public void atualizarProduto(String nome, String descricao, int quantidade, float precoVenda, float precoCompra) {
    }
    // Prateleira (Adicionar Produto , Retirar Produto, Adicionar Preco Final).	

    public void adicionarProdutoPrateleira(int ID_Estabelecimento, int id_produto, String nome_produto, String descricao, int qntd, float precoVenda, float precoCompra) {
        try {
            PreparedStatement pst = null;

            openConnectionMySql();

            pst = con.prepareStatement("INSERT INTO Prateleira(ID_Estabelecimento,id_produto,quantidade_produto,descricao,precoVenda,precoCompra,nome_produto) VALUES("+ID_Estabelecimento+"," +id_produto +","+qntd+","+descricao+","+precoVenda+","+precoCompra+","+nome_produto+",2)");
            pst.executeUpdate();
        } catch (Exception e) {
            System.out.println("ERRO :" + e);
        }
    }

    public void retirarProdutoPrateleira(int id, int qntd) {
    }

    public void atualizarPrecoFinal(int id, String precoFinal) {
        try {
            PreparedStatement pst = null;

            openConnectionMySql();

            pst = con.prepareStatement("update PRATELEIRA set precofinal = " + precoFinal + "");
            pst.executeUpdate();
        } catch (Exception e) {
            System.out.println("ERRO :" + e);
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

    public static void main(String[] args) {
        Conexao a = new Conexao();
    }
}
