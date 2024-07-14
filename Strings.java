public class Strings {
    public static void main(String[] args) {
//        String a="samreen";
//        String b="samreen";
//        System.out.println(a==b);

        String series="";
        for (int i = 0; i < 26; i++) {
            char ch= (char) ('a' + i);
            series= series+ch;
        }
        System.out.println(series);
    }
}
