public class Main {
    public static void main(String[] args) {
        Add("/n,");
    }
    public static int Add(String numbers) {
        if (!numbers.isEmpty()) {
            String[] numbersArray = numbers.split(",");
            int result = 0;
            for (int i = 0; i < numbersArray.length; i++) {
                String[] numbersArrayNewLine = numbersArray[i].split("\n");
                if(numbersArrayNewLine.length > 1) {
                    for (String number : numbersArrayNewLine) {
                        result += Integer.parseInt(number);
                    }
                } else {
                    result += Integer.parseInt(numbersArray[i]);
                }
            }
            return result;
        }
        return 0;
    }
}