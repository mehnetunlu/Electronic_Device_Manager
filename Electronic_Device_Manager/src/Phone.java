class Phone extends ElectronicDevice {
    private int capacity;
    private String batteryCapacity;
    private double cameraResolution;

    public Phone(String brand, String model, double price, int ramSize, int ssdCapacity, double screenSize, int capacity, String batteryCapacity, double cameraResolution) {
        super(brand, model, price, ramSize, ssdCapacity, screenSize);
        this.capacity = capacity;
        this.batteryCapacity = batteryCapacity;
        this.cameraResolution = cameraResolution;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getBatteryCapacity() {
        return batteryCapacity;
    }

    public double getCameraResolution() {
        return cameraResolution;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "capacity=" + capacity +
                ", batteryCapacity='" + batteryCapacity + '\'' +
                ", cameraResolution=" + cameraResolution +
                "} " + super.toString();
    }
}
