/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.seguradora.controller;

import br.com.seguradora.connection.ConnectionFactory;
import br.com.seguradora.controller.helper.HelperCliente;
import br.com.seguradora.dao.DaoCliente;
import br.com.seguradora.modelo.ModeloCliente;
import br.com.seguradora.view.FrmCliente;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;

/**
 *
 * @author jonatas.meireles
 */
public class ControllerCliente {
    
    private DaoCliente dao;
    private FrmCliente view;
    private HelperCliente helper;
    Connection conn;

    public ControllerCliente(FrmCliente view) {
        this.view = view;
        this.dao = new DaoCliente();
        this.helper = new HelperCliente(view);
    }
    
    public void cadastrarCliente() throws SQLException {
        //Pegar os dados da view
        ModeloCliente cliente = helper.obterCliente();

        //Inserir Cliente no banco
        dao.inserir(cliente); 
        
        //limpa dados preenchidos
        helper.limparTela();
    }
    
    public void pesquisarCliente() throws SQLException{
        //Pegar os dados da view
        ModeloCliente cliente = helper.obterCliente();

        //Pesquisa Cliente no banco
        dao.consultar(cliente);
        
        if(cliente != null){
            //navegar para menu principal
            helper.setarModelo(cliente);
            System.out.println("Entrou na condicao verdadeira - ControllerHelper");
            //limpa dados preenchidos
            helper.limparTela();
        }else
           System.out.println("Erro - caiu na condição de erro - ControllerHelper");
            //limpa dados preenchidos
            helper.limparTela();
    }
    
    public void atualizarCliente() throws SQLException{
        //Pegar os dados da view
        ModeloCliente cliente = helper.obterCliente();

        //Atualiza Cliente no banco
        dao.atualizar(cliente);
        
        //limpa dados preenchidos
        helper.limparTela();
    }
        
    public void apagarCliente() throws SQLException{
        //Pegar os dados da view
        ModeloCliente cliente = helper.obterCliente();

        //Apaga Cliente no banco
        dao.remover(cliente); 
        
        //limpa dados preenchidos
        helper.limparTela();
    }
    
    public void relCliente () throws SQLException{
        int confirma = JOptionPane.showConfirmDialog(null,"Confirma impressão?","",JOptionPane.YES_NO_OPTION);
        String caminho = "RelatorioCliente.jasper"; ///c:/RelatorioCliente.jasper
        conn = new ConnectionFactory().getConnection();
        
        if (confirma == JOptionPane.YES_OPTION){
        try {
        net.sf.jasperreports.engine.JasperPrint print = net.sf.jasperreports.engine.JasperFillManager.fillReport(caminho,null,conn);
        net.sf.jasperreports.view.JasperViewer.viewReport(print,false);
        } catch (JRException e) {
        JOptionPane.showMessageDialog(null,e);
        }
    }
    }
    
}
