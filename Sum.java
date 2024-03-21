import java.util.Arrays;
class Sum {
    public static void main(String[] args)
    {
        int []values={100,4,23,35,27,411,21,99,77};
        Arrays.sort(values);
        //System.out.println(values);
        int length=values.length;
        int sum=values[length-2]+values[length-3];
        System.out.println(sum);

    }
}