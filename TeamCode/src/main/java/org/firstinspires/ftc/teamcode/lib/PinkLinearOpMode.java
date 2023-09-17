package org.firstinspires.ftc.teamcode.lib;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.HardwareMap;

public abstract class PinkLinearOpMode extends LinearOpMode implements OpType {
    protected Hardware hardware;

    @Override
    public void initializeHardware(HardwareMap map, Hardware hardwareClass) {
        this.hardware = hardwareClass;

        this.hardware.configureDevices(map);
    }
}
