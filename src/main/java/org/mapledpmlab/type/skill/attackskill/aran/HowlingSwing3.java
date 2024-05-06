package org.mapledpmlab.type.skill.attackskill.aran;

import org.mapledpmlab.type.skill.attackskill.AttackSkill;

public class HowlingSwing3 extends AttackSkill {
    public HowlingSwing3() {
        this.setName("하울링 스윙(3타)");
        this.setAttackCount(12L + 1);
        this.setDamage(1440.0 + 100 + 150);
        this.setDelayByAttackSpeed(360L);
        this.setApplyFinalAttack(true);
        this.setAddDamage(50L);
        this.addIgnoreDefenseList(20L);
        this.addIgnoreDefenseList(30L);
        this.setRelatedSkill(new HowlingSwing4());
    }
}
