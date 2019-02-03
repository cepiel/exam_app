import java.io.*;
import java.util.*;

//Lucas Cepiel - lcepie2

public class SAQuestion extends Question {

	
	public SAQuestion(String s, double maxVal) {
		super(s, maxVal);
	}
	
	public SAQuestion(Scanner sc) {
		super(sc);
		SAAnswer a = new SAAnswer(sc);	
		this.rightAnswer = a;
	}
	
	@Override
	public void save(PrintWriter prwr) {
		
		prwr.println("SAQuestion");
		prwr.println(this.maxValue);
		prwr.println(this.q);
		this.rightAnswer.save(prwr);
		
	}
	
	
	
	
	
	@Override
	public Answer getNewAnswer() {
		//System.out.print("Please type answer: ");
		//Scanner sc = new Scanner(System.in);
		//String input = sc.nextLine();
		//input = input.toLowerCase();
		
		//SAAnswer a = new SAAnswer(input);
		SAAnswer a = new SAAnswer("");
		return a;
	}
	
	//@Override
	public Answer getNewAnswer(String t) {
		SAAnswer a = new SAAnswer(t);
		return a;
	}
	
	
	
	@Override
	public int getAnswerFromStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\n   Please type answer: ");
		String input = sc.nextLine();
        input = input.toLowerCase();
        if(input.equals("~")) {
            return 0;
        }
		SAAnswer a = new SAAnswer(input);
		this.studentAnswer = a;
		
		return 1;
	}
        
        
    @Override
	public void setStudentAnswer(String s) {
            s = s.toLowerCase();
            SAAnswer a = new SAAnswer(s);
            this.studentAnswer = a;
	}
	
	@Override
	public double getValue() {
		
		double credit = studentAnswer.getCredit(rightAnswer);
		double points = 0.0;
		
		SAAnswer right = (SAAnswer) this.rightAnswer;
		
		if(this.rightAnswer.equals(right)) {
			//System.out.println("x ");
			points = this.maxValue;
		}
		
		return points*credit;
	}
		
	
	
	
}
