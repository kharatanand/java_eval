package Array;
import java.util.ArrayList;

public class ProgramTwo {

    public static void main(String args[]){

        ArrayList<Object> list = new ArrayList<Object>();

        list.add(5);
        list.add("Anand");
        list.add(12.25);

        for(int i=0;i<list.size();i++){

            System.out.println(list.get(i));

        }

    }

}