package OWN_BUILT;
public class MyString{
  char[]a;
  //first task is biuld the constructor
  //MyString ( )
  MyString(){
    //System.out.println("parsi");
  }
  //MyString (char[ ] charSeq)
  MyString(char[]charSeq){
    a=charSeq;
  }
  //MyString (String str)
  MyString(String str){
    a=new char[str.length()];
    for(int c=0;c<str.length();c++){
      a[c]=str.charAt(c);
    }
  }
  //================================================================================================================================
  //now its time to method biulding..
  //int length ( )
  public int length(){
    if(a==null){
      return 0;
    }else{
      return a.length;
    }
  }
  //char charAt ( int n )
  public char charAt(int n){
    if(a==null){
      return '0';
    }
    if(n>=0 && n<a.length){
      return a[n];
    }else{
      return '0';
    }
  }
  //boolean startsWith (MyString prefix)
  public boolean startsWith(MyString prefix){
    if(a==null){
      return false;
    }
    if(prefix==null){
      return false;
    }
    for(int c=0;c<prefix.length();c++){
      if((int)a[c]!=(int)prefix.charAt(c)){
        return false;
      }
    }
    return true;
  }
  //boolean startsWith (String prefix)
  public boolean startsWith(String prefix){
    if(a==null){
      return false;
    }
    if(prefix==null){
      return false;
    }
    for(int c=0;c<prefix.length();c++){
      if((int)a[c]!=(int)prefix.charAt(c)){
        return false;
      }
    }
    return true;
  }
  //boolean endsWith(MyString suffix)
  public boolean endsWith(MyString suffix){
    if(a==null){
      return false;
    }
    if(suffix==null){
      return false;
    }
    int gap=a.length-suffix.length();
    for(int c=0;c<suffix.length();c++){
      if((int)a[gap]!=(int)suffix.charAt(c)){
        return false;
      }
      gap++;
    }
    return true;
  }
  //boolean endsWith(String suffix)
  public boolean endsWith(String suffix){
    if(a==null){
      return false;
    }
    if(suffix==null){
      return false;
    }
    int gap=a.length-suffix.length();
    for(int c=0;c<suffix.length();c++){
      if((int)a[gap]!=(int)suffix.charAt(c)){
        return false;
      }
      gap++;
    }
    return true;
  }
  //MyString replaceFirst(char oldChar, char newChar)
  public MyString replaceFirst(char oldChar, char newChar){
    if((int)oldChar<65){
      MyString m1 = new MyString();
      return m1;
    }
    if((int)newChar<65){
      MyString m1 = new MyString();
      return m1;
    }
    for(int c=0;c<a.length;c++){
      if(a[c]==oldChar){
        a[c]=newChar;
        break;
      }
    }
    MyString m1 = new MyString(a);
    return m1;
  }
  //MyString replaceAll(char oldChar, char newChar)
  public MyString replaceAll(char oldChar, char newChar){
    if((int)oldChar<65){
      MyString m1 = new MyString();
      return m1;
    }
    if((int)newChar<65){
      MyString m1 = new MyString();
      return m1;
    }
    for(int c=0;c<a.length;c++){
      if(a[c]==oldChar){
        a[c]=newChar;
      }
    }
    MyString m1 = new MyString(a);
    return m1;
  }
  //MyString replaceLast(char oldChar, char newChar)\
  public MyString replaceLast(char oldChar, char newChar){
    if((int)oldChar<65){
      MyString m1 = new MyString();
      return m1;
    }
    if((int)newChar<65){
      MyString m1 = new MyString();
      return m1;
    }
    for(int c=a.length-1;c>0;c--){
      if(a[c]==oldChar){
        a[c]=newChar;
        break;
      }
    }
    MyString m1 = new MyString(a);
    return m1;
  }
  //MyString toLowerCase ( )
  //a=97,A=65(ascii)
  public MyString toLowerCase(){
    if(a==null){
      MyString m1 = new MyString();
      return m1;
    }
    for(int c=0;c<a.length;c++){
      if((int)a[c]<=90){
        a[c]=(char)((int)a[c]+32);
      }
    }
    MyString m1 = new MyString(a);
    return m1;
  }
  //MyString toUpperCase ( )
   public MyString toUpperCase(){
    if(a==null){
      MyString m1 = new MyString();
      return m1;
    }
    for(int c=0;c<a.length;c++){
      if((int)a[c]>=90){
        a[c]=(char)((int)a[c]-32);
      }
    }
    MyString m1 = new MyString(a);
    return m1;
  }
   //boolean equals ( MyString rightStr )(problem)
   public boolean equals(MyString rightStr){
     if(a.length>rightStr.length() || a.length<rightStr.length()){
       return false;
     }
     for(int c=0;c<a.length;c++){
       if(a[c]!=rightStr.charAt(c)){
       return false;
         
       }
     }
     return true;
   }
   /*///2nd way
    * public boolean equals(MyString rightStr){
     if(a.length>rightStr.length() || a.length<rightStr.length()){
       return false;
     }
     int count=0;
     for(int c=0;c<rightStr.length();c++){
       for(int d=0;d<a.length;d++){
         if(a[d]==rightStr.charAt(c)){
           count++;
         }
       }
     }
     if(count==a.length)
       return true;
     else
       return false;
   }*/
   //boolean equalsIgnoreCase ( MyString rightString )
   public boolean equalsIgnoreCase(MyString rightString){
     if(a.length>rightString.length() || a.length<rightString.length()){
       return false;
     }
     for(int c=0;c<a.length;c++){
       if(a[c]==rightString.charAt(c))
         continue;
       else{
         if((int)rightString.charAt(c)-(int)a[c]== 32)
           continue;
           else{
             if((int)a[c]-(int)rightString.charAt(c)==32)
               continue;
             else{
               return false;
             }
           }
       }
     }
     return true;
   }
   //int compareTo ( MyString str )
   public int compareTo(MyString str){
     if(str==null){
       return 0;
     }
     int count=0;
     for(int c=0;c<str.length();c++){
       if((int)str.charAt(c)-(int)a[c]<0){
         return count=(int)a[c]-(int)str.charAt(c);
       }else{
         if((int)str.charAt(c)-(int)a[c] > 0)
           return count=(int)a[c]-(int)str.charAt(c);
       }
     }
     return count;
   }
   //int compareTo (String str )
   public int compareTo(String str){
     if(str==null){
       return 0;
     }
     int count=0;
     for(int c=0;c<str.length();c++){
       if((int)str.charAt(c)-(int)a[c]<0){
         return count=(int)a[c]-(int)str.charAt(c);
       }else{
         if((int)str.charAt(c)-(int)a[c] > 0)
           return count=(int)a[c]-(int)str.charAt(c);
       }
     }
     return count;
   }
   //int compareToIgnoreCase(MyString str)
   public int compareToIgnoreCase(MyString str){
     if(str==null){
       return 0;
     }
     int count=0;
     for(int c=0;c<str.length();c++){
       if(a[c]==str.charAt(c))
         return count=(int)a[c]-(int)str.charAt(c);
       else if((int)a[c]<91){
         if((int)a[c]<91&&(int)str.charAt(c)>96)
           return count=(int)a[c]-((int)str.charAt(c)-32);
         else
           return count=(int)a[c]-(int)str.charAt(c);
       }else if((int)a[c]>91){
         if((int)a[c]>96&&(int)str.charAt(c)<91)
           return count=(int)a[c]-((int)str.charAt(c)+32);
         else
           return count=((int)a[c])-(int)str.charAt(c);
       }
     }
     return count;
   }
   //int compareToIgnoreCase(String str)
   public int compareToIgnoreCase(String str){
     if(str==null){
       return 0;
     }
     int count=0;
     for(int c=0;c<str.length();c++){
       if(a[c]==str.charAt(c))
         return count=(int)a[c]-(int)str.charAt(c);
       else if((int)a[c]<91){
         if((int)a[c]<91&&(int)str.charAt(c)>96)
           return count=(int)a[c]-((int)str.charAt(c)-32);
         else
           return count=(int)a[c]-(int)str.charAt(c);
       }else if((int)a[c]>91){
         if((int)a[c]>96&&(int)str.charAt(c)<91)
           return count=(int)a[c]-((int)str.charAt(c)+32);
         else
           return count=((int)a[c])-(int)str.charAt(c);
       }
     }
     return 0;
   }
   //MyString substring (int start)
   public MyString substring(int start){
     if(start<0||start>=a.length){
       MyString m1 = new MyString();
       return m1;
     }
     char[]b=new char[a.length-start];
     int count=0;
     for(int c=start;c<a.length;c++){
       b[count]=a[c];
       count++;
     }
     MyString m1 = new MyString(b);
     return m1;
   }
   //MyString substring (int start, int end)
   public MyString substring(int start,int end){
     if(start<0||end<0){
       MyString m1 = new MyString();
       return m1;
     }
     if(start>a.length||end>a.length){
       MyString m1 = new MyString();
       return m1;
     }
     if(start>end){
       MyString m1 = new MyString();
       return m1;
     }
     char[]b=new char[end-start + 1];
     int count=0;
     for(int c=start;c<end;c++){
       b[count]=a[c];
       count++;
     }
     MyString m1 = new MyString(b);
     return m1;
   }
   //int indexOf (char ch)
   public int indexOf(char ch){
     if((int)ch<65){
       return -1;
     }
     int count=0;
     for(int c=0;c<a.length;c++){
       if(a[c]==ch){
         count=c;
         return count;
       }
     }
     return -1;
   }
   //int lastIndexOf (char ch)
   public int lastIndexOf(char ch){
     if((int)ch<65){
       return -1;
     }
     int count=0;
     for(int c=a.length-1;c>=0;c--){
       if(a[c]==ch){
         count=c;
         return count;
       }
     }
     return -1;
   }
   //int indexOf ( char ch, int start )
   public int indexOf(char ch,int start){
     if((int)ch<65){
       return -1;
     }
     int count=0;
     for(int c=start;c<a.length;c++){
       if(a[c]==ch){
         count=c;
         return count;
       }
     }
     return -1;
   }
   //int lastIndexOf (char ch, int start)
   public int lastIndexOf(char ch, int start){
     if((int)ch<65){
       return -1;
     }
     int count=0;
     for(int c=a.length-start;c>=0;c--){
       if(a[c]==ch){
         count=c;
         return count;
       }
     }
     return -1;
   }
   //int indexOf ( MyString str)
   public int indexOf(MyString str){
     if(str==null){
       return 0;
     }
     int count=0;
     String s="";
     for(int c=0;c<a.length;c++){
       if(a[c]==str.charAt(c)){
         count=c;
         return count;
       }
     }
     return 0;
   }
   //int lastIndexOf (MyString str)
   public int lastIndexOf(MyString str){
     if(str==null){
       return 0;
     }
     int count=0;
     String s="";
     for(int c=a.length-1;c>0;c--){
       if(a[c]==str.charAt(0)){
         count=c;
         return count;
       }
     }
     return -1;
   }
   //int indexOf (String str)
   public int indexOf(String str){
     if(str==null){
       return 0;
     }
     int count=0;
     for(int c=0;c<str.length();c++){
       if(a[c]==str.charAt(0) && a[c+1]==str.charAt(1)){
         count=c;
         return count;
       }
     }
     return -1;
   }
   //int lastIndexOf (String str)
   public int lastIndexOf(String str){
     if(str==null){
       return 0;
     }
     int count=0;
     String s="";
     for(int c=a.length-1;c>0;c--){
       if(a[c]==str.charAt(0)){
         count=c;
         return count;
       }
     }
     return -1;
   }
   //MyString concat (MyString str)
   public MyString concat(MyString str){
    if(str==null){
      MyString m1 = new MyString();
      return m1;
    }
    char[]fi=new char[a.length+str.length()];
    for(int c=0;c<a.length;c++){
      fi[c]=a[c];
    }
    int count=0;
    for(int d=a.length;d<fi.length;d++){
      fi[d]=str.charAt(count);
      count++;
    }
    MyString m1 = new MyString(fi);
    return m1;
   }
   //MyString concat (char[ ] charSeq)
   public MyString concat(char[]charSeq){
    if(charSeq==null){
      MyString m1 = new MyString();
      return m1;
    }
    char[]fi=new char[a.length+charSeq.length];
    for(int c=0;c<a.length;c++){
      fi[c]=a[c];
    }
    int count=0;
    for(int d=a.length;d<fi.length;d++){
      fi[d]=charSeq[count];
      count++;
    }
    MyString m1 = new MyString(fi);
    return m1;
   }
   //MyString concat (String str)
   public MyString concat(String str){
    if(str==null){
      MyString m1 = new MyString();
      return m1;
    }
    char[]fi=new char[a.length+str.length()];
    for(int c=0;c<a.length;c++){
      fi[c]=a[c];
    }
    int count=0;
    for(int d=a.length;d<fi.length;d++){
      fi[d]=str.charAt(count);
      count++;
    }
    MyString m1 = new MyString(fi);
    return m1;
   }
   
   
   
   
   
   
   
   //toString 
   public String toString(){
     String abir="";
     for(int c=0;c<a.length;c++){
       abir=abir+a[c];
     }
     return abir;
   }
   
   
   //. boolean isPalindrom(String s1, String s2)
   public boolean isPalindrom(String s1,String s2){
     String s3=s1+s2;
     boolean b=true;
     int count=s3.length()-1;;
       for(int d=0;d<s1.length();d++){
         if(s3.charAt(d)!=s3.charAt(count)){
           b=false;
         return false;
         }
         count--;
       }
       return true;
   }
   //String myRevString(String s1, String s2)
   public String myRevString(String s1,String s2){
     Object[]b1=new Object[s1.length()];
     Object[]b2=new Object[s2.length()];
     int count=0;
     for(int c1=s1.length()-1;c1>=0;c1--){
       b1[count]=s1.charAt(c1);
       count++;
     }
     int count1=0;
     for(int c2=s2.length()-1;c2>=0;c2--){
       b2[count1]=s2.charAt(c2);
       count1++;
     }
     String s="";
     for(int c3=0;c3<b1.length;c3++){
       s=s+b1[c3];
     }
     String st="";
     for(int c4=0;c4<b2.length;c4++){
       st=st+b2[c4];
     }
     String sm=s+st;
     return sm;
   }
   
   
   
   
   
   //. String subtract(String s1, String s2)
   public String subtract(String s1,String s2){
     Object[]b1=new Object[s1.length()];
     for(int b2=0;b2<b1.length;b2++){
       b1[b2]=s1.charAt(b2);
     }
     int m=0;
     for(int n=0;n<s1.length();n++){
     for(int c=0;c<s2.length();c++){
       if(s1.charAt(n)==s2.charAt(c)){
         for(int d=n;d<s1.length()-m;d++){
           b1[n]=s1.charAt(n+1);
         }
         m++;
       }
     }
     }
     String s3="";
     for(int d3=0;d3<b1.length-m;d3++){
       s3=s3+b1[d3];
     }
     return s3;
   }
}