/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;
import java.util.Scanner;

/**
 *
 * @author Asad
 */
public class Mark {
    public int mark=0;
    /**
     *      
     * @param mark 
     */
    public Mark(int mark){
        this.mark=mark;
    }
    /**
     * 
     * @param marks
     * @param length 
     */
    public static void scanMarks(Mark[] marks, int length)
    {
        for (int i=0;i<length;i++)
        {
            System.out.print("Mark " + (i+1) + ": ");
            Scanner s=new Scanner(System.in);
            int m=s.nextInt();
            marks[i]=new Mark(m);
        }
    }
}
