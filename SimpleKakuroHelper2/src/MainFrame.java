//# BEGIN SKELETON
import java.util.Set;

/**
 * Main frame (window) of the application.
 *
 * @author Tom Verhoeff (TU/e)
<!--//# BEGIN TODO Name, group id, and date-->
<p><font color="red"><b>Bogdan Floris, 0935036, 26.03.2017</b></font></p>
<!--//# END TODO-->
 */
// -----8<----- cut line -----8<-----
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame.
     */
    public MainFrame() {
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

        jLabelMax = new javax.swing.JLabel();
        jTextFieldMax = new javax.swing.JTextField();
        jLabelSum = new javax.swing.JLabel();
        jTextFieldSum = new javax.swing.JTextField();
        jLabelLength = new javax.swing.JLabel();
        jTextFieldLength = new javax.swing.JTextField();
        jCheckBoxList = new javax.swing.JCheckBox();
        jCheckBoxCount = new javax.swing.JCheckBox();
        jCheckBoxIntersection = new javax.swing.JCheckBox();
        jCheckBoxElimination = new javax.swing.JCheckBox();
        jButtonGenerate = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Simple Kakuro Helper 2");

        jLabelMax.setText("Max");

        jTextFieldMax.setColumns(3);
        jTextFieldMax.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldMax.setText("9");

        jLabelSum.setText("Sum");

        jTextFieldSum.setColumns(3);
        jTextFieldSum.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabelLength.setText("Length");

        jTextFieldLength.setColumns(3);
        jTextFieldLength.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jCheckBoxList.setText("List");

        jCheckBoxCount.setSelected(true);
        jCheckBoxCount.setText("Count");

        jCheckBoxIntersection.setText("Intersection");

        jCheckBoxElimination.setText("Elimination");

        jButtonGenerate.setText("Generate");
        jButtonGenerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGenerateActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelLength)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldLength, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBoxList)
                            .addComponent(jCheckBoxCount)
                            .addComponent(jCheckBoxIntersection)
                            .addComponent(jCheckBoxElimination)
                            .addComponent(jButtonGenerate)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jLabelMax)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldMax, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabelSum)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldSum, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelMax))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldSum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelSum))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldLength, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelLength))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBoxList)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBoxCount)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBoxIntersection)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBoxElimination)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonGenerate)
                        .addGap(14, 14, 14))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGenerateActionPerformed
        // NOTE
        // This method could (in fact, should) be refactored (decomposed),
        // but that should also be accompanied by other redesigns,
        // which are not the focus of this assignment.
        int max; // maximum number set in text field
        int sum; // sum set in text field
        int length; // length set in text field

        jTextArea1.setText("");
        // get and check generator parameters
        try {
            max = Integer.parseInt(jTextFieldMax.getText());
            sum = Integer.parseInt(jTextFieldSum.getText());
            length = Integer.parseInt(jTextFieldLength.getText());
        } catch (NumberFormatException e) {
            jTextArea1.setText("Needs 2 numbers");
            return;
        }
        if (! (0 <= max)) {
            jTextArea1.append("0 <= Max required");
            return;
        }
        if (! (0 <= length && length <= max)) {
            jTextArea1.append("0 <= Length <= Max required");
            return;
        }

        // prepare generator
        generator = new KakuroCombinationGenerator();
        generator.setMaxNumber(max);
        CompositeGeneratorObserver<Set<Integer>> observers;
        observers = new CompositeGeneratorObserver<Set<Integer>>();
        generator.setObserver(observers);
        if (jCheckBoxList.isSelected()) {
            PushPullAdapter listerAdapter =
                    new PushPullAdapter(new Lister(), true);
            observers.add(listerAdapter);
        }
        Counter counter = null;
        if (jCheckBoxCount.isSelected()) {
            counter = new Counter();
            // N.B. This counter does not need the data on its push interface.
            // Therefore, the PushPullAdapter can suppress pulling of the data.
            PushPullAdapter counterAdapter =
                    new PushPullAdapter(counter, false);
            observers.add(counterAdapter);
        }
//# BEGIN TODO Register other observers
        Intersector intersection = null;
        if (jCheckBoxIntersection.isSelected()) {
            intersection = new Intersector(generator.getMaxNumber(), false);
            PushPullAdapter intersectionAdapter = 
                    new PushPullAdapter(intersection, true);
            observers.add(intersectionAdapter);
        }
        Intersector elimination = null;
        if (jCheckBoxElimination.isSelected()) {
            elimination = new Intersector(generator.getMaxNumber(), true);
            PushPullAdapter eliminationAdapter = 
                    new PushPullAdapter(elimination, true);
            observers.add(eliminationAdapter);
        }
//# END TODO

        // invoke generator
        generator.generate(sum, length);

        // show observer results
        if (counter != null) {
            jTextArea1.append("Number of combinations generated: "
                + counter.getCount() + "\n");
        }
//# BEGIN TODO Show results of other observers
        if (intersection != null) {
            jTextArea1.append("Intersection: "
                + intersection.getIntersection() + "\n");
        }
        if (elimination != null) {
            jTextArea1.append("Elimination: "
                + elimination.getIntersection() + "\n");
        }
//# END TODO
    }//GEN-LAST:event_jButtonGenerateActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGenerate;
    private javax.swing.JCheckBox jCheckBoxCount;
    private javax.swing.JCheckBox jCheckBoxElimination;
    private javax.swing.JCheckBox jCheckBoxIntersection;
    private javax.swing.JCheckBox jCheckBoxList;
    private javax.swing.JLabel jLabelLength;
    private javax.swing.JLabel jLabelMax;
    private javax.swing.JLabel jLabelSum;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextFieldLength;
    private javax.swing.JTextField jTextFieldMax;
    private javax.swing.JTextField jTextFieldSum;
    // End of variables declaration//GEN-END:variables

    /** The generator. */
    private KakuroCombinationGenerator generator;

    /** Listener that appends generated combinations to the text area. */
    private class Lister implements GeneratorListener {
        @Override
        public void combinationGenerated(Set<Integer> combination) {
            jTextArea1.append(combination.toString() + "\n");
        }
    }

}
//# END SKELETON
