import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 *
 * @author Yooyii
 */
public class FindPrefixAvg {
    public static void main(String[] args) throws IOException {
     if (args.length != 2) {
            System.out.println("Usage: java FindPrefixAvg inputTextFile          				 	outputTextFile");
            System.exit(1);
        }     

     FileReader reader = null;
     BufferedReader input = null;
     PrintWriter out = null;
      try{
	reader = new FileReader(args[0]);
        input = new BufferedReader(reader);  
        FileWriter writer = new FileWriter(args[1]);
	out = new PrintWriter(writer);
	//double num;
        double sum = 0;
        int count = 1;
        while(true){
            String str = input.readLine();
            if(str == null)break;
            StringTokenizer tokenizer= new StringTokenizer(str);
            while(tokenizer.hasMoreTokens()){
                String token = tokenizer.nextToken();
                sum = sum + Double.parseDouble(token);
                //sum = sum + num;
                double avg = sum/count;
                count++;
                out.println(avg);
    }
            //out.println();
    }
}finally{
          if(input != null)input.close();
          if(out != null)out.close();
      }
    }
}

