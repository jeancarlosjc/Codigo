package entidade;


/**
 *
 * @author Jean Carlos
 */
public class Estabelecimento {
 conexao.Conexao conexao = new conexao.Conexao();
    private String NomeEstabelecimento;
    private Float Caixa;
        public void DadosEstabelecimento (){
        conexao.DadosEstab(NomeEstabelecimento, Caixa);
    }
    
}
