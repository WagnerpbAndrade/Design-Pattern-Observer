package model;

import enums.EEnumVldStatus;
import lombok.Getter;
import lombok.Setter;
import observer.Observer;
import observer.Subject;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class OrderModel implements Subject {

    private Long orderId;
    private int orderStatus;
    private String changeStatus = "";
    private List<Observer> observers;

    public OrderModel(Long orderId, int orderStatus) {
        this.observers = new ArrayList();
        this.orderId = orderId;
        this.orderStatus = orderStatus;
    }

    public void setOrderStatus(int orderStatus) {
        this.setChangeStatus("Status alterado de: " + EEnumVldStatus.getName(this.orderStatus) + " para: " + EEnumVldStatus.getName(orderStatus));

        this.orderStatus = orderStatus;

        notifyObservers();
    }

    @Override
    public void addObserver(Observer o) {
        if (! this.observers.contains(o)) {
            this.observers.add(o);
        }
    }

    @Override
    public void removeObserver(Observer o) {
        if (this.observers.contains(o)) {
            this.observers.remove(0);
        }
    }

    @Override
    public void notifyObservers() {
        this.observers.forEach(observer -> observer.update());
    }

    @Override
    public String toString() {
        return "OrderModel{" +
                "orderId = " + orderId +
                ", orderStatus = " + EEnumVldStatus.getName(orderStatus) +
                ", changeStatus = " + changeStatus +
                '}';
    }
}
