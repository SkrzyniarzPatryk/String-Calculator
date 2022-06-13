public class Main {
    public static void main(String[] args) {
    }
    public static int Add(String numbers) {
        if (!numbers.isEmpty()) {
            String[] numbersArray = numbers.split(",");
            switch (numbersArray.length) {
                case 1:
                    return Integer.parseInt(numbersArray[0]);
                case 2:
                    return Integer.parseInt(numbersArray[0]) + Integer.parseInt(numbersArray[1]);
            }
        }
        return 0;
    }
}