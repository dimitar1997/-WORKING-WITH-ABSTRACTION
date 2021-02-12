import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainPerson {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] input = scanner.nextLine().split("\\s+");
        Person person = null;
        List<Person> list = new ArrayList<>();
        while (!input[0].equals("Exit")){
            String name = input[1];
            if (input[0].equals("Create")){
                int age = Integer.parseInt(input[2]);
                double grade = Double.parseDouble(input[3]);
                person = new Person(name, age, grade);
                list.add(person);
            }else if (input[0].equals("Show")){

                checkName(list,name);
            }

            input = scanner.nextLine().split("\\s+");
        }
    }

    private static void checkName(List<Person> list, String name) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equals(name)){
                String gradeCommentary = commentary(list, i);
                System.out.printf("%s is %d years old. %s student.%n",
                        name, list.get(i).getAge(), gradeCommentary);
            }
        }

    }

    private static String commentary(List<Person> list, int i) {
        if (list.get(i).getGrade() >= 5.50){
            return "Excellent";
        }else {
            return "Average";
        }
    }


}
