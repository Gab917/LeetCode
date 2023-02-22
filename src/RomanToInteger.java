class RomanToInteger {
    public int romanToInt(String s) {
        int result = 0;
        int prev = 0;
        for (int i = s.length()-1;i>=0;i--){
            int curr = romanToDecimal(s.charAt(i));

            if(curr >= prev){
                result += curr ;
            }
            else if (curr < prev){
                result -= curr;
            }
            prev = curr;
        }
        return result;

    }

    public int romanToDecimal(char c){ //
        switch (c){
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                throw new IllegalArgumentException("Invalid roman numeral: "+ c);
        }
    }
}