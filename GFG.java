public class GFG {
    // sw=software
    static String sw_name;
    static float sw_price;
    static int  reg_no;

    static void set(String n, float p, int r)
    {
        sw_name = n;
        sw_price = p;
        reg_no = r;
    }

    static void get()
    {
        System.out.println("Software name is: " + sw_name);
        System.out.println("Software price is: "
                + sw_price);
        System.out.println("Software registration no is: "
                + reg_no);
    }

    public static void main(String args[])
    {
        GFG.set("Visual studio", 0.0f , 21);
        GFG.get();
    }
}
