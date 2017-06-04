import java.io.FileReader;  
public class file {  
    public static void main(String args[])throws Exception{    
          FileReader fr=new FileReader("E:\\sample.txt");    
          int i;    
          while((i=fr.read())!=-1)    
          System.out.print((char)i);    
          fr.close();    
    }    
}    