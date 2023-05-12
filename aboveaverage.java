import java.util.Scanner;
import java.util.Vector;

public class aboveaverage {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int rep = scanner.nextInt();
        for (int j = 0; j < rep; j++){
            float n;
            float count = 0;
            if (scanner.hasNextInt()){
                n = scanner.nextInt();
                Vector<Integer> nums = new Vector<>();
                for (int i = 0; i < n; i++){
                    int num = scanner.nextInt();
                    nums.add(num);
                }
                int sum = 0;
                for (Integer num : nums)
                    sum += num;
                for (int i = 0; i < n; i++){
                    if (nums.get(i) > sum/n)
                        count ++;
                }
                float avg = (count / n) * 100;
                String Avg = String.format("%.03f", avg);
                System.out.println(Avg + "%");
                nums.clear();
            }
        }
        scanner.close();
    }
}
