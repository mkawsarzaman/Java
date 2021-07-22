public class Power {
    public static void main(String[] args){
        for (int i = 0; i <= 16; i++) {
            PowerOfAny(2,i);
        }
    }

    public static void PowerOfAny (int base, int power){
        int exponentResult = 1;
        for (int i = 1; i <= power; i++){
            exponentResult = exponentResult * base;
        }
        System.out.println(base + " to the " + power + " = " + exponentResult);
    }
}
