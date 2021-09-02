public class ControlFlowExercises {
    public static void main(String[] args) {
        int i = 5;
        int j = 100;


        while(i <= 15) {
            System.out.println(i);
            i++;
        }

        do {
            System.out.println(j);
            j-=5;
        } while (j > 0);
    }

}
