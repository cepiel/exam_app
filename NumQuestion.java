import java.io.*;
import java.util.*;

/* A Java class to represent number questions on an exam
    @author Kyler Boyle
    @ACCC kboyle7
    Copyright 2018 Kyler Boyle. All Rights Reserved.
*/

public class NumQuestion extends Question {
    
    double tolerance;

    public NumQuestion(String s, double maxVal, double tolerance) {
        super(s, maxVal);
        this.tolerance = tolerance;
    }

    public NumQuestion(Scanner sc) {
        super(sc);
        NumAnswer a = new NumAnswer(sc);
        rightAnswer = a;
        tolerance = sc.nextFloat();
        sc.nextLine();
    }

    @Override
    public void save(PrintWriter pw) {
        pw.println("NumQuestion");
        pw.println(maxValue);
        pw.println(q);
        rightAnswer.save(pw);
        pw.println(tolerance);
    }

    public Answer getNewAnswer() {
        NumAnswer a = new NumAnswer();
        return a;
    }
    
    public int getAnswerFromStudent() {
        System.out.print("\n Please type your numeric answer: ");
        Scanner sc = ScannerFactory.getKeyboardScanner();
        if(sc.hasNext("~")) {
            return 0;
        }
        studentAnswer = new NumAnswer(sc);
        return 1;
    }
    
    @Override
    public void setStudentAnswer(String s) {
        studentAnswer = new NumAnswer(s);
    }

    @Override
    public double getValue() {
        
        double absDiff = studentAnswer.getCredit(rightAnswer);
        if(absDiff > tolerance) {
            return 0;
        }

        return maxValue;
    }

}
