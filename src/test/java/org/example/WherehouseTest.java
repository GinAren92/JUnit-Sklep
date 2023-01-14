package org.example;

import static org.junit.jupiter.api.Assertions.*;

class WherehouseTest {
    private final Wherehouse objectUnderTest = new Wherehouse();
    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void productAvaibilityFirstIfShouldReturnTrue(){
        //given
        String productName = "K x10";
        int productQt = 1;
        OrderList orders = new OrderList();

        //when
        orders.addToOrderList(productName,productQt);
        boolean result = objectUnderTest.productAvaibilty(productName, productQt, orders);

        //then
        assertTrue(result);
    }

    @org.junit.jupiter.api.Test
    void productAvaibilitySecondIfShouldReturnTrue(){
        //given
        String productName = "K x10";
        int productQt = 1;
        OrderList orders = new OrderList();

        //when
        orders.addToOrderList(productName,productQt);
        boolean result = objectUnderTest.productAvaibilty(productName, productQt, orders);

        //then
        assertTrue(result);
    }

    @org.junit.jupiter.api.Test
    void productAvaibilitySecondIfShouldReturnFalse(){
        //given
        String productName = "K";
        int productQt = 1;
        OrderList orders = new OrderList();

        //when
        orders.addToOrderList(productName,productQt);
        boolean result = objectUnderTest.productAvaibilty(productName, productQt, orders);

        //then
        assertFalse(result);
    }

    @org.junit.jupiter.api.Test
    void productAvaibilityThirdIfShouldReturnTrue(){
        //given
        String productName = "K x10";
        int productQt = 1;
        OrderList orders = new OrderList();

        //when
        orders.addToOrderList(productName,productQt);
        boolean result = objectUnderTest.productAvaibilty(productName, productQt, orders);

        //then
        assertTrue(result);
    }

    @org.junit.jupiter.api.Test
    void productAvaibilityThirdIfShouldReturnFalse(){
        //given
        String productName = "K x10";
        int productQt = 14;
        OrderList orders = new OrderList();

        //when
        orders.addToOrderList(productName,productQt);
        boolean result = objectUnderTest.productAvaibilty(productName, productQt, orders);

        //then
        assertFalse(result);
    }

    @org.junit.jupiter.api.Test
    void productAvaibilityElseShouldReturnTrue(){
        //given
        String productName = "K x10";
        int productQt = 1;
        OrderList orders = new OrderList();

        //when
        boolean result = objectUnderTest.productAvaibilty(productName, productQt, orders);

        //then
        assertTrue(result);
    }

    @org.junit.jupiter.api.Test
    void productAvaibilityElseShouldReturnFalse(){
        //given
        String productName = "K";
        int productQt = 1;
        OrderList orders = new OrderList();

        //when
        boolean result = objectUnderTest.productAvaibilty(productName, productQt, orders);

        //then
        assertFalse(result);
    }

    @org.junit.jupiter.api.Test
    void productAvaibilityElseSecondIfShouldReturnTrue(){
        //given
        String productName = "K x10";
        int productQt = 1;
        OrderList orders = new OrderList();

        //when
        boolean result = objectUnderTest.productAvaibilty(productName, productQt, orders);

        //then
        assertTrue(result);
    }

    @org.junit.jupiter.api.Test
    void productAvaibilityElseSecondIfShouldReturnFalse(){
        //given
        String productName = "K x10";
        int productQt = 20;
        OrderList orders = new OrderList();

        //when
        boolean result = objectUnderTest.productAvaibilty(productName, productQt, orders);

        //then
        assertFalse(result);
    }


}