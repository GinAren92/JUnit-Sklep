package org.example;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Wherehouse {
    private List<Product> whereHouse = new ArrayList<>();


    public Wherehouse(){
        whereHouse.add(new Product("Klawiatura x1", 5, BigDecimal.valueOf(50.96)));
        whereHouse.add(new Product("Klawiatura x2", 2, BigDecimal.valueOf(25.56)));
        whereHouse.add(new Product("Klawiatura x3", 6, BigDecimal.valueOf(7.22)));
        whereHouse.add(new Product("Klawiatura x4", 5, BigDecimal.valueOf(70.91)));
        whereHouse.add(new Product("Klawiatura x5", 8, BigDecimal.valueOf(220.96)));
        whereHouse.add(new Product("Klawiatura x6", 1, BigDecimal.valueOf(110.16)));
        whereHouse.add(new Product("Klawiatura x7", 1, BigDecimal.valueOf(256.29)));
        whereHouse.add(new Product("Klawiatura x8", 2, BigDecimal.valueOf(152.48)));
        whereHouse.add(new Product("Klawiatura x9", 9, BigDecimal.valueOf(320.96)));
        whereHouse.add(new Product("K x10", 14, BigDecimal.valueOf(361.96)));
    }

    public List<Product> getWhereHouse() {
        return whereHouse;
    }

    public boolean productAvaibilty(String productName, int qty, OrderList orderList){


        if(orderList.getOrderList().containsKey(productName)){
            int alreadyOrderedQty = orderList.getOrderList().get(productName);
            for (Product p: whereHouse) {
                if(p.getProductName().equals(productName) && qty>0){
                    if(p.getQty()-alreadyOrderedQty >=qty){
                        return true;
                    }
                }
            }
        }else{
            for (Product p: whereHouse) {
                if(p.getProductName().equals(productName) && qty>0){
                    if(p.getQty()>=qty){
                        return true;
                    }
                }
            }
        }
        System.out.println("Illegal product name or qty of product! Try again!");
        return false;
    }

    public String enteredName(OrderList orderList){
        String productName;
        do {
            System.out.println(" Enter product name: ");
            productName = MyScannerClass.readNextLine();
        }while(!this.productAvaibilty(productName,1, orderList));
        return productName;
    }
    public int enteredQty(String product, OrderList orderedList){
        int productQty=0;
        do {
            System.out.println(" Qty of this product: ");
            try {
                productQty = Integer.parseInt(MyScannerClass.readNextLine());
            }catch(NumberFormatException e){
                System.out.println("Invalid format. Product has not been added to the order.");
            }
        }while (!this.productAvaibilty(product,productQty,orderedList));
        return productQty;
    }

    public boolean continueOrder(){
        String keepOrder = MyScannerClass.readNextLine();
        return keepOrder.equals("N") || keepOrder.equals("n");
    }
}

