# exam-generator

## Division of classes:
    * Lucas Cepiel:   ExamBuilder, Exam, Question
    * Kyler Boyle:    ExamTaker, MCAnswer, MCSAAnswer, MCMAAnswer, ScannerFactory, Answer, NumQuestion, NumAnswer, SAAnswer
    * Greg Sobieszek: ExamGrader, MCSAQuestion, SAQuestion, MCMAQuestion, MCQuestion

## Building the program:
    To build the program, simply type 'make' to build ExamBuilder, 'make ExamTaker' to build ExamTaker, and 'make ExamGrader' to build ExamGrader.
    All applications can be run in the command line using ./<NameOfApplication> assuming you're in the directory containing the applications.

## ExamBuilder notes:
    Just follow the prompts in the menu for examBuilder, it does everything it shows there. Creates exam, loads exam, adds and
    removes questions, prints an exam to a file or the screen, reorders questions/answers, and saves exam (with timestamp). 
    When loading an exam, must load an exam *with* a timestamp line, otherwise you will break it. Only files with timestamps should be         used in this version anyway.
    All options are shown as tabs at the top. To add questions, select the sub tab for the type of question you want and it will show you     the corresponding options to add that question type.

## ExamTaker notes:
    ExamTaker will prompt the user with the questions from the exam. To skip a question so you can return to it later, type '~' into your answer field.
    To skip a question with no intention to come back to it, just simply hit enter. You will not receive credit in subsequent grading for unanswered questions.
    At the end of the exam, you will be prompted to either return to a specific question to answer again, see all unanswered questions, or end the exam.


## ExamGrader notes:
   Exam Grader takes in 1-2 arguments, if two arguments given it will check to see if they match along with the exam file at the top of the corresponding answers.txt.
   There will be a printout of the exam question values at the end of the program.
   After running you will need to add a (txt) or (csv) file for example (results.txt or results.csv) to save  the user results with their name the total they recieved on the exam and also the pts the student got for each question.
