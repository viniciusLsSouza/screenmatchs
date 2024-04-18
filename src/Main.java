import br.com.estudos.screenmatch.calculos.CalculadoraDeTempo;
import br.com.estudos.screenmatch.calculos.FiltroRecomendacao;
import br.com.estudos.screenmatch.modelos.Episodio;
import br.com.estudos.screenmatch.modelos.Filme;
import br.com.estudos.screenmatch.modelos.Pessoa;
import br.com.estudos.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Filme meuFilme = new Filme("O poderoso chefão",1970);
        Serie lost = new Serie("lost",2000);
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        //meuFilme.setNome("O poderoso chefao");
        //meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(9);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println(meuFilme.getTotalDeAvalicao());
        // System.out.println(meuFilme.totalDeAvalicao);
        System.out.println(meuFilme.pegaMedia());




        //lost.setNome("Lost");
        //lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração do filme: " + lost.getDuracaoEmMinutos());


        Filme outroFilme = new Filme("Avatar",2023);
        //outroFilme.setNome("Avatar");
        //outroFilme.setAnoDeLancamento(2023);
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

        var filmeDoPaulo = new Filme("Dogville",2003);
        filmeDoPaulo.setDuracaoEmMinutos(200);
        //filmeDoPaulo.setNome("Dogville");
        //filmeDoPaulo.setAnoDeLancamento(2003);
        filmeDoPaulo.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();

        listaDeFilmes.add(filmeDoPaulo);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);

        System.out.println("Tamanho da lista " + listaDeFilmes.size());
        System.out.println("Primeiro filme " + listaDeFilmes.get(0).getNome());


    
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

        Pessoa pessoa1 = new Pessoa("vinicius",18);
        Pessoa pessoa2 = new Pessoa("Caio",22);
        Pessoa pessoa3 = new Pessoa("Yuri",20);
        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);

        System.out.println("tamanho da lista: " + listaDePessoas.size());
        System.out.println("Primeira pessoa: " + listaDePessoas.get(0));

        System.out.println("Lista de pessoas: ");

        for(Pessoa pessoa : listaDePessoas){
            System.out.println(pessoa);
        }
    }
}
