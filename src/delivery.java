public class delivery {
    public static void main(String[] args) {
        int clients = 7;
        int routs = 2;
        int counter =4;
        while (counter<=clients){
            routs *= counter;
            counter++;
        }
        System.out.println(routs);
    }
}
