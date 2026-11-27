package com.bootcamp.helper;

public class DescCalculator {
	   private double Descu;

	   public DescCalculator(double Descuento) {
		   this.Descu = Descuento;
	   }

	   public double calculateDesc(double precio) {
		  return precio * Descu / 100;
	   }
}
