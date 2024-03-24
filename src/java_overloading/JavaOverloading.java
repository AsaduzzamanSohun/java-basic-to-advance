package java_overloading;

public class JavaOverloading {

    int doAddition(int a, int b){
        return a + b;
    }

    int doAddition(int a, int b, int c){
        return a + b + c;
    }

    float doAddition(float a, float b, float c, float d){
        return a + b + c + d;
    }

    float doAddition(float a, float b, float c){
        return a + b + c;
    }

    void doAddition(int a, double b){
        System.out.println(a + b);
    }

    void myName(String fn, String ln, int id){
        System.out.println(fn + " " + ln + ", ID: " + id);
    }
}
