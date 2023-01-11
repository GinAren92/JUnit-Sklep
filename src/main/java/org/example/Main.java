package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //
        Wherehouse whereHouse = new Wherehouse();
        OrderList orderList = new OrderList();
        List<Product> listOfProducts = whereHouse.getWhereHouse();

        listOfProducts.forEach((product)->{
            System.out.println("Main.Product: "+product.getProductName()+"\n   Price: "+product.getPrice()+"\n   Avaible qty: "+product.getQty());
        });
        System.out.println("\n Above is a products list. \nPlease enter your order: ");

        while(true) {
            String productName = whereHouse.enteredName(orderList);
            int productQty = whereHouse.enteredQty(productName, orderList);
            System.out.println("Do you want to add more products? Y/N");
            boolean keepOrdering = whereHouse.continueOrder();
            orderList.addToOrderList(productName, productQty);
            if(keepOrdering){
                break;
            }
        }
        orderList.getOrderOnScreen(whereHouse.getWhereHouse());
        MyScannerClass.closeScanner();
    }
}