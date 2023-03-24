package Lab.Lab5.Task5;

//5.Напишите метод, который инвертирует слова в строке.
// Предполагается, что в строке нет знаков препинания, и слова разделены пробелами.
public class Task55 {
    public static void main(String[] args) {
        String s = "метод который инвертирует слова в строке";
        System.out.println(s);
        System.out.println(reverseWordsInString(s));
    }

    public static StringBuilder reverseWordsInString(String s) {

        String[] words = s.split(" ");
        StringBuilder reverseWordsInString = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            char[] a = new char[words[i].length()];
            char[] b = new char[words[i].length()];
            for (int j = 0; j < words[i].length(); j++) {
                for (int n = 0; n < words[i].length(); n++) {
                    a[j] = words[i].charAt(j);
                    b[n] = a[words[i].length() - 1 - n];
                }
            }
            String reverseWord = new String(b);
            reverseWordsInString.append(reverseWord + " ");
        }
        return reverseWordsInString;
    }
}


