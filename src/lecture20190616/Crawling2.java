package lecture20190616;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class Crawling2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				String ur1 = "https://comic.naver.com/index.nhn";
				Document doc = null;
				
				try {
					doc = Jsoup.connect(ur1).get();
				} catch (IOException e) {
					e.printStackTrace();
				}
				Elements element = doc.select("div.asideBox");
				
				String title = element.select("h4").text().substring(0, 4);
				System.out.println("===========================================");
				System.out.println(title);
				System.out.println("===========================================");
				
				for(Element el : element.select("li")) {
					System.out.println(el.text());
			
				}
				System.out.println("===========================================");


	}

}
