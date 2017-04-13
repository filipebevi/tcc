/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tcc.sigar.departamento;


import br.com.tcc.sigar.util.DAOFactory;
import java.util.List;

/**
 *
 * @author Flipe
 */
public class DepartamentoRN {
    
    private DepartamentoDAO departamentoDAO;
    
    public DepartamentoRN(){
        this.departamentoDAO = DAOFactory.criarDepartamentoDAO();
    }
    
    public Departamento carregar(Integer idDepartamento){
        return this.departamentoDAO.carregar(idDepartamento);
    }
    
    public Departamento buscarPorCodigo(Integer idDepartamento){
        return this.departamentoDAO.buscarPorCodigo(idDepartamento);
    }
    
    public void salvar(Departamento departamento){
        this.departamentoDAO.salvar(departamento);
    
    }
    
    public void excluir(Departamento departamento){
        this.departamentoDAO.excluir(departamento);
    }
    
    public List<Departamento> listar(){
        return this.departamentoDAO.listar();
    }
    
}
