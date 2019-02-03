import java.io.*;
import java.util.*;

/* A Java class to represent MCSA answers on an exam
    @author Kyler Boyle
    @ACCC kboyle7
    Copyright 2018 Kyler Boyle. All Rights Reserved.
*/


class MCSAAnswer extends MCAnswer
{
    public MCSAAnswer() {
        super();
    }
    
    public MCSAAnswer(String text, double creditIfSelected) {
        super(text, creditIfSelected);
    }

    public MCSAAnswer(Scanner s) {
        super(s);
    }
}
