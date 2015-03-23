/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senacrs.dao;

import br.com.senacrs.bean.Pessoa;
import br.com.senacrs.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lucas
 */
public class JDBCPessoaDAO implements PessoaDAO {

    Connection con = null;
    String SQL = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public JDBCPessoaDAO() {
        this.con = ConnectionFactory.getConnection();
    }

    @Override
    public void inserir(Pessoa pessoa) {
        try {
            SQL = "INSERT INTO pessoa (nome, sobrenome, rua, bairro, cep) VALUES (?, ?, ?, ?, ?)";

            ps = con.prepareStatement(SQL);

            ps.setString(1, pessoa.getNome());
            ps.setString(2, pessoa.getSobreNome());
            ps.setString(3, pessoa.getEndereco().getRua());
            ps.setString(4, pessoa.getEndereco().getBairro());
            ps.setString(5, pessoa.getEndereco().getCep());

            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(JDBCPessoaDAO.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException("Erro ao inserir Pessoa em JDBCPessoaDAO", ex);
        } finally {
            try {
                if (ps != null && !ps.isClosed()) {
                    ps.close();
                }
                if (con != null && !con.isClosed()) {
                    con.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(JDBCPessoaDAO.class.getName()).log(Level.SEVERE, null, ex);
                throw new RuntimeException("Erro ao fechar conexão ou ps em JDBCPessoaDAO", ex);
            }
        }

    }

    @Override
    public void excluir(int id) {
        try {
            SQL = "DELETE FROM pessoa where id = ?";

            ps = con.prepareStatement(SQL);

            ps.setInt(1, id);

            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(JDBCPessoaDAO.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException("Erro ao excluir Pessoa em JDBCPessoaDAO", ex);
        } finally {
            try {
                if (ps != null && !ps.isClosed()) {
                    ps.close();
                }
                if (con != null && !con.isClosed()) {
                    con.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(JDBCPessoaDAO.class.getName()).log(Level.SEVERE, null, ex);
                throw new RuntimeException("Erro ao fechar conexão ou ps em JDBCPessoaDAO", ex);
            }
        }
    }

    @Override
    public Pessoa buscar(int id) {
        Pessoa pessoa = new Pessoa();
        try {
            SQL = "SELECT * FROM pessoa WHERE id = ?";

            ps = con.prepareStatement(SQL);

            ps.setInt(1, id);

            rs = ps.executeQuery();

            while (rs.next()) {
                pessoa.setId(rs.getInt("id"));
                pessoa.setNome(rs.getString("nome"));
                pessoa.setSobreNome(rs.getString("sobrenome"));
                pessoa.getEndereco().setRua(rs.getString("rua"));
                pessoa.getEndereco().setBairro(rs.getString("bairro"));
                pessoa.getEndereco().setCep(rs.getString("cep"));
            }

            return pessoa;
        } catch (SQLException ex) {
            Logger.getLogger(JDBCPessoaDAO.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException("Erro ao buscar Pessoa em JDBCPessoaDAO", ex);
        } finally {
            try {
                if (rs != null && !rs.isClosed()) {
                    rs.close();
                }
                if (ps != null && !ps.isClosed()) {
                    ps.close();
                }
                if (con != null && !con.isClosed()) {
                    con.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(JDBCPessoaDAO.class.getName()).log(Level.SEVERE, null, ex);
                throw new RuntimeException("Erro ao fechar conexão ou ps em JDBCPessoaDAO", ex);
            }
        }

    }

    @Override
    public void editar(Pessoa pessoa) {
        try {
            SQL = "UPDATE pessoa SET nome = ?, sobrenome = ?, rua = ?, bairro = ?, cep = ? WHERE id = ?";

            ps = con.prepareStatement(SQL);

            ps.setString(1, pessoa.getNome());
            ps.setString(2, pessoa.getSobreNome());
            ps.setString(3, pessoa.getEndereco().getRua());
            ps.setString(4, pessoa.getEndereco().getBairro());
            ps.setString(5, pessoa.getEndereco().getCep());
            ps.setInt(6, pessoa.getId());

            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(JDBCPessoaDAO.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException("Erro ao editar Pessoa em JDBCPessoaDAO", ex);
        } finally {
            try {
                if (rs != null && !rs.isClosed()) {
                    rs.close();
                }
                if (ps != null && !ps.isClosed()) {
                    ps.close();
                }
                if (con != null && !con.isClosed()) {
                    con.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(JDBCPessoaDAO.class.getName()).log(Level.SEVERE, null, ex);
                throw new RuntimeException("Erro ao fechar conexão ou ps em JDBCPessoaDAO", ex);
            }
        }

    }

    @Override
    public List<Pessoa> listar() {
        List<Pessoa> pessoas = new ArrayList<>();
        try {
            SQL = "SELECT * FROM pessoa ORDER BY id";

            ps = con.prepareStatement(SQL);

            rs = ps.executeQuery();

            while (rs.next()) {
                Pessoa pessoa = new Pessoa();

                pessoa.setId(rs.getInt("id"));
                pessoa.setNome(rs.getString("nome"));
                pessoa.setSobreNome(rs.getString("sobrenome"));
                pessoa.getEndereco().setRua(rs.getString("rua"));
                pessoa.getEndereco().setBairro(rs.getString("bairro"));
                pessoa.getEndereco().setCep(rs.getString("cep"));

                pessoas.add(pessoa);
            }
            return pessoas;
        } catch (SQLException ex) {
            Logger.getLogger(JDBCPessoaDAO.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException("Erro ao listar Pessoa em JDBCPessoaDAO", ex);
        } finally {
            try {
                if (rs != null && !rs.isClosed()) {
                    rs.close();
                }
                if (ps != null && !ps.isClosed()) {
                    ps.close();
                }
                if (con != null && !con.isClosed()) {
                    con.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(JDBCPessoaDAO.class.getName()).log(Level.SEVERE, null, ex);
                throw new RuntimeException("Erro ao fechar conexão ou ps em JDBCPessoaDAO", ex);
            }
        }

    }

}
