package org.example;

import java.math.BigDecimal;

public class Product {
    private int qty = 0;
    private BigDecimal price = BigDecimal.valueOf(0.0);
    private String productName = "";

    public Product(String productName,int qty,BigDecimal price){
        char[] tmpCharNameArray = productName.toCharArray();
        if(!productName.equals("") && !productName.startsWith(" "))  this.productName=productName;
        else throw new IllegalArgumentException("Name cant be nothing and cant start with space.");
        if(qty>0)  this.qty=qty ;
        else throw new IllegalArgumentException("Qty have to be greater than 0");
        if(price.intValue()>0) this.price = price;
        else throw new IllegalArgumentException("Price have to be greater then 0.");
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        if(qty>0)  this.qty=qty ;
        else throw new IllegalArgumentException("Qty have to be greater than 0");
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        if(price.intValue()>0) this.price = price;
        else throw new IllegalArgumentException("Price have to be greater then 0.");
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        if(!productName.equals("") && !productName.startsWith(" "))  this.productName=productName;
        else throw new IllegalArgumentException("Name cant be nothing and cant start with space.");
    }
    public void zmniejszIlość(int howMany){
        qty-=howMany;
    }
}

