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
import java.sql.ResultSet;

/**
 *
 * @author jonatas.meireles
 */
public class DaoCliente {
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
    
    private void remover(ModeloCliente cliente) {
        conn = new ConnectionFactory().getConnection();

        int confirma = JOptionPane.showConfirmDialog(null, "Deseja  remover ?", "ATENÇÃO", JOptionPane.YES_NO_OPTION);

        if (confirma == JOptionPane.YES_NO_OPTION) {
            String sql = "DELETE FROM e1cliente WHERE codigo=?";

            try {
                stmt = conn.prepareStatement(sql);
                stmt.setString(1, txtCodigo.getText());
                stmt.executeUpdate();

                JOptionPane.showMessageDialog(null, "Cliente removido com sucesso!!!!");
                set(null);
                txtRG.setText(null);
                txtCpf.setText(null);
                txtTelRes.setText(null);
                txtTelCel.setText(null);
                txtbai.setText(null);
                txtCep.setText(null);
                txtLou.setText(null);
                txtCid.setText(null);
                cbbUF.setSelectedItem(null);
                txtCom.setText(null);
                txtNr.setText(null);
                txtCodigo.setText(null);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);

            }
        }
    }
    
     private void atualizar(ModeloCliente cliente) {
         conn = new ConnectionFactory().getConnection();

        String sql = "UPDATE e1cliente SET NOME=?,RG=?,CPF=?,TELRES=?,TELCEL=?,"
                + "BAIRRO=?,CEP=?,LOGRADOURO=?,CIDADE=?,UF=?,COMPLEMENTO=?,"
                + "NR=? WHERE CODIGO=?";

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, txtNome.getText());
            stmt.setString(2, txtRG.getText());
            stmt.setString(3, txtCpf.getText());
            stmt.setString(4, txtTelRes.getText());
            stmt.setString(5, txtTelCel.getText());
            stmt.setString(6, txtbai.getText());
            stmt.setString(7, txtCep.getText());
            stmt.setString(8, txtLou.getText());
            stmt.setString(9, txtCid.getText());
            stmt.setString(10, cbbUF.getSelectedItem().toString());
            stmt.setString(11, txtCom.getText());
            stmt.setString(12, txtNr.getText());

            pst.setString(13, txtCodigo.getText());
            System.out.println(pst);
            int atualizado = pst.executeUpdate();

            if (atualizado == 1) {
                JOptionPane.showMessageDialog(null, "Cliente atualizado com sucesso!");

                txtNome.setText(null);
                txtRG.setText(null);
                txtCpf.setText(null);
                txtTelRes.setText(null);
                txtTelCel.setText(null);
                txtbai.setText(null);
                txtCep.setText(null);
                txtLou.setText(null);
                txtCid.setText(null);
                cbbUF.setSelectedItem(null);
                txtCom.setText(null);
                txtNr.setText(null);
                txtCodigo.setText(null);

            } else {
                JOptionPane.showMessageDialog(null, "Cliente não encontrado");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }
     
     private void consultar(ModeloCliente cliente) {
        conn = new ConnectionFactory().getConnection();
        String sql = "SELECT * FROM e1cliente WHERE CODIGO=?";

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, txtCodigo.getText());
            
            rs = pst.executeQuery();

            if (rs.next()) {
                txtNome.setText(rs.getString("NOME"));
                txtRG.setText(rs.getString("RG"));
                txtCpf.setText(rs.getString("CPF"));
                txtTelRes.setText(rs.getString("TELRES"));
                txtTelCel.setText(rs.getString("TELCEL"));
                txtbai.setText(rs.getString("BAIRRO"));
                txtCep.setText(rs.getString("CEP"));
                txtLou.setText(rs.getString("LOGRADOURO"));
                txtCid.setText(rs.getString("CIDADE"));
                cbbUF.setSelectedItem(rs.getString("UF"));
                txtCom.setText(rs.getString("COMPLEMENTO"));
                txtNr.setText(rs.getString("NR"));
            } else {
                JOptionPane.showMessageDialog(null, "Cliente não encontrado");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }
}