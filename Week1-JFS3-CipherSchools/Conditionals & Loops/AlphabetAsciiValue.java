public class AlphabetAsciiValue {
    public static void main(String[] args) {
        char ch = 'A'; // Ascii value of A is 65

        while(ch<=90) {
            System.out.println(ch + " ");
            ch++; // 65+1
        }
//        DO WHILE
        char ch1 = 'A';
        do {
            System.out.println(ch+ " ");
            ch++;
        } while(ch<='Z');
    }
}
