import analyze.SentimentAna;

/**
 * Created by Benjamin on 15/5/4.
 */
public class SentimentAnaTestDrive {
    public static void main(String[] args) {
        SentimentAna test = new SentimentAna();
        System.out.println(test.findSentiment("This film is interesting"));
    }
}
