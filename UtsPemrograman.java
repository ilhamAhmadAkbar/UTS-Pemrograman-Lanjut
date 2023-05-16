import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UtsPemrograman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka, pisahkan dengan spasi : ");
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");

        boolean angka = checkForDuplicates(numbers);
        System.out.println( angka);
    }
    private static boolean checkForDuplicates(String[] numbers) {
        boolean angka = false;
        Map<String, Integer> numberCount = new HashMap<>();

        for (String number : numbers) {
            if (numberCount.containsKey(number)) {
                int count = numberCount.get(number);
                numberCount.put(number, count + 1);
                angka = true;
            } else {
                numberCount.put(number, 1);
            }
        }
        if (angka) {
            System.out.println("Daftar angka yang sama serta jumlahnya : ");
            for (Map.Entry<String, Integer> entry : numberCount.entrySet()) {
                if (entry.getValue() > 1) {
                    System.out.println(entry.getKey() + " ada " + entry.getValue());
                }
            }
        }
        return angka;
    }
}