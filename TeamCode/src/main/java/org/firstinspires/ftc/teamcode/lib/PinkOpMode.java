package org.firstinspires.ftc.teamcode.lib;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.HardwareMap;

public abstract class PinkOpMode extends OpMode implements OpType {
    protected Hardware hardware;

    @Override
    public void initializeHardware(HardwareMap map, Hardware hardwareClass) {
        this.hardware = hardwareClass;

        this.hardware.configureDevices(map);
    }
}
