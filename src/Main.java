import br.com.estudos.screenmatch.calculos.CalculadoraDeTempo;
import br.com.estudos.screenmatch.calculos.FiltroRecomendacao;
import br.com.estudos.screenmatch.modelos.Episodio;
import br.com.estudos.screenmatch.modelos.Filme;
import br.com.estudos.screenmatch.modelos.Serie;

public class Main {
    public static void main(String[] args) {

        Filme meuFilme = new Filme();
        Serie lost = new Serie();
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        meuFilme.setNome("O poderoso chefao");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(9);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println(meuFilme.getTotalDeAvalicao());
        // System.out.println(meuFilme.totalDeAvalicao);
        System.out.println(meuFilme.pegaMedia());




        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração do filme: " + lost.getDuracaoEmMinutos());


        Filme outroFilme = new Filme();
        outroFilme.setNome("Avatar");
        outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(200);


        calculadora.inclui(meuFilme);
        System.out.println(calculadora.getTempoTotal());
        calculadora.inclui(outroFilme);
        System.out.println(calculadora.getTempoTotal());
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.fitra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.fitra(episodio);

    }
}
