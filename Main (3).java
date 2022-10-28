/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.lang.*;
import java.util.*;
public class Main
{
    static int a,b,c,d,max,sum;
    public Main(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number:");
        a=sc.nextInt();
        System.out.println("Enter 2nd number:");
        b=sc.nextInt();
        System.out.println("Enter 3rd number:");
        c=sc.nextInt();
        System.out.println("Enter 4th number:");
        d=sc.nextInt();
        if(c>d){
            max=c;
            if(c>a){
                max=c;
                if(a>b){
                    max=c;
                }
                else if(b>c){
                    max=b;
                }
            }
            else{
                max=a;
            }
        }
        else{
            max=d;
            if(d>a){
                if(a>b){
                    max=d;
                }
                else{
                    if(b>d){
                        max=b;
                    }
                }
            }
            else{
                max=a;
            }
        }
        System.out.println("Maximum is:"+max);
    }
    public Main(int x,int y,int z,int p){
        this();
        sum=a+b+c+d;
        System.out.println("Sum:"+sum);
    }
	public static void main(String[] args) {
		Test1 t1=new Test1();
		Main m=new Main(a,b,c,d);
		Test1 t2=new Test1(a,b,c,d);
	}
}




