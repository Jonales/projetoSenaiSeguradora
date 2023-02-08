/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.seguradora.controller.helper;

import br.com.seguradora.modelo.ModeloCliente;
import br.com.seguradora.view.FrmCliente;
/**
 *
 * @author jonatas.meireles
 */
public class HelperCliente {
    private final FrmCliente view;
    
    public HelperCliente(FrmCliente viewer) {
        this.view = viewer;
    }
    
    public ModeloCliente obterCliente(){
         String id          = view.getjTCod().getText();
         String nome        = view.getjTNome().getText();
         String rg          = view.getjTRg().getText();
         String cpf         = view.getjFTCpf().getText();
         String logradouro  = view.getjTLogradouro().getText();
         String nr          = view.getjTNr().getText();
         String complemento = view.getjTComplemento().getText();
         String bairro      = view.getjTBairro().getText();
         String cidade      = view.getjTCidade().getText();
         String uf          = (String) view.getjCBUf().getSelectedItem();
         String cep         = view.getjFCep().getText();
         String tel         = view.getjTTelefone().getText();
         
         ModeloCliente modelo =  new ModeloCliente(id, nome, rg, cpf, logradouro, nr, complemento, bairro, cidade, uf, cep, tel);
         return modelo;
    }
    
    public void setarModelo(ModeloCliente modelo){
        String id          = modelo.getId();
        String nome        = modelo.getNome();
        String rg          = modelo.getRg();
        String cpf         = modelo.getCpf();
        String logradouro  = modelo.getLogradouro();
        String nr          = modelo.getNr();
        String complemento = modelo.getComplemento();
        String bairro      = modelo.getBairro();
        String cidade      = modelo.getCidade();
        String uf          = modelo.getUf();
        String cep         = modelo.getCep();
        String tel         = modelo.getTel();
         
        view.getjTCod().getText();
        view.getjTNome().getText();
        view.getjTRg().getText();
        view.getjFTCpf().getText();
        view.getjTLogradouro().getText();
        view.getjTNr().getText();
        view.getjTComplemento().getText();
        view.getjTBairro().getText();
        view.getjTCidade().getText();
        view.getjCBUf().getSelectedItem();
        view.getjFCep().getText();
        view.getjTTelefone().getText();
    }
    
    public void limparTela(){
        view.getjTCod().setText("");
        view.getjTNome().setText("");
        view.getjTRg().setText("");
        view.getjFTCpf().setText("");
        view.getjTLogradouro().setText("");
        view.getjTNr().setText("");
        view.getjTComplemento().setText("");
        view.getjTBairro().setText("");
        view.getjTCidade().setText("");
        view.getjCBUf().setSelectedIndex(0);
        view.getjFCep().setText("");
        view.getjTTelefone().setText("");
    } 
}
