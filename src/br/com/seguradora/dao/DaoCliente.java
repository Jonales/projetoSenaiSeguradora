/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.seguradora.dao;

import br.com.seguradora.connection.ConnectionFactory;
import br.com.seguradora.controller.helper.HelperCliente;
import br.com.seguradora.modelo.ModeloCliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

/**
 *
 * @author jonatas.meireles
 */
public class DaoCliente {
    private HelperCliente helper;
    Connection conn;
    ResultSet rs;
    PreparedStatement stmt ;
    
    
    public void inserir(ModeloCliente cliente) { //Metodo finalizado para a inserção de clientes no banco de dados.
        conn = new ConnectionFactory().getConnection();
       
        try {
            String sql = "insert into seguradora.e1cliente (nome, rg, cpf, logradouro, nr, complemento, bairro, cidade, uf, cep, tel) VALUES(?,?,?,?,?,?,?,?,?,?,?)";
            
            stmt = conn.prepareStatement(sql);
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
    
    public void remover(ModeloCliente cliente) { //Modelo de Exclusão de cliente
        conn = new ConnectionFactory().getConnection();

        int confirma = JOptionPane.showConfirmDialog(null, "Deseja  remover ?", "ATENÇÃO", JOptionPane.YES_NO_OPTION);

        if (confirma == JOptionPane.YES_NO_OPTION) {
            String sql = "DELETE FROM e1cliente WHERE codigo=?";

            try {
                stmt = conn.prepareStatement(sql);
                stmt.setString(1, cliente.getId());
                stmt.executeUpdate();

                JOptionPane.showMessageDialog(null, "Cliente removido com sucesso!!!!");
                
                helper.limparTela();
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);

            }
        }
    }
    
    public void atualizar(ModeloCliente cliente) {
         conn = new ConnectionFactory().getConnection();

        String sql = "UPDATE e1cliente SET nome = ?, rg = ?, cpf = ?, logradouro = ?, nr = ?, complemento = ?,"
                + " bairro = ?, cidade = ?, uf = ?, cep = ?, tel = ? WHERE CODIGO = ?";

        try {
            stmt = conn.prepareStatement(sql);
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
            stmt.setString(12, cliente.getId());
            
            System.out.println(stmt);
            
            int atualizado = stmt.executeUpdate();

            if (atualizado == 1) {
                JOptionPane.showMessageDialog(null, "Cliente atualizado com sucesso!");
                
                helper.setarModelo(cliente);

            } else {
                JOptionPane.showMessageDialog(null, "Cliente não encontrado");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }
     
    public void consultar(ModeloCliente cliente) {//Modelo para consultar Cliente
        conn = new ConnectionFactory().getConnection();
        String sql = "SELECT * FROM e1cliente WHERE CODIGO=?";

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, cliente.getId());
            
            rs = stmt.executeQuery();

            if (rs.next()) {
                cliente.setNome       (rs.getString("NOME"));
                cliente.setRg         (rs.getString("RG"));
                cliente.setCpf        (rs.getString("CPF"));
                cliente.setTel        (rs.getString("TEL"));
                cliente.setBairro     (rs.getString("BAIRRO"));
                cliente.setCep        (rs.getString("CEP"));
                cliente.setLogradouro (rs.getString("LOGRADOURO"));
                cliente.setCidade     (rs.getString("CIDADE"));
                cliente.setUf         (rs.getString("UF"));
                cliente.setComplemento(rs.getString("COMPLEMENTO"));
                cliente.setNr         (rs.getString("NR"));
                
                helper.setarModelo(cliente);
                
            } else {
                JOptionPane.showMessageDialog(null, "Cliente não encontrado");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}