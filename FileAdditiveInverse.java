
import java.io.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 *
 * @author Yooyii
 */
public class FileAdditiveInverse {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) throws IOException {
    try{
	FileReader reader = new FileReader(args[0]);
        BufferedReader input = new BufferedReader(reader);
	FileWriter writer = new FileWriter(args[1]);
	//PrintWriter out = new PrintWriter(writer);
        int inverse = 0 ;
        while(true){
            String str = input.readLine();
            if(str == null)break;
            StringTokenizertokenizer = new StringTokenizer(str);
            while(tokenizer.hasMoreTokens()){
                String token = tokenizer.nextToken();
                inverse = -1 * Integer.parseInt(token);
		writer.print(inverse + " ");
            }
		writer.println();
        }
     }finally{
	if(input != null)input.close();
	if(writer != null)writer.close();
	}
        
   }
    
}

