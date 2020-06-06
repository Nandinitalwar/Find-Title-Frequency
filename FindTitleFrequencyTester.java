import java.util.*;
import java.lang.*;
import java.io.*;


public class FindTitleFrequencyTester {
    
    public static void main (String [] args){
            
         FindTitleFrequency obj = new FindTitleFrequency ("practice.txt");
         HashSet <String> hs = obj.returnTitles();
        for (String k: hs)
            System.out.println(k);
        
    }
}