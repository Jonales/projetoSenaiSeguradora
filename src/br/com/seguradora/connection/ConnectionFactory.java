// situa em qual package ou “pacote” está a classe
package br.com.seguradora.connection;
// faz as importações de classes necessárias para o funcionamento do programa
import java.sql.Connection; // conexão SQL para Java
import java.sql.DriverManager; // driver de conexão SQL para Java
import java.sql.SQLException; // classe para tratamento de exceções

public class ConnectionFactory {
    private String caminho = "jdbc:mysql://localhost/seguradora"; // responsavel por setar o local do banco
    private String usuario = "root"; // Usuario do banco
    private String senha = "1234"; // Senha do banco
    
    public Connection getConnection() {
        try {
            return DriverManager.getConnection(caminho,usuario,senha);
        }
        catch(SQLException excecao) {
            throw new RuntimeException(excecao);
        }
    }
}