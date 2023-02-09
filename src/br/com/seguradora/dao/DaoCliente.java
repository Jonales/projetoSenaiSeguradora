/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.seguradora.dao;

import br.com.seguradora.connection.ConnectionFactory;
import br.com.seguradora.modelo.ModeloCliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author jonatas.meireles
 */
public class DaoCliente {
    Connection conn;
    
    public void inserir(ModeloCliente cliente) { //Metodo finalizado para a inserção de clientes no banco de dados.
        conn = new ConnectionFactory().getConnection();
       
        try {
            String sql = "insert into seguradora.e1cliente (nome, rg, cpf, logradouro, nr, complemento, bairro, cidade, uf, cep, tel) VALUES(?,?,?,?,?,?,?,?,?,?,?)";
            
            PreparedStatement stmt = conn.prepareStatement(sql);
            //stmt.setString(1, "null");
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getRg());
            stmt.setString(3, cliente.getCpf());
            stmt.setString(4, cliente.getLogradouro());
            stmt.setString(5, cliente.getNr());
            stmt.setString(6, cliente.getComplemento());
            stmt.setString(7, cliente.getBairro());
            stmt.setString(8, cliente.getCidade());
            stmt.setString(9, cliente.getUf());
            stmt.setString(10, cliente.getCep());
            stmt.setString(11, cliente.getTel());
            stmt.execute();
            stmt.close();
            
            System.out.println("Cliente: "+cliente.getNome()+" cadastrado com sucesso!!");
            JOptionPane.showMessageDialog(null, "Cliente: "+cliente.getNome()+" cadastrado com sucesso!!");
         
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "DAOCliente: " + e);
            //throw new RuntimeException("DAOCliente: " + e);
        }
    }
        
    public void pesquisar(ModeloCliente cliente){ //Metodo em criação para buscar os dados do cliente no banco
        conn = new ConnectionFactory().getConnection();
       
        try {
            String sql = "select * from seguradora.e1cliente where CODIGO = ?";
            
            PreparedStatement stmt = conn.prepareStatement(sql);
            //stmt.setString(1, "null");
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getRg());
            stmt.setString(3, cliente.getCpf());
            stmt.setString(4, cliente.getLogradouro());
            stmt.setString(5, cliente.getNr());
            stmt.setString(6, cliente.getComplemento());
            stmt.setString(7, cliente.getBairro());
            stmt.setString(8, cliente.getCidade());
            stmt.setString(9, cliente.getUf());
            stmt.setString(10, cliente.getCep());
            stmt.setString(11, cliente.getTel());
            stmt.execute();
            stmt.close();
            
            System.out.println("Cliente: "+cliente.getNome()+" cadastrado com sucesso!!");
            JOptionPane.showMessageDialog(null, "Cliente: "+cliente.getNome()+" cadastrado com sucesso!!");
         
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "DAOCliente: " + e);
            //throw new RuntimeException("DAOCliente: " + e);
        }
        
    }
}
