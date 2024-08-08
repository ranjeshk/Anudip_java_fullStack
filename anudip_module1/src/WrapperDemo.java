public class WrapperDemo {

    public static void main(String[] args) {
        //Autoboxing
        int a = 5;
        float b = 5.6f;
        boolean c =  true;

        Integer aObject = a;
        Float bObject = b;
        Boolean cObject = c;

        System.out.println(aObject + " " + bObject + " "+ cObject);
        System.out.println(a == aObject);

        //unboxing

    }
}
