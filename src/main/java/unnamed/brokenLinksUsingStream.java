package unnamed;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class brokenLinksUsingStream {

    public static void main(String[] args) throws IOException {
        String url = "https://www.amazon.in/";
        WebDriver driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        driver.get(url);
//        List<WebElement> aTagList = driver.findElements(By.tagName("a"));
//        Long startTime = System.currentTimeMillis();
//        for (WebElement element: aTagList) {
//            String urlFromHref = element.getAttribute("href");
//            System.out.println(urlFromHref);
//            checkBrokenLinks(urlFromHref);
//        }
        Long startTime = System.currentTimeMillis();
        Map<Integer, List<String>> map = driver.findElements(By.xpath("//*[@href]")).stream()
                .map(e -> e.getAttribute("href"))
                .distinct()
                .collect(Collectors.groupingBy(brokenLinksUsingStream::checkBrokenLinks));

        System.out.println(map.get(400));
        Long endTime = System.currentTimeMillis();
        System.out.println("Time taken : " + (endTime-startTime));

        driver.quit();
    }

    private static int checkBrokenLinks(String url) {
        URL urlObject;
        HttpURLConnection httpURLConnection;
        int responsecode = 0;
        try {
            urlObject = new URL(url);
            httpURLConnection = (HttpURLConnection) urlObject.openConnection();
            httpURLConnection.setConnectTimeout(5000);
            httpURLConnection.connect();
            responsecode = httpURLConnection.getResponseCode();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return responsecode;
    }
}
