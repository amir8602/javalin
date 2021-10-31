package Java.Se2;

public class Main {
    public static void main(String[] args) {
        String str = new String("Java");
        System.out.println(str.charAt(2));
        Integer in = new Integer(25);
        Double d2 = new Double(12.5);
        Integer i2 = d2.intValue();
        Integer [] arr = new Integer[10];
        arr [0] = new Integer(12);
        Double [] arr2 = new Double[20];

        //15:15 ----> 55%

        char c1 = 'a';
        char c2 = 'A';
        Integer c11 = (int) c1;
        System.out.println(c11);
        Character c3 = 98;
        System.out.println(c3);


        String str2 = new String("ali");
        char[] char2 = str2.toCharArray();
        for (int i = 0; i < char2.length; i++) {
            System.out.println(char2[i]);
        }


        String ah = "ali";
        String bh = "ali";
        if(ah==bh){
            System.out.println("true");
        }


        Person person = new Person("ali" , "alavi" , 21);



    }
}
