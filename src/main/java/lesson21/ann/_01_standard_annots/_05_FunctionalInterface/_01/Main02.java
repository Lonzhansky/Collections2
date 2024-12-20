package lesson21.ann._01_standard_annots._05_FunctionalInterface._01;

public class Main02 implements MyFuncInterfaceB {

    public static void main(String[] args) {
        Main02 demo = new Main02();
        demo.getInfo();
    }

    @Override
    public void getInfo() {
        System.out.println("Some Info!");
    }

    @Override
    public void getData() {
        System.out.println("Some Data!");
    }
}
