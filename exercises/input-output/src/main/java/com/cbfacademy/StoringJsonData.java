// package com.cbfacademy;

// public class StoringJsonData {

//     public static void save (Employee employee, String outputFile) throws FilenameException {
//         List <Employee> employees;

//         try (FileWriter writer = new FileWriter(outputFile)) {
//             employees = readFile (outputFile);
//             employees.add(employee);
//             new GsonBuilder().setPrettyPrinting().create().toJson(employees, writer);
//             System.out.println("Data saved to file: " + outputFile);
//         }

//         catch (IOException e) {
//             e.printStackTrace();
//         }

//     }

// }


// the save() method above saves the given Eployee to a file using the Gson library