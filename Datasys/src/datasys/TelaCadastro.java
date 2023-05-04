/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datasys;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Tayna
 */
public class TelaCadastro extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastro
     */
    
    String nome,sobrenome,senha,confirma_senha, curso, cargo, genero;
    int id = 0;
        
    public TelaCadastro() {
        initComponents();
    }
    
    class jPanelGradient extends JPanel {
        protected void paintComponent(Graphics g){
            Graphics2D g2d = (Graphics2D) g;
            int width = getWidth();
            int height = getHeight();
            // 204, 51, 204 novo
            // 97, 216, 222 velho
            
            // 153, 0, 153 novo
            // 189, 60, 199 velho
            Color color1 =  new Color(97, 216, 222);
            Color color2 = new Color(189, 60, 199);
            GradientPaint gp = new GradientPaint(0,0,color2,width,height,color1);
            g2d.setPaint(gp);
            g2d.fillRect(0, 0, width, height);
        }
    }
    
    public int getId() {
        try {
//          Class.forName("org.apache.derby.jdbc.ClientDriver");
//          Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Aluno","app","123");
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/datasys","root","");
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
    
    boolean validacao()
    {
        nome = txt_name.getText();
        sobrenome = txt_lastname.getText();
        senha = txt_password.getText();
        confirma_senha = txt_con_password.getText();
        curso = box_curso.getSelectedItem() == null ? "" : box_curso.getSelectedItem().toString();
        cargo = box_cargo.getSelectedItem() == null ? "" : box_cargo.getSelectedItem().toString();
        genero = rb_masculino.getText(); 
        genero = rb_feminino.getText();
        
        
        if(nome.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Por favor, digite o Nome");
            return false;
        }
        
        if(sobrenome.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Por favor, digite o Sobrenome");
            return false;
        }  
         
        if(senha.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Por favor, digite a Senha");
            return false;
        }
        
        if(confirma_senha.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Por favor, confirme a Senha");
            return false;
        }
        
        if (senha.length()<8)
        {
            lbl_password_error.setText("A senha deve possuir 8 caracteres");
        }
        
        if (!senha.equals(confirma_senha))
        {
            JOptionPane.showMessageDialog(this, "As senhas devem ser iguais");
            return false;
        }
        
        if (curso.equals("")) 
        {
            JOptionPane.showMessageDialog(this, "Por favor, selecione o Curso");
            return false;
        }

        if (cargo.equals("")) 
        {
            JOptionPane.showMessageDialog(this, "Por favor, selecione o Cargo");
            return false;
        }
        
        if (!rb_masculino.isSelected() && !rb_feminino.isSelected()) 
        {
            JOptionPane.showMessageDialog(this, "Por favor, selecione uma opção de gênero");
            return false;
        }

        return true;
    }
    
    public void ChecarSenha()
    {
        senha = txt_password.getText();
        if(senha.length()<8)
        {
            lbl_password_error.setText("A senha deve possuir 8 caracteres");
        }
        else
        {
            lbl_password_error.setText("");
        }
    }
    
    public int getRA() {
        Random rand = new Random();
        int randomNumber = rand.nextInt(1000000000);
        return randomNumber;
    }
    
    void insertDetails() {
        try {
//          Class.forName("org.apache.derby.jdbc.ClientDriver");
//          Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Aluno","app","123");
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/datasys","root","");
            String sql = "insert into login values(?,?,?,?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, getId());
            stmt.setString(2, nome);
            stmt.setString(3, sobrenome);
            stmt.setString(4, senha);
            stmt.setInt(5, getRA());
            stmt.setString(6, curso);
            stmt.setString(7, cargo);
            stmt.setString(8, genero);
            int i = stmt.executeUpdate();
            if(i>0) {
                JOptionPane.showMessageDialog(this, "Aluno inserido");
            } else {
                JOptionPane.showMessageDialog(this, "Não inserido");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        lbl_password_error = new javax.swing.JLabel();
        jPanel1 = new jPanelGradient();
        title = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_lastname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_password = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        txt_con_password = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        rb_masculino = new javax.swing.JRadioButton();
        rb_feminino = new javax.swing.JRadioButton();
        box_cargo = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        box_curso = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        btn_signup = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(870, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_password_error.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_password_error.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(lbl_password_error, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 440, 270, 20));

        jPanel1.setBackground(new java.awt.Color(250, 250, 250));
        jPanel1.setPreferredSize(new java.awt.Dimension(870, 700));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("DataSys");
        jPanel1.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(38, 117, 191));
        jLabel2.setText("Nome");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 150, -1, -1));

        txt_name.setBackground(new java.awt.Color(245, 245, 245));
        txt_name.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 153, 255)));
        jPanel1.add(txt_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 160, 240, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(38, 117, 191));
        jLabel3.setText("Sobrenome");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 210, -1, -1));

        txt_lastname.setBackground(new java.awt.Color(245, 245, 245));
        txt_lastname.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 153, 255)));
        jPanel1.add(txt_lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 220, 240, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(38, 117, 191));
        jLabel5.setText("Senha");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 270, -1, -1));

        txt_password.setBackground(new java.awt.Color(245, 245, 245));
        txt_password.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 153, 255)));
        txt_password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_passwordKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_passwordKeyReleased(evt);
            }
        });
        jPanel1.add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 280, 240, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(38, 117, 191));
        jLabel1.setText("Confirmar senha");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 330, -1, -1));

        txt_con_password.setBackground(new java.awt.Color(245, 245, 245));
        txt_con_password.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 153, 255)));
        jPanel1.add(txt_con_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 340, 240, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 153, 255));
        jLabel4.setText("CADASTRO");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 70, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Gerenciamento de Alunos");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        buttonGroup1.add(rb_masculino);
        rb_masculino.setForeground(new java.awt.Color(38, 117, 191));
        rb_masculino.setText("Masculino");
        jPanel1.add(rb_masculino, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 470, -1, -1));

        buttonGroup1.add(rb_feminino);
        rb_feminino.setForeground(new java.awt.Color(38, 117, 191));
        rb_feminino.setText("Feminino");
        jPanel1.add(rb_feminino, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 470, -1, -1));

        box_cargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Professor", "Aluno" }));
        box_cargo.setSelectedIndex(1);
        box_cargo.setSelectedItem(null);
        box_cargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_cargoActionPerformed(evt);
            }
        });
        jPanel1.add(box_cargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 420, 100, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(38, 117, 191));
        jLabel7.setText("Cargo");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 400, -1, -1));

        box_curso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADS", "CC", "GTI", "SI", "Design" }));
        box_curso.setSelectedIndex(1);
        box_curso.setSelectedItem(null);
        box_curso.setName("tese"); // NOI18N
        box_curso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_cursoActionPerformed(evt);
            }
        });
        jPanel1.add(box_curso, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 420, 100, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(38, 117, 191));
        jLabel8.setText("Curso");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 400, -1, -1));

        btn_signup.setBackground(new java.awt.Color(51, 153, 255));
        btn_signup.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_signup.setForeground(new java.awt.Color(255, 255, 255));
        btn_signup.setText("Cadastrar");
        btn_signup.setBorder(null);
        btn_signup.setFocusPainted(false);
        btn_signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_signupActionPerformed(evt);
            }
        });
        jPanel1.add(btn_signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 530, 200, 40));

        jPanel2.setBackground(new java.awt.Color(245, 245, 245));
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, 350, 570));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_signupActionPerformed
        if(validacao()) {
            insertDetails();
        }
    }//GEN-LAST:event_btn_signupActionPerformed

    private void txt_passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_passwordKeyPressed
        ChecarSenha();
    }//GEN-LAST:event_txt_passwordKeyPressed

    private void txt_passwordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_passwordKeyReleased
        ChecarSenha();
    }//GEN-LAST:event_txt_passwordKeyReleased

    private void box_cargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_cargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_box_cargoActionPerformed

    private void box_cursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_cursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_box_cursoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> box_cargo;
    private javax.swing.JComboBox<String> box_curso;
    private javax.swing.JButton btn_signup;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_password_error;
    private javax.swing.JRadioButton rb_feminino;
    private javax.swing.JRadioButton rb_masculino;
    private javax.swing.JLabel title;
    private javax.swing.JPasswordField txt_con_password;
    private javax.swing.JTextField txt_lastname;
    private javax.swing.JTextField txt_name;
    private javax.swing.JPasswordField txt_password;
    // End of variables declaration//GEN-END:variables
}
