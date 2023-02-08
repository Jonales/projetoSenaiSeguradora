/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.seguradora.controller;

import br.com.seguradora.controller.helper.HelperUsuario;
import br.com.seguradora.modelo.ModeloUsuario;
import br.com.seguradora.dao.DaoUsuario;
import br.com.seguradora.view.FrmLogin;
import br.com.seguradora.view.FrmMenu;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Jon
 */
public class ControllerUsuario {

    private final FrmLogin view;
    private HelperUsuario helper;

    public ControllerUsuario(FrmLogin view) {
        this.view = view;
        this.helper = new HelperUsuario(view);

    }

    public void entrarNoSistema() throws SQLException {

        //Pegar os dados da view
        ModeloUsuario login = helper.obterModelo();

        //Pesquisar o  usuario no banco
        DaoUsuario daoUsuario = new DaoUsuario();
        ResultSet usuaruioAutenticado = daoUsuario.autenticacaoLogin(login);

        //Se o usuario da view que o usuario vindo do banco, vamos direcionar para a tela inicial
        if (usuaruioAutenticado.next()) {
            //navegar para menu principal
            FrmMenu menu = new FrmMenu();
            menu.setVisible(true);
            view.dispose();
        } else { 
            //senão vamos mostrar uma mensagem "Usúario ou senha invalidos"
            view.exibeMensagem("Usuario ou senha invalidos");
            this.helper.limparTela();
        }
        System.out.println("Login Digitado: " + view.getjTextLogin().getText());
        System.out.println("Senha digitado: " + view.getjPasswordSenha().getText());

    }

    public void sairDoSistema() {
        this.view.dispose();
    }

}
