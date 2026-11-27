package com.bootcamp.helper;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TaxCalculatorTest {
    private static final double DELTA = 0.0001;

    /*************     Suposiciones    ******************/
    //El porcentaje de IVA es constante, mayor a cero y se conoce de antemano.
    //El sistema recibe el valor del producto y regresa un número correspondiente al valor del IVA.
    //El sistema no regresa el valor final del producto.
    
    /*************     Lista de escenarios    ******************/
    
    // 1. El valor del producto es un valor mayor a cero y se regresa el número correspondiente al valor del IVA

    @Test
    void shouldCalculateIvaWhenPriceIsGreaterThanZero() {
        double valorProducto = 100.0;
        TaxCalculator calculator = new TaxCalculator(16.0);

        double ivaCalculado = calculator.calculateIva(valorProducto);

        assertEquals(16.0, ivaCalculado, DELTA);
    }

    // 2. El valor del producto es un valor menor a cero y se regresa el 0 como resultado
    @Test
    void shouldCalculateIvaWhenPriceIsLessThanZero() {
        double valorProducto = 100.0;
        double ivaCalculado = 0;
        
        TaxCalculator calculator = new TaxCalculator(16.0);

        if(valorProducto < 0) {
        	ivaCalculado = 0;
        }

        assertEquals(16.0, ivaCalculado, DELTA);
    }

    // 3. El valor del producto es un valor igual a cero y se regresa el 0 como resultado

    @Test
    void shouldCalculateIvaWhenPriceIsEqualZero() {
        double valorProducto = 100.0;
        double ivaCalculado = 0;
        
        TaxCalculator calculator = new TaxCalculator(16.0);

        if(valorProducto == 0) {
        	ivaCalculado = 0;
        }

        assertEquals(16.0, ivaCalculado, DELTA);
    }

}
