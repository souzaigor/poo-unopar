package Exer01;

public class TipoMotor {

	POT1("1.0");
    POT2("2.0");

    private String descricao;

    TipoMotor(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
    
}
