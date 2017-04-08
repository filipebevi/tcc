/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tcc.sigar.util;

import br.com.tcc.sigar.cidade.CidadeDAO;
import br.com.tcc.sigar.cidade.CidadeDAOHibernate;

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
    
}
