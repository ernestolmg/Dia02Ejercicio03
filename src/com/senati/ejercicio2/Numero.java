package com.senati.ejercicio2;

public class Numero {
	public double Num;
	
	

	public Numero() {
		super();
	}

	public Numero(double num) {
		super();
		Num = num;

	}
	
	public String Primo() {
		String men;
		int a=0;
		for(double i=1;i<=Num;i++) {
			if (Num % i  == 0) {
				a++;
			}
		}
		if (a==2) {
			men="Número es primo";
		}else {
			men="Número no es primo";
		}		
		return men;
	}
	
	public String Perfecto() {
		String men;
		double a=0;
		for (double i=1;i<Num;i++) {
			if (Num % i == 0) {
				a = a + i;
			}
		}
		if (a==Num) {
			men="Número es perfecto";
		}
		else {
			men="Número no es perfecto";
		}
		return men;
	}
	public double Factorial() {
		double fac=1;
		double n;
		n = Num;
		while (n != 0) {
			fac = fac * n;
			n--;
		}
		return fac;
	}
	public String mayormenor() {
		String men;
		if (Num >= 0) {
			men="Numero Positivo";
		}
		else {
			men="Numero negativo";
		}
		return men;
	 }
	public String parimpar() {
		String men;
		if (Num % 2 == 0) {
			men="Numero Par";
		}
		else {
			men="Numero impar";
		}
		return men;
	}	
}



