package org.mapledpmlab.type.skill.attackskill.luminous;

import org.mapledpmlab.type.skill.attackskill.AttackSkill;

public class DoorOfTruth extends AttackSkill {
    public DoorOfTruth() {
        this.setName("진리의 문");
        this.setDamage(990.0);
        this.setAttackCount(10L);
        this.setDotDuration(40000L);
        this.setInterval(4000L);
        this.setRelatedSkill(new DoorOfTruthDelay());
        this.addFinalDamage(1.6);       // 코어 강화
    }
}
