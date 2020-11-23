package david.augusto.luan.entidades;

import david.augusto.luan.exceptions.SerieInexistenteException;

public class AmazonPrimeVideo extends StreamingSerie {

	@Override
	public double alugarSerie(String nome, String autos) throws SerieInexistenteException {
		double descontoBlackFriday = 0.0;
		for (Serie s : series) {
			if (!series.contains(s)) {
				throw new SerieInexistenteException();
			}
			descontoBlackFriday = s.getCustoOnDemand() * 0.25;
		}
		return descontoBlackFriday;
	}

}
