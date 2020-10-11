import java.util.ArrayList;

public class TaskManager {
    private ArrayList<Student> students;
    private int nStud;

    public TaskManager(Student[] students){
        this.nStud = 0;
        this.students = new ArrayList<Student>();
        for(int i = 0; i < students.length; i++){
            this.students.add(students[i]);
            this.nStud ++;
        }
    }

    public String getStudents() {
        String s = "Studenter:";
        for(int i = 0; i < students.size(); i++){
            s += "\n" + students.get(i).getName();
        }
        return s;
    }

    public int getnStud() {
        return nStud;
    }

    public int tasksCompleted(String name) {
        int n = 0;
        for(int i = 0; i < nStud; i++){
            if(students.get(i).getName().contains(name)) {
                n = students.get(i).getNTasks();
                break;
            }
        }
        return n;
    }

    public boolean addStudent(Student student) {
        for(int i = 0; i < students.size(); i++) {
            if(students.get(i).getName().contains(student.getName())){
                return false;
            }
        }
        this.students.add(student);
        this.nStud ++;
        System.out.println("Student added.");
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

    public void print() {
        for(int i = 0; i < students.size(); i++){
            System.out.println(students.get(i).toString());
        }
    }
}
