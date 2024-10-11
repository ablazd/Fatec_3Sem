package DAO;
 
import java.util.List;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
// import javax.swing.table.AbstractTableModel;
 
/**
*
* @author Prof. Corredato - Controle de conexão com o banco de dados
*/
public class ConnectDAO {
    Connection con;
    public Connection connectDB(){
        // JOptionPane.showMessageDialog(null, "Inicia a classe para conexão com SQL SERVER!");
 
        String caminho = "jdbc:sqlserver://localhost:1433;databaseName=MOV_CONTA_CORRENTE;"  // Troque VIDEOLOCADORA para MOV_CONTA_CORRENTE
                + "encrypt=true;trustServerCertificate=true;"; 
        String usuario = "sa";
        String senha = ".";
        try {
            con = DriverManager.getConnection(caminho, usuario, senha);
            JOptionPane.showMessageDialog(null, "Conectado com sucesso!");
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro de conexão, connectDAO - Mensagem => "+erro.getMessage());
            JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Estado => "+erro.getSQLState());
            JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Código => "+erro.getErrorCode());
        }
        return con;
        // con.close();
    }
    /*
    * Rotina para inserir um registro novo no banco de dados
    */
    //public void insereRegistroJFBD(int idCliente, String nome, String endereco, String bairro, String cidade, String estado, String telefone, String email, String sexo){
    // public void insereRegistroJFBD(String banco, Cliente novo_cliente){
    public void insereRegistroJFBD(String tabela, String strDados){
        String caminho = "jdbc:sqlserver://localhost:1433;databaseName=MOV_CONTA_CORRENTE;encrypt=true;trustServerCertificate=true;"; // O "control" representa a minha database 
        String usuario = "sa";
        String senha = ".";
        {
 
            try {
                con = DriverManager.getConnection(caminho, usuario, senha);
                // JOptionPane.showMessageDialog(null, "Conectado com sucesso!");
            } catch (SQLException erro) {
                JOptionPane.showMessageDialog(null, "Erro de conexão, connectDAO - Mensagem => "+erro.getMessage());
                JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Estado => "+erro.getSQLState());
                JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Código => "+erro.getErrorCode());
            }
            Statement stmt;
            try {
                stmt = con.createStatement();
                // Cria a string com a sentença SQL para inserir registro
 
                     String sql = "INSERT INTO dbo."+tabela+" "
                            + "VALUES ("+ strDados+")";
                    JOptionPane.showMessageDialog(null, "String de Insert: "+sql);
 
                 try {
                // Executar a sentença de insert
                    stmt.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "Inclusão executada com sucesso!");
                } catch (SQLException erro) {
                    JOptionPane.showMessageDialog(null, "Erro de conexão, connectDAO - Mensagem => "+erro.getMessage());
                    JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Estado => "+erro.getSQLState());
                    JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Código => "+erro.getErrorCode());
                }
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(ConnectDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}