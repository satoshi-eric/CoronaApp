/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coronaapp.View;

import coronaapp.EquipeMedica;
import coronaapp.Paciente;
import coronaapp.Sintomas;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author silva
 */
public class Menu extends javax.swing.JFrame {

    private boolean isEquipeMedica;
    private Paciente paciente = null;
    private EquipeMedica equipeMedica = null;

    /**
     * Creates new form Menu
     *
     * @param isEquipeMedica
     */
    public Menu(boolean isEquipeMedica) {
        initComponents();
        configureView(isEquipeMedica);
    }

    public Menu(Paciente p) {
        initComponents();
        this.paciente = p;

        configureView(false);
        nomeLabel.setText("Olá, " + paciente.getNome());
    }

    public Menu(EquipeMedica em) {
        initComponents();
        this.equipeMedica = em;

        configureView(true);
        nomeLabel.setText("Olá, " + em.getNome());
    }

    private void configureView(boolean isEquipeMedica) {
        this.isEquipeMedica = isEquipeMedica;
        pacientePanel.setVisible(!isEquipeMedica);
        medicoPanel.setVisible(isEquipeMedica);
    }

    public void updateSintomasPaciente(Sintomas sintomas) {
        paciente.setSintomas(sintomas);
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public void setEquipeMedica(EquipeMedica equipeMedica) {
        this.equipeMedica = equipeMedica;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        topPanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        nomeLabel = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        conteudoPanel = new javax.swing.JPanel();
        pacientePanel = new javax.swing.JPanel();
        btnMensagensPaciente = new javax.swing.JButton();
        btnAtualizarSintomas = new javax.swing.JButton();
        btnVerificarHistoricoPaciente = new javax.swing.JButton();
        btnAtualizarCadastroPaciente = new javax.swing.JButton();
        medicoPanel = new javax.swing.JPanel();
        btnMensagensMedicas = new javax.swing.JButton();
        btnMarcarVisita = new javax.swing.JButton();
        btnHistoricoMedico = new javax.swing.JButton();
        btnGerarRelatorio = new javax.swing.JButton();
        btnAtualizarCadastroMedico = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(conteudoPanel.getSize());

        titleLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("CoronaApp");
        titleLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        nomeLabel.setText("Olá, [nome]");

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coronaapp/icons/logo.png"))); // NOI18N

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(topPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 318, Short.MAX_VALUE)
                        .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSair, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nomeLabel, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(jSeparator1))
                .addContainerGap())
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(topPanelLayout.createSequentialGroup()
                        .addComponent(nomeLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9))
        );

        conteudoPanel.setLayout(new java.awt.BorderLayout());

        btnMensagensPaciente.setText("Mensagens");
        btnMensagensPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMensagensPacienteActionPerformed(evt);
            }
        });

        btnAtualizarSintomas.setText("Atualizar sintomas");
        btnAtualizarSintomas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarSintomasActionPerformed(evt);
            }
        });

        btnVerificarHistoricoPaciente.setText("Verificar histórico médico");
        btnVerificarHistoricoPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarHistoricoPacienteActionPerformed(evt);
            }
        });

        btnAtualizarCadastroPaciente.setText("Atualizar cadastro");
        btnAtualizarCadastroPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarCadastroPacienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pacientePanelLayout = new javax.swing.GroupLayout(pacientePanel);
        pacientePanel.setLayout(pacientePanelLayout);
        pacientePanelLayout.setHorizontalGroup(
            pacientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pacientePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pacientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnMensagensPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAtualizarSintomas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVerificarHistoricoPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAtualizarCadastroPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pacientePanelLayout.setVerticalGroup(
            pacientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pacientePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnMensagensPaciente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAtualizarSintomas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVerificarHistoricoPaciente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAtualizarCadastroPaciente)
                .addContainerGap())
        );

        conteudoPanel.add(pacientePanel, java.awt.BorderLayout.CENTER);

        btnMensagensMedicas.setText("Mensagens");
        btnMensagensMedicas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMensagensMedicasActionPerformed(evt);
            }
        });

        btnMarcarVisita.setText("Marcar visita");
        btnMarcarVisita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMarcarVisitaActionPerformed(evt);
            }
        });

        btnHistoricoMedico.setText("Verificar histórico médico");
        btnHistoricoMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistoricoMedicoActionPerformed(evt);
            }
        });

        btnGerarRelatorio.setText("Gerar relatório");
        btnGerarRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarRelatorioActionPerformed(evt);
            }
        });

        btnAtualizarCadastroMedico.setText("Atualizar cadastro");
        btnAtualizarCadastroMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarCadastroMedicoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout medicoPanelLayout = new javax.swing.GroupLayout(medicoPanel);
        medicoPanel.setLayout(medicoPanelLayout);
        medicoPanelLayout.setHorizontalGroup(
            medicoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(medicoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(medicoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnAtualizarCadastroMedico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMensagensMedicas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMarcarVisita, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHistoricoMedico, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGerarRelatorio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        medicoPanelLayout.setVerticalGroup(
            medicoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(medicoPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMensagensMedicas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMarcarVisita)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHistoricoMedico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGerarRelatorio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAtualizarCadastroMedico))
        );

        conteudoPanel.add(medicoPanel, java.awt.BorderLayout.PAGE_START);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(conteudoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(topPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(topPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(conteudoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        try {
            if (paciente != null && equipeMedica == null) {
                Login login = new Login(paciente);
                login.setVisible(true);
                login.setLocationRelativeTo(this);
            } else {
                Login login = new Login(equipeMedica);
                login.setVisible(true);
                login.setLocationRelativeTo(this);
            }
            this.setVisible(false);
        } catch (Exception e) {
            messageError(e);
        }
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnAtualizarCadastroMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarCadastroMedicoActionPerformed
        try {
            Cadastro inicial = new Cadastro(this, this.equipeMedica);
            inicial.setVisible(true);
            inicial.setLocationRelativeTo(null);
            this.setVisible(false);
        } catch (Exception e) {
            messageError(e);
        }
    }//GEN-LAST:event_btnAtualizarCadastroMedicoActionPerformed

    private void btnAtualizarCadastroPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarCadastroPacienteActionPerformed
        try {
            //Enviar para sintomas
            Cadastro inicial = new Cadastro(this, paciente, paciente.getSintomas());
            inicial.setVisible(true);
            inicial.setLocationRelativeTo(null);
            this.setVisible(false);
        } catch (Exception e) {
            messageError(e);
        }
    }//GEN-LAST:event_btnAtualizarCadastroPacienteActionPerformed

    private void btnAtualizarSintomasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarSintomasActionPerformed
        try {
            AtualizarSintomas atualizarSintomas = new AtualizarSintomas(this, paciente.getSintomas());
            atualizarSintomas.setVisible(true);
            atualizarSintomas.setLocationRelativeTo(null);
            this.setVisible(false);
        } catch (Exception e) {
            messageError(e);
        }
    }//GEN-LAST:event_btnAtualizarSintomasActionPerformed

    private void btnMensagensMedicasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMensagensMedicasActionPerformed
        try {
            Mensagens mensagens = new Mensagens(true);
            mensagens.setVisible(true);
            mensagens.setLocationRelativeTo(this);
            this.setVisible(false);
        } catch (Exception e) {
            messageError(e);
        }
    }//GEN-LAST:event_btnMensagensMedicasActionPerformed

    private void btnHistoricoMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistoricoMedicoActionPerformed
        /*
        Historico historico = new Historico(this.isEquipeMedica);
        historico.setVisible(true);
        historico.setLocationRelativeTo(this);
        this.setVisible(false);
         */
        ConsultarHistorico consultarHistorico = new ConsultarHistorico();
        consultarHistorico.setVisible(true);
        consultarHistorico.setLocationRelativeTo(this);
        this.setVisible(false);
    }//GEN-LAST:event_btnHistoricoMedicoActionPerformed

    private void btnVerificarHistoricoPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarHistoricoPacienteActionPerformed
        try {
            Historico historico = new Historico(this.isEquipeMedica);
            historico.setVisible(true);
            historico.setLocationRelativeTo(this);
            this.setVisible(false);
        } catch (Exception e) {
            messageError(e);
        }
    }//GEN-LAST:event_btnVerificarHistoricoPacienteActionPerformed

    private void btnMensagensPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMensagensPacienteActionPerformed
        try {
            Mensagens mensagens = new Mensagens(false);
            mensagens.setVisible(true);
            mensagens.setLocationRelativeTo(this);
            this.setVisible(false);
        } catch (Exception e) {
            messageError(e);
        }
    }//GEN-LAST:event_btnMensagensPacienteActionPerformed

    private void btnGerarRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarRelatorioActionPerformed
        try {
            GerarRelatorio gerarRelatorio = new GerarRelatorio();
            gerarRelatorio.setVisible(true);
            gerarRelatorio.setLocationRelativeTo(this);
            this.setVisible(false);
        } catch (Exception e) {
            messageError(e);
        }
    }//GEN-LAST:event_btnGerarRelatorioActionPerformed

    private void btnMarcarVisitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMarcarVisitaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMarcarVisitaActionPerformed

    private void messageError(Exception e) throws HeadlessException {
        JOptionPane.showMessageDialog(this, "Não foi possível reazizar esta ação. Faça login novamente!\nErro:" + e.getMessage(), "Erro do executar ação", JOptionPane.ERROR_MESSAGE);
        Login login = new Login();
        login.setVisible(true);
        login.setLocationRelativeTo(this);
        this.dispose();
    }

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu(true).setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizarCadastroMedico;
    private javax.swing.JButton btnAtualizarCadastroPaciente;
    private javax.swing.JButton btnAtualizarSintomas;
    private javax.swing.JButton btnGerarRelatorio;
    private javax.swing.JButton btnHistoricoMedico;
    private javax.swing.JButton btnMarcarVisita;
    private javax.swing.JButton btnMensagensMedicas;
    private javax.swing.JButton btnMensagensPaciente;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnVerificarHistoricoPaciente;
    private javax.swing.JPanel conteudoPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel medicoPanel;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JPanel pacientePanel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JPanel topPanel;
    // End of variables declaration//GEN-END:variables
}
