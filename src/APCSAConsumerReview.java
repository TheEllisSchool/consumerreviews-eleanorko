
public class APCSAConsumerReview {

	public static void main(String[] args) {
		double value = Review.sentimentVal("breakable");
		System.out.println(value);

		double total = Review.totalSentiment(("src/SimpleReview.txt"));
		System.out.println("Total Sentiment: " + total);
		
		//double stars = Review.starRating(("src/SimpleReview.txt"));
		//System.out.println(stars + " star(s)");
		
		String fake = Review.fakeReview("src/SimpleReview2.txt");
		System.out.println(fake);
	}

}
 