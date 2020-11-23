package david.augusto.luan.entidades;

import david.augusto.luan.exceptions.SerieInexistenteException;

/*****************************
 * 		Lívia Sousa Brito    *
 *****************************/

public class Netflix extends StreamingSerie {

	@Override
	public double alugarSerie(String nome, String autos) throws SerieInexistenteException {
		double custoBlackFriday = 0.0;
		for (Serie s : series) {
			if (!series.contains(s)) {
				throw new SerieInexistenteException();
			}
			custoBlackFriday = s.getCustoOnDemand() * 0.20;
		}
		return custoBlackFriday;
	}

}
