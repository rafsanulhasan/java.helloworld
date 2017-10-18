
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
     * @param args the command line arguments
     */
    public static void main(String[] s) throws IOException {
        // TODO code application logic here
        int[] marks;
        if (s.length>0)
        {   
            marks=new int[s.length];
            for (int i=0;i<marks.length;i++)
                marks[i]=Integer.parseInt(s[0]);
        }
        else 
        {
            marks=new int[3];
            for (int i=0;i<3;i++)
            {
                System.out.print("Mark " + (i+1) + ": ");
                marks[i]=System.in.read();
            }
        }
        for (int i=0;i<marks.length;i++)
        {
            int mark=marks[i];
            if (mark <=30) {
                System.out.println("Poor Performanec work hard");
            }
            else if (mark > 30 && mark <= 45 ) {
                System.out.println("Passed with C Grade");
            }
            else if (mark > 45 && mark <= 60 ) {
                System.out.println("Passed with B Grade");
            }
            else if (mark > 60) {
                System.out.println("Passed with A grade");
            }else{
                System.out.println("Invaild Input");
            }
        }
    }
    
}
