package org.firstinspires.ftc.teamcode;

import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.acmerobotics.roadrunner.geometry.Vector2d;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.drive.SampleMecanumDrive;
import org.firstinspires.ftc.teamcode.util.trajectorysequence.TrajectorySequence;


@Autonomous(name="Autonomie")
public class Autonomie extends LinearOpMode {


    @Override
    public void runOpMode() throws InterruptedException{

        SampleMecanumDrive drive = new SampleMecanumDrive(hardwareMap);


        waitForStart();
        TrajectorySequence untitled2 = drive.trajectorySequenceBuilder(new Pose2d(0, 0, Math.toRadians(0)))
                .splineTo(new Vector2d(-63, -22), Math.toRadians(90))
                .build();
    }


}
