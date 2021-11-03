package Java.Se5;

import java.util.Comparator;

public class MyComperetor implements Comparator<String> {

    @Override
    public int compare(String s, String t1) {
        if(s.length()>t1.length()){
            return 1;
        }else if(s.length()==t1.length()){
            return 0;
        }else{
            return -1;
        }
    }
}
