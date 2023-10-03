public class Main {
    public static void main(String[] args) {

        List<String> test = new List<String>();
        test.add("-remove this-");
        test.add("hello");
        test.add("mein");
        test.add("name");

        test.add("Berni");
        test.add(5, "ist");
        test.add("-remove this-");

        System.out.println(test.get(4));

        System.out.println(test.toStringUmdraht());
        System.out.println(test.toStringReverse());

        List<Integer> test1 = new List<Integer>();
        test1.add(0);
        test1.add(1);
        test1.add(2);
        test1.add(3);
        test1.add(4);
        test1.add(5);
        test1.add(6);
        test1.add(7);
        test1.add(8);
        test1.add(9);

        System.out.println(test1);

        test1.remove(9);
        System.out.println(test1);
        System.out.println(test1.get(4));
        System.out.println(test1.get(6));

        test1.add(8, 1);

        System.out.println(test);




    }
}
