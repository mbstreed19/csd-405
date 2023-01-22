import java.util.ArrayList;
import java.util.Scanner;

class streedArrayListTest {

    public static Integer max(ArrayList<Integer> list) {
        if (list.isEmpty()) {
            return 0;
        }
        int max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integers, enter 0 to stop:");
        int input = scanner.nextInt();
        while (input != 0) {
            list.add(input);
            input = scanner.nextInt();
        }
        list.add(input);
        System.out.println("Largest value in the ArrayList: " + max(list));
    }
}
