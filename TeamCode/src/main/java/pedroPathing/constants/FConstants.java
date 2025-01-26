package pedroPathing.constants;

import com.pedropathing.localization.Localizers;
import com.pedropathing.follower.FollowerConstants;
import com.pedropathing.util.CustomFilteredPIDFCoefficients;
import com.pedropathing.util.CustomPIDFCoefficients;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

public class FConstants {
    static {
        FollowerConstants.localizers = Localizers.THREE_WHEEL;

        FollowerConstants.leftFrontMotorName = "leftFront";
        FollowerConstants.leftRearMotorName = "leftRear";
        FollowerConstants.rightFrontMotorName = "rightFront";
        FollowerConstants.rightRearMotorName = "rightRear";

        FollowerConstants.leftFrontMotorDirection = DcMotorEx.Direction.REVERSE;
        FollowerConstants.leftRearMotorDirection = DcMotorEx.Direction.REVERSE;
        FollowerConstants.rightFrontMotorDirection = DcMotorEx.Direction.FORWARD;
        FollowerConstants.rightRearMotorDirection = DcMotorEx.Direction.FORWARD;

        FollowerConstants.mass = 12.2;              //V2 weight

        FollowerConstants.xMovement = 60;      /** default=57.8741  V1=60 need to run section 4.1 ForwardVelocityTuner at full battery */
        FollowerConstants.yMovement = 46;       /** default=52.295  V1=46 need to run section 4.2 Strafe VelocityTuner */

        FollowerConstants.forwardZeroPowerAcceleration = -37;   /** default=-41.278  V1=-37 need to run section 5.1 forwardZeroPowerAccelerationTuner */
        FollowerConstants.lateralZeroPowerAcceleration = -65;  /** default=-59.7819  V1=-65 need to run section 5.2 lateralZeroPowerAccelerationTuner */

        FollowerConstants.translationalPIDFCoefficients.setCoefficients(0.41,0,0.050,0);      /**  default: CustomPIDFCoefficients(0.1,0,0.01,0); //V1=0.41,0,0.050,0;  */
        FollowerConstants.useSecondaryTranslationalPID = false;
        FollowerConstants.secondaryTranslationalPIDFCoefficients.setCoefficients(0.1,0,0.01,0); // Not being used, @see useSecondaryTranslationalPID

        FollowerConstants.headingPIDFCoefficients.setCoefficients(2,0,0.02,0);               /**  default: CustomPIDFCoefficients(2,0,0.1,0);   //V1=2,0,0.02,0  */
        FollowerConstants.useSecondaryHeadingPID = false;
        FollowerConstants.secondaryHeadingPIDFCoefficients.setCoefficients(2,0,0.1,0); // Not being used, @see useSecondaryHeadingPID

        FollowerConstants.drivePIDFCoefficients.setCoefficients(0.01,0,0.000001,0.6,0);         /**  default: CustomFilteredPIDFCoefficients(0.1,0,0,0.6,0);   //V1=0.01,0,0.000001,0.6,0  */
        FollowerConstants.useSecondaryDrivePID = false;
        FollowerConstants.secondaryDrivePIDFCoefficients.setCoefficients(0.1,0,0,0.6,0); // Not being used, @see useSecondaryDrivePID

        FollowerConstants.zeroPowerAccelerationMultiplier = 4;          /**  default=V1=4;   See section 9. Drive PID  */
        FollowerConstants.centripetalScaling = 0.000020;                  /**  default=0.0005; V1=0.000020    */

        FollowerConstants.pathEndTimeoutConstraint = 500;
        FollowerConstants.pathEndTValueConstraint = 0.995;
        FollowerConstants.pathEndVelocityConstraint = 0.1;
        FollowerConstants.pathEndTranslationalConstraint = 0.1;
        FollowerConstants.pathEndHeadingConstraint = 0.007;
    }
}
