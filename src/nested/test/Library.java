package nested.test;

public class Library {
    private Book[] books;
    private int bookCount;

    public Library(int size) {
      books = new Book[size];
        bookCount = 0;
    }

    public void addBook(String title, String author) {
        //검증 로직을 다 처리하고
        if(bookCount < books.length) {
            books[bookCount++] = new Book(title, author);
        }else{
            System.out.println("The book already exists");
        }

    }

    public void showBooks() {
        System.out.println("== 책 목록 출력 ==");
        for (int i = 0; i < bookCount; i++) {
            System.out.println("도서제목 : " +books[i].title + "저자: " + books[i].author);
        }
    }


    //외부에서 사용하지못하도록
    private static class Book{
        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }
    }

}
