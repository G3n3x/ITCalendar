import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class ITCalendar {
    public static void main(String[] args) throws IOException {

        String html = "https://en.wikipedia.org/";

        String butNextID = "navForward1";
        String tableContainerID = "mvEventContainer2";
        String divClassDetail = "bubbleContent:1";
        Document doc = (Document) Jsoup.connect(html).get();

        //ottieni le row per i mesi, dentro alla row ci sono due righe
        //una per il numero del giorno e l'altra con dentro un "link"
        //per aprire un bubble content con dentro i dati

        System.out.println(doc.toString());
        Element table = doc.getElementById(tableContainerID);
        Elements rows = table.getElementsByClass("month-row");
        for(Element element : rows){
            for(Element element2: element.getAllElements().get(1).getAllElements())
        }




    }
}
