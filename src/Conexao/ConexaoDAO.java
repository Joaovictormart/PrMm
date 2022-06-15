package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;


public class ConexaoDAO {
    
    //nescessario ter o .jar mysql-connector
    public Connection conectaBD() {
        Connection conn = null;
        
        try {
            // drive de conexão / local aonde está o banco / nome da tabela / credenciais de acesso
            String url = "jdbc:mysql://localhost:3306/bancologin?user=root&password=";
            //faz a conexão com o BD
            conn = DriverManager.getConnection(url);
        } catch (SQLException erro) {
            // caso haja erro ele printa na janela 
            JOptionPane.showMessageDialog(null, "Erro na classe de conexãoDAO " + erro.getMessage());
        }
        
        return conn;
    }
    
    
}
