import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*int[] list = {10,20,20,10,10,20,5,20,32,55,62};
        for (int i = 0 ; i<list.length; i++){
            for (int k = i+1; k<list.length; k++){
                if (list[i]==list[k]){

                }
            }
        }

*/
        /*int[] list = {100, 120, 70, 100, 10, 230, 85, 120};
        int count;
        System.out.println("List: " + Arrays.toString(list));
        Arrays.sort(list);

        for (int i = 0; i < list.length; i++) {
            count = 0;
            for (int j = 0; j < list.length; j++) {
                if (list[i] == list[j])
                    count++;
            }
            if (i == 0 && list[i] == list[i + 1]) {
                System.out.println(list[i] + " repeated " + count + " times.");
            }
            if (i == 0 && list[i] != list[i + 1]) {
                System.out.println(list[i] + " repeated " + count + " times.");
            }
            if (i != 0 && list[i] != list[i - 1]) {
                System.out.println(list[i] + " repeated " + count + " times.");
            }
        }*/


        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int[] newArray = new int[arr.length];

        int count = 0;



        for (int i = 0; i < arr.length; i++) {
            count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    newArray[i] = ++count;
                }
            }
            i += newArray[i];

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " number " + newArray[i] + " times repeated.");
            i += newArray[i];
        }


    }
}