package datasys;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TelaGerenciamento extends javax.swing.JFrame {
    
    public TelaGerenciamento() {
        initComponents();
        User_Load();
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
    
    
    public void User_Load() {
        PreparedStatement pst;
        PreparedStatement pst1;
        ResultSet rs;
        ResultSet rs1;
        DefaultTableModel d;
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/datasys", "root", "");
            pst = con.prepareStatement("SELECT RA, NOME, SOBRENOME, EMAIL, TELEFONE, CURSO, CARGO FROM login");
            pst1 = con.prepareStatement("SELECT LOGRADOURO, CIDADE, NUMERO, ESTADO, BAIRRO, COMPLEMENTO FROM endereco");
            rs = pst.executeQuery();
            rs1 = pst1.executeQuery();

            ResultSetMetaData rsd = rs.getMetaData();
            ResultSetMetaData rsd1 = rs1.getMetaData();
            int c = rsd.getColumnCount() + rsd1.getColumnCount();

            d = (DefaultTableModel) jTable1.getModel();
            d.setRowCount(0);

            while (rs.next() && rs1.next()) {
                Vector<Object> v = new Vector<>();

                for (int i = 1; i <= rsd.getColumnCount(); i++) {
                    v.add(rs.getObject(i));
                }

                for (int i = 1; i <= rsd1.getColumnCount(); i++) {
                    v.add(rs1.getObject(i));
                }

                d.addRow(v);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_tela = new jPanelGradient();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        title = new javax.swing.JLabel();
        lbl_descricao = new javax.swing.JLabel();
        btn_consultar = new javax.swing.JButton();
        btn_alterar = new javax.swing.JButton();
        btn_excluir = new javax.swing.JButton();
        lbl_voltar13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Excluir - Datasys");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "RA", "NOME", "SOBRENOME", "EMAIL", "TELEFONE", "CURSO", "CARGO", "LOGRADOURO", "CIDADE", "NUMERO", "ESTADO", "BAIRRO", "COMPLEMENTO"
            }
        ));
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane1.setViewportView(jTable1);

        title.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setIcon(new javax.swing.ImageIcon(getClass().getResource("/datasys/images/Logo Datasys.png"))); // NOI18N

        lbl_descricao.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lbl_descricao.setForeground(new java.awt.Color(255, 255, 255));
        lbl_descricao.setText("<html><p>Gerenciamento de Alunos</p></html>");

        btn_consultar.setBackground(new java.awt.Color(0, 204, 0));
        btn_consultar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_consultar.setForeground(new java.awt.Color(255, 255, 255));
        btn_consultar.setText("Consultar");
        btn_consultar.setBorder(null);
        btn_consultar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_consultar.setFocusPainted(false);
        btn_consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultarActionPerformed(evt);
            }
        });

        btn_alterar.setBackground(new java.awt.Color(51, 153, 255));
        btn_alterar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_alterar.setForeground(new java.awt.Color(255, 255, 255));
        btn_alterar.setText("Alterar");
        btn_alterar.setBorder(null);
        btn_alterar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_alterar.setFocusPainted(false);
        btn_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alterarActionPerformed(evt);
            }
        });

        btn_excluir.setBackground(new java.awt.Color(255, 0, 0));
        btn_excluir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_excluir.setForeground(new java.awt.Color(255, 255, 255));
        btn_excluir.setText("Excluir");
        btn_excluir.setBorder(null);
        btn_excluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_excluir.setFocusPainted(false);
        btn_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excluirActionPerformed(evt);
            }
        });

        lbl_voltar13.setForeground(new java.awt.Color(255, 255, 255));
        lbl_voltar13.setText("⬅ Voltar para o menu");
        lbl_voltar13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_voltar13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_voltar13MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panel_telaLayout = new javax.swing.GroupLayout(panel_tela);
        panel_tela.setLayout(panel_telaLayout);
        panel_telaLayout.setHorizontalGroup(
            panel_telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_telaLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(panel_telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_voltar13)
                    .addComponent(lbl_descricao, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(panel_telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panel_telaLayout.createSequentialGroup()
                        .addComponent(btn_consultar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addGap(50, 50, 50))
        );
        panel_telaLayout.setVerticalGroup(
            panel_telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_telaLayout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(panel_telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel_telaLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(panel_telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_consultar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50))
                    .addGroup(panel_telaLayout.createSequentialGroup()
                        .addComponent(lbl_voltar13)
                        .addGap(18, 18, 18)
                        .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(lbl_descricao, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74))))
        );

        getContentPane().add(panel_tela, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void consultarAluno() {
        PreparedStatement pst;
        PreparedStatement pst1;
        ResultSet rs;
        ResultSet rs1;
        DefaultTableModel d;
        String ra = JOptionPane.showInputDialog(null, "Digite o RA do aluno:");
        
        if(ra != null && !ra.isEmpty()) {
            try {
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/datasys", "root", "");
                pst = con.prepareStatement("SELECT RA, NOME, SOBRENOME, EMAIL, TELEFONE, CURSO, CARGO FROM login WHERE ra = ?");
                pst1 = con.prepareStatement("SELECT LOGRADOURO, CIDADE, NUMERO, ESTADO, BAIRRO, COMPLEMENTO FROM endereco WHERE ra = ?");
                pst.setString(1, ra);
                pst1.setString(1, ra);
                rs = pst.executeQuery();
                rs1 = pst1.executeQuery();

                ResultSetMetaData rsd = rs.getMetaData();
                ResultSetMetaData rsd1 = rs1.getMetaData();
                int c = rsd.getColumnCount() + rsd1.getColumnCount();

                d = (DefaultTableModel) jTable1.getModel();
                d.setRowCount(0);
                
                if (rs.next() && rs1.next()) {
                    Vector<Object> v = new Vector<>();

                    for (int i = 1; i <= rsd.getColumnCount(); i++) {
                        v.add(rs.getObject(i));
                        d.setRowCount(0);
                   }

                    for (int i = 1; i <= rsd1.getColumnCount(); i++) {
                        v.add(rs1.getObject(i));
                        d.setRowCount(0);
                    }

                    d.addRow(v);
                } else {
                    JOptionPane.showMessageDialog(null, "Aluno não encontrado");
                }
            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Erro ao consultar aluno: " + e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "RA Inválido");
        }
    }
    
    
    
    private void editarAluno() {                                           
        PreparedStatement pst;
        PreparedStatement pst1;
        DefaultTableModel d;
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/datasys", "root", "");
            d = (DefaultTableModel) jTable1.getModel();
            int selectIndex = jTable1.getSelectedRow();

            if(selectIndex != -1) {
                int ra = (int) d.getValueAt(selectIndex, 0);

                pst = con.prepareStatement("update login set RA=?, NOME=?, SOBRENOME=?, EMAIL=?, TELEFONE=?, CURSO=?, CARGO=? where RA=?");
                pst1 = con.prepareStatement("update endereco set LOGRADOURO=?, CIDADE=?, NUMERO=?, ESTADO=?, BAIRRO=?, COMPLEMENTO=? where RA=?");

                pst.setInt(1, ra);
                pst.setString(2, (String) jTable1.getValueAt(selectIndex, 1));
                pst.setString(3, (String) jTable1.getValueAt(selectIndex, 2));
                pst.setString(4, (String) jTable1.getValueAt(selectIndex, 3));
                pst.setString(5, (String) jTable1.getValueAt(selectIndex, 4));
                pst.setString(6, (String) jTable1.getValueAt(selectIndex, 5));
                pst.setString(7, (String) jTable1.getValueAt(selectIndex, 6));
                pst.setInt(8, ra);
                
                pst1.setString(1, (String) jTable1.getValueAt(selectIndex, 7));
                pst1.setString(2, (String) jTable1.getValueAt(selectIndex, 8));
                pst1.setString(3, (String) jTable1.getValueAt(selectIndex, 9));
                pst1.setString(4, (String) jTable1.getValueAt(selectIndex, 10));
                pst1.setString(5, (String) jTable1.getValueAt(selectIndex, 11));
                pst1.setString(6, (String) jTable1.getValueAt(selectIndex, 12));
                pst1.setInt(7, ra);
                pst.executeUpdate();
                pst1.executeUpdate();
                JOptionPane.showMessageDialog(null, "user details edited successfully...");

                User_Load();
            } else {
                JOptionPane.showMessageDialog(null, "Selecione um aluno para editar");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO: "+ ex.getMessage());
        }
    }
    
    private void excluirAluno() {
    DefaultTableModel d = (DefaultTableModel) jTable1.getModel();
    int selectIndex = jTable1.getSelectedRow();

        if (selectIndex != -1) {
            int ra = (int) d.getValueAt(selectIndex, 0);

            int confirm = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir este aluno?", "Confirmar Exclusão", JOptionPane.YES_NO_OPTION);

            if (confirm == JOptionPane.YES_OPTION) {
                try {
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/datasys", "root", "");
                    PreparedStatement pst = con.prepareStatement("DELETE FROM login WHERE RA=?");
                    PreparedStatement pst1 = con.prepareStatement("DELETE FROM endereco WHERE RA=?");

                    pst.setInt(1, ra);
                    pst1.setInt(1, ra);

                    int rowsAffected1 = pst1.executeUpdate();
                    int rowsAffected2 = pst.executeUpdate();

                    if (rowsAffected1 > 0 && rowsAffected2 > 0) {
                        JOptionPane.showMessageDialog(null, "Aluno excluído com sucesso");
                        User_Load();
                    } else {
                        JOptionPane.showMessageDialog(null, "Erro ao excluir aluno");
                    }

                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao excluir aluno: " + ex.getMessage());
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um aluno para excluir");
        }
    }

    
    private void btn_consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultarActionPerformed
        consultarAluno();
    }//GEN-LAST:event_btn_consultarActionPerformed

    private void btn_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alterarActionPerformed
        editarAluno();
    }//GEN-LAST:event_btn_alterarActionPerformed

    private void btn_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluirActionPerformed
        excluirAluno();
    }//GEN-LAST:event_btn_excluirActionPerformed

    private void lbl_voltar13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_voltar13MouseClicked
        this.dispose();
        TelaMenu menu = new TelaMenu();
        menu.setVisible(true);
    }//GEN-LAST:event_lbl_voltar13MouseClicked

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaGerenciamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaGerenciamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaGerenciamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaGerenciamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaGerenciamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_alterar;
    private javax.swing.JButton btn_consultar;
    private javax.swing.JButton btn_excluir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbl_descricao;
    private javax.swing.JLabel lbl_voltar10;
    private javax.swing.JLabel lbl_voltar11;
    private javax.swing.JLabel lbl_voltar12;
    private javax.swing.JLabel lbl_voltar13;
    private javax.swing.JLabel lbl_voltar3;
    private javax.swing.JLabel lbl_voltar4;
    private javax.swing.JLabel lbl_voltar5;
    private javax.swing.JLabel lbl_voltar6;
    private javax.swing.JLabel lbl_voltar7;
    private javax.swing.JLabel lbl_voltar8;
    private javax.swing.JLabel lbl_voltar9;
    private javax.swing.JPanel panel_tela;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
