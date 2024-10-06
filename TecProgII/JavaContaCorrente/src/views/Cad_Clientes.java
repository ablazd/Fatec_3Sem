
package views;
import DAO.connectionDAO;
import models.Cliente;

public class Cad_Clientes extends javax.swing.JFrame {

    public Cad_Clientes() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelId = new javax.swing.JLabel();
        txtFieldId = new javax.swing.JTextField();
        labelNome = new javax.swing.JLabel();
        txtFieldNome = new javax.swing.JTextField();
        labelEnd = new javax.swing.JLabel();
        txtFieldEnd = new javax.swing.JTextField();
        labelEndNum = new javax.swing.JLabel();
        txtFieldEndNum = new javax.swing.JTextField();
        labelEndComp = new javax.swing.JLabel();
        txtFieldEndComp = new javax.swing.JTextField();
        labelEndBairro = new javax.swing.JLabel();
        txtFieldEndBairro = new javax.swing.JTextField();
        labelEndCidade = new javax.swing.JLabel();
        txtFieldEndCidade = new javax.swing.JTextField();
        labelUF = new javax.swing.JLabel();
        txtFieldUF = new javax.swing.JTextField();
        labelCEP = new javax.swing.JLabel();
        txtFieldCEP = new javax.swing.JTextField();
        labelTel = new javax.swing.JLabel();
        txtFieldTel = new javax.swing.JTextField();
        labelCPF = new javax.swing.JLabel();
        txtFieldCPF = new javax.swing.JTextField();
        labelDataNasc = new javax.swing.JLabel();
        txtFieldDataNasc = new javax.swing.JTextField();
        labelCNPJ = new javax.swing.JLabel();
        txtFieldCNPJ = new javax.swing.JTextField();
        labelCadastro = new javax.swing.JLabel();
        buttonSalvar = new javax.swing.JButton();
        buttonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        labelId.setText("Id Cliente:");

        labelNome.setText("Nome:");

        labelEnd.setText("Endereço:");

        labelEndNum.setText("Número:");

        labelEndComp.setText("Complemento:");

        labelEndBairro.setText("Bairro:");

        labelEndCidade.setText("Cidade:");

        labelUF.setText("UF:");

        labelCEP.setText("CEP:");

        labelTel.setText("Telefone:");

        labelCPF.setText("CPF:");

        labelDataNasc.setText("Data Nasc.:");

        labelCNPJ.setText("CPNJ:");

        labelCadastro.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        labelCadastro.setText("Cadastro");

        buttonSalvar.setText("Salvar");
        buttonSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonSalvarMouseClicked(evt);
            }
        });

        buttonCancelar.setText("Cancelar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(labelEndComp)
                        .addComponent(labelEndBairro, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(labelEndCidade)
                    .addComponent(labelUF)
                    .addComponent(labelCEP)
                    .addComponent(labelTel)
                    .addComponent(labelCPF)
                    .addComponent(labelDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCNPJ)
                    .addComponent(labelEndNum)
                    .addComponent(labelEnd)
                    .addComponent(labelNome)
                    .addComponent(labelId))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelCadastro)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtFieldCEP, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                            .addComponent(txtFieldUF)
                            .addComponent(txtFieldEndCidade)
                            .addComponent(txtFieldEndBairro)
                            .addComponent(txtFieldId)
                            .addComponent(txtFieldNome)
                            .addComponent(txtFieldEnd)
                            .addComponent(txtFieldEndNum)
                            .addComponent(txtFieldEndComp)
                            .addComponent(txtFieldTel)
                            .addComponent(txtFieldCPF)
                            .addComponent(txtFieldDataNasc)
                            .addComponent(txtFieldCNPJ))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buttonCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(labelCadastro)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFieldEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelEnd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFieldEndNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelEndNum))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFieldEndComp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelEndComp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFieldEndBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelEndBairro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFieldEndCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelEndCidade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFieldUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelUF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFieldCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCEP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFieldTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCPF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFieldDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelDataNasc)
                    .addComponent(buttonCancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFieldCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCNPJ)
                    .addComponent(buttonSalvar))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonSalvarMouseClicked
        Cliente dados_cliente = new Cliente();
        
        dados_cliente.setIdCli(Integer.parseInt(txtFieldId.getText()));
        dados_cliente.setNomeCli(txtFieldNome.getText());
        dados_cliente.setEndCli(txtFieldEnd.getText());
        dados_cliente.setEndNumCli(txtFieldEndNum.getText());
        dados_cliente.setEndCompCli(txtFieldEndComp.getText());
        dados_cliente.setBairroCli(txtFieldEndBairro.getText());
        dados_cliente.setCidadeCli(txtFieldEndCidade.getText());
        dados_cliente.setUfCli(txtFieldUF.getText());
        dados_cliente.setCepCli(txtFieldCEP.getText());
        dados_cliente.setTelCli(txtFieldTel.getText());
        dados_cliente.setCpfCli(txtFieldCPF.getText());
        dados_cliente.setDataNascCli(txtFieldDataNasc.getText());
        dados_cliente.setCnpjCli(txtFieldCNPJ.getText());
        
        connectionDAO objCon = new connectionDAO();
        objCon.insereRegistroJFBD("CLIENTES", dados_cliente);
        
        
    }//GEN-LAST:event_buttonSalvarMouseClicked

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
            java.util.logging.Logger.getLogger(Cad_Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cad_Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cad_Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cad_Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cad_Clientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JLabel labelCEP;
    private javax.swing.JLabel labelCNPJ;
    private javax.swing.JLabel labelCPF;
    private javax.swing.JLabel labelCadastro;
    private javax.swing.JLabel labelDataNasc;
    private javax.swing.JLabel labelEnd;
    private javax.swing.JLabel labelEndBairro;
    private javax.swing.JLabel labelEndCidade;
    private javax.swing.JLabel labelEndComp;
    private javax.swing.JLabel labelEndNum;
    private javax.swing.JLabel labelId;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelTel;
    private javax.swing.JLabel labelUF;
    private javax.swing.JTextField txtFieldCEP;
    private javax.swing.JTextField txtFieldCNPJ;
    private javax.swing.JTextField txtFieldCPF;
    private javax.swing.JTextField txtFieldDataNasc;
    private javax.swing.JTextField txtFieldEnd;
    private javax.swing.JTextField txtFieldEndBairro;
    private javax.swing.JTextField txtFieldEndCidade;
    private javax.swing.JTextField txtFieldEndComp;
    private javax.swing.JTextField txtFieldEndNum;
    private javax.swing.JTextField txtFieldId;
    private javax.swing.JTextField txtFieldNome;
    private javax.swing.JTextField txtFieldTel;
    private javax.swing.JTextField txtFieldUF;
    // End of variables declaration//GEN-END:variables
}
