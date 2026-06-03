package jogo;

public class SistemaPontuacao {
    
       private int acertos;
    private int erros;
    private long inicioPartida;

    public SistemaPontuacao() {
        inicioPartida = System.currentTimeMillis();
    }

    public void adicionarAcerto() {
        acertos++;
    }

    public void adicionarErro() {
        erros++;
    }

    public int getAcertos() {
        return acertos;
    }

    public int getErros() {
        return erros;
    }

  public int getPontuacaoTotal() {

    int pontosBase = (acertos * 10) - (erros * 2);

    return pontosBase + getBonusTempo();
}

public int getTempoSegundos() {
    return (int)((System.currentTimeMillis() - inicioPartida) / 1000);
}

public int getBonusTempo() {

    int tempo = getTempoSegundos();

    if (tempo < 120) {
        return 25;
    }

    if (tempo < 240) {
        return 10;
    }

    return 0;
}

}
    

