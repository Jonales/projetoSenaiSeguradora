/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.seguradora.controller.helper;

import br.com.seguradora.modelo.ModeloUsuario;
import br.com.seguradora.view.FrmLogin;

/**
 *
 * @author jonatas.meireles
 */
public class HelperUsuario {
    private final FrmLogin view;
    
    public HelperUsuario(FrmLogin viewer) {
        this.view = viewer;
    }
    
    public ModeloUsuario obterModelo(){
        String login = view.getjTextLogin().getText();
        String senha = view.getjPasswordSenha().getText();
        ModeloUsuario modelo = new ModeloUsuario(0, login, senha);
        return modelo; 
    }
    
    public void setarModelo(ModeloUsuario modelo){
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
