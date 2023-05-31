package datasys;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TelaMenu extends javax.swing.JFrame {

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
    
    public TelaMenu() {
        initComponents();
        Utils util = new Utils();
        util.setIconImage(this);  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_tela = new jPanelGradient();
        nome_usuario = new javax.swing.JLabel();
        lbl_title = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        panel_opcoes = new javax.swing.JPanel();
        panel_consultar = new javax.swing.JPanel();
        lbl_consultar = new javax.swing.JLabel();
        img_consultar = new javax.swing.JLabel();
        panel_cadastrar = new javax.swing.JPanel();
        lbl_cadastrar = new javax.swing.JLabel();
        img_cadastrar = new javax.swing.JLabel();
        btn_logout = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu - Datasys");

        setSize(713,427);
        setLocationRelativeTo(null);

        nome_usuario.setForeground(new java.awt.Color(255, 255, 255));
        nome_usuario.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        lbl_title.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lbl_title.setForeground(new java.awt.Color(255, 255, 255));
        lbl_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_title.setText("Menu");

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N

        panel_opcoes.setBackground(new java.awt.Color(248, 248, 248));

        panel_consultar.setBackground(new java.awt.Color(247, 247, 247));
        panel_consultar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(242, 242, 242), 2, true));
        panel_consultar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_consultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_consultarMouseClicked(evt);
            }
        });

        lbl_consultar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_consultar.setForeground(new java.awt.Color(102, 153, 255));
        lbl_consultar.setText("Gerenciar");

        img_consultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gerenciar.png"))); // NOI18N

        javax.swing.GroupLayout panel_consultarLayout = new javax.swing.GroupLayout(panel_consultar);
        panel_consultar.setLayout(panel_consultarLayout);
        panel_consultarLayout.setHorizontalGroup(
            panel_consultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_consultarLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lbl_consultar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(img_consultar)
                .addGap(15, 15, 15))
        );
        panel_consultarLayout.setVerticalGroup(
            panel_consultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_consultarLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(panel_consultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(img_consultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_consultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        panel_cadastrar.setBackground(new java.awt.Color(247, 247, 247));
        panel_cadastrar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(242, 242, 242), 2, true));
        panel_cadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_cadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_cadastrarMouseClicked(evt);
            }
        });

        lbl_cadastrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_cadastrar.setForeground(new java.awt.Color(102, 153, 255));
        lbl_cadastrar.setText("Cadastrar");

        img_cadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cadastro.png"))); // NOI18N

        javax.swing.GroupLayout panel_cadastrarLayout = new javax.swing.GroupLayout(panel_cadastrar);
        panel_cadastrar.setLayout(panel_cadastrarLayout);
        panel_cadastrarLayout.setHorizontalGroup(
            panel_cadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_cadastrarLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lbl_cadastrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(img_cadastrar)
                .addGap(15, 15, 15))
        );
        panel_cadastrarLayout.setVerticalGroup(
            panel_cadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_cadastrarLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(panel_cadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_cadastrarLayout.createSequentialGroup()
                        .addComponent(img_cadastrar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lbl_cadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout panel_opcoesLayout = new javax.swing.GroupLayout(panel_opcoes);
        panel_opcoes.setLayout(panel_opcoesLayout);
        panel_opcoesLayout.setHorizontalGroup(
            panel_opcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_opcoesLayout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(panel_opcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel_consultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_cadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35))
        );
        panel_opcoesLayout.setVerticalGroup(
            panel_opcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_opcoesLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(panel_consultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(panel_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        btn_logout.setForeground(new java.awt.Color(255, 255, 255));
        btn_logout.setText("❌ Logout");
        btn_logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_logoutMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panel_telaLayout = new javax.swing.GroupLayout(panel_tela);
        panel_tela.setLayout(panel_telaLayout);
        panel_telaLayout.setHorizontalGroup(
            panel_telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_telaLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(panel_telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btn_logout))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(panel_telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(nome_usuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_opcoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(50, 50, 50))
        );
        panel_telaLayout.setVerticalGroup(
            panel_telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_telaLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(panel_telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_logout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nome_usuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(panel_telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_opcoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_telaLayout.createSequentialGroup()
                        .addComponent(lbl_title)
                        .addGap(15, 15, 15)
                        .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_tela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_tela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    TelaGerenciamento gerenciamento = new TelaGerenciamento();
    
    private void panel_consultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_consultarMouseClicked
        this.setVisible(false);
        gerenciamento.setVisible(true);
        String username = UserSession.getInstance().getLoggedInUser();
        TelaGerenciamento.nome_usuario.setText("RA: "+username);
    }//GEN-LAST:event_panel_consultarMouseClicked

    private void panel_cadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_cadastrarMouseClicked
        this.setVisible(false);
        TelaCadastro cadastro = new TelaCadastro();
        cadastro.setVisible(true);
    }//GEN-LAST:event_panel_cadastrarMouseClicked

    private void btn_logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logoutMouseClicked
        UserSession sessao = UserSession.getInstance();
        sessao.logout();
        this.dispose();
        TelaLogin telalogin = new TelaLogin();
        telalogin.setVisible(true);
    }//GEN-LAST:event_btn_logoutMouseClicked

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMenu().setVisible(true);
                if(UserSession.getInstance().isLoggedIn()) {
                    String username = UserSession.getInstance().getLoggedInUser();
                    nome_usuario.setText("RA: "+username);
                } else {
                    System.exit(0);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_logout;
    private javax.swing.JLabel img_cadastrar;
    private javax.swing.JLabel img_consultar;
    private javax.swing.JLabel lbl_cadastrar;
    private javax.swing.JLabel lbl_consultar;
    private javax.swing.JLabel lbl_title;
    private javax.swing.JLabel logo;
    public static javax.swing.JLabel nome_usuario;
    private javax.swing.JPanel panel_cadastrar;
    private javax.swing.JPanel panel_consultar;
    private javax.swing.JPanel panel_opcoes;
    private javax.swing.JPanel panel_tela;
    // End of variables declaration//GEN-END:variables
}
