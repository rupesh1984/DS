package Array.leetCode;

public class FindDupilcates {

    public  Object getFinalArr(int[] arr){
        int totalLength = arr.length;
        int totalDuplicates =0;
        int finalLength = 0;

        return 0;
    }

    public  int totalDuplicates(int[] arr){

        int sizeOfArr = arr.length;
        int toalDuplocates =0;
        for(int i=0; i<sizeOfArr;i++){

            for(int j=0; j<sizeOfArr;j++){

                if(arr[i]== arr[j] && i!=j){

                    toalDuplocates++;
                }
            }
        }

        return toalDuplocates;
    }

//    public boolean ifDuplicate(int val){
//        int[]
//    }

}

class duplicateFromSortedArr{
    public static void main(String args[]){
        int[] arr = {0,0,0,1,1,2,2,2,2,3,3,4};
        FindDupilcates dupls = new FindDupilcates();
        int totalDupl = dupls.totalDuplicates(arr);
        System.out.println("Total Duplicates "+totalDupl);
    }
}
