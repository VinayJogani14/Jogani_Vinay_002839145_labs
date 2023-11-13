/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author apple
 */
public class Order {
    ArrayList<OrderItems> orderItemsList;
    
    public Order() {
        this.orderItemsList = new ArrayList<OrderItems>();
    }

    public ArrayList<OrderItems> getOrderItemsList() {
        return orderItemsList;
    }

    public void setOrderItemsList(ArrayList<OrderItems> orderItemsList) {
        this.orderItemsList = orderItemsList;
    }
    
    
    public OrderItems addNewOrderItem(Product product, double price, int quantity) {
        OrderItems orderItem = new OrderItems(product,price,quantity);
        orderItemsList.add(orderItem);
        return orderItem;
    }
    public void deleteItem(OrderItems item){
        this.orderItemsList.remove(item);
    }
    public OrderItems findProduct(Product product){
        for(OrderItems oi:this.getOrderItemsList()){
            if(oi.getProduct().equals(product)){
                return oi;
            }
        }
        return null;
    }
    
}
