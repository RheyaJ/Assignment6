import java.util.PriorityQueue;
//Priority queue helps tasks/elements be processed based on priority
class Task implements Comparable<Task> {
    String name;
    int priority;

    public Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    @Override
    public int compareTo(Task other) {
        return Integer.compare(this.priority, other.priority);
    }

    @Override
    public String toString() {
        return name + " (Priority: " + priority + ")";
    }
}

class TaskManager {

    private PriorityQueue<Task> taskQueue = new PriorityQueue<>();

    public void addTask(Task task) {
        taskQueue.offer(task);
        System.out.println("Added: " + task);
    }

    public void processNextTask() {
        Task task = taskQueue.poll();
        if (task != null) {
            System.out.println("Processing: " + task);
        } else {
            System.out.println("No tasks remaining.");
        }
    }

    public static void main(String[] args) {
        TaskManager m = new TaskManager();
        m.addTask(new Task("Get ready", 3));
        m.addTask(new Task("Go for a walk", 1));
        m.addTask(new Task("Have breakfast", 4));
        m.addTask(new Task("Revise the chapters", 2));
        m.addTask(new Task("Leave to school", 5));

        System.out.println("\nProcessing Tasks by Priority:");
        for (int i = 0; i < 5; i++)
            m.processNextTask();
    }
}
