package Exer01;

public class Carro {
		
		String placa;
		String marca;
		String modelo;
		int ano;
		double velMaxima;
		double motor;
		String cambio;
		int marcha;
		String estado;
		
		public String getPlaca() {
			return placa;
		}
		public void setPlaca(String placa) {
			this.placa = placa;
		}
		
		public String getMarca() {
			return marca;
		}
		public void setMarca(String marca) {
			this.marca = marca;
		}
		
		public String getModelo() {
			return modelo;
		}
		public void setModelo(String modelo) {
			this.modelo = modelo;
		}
		
		public int getAno() {
			return ano;
		}
		public void setAno(int ano) {
			this.ano = ano;
		}
		
		public double getVelMaxima() {
			return velMaxima;
		}
		public void setVelMaxima(double velMaxima) {
			this.velMaxima = velMaxima;
		}
		
		//ESCOLHE MOTOR
		public double getMotor() {
			return motor;
		}
		public void setMotor(double motor) {
			if (motor == 1.0 || motor == 2.0){
				this.motor = motor;}
			else {
				System.out.println("Câmbio inválido");}
			}
		
		//ESCOLHE CÂMBIO
		public String getCambio() {
			return cambio;
		}
		public void setCambio(String cambio){
			if (cambio == "Manual" || cambio == "Automatico") { 
				this.cambio = cambio;}
			else {
				System.out.println("Câmbio inválido");}
			}
		
		//ESCOLHE MARCHA
		public int getMarcha() {
			return marcha;
		}
		public void setMarcha(int marcha) {
			if (marcha <= 0 || marcha >= 6)
				 System.out.println("Marcha inválida");
			else 
			this.marcha = marcha;
			System.out.println("Carro com: " + marcha);}
		
			
		//ESTADO CARRO
		public String getEstado() {
			return estado;
		}
		public void setEstado(String Estado) {
			if (estado == "sim"){
				System.out.println("O carro está ligado!");
				this.estado = estado;}
			else if (estado == "nao");{
				System.out.println("O carro não estava ligado!");}	
			this.estado = estado;}
	}
