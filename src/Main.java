//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int suma = 0;
        int max = 100;

        for (int i = 1; i <= max; i++) {
            if ((i & 1) == 0) {
                suma += i;
            };
        }
        System.out.println();
        System.out.printf("Suma parnih brojeva od 1 do %d je = %d\n", max, suma);
    }
}