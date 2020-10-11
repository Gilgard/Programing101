public class Student {
    private String name;
    private int nTasks;

    public Student(String name){
        this.name = name;
        this.nTasks = 0;
    }

    public String getName() {
        return name;
    }

    public int getNTasks() {
        return nTasks;
    }

    public void increaseTasks(int n) {
        nTasks += n;
    }

    public String toString() {
        return "Student name: " + name + "\n    Number of tasks completed: " + nTasks;
    }   
}
