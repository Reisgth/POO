package fatec.poo.view;

import fatec.poo.control.DaoCliente;
import fatec.poo.control.DaoPedido;
import fatec.poo.control.DaoVendedor;
import fatec.poo.control.PreparaConexao;
import fatec.poo.model.Cliente;
import fatec.poo.model.Pedido;
import fatec.poo.model.Vendedor;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 * @author Gustavo Reis
 */
public class GuiPedido extends javax.swing.JFrame {

    public GuiPedido() {
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
        txtDataEmissao = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        txtValor = new javax.swing.JTextField();
        txtCpfCli = new javax.swing.JTextField();
        txtCpfVend = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();
        btnIncluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        lblNomeCli = new javax.swing.JLabel();
        lblNomeVend = new javax.swing.JLabel();
        btnConsultarCliente = new javax.swing.JButton();
        btnConsultarVendedor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Emitir Pedido");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Numero do Pedido");

        jLabel2.setText("Data do Pedido");

        jLabel3.setText("Valor do Pedido");

        jLabel4.setText("CPF Cliente");

        jLabel5.setText("CPF Vendedor");

        txtDataEmissao.setEnabled(false);

        txtValor.setEnabled(false);

        txtCpfCli.setEnabled(false);

        txtCpfVend.setEnabled(false);

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

        lblNomeCli.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        lblNomeVend.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        btnConsultarCliente.setText("Consultar");
        btnConsultarCliente.setEnabled(false);
        btnConsultarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarClienteActionPerformed(evt);
            }
        });

        btnConsultarVendedor.setText("Consultar");
        btnConsultarVendedor.setEnabled(false);
        btnConsultarVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarVendedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCpfCli, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(txtCpfVend))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnConsultarCliente)
                            .addComponent(btnConsultarVendedor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNomeCli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNomeVend, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtValor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(txtDataEmissao, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNumero, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnIncluir)
                .addGap(18, 18, 18)
                .addComponent(btnAlterar)
                .addGap(18, 18, 18)
                .addComponent(btnExcluir)
                .addGap(18, 18, 18)
                .addComponent(btnSair)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAlterar, btnConsultar, btnExcluir, btnIncluir, btnSair});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDataEmissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txtCpfCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnConsultarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lblNomeCli, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(txtCpfVend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnConsultarVendedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lblNomeVend, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnIncluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32))
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

        daoPedido = new DaoPedido(prepCon.abrirConexao());
        daoCliente = new DaoCliente(prepCon.abrirConexao());
        daoVendedor = new DaoVendedor(prepCon.abrirConexao());
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        prepCon.fecharConexao();
    }//GEN-LAST:event_formWindowClosed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        pedido = null;
        cliente = null;
        vendedor = null;
         if(txtNumero.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Digite o Numero do Pedido");
        }        
        else {
            pedido = daoPedido.consultar(txtNumero.getText());
            
            if (pedido == null) {//não encontrou o objeto na BD

            txtNumero.setEnabled(false);
            txtDataEmissao.setEnabled(true);
            txtValor.setEnabled(true);
            txtCpfCli.setEnabled(true);

            txtDataEmissao.requestFocus();

            btnConsultar.setEnabled(false);
            btnAlterar.setEnabled(false);
            btnIncluir.setEnabled(false);
            btnExcluir.setEnabled(false);
            
            btnConsultarCliente.setEnabled(true);

        } else { //encontrou o objeto na BD
                cliente = daoCliente.consultar(pedido.getCliente().getCpf());
                vendedor = daoVendedor.consultar(pedido.getVendedor().getCpf());

                txtNumero.setText(pedido.getNumero());
                txtDataEmissao.setText(pedido.getDataEmissao());
                txtValor.setText(Double.toString(pedido.getValor()));
                txtCpfCli.setText(cliente.getCpf());
                txtCpfVend.setText(vendedor.getCpf());

                lblNomeCli.setText(cliente.getNome());
                lblNomeVend.setText(vendedor.getNome());

                txtNumero.setEnabled(false);
                txtDataEmissao.setEnabled(true);
                txtValor.setEnabled(true);
                txtCpfCli.setEnabled(true);
                txtCpfVend.setEnabled(true);

                txtDataEmissao.requestFocus();

                btnConsultar.setEnabled(false);
                btnAlterar.setEnabled(true);
                btnIncluir.setEnabled(false);
                btnExcluir.setEnabled(true);

                btnConsultarCliente.setEnabled(true);
                btnConsultarVendedor.setEnabled(true);
            }
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
        
        pedido = new Pedido(txtNumero.getText());
                
        pedido.setDataEmissao(txtDataEmissao.getText());
        pedido.setValor(Double.parseDouble(txtValor.getText()));
        
        pedido.setCliente(cliente);
        pedido.setVendedor(vendedor);
            
        daoPedido.inserir(pedido);
        
        cliente.addPedido(pedido);
        vendedor.addPedido(pedido);
        
        daoCliente.alterar(cliente);
        daoVendedor.alterar(vendedor);
        
        txtNumero.setText("");
        txtDataEmissao.setText("");
        txtValor.setText("");
        txtCpfCli.setText("");
        txtCpfVend.setText("");
        lblNomeCli.setText("");
        lblNomeVend.setText("");
        
        txtNumero.setEnabled(true);
        txtDataEmissao.setEnabled(false);
        txtValor.setEnabled(false);
        txtCpfCli.setEnabled(false);
        txtCpfVend.setEnabled(false);
        
        txtNumero.requestFocus();

        btnConsultar.setEnabled(true);
        btnAlterar.setEnabled(false);
        btnIncluir.setEnabled(false);
        btnExcluir.setEnabled(false);
        
        btnConsultarCliente.setEnabled(false);
        btnConsultarVendedor.setEnabled(false);
    }//GEN-LAST:event_btnIncluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        
        pedido.setNumero(txtNumero.getText());
        pedido.setDataEmissao(txtDataEmissao.getText());
        pedido.setValor(Double.parseDouble(txtValor.getText()));
              
        pedido.setCliente(cliente);
        pedido.setVendedor(vendedor);
              
        cliente.removePedido(pedido);
        cliente.addPedido(pedido);
        
        vendedor.removePedido(pedido);
        vendedor.addPedido(pedido);
        
        daoPedido.alterar(pedido);
        daoCliente.alterar(cliente);
        daoVendedor.alterar(vendedor);
        
        txtNumero.setText("");
        txtDataEmissao.setText("");
        txtValor.setText("");
        txtCpfCli.setText("");
        txtCpfVend.setText("");
        lblNomeCli.setText("");
        lblNomeVend.setText("");

        txtNumero.setEnabled(true);
        txtDataEmissao.setEnabled(false);
        txtValor.setEnabled(false);
        txtCpfCli.setEnabled(false);
        txtCpfVend.setEnabled(false);
        
        txtNumero.requestFocus();

        btnConsultar.setEnabled(true);
        btnAlterar.setEnabled(false);
        btnIncluir.setEnabled(false);
        btnExcluir.setEnabled(false);
        
        btnConsultarCliente.setEnabled(false);
        btnConsultarVendedor.setEnabled(false);
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        
        int excluir = JOptionPane.showConfirmDialog(null, "Deseja excluir esse pedido?", "Excluir", JOptionPane.YES_NO_OPTION);
        
        if(excluir == JOptionPane.YES_OPTION)
        {
            daoPedido.excluir(pedido);
            
            cliente.removePedido(pedido);
            vendedor.removePedido(pedido);
            
            daoCliente.alterar(cliente);
            daoVendedor.alterar(vendedor);
        
            txtNumero.setText("");
            txtDataEmissao.setText("");
            txtValor.setText("");
            txtCpfCli.setText("");
            txtCpfVend.setText("");
            lblNomeCli.setText("");
            lblNomeVend.setText("");

            txtNumero.setEnabled(true);
            txtDataEmissao.setEnabled(false);
            txtValor.setEnabled(false);
            txtCpfCli.setEnabled(false);
            txtCpfVend.setEnabled(false);

            txtNumero.requestFocus();

            btnConsultar.setEnabled(true);
            btnAlterar.setEnabled(false);
            btnIncluir.setEnabled(false);
            btnExcluir.setEnabled(false);

            btnConsultarCliente.setEnabled(false);
            btnConsultarVendedor.setEnabled(false);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnConsultarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarClienteActionPerformed
        
        cliente = daoCliente.consultar(txtCpfCli.getText());
        
        if(cliente == null){
            JOptionPane.showMessageDialog(null, "Cliente não encontrado, reveja o CPF e busque novamente");
        }        
        else {
            lblNomeCli.setText(cliente.getNome());
        
            txtCpfCli.setEnabled(false);
            btnConsultarCliente.setEnabled(false);

            txtCpfVend.setEnabled(true);
            btnConsultarVendedor.setEnabled(true);
        }
    }//GEN-LAST:event_btnConsultarClienteActionPerformed

    private void btnConsultarVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarVendedorActionPerformed
        vendedor = daoVendedor.consultar(txtCpfVend.getText());
        
        if(cliente == null){
            JOptionPane.showMessageDialog(null, "Cliente não encontrado, reveja o CPF e busque novamente");
        }        
        else {
            lblNomeVend.setText(vendedor.getNome());
        
            txtCpfVend.setEnabled(false);
            btnConsultarVendedor.setEnabled(false);

            btnIncluir.setEnabled(true);
        }
    }//GEN-LAST:event_btnConsultarVendedorActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnConsultarCliente;
    private javax.swing.JButton btnConsultarVendedor;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblNomeCli;
    private javax.swing.JLabel lblNomeVend;
    private javax.swing.JTextField txtCpfCli;
    private javax.swing.JTextField txtCpfVend;
    private javax.swing.JTextField txtDataEmissao;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
    
    private PreparaConexao prepCon;
    private DaoPedido daoPedido;
    private DaoCliente daoCliente;
    private DaoVendedor daoVendedor;
    private Pedido pedido;
    private Cliente cliente;
    private Vendedor vendedor;
}
