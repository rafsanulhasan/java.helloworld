
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;
import java.io.IOException;

/**
 *
 * @author Asad
 */
public class HelloWorld {

    /**
     * @param s the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] s) throws IOException {
        // TODO code application logic here
        Mark[] marks;
        if (s.length>0)
        {   
            marks=new Mark[s.length];
            for (int i=0;i<s.length;i++)
                marks[i]=new Mark(Integer.parseInt(s[0]));
        }
        else 
        {
            marks=new Mark[3];
            Mark.scanMarks(marks, 3);
        }
        for (Mark mark : marks) {
            if (mark.mark <=30) {
                System.out.println("Poor Performanec work hard");
            }
            else if (mark.mark > 30 && mark.mark <= 45 ) {
                System.out.println("Passed with C Grade");
            }
            else if (mark.mark > 45 && mark.mark <= 60 ) {
                System.out.println("Passed with B Grade");
            }
            else if (mark.mark > 60) {
                System.out.println("Passed with A grade");
            }else{
                System.out.println("Invaild Input");
            }
        }
    }
    
}
