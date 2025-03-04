
    class A{               
    void funA(){
        System.out.println("A class Method");
    }
    A(){
        System.out.println("Class A");
    }
}
class B extends A{
    B(){
        System.out.println("Class B");
    }
   void  funB(){
    System.out.println("B class Method");
}
}
public class C {
    public static void main(String[] args){
        A obj = new A();
       

    }
}
