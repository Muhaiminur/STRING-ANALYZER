package OWN_BUILT;

public class Tester {

    public static void main(String[] args) {
        MyString m1 = new MyString();
        char[] c = {'a', 'b', 'c'};
        MyString m2 = new MyString(c);
        MyString m3 = new MyString("bracumuhaiminur");
        //Testing the int length() method
        System.out.println("=======Testing the int length() method=========");
        System.out.println(m1.length());//0
        System.out.println(m2.length());//3
        System.out.println(m3.length());//15
        //char charAt ( int n )
        System.out.println("=======Testing char charAt ( int n ) method=========");
        System.out.println(m1.charAt(1));//0
        System.out.println(m2.charAt(1));//b
        System.out.println(m3.charAt(5));//m
        //boolean startsWith (MyString prefix)
        System.out.println("=======Testing boolean startsWith (MyString prefix) method=========");
        System.out.println(m1.startsWith(new MyString()));//false
        System.out.println(m1.startsWith(new MyString("amni")));//false
        System.out.println(m2.startsWith(new MyString()));//true
        System.out.println(m2.startsWith(new MyString("abc")));//true
        System.out.println(m3.startsWith(new MyString()));//true
        System.out.println(m3.startsWith(new MyString("brac")));//true
        //boolean startsWith (String prefix)
        System.out.println("=======Testing boolean startsWith (String prefix) method=========");
        System.out.println(m1.startsWith("amni"));//false
        System.out.println(m2.startsWith("abc"));//true
        System.out.println(m2.startsWith("abir"));//false
        System.out.println(m3.startsWith("bra"));//true
        System.out.println(m3.startsWith("Bracu"));//false
        //boolean endsWith(MyString suffix)
        System.out.println("=======Testing boolean endsWith(MyString suffix) method=========");
        System.out.println(m1.endsWith(new MyString()));//false
        System.out.println(m1.endsWith(new MyString("amni")));//false
        System.out.println(m2.endsWith(new MyString("c")));//true
        System.out.println(m2.endsWith(new MyString("abc")));//true
        System.out.println(m3.endsWith(new MyString("nur")));//true
        System.out.println(m3.endsWith(new MyString("brac")));//false
        //boolean endsWith(String suffix)
        System.out.println("=======Testing boolean endsWith(String suffix) method=========");
        System.out.println(m1.endsWith("amni"));//false
        System.out.println(m2.endsWith("a"));//false
        System.out.println(m2.endsWith("bc"));//true
        System.out.println(m3.endsWith("bra"));//false
        System.out.println(m3.endsWith("minur"));//true
        //MyString replaceFirst(char oldChar, char newChar)
        /*m2.replaceFirst('b','c');
    System.out.println(m2);
    System.out.println(m2.replaceFirst('a','z'));
    m3.replaceFirst('u','f');
    System.out.println(m3);
    System.out.println(m3.replaceFirst('a','m'));
    System.out.println(m3.replaceFirst('r','Z'));
    //MyString replaceAll(char oldChar, char newChar)
    System.out.println(m2.replaceAll('c','a'));
    System.out.println(m3.replaceAll('m','n'));
    //MyString replaceLast(char oldChar, char newChar)
    System.out.println(m2.replaceLast('a','b'));
    System.out.println(m3.replaceLast('n','s'));
    //MyString toLowerCase ( )
    System.out.println(m2.toLowerCase());
    System.out.println(m3.toLowerCase());
    //MyString toUpperCase ( )
    System.out.println(m2.toUpperCase());
    System.out.println(m3.toUpperCase());*/
        //boolean equals ( MyString rightStr )
        System.out.println("=======Testing boolean equals ( MyString rightStr ) method=========");
        System.out.println(m2.equals(new MyString("abc")));//true
        System.out.println(m3.equals(new MyString("bracumuhaiminur")));//true
        System.out.println(m3.equalsIgnoreCase(new MyString()));//false
        System.out.println(m3.equals(new MyString("BracUmuhaiminur")));//false
        //boolean equalsIgnoreCase ( MyString rightString )
        System.out.println("=======Testing boolean equalsIgnoreCase ( MyString rightString ) method=========");
        System.out.println(m2.equalsIgnoreCase(new MyString("abc")));//true
        System.out.println(m2.equalsIgnoreCase(new MyString("ABc")));//true
        System.out.println(m3.equalsIgnoreCase(new MyString("bracu")));//false
        System.out.println(m3.equalsIgnoreCase(new MyString("bracumuhaiminur")));//true
        System.out.println(m3.equalsIgnoreCase(new MyString("BracuMuhaiminur")));//true
        //int compare(MyString str)
        System.out.println("=======Testing int compare(MyString str) method=========");
        System.out.println(m2.compareTo(new MyString("a")));//0
        System.out.println(m3.compareTo(new MyString("b")));//0
        System.out.println(m3.compareTo(new MyString("a")));//1
        //int compareTo (String str )
        System.out.println("=======Testing int compareTo (String str ) method=========");
        System.out.println(m2.compareTo("a"));//0
        System.out.println(m3.compareTo("b"));//0
        System.out.println(m3.compareTo("a"));//1
        //int compareToIgnoreCase(MyString str)
        System.out.println("=======Testing int compareToIgnoreCase(MyString str) method=========");
        System.out.println(m2.compareToIgnoreCase(new MyString("d")));//-3
        System.out.println(m3.compareToIgnoreCase(new MyString("B")));//0
        System.out.println(m3.compareToIgnoreCase(new MyString("A")));//1
        //int compareToIgnoreCase(String str)
        System.out.println("=======Testing int compareToIgnoreCase(String str) method=========");
        System.out.println(m2.compareToIgnoreCase("a"));//0
        System.out.println(m3.compareToIgnoreCase("B"));//0
        System.out.println(m3.compareToIgnoreCase("A"));//1
        //MyString substring (int start)
        System.out.println("=======Testing MyString substring (int start) method=========");
        System.out.println(m2.substring(1));//bc
        System.out.println(m3);//bracumuhaiminur
        System.out.println(m3.substring(5));//muhaiminur
        //MyString substring (int start, int end)
        System.out.println("=======Testing MyString substring (int start, int end) method=========");
        System.out.println(m2.substring(1, 2));//b
        System.out.println(m3);//bracumuhaiminur
        System.out.println(m3.substring(5, 10));//muhai
        //int indexOf (char ch)
        System.out.println("=======Testing int indexOf (char ch) method=========");
        System.out.println(m2.indexOf('b'));//1
        System.out.println(m2);//abc
        System.out.println(m3);//bracumuhaiminur
        System.out.println(m3.indexOf('c'));//3
        System.out.println(m3.indexOf('j'));//-1
        //int lastIndexOf (char ch)
        System.out.println("=======Testing int lastIndexOf (char ch) method=========");
        System.out.println(m2.lastIndexOf('b'));//1
        System.out.println(m2);//abc
        System.out.println(m3);//bracumuhaiminur
        System.out.println(m3.lastIndexOf('u'));//13
        System.out.println(m3.lastIndexOf('i'));//11
        //int indexOf ( char ch, int start )
        System.out.println("=======Testing int indexOf ( char ch, int start ) method=========");
        System.out.println(m3 + "=========================");//bracumuhaiminur=========================
        System.out.println(m3.indexOf('m'));//5
        System.out.println(m3.indexOf('m', 3));//5
        System.out.println(m3.indexOf('m', 7));//10
        System.out.println(m3.indexOf('j', 3));//-1
        //int lastIndexOf (char ch, int start)
        System.out.println("=======Testing int lastIndexOf (char ch, int start) method=========");
        System.out.println(m3.lastIndexOf('u', 1));//13
        System.out.println(m3.lastIndexOf('u', 5));//6
        System.out.println(m3.lastIndexOf('j', 3));//-1
        //int indexOf ( MyString str)
        System.out.println("=======Testing int indexOf ( MyString str) method=========");
        System.out.println(m2.indexOf(new MyString("bc")));//0
        System.out.println(m3.indexOf(new MyString("cu")));//0
        //int lastIndexOf (MyString str)
        System.out.println("=======Testing int lastIndexOf (MyString str) method=========");
        System.out.println(m2.lastIndexOf(new MyString("bc")));//1
        System.out.println(m3.lastIndexOf(new MyString("cu")));//3
        //int indexOf (String str)
        System.out.println("=======Testing int indexOf (String str) method=========");
        System.out.println(m2.indexOf("bc") + "=========================");//1
        System.out.println(m3.indexOf("ac"));//-1
        //int lastIndexOf (String str)
        System.out.println("=======Testing int lastIndexOf (String str) method=========");
        System.out.println(m2.lastIndexOf("bc"));//1
        System.out.println(m3.lastIndexOf("cu"));//3
        //MyString concat (MyString str)
        System.out.println("=======Testing MyString concat (MyString str) method=========");
        System.out.println(m2.concat(new MyString("abir")));//abcabir
        System.out.println(m3.concat(new MyString("muhaiminur")));//bracumuhaiminurmuhaiminur
        //MyString concat (char[ ] charSeq)
        System.out.println("=======Testing MyString concat (char[ ] charSeq) method=========");
        char[] ch1 = {'a', 'b', 'i', 'r'};
        System.out.println(m2.concat(ch1));//abcabir
        char[] ch2 = {'m', 'u', 'h', 'a'};
        System.out.println(m3.concat(ch2));//bracumuhaiminurmuha
        //MyString concat (String str)
        System.out.println("=======Testing MyString concat (String str) method=========");
        System.out.println(m2.concat("done"));//abcdone
        System.out.println(m3.concat("muhaiminur rahman"));//bracumuhaiminurmuhaiminur rahman

        //boolean isPalindrom(String s1, String s2)
        System.out.println("=======Testing isPalindrom(String s1, String s2) method=========");
        String s1 = "abb";
        String s2 = "ba";
        String s3 = "abir";
        System.out.println(m1.isPalindrom(s1, s2));//true
        //String myRevString(String s1, String s2)
        System.out.println("=======Testing String myRevString(String s1, String s2) method=========");
        String s4 = "abc";
        String s5 = "defgh";
        System.out.println(m1.myRevString(s4, s5));//cbahgfed
        //. String subtract(String s1, String s2)
        System.out.println("=======Testing String subtract(String s1, String s2) method=========");
        String s6 = "abed";
        String s7 = "cefd";
        System.out.println(m1.subtract(s6, s7));//ab
    }
}
