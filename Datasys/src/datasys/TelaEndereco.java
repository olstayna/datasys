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
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TelaEndereco extends javax.swing.JFrame {

    String logradouro, cidade, numero, estado, complemento, bairro;
    int id;
    TelaCadastro cadastro = new TelaCadastro();
    
    public TelaEndereco() {
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
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_tela = new jPanelGradient();
        panel_campos = new javax.swing.JPanel();
        box_estado = new javax.swing.JComboBox<>();
        btn_signup = new javax.swing.JButton();
        txt_cidade = new javax.swing.JTextField();
        txt_bairro = new javax.swing.JTextField();
        txt_complemento = new javax.swing.JTextField();
        txt_logradouro = new javax.swing.JTextField();
        txt_numero = new javax.swing.JTextField();
        label_complemento = new javax.swing.JLabel();
        label_numero = new javax.swing.JLabel();
        label_estado = new javax.swing.JLabel();
        label_bairro = new javax.swing.JLabel();
        label_cidade = new javax.swing.JLabel();
        label_logradouro = new javax.swing.JLabel();
        label_endereco_title = new javax.swing.JLabel();
        label_title = new javax.swing.JLabel();
        lbl_descricao = new javax.swing.JLabel();
        title = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastrar Endereço - Datasys");
        setResizable(false);
        setSize(new java.awt.Dimension(870, 590));

        setSize(787,531);
        setLocationRelativeTo(null);

        panel_campos.setBackground(new java.awt.Color(245, 245, 245));

        box_estado.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        box_estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        box_estado.setFocusable(false);

        btn_signup.setBackground(new java.awt.Color(51, 153, 255));
        btn_signup.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_signup.setForeground(new java.awt.Color(255, 255, 255));
        btn_signup.setText("Cadastrar");
        btn_signup.setBorder(null);
        btn_signup.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_signup.setFocusPainted(false);
        btn_signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_signupActionPerformed(evt);
            }
        });

        txt_cidade.setBackground(new java.awt.Color(245, 245, 245));
        txt_cidade.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        txt_cidade.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 153, 255)));

        txt_bairro.setBackground(new java.awt.Color(245, 245, 245));
        txt_bairro.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        txt_bairro.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 153, 255)));

        txt_complemento.setBackground(new java.awt.Color(245, 245, 245));
        txt_complemento.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        txt_complemento.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 153, 255)));

        txt_logradouro.setBackground(new java.awt.Color(245, 245, 245));
        txt_logradouro.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        txt_logradouro.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 153, 255)));

        txt_numero.setBackground(new java.awt.Color(245, 245, 245));
        txt_numero.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        txt_numero.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 153, 255)));

        label_complemento.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        label_complemento.setForeground(new java.awt.Color(38, 117, 191));
        label_complemento.setText("Complemento");

        label_numero.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        label_numero.setForeground(new java.awt.Color(38, 117, 191));
        label_numero.setText("Número");

        label_estado.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        label_estado.setForeground(new java.awt.Color(38, 117, 191));
        label_estado.setText("Estado");

        label_bairro.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        label_bairro.setForeground(new java.awt.Color(38, 117, 191));
        label_bairro.setText("Bairro");

        label_cidade.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        label_cidade.setForeground(new java.awt.Color(38, 117, 191));
        label_cidade.setText("Cidade");

        label_logradouro.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        label_logradouro.setForeground(new java.awt.Color(38, 117, 191));
        label_logradouro.setText("Logradouro");

        label_endereco_title.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label_endereco_title.setForeground(new java.awt.Color(102, 153, 255));
        label_endereco_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_endereco_title.setText("Endereço");

        label_title.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        label_title.setForeground(new java.awt.Color(102, 153, 255));
        label_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_title.setText("CADASTRO");

        javax.swing.GroupLayout panel_camposLayout = new javax.swing.GroupLayout(panel_campos);
        panel_campos.setLayout(panel_camposLayout);
        panel_camposLayout.setHorizontalGroup(
            panel_camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_camposLayout.createSequentialGroup()
                .addGroup(panel_camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_camposLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(panel_camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_logradouro)
                            .addComponent(label_logradouro)
                            .addComponent(label_cidade)
                            .addComponent(txt_cidade)
                            .addGroup(panel_camposLayout.createSequentialGroup()
                                .addComponent(txt_numero, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt_complemento, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(label_title, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                            .addComponent(label_endereco_title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panel_camposLayout.createSequentialGroup()
                                .addGroup(panel_camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_bairro, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label_numero)
                                    .addComponent(label_bairro))
                                .addGap(18, 18, 18)
                                .addGroup(panel_camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label_estado)
                                    .addComponent(label_complemento)
                                    .addComponent(box_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(panel_camposLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(btn_signup, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        panel_camposLayout.setVerticalGroup(
            panel_camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_camposLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(label_title)
                .addGap(0, 0, 0)
                .addComponent(label_endereco_title)
                .addGap(35, 35, 35)
                .addComponent(label_logradouro)
                .addGap(0, 0, 0)
                .addComponent(txt_logradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(label_cidade)
                .addGap(0, 0, 0)
                .addComponent(txt_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(panel_camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_estado)
                    .addComponent(label_bairro))
                .addGap(0, 0, 0)
                .addGroup(panel_camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_bairro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(box_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(panel_camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_complemento)
                    .addComponent(label_numero))
                .addGap(0, 0, 0)
                .addGroup(panel_camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_numero, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_complemento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(btn_signup, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        lbl_descricao.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lbl_descricao.setForeground(new java.awt.Color(255, 255, 255));
        lbl_descricao.setText("<html><p>Gerenciamento de Alunos</p></html>");

        title.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N

        javax.swing.GroupLayout panel_telaLayout = new javax.swing.GroupLayout(panel_tela);
        panel_tela.setLayout(panel_telaLayout);
        panel_telaLayout.setHorizontalGroup(
            panel_telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_telaLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(panel_telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title)
                    .addComponent(lbl_descricao, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75)
                .addComponent(panel_campos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        panel_telaLayout.setVerticalGroup(
            panel_telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_telaLayout.createSequentialGroup()
                .addGroup(panel_telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_telaLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(panel_campos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_telaLayout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(lbl_descricao, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(title)))
                .addGap(50, 50, 50))
        );

        getContentPane().add(panel_tela, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private boolean validarDados() {
        logradouro = txt_logradouro.getText();
        cidade = txt_cidade.getText();
        numero = txt_numero.getText();
        estado = box_estado.getSelectedItem() == null ? "" : box_estado.getSelectedItem().toString();
        complemento = txt_complemento.getText();
        bairro = txt_bairro.getText();
        
        if(logradouro.equals("")) {
            JOptionPane.showMessageDialog(this, "Por favor, digite o Logradouro");
            return false;
        }
        if(cidade.equals("")) {
            JOptionPane.showMessageDialog(this, "Por favor, digite a Cidade");
            return false;
        }  
        if(numero.equals("")) {
            JOptionPane.showMessageDialog(this, "Por favor, digite o Número");
            return false;
        }
        if(estado.equals("")) {
            JOptionPane.showMessageDialog(this, "Por favor, digite o Estado");
            return false;
        }   
        if(bairro.equals("")) {
            JOptionPane.showMessageDialog(this, "Por favor, digite o Bairro");
            return false;
        }
        return true;
    }
    
    public int getId() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/datasys","root","");
            String sql = "select max(id) from endereco";
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
    
    private void insertDetails() {
        try {
            
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/datasys","root","");
        String raQuery = "SELECT RA FROM login ORDER BY ID DESC LIMIT 1";
        PreparedStatement raStmt = con.prepareStatement(raQuery);
        ResultSet raResult = raStmt.executeQuery();
        int ra = 0;
        if (raResult.next()) {
            ra = raResult.getInt("RA");
        }

        // Inserir dados na tabela de endereço usando o RA obtido
        String enderecoQuery = "INSERT INTO endereco (id, RA, logradouro, cidade, numero, estado, bairro, complemento) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement enderecoStmt = con.prepareStatement(enderecoQuery);
        enderecoStmt.setInt(1, getId());
        enderecoStmt.setInt(2, ra);
        enderecoStmt.setString(3, logradouro.trim());
        enderecoStmt.setString(4, cidade.trim());
        enderecoStmt.setString(5, numero.trim());
        enderecoStmt.setString(6, estado.trim());
        enderecoStmt.setString(7, bairro.trim());
        enderecoStmt.setString(8, complemento.trim());
        int i = enderecoStmt.executeUpdate();
        if (i > 0) {
            JOptionPane.showMessageDialog(this, "Usuário inserido");
            this.dispose();
            cadastro.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Usuário não inserido");
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
}
    
    private void btn_signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_signupActionPerformed
        if(validarDados()) {
            insertDetails();
        }
    }//GEN-LAST:event_btn_signupActionPerformed

   
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaEndereco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEndereco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEndereco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEndereco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEndereco().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> box_estado;
    private javax.swing.JButton btn_signup;
    private javax.swing.JLabel label_bairro;
    private javax.swing.JLabel label_cidade;
    private javax.swing.JLabel label_complemento;
    private javax.swing.JLabel label_endereco_title;
    private javax.swing.JLabel label_estado;
    private javax.swing.JLabel label_logradouro;
    private javax.swing.JLabel label_numero;
    private javax.swing.JLabel label_title;
    private javax.swing.JLabel lbl_descricao;
    private javax.swing.JPanel panel_campos;
    private javax.swing.JPanel panel_tela;
    private javax.swing.JLabel title;
    private javax.swing.JTextField txt_bairro;
    private javax.swing.JTextField txt_cidade;
    private javax.swing.JTextField txt_complemento;
    private javax.swing.JTextField txt_logradouro;
    private javax.swing.JTextField txt_numero;
    // End of variables declaration//GEN-END:variables
}
