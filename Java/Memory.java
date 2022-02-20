package W2.Latihan1.Java;

class Memory extends Hardware {
    private int frequency;
    private int memorySize;
    private boolean supportsCuda;

    public Memory(int frequency, int memorySize, boolean supportsCuda) {
        this.setFrequency(frequency);
        this.setMemorySize(memorySize);
        this.setSupportCuda(supportsCuda);
    }

    public Memory() {
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(int memorySize) {
        this.memorySize = memorySize;
    }

    public boolean getSupportCuda() {
        return supportsCuda;
    }

    public void setSupportCuda(boolean supportsCuda) {
        this.supportsCuda = supportsCuda;
    }

    public void printMemory() {
        System.out.println("Frequency    : " + this.frequency);
        System.out.println("Memory Size  : " + this.memorySize);
        System.out.println("Support CUDA : " + this.supportsCuda);
    }

}
