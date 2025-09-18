 class Task{
        int userId;
        int taskId;
        int priority;
        Task(int a,int b,int c){
            userId=a;
            taskId=b;
            priority=c;
        }
    }
class TaskManager {
   
     private Map<Integer, Task> taskMap;
    private PriorityQueue<Task> maxHeap;

    public TaskManager(List<List<Integer>> tasks) {
        taskMap = new HashMap<>();
        maxHeap = new PriorityQueue<>((a, b) -> {
            if (a.priority != b.priority) {
                return Integer.compare(b.priority, a.priority); 
            } else {
                return Integer.compare(b.taskId, a.taskId); 
            }
        });
        for (List<Integer> task : tasks) {
            int userId = task.get(0);
            int taskId = task.get(1);
            int priority = task.get(2);
            add(userId, taskId, priority);
        }
    }

    public void add(int userId, int taskId, int priority) {
        Task newTask = new Task(userId, taskId, priority);
        taskMap.put(taskId, newTask);
        maxHeap.offer(newTask);
    }

    public void edit(int taskId, int newPriority) {
        Task task = taskMap.get(taskId);
        Task updatedTask = new Task(task.userId, taskId, newPriority);
        taskMap.put(taskId, updatedTask);
        maxHeap.offer(updatedTask);
    }

    public void rmv(int taskId) {
        taskMap.remove(taskId);
    }

    public int execTop() {
        while (!maxHeap.isEmpty()) {
            Task candidate = maxHeap.poll();
            if (taskMap.containsKey(candidate.taskId)) {
                Task current = taskMap.get(candidate.taskId);
                if (current.priority == candidate.priority) {
                    taskMap.remove(candidate.taskId);
                    return current.userId;
                }
            }
        }
        return -1;
    }
}

/**
 * Your TaskManager object will be instantiated and called as such:
 * TaskManager obj = new TaskManager(tasks);
 * obj.add(userId,taskId,priority);
 * obj.edit(taskId,newPriority);
 * obj.rmv(taskId);
 * int param_4 = obj.execTop();
 */