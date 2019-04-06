package Exer01;

import java.util.Scanner;

public class ChamaCarro {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		Carro car = new Carro();
		
		car.getPlaca();
		car.getMarca();
		car.getModelo();
		car.getAno();
		car.getCambio();
		car.getMotor();
		

	}

}