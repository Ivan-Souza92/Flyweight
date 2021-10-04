public class Cliente {

    private String nome;
    private Endereco endereco;

    public Cliente(String nome, Endereco endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ",endereco='"+ endereco.getRua() + '\'' +
                ",numero='"+ endereco.getNumero() + '\'' +
                ",bairro='"+ endereco.getBairro() + '\'' +
                '}';
    }
}