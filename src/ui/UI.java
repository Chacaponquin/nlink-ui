package ui;

import util.FileUtils;
import util.FormData;

/**
 *
 * @author Hector Angel Gomez
 */
public class UI extends javax.swing.JFrame {

    FormData form;

    public UI() {
        this.initComponents();
        this.initFormLables();
        this.initForm();

        this.setLocationRelativeTo(null);
    }

    private void initForm() {
        float v1 = this.changeSliderValue(this.inputFirstSlider.getValue());
        float v2 = this.changeSliderValue(this.inputSecondSlider.getValue());
        float v3 = this.changeSliderValue(this.inputThirdSlider.getValue());
        float v4 = this.changeSliderValue(this.inputForthSlider.getValue());
        this.form = new FormData(v1, v2, v3, v4);
    }

    private void initFormLables() {
        this.inputFirstLabel.setText(String.valueOf(this.inputFirstSlider.getValue()));
        this.inputSecondLabel.setText(String.valueOf(this.inputSecondSlider.getValue()));
        this.inputThirdLabel.setText(String.valueOf(this.inputThirdSlider.getValue()));
        this.inputForthLabel.setText(String.valueOf(this.inputForthSlider.getValue()));
    }

    private float changeSliderValue(int v) {
        return (float) v / 10;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FormPanel = new javax.swing.JPanel();
        inputFirstSlider = new javax.swing.JSlider();
        inputSecondSlider = new javax.swing.JSlider();
        inputThirdSlider = new javax.swing.JSlider();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        inputForthSlider = new javax.swing.JSlider();
        inputFirstLabel = new javax.swing.JLabel();
        inputSecondLabel = new javax.swing.JLabel();
        inputThirdLabel = new javax.swing.JLabel();
        inputForthLabel = new javax.swing.JLabel();
        GraphPanel = new javax.swing.JPanel();
        EjemplosPanel = new javax.swing.JScrollPane();
        Menu = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("NLink");
        setPreferredSize(new java.awt.Dimension(1280, 700));
        setSize(new java.awt.Dimension(1280, 700));

        FormPanel.setBackground(new java.awt.Color(204, 204, 204));

        inputFirstSlider.setValue(0);
        inputFirstSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                inputFirstSliderStateChanged(evt);
            }
        });

        inputSecondSlider.setValue(0);
        inputSecondSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                inputSecondSliderStateChanged(evt);
            }
        });

        inputThirdSlider.setValue(0);
        inputThirdSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                inputThirdSliderStateChanged(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setLabel("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setText("Valor 1:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setText("Valor 2:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setText("Valor 3:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setText("Valor 4:");

        inputForthSlider.setValue(0);
        inputForthSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                inputForthSliderStateChanged(evt);
            }
        });

        inputFirstLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        inputFirstLabel.setText("jLabel5");

        inputSecondLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        inputSecondLabel.setText("jLabel6");

        inputThirdLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        inputThirdLabel.setText("jLabel7");

        inputForthLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        inputForthLabel.setText("jLabel8");

        javax.swing.GroupLayout FormPanelLayout = new javax.swing.GroupLayout(FormPanel);
        FormPanel.setLayout(FormPanelLayout);
        FormPanelLayout.setHorizontalGroup(
            FormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormPanelLayout.createSequentialGroup()
                .addGroup(FormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FormPanelLayout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jButton1))
                    .addGroup(FormPanelLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(FormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputForthSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(FormPanelLayout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(inputFirstLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(inputThirdSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputFirstSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(FormPanelLayout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputThirdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(FormPanelLayout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(inputForthLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(inputSecondSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(FormPanelLayout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(inputSecondLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        FormPanelLayout.setVerticalGroup(
            FormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormPanelLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(FormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(inputFirstLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputFirstSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(FormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(inputSecondLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputSecondSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(FormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(inputThirdLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputThirdSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(FormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(inputForthLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputForthSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 258, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout GraphPanelLayout = new javax.swing.GroupLayout(GraphPanel);
        GraphPanel.setLayout(GraphPanelLayout);
        GraphPanelLayout.setHorizontalGroup(
            GraphPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GraphPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(EjemplosPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 984, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        GraphPanelLayout.setVerticalGroup(
            GraphPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EjemplosPanel)
        );

        Menu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jMenu2.setText("Opciones");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMenuItem1.setText("Cargar BD");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMenuItem2.setText("Ejemplos");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        Menu.add(jMenu2);

        setJMenuBar(Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(FormPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(GraphPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FormPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(GraphPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.form.print();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        FileUtils.readDataBase();        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void inputFirstSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_inputFirstSliderStateChanged

        float value = this.changeSliderValue(this.inputFirstSlider.getValue());
        this.inputFirstLabel.setText(String.valueOf(value));
        this.form.setInputOne(value);     // TODO add your handling code here:
    }//GEN-LAST:event_inputFirstSliderStateChanged

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed

    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        FileUtils.readDataBase();        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void inputSecondSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_inputSecondSliderStateChanged

        float value = this.changeSliderValue(this.inputSecondSlider.getValue());
        this.inputSecondLabel.setText(String.valueOf(value));
        this.form.setInputSecond(value);
    }//GEN-LAST:event_inputSecondSliderStateChanged

    private void inputThirdSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_inputThirdSliderStateChanged
        float value = this.changeSliderValue(this.inputThirdSlider.getValue());
        this.inputThirdLabel.setText(String.valueOf(value));
        this.form.setInputThird(value);
    }//GEN-LAST:event_inputThirdSliderStateChanged

    private void inputForthSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_inputForthSliderStateChanged

        float value = this.changeSliderValue(this.inputForthSlider.getValue());
        this.inputForthLabel.setText(String.valueOf(value));
        this.form.setInputForth(value);
    }//GEN-LAST:event_inputForthSliderStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane EjemplosPanel;
    private javax.swing.JPanel FormPanel;
    private javax.swing.JPanel GraphPanel;
    private javax.swing.JMenuBar Menu;
    private javax.swing.JLabel inputFirstLabel;
    private javax.swing.JSlider inputFirstSlider;
    private javax.swing.JLabel inputForthLabel;
    private javax.swing.JSlider inputForthSlider;
    private javax.swing.JLabel inputSecondLabel;
    private javax.swing.JSlider inputSecondSlider;
    private javax.swing.JLabel inputThirdLabel;
    private javax.swing.JSlider inputThirdSlider;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    // End of variables declaration//GEN-END:variables
}
