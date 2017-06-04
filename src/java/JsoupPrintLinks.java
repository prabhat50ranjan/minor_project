
import java.io.IOException;  
import static java.lang.System.out;
import org.jsoup.Jsoup;  
import org.jsoup.nodes.Document;  
import org.jsoup.nodes.Element;  
import org.jsoup.select.Elements;  
public class JsoupPrintLinks {  
     public static void main( String[] args ) throws IOException{  
         try
         {
         //Document doc = Jsoup.connect("https://in.finance.yahoo.com/").get();
                  Document doc = Jsoup.connect("https://www.google.co.in/search?site=&source=hp&q=nifty+index&oq=nifty+&gs_l=hp.3.1.0i67k1l2j0i20k1j0i131k1j0i67k1l5j0i131k1.3433.7636.0.14315.13.11.1.1.1.0.212.1499.0j7j2.9.0....0...1c.1.64.hp..2.9.1181.0..0j0i131i67k1j35i39k1.KDkAoIqV4HY").get();

                     
                    // Element heading=doc.getElementById("166");
                    // Elements elems= doc.select("ul.Carousel-Slider >li >h3 >span");
                    Elements elems=doc.select("div._FOc >span._Rnb.fmob_pr.fac-l");
                     for(Element e:elems)
                     {
                         System.out.println(e.text());
                     
                     }
                      
           // Elements elems= doc.select("div.fleft >ul >li >p");
            //Elements elem=elems.select("div.btitle clearfix");
            //Elements elems=doc.select("div.fleft.btitle");
             
            //Elements ul=elems.select("ul >li > a");
           
//    
//                for(Element ll :elems)
//                {
//                   String txt=ll.attr("src");
//
//                   
//                   
//
//                   //System.out.println("txt is"+txt);
//                 //System.out.println(ll.attr("src"));
//                          //System.out.println(txt);
//
//               System.out.println(ll.html()); //get all elements inside div
//               System.out.println("====================");
//                }
         }catch(IOException ex) {
            System.out.println(ex.toString());
        }
            
            //Elements lll=elment.select("h1");

           // String txt=lll.text();
            //System.out.println(txt);
            
           /* for(Element abc:li)
            {
            Elements lix = abc.getElementsByTag("a"); // select all li from ul
            for (Element link : lix) {
  String linkHref = link.attr("href");
  System.out.println("linkHref");
  String linkText = link.text();
  System.out.println("linkText");  
}
            }
                  //Element ly=li.select("a[href]").first();
                  
                 
          
                    
            //String test=ly.attr("href");
            //System.out.println(test);
            //Elements ul = doc.select("ul.category >li a[href]");  
            //Elements li=ul.select("li");
            //Elements lll=li.select("a[href]");
           /*for (Element link :li) {  
                System.out.println("\nlink : " + link.attr("href"));  
                System.out.println("text : " + link.text());  
            }*/ 

} 
       
}  