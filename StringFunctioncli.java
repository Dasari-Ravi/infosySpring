import java.util.function.Function;

public class StringFunctioncli {

    public static void main(String[] args) {

        StringFunction stringFunctionSs =(a,b)->a+b;
        int result=stringFunctionSs.add(2,9);
        System.out.println(result);
        result=stringFunctionSs.add(5,8);
        System.out.println(result);


    }
}