/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tcc.sigar.cidade;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Flipe
 */
public class CidadeDAOJdbc implements CidadeDAO {

    private Session session;

    public void setSession(Session session) {
        this.session = session;
    }

    @Override
    public void salvar(Cidade cidade) {

        try {
            String url = "jdbc:mysql://localhost:3306/sigarbd"; //Nome da base de dados
            String user = "root"; //nome do usuário do MySQL
            String password = "filipe"; //senha do MySQL

            Connection conexao = null;
            conexao = DriverManager.getConnection(url, user, password);

            String sql = "INSERT INTO cidade (nome,sobrenome,idade,salario) VALUES ('Mario','Corleone','28','2322.39')";
//Prepara a instrução SQL
            PreparedStatement ps = conexao.prepareStatement(sql);
//Executa a instrução SQL
            ps.execute();

        } catch (SQLException e) {
        }

    }

    @Override
    public void atualizar(Cidade cidade) {
        this.session.update(cidade);
    }

    @Override
    public void excluir(Cidade cidade) {
        this.session.delete(cidade);
    }

    @Override
    public Cidade carregar(Integer idCidade) {
        return (Cidade) this.session.get(Cidade.class, idCidade);

    }

    @Override
    public Cidade buscarPorCodigo(Integer idCidade) {
        String hql = "select u from Cidade u where u.idCodigo =:idCodigo";
        Query consulta = (Query) this.session.createCriteria(hql);
        consulta.setInteger("Codigo", idCidade);
        return (Cidade) consulta.uniqueResult();
    }

    @Override
    public List<Cidade> listar() {
        return this.session.createCriteria(Cidade.class).list();
    }

}
