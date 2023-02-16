/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.seguradora.controller;

import br.com.seguradora.controller.helper.HelperOcorrencia;
import br.com.seguradora.dao.DaoOcorrencia;
import br.com.seguradora.view.FrmOcorrencia;



/**
 *
 * @author Jon
 */
public class ControllerOcorrencia {
    private DaoOcorrencia dao;
    private FrmOcorrencia view;
    private HelperOcorrencia helper;
    
    public ControllerOcorrencia (FrmOcorrencia view){
        this.view = view;
    }
}
