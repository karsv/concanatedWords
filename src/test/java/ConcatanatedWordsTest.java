import com.task.model.WordsResult;
import com.task.util.ConcatanatedWords;
import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class ConcatanatedWordsTest {

    @Test
    public void sizeTest() {
        List<String> list = new ArrayList<>();
        list.add("cat");
        list.add("cats");
        list.add("catsdogcats");
        list.add("dog");
        list.add("hippopotamuses");
        list.add("rat");
        list.add("ratcatdogcat");
        list.add("dogcatsdog");
        ConcatanatedWords concatanatedWords = new ConcatanatedWords();
        WordsResult result = concatanatedWords.getResultOfConcatenatedWords(list);
        Assert.assertEquals("The longest concatenated word expected: ratcatdogcat" +
                        "But is: " + result.getFirstLongestWord(),
                "ratcatdogcat", result.getFirstLongestWord());
        Assert.assertEquals("The second longest concatenated word expected: catsdogcats" +
                        "But is: " + result.getSecondLongestWord(),
                "catsdogcats", result.getSecondLongestWord());
        Assert.assertEquals("The total count of all the concatenated words is: 3" +
                        "But got: " + result.getQuantityOfWords(),
                3, result.getQuantityOfWords());
    }
}
