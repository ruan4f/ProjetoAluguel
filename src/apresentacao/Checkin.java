package apresentacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import negocio.Cliente;
import negocio.RegistrosAlugueis;
import negocio.Pousada;
import negocio.Aluguel;
import java.util.Date;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author vinicius.andrade
 */
public class Checkin extends javax.swing.JFrame {

    /**
     * Creates new form Checkin
     */
    public Checkin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        cbTipoAcomodacao = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        txtCamasExtars = new javax.swing.JTextField();
        btRegistrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        btSair = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        dcData = new com.toedter.calendar.JDateChooser();
        btNovo = new javax.swing.JButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "CheckIn"));

        jLabel2.setText("Nome: ");

        cbTipoAcomodacao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Quarto com Banheira", "Quarto sem Banheira", "Chalé", " " }));
        cbTipoAcomodacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoAcomodacaoActionPerformed(evt);
            }
        });

        jLabel3.setText("Camas extras");

        txtCamasExtars.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCamasExtarsActionPerformed(evt);
            }
        });

        btRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Save_32.png"))); // NOI18N
        btRegistrar.setText("Registrar");
        btRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRegistrarActionPerformed(evt);
            }
        });

        txtArea.setColumns(20);
        txtArea.setRows(5);
        jScrollPane1.setViewportView(txtArea);

        btSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Cancel-32.png"))); // NOI18N
        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        jLabel4.setText("Tipo de Quarto");

        jLabel5.setText("Data prevista para sair:");

        btNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/new-32.png"))); // NOI18N
        btNovo.setText("Novo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dcData, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(cbTipoAcomodacao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(11, 11, 11)
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtCamasExtars, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbTipoAcomodacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtCamasExtars, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(dcData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btRegistrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btSair))
                    .addComponent(jScrollPane1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRegistrarActionPerformed
        // inicializa campos;
        Boolean paraTudo = true;
        RegistrosAlugueis registroAlugueis = RegistrosAlugueis.getInstance();
        Aluguel aluguel = new Aluguel();
        //VALIDA CAMPOS 
        if (txtNome.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Digite um nome!");
                return;
        }
        Aluguel aluguel2 = new Aluguel();   
        try {
            aluguel2 = registroAlugueis.getAlugueis().get(registroAlugueis.buscaAluguel(txtNome.getText()));           
        } catch (Exception ex) {
            paraTudo = false;           
        }
        if (paraTudo) {
            JOptionPane.showMessageDialog(this, "No momento só alugamos uma instalação por pessoa");
        }
        
        Pousada pousada = Pousada.getInstance();
        //Localiza quarto Disponível
        if (cbTipoAcomodacao.getSelectedItem() == "Quarto com Banheira") {
            int i;
        //verifica os quartos
            for (i = 0; i < pousada.getQuantQuartos(); i++) {
                // se achou um quarto com banheira
                if ((pousada.buscaQuarto(i).isReservado() == false) && (pousada.buscaQuarto(i).isTemBanheira())) {
                    //Mensagem
                    txtArea.setText("Reservamos o quarto " + (i + 1) + " com \n Banheira para o Cliente: \n" + txtNome.getText());
                    //Instancia objetos que serão incluídos.
                    
                    Cliente cliente = new Cliente();
                    Date data = new Date();
                    
                    // Seta Atributos
                    data.setTime(data.getTime());
                    cliente.setNome(txtNome.getText());
                    aluguel.setCliente(cliente);
                    aluguel.setQuarto(pousada.buscaQuarto(i));
                    aluguel.setDataEntrada(data);
                    
                    //Faz a verificação da data prevista de saída
                    try{
                        String dataSaida = new SimpleDateFormat("dd/MM/yyyy HH:mm").format(dcData.getDate());
                        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm");
                        Date dataFormatadaSaida = formatter.parse(dataSaida);
                        aluguel.setDataSaida(dataFormatadaSaida);
                    }catch(ParseException e){
                        JOptionPane.showMessageDialog(null,"Data no formato errado. Por favor escolha uma data");
                               
                    }
                    
                    aluguel.getQuarto().setReservado(true);                   
                    registroAlugueis.addAluguel(aluguel);
                    break;
                }
                txtArea.setText(" Não existe quarto disponível.");
            }
        } else if (cbTipoAcomodacao.getSelectedItem() == "Quarto sem Banheira") {
            int i;
//verifica os quartos 
            for (i = 0; i < pousada.getQuantQuartos(); i++) {
                // se achou um quarto com banheira
                if ((pousada.buscaQuarto(i).isReservado() == false) && (pousada.buscaQuarto(i).isTemBanheira() == false)) {
                    //Mensagem
                    txtArea.setText("Reservamos o quarto " + (i + 1) + " sem Banheira \n para o Cliente: \n" + txtNome.getText());
                    //Instancia objetos que serão incluídos.
                   
                    Cliente cliente = new Cliente();
                    Date data = new Date();
                   
                    // Seta Atributos
                    data.setTime(data.getTime());
                    cliente.setNome(txtNome.getText());
                    aluguel.setCliente(cliente);
                    aluguel.setQuarto(pousada.buscaQuarto(i));
                    aluguel.setDataEntrada(data);
                    aluguel.getQuarto().setReservado(true);
                    registroAlugueis.addAluguel(aluguel);
                    break;
                }
                txtArea.setText(" Não existe quarto disponível.");
            }
        } else if (cbTipoAcomodacao.getSelectedItem() == "Chalé") {
            int i;
        try {
        Integer.parseInt(txtCamasExtars.getText());
        }catch (Exception ex){
                JOptionPane.showMessageDialog(this, "Somente números são permitidos");
                return;
        }
        
//verifica os quartos 
            for (i = 0; i < pousada.getQuantChales(); i++) {
                // se achou um quarto com banheira
                if ((pousada.getChale(i).isReservado() == false) && (pousada.buscaQuarto(i).isTemBanheira() == false)) {
                        //Mensagem

                    if (txtCamasExtars.getText().equals("")) {
                        txtArea.setText("Reservamos o Chalé " + (i + 1) + " \n para o Cliente: " + txtNome.getText());
                    } else {
                        txtArea.setText("Reservamos o Chalé " + (i + 1) + "\n"
                                + "com  " + txtCamasExtars.getText() + " camas extras \n para o Cliente: " + txtNome.getText());
                    }

                    //Instancia objetos que serão incluídos.
                 
                    Cliente cliente = new Cliente();
                    Date data = new Date();
                  
                    // Seta Atributos
                    data.setTime(data.getTime());
                    cliente.setNome(txtNome.getText());
                    aluguel.setCliente(cliente);
                    aluguel.setChale(pousada.getChale(i));
                    aluguel.setDataEntrada(data);
                    aluguel.getChale().setReservado(true);
                    if (txtCamasExtars.getText().equals("")) {
                        aluguel.getChale().setCamasExtras(0);
                    } else {
                        aluguel.getChale().setCamasExtras(Integer.valueOf(txtCamasExtars.getText()));
                    }
                    registroAlugueis.addAluguel(aluguel);
                    break;
                }
                txtArea.setText(" Não existe quarto disponível.");
            }
            
        }
    }//GEN-LAST:event_btRegistrarActionPerformed

    private void cbTipoAcomodacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipoAcomodacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTipoAcomodacaoActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btSairActionPerformed

    private void txtCamasExtarsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCamasExtarsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCamasExtarsActionPerformed

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
            java.util.logging.Logger.getLogger(Checkin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Checkin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Checkin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Checkin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Checkin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btRegistrar;
    private javax.swing.JButton btSair;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cbTipoAcomodacao;
    private com.toedter.calendar.JDateChooser dcData;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JTextField txtCamasExtars;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
