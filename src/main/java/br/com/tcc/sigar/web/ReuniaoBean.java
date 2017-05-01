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
import java.io.Serializable;

import java.util.ArrayList;
import java.util.HashMap;

import java.util.List;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import org.omnifaces.util.Messages;
import org.primefaces.context.RequestContext;

/**
 *
 * @author Flipe
 */
@ManagedBean
@ViewScoped
public class ReuniaoBean implements Serializable{

    private Reuniao reuniao = new Reuniao();

    private List<Participante> participantes;

    private Topico topico = new Topico();

    private Tarefa tarefa = new Tarefa();

    public String novo() {

        this.reuniao = new Reuniao();

        this.topico = new Topico();

        this.tarefa = new Tarefa();

        return "cadastrarreuniao";
    }

    public String salvar() {
        ReuniaoRN reuniaoRN = new ReuniaoRN();

        //reuniao.setIdTopico(topicos);
        reuniaoRN.salvar(this.reuniao);
        Messages.addGlobalInfo("Reuniao cadastrada com sucesso");
        //System.out.println(this.empresa.getNome());
        return "reuniao";

    }

    public void adicionarTopico() {

        if (this.reuniao.getIdTopico() == null) {
            this.reuniao.setIdTopico(new ArrayList());
        }

        this.reuniao.getIdTopico().add(topico);
        topico=new Topico();

        
    }
    
    public void adicionarTarefa() {

        if (this.reuniao.getIdTarefa()== null) {
            this.reuniao.setIdTarefa(new ArrayList());
        }
        tarefa.setConclusao(null);
        this.reuniao.getIdTarefa().add(tarefa);
        tarefa=new Tarefa();

        
    }

   

    public List<Participante> getParticipantes() {
        if (this.participantes == null) {
            ParticipanteRN participanteRN = new ParticipanteRN();
            this.participantes = participanteRN.listar();
        }

        return this.participantes;
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

    public Tarefa getTarefa() {
        return tarefa;
    }

    public void setTarefa(Tarefa tarefa) {
        this.tarefa = tarefa;
    }

}
