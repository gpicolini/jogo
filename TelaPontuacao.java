package jogo;


public class TelaPontuacao {

 private SistemaPontuacao pontuacao;

    public TelaPontuacao() {
        pontuacao = new SistemaPontuacao();
    }

    public void acertou() {
        pontuacao.adicionarAcerto();
    }

    public void errou() {
        pontuacao.adicionarErro();
    }

    public void finalizarJogo() {

        System.out.println("Acertos: " + pontuacao.getAcertos());
        System.out.println("Erros: " + pontuacao.getErros());
        System.out.println("Tempo: " + pontuacao.getTempoSegundos());
        System.out.println("Pontuação: " + pontuacao.getPontuacaoTotal());

    }
}