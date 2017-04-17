/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tcc.sigar.acompanhamento;


import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Flipe
 */
public class AcompanhamentoDAOHibernate implements AcompanhamentoDAO {
    
    private Session session;
    public void setSession(Session session){
        this.session=session;
    }
    
    
    
    @Override
    public void salvar(Acompanhamento acompanhamento) {
        this.session.saveOrUpdate(acompanhamento);
        
    }
    

    
    @Override
    public void atualizar(Acompanhamento acompanhamento) {
        this.session.update(acompanhamento);
    }
    

    
    @Override
    public void excluir(Acompanhamento acompanhamento) {
        this.session.delete(acompanhamento);
    }
    

    
    @Override
    public Acompanhamento carregar(Integer idAcompanhamento) {
        return (Acompanhamento) this.session.get(Acompanhamento.class, idAcompanhamento);
       
    }
    

    
    @Override
    public Acompanhamento buscarPorCodigo(Integer idAcompanhamento) {
        String hql="select u from Acompanhamento u where u.idAcompanhamento =:idAcompanhamento";
        Query consulta = (Query) this.session.createCriteria(hql);
        consulta.setInteger("Codigo", idAcompanhamento);
        return (Acompanhamento) consulta.uniqueResult();
    }
    
  
    
    @Override
    public List<Acompanhamento> listar() {
        return this.session.createCriteria(Acompanhamento.class).list();
    }
    
}
