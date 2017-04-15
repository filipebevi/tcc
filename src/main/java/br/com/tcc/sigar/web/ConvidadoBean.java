/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tcc.sigar.web;




import br.com.tcc.sigar.participante.Convidado;


import br.com.tcc.sigar.participante.ParticipanteRN;
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
public class ConvidadoBean {
    
    private Convidado convidado = new Convidado();
    
    private List<Convidado> lista;
    

    
    
    public String novo(){
        
        this.convidado = new Convidado();
        
        return "cadastrarconvidado";
    }
    
    public String salvar(){
        ParticipanteRN participanteRN = new ParticipanteRN();
        participanteRN.salvar(this.convidado);
        Messages.addGlobalInfo("Convidado: "+convidado.getNome()+" cadastrado com sucesso");
        //System.out.println(this.empresa.getNome());
        return "convidado";
        
        
    }

    public List<Convidado> getLista() {
       if(this.lista==null){
            ParticipanteRN participanteRN = new ParticipanteRN();
            this.lista=participanteRN.listarConvidado();
       }
        
        return this.lista;
    }
    
    
    
    public String editar(){
        return "cadastrarconvidado";
    }
    
   public String excluir(){
       ParticipanteRN participanteRN=new ParticipanteRN();
       participanteRN.excluir(this.convidado);
       this.lista=null;
       return null;
   }

    public Convidado getConvidado() {
        return convidado;
    }

    public void setConvidado(Convidado participante) {
        this.convidado = participante;
    }

    
    
    
}
