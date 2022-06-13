public class Main {
    public static void main(String[] args) {
    }
    public static int Add(String numbers) {
        if (!numbers.isEmpty()) {
            String[] numbersArray = numbers.split(",");
            int result = 0;
            for (int i = 0; i < numbersArray.length; i++) {
                result += Integer.parseInt(numbersArray[i]);
            }
            return result;
        }
        return 0;
    }
}