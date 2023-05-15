package com.senac.toystore.DAO;

import com.senac.toystore.model.Produto;
import com.senac.toystore.utils.GerenciadorConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProdutoDAO {

    public static boolean salvar(Produto produto) {
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        try {
            //Abrir Conexao
            conexao = GerenciadorConexao.abrirConexao();

            //Preparar comando sql
            instrucaoSQL = conexao.prepareStatement("INSERT INTO produto (descricao,cod_barras,valor_venda,valor_custo,margem_lucro,categoria, foto, corredor, pratileira, quantidade) values(?,?,?,?,?,?,?,?,?,?)");

            //Executar comando SQL
            instrucaoSQL.setString(1, produto.getDescricao());
            instrucaoSQL.setString(2, produto.getCod_barras());
            instrucaoSQL.setFloat(3, produto.getValorVenda());
            instrucaoSQL.setFloat(4, produto.getValorCusto());
            instrucaoSQL.setString(5, produto.getMargemLucro());
            instrucaoSQL.setString(6, produto.getCategoria());
            instrucaoSQL.setBlob(7, produto.getFoto());
            instrucaoSQL.setString(8, produto.getCorredor());
            instrucaoSQL.setInt(9, produto.getPratileira());
            instrucaoSQL.setInt(10, produto.getQuantidade());

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

    public static boolean alterar(Produto produto) {
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        try {
            //Abrir Conexao
            conexao = GerenciadorConexao.abrirConexao();

            //Preparar comando sql
            instrucaoSQL = conexao.prepareStatement("UPDATE produto set descricao = ?, cod_barras = ?, valor_venda = ?, valor_custo = ?, margem_lucro = ?, categoria = ?, foto = ?, corredor = ?, pratileira = ?, quantidade = ? WHERE id_produto = ?");

            //Executar comando SQL
            instrucaoSQL.setString(1, produto.getDescricao());
            instrucaoSQL.setString(2, produto.getCod_barras());
            instrucaoSQL.setFloat(3, produto.getValorVenda());
            instrucaoSQL.setFloat(4, produto.getValorCusto());
            instrucaoSQL.setString(5, produto.getMargemLucro());
            instrucaoSQL.setString(6, produto.getCategoria());
            instrucaoSQL.setBlob(7, produto.getFoto());
            instrucaoSQL.setString(8, produto.getCorredor());
            instrucaoSQL.setInt(9, produto.getPratileira());
            instrucaoSQL.setInt(10, produto.getQuantidade());
            instrucaoSQL.setInt(11, produto.getId());
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

    public static ArrayList<Produto> listar() {
        ArrayList<Produto> lista = new ArrayList<>();
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        try {
            //Abrir Conexao
            conexao = GerenciadorConexao.abrirConexao();

            //Preparar comando sql
            instrucaoSQL = conexao.prepareStatement("SELECT * FROM produto");

            //Executar comando SQL
            ResultSet rs = instrucaoSQL.executeQuery();

            if (rs != null) {
                while (rs.next()) {
                    Produto produto = new Produto();
                    produto.setId(rs.getInt("id_produto"));
                    produto.setDescricao(rs.getString("descricao"));
                    produto.setCod_barras(rs.getString("cod_barras"));
                    produto.setQuantidade(rs.getInt("quantidade"));
                    produto.setValorVenda(rs.getFloat("valor_venda"));
                    produto.setCategoria(rs.getString("categoria"));
                    produto.setCorredor(rs.getString("corredor"));
                    produto.setPratileira(rs.getInt("pratileira"));
                    lista.add(produto);
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

    public static Produto listar(int id) {
        Produto produto = new Produto();
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        try {
            //Abrir Conexao
            conexao = GerenciadorConexao.abrirConexao();

            //Preparar comando sql
            instrucaoSQL = conexao.prepareStatement("SELECT * FROM produto WHERE id_produto = ?");

            instrucaoSQL.setInt(1, id);

            //Executar comando SQL
            ResultSet rs = instrucaoSQL.executeQuery();

            if (rs != null) {
                while (rs.next()) {
                    produto.setId(rs.getInt("id_produto"));
                    produto.setDescricao(rs.getString("descricao"));
                    produto.setCod_barras(rs.getString("cod_barras"));
                    produto.setValorVenda(rs.getFloat("valor_venda"));
                    produto.setValorCusto(rs.getFloat("valor_custo"));
                    produto.setCategoria(rs.getString("categoria"));
                    produto.setCorredor(rs.getString("corredor"));
                    produto.setPratileira(rs.getInt("pratileira"));
                    produto.setQuantidade(rs.getInt("quantidade"));
                    produto.setFoto(rs.getBlob("foto"));
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
        return produto;
    }

    public static boolean excluir(int id) {
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        try {
            //Abrir Conexao
            conexao = GerenciadorConexao.abrirConexao();

            //Preparar comando sql
            instrucaoSQL = conexao.prepareStatement("DELETE FROM produto WHERE id_produto = ?");

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
