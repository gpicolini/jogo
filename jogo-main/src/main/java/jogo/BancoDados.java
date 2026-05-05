package jogo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BancoDados {

    

    public static String autenticar(Connection conn, String usuario, String senha) {

        try {
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

                return nome;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }



    public static boolean cadastrar (Connection conn, String nome, String usuario, String senha) {
        try {
            String sql = "INSERT INTO usuarios (nome, usuario, senha) VALUES (?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString (1, nome);
            stmt.setString(2, usuario);
            stmt.setString(3,senha);

            stmt.executeUpdate();

            return true;

    
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }



}



