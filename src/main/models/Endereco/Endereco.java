import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Endereco {
    
   private String Rua;
   private String Numero;
   private String Bairro;
   private String Cep;
   private String Complemento;
   private String Cidade;

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
