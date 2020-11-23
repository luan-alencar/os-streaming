package david.augusto.luan.entidades;

import java.util.ArrayList;
import java.util.List;

import david.augusto.luan.exceptions.AutorInexistenteException;
import david.augusto.luan.interfaces.ServicoStreaming;

/*****************************
 * 		Lívia Sousa Brito    *
 *****************************/

public abstract class StreamingSerie implements ServicoStreaming {

	protected List<Serie> series;

	public StreamingSerie() {
		this.series = new ArrayList<Serie>();
	}

	@Override
	public void adicionarSerie(String nome, String autor, Data lancamento, double custoOnDeman) {
		Serie serie = new Serie(nome, autor, lancamento, custoOnDeman);
		series.add(serie);
	}

	@Override
	public List<Serie> listarSeriesDoAutor(String autor) {
		List<Serie> seriesDoAutor = new ArrayList<Serie>();
		for (Serie s : series) {
			if (s.getAutor().equals(autor)) {
				seriesDoAutor = series;
			}
		}
		return seriesDoAutor;
	}

	@Override
	public void removerSeriesDoAutor(String autor) throws AutorInexistenteException{
		List<Serie> seriesDoAutor = new ArrayList<Serie>();
		for (Serie s : series) {
			if (s.getAutor().equals(autor)) {
				seriesDoAutor = series;
			}
			throw new AutorInexistenteException();
		}
		seriesDoAutor.removeAll(series);
	}

	public List<Serie> getSeries() {
		return series;
	}

	public void setSeries(List<Serie> series) {
		this.series = series;
	}


}
