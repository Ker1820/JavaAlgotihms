import java.util.ArrayList;
import java.util.Arrays;
//getting from 2d array to 1d array in shake way |||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
public class ArraySnake {
    public static void main(String[] args) {
        int[][] a = {{}};

        System.out.println(Arrays.toString( doIt(a)));
//        System.out.println(Arrays.toString(a));
    }

    public static int[] doIt(int[][] array) {
        if(array[0].length == 0) {
            return new int[0];
        }
        ArrayList inters = new ArrayList();
//        array.length/2 + (array.length % 2)
        int k = 0;
        int size_of_array = array.length;
        for (int i = 0; i <array.length/2 + (array.length % 2); i++, size_of_array--) {

            for (int j = i; j < size_of_array - 1; j++) {
                inters.add(array[i][j]);
            }
            for(int j = i; j < size_of_array - 1; j++) {
                inters.add(array[j][size_of_array-1]);
            }
            for(int j = size_of_array - 1; j > i; j--) {
                inters.add(array[size_of_array-1][j]);
            }
            for(int j = size_of_array - 1; j > i; j--) {
                inters.add(array[j][i]);
            }

        }
        if(array.length % 2 == 1)
            inters.add(array[array.length/2][array.length/2]);
        int[] l = new int[inters.size()];
        for(int i = 0; i < l.length; i++)
            l[i] = (int)inters.get(i);

        return l;
        
    }
}
