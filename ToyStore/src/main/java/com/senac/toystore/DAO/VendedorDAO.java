package com.senac.toystore.DAO;

import com.senac.toystore.model.Vendedor;
import com.senac.toystore.utils.GerenciadorConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author eliseu.fsantos1
 */
public class VendedorDAO {

    public static boolean salvar(Vendedor vendedor) {
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        try {
            //Abrir Conexao
            conexao = GerenciadorConexao.abrirConexao();

            //Preparar comando sql
            instrucaoSQL = conexao.prepareStatement("INSERT INTO VENDEDOR (USUARIO,SENHA) VALUES (? , ?)");

            //Executar comando SQL
            instrucaoSQL.setString(1, vendedor.getUsuario());
            instrucaoSQL.setString(2, vendedor.getSenha());

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

    public static Vendedor listar(String usuario) {
        Vendedor vendedor = new Vendedor();
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        try {
            //Abrir Conexao
            conexao = GerenciadorConexao.abrirConexao();

            //Preparar comando sql
            instrucaoSQL = conexao.prepareStatement("SELECT * FROM vendedor WHERE usuario = ?");

            instrucaoSQL.setString(1, usuario);

            //Executar comando SQL
            ResultSet rs = instrucaoSQL.executeQuery();

            if (rs != null) {
                while (rs.next()) {
                    vendedor.setUsuario(rs.getString("usuario"));
                    vendedor.setSenha(rs.getString("senha"));
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
        return vendedor;
    }
}
