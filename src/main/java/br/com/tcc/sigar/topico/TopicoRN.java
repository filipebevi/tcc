/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tcc.sigar.topico;

import br.com.tcc.sigar.util.DAOFactory;
import java.util.List;

/**
 *
 * @author Flipe
 */
public class TopicoRN {
    
    private TopicoDAO topicoDAO;
    
    public TopicoRN(){
        this.topicoDAO = DAOFactory.criarTopicoDAO();
    }
    
    public Topico carregar(Integer idTopico){
        return this.topicoDAO.carregar(idTopico);
    }
    
    public Topico buscarPorCodigo(Integer idTopico){
        return this.topicoDAO.buscarPorCodigo(idTopico);
    }
    
    public void salvar(Topico topico){
        this.topicoDAO.salvar(topico);
    
    }
    
    public void excluir(Topico topico){
        this.topicoDAO.excluir(topico);
    }
    
    public List<Topico> listar(){
        return this.topicoDAO.listar();
    }
    
}
