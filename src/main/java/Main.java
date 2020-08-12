import client.Orders;
import enums.EEnumVldStatus;
import model.OrderModel;

import java.util.Arrays;

public class Main {

    public static void main(String... args) {

        // Cliente observador
        Orders orders = new Orders();

        // Pedidos observados
        OrderModel order1 = new OrderModel(1L, EEnumVldStatus.ENCAMINHADO.getValor());
        // Adicionando o seu observador
        order1.addObserver(orders);

        OrderModel order2 = new OrderModel(2L, EEnumVldStatus.PROCESSSANDO.getValor());
        // Adicionando o seu observador
        order2.addObserver(orders);

        OrderModel order3 = new OrderModel(3L, EEnumVldStatus.SOLICITANDO.getValor());
        // Adicionando o seu observador
        order3.addObserver(orders);

        OrderModel order4 = new OrderModel(3L, EEnumVldStatus.FINALIZADO.getValor());
        // Adicionando o seu observador
        order4.addObserver(orders);


        orders.getOrderModelList().addAll(Arrays.asList(order1, order2, order3, order4));

        // Listar todos pedidos
        orders.update();

        // Alterando status dos pedidos e observando a alteração
        //order1.setOrderStatus(EEnumVldStatus.PROCESSSANDO.getValor());

        //order2.setOrderStatus(EEnumVldStatus.FINALIZADO.getValor());

        //order1.setOrderStatus(EEnumVldStatus.ENCAMINHADO.getValor());
    }
}
