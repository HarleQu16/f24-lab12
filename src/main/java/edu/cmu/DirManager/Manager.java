package edu.cmu.DirManager;

public class Manager {
    private DirOps dirOps;
    
    /**
     * Creates a new directory at the specified path.
     *
     * @param path the path where the new directory should be created
     * @return true if the directory creation was successful
     *        false if the directory already exists,
     *        or if the path is invalid
     */
    public boolean newDirectory(String path) {
        if (dirOps.checkDirectoryExists(path)) {
            return false;
        } else if (!dirOps.checkPathValid(path)) {
            return false;
        } else {
            dirOps.createDirectory(path);
            return true;
        }
    }
}
