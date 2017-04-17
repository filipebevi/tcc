/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tcc.sigar.reuniao;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Flipe
 */
public class ReuniaoDAOHibernate implements ReuniaoDAO {
    
    private Session session;
    public void setSession(Session session){
        this.session=session;
    }
    
    

    
    
    @Override
    public void salvar(Reuniao reuniao) {
        this.session.saveOrUpdate(reuniao);
        
    }
    



    
    @Override
    public void atualizar(Reuniao reuniao) {
        this.session.update(reuniao);
    }
    


 
    
    @Override
    public void excluir(Reuniao reuniao) {
        this.session.delete(reuniao);
    }
    


    
    
    @Override
    public Reuniao carregar(Integer idReuniao) {
        return (Reuniao) this.session.get(Reuniao.class, idReuniao);
       
    }
    

  
  
    
    @Override
    public Reuniao buscarPorCodigo(Integer idReuniao) {
        String hql="select u from Reuniao u where u.idReuniao =:idReuniao";
        Query consulta = (Query) this.session.createCriteria(hql);
        consulta.setInteger("Codigo", idReuniao);
        return (Reuniao) consulta.uniqueResult();
    }
    
  
    

    
    @Override
    public List<Reuniao> listar() {
        return this.session.createCriteria(Reuniao.class).list();
    }
    
}
