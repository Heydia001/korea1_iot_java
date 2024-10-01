package example;

class Parent {
    int x = 100;
    Parent() {
        this(500);
    }
 
    Parent(int x) {
        this.x = x;
    }
 
    int getX() {
        return x;
    }
}
 
class Child extends Parent {
    int x = 4000;
    Child() {
        this(5000);
    }
 
    Child(int x) {
        this.x = x;
    }
}
 
public class Example01 {
    public static void main(String[] args) {
        Child obj = new Child();
        System.out.println(obj.getX()); //getX()를 가진 부모로 이동 > 이동 후 부모 클래스에서 가진 인스턴스 500을 가져온
    }
}