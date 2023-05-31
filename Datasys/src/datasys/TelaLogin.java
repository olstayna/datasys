package datasys;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JPanel;

public class TelaLogin extends javax.swing.JFrame {
  

    public TelaLogin() {
        initComponents();
        Utils util = new Utils();
        util.setIconImage(this);
    }
    
    class jPanelGradient extends JPanel {
        protected void paintComponent(Graphics g){
            Graphics2D g2d = (Graphics2D) g;
            int width = getWidth();
            int height = getHeight();
            Color color1 =  new Color(97, 216, 222);
            Color color2 = new Color(189, 60, 199);
            GradientPaint gp = new GradientPaint(0,0,color2,width,height,color1);
            g2d.setPaint(gp);
            g2d.fillRect(0, 0, width, height);
        }
    }
    
    private void exibirMensagemErro(String mensagem) {
        message.setText(mensagem);
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                message.setText("");
                timer.cancel();
            }
        }, 2000);
    }
    
    private void verificarUsuario(String ra,String senha) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/datasys","root","");
            String sql = "SELECT * FROM login WHERE ra=? AND senha=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, ra);
            pst.setString(2, senha);
            ResultSet rs = pst.executeQuery();
            if(rs.next()) {
                this.dispose();
                
            } else {
                exibirMensagemErro("RA ou senha incorretos.");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }     
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_tela = new jPanelGradient();
        message = new javax.swing.JLabel();
        panel_campos = new javax.swing.JPanel();
        lbl_title = new javax.swing.JLabel();
        lbl_username = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        lbl_senha = new javax.swing.JLabel();
        txt_senha = new javax.swing.JPasswordField();
        btn_login = new javax.swing.JButton();
        lbl_descricao = new javax.swing.JLabel();
        title1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login - Datasys");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        setSize(new java.awt.Dimension(580, 450));

        panel_tela.setBackground(new java.awt.Color(250, 250, 250));

        message.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        message.setForeground(new java.awt.Color(255, 0, 0));

        panel_campos.setBackground(new java.awt.Color(245, 245, 245));

        lbl_title.setBackground(new java.awt.Color(0, 0, 0));
        lbl_title.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        lbl_title.setForeground(new java.awt.Color(102, 153, 255));
        lbl_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_title.setText("LOGIN");

        lbl_username.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lbl_username.setForeground(new java.awt.Color(38, 117, 191));
        lbl_username.setText("RA");

        txt_username.setBackground(new java.awt.Color(245, 245, 245));
        txt_username.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 153, 255)));

        lbl_senha.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lbl_senha.setForeground(new java.awt.Color(38, 117, 191));
        lbl_senha.setText("Senha");

        txt_senha.setBackground(new java.awt.Color(245, 245, 245));
        txt_senha.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 153, 255)));

        btn_login.setBackground(new java.awt.Color(51, 153, 255));
        btn_login.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_login.setForeground(new java.awt.Color(255, 255, 255));
        btn_login.setText("Login");
        btn_login.setBorder(null);
        btn_login.setFocusPainted(false);
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_camposLayout = new javax.swing.GroupLayout(panel_campos);
        panel_campos.setLayout(panel_camposLayout);
        panel_camposLayout.setHorizontalGroup(
            panel_camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_camposLayout.createSequentialGroup()
                .addGap(0, 60, Short.MAX_VALUE)
                .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
            .addGroup(panel_camposLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(panel_camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_username)
                    .addComponent(lbl_username)
                    .addComponent(lbl_senha)
                    .addComponent(txt_senha)
                    .addComponent(lbl_title, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_camposLayout.setVerticalGroup(
            panel_camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_camposLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lbl_title)
                .addGap(35, 35, 35)
                .addComponent(lbl_username)
                .addGap(0, 0, 0)
                .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(lbl_senha)
                .addGap(0, 0, 0)
                .addComponent(txt_senha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        lbl_descricao.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lbl_descricao.setForeground(new java.awt.Color(255, 255, 255));
        lbl_descricao.setText("<html><p>Gerenciamento de Alunos</p></html>");

        title1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        title1.setForeground(new java.awt.Color(255, 255, 255));
        title1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N

        javax.swing.GroupLayout panel_telaLayout = new javax.swing.GroupLayout(panel_tela);
        panel_tela.setLayout(panel_telaLayout);
        panel_telaLayout.setHorizontalGroup(
            panel_telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_telaLayout.createSequentialGroup()
                .addGroup(panel_telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_telaLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(lbl_descricao, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(message))
                    .addGroup(panel_telaLayout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(title1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(panel_campos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        panel_telaLayout.setVerticalGroup(
            panel_telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_telaLayout.createSequentialGroup()
                .addGroup(panel_telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_telaLayout.createSequentialGroup()
                        .addGap(380, 380, 380)
                        .addComponent(message))
                    .addGroup(panel_telaLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(lbl_descricao, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(title1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_telaLayout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(panel_campos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(92, Short.MAX_VALUE))
        );

        getContentPane().add(panel_tela, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        String ra = txt_username.getText();
        String senha = txt_senha.getText();
        TelaMenu menu = new TelaMenu();
        
        if(ra.equals("") || senha.equals("")) {
            exibirMensagemErro("Por favor, digite o nome ou RA.");
        } else {
            verificarUsuario(ra, senha);
            menu.setVisible(true);
        }
    }//GEN-LAST:event_btn_loginActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_login;
    private javax.swing.JLabel lbl_descricao;
    private javax.swing.JLabel lbl_senha;
    private javax.swing.JLabel lbl_title;
    private javax.swing.JLabel lbl_username;
    private javax.swing.JLabel message;
    private javax.swing.JPanel panel_campos;
    private javax.swing.JPanel panel_tela;
    private javax.swing.JLabel title1;
    private javax.swing.JPasswordField txt_senha;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
