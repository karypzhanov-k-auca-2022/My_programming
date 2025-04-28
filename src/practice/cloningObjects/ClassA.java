package practice.cloningObjects;

public class ClassA {
    private int field1 = 100;
    private String field2 = "Hello";

    public int getField1() {
        return field1;
    }

    public String getField2() {
        return field2;
    }

    public ClassA() {
    }

    public ClassA(ClassA classToCopy) {
        this.field1 = classToCopy.getField1();
        this.field2 = new String(classToCopy.getField2());
    }
}
