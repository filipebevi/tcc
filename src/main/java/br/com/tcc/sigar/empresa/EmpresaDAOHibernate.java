/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tcc.sigar.empresa;


import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Flipe
 */
public class EmpresaDAOHibernate implements EmpresaDAO  {
    
    private Session session;
    public void setSession(Session session){
        this.session=session;
    }
    
    

    
    @Override
    public void salvar(Empresa empresa) {
        this.session.saveOrUpdate(empresa);
        
    }
    



    @Override
    public void atualizar(Empresa empresa) {
        this.session.update(empresa);
    }
    


 
    @Override
    public void excluir(Empresa empresa) {
        this.session.delete(empresa);
    }
    


    
    @Override
    public Empresa carregar(Integer idEmpresa) {
        return (Empresa) this.session.get(Empresa.class, idEmpresa);
       
    }
    

  
  
    @Override
    public Empresa buscarPorCodigo(Integer idEmpresa) {
        String hql="select u from Empresa u where u.idEmpresa =:idEmpresa";
        Query consulta = (Query) this.session.createCriteria(hql);
        consulta.setInteger("Codigo", idEmpresa);
        return (Empresa) consulta.uniqueResult();
    }
    
  
    

    @Override
    public List<Empresa> listar() {
        return this.session.createCriteria(Empresa.class).list();
    }
    
}
