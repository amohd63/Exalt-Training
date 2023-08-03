public class BookProxy implements BookInterface {
    private Book book;
    private String role;

    public BookProxy(Book book, String role) {
        this.book = book;
        this.role = role;
    }

    @Override
    public String getContent() {
        if (!role.equals("admin")){
            return "Book is accessible from admins only.";
        }
        return book != null ? book.getContent() : null;
    }

    @Override
    public int getNumOfChapters() {
        if (!role.equals("admin")){
            System.out.println("Book is accessible from admins only.");
            return 0;
        }
        return book != null ? book.getNumOfChapters() : 0;
    }

    @Override
    public int getNumOfPages() {
        if (!role.equals("admin")){
            System.out.println("Book is accessible from admins only.");
            return 0;
        }
        return book != null ? book.getNumOfPages() : 0;
    }
}
