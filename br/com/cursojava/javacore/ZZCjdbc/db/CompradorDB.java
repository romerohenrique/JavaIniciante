package br.com.cursojava.javacore.ZZCjdbc.db;

import br.com.cursojava.javacore.ZZCjdbc.classe.Comprador;
import br.com.cursojava.javacore.ZZCjdbc.com.ConexaoFactory;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CompradorDB {
    public static void save(Comprador comprador) {
        String sql = "INSERT INTO `agencia`.`comprador` (`cpf`, `nome`) VALUES ('" + comprador.getCpf() + "', '" + comprador.getNome() + "');";
        Connection conn = ConexaoFactory.getConexao();
        try {
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            ConexaoFactory.close(conn, stmt);
            System.out.println("Registro criado com sucesso");
        } catch (SQLException e) {
            ;
            e.printStackTrace();
        }
    }

    public static void delete(Comprador comprador) {
        if (comprador == null || comprador.getId() == null) {
            System.out.println("Não há registros no banco de dados");
            return;
        }
        String sql = "DELETE FROM `agencia`.`comprador` WHERE (`id` = '" + comprador.getId() + "');";
        Connection conn = ConexaoFactory.getConexao();
        try {
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            ConexaoFactory.close(conn, stmt);
            System.out.println("Registro deletado com sucesso");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void update(Comprador comprador) {
        if (comprador == null || comprador.getId() == null) {
            System.out.println("Não há registros no banco de dados");
            return;
        }
        String sql = "UPDATE `agencia`.`comprador` SET `cpf` = '" + comprador.getCpf() + "', `nome` = '" + comprador.getNome() + "' WHERE (`id` = '" + comprador.getId() + "');";
        Connection conn = ConexaoFactory.getConexao();
        try {
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            ConexaoFactory.close(conn, stmt);
            System.out.println("Registro atualizado com sucesso");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static List<Comprador> selectAll() {
        String sql = "SELECT id, cpf, nome FROM agencia.comprador;";
        Connection conn = ConexaoFactory.getConexao();
        List<Comprador> compradorList = new ArrayList<>();
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                compradorList.add(new Comprador(rs.getInt("id"), rs.getString("cpf"), rs.getString("nome")));
            }
            ConexaoFactory.close(conn, stmt, rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return compradorList;
    }

    public static List<Comprador> searchByName(String nome) {
        String sql = "SELECT id, cpf, nome FROM agencia.comprador where nome LIKE '%" + nome + "%';";
        Connection conn = ConexaoFactory.getConexao();
        List<Comprador> compradorList = new ArrayList<>();
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                compradorList.add(new Comprador(rs.getInt("id"), rs.getString("cpf"), rs.getString("nome")));
            }
            ConexaoFactory.close(conn, stmt, rs);
            return compradorList;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    // saber quantas tabelas e demias dados do BD
    public static void selectMetaData() {
        String sql = "SELECT id, cpf, nome FROM agencia.comprador;";
        Connection conn = ConexaoFactory.getConexao();
        try {
            Statement smt = conn.createStatement();
            ResultSet rs = smt.executeQuery(sql);
            ResultSetMetaData rsmd = rs.getMetaData();
            rs.next();
            int qtdColunas = rsmd.getColumnCount();
            System.out.println("Quantidade de Colunas: " + qtdColunas);
            for (int i = 1; i <= qtdColunas; i++) {
                System.out.println("Tabela: " + rsmd.getTableName(i));
                System.out.println("Nome Coluna: " + rsmd.getColumnName(i));
                System.out.println("Tamanho da Coluna: " + rsmd.getColumnDisplaySize(i));
            }
            ConexaoFactory.close(conn, smt, rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void checkDriverStatus() {
        Connection conn = ConexaoFactory.getConexao();
        try {
            DatabaseMetaData dbmd = conn.getMetaData();
            if (dbmd.supportsResultSetType(ResultSet.TYPE_FORWARD_ONLY)) {
                System.out.println("Suporta TYPE_FORWARD_ONLY");
                if (dbmd.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE)) {
                    System.out.println("e também suporta CONCUR_UPDATABLE");
                }
            }
            if (dbmd.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE)) {
                System.out.println("Suporta TYPE_SCROLL_INSENSITIVE");
                if (dbmd.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
                    System.out.println("e também suporta CONCUR_UPDATABLE");
                }
            }
            if (dbmd.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE)) {
                System.out.println("Suporta TYPE_SCROLL_SENSITIVE");
                if (dbmd.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
                    System.out.println("e também suporta CONCUR_UPDATABLE");
                }
            }
            ConexaoFactory.close(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void testTypeScroll() {
        String sql = "SELECT id, cpf, nome FROM agencia.comprador;";
        Connection conn = ConexaoFactory.getConexao();
        try {
            Statement smt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = smt.executeQuery(sql);
            if (rs.last()) {
                System.out.println("ultima linha: " + new Comprador(rs.getInt("id"), rs.getString("cpf"), rs.getString("nome")));
                System.out.println("Número da ultima linha: " + rs.getRow());
            }
            System.out.println("Retornou para a primeiroa linha? " + rs.first());
            System.out.println("Primeira linha: " + rs.getRow());
            rs.absolute(2);
            System.out.println("Linha 2 " + new Comprador(rs.getInt("id"), rs.getString("cpf"), rs.getString("nome")));
            rs.relative(-1);
            System.out.println("Linha 1 " + new Comprador(rs.getInt("id"), rs.getString("cpf"), rs.getString("nome")));
            System.out.println("é a ultima linha? " + rs.isLast());
            System.out.println("é a primeira linha ?" + rs.isFirst());
            System.out.println("--------------------------------------------------");
            while (rs.previous()) {
                System.out.println(new Comprador(rs.getInt("id"), rs.getString("cpf"), rs.getString("nome")));
            }
            ConexaoFactory.close(conn, smt, rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void upDateNamesLowerCase() {
        String sql = "SELECT id, cpf, nome FROM agencia.comprador;";
        Connection conn = ConexaoFactory.getConexao();
        try {
            DatabaseMetaData dbmd = conn.getMetaData();


            Statement smt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = smt.executeQuery(sql);
            System.out.println("Permete atualiza? " + dbmd.updatesAreDetected(ResultSet.TYPE_SCROLL_INSENSITIVE));
            System.out.println("Permete inserir? " + dbmd.insertsAreDetected(ResultSet.TYPE_SCROLL_INSENSITIVE));
            System.out.println("Permete deletar? " + dbmd.deletesAreDetected(ResultSet.TYPE_SCROLL_INSENSITIVE));
            while (rs.next()) {
                rs.updateString("nome", rs.getString("nome").toLowerCase());
                rs.updateRow();
            }
            rs.beforeFirst();
            while (rs.next()) {
                System.out.println(rs.getString("nome"));
            }
            rs.absolute(2);
            String nome = rs.getString("nome");
            rs.moveToInsertRow();
            rs.updateString("nome", nome.toUpperCase());
            rs.updateString("cpf", "990.887.665-43");
            rs.insertRow();
            rs.moveToCurrentRow();
            System.out.println(rs.getString("nome" + " linha " + rs.getRow()));
            rs.absolute(6);
            rs.deleteRow();
            ConexaoFactory.close(conn, smt, rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //evita que o usuário acesse dados que não deve ser mostrados
    public static List<Comprador> searchByNamePreparedStatement(String nome) {
        String sql = "SELECT id, cpf, nome FROM agencia.comprador where nome LIKE ?;";
        Connection conn = ConexaoFactory.getConexao();
        List<Comprador> compradorList = new ArrayList<>();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, "%" + nome + "%");

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                compradorList.add(new Comprador(rs.getInt("id"), rs.getString("cpf"), rs.getString("nome")));
            }

            ConexaoFactory.close(conn, ps, rs);
            return compradorList;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void updatePreparedStatent(Comprador comprador) {
        if (comprador == null || comprador.getId() == null) {
            System.out.println("Não há registros no banco de dados");
            return;
        }
        String sql = "UPDATE `agencia`.`comprador` SET `cpf` = ?, `nome` = ? WHERE `id` = ?";
        Connection conn = ConexaoFactory.getConexao();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, comprador.getCpf());
            ps.setString(2, comprador.getNome());
            ps.setInt(3, comprador.getId());
            ps.executeUpdate();
            ConexaoFactory.close(conn, ps);
            System.out.println("Registro atualizado com sucesso");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static List<Comprador> searchByNameRowSet(String nome) {
        String sql = "SELECT id, cpf, nome FROM agencia.comprador where nome LIKE ?;";
        JdbcRowSet jrs = ConexaoFactory.getRowSetConnection();
        List<Comprador> compradorList = new ArrayList<>();
        try {
            jrs.setCommand(sql);
            jrs.setString(1, "%" + nome + "%");
            jrs.execute();
            while (jrs.next()) {
                compradorList.add(new Comprador(jrs.getInt("id"), jrs.getString("cpf"), jrs.getString("nome")));
            }
            ConexaoFactory.close(jrs);
            return compradorList;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void updateRowSet(Comprador comprador) {
        if (comprador == null || comprador.getId() == null) {
            System.out.println("Não há registros no banco de dados");
            return;
        }
        String sql = "UPDATE `agencia`.`comprador` SET `cpf` = ?, `nome` = ? WHERE `id` = ?";
        JdbcRowSet jrs = ConexaoFactory.getRowSetConnection();
        try {
            jrs.setCommand(sql);
            jrs.setString(1, comprador.getCpf());
            jrs.setString(2, comprador.getNome());
            jrs.setInt(3, comprador.getId());
            jrs.execute();
            ConexaoFactory.close(jrs);
            System.out.println("Registro atualizado com sucesso");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
