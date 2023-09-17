package org.firstinspires.ftc.teamcode.lib;

public abstract class Subsystem <E extends Hardware> {
    protected E hardware;

    public Subsystem(E hardware) {
        if (hardware == null) {
            throw new Error("hardware class is undefined, it's possible you instantiated this subsystem before the hardware class.");
        }

        this.hardware = hardware;
    }
}
