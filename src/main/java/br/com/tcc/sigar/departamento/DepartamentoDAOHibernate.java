/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tcc.sigar.departamento;


import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Flipe
 */
public class DepartamentoDAOHibernate implements DepartamentoDAO {
    
    private Session session;
    public void setSession(Session session){
        this.session=session;
    }
    
    

    
  
    @Override
    public void salvar(Departamento departamento) {
        this.session.saveOrUpdate(departamento);
        
    }
    




    @Override
    public void atualizar(Departamento departamento) {
        this.session.update(departamento);
    }
    


 

    @Override
    public void excluir(Departamento departamento) {
        this.session.delete(departamento);
    }
    


    

    @Override
    public Departamento carregar(Integer idDepartamento) {
        return (Departamento) this.session.get(Departamento.class, idDepartamento);
       
    }
    

  
  

    @Override
    public Departamento buscarPorCodigo(Integer idDepartamento) {
        String hql="select u from Departamento u where u.idDepartamento =:idDepartamento";
        Query consulta = (Query) this.session.createCriteria(hql);
        consulta.setInteger("Codigo", idDepartamento);
        return (Departamento) consulta.uniqueResult();
    }
    
  
    

   
    @Override
    public List<Departamento> listar() {
        return this.session.createCriteria(Departamento.class).list();
    }
    
}
