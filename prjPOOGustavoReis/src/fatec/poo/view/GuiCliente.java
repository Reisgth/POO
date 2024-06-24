package fatec.poo.view;

import fatec.poo.control.DaoCliente;
import fatec.poo.control.PreparaConexao;
import fatec.poo.model.Cliente;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * @author Gustavo Reis
 */
public class GuiCliente extends javax.swing.JFrame {

    public GuiCliente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblLimDisp = new javax.swing.JLabel();
        txtCpf = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        txtDdd = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        txtLimCred = new javax.swing.JTextField();
        txtCep = new javax.swing.JTextField();
        cbxUf = new javax.swing.JComboBox<>();
        btnConsultar = new javax.swing.JButton();
        btnIncluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Cliente");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("CPF");

        jLabel2.setText("Nome");

        jLabel3.setText("Endereço");

        jLabel4.setText("Cidade");

        jLabel5.setText("Telefone");

        jLabel6.setText("Limite de Credito");

        jLabel7.setText("UF");

        jLabel8.setText("CEP");

        jLabel9.setText("Limite Disponivel");

        lblLimDisp.setBorder(new javax.swing.border.SoftBevelBorder(1));

        txtNome.setEnabled(false);

        txtEndereco.setEnabled(false);

        txtCidade.setEnabled(false);

        txtDdd.setEnabled(false);

        txtTelefone.setEnabled(false);

        txtLimCred.setEnabled(false);

        txtCep.setToolTipText("");
        txtCep.setEnabled(false);

        cbxUf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SP", "RJ", "MG", "PR", "SC", "RS" }));
        cbxUf.setEnabled(false);

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnIncluir.setText("Incluir");
        btnIncluir.setEnabled(false);
        btnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");
        btnAlterar.setEnabled(false);
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.setToolTipText("");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnIncluir)
                        .addGap(18, 18, 18)
                        .addComponent(btnAlterar)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluir)
                        .addGap(18, 18, 18)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtLimCred, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblLimDisp, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtEndereco)
                            .addComponent(txtNome)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtCidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbxUf, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtDdd, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCep)))
                        .addGap(69, 69, 69))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAlterar, btnConsultar, btnExcluir, btnIncluir});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(cbxUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(txtLimCred, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9))
                    .addComponent(lblLimDisp, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultar)
                    .addComponent(btnIncluir)
                    .addComponent(btnExcluir)
                    .addComponent(btnAlterar)
                    .addComponent(btnSair))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        prepCon = new PreparaConexao("BD1821041", "BD1821041");
        prepCon.setDriver("oracle.jdbc.driver.OracleDriver");
        prepCon.setConnectionString("jdbc:oracle:thin:@192.168.1.6:1521:xe");

        daoCliente = new DaoCliente(prepCon.abrirConexao());
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        prepCon.fecharConexao();
    }//GEN-LAST:event_formWindowClosed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        cliente = null;
        
        if(txtCpf.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Digite o CPF");
        }        
        else {
            cliente = daoCliente.consultar(txtCpf.getText());
             
            if (cliente == null) {//não encontrou o objeto na BD

                txtCpf.setEnabled(false);
                txtNome.setEnabled(true);
                txtEndereco.setEnabled(true);
                txtCidade.setEnabled(true);
                txtDdd.setEnabled(true);
                txtTelefone.setEnabled(true);
                txtLimCred.setEnabled(true);
                txtCep.setEnabled(true);
                cbxUf.setEnabled(true);

                txtNome.requestFocus();

                btnConsultar.setEnabled(false);
                btnAlterar.setEnabled(false);
                btnIncluir.setEnabled(true);
                btnExcluir.setEnabled(false);
            } else { //encontrou o objeto na BD
                txtNome.setText(cliente.getNome());
                txtEndereco.setText(cliente.getEndereco());
                txtCidade.setText(cliente.getCidade());
                txtDdd.setText(cliente.getDdd());
                txtTelefone.setText(cliente.getTelefone());
                txtLimCred.setText(Double.toString(cliente.getLimiteCredito()));
                lblLimDisp.setText(Double.toString(cliente.getLimiteDisponivel()));
                txtCep.setText(cliente.getCep());
                cbxUf.setSelectedItem(cliente.getUf());

                txtCpf.setEnabled(false);
                txtNome.setEnabled(true);
                txtEndereco.setEnabled(true);
                txtCidade.setEnabled(true);
                txtDdd.setEnabled(true);
                txtTelefone.setEnabled(true);
                txtLimCred.setEnabled(true);
                txtCep.setEnabled(true);
                cbxUf.setEnabled(true);

                txtNome.requestFocus();

                btnConsultar.setEnabled(false);
                btnAlterar.setEnabled(true);
                btnIncluir.setEnabled(false);
                btnExcluir.setEnabled(true);
            }
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
            cliente = null;

            cliente = new Cliente(txtCpf.getText(), txtNome.getText(), Double.parseDouble(txtLimCred.getText()));
            cliente.setEndereco(txtEndereco.getText());
            cliente.setCidade(txtCidade.getText());
            cliente.setDdd(txtDdd.getText());
            cliente.setTelefone(txtTelefone.getText());
            cliente.setCep(txtCep.getText());
            cliente.setUf((String)cbxUf.getSelectedItem());
            
            daoCliente.inserir(cliente);
             
            txtCpf.setText("");
            txtNome.setText("");
            txtEndereco.setText("");
            txtCidade.setText("");
            txtDdd.setText("");
            txtTelefone.setText("");
            txtLimCred.setText("");
            txtCep.setText("");
            cbxUf.setSelectedIndex(0);
            lblLimDisp.setText("");
            
            txtCpf.requestFocus();
            
            txtCpf.setEnabled(true);
            txtNome.setEnabled(false);
            txtEndereco.setEnabled(false);
            txtCidade.setEnabled(false);
            txtDdd.setEnabled(false);
            txtTelefone.setEnabled(false);
            txtLimCred.setEnabled(false);
            txtCep.setEnabled(false);
            cbxUf.setEnabled(false);
            
            btnConsultar.setEnabled(true);
            btnAlterar.setEnabled(false);
            btnIncluir.setEnabled(false);
            btnExcluir.setEnabled(false);
    }//GEN-LAST:event_btnIncluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        
            cliente.setCpf(txtCpf.getText());
            cliente.setNome(txtNome.getText());
            cliente.setEndereco(txtEndereco.getText());
            cliente.setCidade(txtCidade.getText());
            cliente.setDdd(txtDdd.getText());
            cliente.setTelefone(txtTelefone.getText());
            cliente.setCep(txtCep.getText());
            cliente.setUf((String)cbxUf.getSelectedItem());
            cliente.setLimiteCredito(Double.parseDouble(txtLimCred.getText()));
            cliente.setLimiteDisponivel(Double.parseDouble(lblLimDisp.getText()));
            
            daoCliente.alterar(cliente);

            txtCpf.setText("");
            txtNome.setText("");
            txtEndereco.setText("");
            txtCidade.setText("");
            txtDdd.setText("");
            txtTelefone.setText("");
            txtLimCred.setText("");
            txtCep.setText("");
            cbxUf.setSelectedIndex(0);
            lblLimDisp.setText("");
            
            txtCpf.requestFocus();
                        
            txtCpf.setEnabled(true);
            txtNome.setEnabled(false);
            txtEndereco.setEnabled(false);
            txtCidade.setEnabled(false);
            txtDdd.setEnabled(false);
            txtTelefone.setEnabled(false);
            txtLimCred.setEnabled(false);
            txtCep.setEnabled(false);
            cbxUf.setEnabled(false);
            
            btnConsultar.setEnabled(true);
            btnAlterar.setEnabled(false);
            btnIncluir.setEnabled(false);
            btnExcluir.setEnabled(false);
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
         
        int excluir = JOptionPane.showConfirmDialog(null, "Deseja excluir esse Cliente?", "Excluir", JOptionPane.YES_NO_OPTION);
        
        if(excluir == JOptionPane.YES_OPTION)
        {
            daoCliente.excluir(cliente);

            txtCpf.setText("");
            txtNome.setText("");
            txtEndereco.setText("");
            txtCidade.setText("");
            txtDdd.setText("");
            txtTelefone.setText("");
            txtLimCred.setText("");
            txtCep.setText("");
            cbxUf.setSelectedIndex(0);
            lblLimDisp.setText("");
            
            txtCpf.requestFocus();
            
            txtCpf.setEnabled(true);
            txtNome.setEnabled(false);
            txtEndereco.setEnabled(false);
            txtCidade.setEnabled(false);
            txtDdd.setEnabled(false);
            txtTelefone.setEnabled(false);
            txtLimCred.setEnabled(false);
            txtCep.setEnabled(false);
            cbxUf.setEnabled(false);
            
            btnConsultar.setEnabled(true);
            btnAlterar.setEnabled(false);
            btnIncluir.setEnabled(false);
            btnExcluir.setEnabled(false);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JButton btnSair;
    private javax.swing.JComboBox<String> cbxUf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblLimDisp;
    private javax.swing.JTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtDdd;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtLimCred;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables

    private PreparaConexao prepCon;
    private DaoCliente daoCliente;
    private Cliente cliente;
}
