class ElectronicDevice {
    protected String brand;
    protected String model;
    protected double price;
    protected int ramSize;
    protected int ssdCapacity;
    protected double screenSize;

    public ElectronicDevice(String brand, String model, double price, int ramSize, int ssdCapacity, double screenSize) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.ramSize = ramSize;
        this.ssdCapacity = ssdCapacity;
        this.screenSize = screenSize;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public int getRamSize() {
        return ramSize;
    }

    public int getSsdCapacity() {
        return ssdCapacity;
    }

    public double getScreenSize() {
        return screenSize;
    }

    @Override
    public String toString() {
        return "ElectronicDevice{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", ramSize=" + ramSize +
                ", ssdCapacity=" + ssdCapacity +
                ", screenSize=" + screenSize +
                '}';
    }
}