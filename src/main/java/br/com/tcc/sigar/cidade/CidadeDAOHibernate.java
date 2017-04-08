/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tcc.sigar.cidade;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Flipe
 */
public class CidadeDAOHibernate implements CidadeDAO{
    
    private Session session;
    public void setSession(Session session){
        this.session=session;
    }
    
    
    @Override
    public void salvar(Cidade cidade) {
        this.session.saveOrUpdate(cidade);
        
    }
    

    @Override
    public void atualizar(Cidade cidade) {
        this.session.update(cidade);
    }
    

    @Override
    public void excluir(Cidade cidade) {
        this.session.delete(cidade);
    }
    

    @Override
    public Cidade carregar(Integer idCidade) {
        return (Cidade) this.session.get(Cidade.class, idCidade);
       
    }
    

    @Override
    public Cidade buscarPorCodigo(Integer idCidade) {
        String hql="select u from Cidade u where u.idCodigo =:idCodigo";
        Query consulta = (Query) this.session.createCriteria(hql);
        consulta.setInteger("Codigo", idCidade);
        return (Cidade) consulta.uniqueResult();
    }
    
  
    @Override
    public List<Cidade> Listar() {
        return this.session.createCriteria(Cidade.class).list();
    }
}
