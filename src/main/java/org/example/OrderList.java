package org.example;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderList {
    private final Map<String,Integer> orderList = new HashMap<>();
    BigDecimal summaryOrderCost = new BigDecimal(0);

    public Map<String, Integer> getOrderList() {
        return orderList;
    }

    public void addToOrderList(String productName,Integer qty) {
        orderList.computeIfPresent(productName, (key,value)-> value+qty);
        orderList.putIfAbsent(productName, qty);
    }

    public void getOrderOnScreen(List<Product> list){

        orderList.forEach((key,value)-> {
            for(Product p : list){
                if(p.getProductName().equals(key)){
                    BigDecimal tmp = p.getPrice().multiply(BigDecimal.valueOf(value));
                    summaryOrderCost = summaryOrderCost.add(tmp);
                    System.out.println("Ordered Main.Product: "+key+"      Unit Price:"+ p.getPrice() +"      Ordered quantity: "+value+"      Summary Cost for this product: "+tmp);
                }
            }
        });
        System.out.println("Summary to pay: "+summaryOrderCost);
    }

}
