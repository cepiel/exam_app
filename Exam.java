import java.io.*;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;

//AUTHOR: Lucas Cepiel : lcepie2 netid : lcepiel ACCC
//GROUP:  Lucas Cepiel, Greg Sobieszek, Kyler Boyle

public class Exam {
	
	private String name;
	private int numq;
	private ArrayList<Question> qs = new ArrayList<Question>();
	private String date;
	
	
	public Exam(String s) {
		this.name=s;
		this.numq=0;
		//this.date=null;
		return;
	}
	
	public Exam(Scanner sc) {
		String line = sc.nextLine();
		//System.out.println(line);
		this.name = line;
		int x=0;
		date = sc.nextLine(); //checking next line for date field
							  //if no date, effectively skips to first question

		/*
		if(line.contains("/")) { //checks if it has a date field
			System.out.println("found a date\n");
			this.date = line;	 //now has to skip a line to first question
			line=sc.nextLine(); 		 //toss empty line 
		}
		*/
		
		
		while(sc.hasNext()) {
			line = sc.nextLine(); 		//toss empty line 
			line = sc.nextLine();
			// System.out.println(line);
			//System.out.println("\nBUILDING EXAM");
			
			if(line.equals("MCSAQuestion")) {
				MCSAQuestion q = new MCSAQuestion(sc);
				this.qs.add(q);
				//q.print();
			}
			else if(line.equals("MCMAQuestion")) {
				MCMAQuestion q = new MCMAQuestion(sc);
				this.qs.add(q);
				//q.print();
			}
			else if(line.equals("SAQuestion"))   {
				SAQuestion q = new SAQuestion(sc);
				this.qs.add(q);
				//q.print();
			}
            else if(line.equals("NumQuestion")) {
                NumQuestion q = new NumQuestion(sc);
                this.qs.add(q);
                //q.print();
            }
			else { System.out.println("<<Reading question error>>"); break;	}
			
			
			x++;		
			
		}
		//System.out.println("\tScanned " + x + " questions");
		
		
	}
	
	
	
	public void saveStudentAnswers (PrintWriter prwr) {
		Scanner sc = ScannerFactory.getKeyboardScanner();
		int y=0;
		for(int x=0;x<qs.size(); x++) {
			Question q = qs.get(x);
			if(q instanceof SAQuestion) {
				prwr.println("SAQuestion");
                if(q.studentAnswer == null) {
                    prwr.println("\\\n");
                    continue;
                }
                SAAnswer a = (SAAnswer)q.studentAnswer;
                if(a.text.length() == 0) {
                    prwr.println("\\\n");
                    continue;
                }
				prwr.println(a.text);
			}
			if(q instanceof MCSAQuestion) {
				prwr.println("MCSAQuestion");
                if(q.studentAnswer == null) {
                    prwr.println("0.0 \\\n");
                    continue;
                }
				MCSAAnswer a = (MCSAAnswer)q.studentAnswer;
				String st = a.text.trim();
				prwr.println(a.creditIfSelected + " " + st);
				//prwr.print(st);
			}
			if(q instanceof MCMAQuestion) {
				prwr.println("MCMAQuestion");
				//MCAnswer a = q.studentAnswer;
				q.saveStudentAnswers(prwr);
			}
            if(q instanceof NumQuestion) {
                prwr.println("NumQuestion");
                if(q.studentAnswer == null) {
                    prwr.println("0.0 \n");
                    continue;
                }
                q.studentAnswer.save(prwr);
            }
			
		prwr.println("");
		y++;
		}//end for
		
		//System.out.println(" Saved "+ y + " answers");
		
		return;
	}
        
        public String getQuestionString(int pos) {
            return qs.get(pos).getQuestionString();
        }
        
        public int getNumQuestions() {
            return qs.size();
        }
	
        public void setStudentAnswer(int pos, String s) {
            if(pos > qs.size()) {
                return;
            }
            this.qs.get(pos).setStudentAnswer(s);
        }
	
	public void restoreStudentAnswers(Scanner sc) {
		String line = sc.nextLine();
		System.out.println("\n\n  Restoring " + line + "'s answers...");
		line = sc.nextLine();	//skip empty line
		
		for(int x=0;x<qs.size();x++) {
			Question q = qs.get(x);
			line = sc.nextLine();
			
			if(line.equals("SAQuestion")) {
				line = sc.nextLine();
				q.studentAnswer = new SAAnswer(line);
			}
			else if(line.equals("MCSAQuestion")) {
				double num = sc.nextDouble();
				line = sc.nextLine();
				q.studentAnswer = new MCSAAnswer(line, num);
			}
			else if(line.equals("MCMAQuestion")) {
				q.restoreStudentAnswers(sc);

			}
            else if(line.equals("NumQuestion")) {
                q.studentAnswer = new NumAnswer(sc);
            }
			else { System.out.println("<<Error restoring answer>>"); }
			
		line = sc.nextLine();	
		}
		
		return;
	}
	
    public String getQuestion(int x) {
        Question q = this.qs.get(x);
        return q.q;
    }

    public int getNum() {
        int size = qs.size();
        return size;
    }
	
	public void addQuestion(Question q) {
		this.qs.add(q);
		this.numq++;
		return;
	}
	
	public void removeQuestion(int index) throws InterruptedException {
		if(index > qs.size()) {
			System.out.println("Question " + (index) + " doesn't exist!");
			TimeUnit.SECONDS.sleep(1);
			return;
		}
		
		this.qs.remove(index-1);
		this.numq--;
		TimeUnit.SECONDS.sleep(1);
		System.out.println("Question " + (index) + " deleted successfully...");
		TimeUnit.SECONDS.sleep(1);
		return;
	}
	
	public void print() {
		System.out.println(name);
		
		for(int x=0;x<qs.size();x++) {
			Question q = qs.get(x);
			int y=x+1;
			System.out.print(y +". ");
			q.print();
		}
		System.out.println("");
		return;
	}
	
	public void printToFile(PrintWriter prwr) {
		prwr.println(this.name);
		
		for(int x=0;x<qs.size();x++) {
			Question q = qs.get(x);
			int y=x+1;
			prwr.print(y +". ");
			q.printToFile(prwr);
		}
		prwr.println("");
		return;
	}

	public void save(PrintWriter prwr) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();  
		 
		prwr.println(this.name);
		prwr.println(dtf.format(now)); 
		prwr.println();
		
		for(int x=0;x<this.qs.size();x++) {
			Question q = qs.get(x);
			q.save(prwr);
			prwr.println();
		}
	}
	
	public void reorderQuestions() {
		Collections.shuffle(qs);
		return;
	}
	
	
	//If the position parameter is negative, then all MC questions get their answers reordered.
	//Otherwise the position indicates which Question should have its answers reordered,
	//provided that that Question is a MC type question			
	public void reorderMCAnswers(int pos) {	
										 			
		if(pos <0) {
			for(int x=0;x<qs.size(); x++) {
					Question q = qs.get(x);
					if(q instanceof MCQuestion) {
						MCQuestion mcq = (MCQuestion) q;
						mcq.reorderAnswers();
						//(MCQuestion)q.reorderAnswers();
						}
			}
		}
			
		else {
			MCQuestion q = (MCQuestion) qs.get(pos);
			q.reorderAnswers();
		}
		
	return;
	}
	
	
	public void getAnswerFromStudent(int pos) {	
		
		if(pos <0) {	//get answers for all the questions
			System.out.println("\n\n <<You are now taking the test>>");
			System.out.println("   " + this.name);
			for(int x=0;x<qs.size(); x++) {
				Question q = this.qs.get(x);
				int y=x+1;
				System.out.print(y+". ");
				q.print();
				q.getAnswerFromStudent();
				System.out.println("");
			}
		}
		
		else {			//get answer for 1 question
			Question q = this.qs.get(pos);
			q.print();
			q.getAnswerFromStudent();
		}
		
		return;
	}

	public void getAnswerFromStudent(int pos, ArrayList<Integer> skipped) {	
		int isValid = 0;
		if(pos <0) {	//get answers for all the questions
			System.out.println("\n\n <<You are now taking the test>>");
			System.out.println("   " + this.name);

            System.out.println("\n\nNOTE: To skip a question, type '~'\n\n");
			for(int x=0;x<qs.size(); x++) {
				Question q = this.qs.get(x);
				int y=x+1;
				System.out.print(y+". ");
				q.print();
				isValid = q.getAnswerFromStudent();
                if(isValid == 0) {
                    if(!skipped.contains(x)) {
                        skipped.add(Integer.valueOf(x));
                    }
                } else {
                    if(skipped.contains(x)) {
                        skipped.remove(Integer.valueOf(x));
                    }
                }
				System.out.println("");
			}
		}
		
		else {			//get answer for 1 question
			Question q = this.qs.get(pos);
			q.print();
			isValid = q.getAnswerFromStudent();
            if(isValid == 0) {
                if(!skipped.contains(pos)) {
                    skipped.add(Integer.valueOf(pos));
                }
            } else {
                if(skipped.contains(pos)) {
                    skipped.remove(Integer.valueOf(pos));
                }
            }
		}
		
		return;
	}
	
	public double getValue() { //needs to get overall value of exam. should work regardless of how many questions have been answered
		double points = 0.0;
		
		for(int x=0;x<qs.size(); x++) {
			Question q = this.qs.get(x);
			
			points += q.getValue();
		}
		
		return points;
	
	}
	public double getQValue(int pos) {
		double val = 0;
		for(int i = 0; i < qs.size(); i++)
		{
			if(i == pos) {
			val = qs.get(pos).maxValue;
			
			}
		}
		return val;
	}
	public void graderValues() {
		int x = 0;
		int y = 0;
		
		for(x = 0; x < qs.size(); x++)
		{
			System.out.println("#" + y + ": " + qs.get(x).maxValue + "pts");
			y++;
		}
		
	}
	
	public void reportQuestionValues() {	//produce a table of values of each question on the exam, and the total pts
		
		double points = 0.0;
		double total = 0.0;
		int counter = 1;
		double percent = 0.0;
		double earned = 0.0;
		double totEarned = 0.0;
		System.out.println("\n\n\n <<Question Values Report>> ");
		System.out.println("\n\nQuestion\tPts Possible\tPts Earned");
		
		for(int x=0;x<qs.size(); x++) {
			
			Question q = this.qs.get(x);
			points = q.maxValue; 
			
			total += points;
			earned = q.getValue();
			totEarned +=earned;
			
			System.out.println(counter + ". \t\t" + q.maxValue + "\t\t" + earned);
			counter++;
		}
		
		percent = totEarned/total;
		percent = percent*100;
		System.out.println("\nPoints Possible: " + total);
		System.out.println("Points Earned:   " + totEarned);		
		System.out.println("Score:   \t" + percent + "%");
		return;
	}

    public String getExamName() {
        return name;
    }
	
    
	
}
