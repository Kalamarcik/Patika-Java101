public class Main {
    public static void main(String[] args) {
        int[] array = {10, 20, 20, 10, 10, 20, 5, 20};

        boolean[] visited = new boolean[array.length];

        for (int i = 0; i < array.length; i++) {
            if (visited[i]) {
                continue;
            }

            int count = 1;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                    visited[j] = true;
                }
            }
            System.out.println(array[i] + " appears " + count + " times.");
        }
    }
}
