package day47_Pilymorphism_Continue;

public class EncapsulationReview {

    private String bookTitle;
    private final String publishedData;  //  since final keyword we cannot create setter

    public EncapsulationReview(String bookTitle, String publishedData) {
        setBookTitle(bookTitle);
        this.publishedData = publishedData;
    }

    public String getBookTitle() {
        if(bookTitle  ==  null){
            return "";
        }
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        if (bookTitle == null) {
            throw new RuntimeException(" Invalid book title " + bookTitle);
        }
        this.bookTitle = bookTitle;
    }

    public String getPublishedData() {
        return publishedData;
    }
}
