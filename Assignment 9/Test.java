public class Test {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("Ida Klæstad");
        students[1] = new Student("Malin Edvartsen");
        students[2] = new Student("Alida Hjelljord");

        TaskManager taskManager = new TaskManager(students);

        taskManager.increaseTasks("Klæstad", 8);
        taskManager.increaseTasks("Edvartsen", 7);
        taskManager.increaseTasks("Hjelljord", 7);

        System.out.println("Malin has completed: " + taskManager.tasksCompleted("Edvartsen"));

        Student student = new Student("Tommy Renee");

        taskManager.addStudent(student);

        taskManager.increaseTasks("Renee", 1);

        System.out.println("\n\n\n" + taskManager.toString());
    }
}
