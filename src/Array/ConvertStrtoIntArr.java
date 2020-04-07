package Array;

public class ConvertStrtoIntArr {

    public static void main(String args[]){

        //Convert String into arr
        String[] str = {"1","2  ","  3","4"};
        int[] intArr = new int[str.length];
        for(int i=0;i<str.length; i++){
            intArr[i] = Integer.parseInt(str[i].trim());

        }
        for(int i:intArr){
            System.out.println("Val is "+i);
        }

        //Convert Char into arr
        String ch = "12345678";
        int[] convArr = new int[ch.length()];

//        for(int i =0;i<ch.length();i++){
//            convArr[i] =ch[i];
//        }
        System.out.println("Lenght of String is"+ch.length());

    }

}
