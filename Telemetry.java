package com.qualcomm.ftcrobotcontroller.opmodes;

/** 
*Provides telemetry provided by the Hardware class
*
* Insert this class between a custom op-mode and the PushBotHardware class to
 * display telemetry available from the hardware class.
 *
 * @author Max Zitnick
 * @version 2016-04-13 0.1
 *
 * Telemetry Keys
 *     00 - Important message; sometimes used for error messages.
 *     01 - The power being sent to the left drive's motor controller and the
 *          encoder count returned from the motor controller.
 *     02 - The power being sent to the right drive's motor controller and the
 *          encoder count returned from the motor controller.
 *     03 - The power being sent to the left arm's motor controller.
 *     04 - The position being sent to the left and right hand's servo
 *          controller.
 *     05 - The negative value of gamepad 1's left stick's y (vertical; up/down)
 *          value.
 *     06 - The negative value of gamepad 1's right stick's y (vertical;
 *          up/down) value.
 *     07 - The negative value of gamepad 2's left stick's y (vertical; up/down)
 *          value.
 *     08 - The value of gamepad 2's X button (true/false).
 *     09 - The value of gamepad 2's Y button (true/false).
 *     10 - The value of gamepad 1's left trigger value.
 *     11 - The value of gamepad 1's right trigger value.
 */
 
 public class Telemtry extends Hardware {
 }
 
  public Telemetry() {
  }
  
  public void update_telemetry() {
    if (a_warning_generated()) {
      set_first_message (a_warning_message());
    }
    //
    // Send telemetry data to the driver station
    //
    telemetry.addData
      ( "01", 
      "Left Drive: " + a_left_drive_power() + 
      ", " + a_left_encoder_count()
      );
    telemetry.addData
      ( "02", 
      "Right Drive: " + a_right_drive_power() + 
      ", " + a_right_encoder_count()
      );
    telemetry.addData
      ( "03", 
      "Left Arm: " + a_left_arm_power()
      );
    telemetry.addData
      ( "03",
      "Hand Position: " + a_hand_position()
      );
  } // update_telemetry
  
  
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
