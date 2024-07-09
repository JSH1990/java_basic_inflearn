package ex2;

public class ShopMain {
    public static void main(String[] args) {
            Book book = new Book("JAVA", 10000, "han", "12345");
//        Album album = new Album("앨범1", 15000, "seo");
//        Movie movie = new Movie("영화1", 18000, "배우1");


        book.print();

        int sum = book.getPrice();
        System.out.println(sum);
//        movie.print();
    }
}
