import java.io.*;
import java.util.*;

//Lucas Cepiel - lcepie2

public class MCSAQuestion extends MCQuestion{

	
	public MCSAQuestion(String s, double maxVal) {
		super(s, maxVal);
	}
	
	public MCSAQuestion(Scanner sc) {
		super(sc);

		int num = sc.nextInt();
		for(int x=0;x<num;x++) {
			double f = sc.nextDouble(); 
			String t = sc.nextLine();
			//System.out.println(t + " " + f);
			MCSAAnswer a = new MCSAAnswer(t, f);
			this.as.add(a);
			
		}
		
	}
	
	@Override
	public void save(PrintWriter prwr) {
		prwr.println("MCSAQuestion");
		prwr.println(this.maxValue);
		prwr.println(this.q);
		super.save(prwr);
	}
	
	

	
	@Override
	public Answer getNewAnswer() {
		
		MCSAAnswer a = new MCSAAnswer("", 0.0);
		return a;
	}
	
	
	//@Override
	public Answer getNewAnswer(String text, double creditIfSelected) {
		MCSAAnswer a = new MCSAAnswer(text, creditIfSelected);
		return a;
	}
	
	
	@Override
	public int getAnswerFromStudent() {
		System.out.print("\n   Please type your answer's letter: ");
		Scanner sc = ScannerFactory.getKeyboardScanner();
		String input = sc.nextLine();
		input = input.toLowerCase();
        if(input.equals("~")) { return 0; }
		if(input.equals("a")) { this.studentAnswer = as.get(0);	}
		if(input.equals("b")) { this.studentAnswer = as.get(1);	}
		if(input.equals("c")) { this.studentAnswer = as.get(2);	}
		if(input.equals("d")) { this.studentAnswer = as.get(3);	}
		if(input.equals("e")) { this.studentAnswer = as.get(4);	}
		
		return 1;
	}
        
        
    @Override
	public void setStudentAnswer(String s) {
		s = s.toLowerCase();
		if(s.equals("a")) { this.studentAnswer = as.get(0);	}
		if(s.equals("b")) { this.studentAnswer = as.get(1);	}
		if(s.equals("c")) { this.studentAnswer = as.get(2);	}
		if(s.equals("d")) { this.studentAnswer = as.get(3);	}
		if(s.equals("e")) { this.studentAnswer = as.get(4);	}

	}
	
	
	@Override
	public double getValue() {	
		//return .creditIfSelected * this.maxValue;
		//double points = super.getValue((MCAnswer)this.studentAnswer);
		//return points;
		MCAnswer a = (MCAnswer)this.studentAnswer;
		double b = a.creditIfSelected*this.maxValue; 
		return b;
	}
	
	
}
