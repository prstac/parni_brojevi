//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int suma = 0;
        int max = 100;
        int min = 1;
        int djelitelj = 2;

        for (int i = min; i <= max; i++) {
            if (i % djelitelj == 0) {
                suma += i;
            }
        }
        System.out.println();
        System.out.printf("Suma brojeva djeljivih s %d od %d do %d je = %d\n", djelitelj, min, max, suma);
    }
}