public class BasicJava {
    public void printToTwoFiftyFive() {
        int i = 1;
        while (i < 256){
            System.out.println(i);
            i++;
        }
    } 
    public void printOdd(){
        int j = 1;
        while (j < 256){
            if (j % 2 == 1){
            System.out.println(j);
            j+=2;
            }
        }
    }
    public void printSum(){
        int sum = 0;
        for (int i = 0; i < 256; i++){
            System.out.println(String.format("New Num %d, Sum %d:", i, sum));
            sum += i;
        }
    }
    public void iterateArray(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public void findMax(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > max){
                arr[i] = max;
            }
            System.out.println(max);
        }
    }
    public void getAverage(int[] arr){
        int avg = arr[0];
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
            avg = sum / arr.length;
        }
            System.out.println(avg);
        }
    public void arrayOddNumbers(){
        int i = 1;
        while (i < 256){
            if (i % 2 == 1){
                System.out.println("[" + i + "]");
                i+=2;
            }
        }
    }
    public void greaterThanY(int[] arr, int y){
        int count = arr[0];
        for(int i = 1; i < arr.length; i++){
            if (arr[i] > y){
                count++;
                System.out.println(count);
            }
        }
    }
}