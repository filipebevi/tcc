/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tcc.sigar.participante;

import br.com.tcc.sigar.participante.Participante;
import br.com.tcc.sigar.participante.ParticipanteDAO;
import br.com.tcc.sigar.util.DAOFactory;
import java.util.List;

/**
 *
 * @author Flipe
 */
public class ParticipanteRN {
    
    private ParticipanteDAO participanteDAO;
    
    public ParticipanteRN(){
        this.participanteDAO = DAOFactory.criarParticipanteDAO();
    }
    
    public Participante carregar(Integer idParticipante){
        return this.participanteDAO.carregar(idParticipante);
    }
    
    public Participante buscarPorCodigo(Integer idParticipante){
        return this.participanteDAO.buscarPorCodigo(idParticipante);
    }
    
    public void salvar(Participante participante){
        this.participanteDAO.salvar(participante);
    
    }
    
    public void excluir(Participante participante){
        this.participanteDAO.excluir(participante);
    }
    
    public List<Participante> listar(){
        return this.participanteDAO.listar();
    }
    
    public List<Funcionario> listarFuncionario(){
        return this.participanteDAO.listarFuncionario();
    }
    
      public List<Convidado> listarConvidado(){
        return this.participanteDAO.listarConvidado();
    }
    
}
