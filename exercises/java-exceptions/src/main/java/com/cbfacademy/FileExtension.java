/*
Create a class called FileExtension with the following methods:

boolean check(String filename)
Map<String, int> map(List<String> filenames)
The check method should:

    return true when the file extension is .java
    return false when the file extension is not .java
    throw a FilenameException when the file name is null or an empty string.
The map method should:

    check each provided file's extension and map the returned value as 1 if true or 0 if false.
    map -1 when an exception occurs
Example
For the following list of file names: Arrays.asList("App.java", "App.txt", null, "App.md"), the map method should return a map with the following entries:

{"App.java", 1},
{"App.txt", 0},
{null, -1},
{"App.md", 0}

*/


package com.cbfacademy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class FileExtension {

    /**
     * The check method checks a filename to verify if it has a .java extension
     * @param filename
     * @return true if the filename extension is .java; otherwise false
     * @throws FilenameException when the file name is null or an empty string.
     */
    public boolean check(String filename) throws FilenameException {
        if (filename == null || filename.isEmpty()) {
            throw new FilenameException("File name cannot be null or empty");
        }

        int dotIndex = filename.lastIndexOf('.');

        if (dotIndex != -1) {
            String extension = filename.substring(dotIndex);

            return extension.equals(".java");
        }

        return false;
    }


    /*the below method should check each provided file's extension and map the returned value as 1 if true or 0 if false
map -1 when an exception occurs */

/* Example

For the following list of file names: Arrays.asList("App.java", "App.txt", null, "App.md"), the map method should return a map with the following entries:

{"App.java", 1},
{"App.txt", 0},
{null, -1},
{"App.md", 0}
*/
    public Map<String, Integer> map(List<String> filenames) {
        Map<String, Integer> resultMap = new HashMap<>();

        for (String fileName : filenames) {
            try {
                boolean isJavaFile = this.check(fileName);
                
                resultMap.put(fileName, isJavaFile ? 1 : 0);
            } catch (FilenameException e) {
                resultMap.put(fileName, -1);
            }
        }

        return resultMap;
    }
}


// FileExtension fe = new FileExtension(..)

// split will split a string after a full stop into a separate array

