// package com.cbfacademy;

// public class RetrievingJsonData {

//     public static List<Employee> readFile(String filePath) throws FilenameException {
//         List<Employee> = new ArrayList<>();

//         try (FileReader reader = new FileReader(filePath)){
//             List<Employee> fileEmployees = new Gson().fromJson(reader, new TypeToken<List<Employee>>(){}.getType());
//             if (fileEmployees != null) {
//                 employees = fileEmployees;
//             }            
//         }
//         catch (IOException e) {
//             e.printStackTrace();
            
//         }

//         return employees;

//     }

// }

// the readFile() method above reads JSON data from a file and prints it to the screen using the Gson library