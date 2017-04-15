/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tcc.sigar.web;



import br.com.tcc.sigar.participante.Funcionario;


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
public class FuncionarioBean {
    
    private Funcionario funcionario = new Funcionario();
    
    private List<Funcionario> lista;
    

    
    
    public String novo(){
        
        this.funcionario = new Funcionario();
        
        return "cadastrarfuncionario";
    }
    
    public String salvar(){
        ParticipanteRN participanteRN = new ParticipanteRN();
        participanteRN.salvar(this.funcionario);
        Messages.addGlobalInfo("Funcionario: "+funcionario.getNome()+" cadastrado com sucesso");
        //System.out.println(this.empresa.getNome());
        return "funcionario";
        
        
    }

    public List<Funcionario> getLista() {
       if(this.lista==null){
            ParticipanteRN participanteRN = new ParticipanteRN();
            this.lista=participanteRN.listarFuncionario();
       }
        
        return this.lista;
    }
    
    
    
    public String editar(){
        return "cadastrarfuncionario";
    }
    
   public String excluir(){
       ParticipanteRN participanteRN=new ParticipanteRN();
       participanteRN.excluir(this.funcionario);
       this.lista=null;
       return null;
   }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario participante) {
        this.funcionario = participante;
    }

    
    
    
}
