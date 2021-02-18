package pack1;

import com.company.protected1;

public class protected2 extends protected1 {
    public static void main (String[] args){

        // parent reference parent object
        //protected1 a = new protected1();
        //protected1.m1();

        // child reference child object
        protected2 b = new protected2();
        b.m1();

        // parent reference child object
        //protected1 a1 = new protected2();
        //a1.m1();
    }
}
