package client;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import middleware.Interface_Calculador_Notas;

public class Cliente extends javax.swing.JFrame {
    
    private int teste;
    private Interface_Calculador_Notas objRemoto=null;

    public Cliente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem3 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem4 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem5 = new javax.swing.JRadioButtonMenuItem();
        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        label_apresentacao = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        text_nome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        questao_1_a = new javax.swing.JRadioButton();
        questao_1_b = new javax.swing.JRadioButton();
        questao_1_c = new javax.swing.JRadioButton();
        questao_1_d = new javax.swing.JRadioButton();
        questao_1_e = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        questao_2_a = new javax.swing.JRadioButton();
        questao_2_b = new javax.swing.JRadioButton();
        questao_2_c = new javax.swing.JRadioButton();
        questao_2_d = new javax.swing.JRadioButton();
        questao_2_e = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        questao_3_a = new javax.swing.JRadioButton();
        questao_3_b = new javax.swing.JRadioButton();
        questao_3_c = new javax.swing.JRadioButton();
        questao_3_d = new javax.swing.JRadioButton();
        questao_3_e = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        questao_4_a = new javax.swing.JRadioButton();
        questao_4_b = new javax.swing.JRadioButton();
        questao_4_c = new javax.swing.JRadioButton();
        questao_4_d = new javax.swing.JRadioButton();
        questao_4_e = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        questao_5_a = new javax.swing.JRadioButton();
        questao_5_b = new javax.swing.JRadioButton();
        questao_5_c = new javax.swing.JRadioButton();
        questao_5_d = new javax.swing.JRadioButton();
        questao_5_e = new javax.swing.JRadioButton();
        btn_calcular_nota = new javax.swing.JToggleButton();
        jLabel7 = new javax.swing.JLabel();
        text_nota_obtida = new javax.swing.JTextField();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jRadioButtonMenuItem2.setSelected(true);
        jRadioButtonMenuItem2.setText("jRadioButtonMenuItem2");

        jRadioButtonMenuItem3.setSelected(true);
        jRadioButtonMenuItem3.setText("jRadioButtonMenuItem3");

        jRadioButtonMenuItem4.setSelected(true);
        jRadioButtonMenuItem4.setText("jRadioButtonMenuItem4");

        jRadioButtonMenuItem5.setSelected(true);
        jRadioButtonMenuItem5.setText("jRadioButtonMenuItem5");

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label_apresentacao.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        label_apresentacao.setText("Trabalho Prático 1 - Programação Paralela e Distribuída");

        jLabel1.setText("Nome:");

        text_nome.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        text_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_nomeActionPerformed(evt);
            }
        });

        jLabel2.setText("Questão 1:");

        buttonGroup1.add(questao_1_a);
        questao_1_a.setText("A");
        questao_1_a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                questao_1_aActionPerformed(evt);
            }
        });

        buttonGroup1.add(questao_1_b);
        questao_1_b.setText("B");

        buttonGroup1.add(questao_1_c);
        questao_1_c.setText("C");

        buttonGroup1.add(questao_1_d);
        questao_1_d.setText("D");
        questao_1_d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                questao_1_dActionPerformed(evt);
            }
        });

        buttonGroup1.add(questao_1_e);
        questao_1_e.setText("E");

        jLabel3.setText("Questão 2:");

        buttonGroup2.add(questao_2_a);
        questao_2_a.setText("A");

        buttonGroup2.add(questao_2_b);
        questao_2_b.setText("B");

        buttonGroup2.add(questao_2_c);
        questao_2_c.setText("C");

        buttonGroup2.add(questao_2_d);
        questao_2_d.setText("D");

        buttonGroup2.add(questao_2_e);
        questao_2_e.setText("E");

        jLabel4.setText("Questão 3:");

        buttonGroup3.add(questao_3_a);
        questao_3_a.setText("A");

        buttonGroup3.add(questao_3_b);
        questao_3_b.setText("B");

        buttonGroup3.add(questao_3_c);
        questao_3_c.setText("C");

        buttonGroup3.add(questao_3_d);
        questao_3_d.setText("D");

        buttonGroup3.add(questao_3_e);
        questao_3_e.setText("E");

        jLabel5.setText("Questão 4:");

        buttonGroup4.add(questao_4_a);
        questao_4_a.setText("A");

        buttonGroup4.add(questao_4_b);
        questao_4_b.setText("B");

        buttonGroup4.add(questao_4_c);
        questao_4_c.setText("C");

        buttonGroup4.add(questao_4_d);
        questao_4_d.setText("D");

        buttonGroup4.add(questao_4_e);
        questao_4_e.setText("E");

        jLabel6.setText("Questão 5:");

        buttonGroup5.add(questao_5_a);
        questao_5_a.setText("A");

        buttonGroup5.add(questao_5_b);
        questao_5_b.setText("B");

        buttonGroup5.add(questao_5_c);
        questao_5_c.setText("C");

        buttonGroup5.add(questao_5_d);
        questao_5_d.setText("D");

        buttonGroup5.add(questao_5_e);
        questao_5_e.setText("E");

        btn_calcular_nota.setText("Calcular nota");
        btn_calcular_nota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calcular_notaActionPerformed(evt);
            }
        });

        jLabel7.setText("NOTA OBTIDA:");

        text_nota_obtida.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_apresentacao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(questao_1_a)
                                .addGap(18, 18, 18)
                                .addComponent(questao_1_b)
                                .addGap(18, 18, 18)
                                .addComponent(questao_1_c)
                                .addGap(18, 18, 18)
                                .addComponent(questao_1_d)
                                .addGap(18, 18, 18)
                                .addComponent(questao_1_e))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(text_nome))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(questao_2_a)
                                    .addGap(18, 18, 18)
                                    .addComponent(questao_2_b)
                                    .addGap(18, 18, 18)
                                    .addComponent(questao_2_c)
                                    .addGap(18, 18, 18)
                                    .addComponent(questao_2_d)
                                    .addGap(18, 18, 18)
                                    .addComponent(questao_2_e))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(questao_3_a)
                                    .addGap(18, 18, 18)
                                    .addComponent(questao_3_b)
                                    .addGap(18, 18, 18)
                                    .addComponent(questao_3_c)
                                    .addGap(18, 18, 18)
                                    .addComponent(questao_3_d)
                                    .addGap(18, 18, 18)
                                    .addComponent(questao_3_e))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(questao_4_a)
                                    .addGap(18, 18, 18)
                                    .addComponent(questao_4_b)
                                    .addGap(18, 18, 18)
                                    .addComponent(questao_4_c)
                                    .addGap(18, 18, 18)
                                    .addComponent(questao_4_d)
                                    .addGap(18, 18, 18)
                                    .addComponent(questao_4_e)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(questao_5_a)
                                        .addGap(18, 18, 18)
                                        .addComponent(questao_5_b)
                                        .addGap(18, 18, 18)
                                        .addComponent(questao_5_c)
                                        .addGap(18, 18, 18)
                                        .addComponent(questao_5_d)
                                        .addGap(18, 18, 18))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn_calcular_nota)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(text_nota_obtida, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(questao_5_e, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 10, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_apresentacao, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(questao_1_a)
                    .addComponent(questao_1_b)
                    .addComponent(questao_1_c)
                    .addComponent(questao_1_d)
                    .addComponent(questao_1_e))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(questao_2_a)
                    .addComponent(questao_2_b)
                    .addComponent(questao_2_c)
                    .addComponent(questao_2_d)
                    .addComponent(questao_2_e))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(questao_3_a)
                    .addComponent(questao_3_b)
                    .addComponent(questao_3_c)
                    .addComponent(questao_3_d)
                    .addComponent(questao_3_e))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(questao_4_a)
                    .addComponent(questao_4_b)
                    .addComponent(questao_4_c)
                    .addComponent(questao_4_d)
                    .addComponent(questao_4_e))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(questao_5_a)
                    .addComponent(questao_5_b)
                    .addComponent(questao_5_c)
                    .addComponent(questao_5_d)
                    .addComponent(questao_5_e))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_calcular_nota)
                    .addComponent(jLabel7)
                    .addComponent(text_nota_obtida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void text_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_nomeActionPerformed

    private void questao_1_dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_questao_1_dActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_questao_1_dActionPerformed

    private void questao_1_aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_questao_1_aActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_questao_1_aActionPerformed

    private void btn_calcular_notaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calcular_notaActionPerformed
        String nome, questao_1, questao_2, questao_3, questao_4, questao_5;        
        nome=text_nome.getText();
        if(questao_1_a.isSelected()) questao_1="A";
        else if(questao_1_b.isSelected()) questao_1="B";
            else if(questao_1_c.isSelected()) questao_1="C";
                else if(questao_1_d.isSelected()) questao_1="D";
                    else if(questao_1_e.isSelected()) questao_1="E";
                        else questao_1="-";
        if(questao_2_a.isSelected()) questao_2="A";
        else if(questao_2_b.isSelected()) questao_2="B";
            else if(questao_2_c.isSelected()) questao_2="C";
                else if(questao_2_d.isSelected()) questao_2="D";
                    else if(questao_2_e.isSelected()) questao_2="E";
                        else questao_2="-";
        if(questao_3_a.isSelected()) questao_3="A";
        else if(questao_3_b.isSelected()) questao_3="B";
            else if(questao_3_c.isSelected()) questao_3="C";
                else if(questao_3_d.isSelected()) questao_3="D";
                    else if(questao_3_e.isSelected()) questao_3="E";
                        else questao_3="-";
        if(questao_4_a.isSelected()) questao_4="A";
        else if(questao_4_b.isSelected()) questao_4="B";
            else if(questao_4_c.isSelected()) questao_4="C";
                else if(questao_4_d.isSelected()) questao_4="D";
                    else if(questao_4_e.isSelected()) questao_4="E";
                        else questao_4="-";
        if(questao_5_a.isSelected()) questao_5="A";
        else if(questao_5_b.isSelected()) questao_5="B";
            else if(questao_5_c.isSelected()) questao_5="C";
                else if(questao_5_d.isSelected()) questao_5="D";
                    else if(questao_5_e.isSelected()) questao_5="E";
                        else questao_5="-";       
        try{
            objRemoto=(Interface_Calculador_Notas)Naming.lookup("//localhost/servidor_calculador_nota");
            //objRemoto=(Interface_Calculador_Notas)Naming.lookup("rmi://192.168.1.103:1099/servidor_calculador_nota");
        }
        catch (NotBoundException | MalformedURLException | RemoteException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);           
        }       
        try {
            teste=objRemoto.calcular_nota(nome, questao_1, questao_2, questao_3, questao_4, questao_5);
            String str = Integer.toString(teste);
            text_nota_obtida.setText(str);
        }
        catch (RemoteException ex){
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }       
    }//GEN-LAST:event_btn_calcular_notaActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Cliente().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btn_calcular_nota;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem3;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem4;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem5;
    private javax.swing.JLabel label_apresentacao;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.MenuBar menuBar1;
    private javax.swing.JRadioButton questao_1_a;
    private javax.swing.JRadioButton questao_1_b;
    private javax.swing.JRadioButton questao_1_c;
    private javax.swing.JRadioButton questao_1_d;
    private javax.swing.JRadioButton questao_1_e;
    private javax.swing.JRadioButton questao_2_a;
    private javax.swing.JRadioButton questao_2_b;
    private javax.swing.JRadioButton questao_2_c;
    private javax.swing.JRadioButton questao_2_d;
    private javax.swing.JRadioButton questao_2_e;
    private javax.swing.JRadioButton questao_3_a;
    private javax.swing.JRadioButton questao_3_b;
    private javax.swing.JRadioButton questao_3_c;
    private javax.swing.JRadioButton questao_3_d;
    private javax.swing.JRadioButton questao_3_e;
    private javax.swing.JRadioButton questao_4_a;
    private javax.swing.JRadioButton questao_4_b;
    private javax.swing.JRadioButton questao_4_c;
    private javax.swing.JRadioButton questao_4_d;
    private javax.swing.JRadioButton questao_4_e;
    private javax.swing.JRadioButton questao_5_a;
    private javax.swing.JRadioButton questao_5_b;
    private javax.swing.JRadioButton questao_5_c;
    private javax.swing.JRadioButton questao_5_d;
    private javax.swing.JRadioButton questao_5_e;
    private javax.swing.JTextField text_nome;
    private javax.swing.JTextField text_nota_obtida;
    // End of variables declaration//GEN-END:variables
}
