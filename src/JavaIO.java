import java.io.BufferedWriter;
import java.io.FileWriter;

public class JavaIO {
    //Yksittäisen stringin tallennus.
    public void saveString(String filePath, String stringToSave)
    {
        try 
        {
            BufferedWriter bw = 
                    new BufferedWriter(new FileWriter(filePath));         
            bw.write(stringToSave);
            bw.close();
            
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
    }
    // String-arrayn tallennus
    public void saveString(String filePath, String stringToSave[])
    {
        try 
        {
            BufferedWriter bw = 
                    new BufferedWriter(new FileWriter(filePath));
            for (int i = 0; i < stringToSave.length; i++)
            {            
                bw.write(stringToSave[i]);
                bw.close();
            }
            
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
    }
    
    

}