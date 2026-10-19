import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap cac so nguyen: ");
        String line = sc.nextLine().trim();

        if (line.isEmpty()) {
            System.out.println("So phan tu: 0; Tong: 0");
            sc.close();
            return;
        }

        String[] parts = line.split("\\s+");
        int soPhanTu = parts.length;
        long tong = 0;

        for (int i = 0; i < soPhanTu; i++) {
            int so = Integer.parseInt(parts[i]);
            tong += so;
        }

        System.out.println("So phan tu: " + soPhanTu + "; Tong: " + tong);

        sc.close();
    }
}
