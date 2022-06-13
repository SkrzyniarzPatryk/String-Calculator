import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

    }
    public static int Add(String numbers) throws Exception {
        if (!numbers.isEmpty()) {
            String delimiter = ",";
            if (numbers.startsWith("//")) {
                int separatorIndex = numbers.indexOf('\n');
                delimiter = numbers.substring(2, separatorIndex);
                numbers = numbers.substring(separatorIndex + 1);
            }
            int result = 0;
            ArrayList<String> numbersList = new ArrayList<>();
            ArrayList<String> negativeNumbersList = new ArrayList<>();
            for (String number : numbers.split(delimiter)) {
                numbersList.add(number);
            }
            for (String number : numbersList) {
                int intNumber = Integer.parseInt(number);
                if (intNumber < 0) {
                    negativeNumbersList.add(number);
                } else if (intNumber <= 1000){
                    result += intNumber;
                }
            }
            if (negativeNumbersList.size() > 0) {
                throw new Exception("negatives not allowed : " + negativeNumbersList);
            }
            return result;
        }
        return 0;
    }
}