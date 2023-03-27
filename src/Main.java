public class Main {
    public static void main (String [] args){
        try{
            getResultForDevision(7,0);
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
    public static void getResultForDevision (int i, int j) throws ArithmeticException {
        if (j != 0){
            System.out.println(i/j);
        }
        else {
            throw new ArithmeticException("делить на 0 нельзя!");
        }
    }
}