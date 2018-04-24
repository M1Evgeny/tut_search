package by.htp.tut.util;

import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by User on 25.04.2018.
 */
public class SearchUtil {

    private Date date = new Date();
    private String filePath = "src/test/resources/SearchResult.txt";
    private String regexp = "([—с]пециалист по ([а-€a-z]*)? ?тестированию)";

    public SearchUtil(){
    }

    public  void getResult(List<WebElement> searchResults){
        resultOutPut(getSearchCount(searchResults));
    }

    private int getSearchCount(List<WebElement> searchResults){
        int count = 0;
        for (WebElement job : searchResults) {
            Matcher m = Pattern.compile(regexp).matcher(job.getText());
            if (m.find()) {
                count++;
            }
        }
        return count;
    }

    private void resultOutPut(int count){
        String info = String.format("%s found %s", DateFormat.getDateTimeInstance().format(date), count);
        try {
            Files.write(Paths.get(filePath), (info + "\n").getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
