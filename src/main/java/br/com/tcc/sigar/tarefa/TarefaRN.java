/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tcc.sigar.tarefa;


import br.com.tcc.sigar.util.DAOFactory;
import java.util.List;

/**
 *
 * @author Flipe
 */
public class TarefaRN {
    
    private TarefaDAO tarefaDAO;
    
    public TarefaRN(){
        this.tarefaDAO = DAOFactory.criarTarefaDAO();
    }
    
    public Tarefa carregar(Integer idTarefa){
        return this.tarefaDAO.carregar(idTarefa);
    }
    
    public Tarefa buscarPorCodigo(Integer idTarefa){
        return this.tarefaDAO.buscarPorCodigo(idTarefa);
    }
    
    public void salvar(Tarefa tarefa){
        this.tarefaDAO.salvar(tarefa);
    
    }
    
    public void excluir(Tarefa tarefa){
        this.tarefaDAO.excluir(tarefa);
    }
    
    public List<Tarefa> listar(){
        return this.tarefaDAO.listar();
    }
    
}
