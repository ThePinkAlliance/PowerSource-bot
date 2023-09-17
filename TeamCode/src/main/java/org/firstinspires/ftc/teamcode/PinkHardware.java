package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.lib.Hardware;

public class PinkHardware implements Hardware {
    public DcMotor frontLeft, frontRight;
    public DcMotor backLeft, backRight;
    public DcMotor liftLeft, liftRight;

    @Override
    public void configureDevices(HardwareMap map) {
        frontLeft = map.dcMotor.get("frontLeft");
        frontRight = map.dcMotor.get("frontRight");

        backLeft = map.dcMotor.get("backLeft");
        backRight = map.dcMotor.get("backRight");

        liftLeft = map.dcMotor.get("liftLeft");
        liftRight = map.dcMotor.get("liftRight");

        liftRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        liftLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        liftRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        liftLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
    }
}
