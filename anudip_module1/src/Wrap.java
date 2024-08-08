public class Wrap {
    public static void main(String[] args) {

        //depricated
        Integer number = new Integer(10);
        Integer number2 = new Integer(10);

        System.out.println(number == number2);

        Integer number3 = Integer.valueOf(10);
        Integer number4 = Integer.valueOf(10);

        System.out.println(number3 == number4);

    }
}
