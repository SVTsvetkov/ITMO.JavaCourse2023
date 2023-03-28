package Lab.Lab5.Task3;

//3.Напишите метод, заменяющий в тексте все вхождения слова «бяка» на «[вырезано цензурой]».
public class Task53 {
    public static void main(String[] args) {
        String s = "метод, заменяющий в тексте все вхождения слова «бяка» на «[вырезано цензурой]»";
        replace(s,"«бяка»", "[вырезано цензурой]");
    }
    public static void replace(String s, String strToFind, String strToReplace) {
        String replaced = s.replaceAll(strToFind, strToReplace);
        System.out.println(replaced);
    }
}

