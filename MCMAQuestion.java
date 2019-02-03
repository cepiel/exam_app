import java.io.*;
import java.util.*;

//Lucas Cepiel - lcepie2

public class MCMAQuestion extends MCQuestion{

	
	protected ArrayList<MCAnswer> studentAnswers = new ArrayList<MCAnswer>();
	double baseCredit;
	protected int answerSize;
	
	public MCMAQuestion(String s, double maxVal, double baseCred) {
		super(s, maxVal);
		this.baseCredit = baseCred;
	}
	
	public MCMAQuestion(Scanner sc) {
		super(sc);
		
		Double i = sc.nextDouble();
		this.baseCredit = i;
		//String line = sc.nextLine();
		
		int num = sc.nextInt();
		for(int x=0;x<num;x++) {
			Double f = sc.nextDouble(); 
			String t = sc.nextLine();
			MCMAAnswer a = new MCMAAnswer(t, f);
			this.as.add(a);

		}
		
	}
	
	@Override
	public void save(PrintWriter prwr) {

		prwr.println("MCMAQuestion");
		prwr.println(this.maxValue);
		prwr.println(this.q);
		prwr.println(this.baseCredit);
		super.save(prwr);
	}
	
	
	public void saveStudentAnswers(PrintWriter prwr) {
		prwr.println(this.studentAnswers.size());
        if(this.studentAnswers.size() == 0) {
            return;
        }
		for(int x=0;x<this.studentAnswers.size(); x++) {
			String st = this.studentAnswers.get(x).text.trim();
			//prwr.println(st);
			prwr.println(this.studentAnswers.get(x).creditIfSelected + " " + st);
			//prwr.println(studentAnswers.get(x).text);
		}
	}
	
	
	
	//@Override
	public void restoreStudentAnswers(Scanner sc) {
		int numAnswers = sc.nextInt();
		
		for(int y=0;y<numAnswers;y++) {
			double num = sc.nextDouble();
			String line = sc.nextLine();
			MCMAAnswer a = new MCMAAnswer(line, num);
			this.studentAnswers.add(a);
		}//end for
		return;
	}
		
	
	@Override
	public Answer getNewAnswer() {
		MCSAAnswer a = new MCSAAnswer("", 0.0);
		return a;
	}
	
	
	//@Override
	public Answer getNewAnswer(String text, double creditIfSelected) {
		MCMAAnswer a = new MCMAAnswer(text, creditIfSelected);
		return a;
	}
	
	
	@Override
	public int getAnswerFromStudent() {
		System.out.print("\n   Please type your answer's letter(s): ");
		Scanner sc = ScannerFactory.getKeyboardScanner();	
		String str = sc.nextLine();
		String[] array = str.split(" ", 5);
		
		for(String x : array) {
		//String input = sc.nextLine();	
		x = x.toLowerCase();
        if(x.equals("~")) {
            return 0;
        }
		if(x.equals("a")) { 
			//MCAnswer a = as.get(0);
			this.studentAnswers.add(as.get(0)); 
		}
		if(x.equals("b")) { 
			this.studentAnswers.add(as.get(1));
		}
		if(x.equals("c")) { 
			this.studentAnswers.add(as.get(2));
		}
		if(x.equals("d")) {
			this.studentAnswers.add(as.get(3));
		}
		if(x.equals("e")) { 
			this.studentAnswers.add(as.get(4));
		}
		}//end for
		
		return 1;
	}
        
    @Override
	public void setStudentAnswer(String s) {
		String[] array = s.split(" ", 5);
		
		for(String x : array) {
                    //String input = sc.nextLine();	
                    x = x.toLowerCase();
                    if(x.equals("a")) { 
                        //MCAnswer a = as.get(0);
                        this.studentAnswers.add(as.get(0)); 
                    }
                    if(x.equals("b")) { 
                        this.studentAnswers.add(as.get(1));
                    }
                    if(x.equals("c")) { 
                        this.studentAnswers.add(as.get(2));
                    }
                    if(x.equals("d")) {
                        this.studentAnswers.add(as.get(3));
                    }
                    if(x.equals("e")) { 
                        this.studentAnswers.add(as.get(4));
                    }
		}//end for
		
	}
	
	
	//calls super.getValue() for all of the student answers, sums up the values for each answer. 
	//return value is this sum plus the base value, which is what the question earns if no answers are chosen
	//@Override
	public double getValue() {		
		double sum=0.0;		
		int num = this.studentAnswers.size();
		
		for(int x=0;x<num;x++) {
			MCAnswer a = this.studentAnswers.get(x);
			sum += a.creditIfSelected;
			//sum += super.getValue(a);
			
		}
		sum+=this.baseCredit; //adds default credit
		return sum*this.maxValue; //returns number of points earned
		
	}
	
	
	
	
}
