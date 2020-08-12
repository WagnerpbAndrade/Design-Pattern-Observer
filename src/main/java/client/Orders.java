package client;

import lombok.Getter;
import lombok.Setter;
import model.OrderModel;
import observer.Observer;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class Orders implements Observer {

    public List<OrderModel> orderModelList;

    public Orders() {
        this.orderModelList = new ArrayList();
    }

    @Override
    public void update() {
        this.orderModelList.forEach(System.out::println);
    }
}
