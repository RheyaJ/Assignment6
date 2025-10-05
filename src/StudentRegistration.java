import java.util.*;
public class StudentRegistration {
// Reason for choosing hashmap:
    //Fast insertion (O(1))
    //Fast search (O(1))
    //No duplicate (student IDs)
    private Map<String, String> st = new HashMap<>();

    public void addStudent(String id, String name) {
        if (st.containsKey(id)) {
            System.out.println("Student ID already exists: " + id);
        } else {
            st.put(id, name);
            System.out.println("Added student: " + name);
        }
    }

    public String findStudent(String id) {
        if(st.containsKey(id)){
            return st.get(id);
        }
        else
            return "No such ID found";
    }

    public static void main(String[] args) {
        StudentRegistration str = new StudentRegistration();
        str.addStudent("111", "Rheya");
        str.addStudent("112", "Siya");
        str.addStudent("113", "Diya");
        str.addStudent("114", "Jay");
        str.addStudent("115", "Adam");

        System.out.println("\nFind Student 113: " + str.findStudent("113"));
        System.out.println("Find Student 118: " + str.findStudent("118"));
    }
}


