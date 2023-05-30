package datasys;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
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
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_tela = new jPanelGradient();
        lbl_title = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        panel_opcoes = new javax.swing.JPanel();
        panel_consultar = new javax.swing.JPanel();
        lbl_consultar = new javax.swing.JLabel();
        btn_consultar = new javax.swing.JLabel();
        panel_cadastrar = new javax.swing.JPanel();
        lbl_cadastrar = new javax.swing.JLabel();
        btn_cadastrar = new javax.swing.JLabel();
        panel_alterar = new javax.swing.JPanel();
        lbl_alterar = new javax.swing.JLabel();
        btn_alterar = new javax.swing.JLabel();
        panel_excluir = new javax.swing.JPanel();
        lbl_excluir = new javax.swing.JLabel();
        btn_excluir = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu - Datasys");

        lbl_title.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lbl_title.setForeground(new java.awt.Color(255, 255, 255));
        lbl_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_title.setText("Menu");

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/datasys/images/Logo Datasys.png"))); // NOI18N

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
        lbl_consultar.setText("Consultar");

        btn_consultar.setForeground(new java.awt.Color(102, 153, 255));
        btn_consultar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_consultar.setText("▶");

        javax.swing.GroupLayout panel_consultarLayout = new javax.swing.GroupLayout(panel_consultar);
        panel_consultar.setLayout(panel_consultarLayout);
        panel_consultarLayout.setHorizontalGroup(
            panel_consultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_consultarLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbl_consultar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_consultar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panel_consultarLayout.setVerticalGroup(
            panel_consultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_consultarLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(panel_consultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_consultar)
                    .addComponent(lbl_consultar))
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

        btn_cadastrar.setForeground(new java.awt.Color(102, 153, 255));
        btn_cadastrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_cadastrar.setText("▶");

        javax.swing.GroupLayout panel_cadastrarLayout = new javax.swing.GroupLayout(panel_cadastrar);
        panel_cadastrar.setLayout(panel_cadastrarLayout);
        panel_cadastrarLayout.setHorizontalGroup(
            panel_cadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_cadastrarLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbl_cadastrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                .addComponent(btn_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panel_cadastrarLayout.setVerticalGroup(
            panel_cadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_cadastrarLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(panel_cadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_cadastrar)
                    .addComponent(btn_cadastrar))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        panel_alterar.setBackground(new java.awt.Color(247, 247, 247));
        panel_alterar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(242, 242, 242), 2, true));
        panel_alterar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_alterar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_alterarMouseClicked(evt);
            }
        });

        lbl_alterar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_alterar.setForeground(new java.awt.Color(102, 153, 255));
        lbl_alterar.setText("Alterar");

        btn_alterar.setForeground(new java.awt.Color(102, 153, 255));
        btn_alterar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_alterar.setText("▶");

        javax.swing.GroupLayout panel_alterarLayout = new javax.swing.GroupLayout(panel_alterar);
        panel_alterar.setLayout(panel_alterarLayout);
        panel_alterarLayout.setHorizontalGroup(
            panel_alterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_alterarLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbl_alterar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panel_alterarLayout.setVerticalGroup(
            panel_alterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_alterarLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(panel_alterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_alterar)
                    .addComponent(btn_alterar))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        panel_excluir.setBackground(new java.awt.Color(247, 247, 247));
        panel_excluir.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(242, 242, 242), 2, true));
        panel_excluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_excluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_excluirMouseClicked(evt);
            }
        });

        lbl_excluir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_excluir.setForeground(new java.awt.Color(102, 153, 255));
        lbl_excluir.setText("Excluir");

        btn_excluir.setForeground(new java.awt.Color(102, 153, 255));
        btn_excluir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_excluir.setText("▶");

        javax.swing.GroupLayout panel_excluirLayout = new javax.swing.GroupLayout(panel_excluir);
        panel_excluir.setLayout(panel_excluirLayout);
        panel_excluirLayout.setHorizontalGroup(
            panel_excluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_excluirLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbl_excluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panel_excluirLayout.setVerticalGroup(
            panel_excluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_excluirLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(panel_excluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_excluir)
                    .addComponent(btn_excluir))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel_opcoesLayout = new javax.swing.GroupLayout(panel_opcoes);
        panel_opcoes.setLayout(panel_opcoesLayout);
        panel_opcoesLayout.setHorizontalGroup(
            panel_opcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_opcoesLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(panel_opcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel_consultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_cadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_alterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_excluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        panel_opcoesLayout.setVerticalGroup(
            panel_opcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_opcoesLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(panel_consultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(panel_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(panel_alterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(panel_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout panel_telaLayout = new javax.swing.GroupLayout(panel_tela);
        panel_tela.setLayout(panel_telaLayout);
        panel_telaLayout.setHorizontalGroup(
            panel_telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_telaLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(panel_telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(panel_opcoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        panel_telaLayout.setVerticalGroup(
            panel_telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_telaLayout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(panel_telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_telaLayout.createSequentialGroup()
                        .addComponent(lbl_title)
                        .addGap(15, 15, 15)
                        .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_telaLayout.createSequentialGroup()
                        .addComponent(panel_opcoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_tela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_tela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    TelaGerenciamento gerenciamento = new TelaGerenciamento();
    
    private void panel_consultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_consultarMouseClicked
        this.dispose();
        gerenciamento.setVisible(true);
    }//GEN-LAST:event_panel_consultarMouseClicked

    private void panel_cadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_cadastrarMouseClicked
        this.dispose();
        TelaCadastro cadastro = new TelaCadastro();
        cadastro.setVisible(true);
    }//GEN-LAST:event_panel_cadastrarMouseClicked

    private void panel_alterarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_alterarMouseClicked
        this.dispose();
        gerenciamento.setVisible(true);
    }//GEN-LAST:event_panel_alterarMouseClicked

    private void panel_excluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_excluirMouseClicked
        this.dispose();
        gerenciamento.setVisible(true);
    }//GEN-LAST:event_panel_excluirMouseClicked

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
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_alterar;
    private javax.swing.JLabel btn_cadastrar;
    private javax.swing.JLabel btn_consultar;
    private javax.swing.JLabel btn_excluir;
    private javax.swing.JLabel lbl_alterar;
    private javax.swing.JLabel lbl_cadastrar;
    private javax.swing.JLabel lbl_consultar;
    private javax.swing.JLabel lbl_excluir;
    private javax.swing.JLabel lbl_title;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel panel_alterar;
    private javax.swing.JPanel panel_cadastrar;
    private javax.swing.JPanel panel_consultar;
    private javax.swing.JPanel panel_excluir;
    private javax.swing.JPanel panel_opcoes;
    private javax.swing.JPanel panel_tela;
    // End of variables declaration//GEN-END:variables
}
