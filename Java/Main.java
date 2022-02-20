package W2.Latihan1.Java;

public class Main {

    public static void main(String[] args) {

        Memory memory_obj = new Memory();

        memory_obj.setPrice(200);
        memory_obj.setIdProduct("1412");
        memory_obj.setBrand("Asus");
        memory_obj.setModel("K-14");
        memory_obj.setFrequency(20);
        memory_obj.setMemorySize(512);
        memory_obj.setSupportCuda(true);

        memory_obj.printProduct();
        memory_obj.printHardware();
        memory_obj.printMemory();
    }

}
