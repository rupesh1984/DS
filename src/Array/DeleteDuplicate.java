package Array;

public class DeleteDuplicate {
    int[] finalArr ;
    int totalDuplicates;
    static int totalDups =0;
    static  int[] duplicateArr;

    public static int[] delDuplicate(int[] arr){
        int[] resultArr = arr;
        totalDups = findDuplicates(arr);
        int[] tempArr = new int[arr.length-totalDups];

//        for(int i=0;i<arr.length;i++){
//            for(int j =1;j<arr.length;j++){
//
//                if(arr[i] == arr[j] && i!=j && arr[i]!=0){
//
//                    arr[j] =0;
//
//
//                }
//            }
//        }

        for(int i =0;i<arr.length;i++){
            System.out.println("Data os "+duplicateArr[i]);
        }

        return arr;
    }

    public static int findDuplicates(int[] arr){
        int totalDuplicates = 0;
        duplicateArr = new int[arr.length];

        for(int i=0;i<arr.length;i++){
            for(int j =1;j<arr.length;j++){

                if(arr[i] == arr[j] && i!=j && arr[i]!=0){

                    if(dupFinder(duplicateArr,arr[i])){
                        duplicateArr[i] = arr[i];
                        totalDuplicates++;
                    }


                }
                else{
                    System.out.println("Here is else value "+ arr[i]);
                }
            }
        }

        return totalDuplicates;
    }

    public static boolean dupFinder(int[] arr , int val){
        for(int k =0; k<arr.length;k++){
            if(val == arr[k])
                return false;
        }

        return true;
    }

}

class delArr{
    public static void main(String args[]){
        int[] arr = {1,2,3,2,4,3,3,4,3,1,5,3,4,4,4,5};
        DeleteDuplicate deldp =  new DeleteDuplicate();
        int result = DeleteDuplicate.findDuplicates(arr);

        System.out.println("Del duplicates in array is "+result);

        DeleteDuplicate.delDuplicate(arr);

    }

}
