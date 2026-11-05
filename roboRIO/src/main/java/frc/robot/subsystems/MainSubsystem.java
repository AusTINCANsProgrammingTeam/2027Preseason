// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.spark.SparkBase;
import com.revrobotics.spark.SparkClosedLoopController;
import com.revrobotics.spark.SparkLowLevel;
import com.revrobotics.spark.SparkMax;
import edu.wpi.first.math.util.Units;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import idkthewholeimportstatement;

public class MainSubsystem extends SubsystemBase {
  private SparkMax topLeft;
  private SparkMax topRight;
  private SparkMax bottomLeft;
  private SparkMax bottomRight;
  private SparkClosedLoopController  topLeftController;
  private SparkClosedLoopController  topRightController;
  private SparkClosedLoopController  bottomLeftController;
  private SparkClosedLoopController  bottomRightController;


  public MainSubsystem() {
    topLeft = new SparkMax(3, SparkLowLevel.MotorType.kBrushless);
    topRight = new SparkMax(15, SparkLowLevel.MotorType.kBrushless);
    bottomLeft = new SparkMax(2, SparkLowLevel.MotorType.kBrushless);
    bottomRight = new SparkMax(6, SparkLowLevel.MotorType.kBrushless);
    topLeftController = topLeft.getClosedLoopController();
    topRightController = topRight.getClosedLoopController();
    bottomLeftController = bottomLeft.getClosedLoopController();
    bottomRightController = bottomRight.getClosedLoopController();
  }
  public enum names{TOPLEFT, TOPRIGHT,BOTTOMLEFT,BOTTOMRIGHT}
  public void moveMotor(int motor,int pos){
      switch(motor){
          case 0:
              topLeftController.setSetpoint(Units.degreesToRotations(pos), SparkBase.ControlType.kPosition);
              break;
          case 1:
              topRightController.setSetpoint(Units.degreesToRotations(pos), SparkBase.ControlType.kPosition);
              break;
          case 2:
              bottomLeftController.setSetpoint(Units.degreesToRotations(pos), SparkBase.ControlType.kPosition);
              break;
          case 3:
              bottomRightController.setSetpoint(Units.degreesToRotations(pos), SparkBase.ControlType.kPosition);
              break;
      }
  }
  public Command runGymnastics(){
      Command cmd = startEnd(()->{

      },()->{

      });
      return cmd;
  }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
