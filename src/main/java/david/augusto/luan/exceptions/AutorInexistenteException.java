package david.augusto.luan.exceptions;

public class AutorInexistenteException extends Exception {

	private static final long serialVersionUID = 1L;

	public AutorInexistenteException() {
		super("Operação não realizada, autor não encontrado!");
	}
}
