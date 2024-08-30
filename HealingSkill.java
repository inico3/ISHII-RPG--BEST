public class HealingSkill extends Skill {
    private int healingAmount;

    public HealingSkill(String name, int maxUsage, int healingAmount) {
        super(name, maxUsage);
        this.healingAmount = healingAmount;
    }

    @Override
    public void use(Player player, Enemy enemy) {
        if (getUsageCount() > 0) {
            player.heal(healingAmount); // プレイヤーを回復
            decrementUsage(); // 使用回数を減少
        } else {
            System.out.println("このスキルはもう使えません。");
        }
    }
}