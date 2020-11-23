package david.augusto.luan.entidades;

import lombok.Getter;

@Getter
public class Data {

	private int dia;
	private int mes;
	private int ano;

	public Data(int dia, int mes, int ano) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	

}
