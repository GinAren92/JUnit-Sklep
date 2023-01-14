package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    private final Product objectUnderTest = new Product("K",1, BigDecimal.valueOf(1));

    @AfterEach
    void tearDown() {
    }

    @Test
    void setQtyTrue() {
        //given
        int productQt = 1;

        //when
        objectUnderTest.setQty(productQt);

        //then
        assertEquals(productQt,objectUnderTest.getQty());
    }

    @Test
    void setQtyThrowException() {
        //given
        int productQt = 0; //or less then 0

        //when
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            objectUnderTest.setQty(productQt);
        });

        //then
        assertEquals("Qty have to be greater than 0", thrown.getMessage());
    }

    @Test
    void setPriceTrue() {
        //given
        BigDecimal productPrice = BigDecimal.valueOf(1);

        //when
        objectUnderTest.setPrice(productPrice);

        //then
        assertEquals(productPrice,objectUnderTest.getPrice());
    }

    @Test
    void setPriceThrowException() {
        //given
        BigDecimal productPrice = BigDecimal.valueOf(0); //or less then 0

        //when
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            objectUnderTest.setPrice(productPrice);
        });

        //then
        assertEquals("Price have to be greater then 0.", thrown.getMessage());
    }

    @Test
    void setProductName() {
        //given
        String productName = "ProductTestName 1";

        //when
        objectUnderTest.setProductName(productName);

        //then
        assertEquals(productName,objectUnderTest.getProductName());
    }

    @Test
    void setProductNameThrowException() {
        //given
        String productName = "";
        String productNameSecond = " ProductTestName 1"; // Starts with white char

        //when
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            objectUnderTest.setProductName(productName);
        });
        IllegalArgumentException thrownSecond = assertThrows(IllegalArgumentException.class, () -> {
            objectUnderTest.setProductName(productNameSecond);
        });


        //then
        assertEquals("Name cant be nothing and cant start with space.",thrown.getMessage());
        assertEquals("Name cant be nothing and cant start with space.",thrownSecond.getMessage());
    }
}