public abstract class Skill {
    private String name;
    private int maxUsageCount;
    private int usageCount;

    public Skill(String name, int maxUsageCount) {
        this.name = name;
        this.maxUsageCount = maxUsageCount;
        this.usageCount = maxUsageCount;
    }

    public String getName() {
        return name;
    }

    public int getUsageCount() {
        return usageCount;
    }

    public void decrementUsage() {
        if (usageCount > 0) {
            usageCount--;
        }
    }

    public abstract void use(Player player, Enemy enemy);
}