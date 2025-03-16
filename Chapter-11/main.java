import java.util.ArrayList;
public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Integer> List = new ArrayList<Integer>();

        // add()
        List.add(12);
        List.add(11);
        List.add(14);
        List.add(22);
        List.add(24);
        System.out.println(List.size());
        System.out.println(List);

        ArrayList<Integer> TList = new ArrayList<Integer>();

        TList.add(12);
        TList.add(11);
        TList.add(14);
        TList.add(22);
        TList.add(24);
        System.out.println(List.size());

        //addAll() & add(i,el)
        List.addAll(TList);
        List.add(2,24);
        System.out.println(List);

        // remove(id)
        List.remove(4);

        // set(id,el)
        List.set(4,32);

        // get(id)
        System.out.println("Elements at index 4 is : " + List.get(4));

        // contains(el)
        System.out.println("Weather 32 present in the list " + List.contains(32));

        // indexOf(el)
        System.out.println("Index of 32 is " + List.indexOf(52));

        System.out.println(List);

        // subList()
        System.out.println(List.subList(3,6));


        // Printing of Lists **
        System.out.println(List);

        for(int i = 0; i < List.size(); i++)
            System.out.println(List.get(i));

        for(Integer el : List)
            System.out.println(el + 2);


        List.clear();
        System.out.println("Weather List is Empty : " + List.isEmpty());
    }
}
