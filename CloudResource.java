public abstract class CloudResource implements Monitorable {
    protected String resourceId;
    protected boolean isActive;

    public CloudResource(String resourceId) {
        this.resourceId = resourceId;
        this.isActive = false;
    }

    public void togglePower() {
        this.isActive = !this.isActive;
        String status = this.isActive ? "ON" : "OFF";
        System.out.println("Resource " + this.resourceId + " is now " + status);
    }

    public abstract void allocateMemory(int gigabytes);

    public String getResourceId() {
        return this.resourceId;
    }

    public boolean getIsActive() {
        return this.isActive;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }
}
