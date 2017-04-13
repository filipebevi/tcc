/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tcc.sigar.departamento;

import java.util.List;

/**
 *
 * @author Flipe
 */
public interface DepartamentoDAO {

    void atualizar(Departamento departamento);

    Departamento buscarPorCodigo(Integer idDepartamento);

    Departamento carregar(Integer idDepartamento);

    void excluir(Departamento departamento);

    List<Departamento> listar();

    void salvar(Departamento departamento);
    
}
