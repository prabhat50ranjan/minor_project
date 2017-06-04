package source;


import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class FetchNews {

    public ArrayList<News> crawlNews() {
        ArrayList news = new ArrayList();
        try {
            Document doc = Jsoup.connect("http://www.moneycontrol.com/news/news-All.html").get();
            Elements ul = doc.select("ul.nws_listing");
            Elements li = ul.select("li");
            String nh = "", nd = "",ni="";
            for (Element l : li) {

                Elements a = l.select("a.nws_linkhd");
                for (Element newsHeading : a) {
                    nh = newsHeading.text();
                }
                Elements p = l.select("p.MT2");
                for (Element newsDescription : p) {
                    nd = newsDescription.text();
                }
                Elements imgSuperDiv = l.select("div.clearfix");
                for (Element isd : imgSuperDiv) {
                    Elements imgDiv = l.select("div.FL.MR10.PR");
                     for (Element id : imgDiv) {
                         Elements img = l.select("img");
                         for(Element i:img)
                         {
                             ni=i.attr("src");
//                            System.out.println(ni);
                         }
                     }
                }
                News n = new News(nh, nd,ni);
                news.add(n);
                System.out.println("---------------------------------------------------");
            }
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }
        return news;
    }
//    public static void main(String[] args) {
//     FetchNews fetchNews=new FetchNews();
//    ArrayList<News> news=fetchNews.crawlNews();
//    for(News n:news)
//    {
//        System.out.println(n.newsImage);
//        
//    }   
//    }
}
