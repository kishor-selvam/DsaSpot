package Round2.Assignment.String;

public class RotationStringOrNot {
    public static void main(String[] args) {
        String str = "love";
        String checkStr = "velo";
        isRotation(str, checkStr);
    }

    static void isRotation(String str, String checkStr) {
        if (str == null || str.isEmpty() || checkStr.isEmpty()) {
            throw new IllegalArgumentException("Invalid Input");
        }
        if (str.length() != checkStr.length()) {
            System.out.println("Two strings are not Rotational String");
            return;
        }
        String newStr = str + str;
        int y = 0;
        for (int i = 0; i < newStr.length() - 1; i++) {
            if (y + 1 < checkStr.length() && newStr.charAt(i) == checkStr.charAt(y)) {
                y++;
            }
        }
        if (y == checkStr.length() - 1) {
            System.out.println("Two Strings are rotational strings");
        } else {
            System.out.println("not rotational strings");
        }

    }
}
