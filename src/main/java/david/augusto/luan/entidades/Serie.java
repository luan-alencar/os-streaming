package david.augusto.luan.entidades;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Serie {

	private String nome;
	private String autor;
	private Data lancamento;
	private double custoOnDemand;

}
