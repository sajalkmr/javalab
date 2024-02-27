package mypack;

public class MyPackageClass {
    public void display() {
        System.out.println("Displaying from MyPackageClass");
    }
}


import mypack.MyPackageClass;

public class MainClass {
    public static void main(String[] args) {
        MyPackageClass myPackageObj = new MyPackageClass();
        myPackageObj.display();
    }
}
