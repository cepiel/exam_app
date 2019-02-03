# makefile variable for compiler
#
JCC = javac

# typing 'make' will invoke ExamBuilder target

ExamBuilder: ExamBuilder.class Exam.class Question.class MCQuestion.class MCSAQuestion.class MCMAQuestion.class SAQuestion.class NumQuestion.class Answer.class MCAnswer.class MCSAAnswer.class MCMAAnswer.class SAAnswer.class NumAnswer.class ScannerFactory.class

ExamTaker: ExamTaker.class Exam.class Question.class MCQuestion.class MCSAQuestion.class MCMAQuestion.class SAQuestion.class NumQuestion.class Answer.class MCAnswer.class MCSAAnswer.class MCMAAnswer.class SAAnswer.class NumAnswer.class ScannerFactory.class

ExamGrader: ExamGrader.class Exam.class Question.class MCQuestion.class MCSAQuestion.class MCMAQuestion.class SAQuestion.class NumQuestion.class Answer.class MCAnswer.class MCSAAnswer.class MCMAAnswer.class SAAnswer.class NumAnswer.class ScannerFactory.class

ExamBuilder.class: ExamBuilder.java
	$(JCC) ExamBuilder.java

ExamTaker.class: ExamTaker.java
	$(JCC) ExamTaker.java

ExamGrader.class: ExamGrader.java
	$(JCC) ExamGrader.java

Exam.class: Exam.java
	$(JCC) Exam.java

Question.class: Question.java
	$(JCC) Question.java

MCQuestion.class: MCQuestion.java
	$(JCC) MCQuestion.java

MCSAQuestion.class: MCSAQuestion.java
	$(JCC) MCSAQuestion.java

MCMAQuestion.class: MCMAQuestion.java
	$(JCC) MCMAQuestion.java

SAQuestion.class: SAQuestion.java
	$(JCC) SAQuestion.java

NumQuestion.class: NumQuestion.java
	$(JCC) NumQuestion.java

Answer.class: Answer.java
	$(JCC) Answer.java

MCAnswer.class: MCAnswer.java
	$(JCC) MCAnswer.java

MCSAAnswer.class: MCSAAnswer.java
	$(JCC) MCSAAnswer.java

MCMAAnswer.class: MCMAAnswer.java
	$(JCC) MCMAAnswer.java

SAAnswer.class: SAAnswer.java
	$(JCC) SAAnswer.java

NumAnswer.class: NumAnswer.java
	$(JCC) NumAnswer.java

ScannerFactory.class: ScannerFactory.java
	$(JCC) ScannerFactory.java

clean:
	$(RM) *.class


