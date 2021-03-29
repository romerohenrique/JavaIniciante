package br.com.cursojava.javacore.ZZCjdbc.db;

import br.com.cursojava.javacore.ZZCjdbc.classe.Comprador;
import br.com.cursojava.javacore.ZZCjdbc.com.ConexaoFactory;

import javax.xml.soap.SOAPConnectionFactory;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CompradorDB {
    public void salvar(Comprador comprador) {
        String sql = "INSERT INTO `agencia`.`comprador` (`cpf`, `nome`) VALUES ('" + comprador.getCpf() + "', '" + comprador.getNome() + "');";
        Connection conn = ConexaoFactory.getConexao();
        try {
            Statement stmt = conn.createStatement();
            System.out.println(stmt.executeUpdate(sql));
            ConexaoFactory.close(conn, stmt);
        } catch (SQLException e) {
            ;
            e.printStackTrace();
        }
    }
}
