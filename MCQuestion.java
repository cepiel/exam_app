import java.util.ArrayList;
import java.util.Collections;
import java.io.*;
import java.util.*;


//Lucas Cepiel - lcepie2

abstract class MCQuestion extends Question {

	
	protected ArrayList<MCAnswer> as = new ArrayList<MCAnswer>();

	
	protected MCQuestion(String s, double maxVal) {
		super(s, maxVal);
	}

	protected MCQuestion(Scanner sc) {
		super(sc);
	}
	
	
	//check this answer against each of the stored answer choices, and if any of them earns credit, return value is (this * maxVal) for the question
	public double getValue(MCAnswer ans) {
		
		for(int x=0;x<this.as.size(); x++) {
			MCAnswer a = this.as.get(x);
			if(a.equals(ans)) { 
				return a.creditIfSelected * this.maxValue;
			}
		}
		
		return 0.0;
	}
	
	
	
	public void save(PrintWriter prwr) {
		prwr.println(as.size());
		for(int x=0;x<this.as.size();x++) {
			MCAnswer a = as.get(x);
			a.save(prwr);
		}
	}
	
	
	
	
	@Override
	public void print() {
		super.print();

		for(int x=0;x<this.as.size(); x++) {
			Answer a = this.as.get(x);
			if(x==0) { System.out.print("\t A. ");	}
			if(x==1) { System.out.print("\t B. ");	}
			if(x==2) { System.out.print("\t C. ");	}
			if(x==3) { System.out.print("\t D. ");	}
			if(x==4) { System.out.print("\t E. ");	}
			if(x==5) { System.out.print("\t F. ");	}
			if(x==6) { System.out.print("\t G. ");	}
			if(x==7) { System.out.print("\t H. ");	}
			if(x==8) { System.out.print("\t I. ");	}
			if(x==9) { System.out.print("\t J. ");	}
			a.print();
		}
		
		return;
	}
	
	@Override
	public void printToFile(PrintWriter out) {
		super.printToFile(out);

		for(int x=0;x<this.as.size(); x++) {
			Answer a = this.as.get(x);
			if(x==0) { out.print("\t A. ");	}
			if(x==1) { out.print("\t B. ");	}
			if(x==2) { out.print("\t C. ");	}
			if(x==3) { out.print("\t D. ");	}
			if(x==4) { out.print("\t E. ");	}
			if(x==5) { out.print("\t F. ");	}
			if(x==6) { out.print("\t G. ");	}
			if(x==7) { out.print("\t H. ");	}
			if(x==8) { out.print("\t I. ");	}
			if(x==9) { out.print("\t J. ");	}
			a.printToFile(out);
		}
		
		return;
	}
	
	public void addAnswer(MCAnswer a) {
		this.as.add(a);	
		return;
	}
	
	public void reorderAnswers() {
		Collections.shuffle(this.as);	
		return;
	}
	
}
