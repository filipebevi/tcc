/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tcc.sigar.topico;


import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Flipe
 */
public class TopicoDAOHibernate implements TopicoDAO {
    
    private Session session;
    public void setSession(Session session){
        this.session=session;
    }
    
    

    
    
    
    @Override
    public void salvar(Topico topico) {
        this.session.saveOrUpdate(topico);
        
    }
    



    
    
    @Override
    public void atualizar(Topico topico) {
        this.session.update(topico);
    }
    


 
    
    
    @Override
    public void excluir(Topico topico) {
        this.session.delete(topico);
    }
    


    
    
    
    @Override
    public Topico carregar(Integer idTopico) {
        return (Topico) this.session.get(Topico.class, idTopico);
       
    }
    

  
  
    
    
    @Override
    public Topico buscarPorCodigo(Integer idTopico) {
        String hql="select u from Topico u where u.idTopico =:idTopico";
        Query consulta = (Query) this.session.createCriteria(hql);
        consulta.setInteger("Codigo", idTopico);
        return (Topico) consulta.uniqueResult();
    }
    
  
    

    
    
    @Override
    public List<Topico> listar() {
        return this.session.createCriteria(Topico.class).list();
    }
    
}
