public class TaskTest {

    public static void main(String[] args) {

        TaskLinkedList list = new TaskLinkedList();

        list.addTask(1, "Coding", "Pending");
        list.addTask(2, "Testing", "Completed");
        list.addTask(3, "Review", "Pending");

        System.out.println("All Tasks");
        list.displayTasks();

        System.out.println("\nSearch Task");
        list.searchTask(2);

        list.deleteTask(2);

        System.out.println("\nAfter Deletion");
        list.displayTasks();
    }
}