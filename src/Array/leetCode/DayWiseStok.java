package Array.leetCode;

public class DayWiseStok {

    public int[] arr;

    public DayWiseStok(int[] arr){
        this.arr = arr;
    }

    public int findSecMax(){
        int maxVal =0;
        int secMax=0;
        for(int i=0;i<this.arr.length; i++){
            for (int j=0;j<this.arr.length;j++){
                if(this.arr[i] > this.arr[j] && this.arr[i] >maxVal){
                    maxVal = this.arr[i];
                    secMax = this.arr[j];

                }
                if(this.arr[i] > this.arr[j] && maxVal > this.arr[i] && this.arr[i]> secMax)
                    secMax = this.arr[i];


            }
        }
        return secMax;
    }
}

class calculateSecmax{
    public static void main(String args[]){
        int[] arr = {1,4,7,6,5};
        DayWiseStok dw = new DayWiseStok(arr);
        int maxVal = dw.findSecMax();
        System.out.println("Max length is "+maxVal);
    }
}