/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.seguradora.controller;

import br.com.seguradora.controller.helper.HelperAutomovel;
import br.com.seguradora.dao.DaoAutomovel;
import br.com.seguradora.view.FrmAutomovel;

/**
 *
 * @author Jon
 */
public class ControllerAutomovel {
    private DaoAutomovel dao;
    private FrmAutomovel view;
    private HelperAutomovel helper;
    
    public ControllerAutomovel (FrmAutomovel view){
           this.view = view;
           this.dao = new DaoAutomovel();
           //this.helper = new HelperAutomovel(view);
    }
    
    
}
