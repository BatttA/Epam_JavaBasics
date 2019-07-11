package Warmup2;

public class Exercises {
    // 1 - stringTimes
    public String stringTimes(String str, int n) {
        String a = "";
        for (int i = 0; i < n; i++) {
            a += str;
        }
        return a;
    }
    // 2 - frontTimes
    public String frontTimes(String str, int n) {
        int ln = 3;
        if (ln > str.length()) {
            ln = str.length();
        }
        String addStr = str.substring(0, ln);

        String frontStr = "";
        for (int i = 0; i < n; i++) {
            frontStr += addStr;
        }
        return frontStr;
    }
    // 3 - countXX
    int countXX(String str) {
        int count = 0;
        int n = str.length()-1;
        for (int i = 0; i < n; i++) {
            if (str.substring(i, i+2).equals("xx")){
                count++;
            }
        }
        return count;
    }
    // 4 - last2
    public int last2(String str) {
        if (str.length() < 2) {
            return 0;
        } else {
            String last = str.substring(str.length()-2);
            int count = 0;
            int n = str.length()-2;
            for (int  i= 0; i < n; i++) {
                String chckStr = str.substring(i, i+2);
                if (chckStr.equals(last)) {
                    count++;
                }
            }
            return count;
        }
    }
    // 5 - array123
    public boolean array123(int[] nums) {
        if(nums.length >= 3){
            for (int i = 0; i < (nums.length-2); i++) {
                if (nums[i]==1 && nums[i+1]==2 && nums[i+2]==3){
                    return true;
                }
            }
            return false;
        } else {
            return false;
        }
    }
    // 6 - stringX
    public String stringX(String str) {
        String newStr = "";
        for (int i=0; i<str.length(); i++) {
            if (!(i > 0 && i < (str.length()-1) && str.substring(i, i+1).equals("x"))) {
                newStr += str.substring(i, i+1);
            }
        }
        return newStr;
    }
    // 7 - arrayCount9
    public int arrayCount9(int[] nums) {
        int count = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 9) {
                count++;
            }
        }
        return count;
    }
    // 8 - array667
    public int array667(int[] nums) {
        int count = 0;
        int n = (nums.length-1);
        for (int i=0; i < n; i++) {
            if (nums[i] == 6) {
                if (nums[i+1] == 6 || nums[i+1] == 7) {
                    count++;
                }
            }
        }
        return count;
    }
}
