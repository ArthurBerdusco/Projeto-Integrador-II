package com.senac.toystore.DAO;

import com.senac.toystore.model.ItemNota;
import com.senac.toystore.model.NotaFiscal;
import com.senac.toystore.utils.GerenciadorConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


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

                        PreparedStatement instrucaoSQLItem = conexao.prepareStatement("INSERT INTO item_nota (quantidade, valor_produto, numeroNota, id_produto) VALUES (?,?,?,?)");
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
}
