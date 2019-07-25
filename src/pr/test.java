package pr;
import pr.Print;

public class test {
 public static void main(String[] args){
     Print print=new Print();
     print.printer();
     BlackPrint blackprint=new BlackPrint();
     blackprint.printer();
     ColorPrint colorprint=new ColorPrint();
     colorprint.printer();
 }
}
