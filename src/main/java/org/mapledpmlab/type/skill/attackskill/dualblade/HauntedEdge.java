package org.mapledpmlab.type.skill.attackskill.dualblade;

import org.mapledpmlab.type.skill.attackskill.AttackSkill;

public class HauntedEdge extends AttackSkill {
    public HauntedEdge() {
        this.setName("헌티드 엣지");
        this.setDamage(945.0);
        this.setAttackCount(4L);
        this.setCooldown(12.0);
        this.setDotDuration(5L);
        this.setInterval(1L);
        this.setLimitAttackCount(5L);
        this.addIgnoreDefenseList(30L);
        this.addFinalDamage(1.6);           // 코어강화
        this.setApplyFinalAttack(true);
        this.addFinalDamage(1.7);           // 미러 이미징
    }
}
