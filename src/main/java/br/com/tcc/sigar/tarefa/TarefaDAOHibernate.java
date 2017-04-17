/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tcc.sigar.tarefa;


import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Flipe
 */
public class TarefaDAOHibernate implements TarefaDAO {
    
    private Session session;
    public void setSession(Session session){
        this.session=session;
    }
    
    

    
    
    
    @Override
    public void salvar(Tarefa tarefa) {
        this.session.saveOrUpdate(tarefa);
        
    }
    



    
    
    @Override
    public void atualizar(Tarefa tarefa) {
        this.session.update(tarefa);
    }
    


 
    
    
    @Override
    public void excluir(Tarefa tarefa) {
        this.session.delete(tarefa);
    }
    


    
    
    
    @Override
    public Tarefa carregar(Integer idTarefa) {
        return (Tarefa) this.session.get(Tarefa.class, idTarefa);
       
    }
    

  
  
    
    
    @Override
    public Tarefa buscarPorCodigo(Integer idTarefa) {
        String hql="select u from Tarefa u where u.idTarefa =:idTarefa";
        Query consulta = (Query) this.session.createCriteria(hql);
        consulta.setInteger("Codigo", idTarefa);
        return (Tarefa) consulta.uniqueResult();
    }
    
  
    

    
    
    @Override
    public List<Tarefa> listar() {
        return this.session.createCriteria(Tarefa.class).list();
    }
    
}
