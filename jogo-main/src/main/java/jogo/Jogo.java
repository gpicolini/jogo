package jogo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Jogo {
    
    private static final String URL = "mysql://root:TUEbJashZWrUFTRZyBeIYBXtUZEUILVG@trolley.proxy.rlwy.net:52251/railway";
    private static final String USER = "root";
    private static final String PASSWORD = "TUEbJashZWrUFTRZyBeIYBXtUZEUILVG";

    public Connection conn;

    public BancoDados m_db;
    
    public TelaLogin Login;

    public TelaCadastro Cadastro;
    
    public Jogo() throws SQLException {
        conn = DriverManager.getConnection(URL, USER, PASSWORD);

        Login = new TelaLogin(this);
        Cadastro = new TelaCadastro(this);

        Login.Show();
    };
}
