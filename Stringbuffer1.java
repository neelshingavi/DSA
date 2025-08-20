// String buffer is similar to string but it can be changed.
// String buffer is not primitive
// String buffer holds 16 characters space extra for future. 
// eg: size is 5 the capacity is 21

public class Stringbuffer1 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Neel");
        
        sb.append(" Shingavi");

        System.out.println(sb.length());
        sb.setLength(50);
        System.out.println(sb.length());
    }

}
