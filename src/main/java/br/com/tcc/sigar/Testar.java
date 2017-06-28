/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tcc.sigar;

import br.com.tcc.sigar.cidade.Cidade;
import br.com.tcc.sigar.cidade.CidadeRN;
import br.com.tcc.sigar.tarefa.Tarefa;
import br.com.tcc.sigar.tarefa.TarefaRN;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.primefaces.expression.impl.ThisExpressionResolver;

/**
 *
 * @author Flipe
 */
public class Testar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here

        String url = "jdbc:mysql://localhost:3306/sigarbd"; //Nome da base de dados
        String user = "root"; //nome do usuário do MySQL
        String password = "filipe"; //senha do MySQL

        Connection conexao = null;
        conexao = DriverManager.getConnection(url, user, password);

        System.out.println("Conectado!");

        conexao.close();

    }

}
