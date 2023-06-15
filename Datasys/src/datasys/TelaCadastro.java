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

public class TelaCadastro extends javax.swing.JFrame {
    
    String nome, sobrenome, senha, confirma_senha, email, telefone, curso, cargo;
    public int RA;
    int id;
        
    public TelaCadastro() {
        initComponents();
        Utils util = new Utils();
        util.setIconImage(this);
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
    
     public int getId() {
        try {
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
    
    private boolean validarDados() {
        nome = txt_nome.getText();
        sobrenome = txt_sobrenome.getText();
        senha = txt_senha.getText();
        confirma_senha = txt_con_senha.getText();
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
        if (senha.length()<8) {
            lbl_password_error.setText("A senha deve possuir 8 caracteres");
        }
        if(senha.length() > 20) {
            lbl_password_error.setText("A senha deve possuir até 20 caracteres");
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
        if (email.equals("")) {
            JOptionPane.showMessageDialog(this, "Por favor, insira um Email");
            return false;
        }
        if (telefone.equals("")) {
            JOptionPane.showMessageDialog(this, "Por favor, insira um Telefone");
            return false;
        }
        return true;
    }
    
    public void ChecarSenha() {
        senha = txt_senha.getText();
        if(senha.length()<8) {
            lbl_password_error.setText("A senha deve possuir 8 caracteres");
        }
        else {
            lbl_password_error.setText("");
        }
    }
    
    public int gerarRA() {
        Random random = new Random();
        int numero = random.nextInt(1000000000);
        RA = numero;
        return RA;
    }
    
    private void insertDetails() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/datasys","root","");
            String sql = "insert into login values(?,?,?,?,?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, getId());
            stmt.setInt(2, gerarRA());
            stmt.setString(3, nome.trim());
            stmt.setString(4, sobrenome.trim());
            stmt.setString(5, senha.trim());
            stmt.setString(6, email.trim());
            stmt.setString(7, telefone.trim());
            stmt.setString(8, curso.trim());
            stmt.setString(9, cargo.trim());
            int i = stmt.executeUpdate();
            if(i>0) {
                
            } else {
                JOptionPane.showMessageDialog(this, "Usuário não inserido");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_tela = new jPanelGradient();
        image = new javax.swing.JLabel();
        label_descricao = new javax.swing.JLabel();
        panel_campos = new javax.swing.JPanel();
        lbl_title = new javax.swing.JLabel();
        lbl_endereco = new javax.swing.JLabel();
        lbl_nome = new javax.swing.JLabel();
        txt_nome = new javax.swing.JTextField();
        lbl_sobrenome = new javax.swing.JLabel();
        txt_sobrenome = new javax.swing.JTextField();
        lbl_senha = new javax.swing.JLabel();
        txt_senha = new javax.swing.JPasswordField();
        lxl_con_senha = new javax.swing.JLabel();
        txt_con_senha = new javax.swing.JPasswordField();
        lbl_email = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        lbl_telefone = new javax.swing.JLabel();
        campoTelefone = new javax.swing.JFormattedTextField();
        lbl_curso = new javax.swing.JLabel();
        btn_continuar = new javax.swing.JButton();
        box_cargo = new javax.swing.JComboBox<>();
        lbl_cargo = new javax.swing.JLabel();
        box_curso = new javax.swing.JComboBox<>();
        lbl_password_error = new javax.swing.JLabel();
        lbl_voltar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastrar - Datasys");
        setSize(new java.awt.Dimension(870, 700));

        panel_tela.setRequestFocusEnabled(false);
        setSize(835,703);
        setLocationRelativeTo(null);

        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N

        label_descricao.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        label_descricao.setForeground(new java.awt.Color(255, 255, 255));
        label_descricao.setText("<html><p>Gerenciamento de Alunos</p></html>");

        panel_campos.setBackground(new java.awt.Color(245, 245, 245));

        lbl_title.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        lbl_title.setForeground(new java.awt.Color(102, 153, 255));
        lbl_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_title.setText("CADASTRO");

        lbl_endereco.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_endereco.setForeground(new java.awt.Color(102, 153, 255));
        lbl_endereco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_endereco.setText("Informações pessoais");

        lbl_nome.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lbl_nome.setForeground(new java.awt.Color(38, 117, 191));
        lbl_nome.setText("Nome");

        txt_nome.setBackground(new java.awt.Color(245, 245, 245));
        txt_nome.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        txt_nome.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 153, 255)));

        lbl_sobrenome.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lbl_sobrenome.setForeground(new java.awt.Color(38, 117, 191));
        lbl_sobrenome.setText("Sobrenome");

        txt_sobrenome.setBackground(new java.awt.Color(245, 245, 245));
        txt_sobrenome.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        txt_sobrenome.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 153, 255)));

        lbl_senha.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lbl_senha.setForeground(new java.awt.Color(38, 117, 191));
        lbl_senha.setText("Senha");

        txt_senha.setBackground(new java.awt.Color(245, 245, 245));
        txt_senha.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        txt_senha.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 153, 255)));
        txt_senha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_senhaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_senhaKeyReleased(evt);
            }
        });

        lxl_con_senha.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lxl_con_senha.setForeground(new java.awt.Color(38, 117, 191));
        lxl_con_senha.setText("Confirmar senha");

        txt_con_senha.setBackground(new java.awt.Color(245, 245, 245));
        txt_con_senha.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        txt_con_senha.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 153, 255)));

        lbl_email.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lbl_email.setForeground(new java.awt.Color(38, 117, 191));
        lbl_email.setText("Email");

        txt_email.setBackground(new java.awt.Color(245, 245, 245));
        txt_email.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        txt_email.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 153, 255)));

        lbl_telefone.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lbl_telefone.setForeground(new java.awt.Color(38, 117, 191));
        lbl_telefone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_telefone.setText("Telefone Celular");

        campoTelefone.setBackground(new java.awt.Color(245, 245, 245));
        campoTelefone.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 153, 255)));
        campoTelefone.setColumns(15);
        campoTelefone.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        campoTelefone.setSelectedTextColor(new java.awt.Color(245, 245, 245));

        lbl_curso.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lbl_curso.setForeground(new java.awt.Color(38, 117, 191));
        lbl_curso.setText("Curso");

        btn_continuar.setBackground(new java.awt.Color(51, 153, 255));
        btn_continuar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_continuar.setForeground(new java.awt.Color(255, 255, 255));
        btn_continuar.setText("Continuar Cadastro");
        btn_continuar.setBorder(null);
        btn_continuar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_continuar.setFocusPainted(false);
        btn_continuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_continuarActionPerformed(evt);
            }
        });

        box_cargo.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        box_cargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Professor", "Aluno" }));
        box_cargo.setSelectedIndex(1);
        box_cargo.setSelectedItem(null);
        box_cargo.setFocusable(false);

        lbl_cargo.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lbl_cargo.setForeground(new java.awt.Color(38, 117, 191));
        lbl_cargo.setText("Cargo");

        box_curso.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        box_curso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADS", "CC", "GTI", "SI", "Design" }));
        box_curso.setSelectedItem(null);
        box_curso.setFocusable(false);
        box_curso.setName("tese"); // NOI18N

        javax.swing.GroupLayout panel_camposLayout = new javax.swing.GroupLayout(panel_campos);
        panel_campos.setLayout(panel_camposLayout);
        panel_camposLayout.setHorizontalGroup(
            panel_camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_camposLayout.createSequentialGroup()
                .addGroup(panel_camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_camposLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(panel_camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_camposLayout.createSequentialGroup()
                                .addGroup(panel_camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(box_curso, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_curso))
                                .addGap(18, 18, 18)
                                .addGroup(panel_camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_cargo)
                                    .addComponent(box_cargo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btn_continuar, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel_camposLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(campoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_camposLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(panel_camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_nome, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                            .addComponent(txt_sobrenome, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                            .addComponent(lbl_sobrenome)
                            .addComponent(txt_senha, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                            .addComponent(lxl_con_senha)
                            .addComponent(lbl_email)
                            .addComponent(txt_email, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                            .addComponent(lbl_senha)
                            .addComponent(txt_con_senha, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                            .addComponent(lbl_nome)
                            .addComponent(lbl_telefone, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                            .addComponent(lbl_title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_endereco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        panel_camposLayout.setVerticalGroup(
            panel_camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_camposLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbl_title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_endereco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(lbl_nome)
                .addGap(0, 0, 0)
                .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(lbl_sobrenome)
                .addGap(0, 0, 0)
                .addComponent(txt_sobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(lbl_senha)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txt_senha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(lxl_con_senha)
                .addGap(0, 0, 0)
                .addComponent(txt_con_senha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(lbl_email)
                .addGap(0, 0, 0)
                .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(lbl_telefone)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(panel_camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_cargo)
                    .addComponent(lbl_curso))
                .addGap(0, 0, 0)
                .addGroup(panel_camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(box_curso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(box_cargo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(btn_continuar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        lbl_password_error.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_password_error.setForeground(new java.awt.Color(255, 0, 0));

        lbl_voltar.setForeground(new java.awt.Color(255, 255, 255));
        lbl_voltar.setText("⬅ Voltar para o menu");
        lbl_voltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_voltarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panel_telaLayout = new javax.swing.GroupLayout(panel_tela);
        panel_tela.setLayout(panel_telaLayout);
        panel_telaLayout.setHorizontalGroup(
            panel_telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_telaLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(panel_telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_voltar)
                    .addGroup(panel_telaLayout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(lbl_password_error, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_telaLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(panel_telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_descricao, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel_telaLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(image)))))
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panel_campos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        panel_telaLayout.setVerticalGroup(
            panel_telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_telaLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(panel_telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_telaLayout.createSequentialGroup()
                        .addComponent(lbl_voltar)
                        .addGap(81, 81, 81)
                        .addComponent(label_descricao, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(image)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_password_error, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panel_campos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        getContentPane().add(panel_tela, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_continuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_continuarActionPerformed
        if(validarDados()) {
            insertDetails();
            TelaEndereco endereco = new TelaEndereco();
            endereco.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btn_continuarActionPerformed

    private void txt_senhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_senhaKeyPressed
        ChecarSenha();
    }//GEN-LAST:event_txt_senhaKeyPressed

    private void txt_senhaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_senhaKeyReleased
        ChecarSenha();
    }//GEN-LAST:event_txt_senhaKeyReleased

    private void lbl_voltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_voltarMouseClicked
        this.dispose();
        TelaMenu menu = new TelaMenu();
        menu.setVisible(true);
        String username = UserSession.getInstance().getLoggedInUser();
        TelaMenu.nome_usuario.setText("RA: "+username);
    }//GEN-LAST:event_lbl_voltarMouseClicked

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> box_cargo;
    private javax.swing.JComboBox<String> box_curso;
    private javax.swing.JButton btn_continuar;
    private javax.swing.JFormattedTextField campoTelefone;
    private javax.swing.JLabel image;
    private javax.swing.JLabel label_descricao;
    private javax.swing.JLabel lbl_cargo;
    private javax.swing.JLabel lbl_curso;
    private javax.swing.JLabel lbl_email;
    private javax.swing.JLabel lbl_endereco;
    private javax.swing.JLabel lbl_nome;
    private javax.swing.JLabel lbl_password_error;
    private javax.swing.JLabel lbl_senha;
    private javax.swing.JLabel lbl_sobrenome;
    private javax.swing.JLabel lbl_telefone;
    private javax.swing.JLabel lbl_title;
    private javax.swing.JLabel lbl_voltar;
    private javax.swing.JLabel lxl_con_senha;
    private javax.swing.JPanel panel_campos;
    private javax.swing.JPanel panel_tela;
    private javax.swing.JPasswordField txt_con_senha;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_nome;
    private javax.swing.JPasswordField txt_senha;
    private javax.swing.JTextField txt_sobrenome;
    // End of variables declaration//GEN-END:variables
}
