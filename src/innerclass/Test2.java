package innerclass;
public class Test2{
   class Inner{
   int a = 10;
   }  
   void print(){
     char[] a = null;
	System.out.println(a);
    }
   public static void main(String[] args) {
	new Test2().print();
    }
}