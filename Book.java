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

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle)
    {
        author = bookAuthor;
        title = bookTitle;
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

    // Add the methods here ...
}
