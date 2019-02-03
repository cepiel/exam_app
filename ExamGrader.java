/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author Gregory
 */

//GROUP:  Lucas Cepiel, Greg Sobieszek, Kyler Boyle

public class ExamGrader extends javax.swing.JFrame {
    
    Scanner sc = ScannerFactory.getKeyboardScanner();   
    Exam exam = null;
    File examFile, ansFile;
    String text, examF, answerF, result;
    
    //String question, answer1, answer2, answer3, answer4, answer5;
    //Double cred1, cred2, cred3,cred4, cred5, baseCred, maxVal;
    int numAnswers;
    
    /**
     * Creates new form ExamGrader
     */
    public ExamGrader() {
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

        gradeExamButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        examFileTxt = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ansFileTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        resultsTxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        gradeExamButton.setText("Grade Exam");
        gradeExamButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradeExamButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Exam Grader Interface");

        jLabel2.setText("Author: Gregory M Sobieszek");

        examFileTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                examFileTxtActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Exam File:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Answer File:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Results File (ex: results.csv): ");

        resultsTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultsTxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 227, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(gradeExamButton))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(examFileTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                            .addComponent(ansFileTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                            .addComponent(resultsTxt))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(ansFileTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(examFileTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(resultsTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(gradeExamButton)
                .addGap(91, 91, 91))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private static double getSAns(Scanner examSc, String ans, String compare, double total, Exam exam, Scanner examSc2) {//throws FileNotFoundException {
		String temp;
		
		temp = examSc2.nextLine();
		
		while(examSc2.hasNextLine() && examSc2.hasNext(".+")) {
			temp = examSc2.nextLine();
			//System.out.println("temp" + temp);
			if(temp.equals(compare)) {
				Double pnt = examSc2.nextDouble();
				examSc2.nextLine();
				examSc2.nextLine();
				//System.out.println("Test pnt: " + pnt );
				temp = examSc2.nextLine();
				//System.out.println("SAnswer: " + temp);
				//System.out.println("ANS    : " + ans);
				if(temp.equals(ans)) {
					//System.out.println("ANS: " + ans);
					total += pnt;
					//System.out.println("total: " + total);
				}	
			}
		}
		//System.out.println("totalAN: " + total);
		return total;
	}
    
    
    private static void save(String student, Exam exam, Scanner ScanAnswer, Double total, int numQ, String result) throws FileNotFoundException {
		
		//System.out.print("Enter File name to save Graded results(example results.txt or results.csv): ");
		
                //Scanner scan = ScannerFactory.getKeyboardScanner();
		
                //String resultsFileName =  this.resultsTxt.getText();
		File results = new File(result);
		
		PrintWriter printWriter = new PrintWriter(results);
		//a. Student identity, total score, list of comma-separated scores for each question.
		//System.out.println("Student: "+ student);
                printWriter.print(student + ", " + total + ", ");
		int i = 0;
		for(i = 0; i < numQ; i++) {
			printWriter.print(exam.getQValue(i) + ", ");
		}
		printWriter.close();
	}
    
    private static void grade(Exam exam, Scanner scanAnswer, Scanner examSc, Scanner examSc2, String result) throws FileNotFoundException{
		Double points;
		Double total = 0.0;
		int numQ = 0;
                String n = scanAnswer.nextLine();
		String time = scanAnswer.nextLine();
		String student = scanAnswer.nextLine();
                
                //System.out.println("Time: "+ time);
                //System.out.println("Student: "+ student);
		
		System.out.println("Grading " + student + "'s Exam which was taken: " + time  );
		System.out.println();
		//examSc.nextLine();
		while(scanAnswer.hasNextLine() && scanAnswer.hasNext(".+")) {
			scanAnswer.nextLine();
			String type = scanAnswer.nextLine();
			//System.out.println("type: " + type);
			if(type.equals("SAQuestion")) {// || type.equals("NumQuestion")) {
				String ans = scanAnswer.nextLine();
				//System.out.println("ans: " + ans);
				total += getSAns(examSc, ans, "SAQuestion", total, exam, examSc2);
				
				
				numQ++;
				
			}
			if(type.equals("NumQuestion")) {
				
				String ans = scanAnswer.nextLine();
				//System.out.println("ans: " + ans);
				total += getSAns(examSc, ans, "NumQuestion", total, exam, examSc2);
				total = total / 2;
				numQ++;
				
			}
			else if(type.equals("MCSAQuestion")) {
				
				points = scanAnswer.nextDouble();
				//System.out.println("Double: " + total);
				total += exam.getQValue(numQ);
				
				
				String ans = scanAnswer.nextLine();
				
				numQ++;
			}
			else if(type.equals("MCMAQuestion")) {
				double temp = 0.0;
				int numberOfAnswers = scanAnswer.nextInt();
				scanAnswer.nextLine();
				int i = 0;
				for(i = 0; i < numberOfAnswers; i++) {
					points = scanAnswer.nextDouble();
					temp = temp + points;
					
					String ans = scanAnswer.nextLine();
					
				}
				
				if(temp > 0.5 ) {
					total += 5.0;
				}
					
				numQ++;
			}
		}
		
		exam.graderValues();
		
		save(student, exam, scanAnswer, total, numQ, result);
		
	}
    
    
    
    
    
    
    
    
    private void gradeExamButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradeExamButtonActionPerformed
        
        String examName, temp;
        
        try {
            answerF = ansFileTxt.getText();
            ansFile = new File(answerF);
            sc = new Scanner(ansFile);
  
            
            if(!sc.hasNextLine()){
            System.out.println("NO ANSWER FILE FOUND");
            }
            if(sc.hasNextLine()){
                examName = sc.nextLine();
                //System.out.println("examName is : "+ examName);
                temp = examFileTxt.getText();
                
                if(examName.equals(temp)){
                    //System.out.println("they match");
                }
                
                else{
                    JOptionPane.showMessageDialog(null, "Exam Name in Answerfile does not match exam name entered!");
                }
            }
            JOptionPane.showMessageDialog(null, "AnswerFile found: \""+ansFile.getCanonicalPath());
            //JOptionPane.showMessageDialog(this, "this Exam TXT:");
            
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, "AnswerFile NOT found!!! \n MUST INPUT CORRECT FILENAME", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        exam = null;
        examF = examFileTxt.getText();
        examFile = new File(examF);
        result = resultsTxt.getText();
        if(result.length() == 0){
            JOptionPane.showMessageDialog(this, "RESULT FILE NEEDED TO GRADE EXAM!!!", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            sc = new Scanner(examFile);
            
            Scanner examSc = new Scanner(examFile);
            
            Scanner examSc2 = new Scanner(examFile);
            
            Scanner studentSc = new Scanner(ansFile);
            
            exam = new Exam(examSc);
            grade(exam, studentSc, examSc, examSc2, result);
       
            JOptionPane.showMessageDialog(null, "EXAM: \""+examF + "\" HAS BEEN GRADED AND SAVED IN EXAM GRADER FOLDER");
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(this, "ExamFile Invalid", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
    }//GEN-LAST:event_gradeExamButtonActionPerformed

    private void examFileTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_examFileTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_examFileTxtActionPerformed

    private void resultsTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultsTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resultsTxtActionPerformed

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
            java.util.logging.Logger.getLogger(ExamGrader.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExamGrader.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExamGrader.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExamGrader.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExamGrader().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ansFileTxt;
    private javax.swing.JTextField examFileTxt;
    private javax.swing.JButton gradeExamButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField resultsTxt;
    // End of variables declaration//GEN-END:variables
}
