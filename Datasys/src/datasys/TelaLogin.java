package datasys;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JPanel;

public class TelaLogin extends javax.swing.JFrame {
  

    public TelaLogin() {
        initComponents();
        
    }
    
    class jPanelGradient extends JPanel {
        protected void paintComponent(Graphics g){
            Graphics2D g2d = (Graphics2D) g;
            int width = getWidth();
            int height = getHeight();
            
            Color color1 =  new Color(52,143,80);
            Color color2 = new Color(86,180,211);
            GradientPaint gp = new GradientPaint(0,0,color1,180,height,color2);
            g2d.setPaint(gp);
            g2d.fillRect(0, 0, width, height);
        }
    }
    
    void VerificacaoUsuario(String username,String password)
    {
        try
        {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/Datasys","root","root");
            String sql="select * from login where username=? and password=?";
        }
        catch(Exception e)
        {
            
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new jPanelGradient();
        title = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        label_username = new javax.swing.JLabel();
        label_password = new javax.swing.JLabel();
        txt_password = new javax.swing.JPasswordField();
        btn_login = new javax.swing.JButton();
        message = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerenciamento de Alunos");
        setBackground(new java.awt.Color(255, 255, 255));
        setSize(new java.awt.Dimension(500, 500));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        title.setText("DataSys - Gerenciamento de Alunos");
        jPanel1.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, -1, -1));

        txt_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usernameActionPerformed(evt);
            }
        });
        jPanel1.add(txt_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 260, 30));

        label_username.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label_username.setText("Username");
        jPanel1.add(label_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, -1, -1));

        label_password.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label_password.setText("Password");
        jPanel1.add(label_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, -1, -1));

        txt_password.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 260, 30));

        btn_login.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_login.setText("Login");
        btn_login.setBorder(null);
        btn_login.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        jPanel1.add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 149, 38));

        message.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usernameActionPerformed
        
    }//GEN-LAST:event_txt_usernameActionPerformed

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
            String username=txt_username.getText();
            String password=txt_password.getText();
            
            if (username.trim().equals("")|| password.trim().equals(""))
            {
                message.setText("Por favor, digite o usuário e senha");
            }
            else 
            {
                
            }
    }//GEN-LAST:event_btn_loginActionPerformed

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_login;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label_password;
    private javax.swing.JLabel label_username;
    private javax.swing.JLabel message;
    private javax.swing.JLabel title;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
