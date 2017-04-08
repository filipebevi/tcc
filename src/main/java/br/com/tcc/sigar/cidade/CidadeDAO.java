/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tcc.sigar.cidade;

import java.util.List;

/**
 *
 * @author Flipe
 */
public interface CidadeDAO {

    List<Cidade> listar();

    void atualizar(Cidade cidade);

    Cidade buscarPorCodigo(Integer idCidade);

    Cidade carregar(Integer idCidade);

    void excluir(Cidade cidade);

    void salvar(Cidade cidade);
    
}
