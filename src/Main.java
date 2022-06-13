import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Add("/n,");
    }
    public static int Add(String numbers) {
        if (!numbers.isEmpty()) {
            String delimiter = ",";
            if (numbers.startsWith("//")) {
                int separatorIndex = numbers.indexOf('\n');
                delimiter = numbers.substring(2, separatorIndex);
                numbers = numbers.substring(separatorIndex + 1);
            }
            int result = 0;
            ArrayList<String> numbersList = new ArrayList<>();
            for (String number : numbers.split(delimiter)) {
                numbersList.add(number);
            }
            for (String number : numbersList) {
                result += Integer.parseInt(number);
            }
            return result;
        }
        return 0;
    }
}