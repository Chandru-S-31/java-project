public class laptop {
    String name="";
    String proc="";
    int ram=0;
    int price=0;

    public static void main(String args[])
    {
        laptop lap1=new laptop();
        
        lap1.name="hpp";
        lap1.proc="i7"; 
        lap1.ram=8;
        lap1.price=40000;
        System.out.println(lap1.price);

        laptop lap2=new laptop();
        lap2.name="dell";
        lap2.proc="i5";
        lap2.ram=6;
        lap2.price=35000;
        System.out.print(lap2.name);

    }

}
