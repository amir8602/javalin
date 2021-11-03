package Java.Se5.ExceptionHandling;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        try{
//            String number = scanner.next();
//            int num = Integer.parseInt(number);
//            num *= 2 ;
//            System.out.println(num);
//        }catch (Exception e){
//            System.out.println(e.printStackTrace(););
//        }

        String data = scanner.next();
        int year = 0;
        try {
            year = getYear(data);
            System.out.println(year);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

    }

    public static int getYear (String str) throws Exception{
        String yearstr = str.substring(0,4);
        int year = Integer.parseInt(yearstr);
        return year;
    }


    //method final  dont override in subclass
    //finaliz run when obj is destroy run by gc


}
