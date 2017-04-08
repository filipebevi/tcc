/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tcc.sigar.cidade;

import br.com.tcc.sigar.util.DAOFactory;
import java.util.List;

/**
 *
 * @author Flipe
 */
public class CidadeRN {
    
    private CidadeDAO cidadeDAO;
    
    public CidadeRN(){
        this.cidadeDAO = DAOFactory.criarCidadeDAO();
    }
    
    public Cidade carregar(Integer idCidade){
        return this.cidadeDAO.carregar(idCidade);
    }
    
    public Cidade buscarPorLogin(Integer idCidade){
        return this.cidadeDAO.buscarPorCodigo(idCidade);
    }
    
    public void salvar(Cidade cidade){
        this.cidadeDAO.salvar(cidade);
    
    }
    
    public void excluir(Cidade cidade){
        this.cidadeDAO.excluir(cidade);
    }
    
    public List<Cidade> listar(){
        return this.cidadeDAO.Listar();
    }
}
