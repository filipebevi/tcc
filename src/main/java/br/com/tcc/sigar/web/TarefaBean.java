/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tcc.sigar.web;


import br.com.tcc.sigar.tarefa.TarefaRN;
import br.com.tcc.sigar.tarefa.Tarefa;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.omnifaces.util.Messages;

/**
 *
 * @author Flipe
 */
@ManagedBean
@RequestScoped
public class TarefaBean {
    
    private Tarefa tarefa = new Tarefa();
    private List<Tarefa> lista;
    

    
    
    public String novo(){
        
        this.tarefa = new Tarefa();
        
        return "cadastrartarefa";
    }
    
    public String salvar(){
        TarefaRN tarefaRN = new TarefaRN();
        tarefaRN.salvar(this.tarefa);
        Messages.addGlobalInfo("Tarefa cadastrada com sucesso");
        //System.out.println(this.tarefa.getNome());
        return "tarefa";
        
        
    }

    public List<Tarefa> getLista() {
       if(this.lista==null){
            TarefaRN tarefaRN = new TarefaRN();
            this.lista=tarefaRN.listar();
       }
        
        return this.lista;
    }
    
    
    
    public String editar(){
        return "cadastrartarefa";
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
    
}
