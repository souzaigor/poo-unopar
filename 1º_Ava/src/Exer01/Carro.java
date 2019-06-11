package Exer01;

import Exer01.TipoMotor;

	// EXERCÍCIO 1
public class Carro {
    private String placa;
    private String marca;
    private String modelo;
    private String ano;
    private Integer velocidadeMaxima;
    private String tipoMotor;
    private String tipoCambio;
    private int marcha; 
    private boolean estado;
    
    
    // EXERCÍCIO 1.3
    public void ligaCarro() {
        if (estado != true) { //SE O CARRO ESTIVER DESLIGADO
            estado = true;}   //CARRO LIGADO
        else {		  	      //SE NÃO
            estado = true;}   //CARRO JA ESTÁ LIGADO
       	}
    
    // EXERCÍCIO 1.4
    public void desligaCarro() {
        if (estado != 	false) { //SE O CARRO ESTIVER LIGADO
            estado = false;}	 //CARRO DESLIGADO
        else {				 	 //SE NÃO
            estado = false;}	 //CARRO JA ESTÁ DESLIGADO
    	}
    
    // EXERCÍCIO 1.5
    public void AcelerarAteVelocidadeMaxima() {
        if (estado == true) {
            if (tipoMotor.equals(tipoMotor.POT1)) {
                for (int i = 0; velocidadeMaxima <= 100; i += 10) {
                    velocidadeMaxima = i;
                }
            } else if (tipoMotor.equals(tipoMotor.POT2)) {
                for (int i = 0; velocidadeMaxima <= 140; i += 20) {
                    velocidadeMaxima = i;
                }
            }
        }
    }
    
    // EXERCÍCIO 1.6
    public void frear() {
        if (estado == true) {
            if (tipoMotor.equals(tipoMotor.POT1)) {
                for (int i = 0; velocidadeMaxima > 0; i -= 20) {
                    velocidadeMaxima -= i;
                }
            }
            if (tipoMotor.equals(tipoMotor.POT2)) {
                for (int i = 0; velocidadeMaxima > 0; i -= 20) {
                    velocidadeMaxima -= i;
                }
            }
        }
    }
    
    //GETTERS E OS SETTERS
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

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public Integer getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(Integer velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public String getTipoMotor() {
		return tipoMotor;
	}

	public void setTipoMotor(String tipoMotor) {
		this.tipoMotor = tipoMotor;
	}

	public String getTipoCambio() {
		return tipoCambio;
	}

	public void setTipoCambio(String tipoCambio) {
		this.tipoCambio = tipoCambio;
	}

	public int getMarcha() {
		return marcha;
	}

	public void setMarcha(int marcha) {
		this.marcha = marcha;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
    

}