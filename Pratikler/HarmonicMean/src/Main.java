//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double[] numbers = {1, 2, 3, 4, 5};

        double sum = 0;
        for (double number : numbers) {
            sum += (1 / number);
        }
        double harmonicMean = numbers.length / sum;
        System.out.println("Harmonic mean: " + harmonicMean);
    }
}
