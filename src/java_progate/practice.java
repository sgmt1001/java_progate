package java_progate;

public class practice {
	public static void main(String[] args) {
        int count = 1;
        int sum = 0;

        while (count <= 80) {
            sum += Math.pow(count, 4);
            count += 1;
        }
        System.out.println(sum);
    }
}
