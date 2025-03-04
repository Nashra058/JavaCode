public class persion {
    persion(){
        System.out.println("This is definite constructor of this class");
    }
    persion(int a){
        System.out.println("This is pere. cons. of this class !");
    }
    void logic(){
        System.out.println("This is logic!!");
    }
    public static void main(String[] args) {
        persion p1 = new persion();
        persion p2 = new persion();
    }
}
