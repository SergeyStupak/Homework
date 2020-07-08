public class Number {
   public static void main(String[] args) {
       int n = 1234;
       int a = n%10*1000;
       int b = n%100/10*100+a;
       int c = n%1000/100*10+b;
       int d = n/1000+c;
       System.out.println(d);
   }
}