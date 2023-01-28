/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.seguradora.controller;

import br.com.seguradora.controller.helper.HelperLogin;
import br.com.seguradora.modelo.ModeloLogin;
import br.com.seguradora.modelo.dao.DaoLogin;
import br.com.seguradora.view.FrmLogin;
import br.com.seguradora.view.FrmSplash;
/**
 *
 * @author Jon
 */
public class ControllerLogin {
    
    private final FrmLogin view;
    //private loginHelper Helper;
    
    public ControllerLogin (FrmLogin view){
        this.view = view;
        //this.Helper = new HelperLogin(view);
        
            }
    
    public void entrarNoSistema(){
        
        //Pegar os dados da view
        ModeloLogin login = HelperLogin.obterModelo();
              
        //Pesquisar o  usuario no banco
        DaoLogin daoLogin = new DaoLogin();
        ModeloLogin usuaruioAutenticado = daoLogin.selectPorNomeESenha(usuario);
        
        //Se o usuario da view que o usuario vindo do banco, vamos direcionar para a tela inicial
        
        if(usuaruioAutenticado != null){
            //navegar para menu principal
            FrmSplash menu = new FrmSplash();
            menu.setVisible(true);
            this.view.dispose();
        }else
            //senão vamos mostrar uma mensagem "Usúario ou senha invalidos"
            view.exibeMensagem("Usuario ou senha invalidos");
    }
    
}
