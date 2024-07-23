import java.util.ArrayList;
import java.util.List;

public class Challenge {
	public static String[] bucketize(String phrase, int n) {
        //bucketize("she sells sea shells by the sea", 10)
        //➞ ["she sells", "sea shells", "by the sea"]
        //String[] buckets = new String[]
        List<String> bucketList = new ArrayList<>();
        StringBuilder currentBucket = new StringBuilder();

        for (String word : phrase.split(" ")) {
            if (word.length() > n) {
                // If any word is too long to fit in a bucket, return an empty array
                return new String[0];
            }

            if (currentBucket.length() + word.length() + (currentBucket.length() == 0 ? 0 : 1) <= n) {
                // Add the word to the current bucket
                if (currentBucket.length() > 0) {
                    currentBucket.append(" ");
                }
                currentBucket.append(word);
            } else {
                // Start a new bucket
                bucketList.add(currentBucket.toString());
                currentBucket = new StringBuilder(word);
            }
        }

        if (currentBucket.length() > 0) {
            // Add the last bucket if it's not empty
            bucketList.add(currentBucket.toString());
        }
        System.out.println(bucketList);
        return bucketList.toArray(new String[0]);
	}

    public static void main(String[] args) throws Exception {
        bucketize("she sells sea shells by the sea", 10);
    }
}