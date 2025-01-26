package pedroPathing.constants;

import com.pedropathing.localization.*;
import com.pedropathing.localization.constants.*;

public class LConstants {
    static {
        ThreeWheelConstants.forwardTicksToInches = 0.0019715;     //0.00198;   /** V1=0.00195;  default=0.001989436789  */
        ThreeWheelConstants.strafeTicksToInches =  0.0019725;      //0.00198;    /** V1=0.00195;  default=0.001989436789  */
        ThreeWheelConstants.turnTicksToInches = 0.00208;        //0.00198;      /** V1=0.00195;  default=0.001989436789  */
        ThreeWheelConstants.leftY = 6.0;        //5.25;                       /** default=1  */
        ThreeWheelConstants.rightY = -6.0;      //-5.25;                     /** default=-1 */
        ThreeWheelConstants.strafeX = -1.25;                    //-2.5;                     /** default=-2.5 */
        ThreeWheelConstants.leftEncoder_HardwareMapName = "leftRear";      //updated 1/26/2025
        ThreeWheelConstants.rightEncoder_HardwareMapName = "rightFront";     //updated 1/26/2025
        ThreeWheelConstants.strafeEncoder_HardwareMapName = "rightRear";   //updated 1/26/2025
        ThreeWheelConstants.leftEncoderDirection = Encoder.FORWARD;         //updated 1/26/2025
        ThreeWheelConstants.rightEncoderDirection = Encoder.FORWARD;        //updated 1/26/2025
        ThreeWheelConstants.strafeEncoderDirection = Encoder.REVERSE;       //updated 1/26/2025


        /*THIS IS FOR OTOS odometry
         *If you are using the corrected OTOS class, set OTOSConstants.useCorrectedOTOSClass to true.
         *If you are using the original OTOS class, set OTOSConstants.useCorrectedOTOSClass to false.
         *Make sure that the I2C port that you are using is the same class as the one you are using,
         * determined by above.
         */
//        OTOSConstants.useCorrectedOTOSClass = false;  //set to true or false based on above instructions
        //OTOSConstants.hardwareMapName = "OTOS";
        //OTOSConstants.linearUnit = DistanceUnit.INCH;
        //OTOSConstants.angleUnit = BNO055IMU.AngleUnit.RADIANS;
        //OTOSConstants.offset = new SparkFunOTOS.Pose2D(0, 0, Math.PI / 2);
        //Left/right is the y axis and forward/backward is the x axis,
        // with left being positive y and forward being positive x.
        //PI/2 radians is facing forward, and clockwise rotation is negative rotation.
        //OTOSConstants.linearScalar = 1.0;         //default linear unit is DistanceUnit.INCH;  section 2.5.2a run either Forward or Lateral Localizer Tuner
        //OTOSConstants.angularScalar = 1.0;        //default angle unit is AngleUnit.RADIANS.   section 2.5.2b run Turn Localizer Tuner
        //section 2.5. Run Localization Test.  Observe the movements, moving the robot forward
        // should make x increase and strafing left should make y increase.



    }
}




