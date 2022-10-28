
import java.lang.*;
import java.util.*;
class Test1 extends Main{
    int min;
    public Test1(){
         if(c<d){
            min=c;
            if(c<a){
                min=c;
                if(a<b){
                    min=c;
                }
                else if(b<c){
                    min=b;
                }
            }
            else{
                min=a;
            }
        }
        else{
            min=d;
            if(d<a){
                if(a<b){
                    min=d;
                }
                else{
                    if(b<d){
                        min=b;
                    }
                }
            }
            else{
                min=a;
            }
        }
        System.out.println("Minimum is:"+min);
     }
     public Test1(int a,int b,int c,int d){
         this();
         int diff=sum-min;
         System.out.println("Diff="+diff);
     }
}

