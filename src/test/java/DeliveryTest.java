import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DeliveryTest {

    @Test
    void TesteCliente(){

        Delivery delivery = new Delivery();

        delivery.pedido("Roberta","rua x",456,"Terras Altas");
        delivery.pedido("Marciel","rua x",456,"Terras Altas");
        delivery.pedido("Luana","rua z",7540,"Centro");

        List<String> saida = Arrays.asList(
                "Cliente{nome='Roberta',endereco='rua x',numero='456',bairro='Terras Altas'}",
                "Cliente{nome='Marciel',endereco='rua x',numero='456',bairro='Terras Altas'}",
                "Cliente{nome='Luana',endereco='rua z',numero='7540',bairro='Centro'}"
        );

        assertEquals(saida, delivery.obterCliente());
    }

}