package com.senac.toystore.DAO;

import com.senac.toystore.model.Cliente;
import com.senac.toystore.utils.GerenciadorConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ClienteDAO {

    public static boolean salvar(Cliente cliente) {
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        try {
            //Abrir Conexao
            conexao = GerenciadorConexao.abrirConexao();

            //Preparar comando sql
            instrucaoSQL = conexao.prepareStatement("INSERT INTO cliente (nome,cpf,data_nasc,sexo,estado_civil,email,endereco,numero,complemento,num_telefone) values(?,?,?,?,?,?,?,?,?,?)");

            //Executar comando SQL
            instrucaoSQL.setString(1, cliente.getNome());
            instrucaoSQL.setString(2, cliente.getCpf());
            instrucaoSQL.setDate(3, new java.sql.Date(cliente.getDataNasc().getTime()));
            instrucaoSQL.setString(4, String.valueOf(cliente.getSexo()));
            instrucaoSQL.setString(5, cliente.getEstadoCivil());
            instrucaoSQL.setString(6, cliente.getEmail());
            instrucaoSQL.setString(7, cliente.getEndereco());
            instrucaoSQL.setInt(8, cliente.getNumero());
            instrucaoSQL.setString(9, cliente.getcomplemento());
            instrucaoSQL.setString(10, cliente.getTelefone());

            int linhaAfetada = instrucaoSQL.executeUpdate();

            if (linhaAfetada > 0) {
                retorno = true;
            } else {
                retorno = false;
            }

        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
        } finally {
            //Libero os recursos da memória
            try {
                if (instrucaoSQL != null) {
                    instrucaoSQL.close();
                }
                GerenciadorConexao.fecharConexao();

            } catch (SQLException ex) {
                System.out.println("Não foi possivel fechar a conexão com banco ou fechar o comando sql");
            }
        }
        return retorno;
    }

    public static boolean alterar(Cliente cliente) {
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        try {
            //Abrir Conexao
            conexao = GerenciadorConexao.abrirConexao();

            //Preparar comando sql
            instrucaoSQL = conexao.prepareStatement("UPDATE cliente set nome = ?, cpf = ?, data_nasc = ?, sexo = ?, estado_civil = ?, email = ?, endereco = ?, numero = ?,complemento = ?, num_telefone = ? WHERE id_cliente = ?");

            //Executar comando SQL
            instrucaoSQL.setString(1, cliente.getNome());
            instrucaoSQL.setString(2, cliente.getCpf());
            instrucaoSQL.setDate(3, new java.sql.Date(cliente.getDataNasc().getTime()));
            instrucaoSQL.setString(4, String.valueOf(cliente.getSexo()));
            instrucaoSQL.setString(5, cliente.getEstadoCivil());
            instrucaoSQL.setString(6, cliente.getEmail());
            instrucaoSQL.setString(7, cliente.getEndereco());
            instrucaoSQL.setInt(8, cliente.getNumero());
            instrucaoSQL.setString(9, cliente.getcomplemento());
            instrucaoSQL.setString(10, cliente.getTelefone());
            instrucaoSQL.setInt(11, cliente.getId());

            int linhaAfetada = instrucaoSQL.executeUpdate();

            if (linhaAfetada > 0) {
                retorno = true;
                System.out.println("Atualizado com sucesso");
            } else {
                retorno = false;
            }

        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
        } finally {
            //Libero os recursos da memória
            try {
                if (instrucaoSQL != null) {
                    instrucaoSQL.close();
                }
                GerenciadorConexao.fecharConexao();

            } catch (SQLException ex) {
                System.out.println("Não foi possivel fechar a conexão com banco ou fechar o comando sql");
            }
        }
        return retorno;
    }

    public static ArrayList<Cliente> listar() {
        ArrayList<Cliente> lista = new ArrayList<>();
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        try {
            //Abrir Conexao
            conexao = GerenciadorConexao.abrirConexao();

            //Preparar comando sql
            instrucaoSQL = conexao.prepareStatement("SELECT * FROM cliente");

            //Executar comando SQL
            ResultSet rs = instrucaoSQL.executeQuery();

            if (rs != null) {
                while (rs.next()) {
                    Cliente cliente = new Cliente();
                    cliente.setId(rs.getInt("id_cliente"));
                    cliente.setNome(rs.getString("nome"));
                    cliente.setCpf(rs.getString("cpf"));
                    cliente.setDataNasc(rs.getDate("data_nasc"));
                    cliente.setSexo(rs.getString("sexo"));
                    cliente.setEstadoCivil(rs.getString("estado_civil"));
                    cliente.setEmail(rs.getString("email"));
                    cliente.setRua(rs.getString("endereco"));
                    cliente.setNumero(rs.getInt("numero"));
                    cliente.setcomplemento(rs.getString("complemento"));
                    cliente.setTelefone(rs.getString("num_telefone"));
                    lista.add(cliente);
                }
            }

        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
        } finally {
            //Libero os recursos da memória
            try {
                if (instrucaoSQL != null) {
                    instrucaoSQL.close();
                }
                GerenciadorConexao.fecharConexao();

            } catch (SQLException ex) {
                System.out.println("Não foi possivel fechar a conexão com banco ou fechar o comando sql");
            }
        }
        return lista;
    }

    public static Cliente listar(int id) {
        Cliente cliente = new Cliente();
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        try {
            //Abrir Conexao
            conexao = GerenciadorConexao.abrirConexao();

            //Preparar comando sql
            instrucaoSQL = conexao.prepareStatement("SELECT * FROM cliente WHERE id_cliente = ?");

            instrucaoSQL.setInt(1, id);

            //Executar comando SQL
            ResultSet rs = instrucaoSQL.executeQuery();

            if (rs != null) {
                while (rs.next()) {
                    cliente.setId(rs.getInt("id_cliente"));
                    cliente.setNome(rs.getString("nome"));
                    cliente.setCpf(rs.getString("cpf"));
                    cliente.setDataNasc(rs.getDate("data_nasc"));
                    cliente.setSexo(rs.getString("sexo"));
                    cliente.setEstadoCivil(rs.getString("estado_civil"));
                    cliente.setEmail(rs.getString("email"));
                    cliente.setRua(rs.getString("endereco"));
                    cliente.setNumero(rs.getInt("numero"));
                    cliente.setcomplemento(rs.getString("complemento"));
                    cliente.setTelefone(rs.getString("num_telefone"));
                }
            }

        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
        } finally {
            //Libero os recursos da memória
            try {
                if (instrucaoSQL != null) {
                    instrucaoSQL.close();
                }
                GerenciadorConexao.fecharConexao();

            } catch (SQLException ex) {
                System.out.println("Não foi possivel fechar a conexão com banco ou fechar o comando sql");
            }
        }
        return cliente;
    }
    
        public static ArrayList<Cliente> listar(String nome, String cpf) {
        ArrayList<Cliente> clientes = new ArrayList();
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        try {
            //Abrir Conexao
            conexao = GerenciadorConexao.abrirConexao();

            //Preparar comando sql
            instrucaoSQL = conexao.prepareStatement("SELECT * FROM cliente WHERE nome LIKE ? AND cpf LIKE ?");

            instrucaoSQL.setString(1, "%" + nome + "%");
            instrucaoSQL.setString(2, "%" + cpf  + "%");

            //Executar comando SQL
            ResultSet rs = instrucaoSQL.executeQuery();

            if (rs != null) {
                while (rs.next()) {
                    Cliente cliente = new Cliente();
                    cliente.setId(rs.getInt("id_cliente"));
                    cliente.setNome(rs.getString("nome"));
                    cliente.setCpf(rs.getString("cpf"));
                    cliente.setDataNasc(rs.getDate("data_nasc"));
                    cliente.setSexo(rs.getString("sexo"));
                    cliente.setEstadoCivil(rs.getString("estado_civil"));
                    cliente.setEmail(rs.getString("email"));
                    cliente.setRua(rs.getString("endereco"));
                    cliente.setNumero(rs.getInt("numero"));
                    cliente.setcomplemento(rs.getString("complemento"));
                    cliente.setTelefone(rs.getString("num_telefone"));
                    clientes.add(cliente);
                }
            }

        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
        } finally {
            //Libero os recursos da memória
            try {
                if (instrucaoSQL != null) {
                    instrucaoSQL.close();
                }
                GerenciadorConexao.fecharConexao();

            } catch (SQLException ex) {
                System.out.println("Não foi possivel fechar a conexão com banco ou fechar o comando sql");
            }
        }
        return clientes;
    }

    public static boolean excluir(int id) {
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        try {
            //Abrir Conexao
            conexao = GerenciadorConexao.abrirConexao();

            //Preparar comando sql
            instrucaoSQL = conexao.prepareStatement("DELETE FROM cliente WHERE id_cliente = ?");

            instrucaoSQL.setInt(1, id);

            //Executar comando SQL
            int linhasAfetadas = instrucaoSQL.executeUpdate();

            if (linhasAfetadas > 0) {
                retorno = true;
            } else {
                retorno = false;
            }

        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
        } finally {
            //Libero os recursos da memória
            try {
                if (instrucaoSQL != null) {
                    instrucaoSQL.close();
                }
                GerenciadorConexao.fecharConexao();

            } catch (SQLException ex) {
                System.out.println("Não foi possivel fechar a conexão com banco ou fechar o comando sql");
            }
        }
        return retorno;
    }
}
