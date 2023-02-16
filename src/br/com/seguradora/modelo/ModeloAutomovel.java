/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.seguradora.modelo;

/**
 *
 * @author Jon
 */
public class ModeloAutomovel {
    
    private String renavam;
    private String placa;
    private String fabricante;
    private String modelo;
    private String anomodelo;
    private String anofabricacao;

    public ModeloAutomovel(String renavam, String placa, String fabricante, String modelo, String anomodelo, String anofabricacao) {
        this.renavam = renavam;
        this.placa = placa;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.anomodelo = anomodelo;
        this.anofabricacao = anofabricacao;
    }

    public String getRenavam() {
        return renavam;
    }

    public void setRenavam(String renavam) {
        this.renavam = renavam;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAnomodelo() {
        return anomodelo;
    }

    public void setAnomodelo(String anomodelo) {
        this.anomodelo = anomodelo;
    }

    public String getAnofabricacao() {
        return anofabricacao;
    }

    public void setAnofabricacao(String anofabricacao) {
        this.anofabricacao = anofabricacao;
    }
    
    
}
