public class HelloWorld {
    static int global_int = 100;
    public static int func_test()
    {
        global_int = global_int + 1;
        System.out.printf("Global in func: %d\n", global_int);
        return global_int;
    }
    public static void main(String[] args) {
        int val_int = 10;
        int res;
        System.out.printf("Local: %d\n", val_int); // 10, 100(지역변수);
        System.out.printf("Global: %d\n", global_int);
        res = func_test();
        System.out.println("return value: " + res);
    }
}