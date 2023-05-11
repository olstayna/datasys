package datasys;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TelaCadastroEndereço extends javax.swing.JFrame {
    
    String logradouro, cidade, estado, numero, complemento, bairro;
        
    public TelaCadastroEndereço() {
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
    
    boolean validacao()
    {
        logradouro = txt_logradouro.getText();
        cidade = txt_cidade.getText();
        numero = txt_numero.getText();
        estado = box_estado.getSelectedItem() == null ? "" : box_estado.getSelectedItem().toString();
        complemento = txt_complemento.getText();
        bairro = txt_bairro.getText();
        
        if(logradouro.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Por favor, digite o Logradouro");
            return false;
        }
        
        if(cidade.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Por favor, digite a Cidade");
            return false;
        }  
         
        if(numero.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Por favor, digite o Número");
            return false;
        }
        
        if(estado.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Por favor, digite o Estado");
            return false;
        }
        
        if(bairro.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Por favor, digite o Bairro");
            return false;
        }

        return true;
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new jPanelGradient();
        jLabel12 = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txt_logradouro = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_cidade = new javax.swing.JTextField();
        txt_bairro = new javax.swing.JTextField();
        txt_numero = new javax.swing.JTextField();
        txt_complemento = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        btn_signup = new javax.swing.JButton();
        box_estado = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(870, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(38, 117, 191));
        jLabel12.setText("Cidade");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 210, -1, -1));

        title.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("DataSys");
        jPanel3.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(38, 117, 191));
        jLabel11.setText("Logradouro");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 150, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(38, 117, 191));
        jLabel16.setText("Complemento");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 330, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(38, 117, 191));
        jLabel15.setText("Número");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 330, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(38, 117, 191));
        jLabel13.setText("Bairro");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 270, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(38, 117, 191));
        jLabel14.setText("Estado");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 265, -1, 20));

        txt_logradouro.setBackground(new java.awt.Color(245, 245, 245));
        txt_logradouro.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        txt_logradouro.setForeground(new java.awt.Color(102, 102, 102));
        txt_logradouro.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 153, 255)));
        jPanel3.add(txt_logradouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 160, 240, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 153, 255));
        jLabel4.setText("Endereço");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 90, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Gerenciamento de Alunos");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        txt_cidade.setBackground(new java.awt.Color(245, 245, 245));
        txt_cidade.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        txt_cidade.setForeground(new java.awt.Color(102, 102, 102));
        txt_cidade.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 153, 255)));
        jPanel3.add(txt_cidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 220, 240, 30));

        txt_bairro.setBackground(new java.awt.Color(245, 245, 245));
        txt_bairro.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        txt_bairro.setForeground(new java.awt.Color(102, 102, 102));
        txt_bairro.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 153, 255)));
        jPanel3.add(txt_bairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 280, 110, 30));

        txt_numero.setBackground(new java.awt.Color(245, 245, 245));
        txt_numero.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        txt_numero.setForeground(new java.awt.Color(102, 102, 102));
        txt_numero.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 153, 255)));
        jPanel3.add(txt_numero, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 340, 110, 30));

        txt_complemento.setBackground(new java.awt.Color(245, 245, 245));
        txt_complemento.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        txt_complemento.setForeground(new java.awt.Color(102, 102, 102));
        txt_complemento.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 153, 255)));
        jPanel3.add(txt_complemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 340, 110, 30));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 153, 255));
        jLabel17.setText("CADASTRO");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 50, -1, -1));

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
        jPanel3.add(btn_signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 420, 200, 40));

        box_estado.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        box_estado.setForeground(new java.awt.Color(102, 102, 102));
        box_estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        box_estado.setFocusable(false);
        box_estado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_estadoActionPerformed(evt);
            }
        });
        jPanel3.add(box_estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 280, 110, 30));

        jPanel2.setBackground(new java.awt.Color(245, 245, 245));
        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 40, 360, 450));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_signupActionPerformed
        ConexaoDB conexaodb = new ConexaoDB();
        TelaCadastroInfoPessoais pessoais = new TelaCadastroInfoPessoais();
        
        if(validacao()) {
            conexaodb.insertDetails(pessoais.getNome(), pessoais.getSobrenome(), pessoais.getSenha(), pessoais.getEmail(), pessoais.getTelefone(), pessoais.getCurso(), pessoais.getCargo(), logradouro, cidade, bairro, estado, numero, complemento);
        }
    }//GEN-LAST:event_btn_signupActionPerformed

    private void box_estadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_estadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_box_estadoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroEndereço.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroEndereço.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroEndereço.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroEndereço.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroEndereço().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> box_estado;
    private javax.swing.JButton btn_signup;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel title;
    private javax.swing.JTextField txt_bairro;
    private javax.swing.JTextField txt_cidade;
    private javax.swing.JTextField txt_complemento;
    private javax.swing.JTextField txt_logradouro;
    private javax.swing.JTextField txt_numero;
    // End of variables declaration//GEN-END:variables
}
