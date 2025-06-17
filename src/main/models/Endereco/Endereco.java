public class Endereco {
    String id;
    String Rua;
    String Numero;
    String Bairro;
    String Cep;
    String Complemento;
    String Cidade;

    public Endereco(DadosCadastroEndereco dados){
        this.id = dados.id();
        this.Rua = dados.Rua();
        this.Numero = dados.Numero();
        this.Bairro = dados.Bairro();
        this.Cep = dados.Cep();
        this.Complemento = dados.Complemento();
        this.Cidade = dados.Cidade();
    }
}
