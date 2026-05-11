package ontrack;

public class TaskStatus {

    public String checkStatus(String studentId, String taskId) {

        if (studentId == null || taskId == null || studentId.isEmpty() || taskId.isEmpty()) {
            return "Invalid Student/Task";
        }

        if (studentId.equals("S101") && taskId.equals("9.1P")) {
            return "Marked Complete";
        }

        if (studentId.equals("S102") && taskId.equals("9.1P")) {
            return "Submitted";
        }

        return "Not Submitted";
    }

    public static void main(String[] args) {

        TaskStatus obj = new TaskStatus();

        System.out.println(obj.checkStatus("S101", "9.1P"));
    }
}