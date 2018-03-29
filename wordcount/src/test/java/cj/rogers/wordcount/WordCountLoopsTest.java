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
public class WordCountLoopsTest {

	/**
	 * Test method for {@link cj.rogers.wordcount.WordCountLoops#wordCount(java.lang.String)}.
	 */
	@Test
	public void testWordCount() {
		String wordStringList = "one two three";
		WordCountLoops wordCountLoops = new WordCountLoops();
		Map<String, Integer> wordCountMap = wordCountLoops.wordCount(wordStringList);
		assertNotNull(wordCountMap); 
		assertEquals(3, wordCountMap.size());
		assertTrue(wordCountMap.get("one").equals(1));
		assertTrue(wordCountMap.get("two").equals(1));
		assertTrue(wordCountMap.get("three").equals(1));
	}

	/**
	 * Test method for {@link cj.rogers.wordcount.WordCountLoops#wordCount(java.lang.String)}.
	 */
	@Test
	public void testWordCountNull() {
		String wordStringList = null;
		WordCountLoops wordCountLoops = new WordCountLoops();
		Map<String, Integer> wordCountMap = wordCountLoops.wordCount(wordStringList);
		assertNotNull(wordCountMap); 
		assertEquals(0, wordCountMap.size());
	}

	/**
	 * Test method for {@link cj.rogers.wordcount.WordCountLoops#wordCount(java.lang.String)}.
	 */
	@Test
	public void testWordCountEmpty() {
		String wordStringList = "";
		WordCountLoops wordCountLoops = new WordCountLoops();
		Map<String, Integer> wordCountMap = wordCountLoops.wordCount(wordStringList);
		assertNotNull(wordCountMap); 
		assertEquals(0, wordCountMap.size());
	}

	/**
	 * Test method for {@link cj.rogers.wordcount.WordCountLoops#wordCount(java.lang.String)}.
	 */
	@Test
	public void testWordCountMoreThanOne() {
		String wordStringList = "one two three two three three";
		WordCountLoops wordCountLoops = new WordCountLoops();
		Map<String, Integer> wordCountMap = wordCountLoops.wordCount(wordStringList);
		assertNotNull(wordCountMap); 
		assertEquals(3, wordCountMap.size());
		assertTrue(wordCountMap.get("one").equals(1));
		assertTrue(wordCountMap.get("two").equals(2));
		assertTrue(wordCountMap.get("three").equals(3));
	}

	/**
	 * Test method for {@link cj.rogers.wordcount.WordCountLoops#wordCount(java.lang.String)}.
	 */
	@Test
	public void testWordCountMoreThanOneWithExtraSpaces() {
		String wordStringList = "one two  three   two    three three";
		WordCountLoops wordCountLoops = new WordCountLoops();
		Map<String, Integer> wordCountMap = wordCountLoops.wordCount(wordStringList);
		assertNotNull(wordCountMap); 
		assertEquals(3, wordCountMap.size());
		assertTrue(wordCountMap.get("one").equals(1));
		assertTrue(wordCountMap.get("two").equals(2));
		assertTrue(wordCountMap.get("three").equals(3));
	}

	/**
	 * Test method for {@link cj.rogers.wordcount.WordCountLoops#wordCount(java.lang.String)}.
	 */
	@Test
	public void testWordCountMoreThanOneWithExtraLeadingTrailingSpaces() {
		String wordStringList = "   one two  three   two    three three    ";
		WordCountLoops wordCountLoops = new WordCountLoops();
		Map<String, Integer> wordCountMap = wordCountLoops.wordCount(wordStringList);
		assertNotNull(wordCountMap); 
		assertEquals(3, wordCountMap.size());
		assertTrue(wordCountMap.get("one").equals(1));
		assertTrue(wordCountMap.get("two").equals(2));
		assertTrue(wordCountMap.get("three").equals(3));
	}


}
