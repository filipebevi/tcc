/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tcc.sigar.web;



import br.com.tcc.sigar.empresa.Empresa;
import br.com.tcc.sigar.empresa.EmpresaRN;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


/**
 *
 * @author Flipe
 */
@ManagedBean
@RequestScoped
public class EmpresaBean {
    
    private Empresa empresa = new Empresa();
    private List<Empresa> lista;

 
    
    
    
   
    
 
    
    public String novo(){
        this.empresa = new Empresa();
        return "cadastrarempresa";
    }
    
    public String salvar(){
        EmpresaRN empresaRN = new EmpresaRN();
        empresaRN.salvar(this.empresa);
        
        //System.out.println(this.empresa.getNome());
        return "empresa";
        
        
    }

    public List<Empresa> getLista() {
       if(this.lista==null){
            EmpresaRN empresaRN = new EmpresaRN();
            this.lista=empresaRN.listar();
       }
        
        return this.lista;
    }
    
    
    
    public String editar(){
        return "cadastrarempresa";
    }
    
   public String excluir(){
       EmpresaRN empresaRN=new EmpresaRN();
       empresaRN.excluir(this.empresa);
       this.lista=null;
       return null;
   }
   

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
    
}
