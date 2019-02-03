import java.io.*;
import java.util.*;

/* A Java class to represent answers on an exam
    @author Kyler Boyle
    @ACCC kboyle7
    Copyright 2018 Kyler Boyle. All Rights Reserved.
*/

abstract class Answer
{

    protected Answer() {
    
    }

    public Answer(Scanner s) {
    }

    public abstract void print();

    public abstract double getCredit(Answer rightAnswer);

    public abstract void save(PrintWriter pw);

    abstract void printToFile(PrintWriter out);

    // might use later
    /*
    public void setSelected() {
        selected = !selected;
    }

    // extra method
    public boolean isSelected() {
        return selected;
    }
    
    // how will unselected answers get value?
    public void setValue(double d1, double d2) {
        selectedValue = d1;
        unselectedValue = d2;
    }

    public double getValue() {
        if(selected) {
            return selectedValue;
        } else {
            return unselectedValue;
        }
    }

    */
}
