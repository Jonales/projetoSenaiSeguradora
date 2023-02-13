/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.seguradora.controller;

import br.com.seguradora.view.FrmCliente;
import br.com.seguradora.view.FrmMenu;
import br.com.seguradora.view.jInternalFrame.JifCliente;
import java.awt.event.ComponentListener;
import java.beans.PropertyVetoException;
import javax.swing.JOptionPane;

//import 
/**
 *
 * @author Jon
 */
public class ControllerMenu {
    private final FrmMenu view;
   
    
    /**
     *
     * @param view
     */
    public ControllerMenu (FrmMenu view){
        this.view = view;
    }

    
    public void Cliente(){
        System.out.println("Chamou ControllerMenu 'Cliente'.");
        FrmCliente cad = new FrmCliente();
        cad.setVisible(true);
        //this.view.NewJInternalFrame;
    }
    
    public void PesquisarCliente() throws PropertyVetoException{
        System.out.println("Chamou ControllerMenu 'PesquisarCliente'.");
        JifCliente i = new JifCliente();
        view.add(i, this);
        i.setVisible(true);
    }
    
    public void Automovel(){
        System.out.println("Chamou ControllerMenu 'Automovel'.");

    }
    
    public void Ocorrencia(){
        System.out.println("Chamou ControllerMenu 'Ocorrencia'.");

    }
    
    public void Relatorio(){
        System.out.println("Chamou ControllerMenu 'Relatorio'.");

    }
    
    
    public void OpcaoMenuSobre(){
        JOptionPane.showMessageDialog(view, "Projeto feito no curso \n'Desenvolvimento JAVA', \npara o senai!");
    }
    
    public void OpcaoMenuAjuda(){
        JOptionPane.showMessageDialog(view, "Autor: Jônatas Meireles"
                                        + "\nE-mail: jonatas.mei@outlook.com");
    }
}
