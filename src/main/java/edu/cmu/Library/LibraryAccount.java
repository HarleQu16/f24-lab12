package edu.cmu.Library;

public class LibraryAccount {
    private LibraryService libraryService;
 
    /**
     * Retrieves an array of checked out books associated with the specified user ID. If the user
     * has no books checked out, the returned list will be empty. Since multiple households may
     * share a single account, the user ID is of the form "libraryID:userName".
     * e.g., "12345:John Doe"
     *
     * @param libraryID the id of the library account
     * @param userName the ID of the user whose books are to be retrieved
     * @return an array of Book objects the user has checked out
     */
    public Book[] getBooks(String libraryID, String userName) {
        // String[] parts = userId.split(":");
        // String name = parts[0];
        // String id = parts[1];
        return libraryService.getBooks(libraryID, userName);        
    }
}
