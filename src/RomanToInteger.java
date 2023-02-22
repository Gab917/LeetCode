class RomanToInteger {
    public int romanToInt(String s) {
        int result = 0;
        int prev = 0;
        for (int i = s.length()-1;i>=0;i--){// Loop iterates from last index to first index (index 0)
            int curr = romanToDecimal(s.charAt(i));//Converts Roman numeral to Integer value

            if(curr >= prev){ //If current index value is greater than previous, adds current index to the result
                result += curr ;
            }
            else if (curr < prev){ //If current index value is less than previous, subtracts current index to the result
                result -= curr;
            }
            prev = curr; //Stores current value to prev value
        }
        return result;

    }

    public int romanToDecimal(char c){ //Helper method to convert character value of Roman numeral to Integer
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