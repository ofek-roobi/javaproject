public class ComputeNode extends CloudResource {
    private int cpuCores;

    public ComputeNode(String resourceId, int cpuCores) {
        super(resourceId);
        this.cpuCores = cpuCores;
    }

    @Override
    public void allocateMemory(int gigabytes) {
        System.out.println("Allocating " + gigabytes + " GB RAM for compute inference tasks.");
    }

    @Override
    public String generateHealthReport() {
        if (this.isActive) {
            return "ComputeNode " + this.resourceId + " status: Healthy";
        } else {
            return "ComputeNode " + this.resourceId + " status: Offline";
        }
    }

    @Override
    public int getUptime() {
        return 24;
    }

    public int getCpuCores() {
        return this.cpuCores;
    }

    public void setCpuCores(int cpuCores) {
        this.cpuCores = cpuCores;
    }
}
