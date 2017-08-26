import java.io.*;
import java.util.StringTokenizer;

/**
 *
 * @author Yooyii
 */
public class FileAdditiveInverse {

    
  public static void main(String[] args) throws IOException {
     FileReader reader = null;
     BufferedReader input = null;
     PrintWriter out = null;
      try{
	reader = new FileReader(args[0]);
        input = new BufferedReader(reader);
	FileWriter writer = new FileWriter(args[1]);
	out = new PrintWriter(writer);
        int inverse = 0 ;
        while(true){
            String str = input.readLine();
            if(str == null)break;
            StringTokenizer tokenizer= new StringTokenizer(str);
            while(tokenizer.hasMoreTokens()){
                String token = tokenizer.nextToken();
                inverse = -1 * Integer.parseInt(token);
		out.print(inverse + " ");
            }
		out.println();
        }
     }finally{
	if(input != null)input.close();
	if(out != null)out.close();
	}
        
   }
    
}
