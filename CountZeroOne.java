import java.io.*;
import java.util.*;

/**
 *
 * @author Yooyii
 */
public class CountZeroOne {
    public static void main(String[] args) throws IOException {
     FileReader reader = null;
     Scanner sc = null;
     //BufferedReader input = null;
     PrintWriter out = null;
      try{
	reader = new FileReader(args[0]);
        sc = new Scanner(reader);
        //input = new BufferedReader(reader);
        //int zero = 0;
        //int one = 0;
        FileWriter writer = new FileWriter(args[1]);
	out = new PrintWriter(writer);
        while(sc.hasNextLine()){
            int count_zero = 0;
            int count_one = 0;
            String str = sc.nextLine();
            for(int i = 0;i<str.length();i++){
                if(str.charAt(i) == '0') {count_zero++;}
                else if(str.charAt(i) == '1') {count_one++;}
            }
            out.println(count_zero + " " + count_one );
        }
    }finally{
	if(sc != null)sc.close();
	if(out != null)out.close();
     }        
  }
}
