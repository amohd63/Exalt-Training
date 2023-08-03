public class Book implements BookInterface {
    private String content;
    private int numOfChapters;
    private int numOfPages;

    public Book() {
    }

    public Book(String content, int numOfChapters, int numOfPages) {
        this.content = content;
        this.numOfChapters = numOfChapters;
        this.numOfPages = numOfPages;
    }

    @Override
    public String getContent() {
        return this.content;
    }

    @Override
    public int getNumOfChapters() {
        return this.numOfChapters;
    }

    @Override
    public int getNumOfPages() {
        return this.numOfPages;
    }
}
