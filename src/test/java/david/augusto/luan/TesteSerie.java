package david.augusto.luan;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import david.augusto.luan.entidades.AmazonPrimeVideo;
import david.augusto.luan.entidades.Data;
import david.augusto.luan.entidades.Netflix;
import david.augusto.luan.entidades.StreamingSerie;
import david.augusto.luan.exceptions.AutorInexistenteException;
import david.augusto.luan.exceptions.SerieInexistenteException;

public class TesteSerie {

	private StreamingSerie stream;
	private StreamingSerie stream2;
	
	@BeforeEach
	public void setUp() {
		stream = new Netflix();
		stream2 = new AmazonPrimeVideo();
	}

	public void addSeries() {
		stream.adicionarSerie("Narcos", "Antonio Bandeiras", new Data(10, 11, 2020), 10.0);
		stream.adicionarSerie("Rantaru", "Antonio Bandeiras", new Data(12, 02, 2020), 5.0);
		stream.adicionarSerie("Narcos", "Antonio Bandeiras", new Data(30, 06, 2020), 6.0);
		stream2.adicionarSerie("Jurassic", "Livia", new Data(10, 11, 2020), 11.0);
		stream2.adicionarSerie("Kong fu", "Livia", new Data(25, 02, 2020), 10.0);
		stream2.adicionarSerie("Futebol", "Livia", new Data(10, 11, 2020), 11.0);
	}
	
	@Test
	public void adicionarSerie() {
		assertEquals(0, stream.getSeries().size());
		addSeries();
		assertEquals(3, stream.getSeries().size());
	}

	@Test
	public void testListarSeries() {
		addSeries();
		assertEquals(3, stream.listarSeriesDoAutor("Antonio Bandeiras").size());
		assertEquals(3, stream2.listarSeriesDoAutor("Livia").size());
	}

	@Test
	public void testRemoverSerie() throws AutorInexistenteException, SerieInexistenteException {
		addSeries();
		assertEquals(3, stream.getSeries().size());
		stream.removerSeriesDoAutor("Antonio Bandeiras");
		assertEquals(0, stream.getSeries().size());
	}
	
}
