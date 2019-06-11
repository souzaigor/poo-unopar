package Exer01;

import Exer02.Motor;

public class ChamaCarro {

	public static void main(String[] args) {
			
		Carro carObjeto = new Carro();
		carObjeto.getPlaca();
		carObjeto.getMarca();
		carObjeto.getModelo();
		carObjeto.getAno();
		carObjeto.getTipoCambio();
		carObjeto.getTipoMotor();
		carObjeto.ligaCarro();
        carObjeto.desligaCarro();
        carObjeto.AcelerarAteVelocidadeMaxima();
        
        //EXERCÍCIO 2.1
        Motor motObjeto = new Motor();
        motObjeto.getNumeroMotor();
        motObjeto.getPotencia();

	}

}