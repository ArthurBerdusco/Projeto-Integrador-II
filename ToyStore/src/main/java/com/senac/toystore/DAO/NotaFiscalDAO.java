package com.senac.toystore.DAO;

import com.senac.toystore.model.ItemNota;
import com.senac.toystore.model.NotaFiscal;
import com.senac.toystore.utils.GerenciadorConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * author Alex
 */
public class NotaFiscalDAO {
    
    public static boolean salvar(NotaFiscal obj) {
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        try {
            //Abrir Conexao
            conexao = GerenciadorConexao.abrirConexao();

            //Preparar comando sql
            instrucaoSQL = conexao.prepareStatement("INSERT INTO notafiscal (numeroNota, vlrTotal) values(?,?)");
            instrucaoSQL.setInt(1, obj.getNumeroNota());
            instrucaoSQL.setDouble(2, obj.getValorTotal());
            
            //Checkpointtt1
            System.out.println("Numero da nota e valor total enviado ao banco");
            
            //Executar comando SQL
            int linhasAfetadas = instrucaoSQL.executeUpdate();
            if (linhasAfetadas > 0) {
                ResultSet rs = instrucaoSQL.getGeneratedKeys();
                if (rs.next()) {
                    int idNota = rs.getInt(1);
                    for (ItemNota item : obj.getListaItens()) {
                        PreparedStatement instrucaoSQLItem = conexao.prepareStatement("INSERT INTO notafiscal (idNota,cod_barras,descricao,quantidade,vlrUnitario) VALUES (?,?,?,?,?)");
                        instrucaoSQLItem.setInt(1, idNota);
                        instrucaoSQLItem.setString(2, item.getDscProduto());
                        instrucaoSQLItem.setInt(3, item.getQtdProduto());
                        instrucaoSQLItem.setDouble(4, item.getVlrProduto());
                        
                        //Checkpointtt2
                        instrucaoSQLItem.setDouble(5, item.getVlrTotal());
                        System.out.println("Itens inseridos no banco");
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
