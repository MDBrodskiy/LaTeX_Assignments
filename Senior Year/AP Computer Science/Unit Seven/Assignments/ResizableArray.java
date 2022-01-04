/*
 *
 * Written by: Michael Brodskiy
 * Class: AP Computer Science A
 * Instructor: Mr. Davis
 *
 */

/**
 * This program contains the ResizableArray class
 **/


public class ResizableArray

{

    private int[] arr;

    public ResizableArray() {

        arr = new int[0];

    }

    public ResizableArray(int size) {

        arr = new int[size];

        for (int i = 0; i < arr.length; i++) {

            arr[i] = 0;
            
        }

    }

    public ResizableArray(int[] arr2) {

        arr = new int [arr2.length];

        for (int i = 0; i < arr2.length; i++) {

            arr[i] = arr2[i];
}

    }

    public String toString() {

        String contents = "";

        for (int e : arr) {

            contents += e + " ";

        }

        return contents;

    }

    public int indexOf(int key) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == key) return i;

        }

        return -1;

    }

    public boolean isPeak(int index) {

        if (index == 0 || index == arr.length - 1) return false;

        return (arr[index - 1] < arr[index] && arr[index] > arr[index + 1]);

    }

    public boolean isDecreasing(int index) {

        for (int i = index; i < arr.length - 1; i++) {

            if (arr[i + 1] >= arr[i]) return false;

        }

        return true;

    }

    public boolean isIncreasing(int index) {

        for (int i = index; i < arr.length - 1; i++) {

            if (arr[i + 1] <= arr[i]) return false;

        }

        return true;

    }

    public boolean isDiverse() {

        for(int i = 0; i < arr.length; i++) {

            for(int j = i + 1; j < arr.length; j++) {

                if(arr[i] == arr[j]) return false;
            }
        }

        return true;

    }

    public void append(int value) {

        int[] tmp = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {

            tmp[i] = arr[i];

        }

        arr = new int[tmp.length + 1];

        for (int i = 0; i < arr.length; i++) {

            if (i < arr.length - 1) arr[i] = tmp[i];
            else arr[i] = value;

        }

    }

    public boolean remove(int value) {

        int counter = 0;

        while (indexOf(value) != -1) {

            int[] tmp1 = new int[indexOf(value)];
            int[] tmp2 = new int[arr.length - indexOf(value) - 1];

            for (int i = 0; i < indexOf(value); i++) {

                tmp1[i] = arr[i];

            }

            for (int i = indexOf(value) + 1; i < arr.length; i++) {

                tmp2[i - (indexOf(value) + 1)] = arr[i];

            }

            arr = new int[tmp1.length + tmp2.length];

            for (int i = 0; i < (tmp1.length + tmp2.length); i++) {

                if (i < tmp1.length) arr[i] = tmp1[i];
                else arr[i] = tmp2[i - tmp1.length];

            }

            counter++;

        }

        if (counter != 0) return true;

        return false;

    }

}
