public class Main {
    public static void main(String[] args) {
        System.out.println(isStringPalindrome("Искать такси"));
        System.out.println(isStringPalindrome("Лидер бредил"));
        System.out.println(isStringPalindrome("А роза упала на лапу Азораff"));
        System.out.println(isStringPalindrome("Уж редкоуу рукою окурок держу"));
    }
    private static boolean isStringPalindrome(String string) {
        var chars = string.toLowerCase().toCharArray();
        var left = 0;
        var right = chars.length - 1;
        while (left < right) {
            if (chars[left] != chars[right]) {
                return false;
            }
            do {
                left++;
            } while (left < right && chars[left] == ' ');
            do {
                right--;
            } while (right > left && chars[right] == ' ');
        }
        return true;
    }
}