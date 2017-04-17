/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tcc.sigar.util;

import br.com.tcc.sigar.acompanhamento.AcompanhamentoDAO;
import br.com.tcc.sigar.acompanhamento.AcompanhamentoDAOHibernate;
import br.com.tcc.sigar.cidade.CidadeDAO;
import br.com.tcc.sigar.cidade.CidadeDAOHibernate;
import br.com.tcc.sigar.departamento.DepartamentoDAO;
import br.com.tcc.sigar.departamento.DepartamentoDAOHibernate;
import br.com.tcc.sigar.empresa.EmpresaDAO;
import br.com.tcc.sigar.empresa.EmpresaDAOHibernate;
import br.com.tcc.sigar.participante.ParticipanteDAO;
import br.com.tcc.sigar.participante.ParticipanteDAOHibernate;
import br.com.tcc.sigar.reuniao.ReuniaoDAO;
import br.com.tcc.sigar.reuniao.ReuniaoDAOHibernate;
import br.com.tcc.sigar.tarefa.TarefaDAO;
import br.com.tcc.sigar.tarefa.TarefaDAOHibernate;
import br.com.tcc.sigar.topico.TopicoDAO;
import br.com.tcc.sigar.topico.TopicoDAOHibernate;

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
    
     public static ParticipanteDAO criarParticipanteDAO(){
         ParticipanteDAOHibernate participanteDAO=new ParticipanteDAOHibernate();
        participanteDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
        return participanteDAO;
    }
     
     public static AcompanhamentoDAO criarAcompanhamentoDAO(){
         AcompanhamentoDAOHibernate acompanhamentoDAO=new AcompanhamentoDAOHibernate();
        acompanhamentoDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
        return acompanhamentoDAO;
    }
    
      public static ReuniaoDAO criarReuniaoDAO(){
          ReuniaoDAOHibernate reuniaoDAO=new ReuniaoDAOHibernate();
        reuniaoDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
        return reuniaoDAO;
    }
      
      public static TopicoDAO criarTopicoDAO(){
          TopicoDAOHibernate topicoDAO=new TopicoDAOHibernate();
        topicoDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
        return topicoDAO;
    }
      
      public static TarefaDAO criarTarefaDAO(){
          TarefaDAOHibernate tarefaDAO=new TarefaDAOHibernate();
        tarefaDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
        return tarefaDAO;
    }
}
