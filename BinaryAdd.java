public class BinaryAdd {

    public static String binarySum(String f, String s){
        // construct result string
        StringBuilder result = new StringBuilder();
        // we need carried variable to represent whether there is a carry-over in the binary sum
        boolean carried = false;

        char[] first = f.toCharArray();
        char[] second = s.toCharArray();
        int flength = first.length - 1;
        int slength = second.length - 1;

        /*
            inside this loop I traverse the arrays from right to left
            and calculating sum based on the variable "carried"
        */
        while (flength >= 0 || slength >= 0 || carried) {
            int sum = carried ? 1 : 0;

            if (flength >= 0) {
                sum += first[flength] - '0';
                flength--;
            }

            if (slength >= 0) {
                sum += second[slength] - '0';
                slength--;
            }

            result.insert(0, sum % 2);
            carried = sum >= 2;
        }

        // Remove leading zeros
        while (result.charAt(0) == '0' && result.length() > 0) {
            result.deleteCharAt(0);
        }

        return result.length() > 0 ? result.toString() : "0";
    }
    public static void main(String[] args){
        String fString = "1010";
        String sString = "1011";
        String result = binarySum(fString, sString);
        System.out.println("Binary Sum: " + result);
    }
}
