package Principal;

import Principal.DadosUsuario;
import Conexao.ConexaoDAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Usuario {
    //variavel conectora
    Connection conn;
    
    public ResultSet autenticacaoUser(DadosUsuario objDadosU) {
    
        conn = new ConexaoDAO().conectaBD();
        
        try {
            //Essa variavel interage com o banco de dados verificando de o usuário e senha digitados existem 
            String sql = "select * from usuario where user = ? and senha = ?";
            
            //Faz um consulta dos input do usuário
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, objDadosU.getUser());
            pstm.setString(2, objDadosU.getSenha());      
            
            // verifica se há o usuário no banco e retorna caso haja
            ResultSet rs = pstm.executeQuery();
            return rs;
            
        }catch (SQLException erro) {
            //janela de erro
            JOptionPane.showMessageDialog(null, "classe usuario: " + erro);
            return null;
        }
    }
    
}
