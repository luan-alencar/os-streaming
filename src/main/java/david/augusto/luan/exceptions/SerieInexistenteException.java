package david.augusto.luan.exceptions;

/*****************************
 * 		Lívia Sousa Brito    *
 *****************************/

public class SerieInexistenteException extends Exception {

	private static final long serialVersionUID = 1L;

	public SerieInexistenteException() {
		super("Série não encontrada :(");
	}
}
