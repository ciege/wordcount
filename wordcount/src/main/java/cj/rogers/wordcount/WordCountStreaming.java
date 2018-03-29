/**
 * 
 */
package cj.rogers.wordcount;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author CJ
 *
 */
public class WordCountStreaming {
	public Map<String, Long> wordCount(String wordStringList) {

		if(wordStringList == null || wordStringList.isEmpty())
			return new HashMap<String,Long>();
		Map<String, Long> wordCountMap = Arrays.stream(wordStringList.trim().toLowerCase().split("\\s+"))
				.map(word -> new MapEntry(word, 1))
				.collect(groupingBy(MapEntry::getKey, counting()));
		return wordCountMap;

	}
	
	private class MapEntry implements Map.Entry<String, Integer>{
		private String key;
		private Integer count;
		public MapEntry(String key, Integer count){
			this.key = key;
			this.count = count;
		}

		@Override
		public String getKey() {
			return this.key;
		}

		@Override
		public Integer getValue() {
			return this.count;
		}

		@Override
		public Integer setValue(Integer value) {
			Integer oldCount = value;
			this.count = value;
			return oldCount;
		}
		
	}

}