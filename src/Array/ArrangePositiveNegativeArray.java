package Array;

public class ArrangePositiveNegativeArray {
    public static int[] arrangeArraybyPosNeg(int[] arr){
        int[] resArr = new int[arr.length];
        int countLengthForNegative=0;
        int countLengthForPositivw=0;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>=0)
                countLengthForPositivw ++;
            else
                countLengthForNegative++;
        }

        int[] negArr = new int[countLengthForNegative];
        int[] posArr = new int[countLengthForPositivw];

        for(int i=0, j =0;i<arr.length;i++){
            if(arr[i]<0 && j < countLengthForNegative){
                negArr[j] = arr[i];
               // System.out.println("NEG ARR "+negArr[j]);
                j++;
            }



        }
        for(int i=0,j=0;i<arr.length;i++){
            if(arr[i]>0 && j<countLengthForPositivw){
                posArr[j] = arr[i];
              //  System.out.println("POS ARR "+posArr[j]);
                j++;
            }
        }
        int i=0;
        while(i<countLengthForNegative){
            resArr[i] = negArr[i];
            i++;
        }
        int j =i;
        int q=0;
        while(q<countLengthForPositivw){
            resArr[j] = posArr[q];
            j++;
            q++;
        }



        return resArr;
    }

    public static void singleLoop(int[] arr){

        int[] resArr = new int[arr.length];
        int j=0;
        for(int i=0;i<arr.length;i++){

            if(arr[i]<0){
                if(i!=j){
                    int temp =arr[i];
                    arr[i] = arr[j];
                    arr[j] =temp;
                }
                j++;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println("Val is "+arr[i]);
        }
    }


    public static void main(String args[]){
        int[] arr ={3,-7,5,-2,6,-3};
        int[] resArr = new int[6];
        resArr = arrangeArraybyPosNeg(arr);
        singleLoop(arr);
//        for(int i=0;i<resArr.length;i++){
//            System.out.println("Val is "+resArr[i]);
//        }

    }



}
