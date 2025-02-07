public class function {
    void greeting()
    {
        System.out.println("Vanakkam");
        dummy();
    }
    void dummy()
    {
        System.out.print("I am dummy");
    }

    public static void main(String args[]){
        function obj1=new function();
        obj1.greeting();

    }
    
}
