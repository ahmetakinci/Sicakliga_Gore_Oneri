import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int heat;

        System.out.print("Sıcaklığı Giriniz: ");
        heat = scanner.nextInt();

        if (heat > 45) {
            System.out.println("Hava çok sıcak evde kalmanız önerilir...");

        } else if (heat >= 25) {
            System.out.println("Yüzmeye gidebilirsiniz");

        } else if (heat >= 15) {
            System.out.println("Pikniğe gidebilirsiniz");

        } else if (heat >= 5) {
            System.out.println("Sinemaya gidebilirsiniz");

        } else {
            System.out.println("Kayak yapmaya gidebilirsiniz");
        }
    }
}
