/**
 * 
 */
package cj.rogers.wordcount;

import static org.junit.Assert.*;

import java.util.Map;

import org.junit.Test;

/**
 * @author CJ
 *
 */
public class WordCountStreamingTest {

	/**
	 * Test method for {@link cj.rogers.wordcount.WordCountStreaming#wordCount(java.lang.String)}.
	 */
	@Test
	public void testWordCount() {
		String wordStringList = "one two three";
		WordCountStreaming wordCountStreaming = new WordCountStreaming();
		Map<String, Long> wordCountMap = wordCountStreaming.wordCount(wordStringList);
		assertNotNull(wordCountMap); 
		assertEquals(3, wordCountMap.size());
		assertTrue(wordCountMap.get("one").equals(1l));
		assertTrue(wordCountMap.get("two").equals(1l));
		assertTrue(wordCountMap.get("three").equals(1l));
	}

	/**
	 * Test method for {@link cj.rogers.wordcount.WordCountStreaming#wordCount(java.lang.String)}.
	 */
	@Test
	public void testWordCountNull() {
		String wordStringList = null;
		WordCountStreaming wordCountStreaming = new WordCountStreaming();
		Map<String, Long> wordCountMap = wordCountStreaming.wordCount(wordStringList);
		assertNotNull(wordCountMap); 
		assertEquals(0, wordCountMap.size());
	}

	/**
	 * Test method for {@link cj.rogers.wordcount.WordCountStreaming#wordCount(java.lang.String)}.
	 */
	@Test
	public void testWordCountEmpty() {
		String wordStringList = "";
		WordCountStreaming wordCountStreaming = new WordCountStreaming();
		Map<String, Long> wordCountMap = wordCountStreaming.wordCount(wordStringList);
		assertNotNull(wordCountMap); 
		assertEquals(0, wordCountMap.size());
	}

	/**
	 * Test method for {@link cj.rogers.wordcount.WordCountStreaming#wordCount(java.lang.String)}.
	 */
	@Test
	public void testWordCountMoreThanOne() {
		String wordStringList = "one two three two three three";
		WordCountStreaming wordCountStreaming = new WordCountStreaming();
		Map<String, Long> wordCountMap = wordCountStreaming.wordCount(wordStringList);
		assertNotNull(wordCountMap); 
		assertEquals(3, wordCountMap.size());
		assertTrue(wordCountMap.get("one").equals(1l));
		assertTrue(wordCountMap.get("two").equals(2l));
		assertTrue(wordCountMap.get("three").equals(3l));
	}

	/**
	 * Test method for {@link cj.rogers.wordcount.WordCountStreaming#wordCount(java.lang.String)}.
	 */
	@Test
	public void testWordCountMoreThanOneWithExtraSpaces() {
		String wordStringList = "one two  three   two    three three";
		WordCountStreaming wordCountStreaming = new WordCountStreaming();
		Map<String, Long> wordCountMap = wordCountStreaming.wordCount(wordStringList);
		assertNotNull(wordCountMap); 
		assertEquals(3, wordCountMap.size());
		assertTrue(wordCountMap.get("one").equals(1l));
		assertTrue(wordCountMap.get("two").equals(2l));
		assertTrue(wordCountMap.get("three").equals(3l));
	}

	/**
	 * Test method for {@link cj.rogers.wordcount.WordCountStreaming#wordCount(java.lang.String)}.
	 */
	@Test
	public void testWordCountMoreThanOneWithExtraLeadingTrailingSpaces() {
		String wordStringList = "   one two  three   two    three three    ";
		WordCountStreaming wordCountStreaming = new WordCountStreaming();
		Map<String, Long> wordCountMap = wordCountStreaming.wordCount(wordStringList);
		assertNotNull(wordCountMap); 
		assertEquals(3, wordCountMap.size());
		assertTrue(wordCountMap.get("one").equals(1l));
		assertTrue(wordCountMap.get("two").equals(2l));
		assertTrue(wordCountMap.get("three").equals(3l));
	}


}
