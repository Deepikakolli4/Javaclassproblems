public class RomanNumbersToInt {
    public static void main(String[] args) {
        String input = "XIV";
        int result = covertToInt(input);
        System.out.println(result);
    }
    public static int covertToInt(String input){
        int prev=0;
        int total=0;
        for(int i = input.length()-1;i>=0;i--){
            char roman = input.charAt(i);
            int value = getValue(roman);
            if(value<prev){
                total=total-1;
            }else{
                total=total+value;
            }
            prev=value;
        }
        return total;
    }
    public static int getValue(char roman){
        switch (roman) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}
