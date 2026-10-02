
class Geeks40 {
    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 10, 3};

        int max = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < max){
                System.out.println(" ");
            }
        }
        System.out.println(max);
    }
}