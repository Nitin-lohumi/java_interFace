interface A {
    void m1();
    static int main(int x){
     return x*x*x;
    }
}
class B implements A{
  public void m1(){
    System.out.println("here m1 method is called");
  }
}
class q1 {
    public static void main(String[] args) {
        System.out.println("the cube is "+ A.main(10));
       A a = new B();
       a.m1();
    }
}