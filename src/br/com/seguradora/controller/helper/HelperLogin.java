/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.seguradora.controller.helper;

import br.com.seguradora.modelo.ModeloLogin;
import br.com.seguradora.view.FrmLogin;

/**
 *
 * @author jonatas.meireles
 */
public class HelperLogin {
    private final FrmLogin view;
    
    public HelperLogin(FrmLogin viewer) {
        this.view = viewer;
    }
    
    public ModeloLogin obterModelo(){
        String login = view.getjTextLogin().getText();
        String senha = view.getjPasswordSenha().getText();
        ModeloLogin modelo = new ModeloLogin(0, login, senha);
        return modelo; 
    }
    
    public void setarModelo(ModeloLogin modelo){
        String login = modelo.getLogin();
        String senha = modelo.getSenha();
        
        view.getjTextLogin().setText(login);
        view.getjPasswordSenha().setText(senha); 
    }
    
    public void limparTela(){
        view.getjTextLogin().setText("");
        view.getjPasswordSenha().setText(""); 
    } 
    
}
