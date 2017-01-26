import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
/* To be added: Timed downloads and comparing with email sending, when difference has been spotted.
 * 
 * A program, which loads html from url and saves it to a .txt file. 
 */

public class JSoppa
{
    
    public void openStream(String url)
    {
        try 
        {
            Document doc = Jsoup.connect(url).get();
            String title = doc.title();                       
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
    }
    
}
