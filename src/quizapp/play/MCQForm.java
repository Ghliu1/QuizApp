/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizapp.play;

import Model.MCQ;
import java.awt.GridBagLayout;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import quizapp.TitleScreen;
import quizapp.Utils;

public class MCQForm extends javax.swing.JFrame {

    private final TitleScreen titleForm;
    ArrayList<MCQ> mcqs;
    int teamNumberForCalculatingScore = 0; //0 for red, 1 for blue
    

    /**
     * Creates new form MCQForm
     */
    MCQForm(TitleScreen aThis) {
        initComponents();
        this.titleForm = aThis;
        mcqs = Utils.getMCQs();
        Collections.shuffle(mcqs);
        showQuestion();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblTeamQuestion = new javax.swing.JLabel();
        btnHome = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtPoints = new javax.swing.JTextArea();
        btnThree = new javax.swing.JButton();
        btnFour = new javax.swing.JButton();
        btnOne = new javax.swing.JButton();
        btnTwo = new javax.swing.JButton();
        lblQuestion = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Multiple Choice Question");

        lblTeamQuestion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTeamQuestion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTeamQuestion.setText("Red Team Question 1");

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

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnHome)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel1))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(lblTeamQuestion)))))
                .addContainerGap(139, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnHome)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTeamQuestion)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        btnThree.setText("Jack");
        btnThree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThreeActionPerformed(evt);
            }
        });

        btnFour.setText("Janice");
        btnFour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFourActionPerformed(evt);
            }
        });

        btnOne.setText("Jack");
        btnOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOneActionPerformed(evt);
            }
        });

        btnTwo.setText("Jill");
        btnTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTwoActionPerformed(evt);
            }
        });

        lblQuestion.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblQuestion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblQuestion.setText("What is my name?");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnOne, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnThree, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnTwo, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                            .addComponent(btnFour, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblQuestion)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblQuestion)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOne, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThree, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFour, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 59, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        reset();
        titleForm.setVisible(true);
        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHomeActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        reset();
        titleForm.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    private void btnOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOneActionPerformed
        checkCorrectness(evt.getSource());

        showQuestion();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnOneActionPerformed

    private void btnTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTwoActionPerformed
        checkCorrectness(evt.getSource());
        showQuestion();
    }//GEN-LAST:event_btnTwoActionPerformed

    private void btnThreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThreeActionPerformed
        checkCorrectness(evt.getSource());
        showQuestion();
    }//GEN-LAST:event_btnThreeActionPerformed

    private void btnFourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFourActionPerformed
        checkCorrectness(evt.getSource());
        showQuestion();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFourActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFour;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnOne;
    private javax.swing.JButton btnThree;
    private javax.swing.JButton btnTwo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblQuestion;
    private javax.swing.JLabel lblTeamQuestion;
    private javax.swing.JPanel panel;
    private javax.swing.JTextArea txtPoints;
    // End of variables declaration//GEN-END:variables

    private void showQuestion() {
        if (Utils.mcqCounter > 3) {
            Utils.blueTeamQuestionCounter = 0;
            Utils.redTeamQuestionCounter = 0;
            PickPictureForm form = new PickPictureForm(titleForm);
            form.setTitle("Pick Picture Questions");
            form.setLocationRelativeTo(null);
            form.setVisible(true);
            this.setVisible(false);
        }
        ArrayList<JButton> buttons = new ArrayList<>();
        buttons.add(btnOne);
        buttons.add(btnTwo);
        buttons.add(btnThree);
        buttons.add(btnFour);
        Collections.shuffle(buttons);

        if (Utils.mcqCounter % 2 == 0) {//even for red, odd for blue
            teamNumberForCalculatingScore = 0;
            lblTeamQuestion.setText("Red Team Question " + (Utils.redTeamQuestionCounter + 1));
            Utils.redTeamQuestionCounter++;
        } else {
            teamNumberForCalculatingScore = 1;
            lblTeamQuestion.setText("Blue Team Question " + (Utils.blueTeamQuestionCounter + 1));
            Utils.blueTeamQuestionCounter++;
        }
        lblQuestion.setText(mcqs.get(Utils.mcqCounter).getQuestion());
        buttons.get(0).setText(mcqs.get(Utils.mcqCounter).getCorrectAnswer());
        buttons.get(1).setText(mcqs.get(Utils.mcqCounter).getWrongAnswerOne());
        buttons.get(2).setText(mcqs.get(Utils.mcqCounter).getWrongAnswerTwo());
        buttons.get(3).setText(mcqs.get(Utils.mcqCounter).getWrongAnswerThree());

    }

    private void checkCorrectness(Object source) {
        JButton button = (JButton) source;
        if (button.getText().equals(mcqs.get(Utils.mcqCounter).getCorrectAnswer())) {
            JOptionPane.showMessageDialog(null, "Correct answer", "Information", JOptionPane.INFORMATION_MESSAGE);
            if (teamNumberForCalculatingScore == 0) {

                Utils.redTeamSCore++;
            } else {
                Utils.blueTeamScore++;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Wrong answer", "Information", JOptionPane.INFORMATION_MESSAGE);
        }

        Utils.mcqCounter++;
//        showQuestion();
        
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
