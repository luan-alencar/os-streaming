package david.augusto.luan.interfaces;

import java.util.List;

import david.augusto.luan.entidades.Data;
import david.augusto.luan.entidades.Serie;
import david.augusto.luan.exceptions.AutorInexistenteException;
import david.augusto.luan.exceptions.SerieInexistenteException;

/*****************************
 * 		Lívia Sousa Brito    *
 *****************************/

public interface ServicoStreaming {

	public void adicionarSerie(String nome, String autor, Data lancamento, double custoOnDeman);

	public List<Serie> listarSeriesDoAutor(String autor);

	public void removerSeriesDoAutor(String autor) throws AutorInexistenteException;

	public double alugarSerie(String nome, String autos) throws SerieInexistenteException;

}
