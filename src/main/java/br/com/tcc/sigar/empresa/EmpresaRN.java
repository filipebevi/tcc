/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tcc.sigar.empresa;


import br.com.tcc.sigar.util.DAOFactory;
import java.util.List;

/**
 *
 * @author Flipe
 */
public class EmpresaRN {
    
    private EmpresaDAO empresaDAO;
    
    public EmpresaRN(){
        this.empresaDAO = DAOFactory.criarEmpresaDAO();
    }
    
    public Empresa carregar(Integer idEmpresa){
        return this.empresaDAO.carregar(idEmpresa);
    }
    
    public Empresa buscarPorCodigo(Integer idEmpresa){
        return this.empresaDAO.buscarPorCodigo(idEmpresa);
    }
    
    public void salvar(Empresa empresa){
        this.empresaDAO.salvar(empresa);
    
    }
    
    public void excluir(Empresa empresa){
        this.empresaDAO.excluir(empresa);
    }
    
    public List<Empresa> listar(){
        return this.empresaDAO.listar();
    }
    
}
