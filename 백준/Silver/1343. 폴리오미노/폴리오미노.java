import java.util.*;class Main{public static void main(String[] z){Scanner k=new Scanner(System.in);String s=k.next();s=s.replace("XXXX","AAAA");s=s.replace("XX","BB");s=(s.contains("X"))?"-1":s;System.out.print(s);}}