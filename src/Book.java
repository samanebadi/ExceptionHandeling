public class Book {
    private String title;
    private int pageCount;

    public Book(String title, int pageCount) throws IllegalArgumentException
    {
        if(title == null || title.isEmpty())
        {
            throw new IllegalArgumentException("Title cannot be empty.");
        }
        else if(pageCount == 0 || pageCount<0)
        {
            throw new IllegalArgumentException("Page count must be positive.");
        }
        this.title = title;
        this.pageCount = pageCount;
    }
    public String getTitle()
    {
        return title;
    }
    public int getPageCount()
    {
        return pageCount;
    }
    @Override
    public String toString()
    {
       return title + " (" + pageCount + " pages) ";
    }
}
