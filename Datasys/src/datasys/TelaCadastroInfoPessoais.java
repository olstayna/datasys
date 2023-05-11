package datasys;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.text.ParseException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.text.MaskFormatter;

public class TelaCadastroInfoPessoais extends javax.swing.JFrame {
    
    String nome,sobrenome,senha,confirma_senha, curso, cargo, telefone, email;
        
    public String getNome() {
        return txt_name.getText();
    }
    
    public String getSobrenome() {
        return txt_lastname.getText();
    }
    
    public String getSenha() {
        return txt_password.getText();
    }
    
    public String getEmail() {
        return txt_email.getText();
    }
    
    public String getTelefone() {
        return campoTelefone.getText();
    }
    
    public String getCurso() {
        return box_curso.getSelectedItem() == null ? "" : box_curso.getSelectedItem().toString();
    }
    
    public String getCargo() {
        return box_cargo.getSelectedItem() == null ? "" : box_cargo.getSelectedItem().toString();
    }
    
    
    public TelaCadastroInfoPessoais() {
        initComponents();
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
    
    public boolean validacao() {
        nome = txt_name.getText();
        sobrenome = txt_lastname.getText();
        senha = txt_password.getText();
        confirma_senha = txt_con_password.getText();
        curso = box_curso.getSelectedItem() == null ? "" : box_curso.getSelectedItem().toString();
        cargo = box_cargo.getSelectedItem() == null ? "" : box_cargo.getSelectedItem().toString();
        telefone = campoTelefone.getText();
        email = txt_email.getText();
        
        
        if(nome.equals("")) {
            JOptionPane.showMessageDialog(this, "Por favor, digite o Nome");
            return false;
        }
        
        if(sobrenome.equals("")) {
            JOptionPane.showMessageDialog(this, "Por favor, digite o Sobrenome");
            return false;
        }  
         
        if(senha.equals("")) {
            JOptionPane.showMessageDialog(this, "Por favor, digite a Senha");
            return false;
        }
        
        if(confirma_senha.equals("")) {
            JOptionPane.showMessageDialog(this, "Por favor, confirme a Senha");
            return false;
        }
        
        if (senha.length() < 8) {
            lbl_password_error.setText("A senha deve possuir 8 caracteres");
        }
        
        if (!senha.equals(confirma_senha)) {
            JOptionPane.showMessageDialog(this, "As senhas devem ser iguais");
            return false;
        }
        
        if (curso.equals("")) {
            JOptionPane.showMessageDialog(this, "Por favor, selecione o Curso");
            return false;
        }

        if (cargo.equals("")) {
            JOptionPane.showMessageDialog(this, "Por favor, selecione o Cargo");
            return false;
        }
        
        if (telefone.equals("")) {
            JOptionPane.showMessageDialog(this, "Por favor, insira o Telefone");
            return false;
        }
        
        if (email.equals("")) {
            JOptionPane.showMessageDialog(this, "Por favor, insira o Email");
            return false;
        }

        return true;
    }
    
    public void ChecarSenha() {
        senha = txt_password.getText();
        if(senha.length() < 8) {
            lbl_password_error.setText("A senha deve possuir 8 caracteres");
        }
        else {
            lbl_password_error.setText("");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_password_error = new javax.swing.JLabel();
        jPanel1 = new jPanelGradient();
        title = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        txt_password = new javax.swing.JPasswordField();
        txt_con_password = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        box_cargo = new javax.swing.JComboBox<>();
        box_curso = new javax.swing.JComboBox<>();
        btn_signup = new javax.swing.JButton();
        txt_lastname = new javax.swing.JTextField();
        campoTelefone = new javax.swing.JFormattedTextField();
        txt_email = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
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
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 145, -1, 20));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(38, 117, 191));
        jLabel3.setText("Sobrenome");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 205, -1, 20));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(38, 117, 191));
        jLabel5.setText("Senha");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 265, -1, 20));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(38, 117, 191));
        jLabel9.setText("Email");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 385, -1, 20));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(38, 117, 191));
        jLabel1.setText("Confirmar senha");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 325, -1, 20));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(38, 117, 191));
        jLabel10.setText("Telefone Celular");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 450, 90, 20));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(38, 117, 191));
        jLabel8.setText("Curso");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 520, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(38, 117, 191));
        jLabel7.setText("Cargo");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 520, -1, -1));

        txt_name.setBackground(new java.awt.Color(245, 245, 245));
        txt_name.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 153, 255)));
        jPanel1.add(txt_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 160, 240, 30));

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

        txt_con_password.setBackground(new java.awt.Color(245, 245, 245));
        txt_con_password.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 153, 255)));
        jPanel1.add(txt_con_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 340, 240, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 153, 255));
        jLabel4.setText("Informações Pessoais");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 90, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Gerenciamento de Alunos");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        box_cargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aluno", "Professor" }));
        box_cargo.setFocusable(false);
        box_cargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_cargoActionPerformed(evt);
            }
        });
        jPanel1.add(box_cargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 540, 100, 30));

        box_curso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADS", "CC", "GTI", "SI", "Design" }));
        box_curso.setFocusable(false);
        box_curso.setName("tese"); // NOI18N
        box_curso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_cursoActionPerformed(evt);
            }
        });
        jPanel1.add(box_curso, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 540, 100, 30));

        btn_signup.setBackground(new java.awt.Color(51, 153, 255));
        btn_signup.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_signup.setForeground(new java.awt.Color(255, 255, 255));
        btn_signup.setText("Continuar");
        btn_signup.setBorder(null);
        btn_signup.setFocusPainted(false);
        btn_signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_signupActionPerformed(evt);
            }
        });
        jPanel1.add(btn_signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 600, 200, 40));

        txt_lastname.setBackground(new java.awt.Color(245, 245, 245));
        txt_lastname.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 153, 255)));
        jPanel1.add(txt_lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 220, 240, 30));

        campoTelefone.setBackground(new java.awt.Color(245, 245, 245));
        campoTelefone.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 153, 255)));
        campoTelefone.setColumns(15);
        MaskFormatter mascaraTelefone = null;
        try {
            mascaraTelefone = new MaskFormatter("(##) #####-####");
            mascaraTelefone.setPlaceholderCharacter('_');
        } catch (ParseException e) {
            e.printStackTrace();
        }
        campoTelefone = new javax.swing.JFormattedTextField(mascaraTelefone);
        campoTelefone.setSelectedTextColor(new java.awt.Color(245, 245, 245));
        campoTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTelefoneActionPerformed(evt);
            }
        });
        jPanel1.add(campoTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 470, 140, 30));

        txt_email.setBackground(new java.awt.Color(245, 245, 245));
        txt_email.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 153, 255)));
        jPanel1.add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 400, 240, 30));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 153, 255));
        jLabel17.setText("CADASTRO");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 50, -1, -1));

        jPanel2.setBackground(new java.awt.Color(245, 245, 245));
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, 360, 630));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_signupActionPerformed
        if(validacao()) {
            this.dispose();
            
            new TelaCadastroEndereço().setVisible(true);
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

    private void campoTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTelefoneActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroInfoPessoais().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> box_cargo;
    private javax.swing.JComboBox<String> box_curso;
    private javax.swing.JButton btn_signup;
    private javax.swing.JFormattedTextField campoTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_password_error;
    private javax.swing.JLabel title;
    private javax.swing.JPasswordField txt_con_password;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_lastname;
    private javax.swing.JTextField txt_name;
    private javax.swing.JPasswordField txt_password;
    // End of variables declaration//GEN-END:variables
}
