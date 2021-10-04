import java.util.ArrayList;
import java.util.List;

public class Delivery {

    private List<Cliente> clientes = new ArrayList<>();

    public void pedido(String nomeCliente,String rua, int numero, String bairro){

        Endereco endereco = EnderecoFactory.getEndereco(rua,numero,bairro);
        Cliente cliente = new Cliente(nomeCliente,endereco);

        clientes.add(cliente);
    }

    public List<String>obterCliente(){
        List<String>saida = new ArrayList<String>();

        for(Cliente cliente : this.clientes){

            saida.add(cliente.toString());
        }

        return saida;
    }
}
