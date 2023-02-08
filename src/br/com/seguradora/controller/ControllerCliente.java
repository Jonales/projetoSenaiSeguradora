/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.seguradora.controller;

import br.com.seguradora.controller.helper.HelperCliente;
import br.com.seguradora.dao.DaoCliente;
import br.com.seguradora.modelo.ModeloCliente;
import br.com.seguradora.view.FrmCliente;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author jonatas.meireles
 */
public class ControllerCliente {
    
    private DaoCliente dao;
    private final FrmCliente view;
    private HelperCliente helper;

    public ControllerCliente(FrmCliente view) {
        this.view = view;
        this.dao = new DaoCliente();
        this.helper = new HelperCliente(view);

    }
    
        public void cadastrarCliente() throws SQLException {

        //Pegar os dados da view
        ModeloCliente cliente = helper.obterCliente();

        //Inserir Cliente no banco
        dao.insert(cliente);     
    }
    
}
