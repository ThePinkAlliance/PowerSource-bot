package org.firstinspires.ftc.teamcode.opmodes;

import org.firstinspires.ftc.teamcode.PinkHardware;
import org.firstinspires.ftc.teamcode.lib.PinkOpMode;

public class TeleOp extends PinkOpMode {
    PinkHardware pinkHardware = new PinkHardware();

    @Override
    public void init() {
        initializeHardware(hardwareMap, pinkHardware);
    }

    @Override
    public void loop() {

    }
}
