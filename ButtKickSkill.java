public class ButtKickSkill extends Skill {
    private static final int HEAL_AMOUNT = 15;

    public ButtKickSkill() {
        super("けつたたき", 2);
    }

    @Override
    public void use(Player player, Enemy enemy) {
        player.setHp(player.getHp() + HEAL_AMOUNT);
    }
}