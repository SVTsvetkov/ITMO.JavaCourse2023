package Lab.Lab5.Task4;

//4.Имеются две строки. Найти количество вхождений одной в другую.
public class Task54 {
    public static void main(String[] args) {
        String s1 = "TWO STRINGS", s2 = "ONE";
        System.out.println(countSub(s1, s2));
    }

    public static int countSub(String s1, String s2) {
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            String s11 = "";
            char[] s12 = s1.toCharArray();
            for (int j = i; j < s1.length(); j++) {
                s11 = s11 + s12[j];
                if (s2.indexOf(s11) != -1)
                    count++;
            }
        }
        return count;
    }
}
