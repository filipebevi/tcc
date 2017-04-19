/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tcc.sigar.web;

import br.com.tcc.sigar.participante.Participante;
import br.com.tcc.sigar.participante.ParticipanteRN;
import br.com.tcc.sigar.reuniao.Reuniao;
import br.com.tcc.sigar.reuniao.ReuniaoRN;
import br.com.tcc.sigar.tarefa.Tarefa;
import br.com.tcc.sigar.topico.Topico;
import br.com.tcc.sigar.topico.TopicoRN;
import java.util.ArrayList;

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
public class ReuniaoBean {
    
    private Reuniao reuniao = new Reuniao();
    
    private List<Reuniao> lista;
    
    private List<Tarefa> tarefas;
    
    private List<Topico> topicos;
    
    private List<Participante> participantes;
    
    private Topico topico = new Topico();
    

    
    
    public String novo(){
        
        this.reuniao = new Reuniao();
        
        this.topico = new Topico();
        this.topicos = new ArrayList();
        
        
        return "cadastrarreuniao";
    }
    
    public String salvar(){
        ReuniaoRN reuniaoRN = new ReuniaoRN();
        reuniaoRN.salvar(this.reuniao);
        Messages.addGlobalInfo("Reuniao cadastrada com sucesso");
        //System.out.println(this.empresa.getNome());
        return "reuniao";
        
        
    }
    
    public void adicionar(){
        
        System.out.println(topico.getAssunto());
        
        this.topicos.add(this.topico);
        System.out.println(this.topicos.size());
    }

    public List<Reuniao> getLista() {
       if(this.lista==null){
            ReuniaoRN reuniaoRN = new ReuniaoRN();
            this.lista=reuniaoRN.listar();
       }
        
        return this.lista;
    }

    public List<Participante> getParticipantes() {
        if(this.participantes==null){
            ParticipanteRN participanteRN = new ParticipanteRN();
            this.participantes=participanteRN.listar();
       }
        
        return this.participantes;
    }

    public List<Topico> getTopicos() {
        return this.topicos;
    }
    
    
    
    
    
    
    public String editar(){
        return "cadastrarreuniao";
    }
    
   public String excluir(){
       ReuniaoRN reuniaoRN=new ReuniaoRN();
       reuniaoRN.excluir(this.reuniao);
       this.lista=null;
       return null;
   }

    public Reuniao getReuniao() {
        return reuniao;
    }

    public void setReuniao(Reuniao reuniao) {
        this.reuniao = reuniao;
    }

    public Topico getTopico() {
        return topico;
    }

    public void setTopico(Topico topico) {
        this.topico = topico;
    }
    
    
    
}
