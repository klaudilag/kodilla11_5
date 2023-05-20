package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class BigMacTestSuite {

    @Test
    void BuilderTest(){
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("Sezamowa")
                .burgers(1)
                .sauce("amerykański")
                .ingredients("Pomidor")
                .ingredients("cebula")
                .build();
        System.out.println(bigmac);
        Assertions.assertEquals(bigmac.getIngredients().size(), 2);
    }

}
