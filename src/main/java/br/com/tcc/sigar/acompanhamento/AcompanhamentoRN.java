/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tcc.sigar.acompanhamento;


import br.com.tcc.sigar.util.DAOFactory;
import java.util.List;

/**
 *
 * @author Flipe
 */
public class AcompanhamentoRN {
    
    private AcompanhamentoDAO acompanhamentoDAO;
    
    public AcompanhamentoRN(){
        this.acompanhamentoDAO = DAOFactory.criarAcompanhamentoDAO();
    }
    
    public Acompanhamento carregar(Integer idAcompanhamento){
        return this.acompanhamentoDAO.carregar(idAcompanhamento);
    }
    
    public Acompanhamento buscarPorCodigo(Integer idAcompanhamento){
        return this.acompanhamentoDAO.buscarPorCodigo(idAcompanhamento);
    }
    
    public void salvar(Acompanhamento acompanhamento){
        this.acompanhamentoDAO.salvar(acompanhamento);
    
    }
    
    public void excluir(Acompanhamento acompanhamento){
        this.acompanhamentoDAO.excluir(acompanhamento);
    }
    
    public List<Acompanhamento> listar(){
        return this.acompanhamentoDAO.listar();
    }
    
    
}
