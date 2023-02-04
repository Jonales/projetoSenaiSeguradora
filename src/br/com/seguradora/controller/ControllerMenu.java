/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.seguradora.controller;

import br.com.seguradora.view.FrmCliente;
import br.com.seguradora.view.FrmMenu;
import javax.swing.JOptionPane;

//import 
/**
 *
 * @author Jon
 */
public class ControllerMenu {
    private final FrmMenu view;
    
    public ControllerMenu (FrmMenu view){
        this.view = view;
    }
    
    public void CadastrarCliente(){
        System.out.println("Chamou ControllerMenu");
        FrmCliente cad = new FrmCliente();
        cad.setVisible(true);
        //this.view.NewJInternalFrame;
    }
    
    public void OpcaoMenuSobre(){
        JOptionPane.showMessageDialog(view, "Projeto feito no curso 'Desenvolvimento JAVA', para o senai!");
    }
    
    public void OpcaoMenuAjuda(){
        JOptionPane.showMessageDialog(view, "Autor: Jônatas Meireles"
                                        + "E-mail: jonatas.mei@outlook.com");
    }
}
