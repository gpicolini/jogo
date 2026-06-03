package jogo;

import java.sql.*;

public class BancoDados {

    private static final String URL = "jdbc:mysql://localhost:3306/login_system";
    private static final String USER = "root";
    private static final String PASSWORD = "TrT@@##@90";

    public static String autenticar(String usuario, String senha) {

        try {
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);

            String sql = "SELECT * FROM usuarios WHERE usuario = ? AND senha = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, usuario);
            stmt.setString(2, senha);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                String nome = rs.getString("nome");

                if (nome == null || nome.trim().isEmpty()) {
                    nome = usuario;
                }

                conn.close();
                return nome;
            }

            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

}
