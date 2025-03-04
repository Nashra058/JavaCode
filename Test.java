abstract class A {
    abstract void logic();
    abstract void logic2();
    void fun(){
        System.out.println("This is fun method");
    }
}
 public class Test extends A{
    void logic(){
        System.out.println("This is logic method");
    }
    void logic2(){
        System.out.println("This is logic2 method");
    }
    public static void main(String[] args) {
        Test t = new Test();
        t.fun();
 }
}