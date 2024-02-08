public class sortArrayString {
    public static void main(String[] args) {
        String arr[]={"devid","devanshu","shrvani","mohini","vishal","sneha","abhishek"};
        java.util.Arrays.sort(arr);

        for(String str:arr){
            System.out.println(str+" ");
        }
    }
}
