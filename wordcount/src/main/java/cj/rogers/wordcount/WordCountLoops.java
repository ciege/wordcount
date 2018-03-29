/**
 * 
 */
package cj.rogers.wordcount;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * @author CJ
 *
 */
public class WordCountLoops {

	private Map<String, Integer> wordCountMap = new HashMap<String, Integer>();

	public Map<String, Integer> wordCount(String wordStringList) {
		if(wordStringList == null || wordStringList.isEmpty())
			return wordCountMap;
		String[] wordArray = wordStringList.trim().split("\\s+");
		List<String> wordList = Arrays.asList(wordArray);
		for (Iterator<String> iterator = wordList.iterator(); iterator.hasNext();) {
			String word = iterator.next();
			if (wordCountMap.containsKey(word)) {
				Integer count = wordCountMap.get(word);
				wordCountMap.put(word, count + 1);
			} else {
				wordCountMap.put(word, 1);
			}
		}
		return wordCountMap;
	}
}
