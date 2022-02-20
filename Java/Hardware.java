package W2.Latihan1.Java;

class Hardware extends Product {
    private String Brand;
    private String Model;

    public Hardware(String Brand, String Model) {
        this.setBrand(Brand);
        this.setModel(Model);
    }

    public Hardware() {
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }

    public void printHardware() {
        System.out.println("Brand : " + this.Brand);
        System.out.println("Model : " + this.Model);
    }
}