import java.util.*;
import java.lang.*;
import java.io.*;

public class FindTitleFrequency {
    
        File file;
        Scanner sc;
        LinkedList <Integer> ll = new LinkedList <>();
        LinkedList <String> ll_str = new LinkedList <>();
        HashSet<String> set=new HashSet();

    
        public FindTitleFrequency (String filename){
            file = new File (filename);
        try {
         sc = new Scanner (file);
        }
        catch (FileNotFoundException e) {
            System.out.println("file doesn't exist");
        }
     }
       
        public HashSet returnTitles() {
            String result = "yes";
            int count = 0;
           HashMap<String,Integer> frequencymap = new HashMap<String,Integer>();
          // HashMap<Integer,String> keymap = new HashMap<Integer,String>();
        //need to figure how to find the titles
              while (sc.hasNextLine()){
             String input = sc.nextLine();
             if (input != null) {
             char [] input_arr = input.toCharArray();
                  try {
                     // System.out.println(input.charAt(0));
                  if (input.charAt(0) == '=' && input.charAt(1) == '=' && input.charAt(2)!= '='){
                      if (input.charAt(input.length()-1) == '=' && input.charAt(input.length()-2) == '=') {
                   StringBuilder str = new StringBuilder ();
                   for (int i = 2 ; i < input_arr.length - 2; i++){
                         str.append(input_arr[i]);
                     }
		if (str.charAt(0) == ' ' && str.charAt(str.length()-1) == ' ') {
		str = str.deleteCharAt(0);
		str = str.deleteCharAt(str.length()-1);
			}

                        result = str.toString();
                   }
                 }
                  }
                  catch (Exception e) {
                      continue;
                  }
             }
           if (result != null) { 
           if(frequencymap.containsKey(result)) {
                  frequencymap.put(result, frequencymap.get(result)+1);
           }
              else {
                  frequencymap.put(result, 1); 
              }
           }
              } 
            //all integer values are associated and you want top 10
            LinkedList<Integer> l = new LinkedList<Integer>(frequencymap.values());
            Collections.sort(l);
            //System.out.println(l);
            //System.out.println(l.size() -1 );
            
            for (int i = l.size()-1 ; i > l.size()-11; i--) {
                int value = l.get(i);
                //System.out.println(value);
                    for (String key : frequencymap.keySet()) {
                        if (frequencymap.get(key) == value){
                            set.add(key);
                        }
                    }
            }
                
              
            return set;

            }
            
            }
    
 
            
