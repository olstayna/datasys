package datasys;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;
import javax.swing.JOptionPane;

public class ConexaoDB {
    
    int id = 0;
    String url = "jdbc:mysql://localhost/datasys";
    String usuario = "root";
    String senha = "";
    
    public int getId() {
        try {
//          Class.forName("org.apache.derby.jdbc.ClientDriver");
//          Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Aluno","app","123");
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, usuario, senha);
            String sql = "select max(id) from login";
            Statement st = con.createStatement();
            st.executeQuery(sql);
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {         
                id = rs.getInt(1);
                id++;
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return id;
    }
    
    public int getRA() {
        Random rand = new Random();
        int randomNumber = rand.nextInt(1000000000);
        return randomNumber;
    }
    
    public void insertDetails(Integer getId, String nome, String sobrenome, String senha, Integer getRA, String curso, String cargo, String logradouro, String cidade, String estado, String numero, String complemento, String bairro) {
        try {
//          Class.forName("org.apache.derby.jdbc.ClientDriver");
//          Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Aluno","app","123");
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, usuario, senha);
            String sql = "insert into login values(?,?,?,?,?,?,?,?,9,9,9,9,9)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, getId());
            stmt.setString(2, nome);
            stmt.setString(3, sobrenome);
            stmt.setString(4, senha);
            stmt.setInt(5, getRA());
            stmt.setString(6, curso);
            stmt.setString(7, cargo);
            stmt.setString(8, logradouro);
            stmt.setString(9, cidade);
            stmt.setString(10, bairro);
            stmt.setString(11, estado);
            stmt.setString(12, numero);
            stmt.setString(13, complemento);
            int i = stmt.executeUpdate();
            if(i>0) {
                JOptionPane.showMessageDialog(null, "Aluno inserido");
            } else {
                JOptionPane.showMessageDialog(null, "Não inserido");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
