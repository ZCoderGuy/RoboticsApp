package com.qualcomm.ftcrobotcontroller.opmodes;

/**
* A way to drive the robot, left motors right motors hand and arm motors
* using only one gamepad to drive it 
*@author Max Zitnick
*@version 2016-04-13 0.1
*/
public class Manual1 extends Telemetry {

}
// Contructs the class

  public Manual1() {
  }
  
  @Override public void loop() {
  //control the DC Motors with the left and right joysticks
  
  float l_gp1_left_stick_y = -gamepad1.left_stick_y;
  float l_left_drive_power
    =(float)scale_motor_power (l_gp1_left_stick_y;
  
  float l_gp1_right_stick_y = -gamepad1.right_stick_y;
  float l_right_drive_power
    = (float)scale_motor_power (l_gp1_right_stick_y);

  set_drive_power (l_left_drive_power, l_right_drive_power);
  
  //
  //Manage the arm motor
  //
  float l_left_arm_power
    = (float)scale_motor_power (gamepad1.right_trigger)
    - (float)scale_motor_power (gamepad1.left_trigger);
  m_left_arm_power (l_left_arm_power);
  
  //
  // Manage the servo motors
  //
  if (gamepad1.x) {
    m_hand_position (a_hand_position() + 0.05);
  }
  if (gamepad1.b) {
    m_hand_position (a_hand_position() - 0.05);
  }
  
  //
  // Send telemetry data to the driver station
  //
  update_telemetry();
  update_gamepad_telemetry();
  telemetry.addData
    ( "12", "Left Arm: " + l_left_armpower);
    
  } // Closing the loop
} // Closing Manual1
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
