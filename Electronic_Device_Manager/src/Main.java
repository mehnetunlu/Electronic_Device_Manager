public class Main {
    public static void main(String[] args) {

        Computer monsterAbra = new Computer("Monster", "Abra", 30000, 16,
                1000, 15.6, "Windows", "IPS", "i5", true);

        System.out.println("Computer Specifications:");
        System.out.println("Brand: " + monsterAbra.getBrand());
        System.out.println("Model: " + monsterAbra.getModel());
        System.out.println("Price: " + monsterAbra.getPrice());
        System.out.println("RAM Size: " + monsterAbra.getRamSize());
        System.out.println("SSD Capacity: " + monsterAbra.getSsdCapacity());
        System.out.println("Screen Size: " + monsterAbra.getScreenSize());
        System.out.println("Operating System(OS): " + monsterAbra.getOs());
        System.out.println("Panel Type: " + monsterAbra.getPanelType());
        System.out.println("CPU Name: " + monsterAbra.getCpuName());
        System.out.println("Integrated GC: " + monsterAbra.isIntegratedGC());

        Phone samsungA32 = new Phone("Samsung", "A32", 9500, 64,
                256, 6.5, 128, "1000mAh", 64);

        System.out.println("\nPhone Specifications:");
        System.out.println("Brand: " + samsungA32.getBrand());
        System.out.println("Model: " + samsungA32.getModel());
        System.out.println("Price: " + samsungA32.getPrice());
        System.out.println("RAM Size: " + samsungA32.getRamSize());
        System.out.println("SSD Capacity: " + samsungA32.getSsdCapacity());
        System.out.println("Screen Size: " + samsungA32.getScreenSize());
        System.out.println("Capacity: " + samsungA32.getCapacity());
        System.out.println("Battery Capacity: " + samsungA32.getBatteryCapacity());
        System.out.println("Camera Resolution: " + samsungA32.getCameraResolution());
    }
}