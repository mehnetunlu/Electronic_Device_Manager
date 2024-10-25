class Computer extends ElectronicDevice {
    private String os;
    private String panelType;
    private String cpuName;
    private boolean isIntegratedGC;

    public Computer(String brand, String model, double price, int ramSize, int ssdCapacity, double screenSize, String os, String panelType, String cpuName, boolean isIntegratedGC) {
        super(brand, model, price, ramSize, ssdCapacity, screenSize);
        this.os = os;
        this.panelType = panelType;
        this.cpuName = cpuName;
        this.isIntegratedGC = isIntegratedGC;
    }

    public String getOs() {
        return os;
    }

    public String getPanelType() {
        return panelType;
    }

    public String getCpuName() {
        return cpuName;
    }

    public boolean isIntegratedGC() {
        return isIntegratedGC;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "os='" + os + '\'' +
                ", panelType='" + panelType + '\'' +
                ", cpuName='" + cpuName + '\'' +
                ", isIntegratedGC=" + isIntegratedGC +
                "} " + super.toString();
    }
}