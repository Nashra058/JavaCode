class Ab{               
    void funA(){
        System.out.println("A class Method");
    }
    Ab(){
        System.out.println("Class A");
    }
}
class B extends Ab{
    B(){
        System.out.println("Class B");
    }
   void funB(){
    System.out.println("B class Method");
}
}
public class C {
    public static void main(String[] args){
        Ab c = new Ab();
        
       

    }
}
