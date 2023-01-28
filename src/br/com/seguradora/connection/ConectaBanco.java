package br.com.seguradora.connection;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ConectaBanco {
    public Statement stm; // responsavel por preparar e realizar pesquisas no banco de dados
    public ResultSet rs; // responsavel por armazenar o resultado de uma pesquisa passada para statement
    private String driver = "org.mysql.driver";
    private String caminho = "jdbc:mysql://localhost/seguradora"; // responsavel por setar o local do banco
    private String usuario = "root";
    private String senha = "1234";
    public Connection conn; // responsavel por realizar a conexao com o banco de dados
    private static Connection CONNECTION;

    public void conexao() { // método responsavel por realizar a conexão com o banco
        try {
            System.setProperty("jdbc.drivers", driver); // seta a propriedade do driver de conexão
            conn = DriverManager.getConnection(caminho, usuario, senha); // realiza a conexão com o banco de dados
            CONNECTION = DriverManager.getConnection(caminho, usuario, senha);
            } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de conexão:\n Erro:"+ex.getMessage());
        }
    }
    
    public void desconecta(){// metodo para encerrar a conexao com o banco
        try {
            conn.close();//fecha conexao
            JOptionPane.showMessageDialog(null, "Desconectado com Susseco");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro dao fechar a conexão:\n Erro:"+ex.getMessage());
        }
    }     
    
    public static Connection getConnection(){  
        return CONNECTION;  
    }  
 
   public ResultSet ExecuteSQL(String SQL) {
         try {  
            stm = getConnection().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);  
            rs = stm.executeQuery(SQL.toString());  
            return rs;  
        } catch (SQLException ex) {  
            Logger.getLogger(ConectaBanco.class.getName()).log(Level.SEVERE, null, ex);     
        }  
        return null;  
    }

}
       

