package strings;

public class StringBufferTest {

    public static void main(String[] args)
    {
        StringBuffer sb= new StringBuffer("Vamshi");//creation of stringbuffer
        sb.append(" Mukund");
        sb.length();
       // sb.delete(0,0);
        sb.substring(2,5);
        System.out.println(sb);
    }
}
