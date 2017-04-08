/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tcc.sigar;

import br.com.tcc.sigar.cidade.Cidade;
import br.com.tcc.sigar.cidade.CidadeRN;
import org.primefaces.expression.impl.ThisExpressionResolver;

/**
 *
 * @author Flipe
 */
public class Testar {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        CidadeRN teste=new CidadeRN();
        Cidade cuca=new Cidade();
        
        cuca.setArea(122);
        cuca.setComentario("teste");
        cuca.setNome("Recife");
        cuca.setUf("PE");
        cuca.setMetropole(true);
        
        teste.salvar(cuca);
    }
    

    
    
    
}
