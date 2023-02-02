/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.seguradora.controller;

import br.com.seguradora.controller.helper.HelperLogin;
import br.com.seguradora.modelo.ModeloLogin;
import br.com.seguradora.dao.DaoLogin;
import br.com.seguradora.view.FrmLogin;
import br.com.seguradora.view.FrmSplash;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Jon
 */
public class ControllerLogin {

    private final FrmLogin view;
    private HelperLogin Helper;

    public ControllerLogin(FrmLogin view) {
        this.view = view;
        this.Helper = new HelperLogin(view);

    }

    public void entrarNoSistema() throws SQLException {

        //Pegar os dados da view
        ModeloLogin login = Helper.obterModelo();

        //Pesquisar o  usuario no banco
        DaoLogin daoLogin = new DaoLogin();
        ResultSet usuaruioAutenticado = daoLogin.autenticacaoLogin(login);

        //Se o usuario da view que o usuario vindo do banco, vamos direcionar para a tela inicial
        if (usuaruioAutenticado.next()) {
            //navegar para menu principal
            FrmSplash menu = new FrmSplash();
            menu.setVisible(true);
            this.view.dispose();
        } else { 
            //senão vamos mostrar uma mensagem "Usúario ou senha invalidos"
            view.exibeMensagem("Usuario ou senha invalidos");
            this.Helper.limparTela();
        }
        System.out.println("Login Digitado: " + view.getjTextLogin().getText());
        System.out.println("Senha digitado: " + view.getjPasswordSenha().getText());

    }

    public void sairDoSistema() {
        this.view.dispose();
    }

}
