import java.io.*;
import java.util.*;


//AUTHOR: Lucas Cepiel : lcepie2 netid : lcepiel ACCC
//GROUP:  Lucas Cepiel, Greg Sobieszek, Kyler Boyle

abstract class Question {
	
	//protected int numAnswers = 5; //number of question choices
	//protected int counter;
	//protected int posAnswer;
	
	protected String q;
	protected double maxValue;
	protected Answer rightAnswer;
	protected Answer studentAnswer;
	
	
	protected Question(String s, double maxVal) {
		
		this.q=s;
		this.maxValue = maxVal;
		return;
	}
	
	public Question(Scanner sc) {
		
		Float num = sc.nextFloat();	String line = sc.nextLine();
		line = sc.nextLine();
		this.maxValue = num;
		this.q = line;
		
	}
	

	public void saveStudentAnswers(PrintWriter prwr) {
		
	}
	
	//can be abstract? your choice 
	public void restoreStudentAnswers(Scanner sc) {
		
	}
	
	
	public void print() { //Prints the question to the screen. The MCQuestion class overrides this method to also print the available answers.
		System.out.println(this.q);
		return;
	}
	
	public void printToFile(PrintWriter out) {//prints question to page. Other Question classes need to override to also print available answers
		out.println(this.q);
		return;
	}
	
	public void setRightAnswer(Answer ans) { //selects Answer, this may/may not require unselecting other answers
		this.rightAnswer = ans;
		return;
	}
	
        public String getQuestionString() {
            return q;
        }
	
	
	abstract Answer getNewAnswer();
	
	abstract int getAnswerFromStudent();
        
    abstract void setStudentAnswer(String s);
    
	abstract double getValue();
	
	abstract void save(PrintWriter prwr);
	
	
}
