public abstract class EnemySkill extends Skill {
    public EnemySkill(String name, int uses) {
        super(name, uses);
    }

    public abstract void applyEffect(Player[] players);
}