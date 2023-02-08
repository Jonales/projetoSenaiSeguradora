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
    
        public void insert(ModeloCliente cliente) {
        conn = new ConnectionFactory().getConnection();
       
        try {
            String sql = "insert into seguradora.e1cliente (codigo ,nome, rg, cpf, logradouro, nr, complemento, bairro, cidade, uf, cep, tel) VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
            
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, "null");
            stmt.setString(2, cliente.getNome());
            stmt.setString(3, cliente.getRg());
            stmt.setString(4, cliente.getCpf());
            stmt.setString(5, cliente.getLogradouro());
            stmt.setString(6, cliente.getNr());
            stmt.setString(7, cliente.getComplemento());
            stmt.setString(8, cliente.getBairro());
            stmt.setString(9, cliente.getCidade());
            stmt.setString(10, cliente.getUf());
            stmt.setString(11, cliente.getCep());
            stmt.setString(12, cliente.getTel());
            stmt.execute();
            stmt.close();
            
            System.out.println("Cliente: "+cliente.getNome()+" cadastrado com sucesso!!");
         
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "DAOCliente: " + e);
            //throw new RuntimeException("DAOCliente: " + e);
        }
    }
}
