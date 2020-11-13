public class cw6_2 {
    public static void main(String[] args) {
        int height = 6;

        for(int x = 0; x < height; x++){
            for(int w = 0; w<x+1; w++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
