import static org.hamcrest.core.Is.is;
import org.junit.Test;
import static org.junit.Assert.assertThat;

public class ChallengeTest {
	@Test
	public void test1() {
		assertThat(Challenge.bucketize("she sells sea shells by the sea", 2), is(new String[]{}));
	}

	@Test
	public void test2() {
		assertThat(Challenge.bucketize("ab bc cd", 1), is(new String[]{}));            
	}

	@Test
	public void test3() {
		assertThat(Challenge.bucketize("she sells sea shells by the sea", 10), is(new String[]{"she sells", "sea shells", "by the sea"}));            
	}

	@Test
	public void test4() {
		assertThat(Challenge.bucketize("the mouse jumped over the cheese", 7), is(new String[]{"the", "mouse", "jumped", "over", "the", "cheese"}));            
	}

	@Test
	public void test5() {
		assertThat(Challenge.bucketize("fairy dust coated the air", 20), is(new String[]{"fairy dust coated", "the air"}));            
	}

	@Test
	public void test6() {
		assertThat(Challenge.bucketize("do the hokey pokey", 6), is(new String[]{"do the", "hokey", "pokey"}));            
	}

	@Test
	public void test7() {
		assertThat(Challenge.bucketize("do the hokey pokey", 12), is(new String[]{"do the hokey", "pokey"}));            
	}

	@Test
	public void test8() {
		assertThat(Challenge.bucketize("rich magnificent trees dotted the landscape", 12), is(new String[]{"rich", "magnificent", "trees dotted", "the", "landscape"}));            
	}

	@Test
	public void test9() {
		assertThat(Challenge.bucketize("rich magnificent trees dotted the landscape", 15), is(new String[]{"rich", "magnificent", "trees dotted", "the landscape"}));            
	}

	@Test
	public void test10() {
		assertThat(Challenge.bucketize("rich magnificent trees dotted the landscape", 18), is(new String[]{"rich magnificent", "trees dotted the", "landscape"}));            
	}

	@Test
	public void test11() {
		assertThat(Challenge.bucketize("rich magnificent trees dotted the landscape", 22), is(new String[]{"rich magnificent trees", "dotted the landscape"}));            
	}

	@Test
	public void test12() {
		assertThat(Challenge.bucketize("rich magnificent trees dotted the landscape", 40), is(new String[]{"rich magnificent trees dotted the", "landscape"}));            
	}

	@Test
	public void test13() {
		assertThat(Challenge.bucketize("rich magnificent trees dotted the landscape", 43), is(new String[]{"rich magnificent trees dotted the landscape"}));            
	}

	@Test
	public void test14() {
		assertThat(Challenge.bucketize("beep bo bee bop bee bo bo bop", 6), is(new String[]{"beep", "bo bee", "bop", "bee bo", "bo bop"}));            
	}

	@Test
	public void test15() {
		assertThat(Challenge.bucketize("beep bo bee bop bee bo bo bop", 10), is(new String[]{"beep bo", "bee bop", "bee bo bo", "bop"}));            
	}

	@Test
	public void test16() {
		assertThat(Challenge.bucketize("a b c d e", 3), is(new String[]{"a b", "c d", "e"}));            
	}

	@Test
	public void test17() {
		assertThat(Challenge.bucketize("a b c d e", 2), is(new String[]{"a", "b", "c", "d", "e"}));            
	}

	@Test
	public void test18() {
		assertThat(Challenge.bucketize("a b c d e", 1), is(new String[]{"a", "b", "c", "d", "e"}));            
	}

	@Test
	public void test19() {
		assertThat(Challenge.bucketize("a b c d e", 2), is(new String[]{"a", "b", "c", "d", "e"}));            
	}

	@Test
	public void test20() {
		assertThat(Challenge.bucketize("a b c d e", 1), is(new String[]{"a", "b", "c", "d", "e"}));            
	}
}
