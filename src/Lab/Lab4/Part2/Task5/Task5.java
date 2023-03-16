package Lab.Lab4.Part2.Task5;

import java.util.Arrays;

//5.	Заполните массив случайным числами и отсортируйте его. Используйте сортировку слиянием
public class Task5 {
    public static void main(String[] args) {

        int[] array = new int[8];
        System.out.print("Исходный массив:        ");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + " ");
        }
        int[] res = mergeSort(array);
        System.out.print("\nОтсортированный массив: ");
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }

    public static int[] mergeSort(int[] array) {
        int n = array.length;
        if (n < 2) {
            return array;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r;
        if (n % 2 == 0) {
            r = new int[mid];
        } else {
            r = new int[mid + 1];
        }
        for (int i = 0; i < l.length; i++) {
            l[i] = array[i];
        }
        for (int i = 0; i < r.length; i++) {
            r[i] = array[i + mid];
        }
        l = mergeSort(l);
        r = mergeSort(r);
        return merge(l, r);
    }

    public static int[] merge(int[] l, int[] r) {
        int[] res = new int[l.length + r.length];
        int left = l.length;
        int right = r.length;
        int li = 0;
        int ri = 0;
        int resi = 0;

        while (li < left || ri < right) {
            if (li < left && ri < right) {
                if (l[li] < r[ri]) {
                    res[resi] = l[li];
                    li++;
                    resi++;
                } else {
                    res[resi] = r[ri];
                    ri++;
                    resi++;
                }
            } else if (li < left) {
                res[resi] = l[li];
                li++;
                resi++;
            } else if (ri < right) {
                res[resi] = r[ri];
                ri++;
                resi++;
            }
        }
        return res;
    }
}
