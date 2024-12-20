package lesson21.ann._01_standard_annots._01_Override;

class Cheese extends Product {

    @Override
    public void displayInfo() {
        System.out.println("It's a cheese.");
    }
}
