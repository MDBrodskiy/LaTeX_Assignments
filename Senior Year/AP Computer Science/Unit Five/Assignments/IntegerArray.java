/*
 *
 * Written by: Michael Brodskiy
 * Class: AP Computer Science A
 * Instructor: Mr. Davis
 *
 */

/**
 * This class is used to work with and integer array
 **/

public class IntegerArray

{

    private int[] a;

    public IntegerArray() {

        a = new int[0];

    }

    public IntegerArray(int size) {

        a = new int[size];

        for (int i = 0; i < size; i++) {

            a[i] = 0;

        }

    }

    public IntegerArray(int[] array) {

        a = new int[array.length];

        for (int i = 0; i < array.length; i++) {

            a[i] = array[i];

        }

    }

    public void fillArray(int min, int max) {

        for (int i = 0; i < a.length; i++) {

            a[i] = (int)((max - min + 1) * Math.random() + min);

        }

    }

    public String toString() {

        String tmp = "";

        for (int e : a) {

            tmp += e + " ";

        }

        return tmp;

    }

    public int indexOf(int key) {

        for (int i = 0; i < a.length; i++) {

            if (a[i] == key) return i;

        }

        return -1;

    }

    public boolean isPeak(int index) {

        if (index == (a.length - 1) || index == 0) return false;
        else if (a[index - 1] < a[index] && a[index + 1] < a[index]) return true;

        return false;

    }

    public boolean isDecreasing(int index) {

        int compare = a[index];

        for (int i = index + 1; i < a.length; i++) {

            if (compare < a[i]) return false;
            compare = a[i];

        }

        return true;

    }

    public boolean isIncreasing(int index) {

        int compare = a[index];

        for (int i = index + 1; i < a.length; i++) {

            if (compare > a[i]) return false;
            compare = a[i];

        }

        return true;

    }

    public boolean isDiverse() {

        for(int i = 0; i < a.length; i++) {

            for(int j = i + 1; j < a.length; j++) {

                if(a[i] == a[j]) return false;
            }
        }

        return true;

    }

    public void append(int add) {

        int[] tmp = new int[a.length];

        for (int i = 0; i < a.length; i++) {

            tmp[i] = a[i];

        }

        a = new int[tmp.length + 1];

        for (int i = 0; i < a.length; i++) {

            if (i < a.length - 1) a[i] = tmp[i];
            else a[i] = add;

        }

    }

    public boolean remove(int value) {

        int counter = 0;

        while (indexOf(value) != -1) {

            int[] tmp1 = new int[indexOf(value)];
            int[] tmp2 = new int[a.length - indexOf(value) - 1];

            for (int i = 0; i < indexOf(value); i++) {

                tmp1[i] = a[i];

            }

            for (int i = indexOf(value) + 1; i < a.length; i++) {

                tmp2[i - (indexOf(value) + 1)] = a[i];

            }

            a = new int[tmp1.length + tmp2.length];

            for (int i = 0; i < (tmp1.length + tmp2.length); i++) {

                if (i < tmp1.length) a[i] = tmp1[i];
                else a[i] = tmp2[i - tmp1.length];

            }

            counter++;

        }

        if (counter != 0) return true;

        return false;

    }
}
