/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tcc.sigar.web;


import br.com.tcc.sigar.acompanhamento.Acompanhamento;
import br.com.tcc.sigar.tarefa.TarefaRN;
import br.com.tcc.sigar.tarefa.Tarefa;
import br.com.tcc.sigar.topico.Topico;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import org.omnifaces.util.Messages;

/**
 *
 * @author Flipe
 */
@ManagedBean
@SessionScoped
public class TarefaBean implements Serializable{
    
    private Tarefa tarefa = new Tarefa();
    private List<Tarefa> lista;
    private Acompanhamento acompanhamento = new Acompanhamento();
    
    

    
    
    public String novo(){
        
        this.tarefa=new Tarefa();
        
        
        
        
        return "cadastrartarefa";
    }
    
    public String salvar(){
        TarefaRN tarefaRN = new TarefaRN();
        
        
        tarefaRN.salvar(this.tarefa);
        Messages.addGlobalInfo("Tarefa cadastrada com sucesso");
        this.lista=null;
        //System.out.println(this.tarefa.getNome());
        return "tarefa";
        
        
    }

    public List<Tarefa> getLista() {
     
            TarefaRN tarefaRN = new TarefaRN();
            this.lista=tarefaRN.listar();
       
        
        return this.lista;
    }
    
    
    
    public String editar(){
        this.acompanhamento=new Acompanhamento();
        return "editartarefa";
    }
    
    public void adicionar(){
        if (this.tarefa.getIdAcompanhamento() == null) {
            this.tarefa.setIdAcompanhamento(new ArrayList());
        }

        this.tarefa.getIdAcompanhamento().add(acompanhamento);
        acompanhamento=new Acompanhamento();
    }
    
   public String excluir(){
       TarefaRN tarefaRN=new TarefaRN();
       tarefaRN.excluir(this.tarefa);
       this.lista=null;
       return null;
   }

    public Tarefa getTarefa() {
        return tarefa;
    }

    public void setTarefa(Tarefa tarefa) {
        this.tarefa = tarefa;
    }

    public Acompanhamento getAcompanhamento() {
        return acompanhamento;
    }

    public void setAcompanhamento(Acompanhamento acompanhamento) {
        this.acompanhamento = acompanhamento;
    }
    
    
    
}
