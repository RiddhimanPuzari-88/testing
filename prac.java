//101
class prac {
    public static void main(String[] args) {
        int no = 101;
        int counter = 0;
        int temp = no;
        int last;
        int ans = 0;
        while (no != 0) {
            last = no % 10;
            ans = (int) (ans + Math.pow(last, counter));
            counter++;
            no /= 10;

        }
        System.out.println(ans);
    }

}