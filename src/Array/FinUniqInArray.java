package Array;

public class FinUniqInArray {

    //This is n X n = n²
    public  static int[] uniqueInArr(int[] arr){
        int [] responseArr = new int[arr.length];
        int duplicate =0;
        for(int i=0;i<arr.length;i++){ //n
            duplicate =0;
            for(int j=0;j<arr.length;j++){ //n
                if(arr[i]==arr[j] && i!=j){
                    duplicate ++;

                }
            }

            if(duplicate==0)
            {
                System.out.println("This is unique "+arr[i]);
                responseArr[i]=arr[i];

            }
            else
            {
                responseArr[i]=-1;
            }
        }


        return responseArr;

    }

    public static void main(String args[]){
        int[] arr = {2,2,33,3,4,3,4,5};
        int[] resp = new int[arr.length];

        resp = uniqueInArr(arr);
        for(int i=0;i<resp.length;i++){
            if(resp[i]!=-1)
                System.out.println("here is response "+resp[i]);
        }
       // System.out.println("Here is "+firstUnique);
    }
}
