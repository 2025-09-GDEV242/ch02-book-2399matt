/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author Matt Witham  
 * @version 9.15.25
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private String refNumber;
    private int pages;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int pages)
    {
        author = bookAuthor;
        title = bookTitle;
        this.pages = pages;
        refNumber = "";
    }
    
    /**
     * Method to retrieve the author of the book.
     */
    public String getAuthor(){
        return author;
    }
    
    /**
     * Method to retrieve the title of the book.
     */
    public String getTitle(){
        return title;
    }
    
    /**
     * Method to retrieve the reference number of the book.
     */
    public String getRefNumber(){
        return refNumber;
    }
    
    /**
     * Method to retrieve the amount of pages in the book.
     */
    public int getPages(){
        return pages;
    }
    
    /**
     * Method to set the reference number of the book.
     */
    public void setRefNumber(String refNumber){
        if(refNumber.length() < 3){
            System.out.println("Reference number must be at least 3 characters.");
        }else{
            this.refNumber = refNumber;
        }
    }
    
    /**
     * Method to print the author of the book.
     */
    public void printAuthor(){
        System.out.printf("%s", author);
    }
    
    /**
     * Method to print the title of the book.
     */
    public void printTitle(){
        System.out.printf("%s", title);
    }
    
    /**
     * Method to print the details of the book.
     * -------
     * Title:
     * Author:
     * Pages:
     * -------
     */
    public void printDetails(){
        System.out.printf("Title: %s\nAuthor: %s\nPages: %d\nReference Number: %s\n"
        , title, author, pages, (refNumber.length() == 0) ? "ZZZ" : refNumber);
    }

    // Add the methods here ...
}
