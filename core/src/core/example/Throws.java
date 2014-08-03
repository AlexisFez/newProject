package core.example;

public class Throws extends Throwable{
    public static void main(String[] args) {

    Throws t = new Throws();
        try {
            t.a();
        }
        catch (RuntimeException e){
            System.out.println("Main method");
        }

    }
    public void a(){
        System.out.println("hello");
     try {
         g();
     }
     catch (Error e){
         System.out.println("Error in your tel");
     }
        finally {
         System.out.println("It's final block");
     }
    }

    public int g(){
//        if(true)throw new RuntimeException("Hello");
        return 1;
    }
}
