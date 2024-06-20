package class1.ex;

public class MovieReviewMain2 {
    public static void main(String[] args) {
        MovieReview[] reviews = new MovieReview[2];

        MovieReview inception = new MovieReview();
        inception.title = "인셉션";
        inception.review = "인생은무한";

        reviews[0] = inception;

        MovieReview abouttiome = new MovieReview();
        abouttiome.title = "어바웃타임";
        abouttiome.review = "시간";

        reviews[1] = abouttiome;

        for (MovieReview review : reviews) {
            System.out.println("");

        }
    }


}
