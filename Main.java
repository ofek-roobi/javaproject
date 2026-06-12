public class Main {
    public static void main(String[] args) {
        DatacenterConfig.printSop();
        System.out.println("Region: " + DatacenterConfig.DEFAULT_REGION);
        System.out.println("===================================");

        ComputeNode computeNode = new ComputeNode("C-01", 16);
        DatabaseNode databaseNode = new DatabaseNode("DB-01", 1024);

        CloudResource[] resources = { computeNode, databaseNode };

        for (CloudResource resource : resources) {
            resource.togglePower();
            resource.allocateMemory(32);
            System.out.println(resource.generateHealthReport());
            System.out.println("Uptime: " + resource.getUptime() + " hours");
            System.out.println("-----------------------------------");
        }
    }
}
