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
        StudentRegistration reg = new StudentRegistration();
        reg.addStudent("111", "Riya");
        reg.addStudent("112", "Aman");
        reg.addStudent("113", "Neha");
        reg.addStudent("114", "Raj");
        reg.addStudent("115", "Tina");

        System.out.println("\nFind Student 113: " + reg.findStudent("113"));
        System.out.println("Find Student 118: " + reg.findStudent("118"));
    }
}


