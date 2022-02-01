package mypack;

import java.util.*;

public class ArrayListCode {
    public static void main(String[] args) {


            List<String> l = new ArrayList<String>();
            l.add("atanu");
            l.add("atanu1");
            l.add("atanu2");
            // System.out.println(l);

            List<String> ll=new ArrayList<String>();
            ll.add("atanu12");
            ll.add("atanu");
            ll.add("atanu12");
            ll.addAll(l);
// System.out.println(ll);

            for(String n:ll)
            {
                // System.out.println(n);
            }
            System.out.println("set use");
            ll.set(4,"somu");

            for(int i=0;i<ll.size();i++)
            {
                // System.out.println(ll.get(i));
            }

            ll.remove(4);

            Iterator itr=ll.iterator();
            while(itr.hasNext())
            {
                String ab=(String)itr.next();
                System.out.println(ab);

            }

            System.out.println(ll.lastIndexOf("atanu12"));
            System.out.println(ll.indexOf("atanu"));



        }

}
