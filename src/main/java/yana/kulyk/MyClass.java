package yana.kulyk;

public class MyClass {
    static int x=3;
    int y;
    MyClass(){
        x++;
        y++;
    }
    static void methodA(int i,int i2){
        x= x+i+i2;
        System.out.println("-x"+x);
    }
    int methodB(int i){
        this.y =y+i;
        return  x-y;
    }

    public static void main(String[] args) {
        MyClass mc1 =  new MyClass();
        MyClass.methodA(3,2);
        MyClass.methodA(1,3);
        MyClass mc2 =  new MyClass();
        MyClass.methodA(4,2);
        System.out.println("-x"+ mc2.methodB(3)+ "-x"+ mc1.y);
    }
}
