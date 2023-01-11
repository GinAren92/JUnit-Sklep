package org.example;

import static org.junit.jupiter.api.Assertions.*;

class WherehouseTest {
    private final Wherehouse objectUnderTest = new Wherehouse();
    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void productAvaibilty() {
        //given
        String productName = "K x10";
        int productQt = 1;
        OrderList orders = new OrderList();

        //when
        boolean result = objectUnderTest.productAvaibilty(productName, productQt, orders);

        //then
        assertTrue(result);

        //given
        productName = "K x10";
        productQt = 1;
        orders = new OrderList();

        //when
        result = objectUnderTest.productAvaibilty(productName, productQt, orders);

        //then
        assertTrue(result);
    }
}