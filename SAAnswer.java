import java.io.*;
import java.util.*;

/* A Java class to represent short answers on an exam
    @author Kyler Boyle
    @ACCC kboyle7
    Copyright 2018 Kyler Boyle. All Rights Reserved.
*/

class SAAnswer extends Answer
{
    protected String text;
    
    public SAAnswer() {
        text = "";
    }
    public SAAnswer(String text) {
        this.text = text;
    }

    public SAAnswer(Scanner s) {
        text = s.nextLine();
    }

    @Override
    public void print() {
        System.out.println("\t" + text);
    }

    protected String getText() {
        return text;
    }

    @Override
    public double getCredit(Answer rightAnswer) {
        SAAnswer tmp = new SAAnswer();
        tmp = (SAAnswer)rightAnswer;
        if(text.equalsIgnoreCase(tmp.getText())) {
            return 1.0;
        } else {
            return 0.0;
      
        }
    }

    public void save(PrintWriter pw) {
        pw.print(text + "\n");
    }
    
    
	@Override
	void printToFile(PrintWriter out) {
		
	}

}
