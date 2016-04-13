package com.qualcomm.ftcrobotcontroller.opmeodes;

/**
*The app for driving manually driving the robot; left right forward backwards arm motor
*and servo motors with two different gamepads

*@author Max Zitnick
*@version 2016-4-13 0.1
*/
public class Manual extends Telemetry {
  //Contructs the class "Manual"
  public Manual() {
  }
  @Override public void loop() {
  //DC Motors
  //Obtaint the current values of the joysticks
  //x and y equal -1 when pushed all the way forward (i.e. away from holder)
  //
  //Manage the drive wheel motors
  //
  float l_left_drive_power = scale_motor_power (-gamepad1.left_stick_y);
  float l_right_drive_power = scale_motor_power (-gamepad1.right_stick_y);
  
  set_drive_power (l_left_drive_power, l_right_drive_power);
  
  //
  //Manage the arm motor
  //
  float l_left_arm_power = scale_motor_power (-gamepad2.left_stick_y);
  m_left_arm_power (l_left_arm_power);
  
  //
  //Servo motors
  //
  //X and B buttons are boolean values wither true or false
  //
  if (gamepad2.x) {
    m_hand_position (a_hand_position () + 0.05);
  }
  else if (gamepad2.b) {
    m_hand_position (a_hand_postion () - 0.05);
  }
  
  //
  //Send telemtry data to driver station
  //
  update_telemetry ();
  update_gamepad_telemetry ();
