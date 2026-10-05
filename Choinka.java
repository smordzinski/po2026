public class Choinka {
    public static void main(String[] args) {
        String choinka = "*";
        for (int i=1; i <= Integer.parseInt(args[0]); i++) {
            System.out.println(choinka.repeat(i));
        }
    }
}
