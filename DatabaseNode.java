public class DatabaseNode extends CloudResource {
    private int storageCapacityGb;

    public DatabaseNode(String resourceId, int storageCapacityGb) {
        super(resourceId);
        this.storageCapacityGb = storageCapacityGb;
    }

    @Override
    public void allocateMemory(int gigabytes) {
        System.out.println("Reserving " + gigabytes + " GB RAM for database indexing.");
    }

    @Override
    public String generateHealthReport() {
        if (this.isActive) {
            return "DatabaseNode " + this.resourceId + " status: DB Online and Healthy";
        } else {
            return "DatabaseNode " + this.resourceId + " status: DB Offline";
        }
    }

    @Override
    public int getUptime() {
        return 48;
    }

    public int getStorageCapacityGb() {
        return this.storageCapacityGb;
    }

    public void setStorageCapacityGb(int storageCapacityGb) {
        this.storageCapacityGb = storageCapacityGb;
    }
}
