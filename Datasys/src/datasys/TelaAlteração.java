package datasys;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class TelaAlteração extends javax.swing.JFrame {

    public TelaAlteração() {
        initComponents();
    }
    
    class jPanelGradient extends JPanel {
        @Override
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_tela = new jPanelGradient();
        panel_consulta = new javax.swing.JPanel();
        btn_consultar = new javax.swing.JButton();
        txt_ra = new javax.swing.JTextField();
        lbl_ra = new javax.swing.JLabel();
        txt_nome = new javax.swing.JTextField();
        lbl_nome = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        lbl_email = new javax.swing.JLabel();
        txt_telefone = new javax.swing.JTextField();
        lbl_telefone = new javax.swing.JLabel();
        txt_curso = new javax.swing.JTextField();
        lbl_curso = new javax.swing.JLabel();
        txt_cargo = new javax.swing.JTextField();
        lbl_cargo = new javax.swing.JLabel();
        txt_logradouro = new javax.swing.JTextField();
        lbl_logradouro = new javax.swing.JLabel();
        txt_cidade = new javax.swing.JTextField();
        lbl_cidade = new javax.swing.JLabel();
        txt_bairro = new javax.swing.JTextField();
        lbl_bairro = new javax.swing.JLabel();
        txt_estado = new javax.swing.JTextField();
        lbl_estado = new javax.swing.JLabel();
        txt_numero = new javax.swing.JTextField();
        lbl_numero = new javax.swing.JLabel();
        txt_complemento = new javax.swing.JTextField();
        lbl_complemento = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        lbl_consultas = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Alterar - Datasys");

        panel_consulta.setBackground(new java.awt.Color(248, 248, 248));

        btn_consultar.setBackground(new java.awt.Color(51, 153, 255));
        btn_consultar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_consultar.setForeground(new java.awt.Color(255, 255, 255));
        btn_consultar.setText("Alterar");
        btn_consultar.setBorder(null);
        btn_consultar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_consultar.setFocusPainted(false);

        txt_ra.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 153, 255)));

        lbl_ra.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lbl_ra.setForeground(new java.awt.Color(102, 153, 255));
        lbl_ra.setText("RA:");

        txt_nome.setForeground(new java.awt.Color(102, 102, 102));
        txt_nome.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 153, 255)));
        txt_nome.setFocusable(false);

        lbl_nome.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lbl_nome.setForeground(new java.awt.Color(102, 153, 255));
        lbl_nome.setText("Nome:");

        txt_email.setForeground(new java.awt.Color(102, 102, 102));
        txt_email.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 153, 255)));
        txt_email.setFocusable(false);

        lbl_email.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lbl_email.setForeground(new java.awt.Color(102, 153, 255));
        lbl_email.setText("Email:");

        txt_telefone.setForeground(new java.awt.Color(102, 102, 102));
        txt_telefone.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 153, 255)));
        txt_telefone.setFocusable(false);

        lbl_telefone.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lbl_telefone.setForeground(new java.awt.Color(102, 153, 255));
        lbl_telefone.setText("Telefone:");

        txt_curso.setForeground(new java.awt.Color(102, 102, 102));
        txt_curso.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 153, 255)));
        txt_curso.setFocusable(false);

        lbl_curso.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lbl_curso.setForeground(new java.awt.Color(102, 153, 255));
        lbl_curso.setText("Curso:");

        txt_cargo.setForeground(new java.awt.Color(102, 102, 102));
        txt_cargo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 153, 255)));
        txt_cargo.setFocusable(false);

        lbl_cargo.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lbl_cargo.setForeground(new java.awt.Color(102, 153, 255));
        lbl_cargo.setText("Cargo:");

        txt_logradouro.setForeground(new java.awt.Color(102, 102, 102));
        txt_logradouro.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 153, 255)));
        txt_logradouro.setFocusable(false);

        lbl_logradouro.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lbl_logradouro.setForeground(new java.awt.Color(102, 153, 255));
        lbl_logradouro.setText("Logradouro:");

        txt_cidade.setForeground(new java.awt.Color(102, 102, 102));
        txt_cidade.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 153, 255)));
        txt_cidade.setFocusable(false);

        lbl_cidade.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lbl_cidade.setForeground(new java.awt.Color(102, 153, 255));
        lbl_cidade.setText("Cidade:");

        txt_bairro.setForeground(new java.awt.Color(102, 102, 102));
        txt_bairro.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 153, 255)));
        txt_bairro.setFocusable(false);

        lbl_bairro.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lbl_bairro.setForeground(new java.awt.Color(102, 153, 255));
        lbl_bairro.setText("Bairro:");

        txt_estado.setForeground(new java.awt.Color(102, 102, 102));
        txt_estado.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 153, 255)));
        txt_estado.setFocusable(false);

        lbl_estado.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lbl_estado.setForeground(new java.awt.Color(102, 153, 255));
        lbl_estado.setText("Estado:");

        txt_numero.setForeground(new java.awt.Color(102, 102, 102));
        txt_numero.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 153, 255)));
        txt_numero.setFocusable(false);

        lbl_numero.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lbl_numero.setForeground(new java.awt.Color(102, 153, 255));
        lbl_numero.setText("Número:");

        txt_complemento.setForeground(new java.awt.Color(102, 102, 102));
        txt_complemento.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 153, 255)));
        txt_complemento.setFocusable(false);

        lbl_complemento.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lbl_complemento.setForeground(new java.awt.Color(102, 153, 255));
        lbl_complemento.setText("Complemento:");

        javax.swing.GroupLayout panel_consultaLayout = new javax.swing.GroupLayout(panel_consulta);
        panel_consulta.setLayout(panel_consultaLayout);
        panel_consultaLayout.setHorizontalGroup(
            panel_consultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_consultaLayout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addComponent(btn_consultar, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
            .addGroup(panel_consultaLayout.createSequentialGroup()
                .addGroup(panel_consultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_consultaLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(lbl_complemento))
                    .addGroup(panel_consultaLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(panel_consultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_cidade)
                            .addComponent(lbl_logradouro)
                            .addComponent(lbl_bairro)
                            .addComponent(lbl_cargo)
                            .addComponent(lbl_curso)
                            .addComponent(lbl_telefone)
                            .addComponent(lbl_email)
                            .addComponent(lbl_nome)
                            .addComponent(lbl_ra)
                            .addComponent(lbl_estado)
                            .addComponent(lbl_numero))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_consultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_consultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txt_bairro, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panel_consultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_complemento, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_numero, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txt_logradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_cargo, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_curso, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_ra, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        panel_consultaLayout.setVerticalGroup(
            panel_consultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_consultaLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panel_consultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_ra, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_ra))
                .addGap(10, 10, 10)
                .addGroup(panel_consultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_nome))
                .addGap(10, 10, 10)
                .addGroup(panel_consultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_email))
                .addGap(10, 10, 10)
                .addGroup(panel_consultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_telefone))
                .addGap(10, 10, 10)
                .addGroup(panel_consultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_curso, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_curso))
                .addGap(10, 10, 10)
                .addGroup(panel_consultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_cargo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_cargo))
                .addGap(10, 10, 10)
                .addGroup(panel_consultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_logradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_logradouro))
                .addGap(10, 10, 10)
                .addGroup(panel_consultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_cidade))
                .addGap(10, 10, 10)
                .addGroup(panel_consultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_bairro, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_bairro))
                .addGap(10, 10, 10)
                .addGroup(panel_consultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_estado))
                .addGap(10, 10, 10)
                .addGroup(panel_consultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_numero, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_numero))
                .addGap(10, 10, 10)
                .addGroup(panel_consultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_complemento, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_complemento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(btn_consultar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/datasys/images/Logo Datasys.png"))); // NOI18N

        lbl_consultas.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lbl_consultas.setForeground(new java.awt.Color(255, 255, 255));
        lbl_consultas.setText("<html><p>Para realizar uma alteração, digite o número de RA do aluno</p></html>");

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("⬅ Voltar para o menu");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panel_telaLayout = new javax.swing.GroupLayout(panel_tela);
        panel_tela.setLayout(panel_telaLayout);
        panel_telaLayout.setHorizontalGroup(
            panel_telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_telaLayout.createSequentialGroup()
                .addGroup(panel_telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_telaLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_telaLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(panel_telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(lbl_consultas, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(panel_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        panel_telaLayout.setVerticalGroup(
            panel_telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_telaLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(panel_telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_telaLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_consultas, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(140, 140, 140))
                    .addGroup(panel_telaLayout.createSequentialGroup()
                        .addComponent(panel_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(50, Short.MAX_VALUE))))
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

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        this.dispose();
        TelaMenu menu = new TelaMenu();
        menu.setVisible(true);
    }//GEN-LAST:event_jLabel1MouseClicked

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaAlteração.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAlteração.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAlteração.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAlteração.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAlteração().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_consultar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbl_bairro;
    private javax.swing.JLabel lbl_cargo;
    private javax.swing.JLabel lbl_cidade;
    private javax.swing.JLabel lbl_complemento;
    private javax.swing.JLabel lbl_consultas;
    private javax.swing.JLabel lbl_curso;
    private javax.swing.JLabel lbl_email;
    private javax.swing.JLabel lbl_estado;
    private javax.swing.JLabel lbl_logradouro;
    private javax.swing.JLabel lbl_nome;
    private javax.swing.JLabel lbl_numero;
    private javax.swing.JLabel lbl_ra;
    private javax.swing.JLabel lbl_telefone;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel panel_consulta;
    private javax.swing.JPanel panel_tela;
    private javax.swing.JTextField txt_bairro;
    private javax.swing.JTextField txt_cargo;
    private javax.swing.JTextField txt_cidade;
    private javax.swing.JTextField txt_complemento;
    private javax.swing.JTextField txt_curso;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_estado;
    private javax.swing.JTextField txt_logradouro;
    private javax.swing.JTextField txt_nome;
    private javax.swing.JTextField txt_numero;
    private javax.swing.JTextField txt_ra;
    private javax.swing.JTextField txt_telefone;
    // End of variables declaration//GEN-END:variables
}
