public class OrderCheck {

    public static void main (String[] args)
    {
    
        int w = Integer.parseInt(args[0]); 
        int x = Integer.parseInt(args[1]); 
        int y = Integer.parseInt(args[2]); 
        int z = Integer.parseInt(args[3]);  

    boolean answer = ((x > w) && (y > x) && (z > y)) || ((w > x) && (x > y) && (y > z)); 
    System.out.println(answer); 

    }
}
