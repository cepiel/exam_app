import java.io.*;
import java.util.*;
import java.lang.Math.*;

/* A Java class to represent number answers on an exam
    @author Kyler Boyle
    @ACCC kboyle7
    Copyright 2018 Kyler Boyle. All Rights Reserved.
*/


public class NumAnswer extends Answer {
    
    protected double answer;

    public NumAnswer() {
        answer = 0.0;
    }
    
    public NumAnswer(String s) {
        answer = Float.parseFloat(s);
    }

    public NumAnswer(Float f) {
        answer = f;
    }

    public NumAnswer(Scanner sc) {
        answer = sc.nextFloat();
        sc.nextLine();
    }

    public void print() {
        System.out.println("\t" + answer);
    }

    
    public double getAnswer() {
        return answer;
    }
    
    public String getQuestionString() {
        return "";
    }

    public double getCredit(Answer rightAnswer) {
        NumAnswer tmp = new NumAnswer();
        tmp = (NumAnswer)rightAnswer;
        return Math.abs(tmp.getAnswer() - answer);
    }

    public void save(PrintWriter pw) {
        System.out.println(answer);
        pw.println((double)answer);
    }

	@Override
	void printToFile(PrintWriter out) {
		
	}


}
