
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



//AUTHOR: Lucas Cepiel : lcepie2 netid : lcepiel ACCC
//GROUP:  Lucas Cepiel, Greg Sobieszek, Kyler Boyle


public class ExamBuilder extends javax.swing.JFrame {

    
    //Scanner sc = ScannerFactory.getKeyboardScanner();
    Exam exam = null;

    File file;
    String text;
    
    String question, answer1, answer2, answer3, answer4, answer5;
    Double cred1, cred2, cred3,cred4, cred5, baseCred, maxVal;
    int numAnswers;

    

    public ExamBuilder() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tab = new javax.swing.JTabbedPane();
        loadPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        loadField = new javax.swing.JTextField();
        loadButton = new javax.swing.JButton();
        createPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        newExamField = new javax.swing.JTextField();
        createButton = new javax.swing.JButton();
        addPanel = new javax.swing.JPanel();
        tab2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        saQField = new javax.swing.JTextField();
        saAField = new javax.swing.JTextField();
        saMaxCreditField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        saCreateButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        mcsaQField = new javax.swing.JTextField();
        mcsaCreateButton = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        mcsaAnswer1Field = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        mcsaCredit1Field = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        mcsaAnswer2Field = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        mcsaCredit2Field = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        mcsaAnswer5Field = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        mcsaCredit5Field = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        mcsaAnswer3Field = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        mcsaCredit3Field = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        mcsaNumAnswersField = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        mcsaMaxCreditField = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        mcsaAnswer4Field = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        mcsaCredit4Field = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        mcmaQField = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        mcmaNumAnswersField = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        mcmaBaseCreditField = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        mcmaAnswer1Field = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        mcmaCredit1Field = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        mcmaCredit2Field = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        mcmaCredit3Field = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        mcmaCredit4Field = new javax.swing.JTextField();
        mcmaAnswer4Field = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        mcmaAnswer3Field = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        mcmaAnswer2Field = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        mcmaCreateButton = new javax.swing.JButton();
        jLabel41 = new javax.swing.JLabel();
        mcmaMaxCreditField = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        mcmaAnswer5Field = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        mcmaCredit5Field = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        numAnswerQField = new javax.swing.JTextField();
        numAnswerCreateButton = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        numAnswerAField = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        numAnswerMaxCreditField = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        numAnswerToleranceField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        removePanel = new javax.swing.JPanel();
        nextQuestion = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        removeQuestionField = new javax.swing.JTextField();
        removeButton = new javax.swing.JButton();
        previousQuestion = new javax.swing.JButton();
        questionLabel = new javax.swing.JLabel();
        reorderPanel = new javax.swing.JPanel();
        reorderQuestionsButton = new javax.swing.JButton();
        reorderAnswersButton = new javax.swing.JButton();
        reorderBothButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        printPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        printToScreenButton = new javax.swing.JButton();
        printToFileButton = new javax.swing.JButton();
        printToFileField = new javax.swing.JTextField();
        savePanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        saveField = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ExamBuilder");

        jLabel2.setText("Full Exam Filename:");

        loadField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadFieldActionPerformed(evt);
            }
        });

        loadButton.setText("Load");
        loadButton.setToolTipText("include the \".txt\"");
        loadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loadPanelLayout = new javax.swing.GroupLayout(loadPanel);
        loadPanel.setLayout(loadPanelLayout);
        loadPanelLayout.setHorizontalGroup(
            loadPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loadPanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(loadPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loadButton)
                    .addComponent(loadField, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(466, Short.MAX_VALUE))
        );
        loadPanelLayout.setVerticalGroup(
            loadPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loadPanelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(loadField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(loadButton)
                .addContainerGap(266, Short.MAX_VALUE))
        );

        tab.addTab("Load Exam", loadPanel);

        jLabel3.setText("Exam Title:");

        createButton.setText("Create");
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout createPanelLayout = new javax.swing.GroupLayout(createPanel);
        createPanel.setLayout(createPanelLayout);
        createPanelLayout.setHorizontalGroup(
            createPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createPanelLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(createPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(createButton)
                    .addComponent(newExamField, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(465, Short.MAX_VALUE))
        );
        createPanelLayout.setVerticalGroup(
            createPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createPanelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(newExamField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(createButton)
                .addContainerGap(266, Short.MAX_VALUE))
        );

        tab.addTab("Create Exam", createPanel);

        saAField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saAFieldActionPerformed(evt);
            }
        });

        saMaxCreditField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saMaxCreditFieldActionPerformed(evt);
            }
        });

        jLabel8.setText("Question");

        jLabel9.setText("Correct Answer");

        jLabel10.setText("Max Credit");

        saCreateButton.setText("Create Question");
        saCreateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saCreateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(saQField, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(saAField, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(saMaxCreditField, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)))
                    .addComponent(saCreateButton))
                .addContainerGap(161, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saQField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saAField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saMaxCreditField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 158, Short.MAX_VALUE)
                .addComponent(saCreateButton)
                .addGap(37, 37, 37))
        );

        tab2.addTab("Short Answer", jPanel1);

        jLabel11.setText("Question");

        mcsaCreateButton.setText("Create Question");
        mcsaCreateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mcsaCreateButtonActionPerformed(evt);
            }
        });

        jLabel13.setText("Answer 1");

        mcsaAnswer1Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mcsaAnswer1FieldActionPerformed(evt);
            }
        });

        jLabel14.setText("Credit if Selected");

        mcsaCredit1Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mcsaCredit1FieldActionPerformed(evt);
            }
        });

        jLabel22.setText("Answer 2");

        mcsaAnswer2Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mcsaAnswer2FieldActionPerformed(evt);
            }
        });

        jLabel23.setText("Credit if Selected");

        mcsaCredit2Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mcsaCredit2FieldActionPerformed(evt);
            }
        });

        jLabel24.setText("Answer 5");

        mcsaAnswer5Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mcsaAnswer5FieldActionPerformed(evt);
            }
        });

        jLabel25.setText("Credit if Selected");

        mcsaCredit5Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mcsaCredit5FieldActionPerformed(evt);
            }
        });

        jLabel26.setText("Answer 3");

        mcsaAnswer3Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mcsaAnswer3FieldActionPerformed(evt);
            }
        });

        jLabel27.setText("Credit if Selected");

        mcsaCredit3Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mcsaCredit3FieldActionPerformed(evt);
            }
        });

        jLabel28.setText("Number of Answers");

        jLabel29.setText("Max Credit");

        jLabel42.setText("Answer 4");

        mcsaAnswer4Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mcsaAnswer4FieldActionPerformed(evt);
            }
        });

        jLabel43.setText("Credit if Selected");

        mcsaCredit4Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mcsaCredit4FieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(mcsaQField, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mcsaCreateButton)
                    .addComponent(jLabel28)
                    .addComponent(mcsaNumAnswersField, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29)
                    .addComponent(mcsaMaxCreditField, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel42)
                            .addComponent(mcsaAnswer4Field, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mcsaCredit4Field, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel43)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26)
                            .addComponent(mcsaAnswer3Field, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mcsaCredit3Field, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addComponent(mcsaAnswer5Field, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mcsaCredit5Field, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22)
                            .addComponent(mcsaAnswer2Field, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mcsaCredit2Field, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(mcsaAnswer1Field, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mcsaCredit1Field, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))))
                .addContainerGap(161, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addGap(2, 2, 2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mcsaAnswer1Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mcsaCredit1Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mcsaQField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(jLabel23))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mcsaAnswer2Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mcsaCredit2Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addGap(2, 2, 2)
                        .addComponent(mcsaNumAnswersField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel29)
                        .addGap(2, 2, 2)
                        .addComponent(mcsaMaxCreditField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(jLabel27))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mcsaAnswer3Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mcsaCredit3Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(jLabel43))
                .addGap(2, 2, 2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mcsaAnswer4Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mcsaCredit4Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25))
                .addGap(2, 2, 2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mcsaAnswer5Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mcsaCredit5Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mcsaCreateButton))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        tab2.addTab("Multiple Choice Single Answer", jPanel2);

        jLabel30.setText("Question");

        jLabel31.setText("Number of Answers");

        jLabel32.setText("Base Credit");

        jLabel33.setText("Answer 1");

        mcmaAnswer1Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mcmaAnswer1FieldActionPerformed(evt);
            }
        });

        jLabel34.setText("Credit if Selected");

        mcmaCredit1Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mcmaCredit1FieldActionPerformed(evt);
            }
        });

        jLabel35.setText("Credit if Selected");

        mcmaCredit2Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mcmaCredit2FieldActionPerformed(evt);
            }
        });

        jLabel36.setText("Credit if Selected");

        mcmaCredit3Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mcmaCredit3FieldActionPerformed(evt);
            }
        });

        jLabel37.setText("Credit if Selected");

        mcmaCredit4Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mcmaCredit4FieldActionPerformed(evt);
            }
        });

        mcmaAnswer4Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mcmaAnswer4FieldActionPerformed(evt);
            }
        });

        jLabel38.setText("Answer 4");

        mcmaAnswer3Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mcmaAnswer3FieldActionPerformed(evt);
            }
        });

        jLabel39.setText("Answer 3");

        mcmaAnswer2Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mcmaAnswer2FieldActionPerformed(evt);
            }
        });

        jLabel40.setText("Answer 2");

        mcmaCreateButton.setText("Create Question");
        mcmaCreateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mcmaCreateButtonActionPerformed(evt);
            }
        });

        jLabel41.setText("Max Credit");

        jLabel44.setText("Answer 5");

        mcmaAnswer5Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mcmaAnswer5FieldActionPerformed(evt);
            }
        });

        jLabel45.setText("Credit if Selected");

        mcmaCredit5Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mcmaCredit5FieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel30)
                    .addComponent(mcmaQField, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mcmaCreateButton)
                    .addComponent(jLabel31)
                    .addComponent(mcmaNumAnswersField, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32)
                    .addComponent(mcmaBaseCreditField, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41)
                    .addComponent(mcmaMaxCreditField, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel39)
                            .addComponent(mcmaAnswer3Field, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mcmaCredit3Field, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel36)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel38)
                            .addComponent(mcmaAnswer4Field, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mcmaCredit4Field, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel37)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel40)
                            .addComponent(mcmaAnswer2Field, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mcmaCredit2Field, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel35)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel33)
                            .addComponent(mcmaAnswer1Field, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mcmaCredit1Field, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel34)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel44)
                            .addComponent(mcmaAnswer5Field, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mcmaCredit5Field, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel45))))
                .addContainerGap(161, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(jLabel33)
                    .addComponent(jLabel34))
                .addGap(2, 2, 2)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mcmaAnswer1Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mcmaCredit1Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mcmaQField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel40)
                            .addComponent(jLabel35))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mcmaAnswer2Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mcmaCredit2Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addGap(2, 2, 2)
                        .addComponent(mcmaNumAnswersField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel32)
                        .addGap(2, 2, 2)
                        .addComponent(mcmaBaseCreditField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel39)
                            .addComponent(jLabel36))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mcmaAnswer3Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mcmaCredit3Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel41)
                        .addGap(2, 2, 2)
                        .addComponent(mcmaMaxCreditField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel38)
                            .addComponent(jLabel37))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mcmaAnswer4Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mcmaCredit4Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(mcmaCreateButton))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel44)
                            .addComponent(jLabel45))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mcmaAnswer5Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mcmaCredit5Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        tab2.addTab("Multiple Choice Multiple Answer", jPanel3);

        jLabel18.setText("Question");

        numAnswerCreateButton.setText("Create Question");
        numAnswerCreateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numAnswerCreateButtonActionPerformed(evt);
            }
        });

        jLabel19.setText("Correct Answer");

        numAnswerAField.setToolTipText("this should be a number");
        numAnswerAField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numAnswerAFieldActionPerformed(evt);
            }
        });

        jLabel20.setText("Max Credit");

        numAnswerMaxCreditField.setToolTipText("this should be a number");
        numAnswerMaxCreditField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numAnswerMaxCreditFieldActionPerformed(evt);
            }
        });

        jLabel21.setText("Tolerance");

        numAnswerToleranceField.setToolTipText("this should be a number");
        numAnswerToleranceField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numAnswerToleranceFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(numAnswerQField, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(numAnswerAField, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(numAnswerMaxCreditField, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20)
                            .addComponent(numAnswerToleranceField, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21)))
                    .addComponent(numAnswerCreateButton))
                .addContainerGap(161, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numAnswerQField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numAnswerAField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numAnswerMaxCreditField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel21)
                .addGap(18, 18, 18)
                .addComponent(numAnswerToleranceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addComponent(numAnswerCreateButton)
                .addGap(35, 35, 35))
        );

        tab2.addTab("Number Answer", jPanel4);

        jLabel12.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        jLabel12.setText("Question Types:");

        javax.swing.GroupLayout addPanelLayout = new javax.swing.GroupLayout(addPanel);
        addPanel.setLayout(addPanelLayout);
        addPanelLayout.setHorizontalGroup(
            addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tab2)
                    .addGroup(addPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        addPanelLayout.setVerticalGroup(
            addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(tab2, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tab.addTab("Add Questions", addPanel);

        nextQuestion.setText("Next Question");
        nextQuestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextQuestionActionPerformed(evt);
            }
        });

        jLabel15.setText("Enter Question number to remove:");

        removeButton.setText("Remove");
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        previousQuestion.setText("Previous Question");
        previousQuestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousQuestionActionPerformed(evt);
            }
        });

        questionLabel.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        questionLabel.setText("Question 0: ");

        javax.swing.GroupLayout removePanelLayout = new javax.swing.GroupLayout(removePanel);
        removePanel.setLayout(removePanelLayout);
        removePanelLayout.setHorizontalGroup(
            removePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(removePanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(removePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(questionLabel)
                    .addGroup(removePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(removePanelLayout.createSequentialGroup()
                            .addComponent(previousQuestion)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nextQuestion))
                        .addGroup(removePanelLayout.createSequentialGroup()
                            .addGroup(removePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(removeQuestionField)
                                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(removeButton))))
                .addContainerGap(349, Short.MAX_VALUE))
        );
        removePanelLayout.setVerticalGroup(
            removePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(removePanelLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(removePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(previousQuestion)
                    .addComponent(nextQuestion))
                .addGap(52, 52, 52)
                .addComponent(questionLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addGroup(removePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(removeQuestionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removeButton))
                .addGap(90, 90, 90))
        );

        tab.addTab("Remove Questions", removePanel);

        reorderQuestionsButton.setText("Questions");
        reorderQuestionsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reorderQuestionsButtonActionPerformed(evt);
            }
        });

        reorderAnswersButton.setText("Answers");
        reorderAnswersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reorderAnswersButtonActionPerformed(evt);
            }
        });

        reorderBothButton.setText("Both");
        reorderBothButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reorderBothButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("Reorder:");

        javax.swing.GroupLayout reorderPanelLayout = new javax.swing.GroupLayout(reorderPanel);
        reorderPanel.setLayout(reorderPanelLayout);
        reorderPanelLayout.setHorizontalGroup(
            reorderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reorderPanelLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(reorderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(reorderBothButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reorderQuestionsButton)
                    .addComponent(jLabel4)
                    .addComponent(reorderAnswersButton))
                .addContainerGap(496, Short.MAX_VALUE))
        );
        reorderPanelLayout.setVerticalGroup(
            reorderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reorderPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(reorderQuestionsButton)
                .addGap(18, 18, 18)
                .addComponent(reorderAnswersButton)
                .addGap(18, 18, 18)
                .addComponent(reorderBothButton)
                .addContainerGap(210, Short.MAX_VALUE))
        );

        tab.addTab("Reorder", reorderPanel);

        printPanel.setToolTipText("enter filename with \".txt\"");

        jLabel5.setText("Print to:");

        printToScreenButton.setText("Screen");
        printToScreenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printToScreenButtonActionPerformed(evt);
            }
        });

        printToFileButton.setText("File");
        printToFileButton.setToolTipText("enter filename first");
        printToFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printToFileButtonActionPerformed(evt);
            }
        });

        printToFileField.setText("Filename");
        printToFileField.setToolTipText("enter filename with \".txt\"");

        javax.swing.GroupLayout printPanelLayout = new javax.swing.GroupLayout(printPanel);
        printPanel.setLayout(printPanelLayout);
        printPanelLayout.setHorizontalGroup(
            printPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(printPanelLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(printPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(printPanelLayout.createSequentialGroup()
                        .addComponent(printToFileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(printToFileField, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(printToScreenButton)
                    .addComponent(jLabel5))
                .addContainerGap(381, Short.MAX_VALUE))
        );
        printPanelLayout.setVerticalGroup(
            printPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(printPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(printToScreenButton)
                .addGap(18, 18, 18)
                .addGroup(printPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(printToFileButton)
                    .addComponent(printToFileField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(253, Short.MAX_VALUE))
        );

        tab.addTab("Print", printPanel);

        jLabel6.setText("Enter Filename to Save exam as:");

        saveField.setToolTipText("enter filename with \".txt\"");

        saveButton.setText("Save");
        saveButton.setToolTipText("enter filename first");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout savePanelLayout = new javax.swing.GroupLayout(savePanel);
        savePanel.setLayout(savePanelLayout);
        savePanelLayout.setHorizontalGroup(
            savePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(savePanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(savePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(saveButton)
                    .addComponent(saveField, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(421, Short.MAX_VALUE))
        );
        savePanelLayout.setVerticalGroup(
            savePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(savePanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saveField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(saveButton)
                .addContainerGap(262, Short.MAX_VALUE))
        );

        tab.addTab("Save", savePanel);

        jLabel1.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel1.setText("Exam Builder Interface");

        jLabel7.setFont(new java.awt.Font("DialogInput", 0, 12)); // NOI18N
        jLabel7.setText("Author: Lucas Cepiel");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tab)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addComponent(tab, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );

        setSize(new java.awt.Dimension(673, 510));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void printToFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printToFileButtonActionPerformed
        //print to file!
        if(exam==null){
            System.out.println("\n<<Exam is null - Invalid Option>>\n");
            JOptionPane.showMessageDialog(null,"<<Exam is null - Invalid Option>>");
        }
        
        text=printToFileField.getText();
        
        try (PrintWriter out = new PrintWriter(text)) {
		exam.printToFile(out);
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
        
        JOptionPane.showMessageDialog(null,"Printed to " +text);
        
    }//GEN-LAST:event_printToFileButtonActionPerformed

    private void loadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadButtonActionPerformed
        //load exam button!
        if(exam!=null){
            JOptionPane.showMessageDialog(null,"Current exam in memory is being erased...");
        }
        
        exam=null;
        text = loadField.getText();
        file=new File(text);
        
        try{
            System.out.println("Attempting to read from file in: "+file.getCanonicalPath());
            JOptionPane.showMessageDialog(null,"Attempting to read from file in: \""+file.getCanonicalPath());
            //JOptionPane.showMessageDialog(null, "Exam Created");
            try (Scanner fileSc = new Scanner(file)) {
                exam = new Exam(fileSc);
            }
        } catch (IOException ex) {
            Logger.getLogger(ExamBuilder.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_loadButtonActionPerformed

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
        if(exam!=null){
            JOptionPane.showMessageDialog(null,"Current exam in memory is being erased...");
        }
        
        exam=null;
        text = newExamField.getText();
        exam=new Exam(text);
        
        JOptionPane.showMessageDialog(null,"Exam '" + text + "' Created!");
        
    }//GEN-LAST:event_createButtonActionPerformed

    private void printToScreenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printToScreenButtonActionPerformed
        if(exam==null){
            System.out.println("\n<<Exam is null - Invalid Option>>\n");
            JOptionPane.showMessageDialog(null,"<<Exam is null - Invalid Option>>");
            return;
        }
        
        System.out.println("");
	exam.print();
        
        /*
        int numQs = exam.getNum();
        //loop
        int x=0;
        String curString = exam.getQuestion(x);
        
        this.questionLabel.setText("Question "+curQ+": "+ curString);
        
        */
        
    }//GEN-LAST:event_printToScreenButtonActionPerformed

    private void loadFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loadFieldActionPerformed

    private void reorderQuestionsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reorderQuestionsButtonActionPerformed
        if(exam==null){
            System.out.println("\n<<Exam is null - Invalid Option>>\n");
            JOptionPane.showMessageDialog(null,"<<Exam is null - Invalid Option>>");
            return;
        }
        
        exam.reorderQuestions();
        JOptionPane.showMessageDialog(null,"Questions have been reordered!");
    }//GEN-LAST:event_reorderQuestionsButtonActionPerformed

    private void reorderAnswersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reorderAnswersButtonActionPerformed
        if(exam==null){
            System.out.println("\n<<Exam is null - Invalid Option>>\n");
            JOptionPane.showMessageDialog(null,"<<Exam is null - Invalid Option>>");
            return;
        }
        
        exam.reorderMCAnswers(-1);
        JOptionPane.showMessageDialog(null,"Multiple choice answers have been reordered!");
    }//GEN-LAST:event_reorderAnswersButtonActionPerformed

    private void reorderBothButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reorderBothButtonActionPerformed
        if(exam==null){
            System.out.println("\n<<Exam is null - Invalid Option>>\n");
            JOptionPane.showMessageDialog(null,"<<Exam is null - Invalid Option>>");
            return;
        }
        
        exam.reorderQuestions();
	exam.reorderMCAnswers(-1);
        JOptionPane.showMessageDialog(null,"Questions and multiple choice answers have been reordered!");
    }//GEN-LAST:event_reorderBothButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        if(exam==null){
            System.out.println("\n<<Exam is null - Invalid Option>>\n");
            JOptionPane.showMessageDialog(null,"<<Exam is null - Invalid Option>>");
            return;
        }
        
        text=saveField.getText();
        
        try (PrintWriter out = new PrintWriter(text)) {
			exam.save(out);
		    
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
        
        JOptionPane.showMessageDialog(null,"Exam saved as: " + text );
    }//GEN-LAST:event_saveButtonActionPerformed

    private void numAnswerToleranceFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numAnswerToleranceFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numAnswerToleranceFieldActionPerformed

    private void numAnswerMaxCreditFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numAnswerMaxCreditFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numAnswerMaxCreditFieldActionPerformed

    private void numAnswerAFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numAnswerAFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numAnswerAFieldActionPerformed

    private void mcsaCredit3FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mcsaCredit3FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mcsaCredit3FieldActionPerformed

    private void mcsaAnswer3FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mcsaAnswer3FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mcsaAnswer3FieldActionPerformed

    private void mcsaCredit5FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mcsaCredit5FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mcsaCredit5FieldActionPerformed

    private void mcsaAnswer5FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mcsaAnswer5FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mcsaAnswer5FieldActionPerformed

    private void mcsaCredit2FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mcsaCredit2FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mcsaCredit2FieldActionPerformed

    private void mcsaAnswer2FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mcsaAnswer2FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mcsaAnswer2FieldActionPerformed

    private void mcsaCredit1FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mcsaCredit1FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mcsaCredit1FieldActionPerformed

    private void mcsaAnswer1FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mcsaAnswer1FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mcsaAnswer1FieldActionPerformed

    private void saMaxCreditFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saMaxCreditFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saMaxCreditFieldActionPerformed

    private void saAFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saAFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saAFieldActionPerformed

    private void mcmaAnswer1FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mcmaAnswer1FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mcmaAnswer1FieldActionPerformed

    private void mcmaCredit1FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mcmaCredit1FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mcmaCredit1FieldActionPerformed

    private void mcmaCredit2FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mcmaCredit2FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mcmaCredit2FieldActionPerformed

    private void mcmaCredit3FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mcmaCredit3FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mcmaCredit3FieldActionPerformed

    private void mcmaCredit4FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mcmaCredit4FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mcmaCredit4FieldActionPerformed

    private void mcmaAnswer4FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mcmaAnswer4FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mcmaAnswer4FieldActionPerformed

    private void mcmaAnswer3FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mcmaAnswer3FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mcmaAnswer3FieldActionPerformed

    private void mcmaAnswer2FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mcmaAnswer2FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mcmaAnswer2FieldActionPerformed

    private void mcsaAnswer4FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mcsaAnswer4FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mcsaAnswer4FieldActionPerformed

    private void mcsaCredit4FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mcsaCredit4FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mcsaCredit4FieldActionPerformed

    private void mcmaAnswer5FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mcmaAnswer5FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mcmaAnswer5FieldActionPerformed

    private void mcmaCredit5FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mcmaCredit5FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mcmaCredit5FieldActionPerformed

    private void saCreateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saCreateButtonActionPerformed
        if(exam==null){
            System.out.println("\n<<Exam is null - Must create or load exam first>>\n");
            JOptionPane.showMessageDialog(null,"<<Exam is null - Must create or load exam first>>");
            return;
        }
        
        question = saQField.getText();
        answer1 = saAField.getText();
        maxVal = Double.parseDouble(saMaxCreditField.getText());

        SAQuestion q = new SAQuestion(question, maxVal);
        SAAnswer a = new SAAnswer(answer1);
        q.setRightAnswer(a);
        exam.addQuestion(q);
        JOptionPane.showMessageDialog(null,"SA Question added!");

    }//GEN-LAST:event_saCreateButtonActionPerformed

    private void mcsaCreateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mcsaCreateButtonActionPerformed
        if(exam==null){
            System.out.println("\n<<Exam is null - Must create or load exam first>>\n");
            JOptionPane.showMessageDialog(null,"<<Exam is null - Must create or load exam first>>");
            return;
        }
        
        question = mcsaQField.getText();
        maxVal = Double.parseDouble(mcsaMaxCreditField.getText());
        numAnswers = Integer.parseInt(mcsaNumAnswersField.getText());

        MCSAQuestion q = new MCSAQuestion(question, maxVal);
        
        if(numAnswers==1){
            answer1 = mcsaAnswer1Field.getText();   cred1 = Double.parseDouble(mcsaCredit1Field.getText());
            MCSAAnswer a1 = new MCSAAnswer(answer1, cred1);
            q.addAnswer(a1);
        }
        else if(numAnswers==2){
            answer1 = mcsaAnswer1Field.getText();   cred1 = Double.parseDouble(mcsaCredit1Field.getText());
            answer2 = mcsaAnswer2Field.getText();   cred2 = Double.parseDouble(mcsaCredit2Field.getText());
            MCSAAnswer a1 = new MCSAAnswer(answer1, cred1);
            MCSAAnswer a2 = new MCSAAnswer(answer2, cred2);
            q.addAnswer(a1); q.addAnswer(a2);
        }
        else if(numAnswers==3){
            answer1 = mcsaAnswer1Field.getText();   cred1 = Double.parseDouble(mcsaCredit1Field.getText());
            answer2 = mcsaAnswer2Field.getText();   cred2 = Double.parseDouble(mcsaCredit2Field.getText());
            answer3 = mcsaAnswer3Field.getText();   cred3 = Double.parseDouble(mcsaCredit3Field.getText());
            MCSAAnswer a1 = new MCSAAnswer(answer1, cred1);
            MCSAAnswer a2 = new MCSAAnswer(answer2, cred2);
            MCSAAnswer a3 = new MCSAAnswer(answer3, cred3);
            q.addAnswer(a1); q.addAnswer(a2);q.addAnswer(a3);
        }
        else if(numAnswers==4){
            answer1 = mcsaAnswer1Field.getText();   cred1 = Double.parseDouble(mcsaCredit1Field.getText());
            answer2 = mcsaAnswer2Field.getText();   cred2 = Double.parseDouble(mcsaCredit2Field.getText());
            answer3 = mcsaAnswer3Field.getText();   cred3 = Double.parseDouble(mcsaCredit3Field.getText());
            answer4 = mcsaAnswer4Field.getText();   cred4 = Double.parseDouble(mcsaCredit4Field.getText());
            MCSAAnswer a1 = new MCSAAnswer(answer1, cred1);
            MCSAAnswer a2 = new MCSAAnswer(answer2, cred2);
            MCSAAnswer a3 = new MCSAAnswer(answer3, cred3);
            MCSAAnswer a4 = new MCSAAnswer(answer4, cred4);
            q.addAnswer(a1); q.addAnswer(a2);q.addAnswer(a3);q.addAnswer(a4);
        }
        else if(numAnswers==5){
            answer1 = mcsaAnswer1Field.getText();   cred1 = Double.parseDouble(mcsaCredit1Field.getText());
            answer2 = mcsaAnswer2Field.getText();   cred2 = Double.parseDouble(mcsaCredit2Field.getText());
            answer3 = mcsaAnswer3Field.getText();   cred3 = Double.parseDouble(mcsaCredit3Field.getText());
            answer4 = mcsaAnswer4Field.getText();   cred4 = Double.parseDouble(mcsaCredit4Field.getText());
            answer5 = mcsaAnswer5Field.getText();   cred5 = Double.parseDouble(mcsaCredit5Field.getText());
            MCSAAnswer a1 = new MCSAAnswer(answer1, cred1);
            MCSAAnswer a2 = new MCSAAnswer(answer2, cred2);
            MCSAAnswer a3 = new MCSAAnswer(answer3, cred3);
            MCSAAnswer a4 = new MCSAAnswer(answer4, cred4);
            MCSAAnswer a5 = new MCSAAnswer(answer5, cred5);
            q.addAnswer(a1); q.addAnswer(a2);q.addAnswer(a3);q.addAnswer(a4);q.addAnswer(a5);
        }
        else{
            JOptionPane.showMessageDialog(null,"<<ERROR: invalid number of answers>>");
           return; 
        }
        
        exam.addQuestion(q);
        JOptionPane.showMessageDialog(null,"MCSA Question added!");

    }//GEN-LAST:event_mcsaCreateButtonActionPerformed

    private void mcmaCreateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mcmaCreateButtonActionPerformed
        if(exam==null){
            System.out.println("\n<<Exam is null - Must create or load exam first>>\n");
            JOptionPane.showMessageDialog(null,"<<Exam is null - Must create or load exam first>>");

            return;
        }
        
        question = mcmaQField.getText();
        maxVal = Double.parseDouble(mcmaMaxCreditField.getText());
        baseCred = Double.parseDouble(mcmaBaseCreditField.getText());
        numAnswers = Integer.parseInt(mcmaNumAnswersField.getText());

        MCMAQuestion q = new MCMAQuestion(question, maxVal, baseCred);
        
        if(numAnswers==1){
            answer1 = mcmaAnswer1Field.getText(); cred1 = Double.parseDouble(mcmaCredit1Field.getText());
            MCMAAnswer a1 = new MCMAAnswer(answer1, cred1);
            q.addAnswer(a1);
        }
        else if(numAnswers==2){
            answer1 = mcmaAnswer1Field.getText();   cred1 = Double.parseDouble(mcmaCredit1Field.getText());
            answer2 = mcmaAnswer2Field.getText();   cred2 = Double.parseDouble(mcmaCredit2Field.getText());
            MCMAAnswer a1 = new MCMAAnswer(answer1, cred1);
            MCMAAnswer a2 = new MCMAAnswer(answer2, cred2);
            q.addAnswer(a1); q.addAnswer(a2);
        }
        else if(numAnswers==3){
            answer1 = mcmaAnswer1Field.getText();   cred1 = Double.parseDouble(mcmaCredit1Field.getText());
            answer2 = mcmaAnswer2Field.getText();   cred2 = Double.parseDouble(mcmaCredit2Field.getText());
               answer3 = mcmaAnswer3Field.getText();   cred3 = Double.parseDouble(mcmaCredit3Field.getText());
            MCMAAnswer a1 = new MCMAAnswer(answer1, cred1);
            MCMAAnswer a2 = new MCMAAnswer(answer2, cred2);
            MCMAAnswer a3 = new MCMAAnswer(answer3, cred3);
            q.addAnswer(a1); q.addAnswer(a2);q.addAnswer(a3);
        }
        else if(numAnswers==4){
            answer1 = mcmaAnswer1Field.getText();   cred1 = Double.parseDouble(mcmaCredit1Field.getText());
            answer2 = mcmaAnswer2Field.getText();   cred2 = Double.parseDouble(mcmaCredit2Field.getText());
            answer3 = mcmaAnswer3Field.getText();   cred3 = Double.parseDouble(mcmaCredit3Field.getText());
            answer4 = mcmaAnswer4Field.getText();   cred4 = Double.parseDouble(mcmaCredit4Field.getText());
            MCMAAnswer a1 = new MCMAAnswer(answer1, cred1);
            MCMAAnswer a2 = new MCMAAnswer(answer2, cred2);
            MCMAAnswer a3 = new MCMAAnswer(answer3, cred3);
            MCMAAnswer a4 = new MCMAAnswer(answer4, cred4);
            q.addAnswer(a1); q.addAnswer(a2);q.addAnswer(a3);q.addAnswer(a4);
        }
        else if(numAnswers==5){
            answer1 = mcmaAnswer1Field.getText();   cred1 = Double.parseDouble(mcmaCredit1Field.getText());
            answer2 = mcmaAnswer2Field.getText();   cred2 = Double.parseDouble(mcmaCredit2Field.getText());
            answer3 = mcmaAnswer3Field.getText();   cred3 = Double.parseDouble(mcmaCredit3Field.getText());
            answer4 = mcmaAnswer4Field.getText();   cred4 = Double.parseDouble(mcmaCredit4Field.getText());
            answer5 = mcmaAnswer5Field.getText();   cred5 = Double.parseDouble(mcmaCredit5Field.getText());
            MCMAAnswer a1 = new MCMAAnswer(answer1, cred1);
            MCMAAnswer a2 = new MCMAAnswer(answer2, cred2);
            MCMAAnswer a3 = new MCMAAnswer(answer3, cred3);
            MCMAAnswer a4 = new MCMAAnswer(answer4, cred4);
            MCMAAnswer a5 = new MCMAAnswer(answer5, cred5);
            q.addAnswer(a1); q.addAnswer(a2);q.addAnswer(a3);q.addAnswer(a4);q.addAnswer(a5);
        }
        else{
            JOptionPane.showMessageDialog(null,"<<ERROR: invalid number of answers>>");
           return; 
        }
        
        exam.addQuestion(q);
        JOptionPane.showMessageDialog(null,"MCMA Question added!");
    }//GEN-LAST:event_mcmaCreateButtonActionPerformed

    private void numAnswerCreateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numAnswerCreateButtonActionPerformed
        if(exam==null){
            System.out.println("\n<<Exam is null - Must create or load exam first>>\n");
            JOptionPane.showMessageDialog(null,"<<Exam is null - Must create or load exam first>>");
            return;
        }
        
        question = numAnswerQField.getText();
        float f = Float.parseFloat(numAnswerAField.getText());
        maxVal = Double.parseDouble(numAnswerMaxCreditField.getText());
        double tol = Double.parseDouble(numAnswerToleranceField.getText());

        NumQuestion q = new NumQuestion(question, maxVal, tol);
        
        NumAnswer a = new NumAnswer(f);
        q.setRightAnswer(a);
        exam.addQuestion(q);
        JOptionPane.showMessageDialog(null,"NumAnswer Question added!");

    }//GEN-LAST:event_numAnswerCreateButtonActionPerformed

    int curQ = 0;
    
    private void nextQuestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextQuestionActionPerformed
        int numQs = exam.getNum();

        curQ++;

        if(curQ >numQs){
            JOptionPane.showMessageDialog(null,"<<ERROR: question out of bounds>>");
            curQ--;
            return;
        }
        
        String curString = exam.getQuestion(curQ-1);
        
        this.questionLabel.setText("Question "+curQ+": "+ curString);
        
    }//GEN-LAST:event_nextQuestionActionPerformed

    private void previousQuestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousQuestionActionPerformed
        curQ--;
        if(curQ<=0){
            JOptionPane.showMessageDialog(null,"<<ERROR: question out of bounds>>");
            curQ++;
            return;
        }
        
        String curString = exam.getQuestion(curQ-1);
        
        this.questionLabel.setText("Question "+curQ +": "+ curString);
    }//GEN-LAST:event_previousQuestionActionPerformed

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        int num = Integer.parseInt(removeQuestionField.getText());
        
        try {
            exam.removeQuestion(num);
        } catch (InterruptedException ex) {
            Logger.getLogger(ExamBuilder.class.getName()).log(Level.SEVERE, null, ex);
        }

           JOptionPane.showMessageDialog(null,"Question " + num + " deleted successfully...");
    }//GEN-LAST:event_removeButtonActionPerformed

    
    
    
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
            java.util.logging.Logger.getLogger(ExamBuilder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExamBuilder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExamBuilder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExamBuilder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExamBuilder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addPanel;
    private javax.swing.JButton createButton;
    private javax.swing.JPanel createPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton loadButton;
    private javax.swing.JTextField loadField;
    private javax.swing.JPanel loadPanel;
    private javax.swing.JTextField mcmaAnswer1Field;
    private javax.swing.JTextField mcmaAnswer2Field;
    private javax.swing.JTextField mcmaAnswer3Field;
    private javax.swing.JTextField mcmaAnswer4Field;
    private javax.swing.JTextField mcmaAnswer5Field;
    private javax.swing.JTextField mcmaBaseCreditField;
    private javax.swing.JButton mcmaCreateButton;
    private javax.swing.JTextField mcmaCredit1Field;
    private javax.swing.JTextField mcmaCredit2Field;
    private javax.swing.JTextField mcmaCredit3Field;
    private javax.swing.JTextField mcmaCredit4Field;
    private javax.swing.JTextField mcmaCredit5Field;
    private javax.swing.JTextField mcmaMaxCreditField;
    private javax.swing.JTextField mcmaNumAnswersField;
    private javax.swing.JTextField mcmaQField;
    private javax.swing.JTextField mcsaAnswer1Field;
    private javax.swing.JTextField mcsaAnswer2Field;
    private javax.swing.JTextField mcsaAnswer3Field;
    private javax.swing.JTextField mcsaAnswer4Field;
    private javax.swing.JTextField mcsaAnswer5Field;
    private javax.swing.JButton mcsaCreateButton;
    private javax.swing.JTextField mcsaCredit1Field;
    private javax.swing.JTextField mcsaCredit2Field;
    private javax.swing.JTextField mcsaCredit3Field;
    private javax.swing.JTextField mcsaCredit4Field;
    private javax.swing.JTextField mcsaCredit5Field;
    private javax.swing.JTextField mcsaMaxCreditField;
    private javax.swing.JTextField mcsaNumAnswersField;
    private javax.swing.JTextField mcsaQField;
    private javax.swing.JTextField newExamField;
    private javax.swing.JButton nextQuestion;
    private javax.swing.JTextField numAnswerAField;
    private javax.swing.JButton numAnswerCreateButton;
    private javax.swing.JTextField numAnswerMaxCreditField;
    private javax.swing.JTextField numAnswerQField;
    private javax.swing.JTextField numAnswerToleranceField;
    private javax.swing.JButton previousQuestion;
    private javax.swing.JPanel printPanel;
    private javax.swing.JButton printToFileButton;
    private javax.swing.JTextField printToFileField;
    private javax.swing.JButton printToScreenButton;
    private javax.swing.JLabel questionLabel;
    private javax.swing.JButton removeButton;
    private javax.swing.JPanel removePanel;
    private javax.swing.JTextField removeQuestionField;
    private javax.swing.JButton reorderAnswersButton;
    private javax.swing.JButton reorderBothButton;
    private javax.swing.JPanel reorderPanel;
    private javax.swing.JButton reorderQuestionsButton;
    private javax.swing.JTextField saAField;
    private javax.swing.JButton saCreateButton;
    private javax.swing.JTextField saMaxCreditField;
    private javax.swing.JTextField saQField;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField saveField;
    private javax.swing.JPanel savePanel;
    private javax.swing.JTabbedPane tab;
    private javax.swing.JTabbedPane tab2;
    // End of variables declaration//GEN-END:variables
}
