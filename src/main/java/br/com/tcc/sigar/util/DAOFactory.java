/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tcc.sigar.util;

import br.com.tcc.sigar.cidade.CidadeDAO;
import br.com.tcc.sigar.cidade.CidadeDAOHibernate;
import br.com.tcc.sigar.departamento.DepartamentoDAO;
import br.com.tcc.sigar.departamento.DepartamentoDAOHibernate;
import br.com.tcc.sigar.empresa.EmpresaDAO;
import br.com.tcc.sigar.empresa.EmpresaDAOHibernate;

/**
 *
 * @author Flipe
 */
public class DAOFactory {
    
    public static CidadeDAO criarCidadeDAO(){
        CidadeDAOHibernate cidadeDAO=new CidadeDAOHibernate();
        cidadeDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
        return cidadeDAO;
    }
    
    public static EmpresaDAO criarEmpresaDAO(){
        EmpresaDAOHibernate empresaDAO=new EmpresaDAOHibernate();
        empresaDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
        return empresaDAO;
    }
    
     public static DepartamentoDAO criarDepartamentoDAO(){
         DepartamentoDAOHibernate departamentoDAO=new DepartamentoDAOHibernate();
        departamentoDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
        return departamentoDAO;
    }
    
}
