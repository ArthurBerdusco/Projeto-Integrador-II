package com.senac.toystore.DAO;

import com.senac.toystore.model.ItemNota;
import com.senac.toystore.model.NotaFiscal;
import com.senac.toystore.utils.GerenciadorConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * author Alex
 */
public class NotaFiscalDAO {

    public static boolean salvar(NotaFiscal nota) {
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        try {
            //Abrir Conexao
            conexao = GerenciadorConexao.abrirConexao();

            //Preparar comando sql
            instrucaoSQL = conexao.prepareStatement("INSERT INTO notafiscal (data_nota, id_cliente, nome_vendedor, valor_total) values(now(), ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
            instrucaoSQL.setInt(1, nota.getIdCliente());
            instrucaoSQL.setString(2, nota.getNomeVendedor());
            instrucaoSQL.setDouble(3, nota.getValorTotal());

            //Executar comando SQL
            int linhasAfetadas = instrucaoSQL.executeUpdate();
            if (linhasAfetadas > 0) {
                ResultSet rs = instrucaoSQL.getGeneratedKeys();
                if (rs.next()) {
                    int idNota = rs.getInt(1);
                    for (ItemNota item : nota.getListaItens()) {

                        PreparedStatement instrucaoSQLItem = conexao.prepareStatement("INSERT INTO item_nota (quantidade, valor, numeronota, id_produto) VALUES (?,?,?,?)");
                        instrucaoSQLItem.setInt(1, item.getQtdProduto());
                        instrucaoSQLItem.setDouble(2, item.getVlrProduto());
                        instrucaoSQLItem.setInt(3, idNota);
                        instrucaoSQLItem.setDouble(4, item.getIdProduto());

                        int linhasAfetadasItem = instrucaoSQLItem.executeUpdate();

                        if (linhasAfetadasItem > 0) {
                            retorno = true;
                        } else {
                            retorno = false;
                        }
                    }
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
        return retorno;
    }

    public static ArrayList<NotaFiscal> listar(Date dataInicio, Date dataFim) {
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        ArrayList<NotaFiscal> notasFiscais = new ArrayList<>();

        try {
            //Abrir Conexao
            conexao = GerenciadorConexao.abrirConexao();

            //Preparar comando sql
            instrucaoSQL = conexao.prepareStatement("SELECT * FROM notafiscal where data_nota >= ? AND data_nota <= ?");
            instrucaoSQL.setDate(1, new java.sql.Date(dataInicio.getTime()));
            instrucaoSQL.setDate(2, new java.sql.Date(dataFim.getTime()));

            //Executar comando SQL
            ResultSet rs = instrucaoSQL.executeQuery();

            if (rs != null) {
                
                
                while (rs.next()) {
                    NotaFiscal nota = new NotaFiscal();
                    
                    nota.setNumeroNota(rs.getInt("numeroNota"));
                    nota.setIdCliente(rs.getInt("id_cliente"));
                    nota.setDataNota(rs.getDate("data_nota"));
                    nota.setValorTotal(rs.getDouble("valor_total"));
                    nota.setNomeVendedor(rs.getString("nome_vendedor"));
                    
                    PreparedStatement instrucaoSQLItem = conexao.prepareStatement("SELECT * FROM item_nota "
                                                                                                        + "INNER JOIN produto ON produto.id_produto = item_nota.id_produto "
                                                                                                        + "INNER JOIN notafiscal on notafiscal.numeronota = item_nota.numeronota "
                                                                                                        + "INNER JOIN cliente on cliente.id_cliente = notafiscal.id_cliente "
                                                                                                        + "WHERE item_nota.numeroNota = ?");
                    instrucaoSQLItem.setInt(1, nota.getNumeroNota());
                    
                    ResultSet rsItem = instrucaoSQLItem.executeQuery();
                    ArrayList<ItemNota> itensNota = new ArrayList<>();
                    if(rsItem != null){
                        
                        while(rsItem.next()){
                            
                            ItemNota item = new ItemNota();
                            item.setIdItemNota(rsItem.getInt("id_item"));
                            item.setQtdProduto(rsItem.getInt("quantidade"));
                            item.setVlrProduto(rsItem.getDouble("valor"));
                            item.setIdNota(rsItem.getInt("numeroNota"));
                            item.setIdProduto(rsItem.getInt("id_produto"));
                            item.setDescricaoProduto(rsItem.getString("descricao"));
                            nota.setNomeCliente(rsItem.getString("nome"));
                            itensNota.add(item);
                            
                        }
                    }
                    nota.setListaItens(itensNota);
                    notasFiscais.add(nota);
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
        return notasFiscais;
    }
}
