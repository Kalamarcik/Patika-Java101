//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int [] list= {1,2,3,4,5,6};
        HelperArray helper = new HelperArray();
        helper.toString(list);

        HelperArray.sort(list);
        System.out.println("sortlananlist:");
        helper.toString(list);

        list=HelperArray.fill(list,10);
        helper.toString(list);

        int [] list2={3,5,1,67,7,0,9,12,2};
        list2=HelperArray.fill(list,2,5,99);
        helper.toString(list2);







        }
    }
