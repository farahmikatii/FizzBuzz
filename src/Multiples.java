public class Multiples {
    public static void main(String[] args) {

        int k = 0;

        for (int i = 0; i < 1000; i+= 1){

            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            if (divisibleBy3 || divisibleBy5) {
                k += 1;
            }
        }
        System.out.println(k);

    }
}
