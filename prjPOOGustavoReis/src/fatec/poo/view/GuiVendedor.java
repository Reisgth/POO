package fatec.poo.view;

import fatec.poo.control.DaoVendedor;
import fatec.poo.control.PreparaConexao;
import fatec.poo.model.Vendedor;
import javax.swing.JOptionPane;

/**
 * @author Gustavo Reis
 */
public class GuiVendedor extends javax.swing.JFrame {
    public GuiVendedor() {
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
        txtCpf = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        txtDdd = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        txtSalBase = new javax.swing.JTextField();
        txtCep = new javax.swing.JTextField();
        cbxUf = new javax.swing.JComboBox<>();
        btnConsultar = new javax.swing.JButton();
        btnIncluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        txtTaxaComissao = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Vendedor");
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

        jLabel6.setText("Salario Base");

        jLabel7.setText("UF");

        jLabel8.setText("CEP");

        jLabel9.setText("Taxa de Comissão");

        txtNome.setEnabled(false);

        txtEndereco.setEnabled(false);

        txtCidade.setEnabled(false);

        txtDdd.setEnabled(false);

        txtTelefone.setEnabled(false);

        txtSalBase.setEnabled(false);

        txtCep.setToolTipText("");
        txtCep.setEnabled(false);

        cbxUf.setEditable(true);
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

        txtTaxaComissao.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1)
                            .addComponent(jLabel8))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtSalBase, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtTaxaComissao, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtNome, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEndereco)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(txtCidade)
                                        .addGap(26, 26, 26)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cbxUf, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtDdd, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtTelefone)))
                                .addGap(94, 94, 94))))))
        );
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(cbxUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(txtDdd)
                        .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtSalBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtTaxaComissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnIncluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExcluir)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSair))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        vendedor = null;
        
        if(txtCpf.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Digite o CPF");
        }        
        else {
             vendedor = daoVendedor.consultar(txtCpf.getText());
             
            if (vendedor == null) {//não encontrou o objeto na BD

                txtCpf.setEnabled(false);
                txtNome.setEnabled(true);
                txtEndereco.setEnabled(true);
                txtCidade.setEnabled(true);
                txtDdd.setEnabled(true);
                txtTelefone.setEnabled(true);
                txtSalBase.setEnabled(true);
                txtTaxaComissao.setEnabled(true);
                txtCep.setEnabled(true);
                cbxUf.setEnabled(true);

                txtNome.requestFocus();

                btnConsultar.setEnabled(false);
                btnAlterar.setEnabled(false);
                btnIncluir.setEnabled(true);
                btnExcluir.setEnabled(false);

            } else { //encontrou o objeto na BD

                txtNome.setText(vendedor.getNome());
                txtEndereco.setText(vendedor.getEndereco());
                txtCidade.setText(vendedor.getCidade());
                txtDdd.setText(vendedor.getDdd());
                txtTelefone.setText(vendedor.getTelefone());
                txtSalBase.setText(Double.toString(vendedor.getSalarioBase()));
                txtTaxaComissao.setText(Double.toString(vendedor.getTaxaComissao()));
                txtCep.setText(vendedor.getCep());
                cbxUf.setSelectedItem(vendedor.getUf());

                txtCpf.setEnabled(false);
                txtNome.setEnabled(true);
                txtEndereco.setEnabled(true);
                txtCidade.setEnabled(true);
                txtDdd.setEnabled(true);
                txtTelefone.setEnabled(true);
                txtSalBase.setEnabled(true);
                txtTaxaComissao.setEnabled(true);
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

            vendedor = new Vendedor(txtCpf.getText(), txtNome.getText(), Double.parseDouble(txtSalBase.getText()));
      
            vendedor.setEndereco(txtEndereco.getText());
            vendedor.setCidade(txtCidade.getText());
            vendedor.setDdd(txtDdd.getText());
            vendedor.setTelefone(txtTelefone.getText());
            vendedor.setCep(txtCep.getText());
            vendedor.setUf((String)cbxUf.getSelectedItem());
            vendedor.setTaxaComissao(Double.parseDouble(txtTaxaComissao.getText()));
            
            daoVendedor.inserir(vendedor);
             
            txtCpf.setText("");
            txtNome.setText("");
            txtEndereco.setText("");
            txtCidade.setText("");
            txtDdd.setText("");
            txtTelefone.setText("");
            txtSalBase.setText("");
            txtTaxaComissao.setText("");
            txtCep.setText("");
            cbxUf.setSelectedIndex(0);
            
            txtCpf.requestFocus();
            
            txtCpf.setEnabled(true);
            txtNome.setEnabled(false);
            txtEndereco.setEnabled(false);
            txtCidade.setEnabled(false);
            txtDdd.setEnabled(false);
            txtTelefone.setEnabled(false);
            txtSalBase.setEnabled(false);
            txtTaxaComissao.setEnabled(false);
            txtCep.setEnabled(false);
            cbxUf.setEnabled(false);
            
            btnConsultar.setEnabled(true);
            btnAlterar.setEnabled(false);
            btnIncluir.setEnabled(false);
            btnExcluir.setEnabled(false);
    }//GEN-LAST:event_btnIncluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
            
            vendedor.setNome(txtNome.getText());
            vendedor.setEndereco(txtEndereco.getText());
            vendedor.setCidade(txtCidade.getText());
            vendedor.setDdd(txtDdd.getText());
            vendedor.setTelefone(txtTelefone.getText());
            vendedor.setCep(txtCep.getText());
            vendedor.setUf((String)cbxUf.getSelectedItem());
            vendedor.setTaxaComissao(Double.parseDouble(txtTaxaComissao.getText()));
            vendedor.setSalarioBase(Double.parseDouble(txtSalBase.getText()));
            
            daoVendedor.alterar(vendedor);
             
            txtCpf.setText("");
            txtNome.setText("");
            txtEndereco.setText("");
            txtCidade.setText("");
            txtDdd.setText("");
            txtTelefone.setText("");
            txtSalBase.setText("");
            txtTaxaComissao.setText("");
            txtCep.setText("");
            cbxUf.setSelectedIndex(0);
            
            txtCpf.requestFocus();
            
            txtCpf.setEnabled(true);
            txtNome.setEnabled(false);
            txtEndereco.setEnabled(false);
            txtCidade.setEnabled(false);
            txtDdd.setEnabled(false);
            txtTelefone.setEnabled(false);
            txtSalBase.setEnabled(false);
            txtTaxaComissao.setEnabled(false);
            txtCep.setEnabled(false);
            cbxUf.setEnabled(false);
            
            btnConsultar.setEnabled(true);
            btnAlterar.setEnabled(false);
            btnIncluir.setEnabled(false);
            btnExcluir.setEnabled(false);
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        
        int excluir = JOptionPane.showConfirmDialog(null, "Deseja excluir esse Vendedor?", "Excluir", JOptionPane.YES_NO_OPTION);
        
        if(excluir == JOptionPane.YES_OPTION)
        {
            daoVendedor.excluir(vendedor);
             
            txtCpf.setText("");
            txtNome.setText("");
            txtEndereco.setText("");
            txtCidade.setText("");
            txtDdd.setText("");
            txtTelefone.setText("");
            txtSalBase.setText("");
            txtTaxaComissao.setText("");
            txtCep.setText("");
            cbxUf.setSelectedIndex(0);
            
            txtCpf.requestFocus();
            
            txtCpf.setEnabled(true);
            txtNome.setEnabled(false);
            txtEndereco.setEnabled(false);
            txtCidade.setEnabled(false);
            txtDdd.setEnabled(false);
            txtTelefone.setEnabled(false);
            txtSalBase.setEnabled(false);
            txtTaxaComissao.setEnabled(false);
            txtCep.setEnabled(false);
            cbxUf.setEnabled(false);
            
            btnConsultar.setEnabled(true);
            btnAlterar.setEnabled(false);
            btnIncluir.setEnabled(false);
            btnExcluir.setEnabled(false);
        } 
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        prepCon = new PreparaConexao("BD1821041", "BD1821041");
        prepCon.setDriver("oracle.jdbc.driver.OracleDriver");
        prepCon.setConnectionString("jdbc:oracle:thin:@192.168.1.6:1521:xe");

        daoVendedor = new DaoVendedor(prepCon.abrirConexao());
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        prepCon.fecharConexao();
    }//GEN-LAST:event_formWindowClosed

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
    private javax.swing.JTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtDdd;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSalBase;
    private javax.swing.JTextField txtTaxaComissao;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
    
    private PreparaConexao prepCon;
    private DaoVendedor daoVendedor;
    private Vendedor vendedor;
}