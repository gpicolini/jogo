package jogo;

public class Jogo {
    
    public BancoDados m_db;
    private TelaLogin m_login = new TelaLogin();

    public Jogo() {

        m_login.Show();
    }
}
