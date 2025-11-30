import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;

public class TaskManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();

        System.out.println("--- Java 极简任务管理器 ---");

        while (true) {
            System.out.println("\n1. 添加任务");
            System.out.println("2. 查看任务");
            System.out.println("3. 退出");
            System.out.print("请输入选项: ");

            String choice = scanner.nextLine();

            if (choice.equals("1")) {
                System.out.print("请输入任务内容: ");
                String task = scanner.nextLine();
                String date = LocalDate.now().toString();
                tasks.add("[" + date + "] " + task);
                System.out.println("任务已添加！");
            } else if (choice.equals("2")) {
                System.out.println("\n当前任务列表:");
                for (String t : tasks) {
                    System.out.println(t);
                }
                System.out.println("----------------");
            } else if (choice.equals("3")) {
                System.out.println("再见！");
                break;
            } else {
                System.out.println("无效输入，请重试。");
            }
        }
        scanner.close();
    }
}
// Dev branch feature update
