import java.util.ArrayList;

public class TaskManager {
    private ArrayList<Student> students;
    private int nStud;

    public TaskManager(Student[] students){
        this.students = new ArrayList<Student>();
        for(int i = 0; i < students.length; i++){
            this.students.add(students[i]);
        }
        this.nStud = this.students.size();
    }

    public ArrayList<Student> getStudents() {
        ArrayList<Student> tempStudents = new ArrayList<Student>();
        for(int i = 0; i < students.size(); i++){
            tempStudents.add(students.get(i));
        }
        return tempStudents;
    }

    public int getnStud() {
        return nStud;
    }

    public int tasksCompleted(String name) {
        for(int i = 0; i < nStud; i++){
            if(students.get(i).getName().contains(name)) {
                return students.get(i).getNTasks();
            }
        }
        return 0;
    }

    public boolean addStudent(Student student) {
        for(int i = 0; i < students.size(); i++) {
            if(students.get(i).getName().contains(student.getName())){
                System.out.println("Student already added.");
                return false;
            }
        }
        this.students.add(student);
        this.nStud = students.size();
        return true;
    }

    public void increaseTasks(String name, int n) { 
        for(int i = 0; i < nStud; i++) {
            if(students.get(i).getName().contains(name)) {
                students.get(i).increaseTasks(n);
                break;
            }
        }
    }

    public String toString() {
        String s = "Total number of students: " + nStud + "\nStudents: \n";
        for(int i = 0; i < students.size(); i++){
            s += students.get(i).toString() + "\n";
        }
        return s;
    }
}
