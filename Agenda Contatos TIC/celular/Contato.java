package celular;

public class Contato {
     //Aréa das variaveis
    private String nome;
    private String numero;

    public Contato(String nome, String numero) {           //Construtor que define os dados do contato 
        this.nome = nome;
        this.numero = numero;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {                   //Metódo toString que faz com que ocorra o retorno dos dados do Objeto
        return "Nome: " + nome + " - Numero: " + numero;
    }
}