package org.firstinspires.ftc.teamcode.subsystems;

import org.firstinspires.ftc.teamcode.PinkHardware;
import org.firstinspires.ftc.teamcode.lib.Subsystem;

public class Lift extends Subsystem<PinkHardware> {
    public Lift(PinkHardware hardware) {
        super(hardware);
    }

    public void liftTo(int ticks) {
        // I don't think the integrated setPosition works
        hardware.liftLeft.setTargetPosition(ticks);
        hardware.liftRight.setTargetPosition(ticks);
    }
}
