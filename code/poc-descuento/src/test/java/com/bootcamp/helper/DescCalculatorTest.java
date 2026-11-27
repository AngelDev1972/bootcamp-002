package com.bootcamp.helper;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DescCalculatorTest {
    private static final double DELTA = 0.0001;

    /*************     Suposiciones    ******************/
    //El porcentaje de Descuento es variable y es mayor a cero .
    //El sistema recibe el valor del producto y regresa un número correspondiente al valor del Descuento.
    //El sistema no regresa el valor final del producto.
    
    /*************     Lista de escenarios    ******************/
    
    // 1. El valor del producto es un valor mayor a cero y se regresa el número correspondiente al valor del Descuento

    @Test
    void shouldCalculateDescWhenPriceIsGreaterThanZero() {
    	
    	
        double valorProducto = 100.0;
        double porcentajeDescuento = 20.0;
        DescCalculator calculator = new DescCalculator(porcentajeDescuento);

        double descCalculado = calculator.calculateDesc(valorProducto);

        assertEquals(porcentajeDescuento, descCalculado, DELTA);
    }
    
    // 2. El valor del producto es un valor menor a cero y se regresa el 0 como resultado

    @Test
    void shouldCalculateDescWhenPriceIsLessThanZero() {
    	
    	
        double valorProducto = 0.0;
        double porcentajeDescuento = 20.0;
        double descCalculado = 0;
        
        DescCalculator calculator = new DescCalculator(porcentajeDescuento);
        
        if(valorProducto < 0) {
        	descCalculado = 0;
        }


        assertEquals(porcentajeDescuento, descCalculado, DELTA);
    }
    

// 3. El valor del producto es un valor igual a cero y se regresa el 0 como resultado

    @Test
    void shouldCalculateDescWhenPriceIsEqualThanZero() {
    	
    	
        double valorProducto = 0.0;
        double porcentajeDescuento = 20.0;
        double descCalculado = 0;
        
        DescCalculator calculator = new DescCalculator(porcentajeDescuento);
        
        if(valorProducto == 0) {
        	descCalculado = 0;
        }


        assertEquals(porcentajeDescuento, descCalculado, DELTA);
    }


}
