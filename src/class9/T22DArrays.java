package class9;

public class T22DArrays {
    public static void main(String[] args) {


        String [][]students= {
                {"Ayesha", "Giulia", "John", "Deepali"},
                {"A", "A+", "C", "B"}
        };

        for (int i = 0; i <4 ; i++) {

            if(students[1][i].equals("A")||students[1][i].equals("B"))
            System.out.println(students[0][i]);



        }


        }
    }


    /*
    String[][] studentGrades = {
                    {"Alice", "Bob", "Charlie", "Dave"},
                    {"A", "B", "C", "A+"}
            };

            for (int i = 0; i < studentGrades[0].length; i++) {
                if (studentGrades[1][i].equals("A") || studentGrades[1][i].equals("B")) {
                    System.out.println(studentGrades[0][i]);
                }
            }
        }





        }
     */
