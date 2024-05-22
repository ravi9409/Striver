public class BitsPrac {
    public static void main(String[] args) {
       /* And rule is all true
        The & operator compares each binary digit of two integers and gives back a new integer, with the binary digit in each position being a 1 only if the corresponding binary digit in both input integers was a 1. Otherwise, the binary digit is a 0.
        1101
      & 0111
        ------
        0101*/
        System.out.println(13 & 7);
       /* The | operator compares each binary digit of two integers and gives back a new integer, with the binary digit in each position being a 1 if the corresponding binary digit in either or both input integers was a 1. Otherwise, the binary digit is a 0.
        1101
      | 0111
        ------
        1111*/
        System.out.println(13 | 7);
      /*1101
      ^ 0111
        ------
        1010 */
        System.out.println(13 ^ 7);
        System.out.println(~12);
    }
}