package lesson21.ann._01_standard_annots._05_FunctionalInterface._01;

public class Main01 implements MyFuncInterfaceA {

    public static void main(String[] args) {
        Main01 demo = new Main01();
        demo.getInfo();
    }

    @Override
    public void getInfo() {
        System.out.println("Some Info!");
    }
}
