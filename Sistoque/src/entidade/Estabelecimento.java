package entidade;

import conexao.Conexao;


/**
 *
 * @author Jean Carlos
 */
public class Estabelecimento {
 conexao.Conexao conexao = new conexao.Conexao();
    private String nomeEstabelecimento;
    private String id;
    private String telefone;

    public Conexao getConexao() {
        return conexao;
    }

    public void setConexao(Conexao conexao) {
        this.conexao = conexao;
    }

    public String getNomeEstabelecimento() {
        return nomeEstabelecimento;
    }

    public void setNomeEstabelecimento(String NomeEstabelecimento) {
        this.nomeEstabelecimento = NomeEstabelecimento;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
   
}
