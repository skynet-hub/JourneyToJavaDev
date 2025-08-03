import java.util.*;

public class WordFrequencyCounter {

    public static void main(String[] args){
        String para = "Hi there Dave, How are you Dave, Mhmmmm there";
        System.out.println(countWords(para));
    }

    /**
     * This method takes a raw paragraph, sentence or phrase and splits it into words and counts how many times each word appears
     * @param paragraph This can be any paragraph, sentence or even a phrase
     * @return a key,value pair with key - words and the value - how many times the word appear
     */

    public static Map<String, Integer> countWords(String paragraph){
        //Using regex to remove all punctuations
        String cleanedParagraph = paragraph.replaceAll("\\p{Punct}", "");
        String[] words = cleanedParagraph.split(" "); // split the sentence or paragraph using space

        Set<String> uniqueWords = new HashSet<>(Arrays.asList(words));
        Map<String, Integer> wordCounts = new HashMap<>();
        List<String> wordList = Arrays.stream(words).toList();

        for (String word: uniqueWords){
            wordCounts.put(word, Collections.frequency(wordList, word));
        }
        return wordCounts;

    }

}
