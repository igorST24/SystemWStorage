/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.wstorage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Igor Stein
 */
public class tela_cadastroFuncionario extends javax.swing.JFrame {
    // Estabelecer conexão com o banco
    Connection conexao = null;
    PreparedStatement statement = null;    
    String url = "jdbc:mysql://localhost/wstorage_db";
    String usuario = "root";
    String senha = "247022";
    /**
     * Creates new form tela_cadastroFuncionario
     */
    public tela_cadastroFuncionario() {
        initComponents();
    }
    
    public void limparCampos () {
        // Classe criada para limpar campos
        txt_nome.setText("");
        txt_cpf.setText("");
        txta_descricao.setText("");
        txt_senha.setText("");
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_funcionario = new javax.swing.JPanel();
        lbl_funcionario = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lbl_nome = new javax.swing.JLabel();
        txt_nome = new javax.swing.JTextField();
        lbl_foto = new javax.swing.JLabel();
        lbl_cpf = new javax.swing.JLabel();
        txt_cpf = new javax.swing.JTextField();
        lbl_cargo = new javax.swing.JLabel();
        cbx_cargo = new javax.swing.JComboBox<>();
        lbl_senha = new javax.swing.JLabel();
        txt_senha = new javax.swing.JTextField();
        lbl_descricao = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txta_descricao = new javax.swing.JTextArea();
        btn_salvar1 = new javax.swing.JButton();
        btn_voltar = new javax.swing.JButton();
        chx_status = new javax.swing.JCheckBox();
        lbl_imagem_funcionario = new javax.swing.JLabel();
        btn_salvar_imagem1 = new javax.swing.JButton();
        btn_excluir_imagem = new javax.swing.JButton();
        jFileChooser1 = new javax.swing.JFileChooser();
        txt_imagem = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("WStorage");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        pn_funcionario.setBackground(new java.awt.Color(255, 255, 255));
        pn_funcionario.setPreferredSize(new java.awt.Dimension(1150, 80));

        lbl_funcionario.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbl_funcionario.setText("Cadastro de Funcionário");

        lbl_nome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_nome.setText("Nome Completo");

        txt_nome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txt_nome.setPreferredSize(new java.awt.Dimension(64, 30));

        lbl_foto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_foto.setText("Foto do Funcionário");

        lbl_cpf.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_cpf.setText("CPF");

        txt_cpf.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txt_cpf.setPreferredSize(new java.awt.Dimension(64, 30));

        lbl_cargo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_cargo.setText("Cargo");

        cbx_cargo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cbx_cargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Funcionário", "Almoxarife" }));
        cbx_cargo.setPreferredSize(new java.awt.Dimension(72, 30));
        cbx_cargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_cargoActionPerformed(evt);
            }
        });

        lbl_senha.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_senha.setText("Senha");

        txt_senha.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txt_senha.setPreferredSize(new java.awt.Dimension(64, 30));

        lbl_descricao.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_descricao.setText("Descrição");

        txta_descricao.setColumns(20);
        txta_descricao.setRows(5);
        jScrollPane1.setViewportView(txta_descricao);

        btn_salvar1.setBackground(new java.awt.Color(32, 107, 165));
        btn_salvar1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_salvar1.setForeground(new java.awt.Color(255, 255, 255));
        btn_salvar1.setText("Salvar");
        btn_salvar1.setPreferredSize(new java.awt.Dimension(74, 30));
        btn_salvar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvar1ActionPerformed(evt);
            }
        });

        btn_voltar.setBackground(new java.awt.Color(32, 107, 165));
        btn_voltar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_voltar.setForeground(new java.awt.Color(255, 255, 255));
        btn_voltar.setText("Voltar");
        btn_voltar.setPreferredSize(new java.awt.Dimension(72, 30));
        btn_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_voltarActionPerformed(evt);
            }
        });

        chx_status.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        chx_status.setText("Status Ativo");

        lbl_imagem_funcionario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_imagem_funcionario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btn_salvar_imagem1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn_salvar_imagem1.setText("Salvar");
        btn_salvar_imagem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvar_imagem1ActionPerformed(evt);
            }
        });

        btn_excluir_imagem.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn_excluir_imagem.setText("Excluir");
        btn_excluir_imagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excluir_imagemActionPerformed(evt);
            }
        });

        txt_imagem.setEnabled(false);

        javax.swing.GroupLayout pn_funcionarioLayout = new javax.swing.GroupLayout(pn_funcionario);
        pn_funcionario.setLayout(pn_funcionarioLayout);
        pn_funcionarioLayout.setHorizontalGroup(
            pn_funcionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_funcionarioLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_salvar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(266, 266, 266)
                .addComponent(btn_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(328, 328, 328))
            .addGroup(pn_funcionarioLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(pn_funcionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_funcionarioLayout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 990, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(44, Short.MAX_VALUE))
                    .addGroup(pn_funcionarioLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(pn_funcionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pn_funcionarioLayout.createSequentialGroup()
                                .addGroup(pn_funcionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 965, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pn_funcionarioLayout.createSequentialGroup()
                                        .addGroup(pn_funcionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(pn_funcionarioLayout.createSequentialGroup()
                                                .addGroup(pn_funcionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txt_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(lbl_cargo)
                                                    .addComponent(cbx_cargo, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(lbl_descricao)
                                                    .addComponent(lbl_cpf))
                                                .addGap(37, 37, 37)
                                                .addGroup(pn_funcionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lbl_senha)
                                                    .addComponent(txt_senha, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(pn_funcionarioLayout.createSequentialGroup()
                                                .addGap(457, 457, 457)
                                                .addComponent(chx_status))
                                            .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(pn_funcionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(pn_funcionarioLayout.createSequentialGroup()
                                                .addGap(151, 151, 151)
                                                .addComponent(btn_salvar_imagem1)
                                                .addGap(75, 75, 75)
                                                .addComponent(btn_excluir_imagem))
                                            .addGroup(pn_funcionarioLayout.createSequentialGroup()
                                                .addGap(129, 129, 129)
                                                .addComponent(lbl_imagem_funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(pn_funcionarioLayout.createSequentialGroup()
                                .addComponent(lbl_nome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbl_foto)
                                .addGap(140, 140, 140))))
                    .addGroup(pn_funcionarioLayout.createSequentialGroup()
                        .addComponent(lbl_funcionario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_imagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(127, 127, 127))))
            .addGroup(pn_funcionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_funcionarioLayout.createSequentialGroup()
                    .addContainerGap(579, Short.MAX_VALUE)
                    .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(381, Short.MAX_VALUE)))
        );
        pn_funcionarioLayout.setVerticalGroup(
            pn_funcionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_funcionarioLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(pn_funcionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_funcionario)
                    .addComponent(txt_imagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pn_funcionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nome)
                    .addComponent(lbl_foto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn_funcionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_funcionarioLayout.createSequentialGroup()
                        .addComponent(lbl_imagem_funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pn_funcionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_salvar_imagem1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_excluir_imagem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pn_funcionarioLayout.createSequentialGroup()
                        .addGroup(pn_funcionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chx_status))
                        .addGap(18, 18, 18)
                        .addComponent(lbl_cpf)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(pn_funcionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_cargo)
                            .addComponent(lbl_senha))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pn_funcionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbx_cargo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_senha, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addComponent(lbl_descricao)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(pn_funcionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_salvar1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(pn_funcionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_funcionarioLayout.createSequentialGroup()
                    .addContainerGap(186, Short.MAX_VALUE)
                    .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(360, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, 1075, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voltarActionPerformed
        tela_cadastroFuncionario.this.dispose();
    }//GEN-LAST:event_btn_voltarActionPerformed

    private void btn_salvar_imagem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvar_imagem1ActionPerformed
        jFileChooser1.setVisible(true);
        int result = this.jFileChooser1.showOpenDialog(this.jFileChooser1);
        if(result == JFileChooser.APPROVE_OPTION){
            String filePath = this.jFileChooser1.getSelectedFile().getAbsolutePath();
            ImageIcon icon = new ImageIcon(filePath);
            this.lbl_imagem_funcionario.setIcon(icon);
            this.txt_imagem.setText(filePath);
        }
    }//GEN-LAST:event_btn_salvar_imagem1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        jFileChooser1.setVisible(false);
        lbl_senha.setVisible(false);
        txt_senha.setVisible(false);
        txt_imagem.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

    private void btn_excluir_imagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluir_imagemActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btn_excluir_imagemActionPerformed

    private void btn_salvar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvar1ActionPerformed
        try {            
            conexao = DriverManager.getConnection(url,usuario,senha);
            String sql = "INSERT INTO funcionarios (nome,cpf,cargo,senha,status,imagens,descricao,dataemissao) VALUES (?,?,?,?,?,?,?,NOW())";
            String comboBox = (String) cbx_cargo.getSelectedItem();
            //colocando status na maquina com o checkbox
            String checkbox = "";
            if(chx_status.isSelected()) {
                checkbox+="Ativo";
            } else {
                checkbox+="Desativado";
            }
            statement = conexao.prepareStatement(sql);
            statement.setString(1, txt_nome.getText());
            statement.setString(2, txt_cpf.getText());
            statement.setString(3, comboBox);
            statement.setString(4, txt_senha.getText());
            statement.setString(5, checkbox);
            statement.setString(6, txt_imagem.getText());
            statement.setString(7, txta_descricao.getText());
            statement.execute();
            statement.close();
            limparCampos();
            JOptionPane.showInternalMessageDialog(null,"Funcionário cadastrado com sucesso!");
        } catch (SQLException ex) {
            Logger.getLogger(tela_cadastroFuncionario.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        
    }//GEN-LAST:event_btn_salvar1ActionPerformed

    private void cbx_cargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_cargoActionPerformed
        String selectedItem = (String) cbx_cargo.getSelectedItem();
        if ("Almoxarife".equals(selectedItem)) {
                    lbl_senha.setVisible(true);
                    txt_senha.setVisible(true);
                } else {
            
                    lbl_senha.setVisible(false);
                    txt_senha.setVisible(false);
                }
    }//GEN-LAST:event_cbx_cargoActionPerformed

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
            java.util.logging.Logger.getLogger(tela_cadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tela_cadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tela_cadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tela_cadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela_cadastroFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_excluir_imagem;
    private javax.swing.JButton btn_salvar1;
    private javax.swing.JButton btn_salvar_imagem1;
    private javax.swing.JButton btn_voltar;
    private javax.swing.JComboBox<String> cbx_cargo;
    private javax.swing.JCheckBox chx_status;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbl_cargo;
    private javax.swing.JLabel lbl_cpf;
    private javax.swing.JLabel lbl_descricao;
    private javax.swing.JLabel lbl_foto;
    private javax.swing.JLabel lbl_funcionario;
    private javax.swing.JLabel lbl_imagem_funcionario;
    private javax.swing.JLabel lbl_nome;
    private javax.swing.JLabel lbl_senha;
    private javax.swing.JPanel pn_funcionario;
    private javax.swing.JTextField txt_cpf;
    private javax.swing.JTextField txt_imagem;
    private javax.swing.JTextField txt_nome;
    private javax.swing.JTextField txt_senha;
    private javax.swing.JTextArea txta_descricao;
    // End of variables declaration//GEN-END:variables
}
