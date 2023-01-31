/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.seguradora.dao;

import br.com.seguradora.connection.ConnectionFactory;
import br.com.seguradora.modelo.ModeloLogin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Jon
 */
public class DaoLogin {
    private Connection connection;
    
    public DaoLogin(){
       this.connection = new ConnectionFactory().getConnection();
    }
    
    /**
     * Insere um usuario dentro do banco de dados
     * @param usuario exige que seja passado um objeto do tipo usuario
     */
    public void insert(ModeloLogin usuario){
        String sql = "insert into seguradora.login (cargo, nome, login, senha) VALUES(?,?,?,?)";
        try {
           PreparedStatement stmt = connection.prepareStatement(sql);
           stmt.setString(1, usuario.getCargo());
           stmt.setString(2, usuario.getNome());
           stmt.setString(3, usuario.getLogin());
           stmt.setString(4, usuario.getSenha());
           stmt.execute();
           stmt.close();

        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
    
    /**
     * Atualiza um Objeto no banco de dados
     * @param usuario
     * @return 
     */
    public boolean update(ModeloLogin usuario){
        /*
        for (int i = 0; i < banco.usuario.size(); i++) {
            if(idSaoIguais(Banco.usuario.get(i),usuario)){
                Banco.usuario.set(i, usuario);
                return true;
            }
        }*/
        return false;      
    }
    
    /**
     * Deleta um objeto do banco de dados pelo id do usuario passado
     * @param usuario
     * @return 
     */
    public boolean delete(ModeloLogin usuario){
        /*
        for (ModeloLogin usuarioLista : Banco.usuario) {
            if(idSaoIguais(usuarioLista,usuario)){
                Banco.usuario.remove(usuarioLista);
                return true;
            }
        }*/
        return false;
    }
    
    /**
     * Retorna um arraylist com todos os usuarios do banco de dados
     * @return uma lista com todos os registros do banco
     */
    /*public ArrayList<ModeloLogin> selectAll(){
        return Banco.usuario;
    }
    */
    /**
     * Retorna um Objeto do tipo usuario se a funcao encontrar o usuario passado como parâmetro no banco, para considerar sao usado nome e senha
     * @param usuario
     * @return Usuario encontrado no banco de dados
     */
    public ModeloLogin selectPorNomeESenha(ModeloLogin usuario){
        /*
        for (ModeloLogin usuarioLista : Banco.usuario) {
            if(nomeESenhaSaoIguais(usuarioLista,usuario)){
                return usuarioLista;
            }
        }*/
        return null;
    }

    /**
     * Recebe dois objetos e verifica se são iguais verificando o nome e senha
     * @param usuario
     * @param usuarioAPesquisar
     * @return verdadeiro caso sejam iguais e falso caso nao forem iguais
     */
    private boolean nomeESenhaSaoIguais(ModeloLogin usuario, ModeloLogin usuarioAPesquisar) {
        return usuario.getLogin().equals(usuarioAPesquisar.getLogin()) && usuario.getSenha().equals(usuarioAPesquisar.getSenha());
    }

    /**
     * Compara se dois objetos tem a propriedade id igual
     * @param usuario
     * @param usuarioAComparar
     * @return verdadeiro caso os id forem iguais e falso se nao forem
     */
    private boolean idSaoIguais(ModeloLogin usuario, ModeloLogin usuarioAComparar) {
        return usuario.getId() ==  usuarioAComparar.getId();
    }
    
}
