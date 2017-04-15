/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tcc.sigar.participante;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Flipe
 */
public class ParticipanteDAOHibernate implements ParticipanteDAO {
    
    private Session session;
    public void setSession(Session session){
        this.session=session;
    }
    
    

    
    
    @Override
    public void salvar(Participante participante) {
        this.session.saveOrUpdate(participante);
        
    }
    



   
    @Override
    public void atualizar(Participante participante) {
        this.session.update(participante);
    }
    


 
 
    @Override
    public void excluir(Participante participante) {
        this.session.delete(participante);
    }
    


    

    @Override
    public Participante carregar(Integer idParticipante) {
        return (Participante) this.session.get(Participante.class, idParticipante);
       
    }
    

  
  
 
    @Override
    public Participante buscarPorCodigo(Integer idParticipante) {
        String hql="select u from Participante u where u.idParticipante =:idParticipante";
        Query consulta = (Query) this.session.createCriteria(hql);
        consulta.setInteger("Codigo", idParticipante);
        return (Participante) consulta.uniqueResult();
    }
    
  
    

  
    @Override
    public List<Participante> listar() {
        return this.session.createCriteria(Participante.class).list();
    }
    
    @Override
    public List<Funcionario> listarFuncionario() {
        return this.session.createCriteria(Funcionario.class).list();
    }
    
    @Override
    public List<Convidado> listarConvidado() {
        return this.session.createCriteria(Convidado.class).list();
    }
    
}
