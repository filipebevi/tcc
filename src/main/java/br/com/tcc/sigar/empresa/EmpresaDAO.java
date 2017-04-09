/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tcc.sigar.empresa;

import java.util.List;

/**
 *
 * @author Flipe
 */
public interface EmpresaDAO {

    void atualizar(Empresa empresa);

    Empresa buscarPorCodigo(Integer idEmpresa);

    Empresa carregar(Integer idEmpresa);

    void excluir(Empresa empresa);

    List<Empresa> listar();

    void salvar(Empresa empresa);
    
}
