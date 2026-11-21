public class Project2 {
    public static void main(String[] args) {
        double[] arr1 = { 1, 2, 3, 4, 5, 6 };
        double[][] arr2 = {
            { 4, 5, 7 },
            { 3, 7, 5, 6 },
            { 1, 9, 8 }
        };

        //שימוש בפעולות
        System.out.println(average(arr1));
        System.out.println(average(arr2));
        System.out.println(getCircleArea(5));
        System.out.println(isPalindrome("abcba"));
        System.out.println(isPrime(7));
        System.out.println(getDistance(1, 2, 6, 4));

    }

    //פעולה המקבלת מערך חד מימדי של מספרים ומחזירה את ממוצע כל ערכיו
    public static double average(double[] arr) {
        double total = 0;

        for (int i=0; i<arr.length; i++)
            total += arr[i];
            
        if (arr.length == 0)
            return 0;
        return total / arr.length;
    }

    //פעולה המקבלת מערך דו מימדי של מספרים ומחזירה את ממוצע כל ערכיו
    public static double average(double[][] arr) {
        double total = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            total += average(arr[i]) * arr[i].length;
            count += arr[i].length;
        }

        if (count == 0)
            return 0;
        return total / count;
    }

    //פעולה המקבלת רדיוס של מעגל ומחזירה את שטחו
    public static double getCircleArea(double radius) {
        if (radius < 0)
            return -1;
        return Math.PI * Math.pow(radius, 2);
    }

    //פעולה המקבלת מחרוזת ומחזירה true אם היא פלינדרום ו-false אחרת
    public static boolean isPalindrome(String str){
        String reversed = "";
        for (int i = str.length()-1; i > -1; i--) {
            reversed += str.charAt(i);
        }
        return reversed.equals(str);
    }

    //פעולה המקבלת מספר שלם ומחזירה true אם הוא ראשוני ו-false אחרת
    public static boolean isPrime(int p) {
        if (p < 2)
            return false;

        for (int i = 2; i < p; i++) {
            if (p % i == 0)
                return false;
        }

        return true;
    }

    //פעולה המקבלת שיעורים של שתי נקודות ומחזירה את המרחק ביניהן
    public static double getDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }

}