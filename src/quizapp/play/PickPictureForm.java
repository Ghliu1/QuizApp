/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizapp.play;

import java.awt.Image;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import quizapp.TitleScreen;
import quizapp.Utils;

public class PickPictureForm extends javax.swing.JFrame {

    ArrayList<JLabel> picLabels;
    int teamNumberForScoreCalculation = 0; //0 for red, 1 for blue
    private final TitleScreen titleForm;

    /**
     * Creates new form PickPictureForm
     */
  
    PickPictureForm(TitleScreen titleForm) {
        this.titleForm = titleForm;
        initComponents();
        picLabels = new ArrayList<>();
        picLabels.add(lblPicOne);
        picLabels.add(lblPicTwo);
        showPictures();
        showScore();
 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblTeamName = new javax.swing.JLabel();
        btnHome = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtPoints = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        lblPicTwo = new javax.swing.JLabel();
        lblPicOne = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Picture Question");

        lblTeamName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTeamName.setText("Red team Question 1");

        btnHome.setText("Home");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        jScrollPane2.setBackground(new java.awt.Color(204, 204, 255));
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        txtPoints.setColumns(20);
        txtPoints.setRows(5);
        txtPoints.setText("Points \nBlue: 0\nRed: 0");
        jScrollPane2.setViewportView(txtPoints);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnHome)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(138, 138, 138)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(lblTeamName))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnHome)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblTeamName)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Pick correct Picture");

        lblPicTwo.setText("jLabel6");
        lblPicTwo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPicTwoMouseClicked(evt);
            }
        });

        lblPicOne.setText("jLabel5");
        lblPicOne.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPicOneMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblPicOne, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblPicTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(221, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(209, 209, 209))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblPicOne, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                    .addComponent(lblPicTwo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblPicOneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPicOneMouseClicked
        checkCorrectness(evt.getSource());
        System.out.println("In pic one correctness check");
        System.out.println("Blue " +Utils.blueTeamQuestionCounter);
        System.out.println("REd" + Utils.redTeamQuestionCounter);
        // TODO add your handling code here:
    }//GEN-LAST:event_lblPicOneMouseClicked

    private void lblPicTwoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPicTwoMouseClicked
        checkCorrectness(evt.getSource());
        System.out.println("In pic two correctness check");
        System.out.println("Blue " +Utils.blueTeamQuestionCounter);
        System.out.println("REd" + Utils.redTeamQuestionCounter);

        // TODO add your handling code here:
    }//GEN-LAST:event_lblPicTwoMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
      reset();
        titleForm.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        reset();
        titleForm.setVisible(true);
        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHomeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblPicOne;
    private javax.swing.JLabel lblPicTwo;
    private javax.swing.JLabel lblTeamName;
    private javax.swing.JTextArea txtPoints;
    // End of variables declaration//GEN-END:variables

    private void showPictures() {
        if (Utils.picCounter > 3) {
            Utils.blueTeamQuestionCounter = 0;
            Utils.redTeamQuestionCounter = 0;
            RankOrderQuestionForm form = new RankOrderQuestionForm(titleForm);
            form.setTitle("Rank Order Questions");
            form.setLocationRelativeTo(null);
            form.setVisible(true);
            this.dispose();
        }
        else{
        Random rnd = new Random(2);

        if (Utils.picCounter % 2 == 0) {//even for red, odd for blue
            teamNumberForScoreCalculation = 0;
            lblTeamName.setText("Red Team Question " + (Utils.redTeamQuestionCounter + 1));
            Utils.redTeamQuestionCounter++;
        System.out.println("in show pictures");
        System.out.println("Blue " +Utils.blueTeamQuestionCounter);
        System.out.println("REd" + Utils.redTeamQuestionCounter);

        } else {
            teamNumberForScoreCalculation = 1;
            lblTeamName.setText("Blue Team Question " + (Utils.blueTeamQuestionCounter + 1));
            Utils.blueTeamQuestionCounter++;
                     System.out.println("Inshow pictures");
        System.out.println("Blue " +Utils.blueTeamQuestionCounter);
        System.out.println("REd" + Utils.redTeamQuestionCounter);

        }

        Collections.shuffle(picLabels, rnd);
        Collections.shuffle(picLabels, rnd);

        Image dimgCorrect = Utils.pQs.get(Utils.picCounter).getCorrect().getScaledInstance(picLabels.get(0).getWidth(), picLabels.get(0).getHeight(),
                Image.SCALE_SMOOTH);

        ImageIcon imageIconCorrect = new ImageIcon(dimgCorrect);
        picLabels.get(0).setIcon(imageIconCorrect);
        picLabels.get(0).setText("c");
        Image dimgWrong = Utils.pQs.get(Utils.picCounter).getWrong().getScaledInstance(picLabels.get(1).getWidth(), picLabels.get(1).getHeight(),
                Image.SCALE_SMOOTH);
        ImageIcon imageIconWrong = new ImageIcon(dimgWrong);
        picLabels.get(1).setIcon(imageIconWrong);
        }
    }

    private void checkCorrectness(Object source) {
        JLabel lbl = (JLabel) source;
        if (lbl.getText().equals("c")) {
            JOptionPane.showMessageDialog(null, "Your Answer is correct", "Information", JOptionPane.INFORMATION_MESSAGE);
            if (teamNumberForScoreCalculation == 0) {

                Utils.redTeamSCore++;
            } else {
                Utils.blueTeamScore++;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Your Answer is incorrect", "Information", JOptionPane.INFORMATION_MESSAGE);

        }
        Utils.picCounter++;
        showPictures();
        showScore();

    }

    private void showScore() {
        txtPoints.setText("Points:\n" + "Blue: " + Utils.blueTeamScore + "\nRed: " + Utils.redTeamSCore);
    }
    public void reset(){
          Utils.blueTeamQuestionCounter = 0;
        Utils.blueTeamScore = 0;
        Utils.fCounter = 0;
        Utils.mcqCounter = 0;
        Utils.picCounter = 0;
        Utils.questionCounter = 0;
        Utils.rOCounter = 0;
        Utils.redTeamQuestionCounter = 0;
        Utils.redTeamSCore = 0;
    }
}
