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
    
    public void setarModelo(ModeloCliente cliente){
        String id          = cliente.getId();
        String nome        = cliente.getNome();
        String rg          = cliente.getRg();
        String cpf         = cliente.getCpf();
        String logradouro  = cliente.getLogradouro();
        String nr          = cliente.getNr();
        String complemento = cliente.getComplemento();
        String bairro      = cliente.getBairro();
        String cidade      = cliente.getCidade();
        String uf          = cliente.getUf();
        String cep         = cliente.getCep();
        String tel         = cliente.getTel();
         
        view.getjTCod().setText(id);
        view.getjTNome().setText(nome);
        view.getjTRg().setText(rg);
        view.getjFTCpf().setText(cpf);
        view.getjTLogradouro().setText(logradouro);
        view.getjTNr().setText(nr);
        view.getjTComplemento().setText(complemento);
        view.getjTBairro().setText(bairro);
        view.getjTCidade().setText(cidade);
        view.getjCBUf().setSelectedItem(uf);
        view.getjFCep().setText(cep);
        view.getjTTelefone().setText(tel);
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
