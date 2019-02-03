import java.io.*;
import java.util.*;

/* A Java class to represent MCMA answers on an exam
    @author Kyler Boyle
    @ACCC kboyle7
    Copyright 2018 Kyler Boyle. All Rights Reserved.
*/


class MCMAAnswer extends MCAnswer
{
    public MCMAAnswer() {
        super();
    }

    public MCMAAnswer(String text, double creditIfSelected) {
        super(text, creditIfSelected);
    }

    public MCMAAnswer(Scanner s) {
        super(s);
    }
}
