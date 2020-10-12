public class Student {
    private final String NAME;
    private int nTasks;

    public Student(String NAME){
        this.NAME = NAME;
        this.nTasks = 0;
    }

    public String getName() {
        return NAME;
    }

    public int getNTasks() {
        return nTasks;
    }

    public void increaseTasks(int n) {
        nTasks += n;
    }

    public String toString() {
        return "Student NAME: " + NAME + "\n    Number of tasks completed: " + nTasks;
    }   
}
