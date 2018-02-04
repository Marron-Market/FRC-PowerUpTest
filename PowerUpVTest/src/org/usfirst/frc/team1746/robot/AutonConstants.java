package org.usfirst.frc.team1746.robot;

public class AutonConstants {

	   public static final double DefaultDrivingSpeed=0.75;
	   public static final double DefaultTurningSpeed=0.5;
	   public static final double DefaultElevatorSpeed=0.3;
	   public static final double DefaultInOutSpeed=0.4;
	   
	   /*
	    * Field Distances - Use the Robot's center (based on turning axis) for all measurements
	    */
	   public static final double StartToLane1=30;
	   public static final double StartToSwitch=55.3;
	   public static final double Lane1ToSwitch=StartToSwitch-StartToLane1;
	   public static final double StartToMidSwitch=72.3;
	   public static final double StartToLane2=110.7;
	   public static final double Lane2ToSwitch=15.15;
	   public static final double StartToScale=130.75;
	   public static final double StartToMidScale=143.0;
	   public static final double OutsideToSwitch=18.2;
	   public static final double SwitchHeight=14.3;
	   
	   /*
	    * Commands:
	    * 
	    *     A - Ahead (drive straight at the default speed for the given number of inches)
	    *     B - Backward (drive straight in reverse at the default speed for the given number of inches)
	    *     R - Right (turn right at the default speed exactly 90 degrees)
	    *     L - Left (turn left at the default speed exactly 90 degrees)
	    *     U - Up (raise the elevator at the default speed for the given number of inches)
	    *     D - Down (lower the elevator at the default speed for the given number of inches)
	    *     O - Output (put the cube out at the default speed)
	    *     I - Input (get a cube in at the default speed)
	    *     
	    */
	   public static final String[][] commands = new String[][] {
		   {																															// FROM 1
			   "!",																														//        TO 4
		       "!",																														//        TO 5
			   "!",																														//        TO 6
			   "!",																														//        TO 7
			   "A"+StartToMidSwitch+",0.5"+"R"+"A"+OutsideToSwitch+"U"+SwitchHeight+"O",												//        TO 8
			   "!",																														//        TO 9
			   "!",																														//        TO 10
		       "!",																														//        TO 11
		       "!",																														//        TO 12
		       "!",																														//        TO 13
		       "!",																														//        TO 14
		       "!",																														//        TO 15
		       "!",																														//        TO 16
		       "!",																														//        TO 17
		       "!",																														//        TO 18
		       "!",																														//        TO 19		       
		   },
		   {																															// FROM 2
			   "!",																														//        TO 4
		       "!",																														//        TO 5
			   "!",																														//        TO 6
			   "!",																														//        TO 7
			   "!",																														//        TO 8
			   "!",																														//        TO 9
			   "!",																														//        TO 10
		       "!",																														//        TO 11
		       "!",																														//        TO 12
		       "!",																														//        TO 13
		       "!",																														//        TO 14
		       "!",																														//        TO 15
		       "!",																														//        TO 16
		       "!",																														//        TO 17
		       "!",																														//        TO 18
		       "!",																														//        TO 19		       
		   },
		   {																															// FROM 3
			   "!",																														//        TO 4
		       "!",																														//        TO 5
			   "!",																														//        TO 6
			   "!",																														//        TO 7
			   "!",																														//        TO 8
			   "!",																														//        TO 9
			   "!",																														//        TO 10
		       "!",																														//        TO 11
		       "!",																														//        TO 12
		       "!",																														//        TO 13
		       "!",																														//        TO 14
		       "!",																														//        TO 15
		       "!",																														//        TO 16
		       "!",																														//        TO 17
		       "!",																														//        TO 18
		       "!",																														//        TO 19		       
		   },
		   {																															// FROM 4
			   "!",																														//        TO 4
		       "!",																														//        TO 5
			   "!",																														//        TO 6
			   "!",																														//        TO 7
			   "!",																														//        TO 8
			   "!",																														//        TO 9
			   "!",																														//        TO 10
		       "!",																														//        TO 11
		       "!",																														//        TO 12
		       "!",																														//        TO 13
		       "!",																														//        TO 14
		       "!",																														//        TO 15
		       "!",																														//        TO 16
		       "!",																														//        TO 17
		       "!",																														//        TO 18
		       "!",																														//        TO 19		       
		   },
		   {																															// FROM 5
			   "!",																														//        TO 4
		       "!",																														//        TO 5
			   "!",																														//        TO 6
			   "!",																														//        TO 7
			   "!",																														//        TO 8
			   "!",																														//        TO 9
			   "!",																														//        TO 10
		       "!",																														//        TO 11
		       "!",																														//        TO 12
		       "!",																														//        TO 13
		       "!",																														//        TO 14
		       "!",																														//        TO 15
		       "!",																														//        TO 16
		       "!",																														//        TO 17
		       "!",																														//        TO 18
		       "!",																														//        TO 19		       
		   },
		   {																															// FROM 6
			   "!",																														//        TO 4
		       "!",																														//        TO 5
			   "!",																														//        TO 6
			   "!",																														//        TO 7
			   "!",																														//        TO 8
			   "!",																														//        TO 9
			   "!",																														//        TO 10
		       "!",																														//        TO 11
		       "!",																														//        TO 12
		       "!",																														//        TO 13
		       "!",																														//        TO 14
		       "!",																														//        TO 15
		       "!",																														//        TO 16
		       "!",																														//        TO 17
		       "!",																														//        TO 18
		       "!",																														//        TO 19		       
		   },
		   {																															// FROM 7
			   "!",																														//        TO 4
		       "!",																														//        TO 5
			   "!",																														//        TO 6
			   "!",																														//        TO 7
			   "!",																														//        TO 8
			   "!",																														//        TO 9
			   "!",																														//        TO 10
		       "!",																														//        TO 11
		       "!",																														//        TO 12
		       "!",																														//        TO 13
		       "!",																														//        TO 14
		       "!",																														//        TO 15
		       "!",																														//        TO 16
		       "!",																														//        TO 17
		       "!",																														//        TO 18
		       "!",																														//        TO 19		       
		   },
		   {																															// FROM 8
			   "!",																														//        TO 4
		       "!",																														//        TO 5
			   "!",																														//        TO 6
			   "!",																														//        TO 7
			   "!",																														//        TO 8
			   "!",																														//        TO 9
			   "!",																														//        TO 10
		       "!",																														//        TO 11
		       "!",																														//        TO 12
		       "!",																														//        TO 13
		       "!",																														//        TO 14
		       "!",																														//        TO 15
		       "!",																														//        TO 16
		       "!",																														//        TO 17
		       "!",																														//        TO 18
		       "!",																														//        TO 19		       
		   },
		   {																															// FROM 9
			   "!",																														//        TO 4
		       "!",																														//        TO 5
			   "!",																														//        TO 6
			   "!",																														//        TO 7
			   "!",																														//        TO 8
			   "!",																														//        TO 9
			   "!",																														//        TO 10
		       "!",																														//        TO 11
		       "!",																														//        TO 12
		       "!",																														//        TO 13
		       "!",																														//        TO 14
		       "!",																														//        TO 15
		       "!",																														//        TO 16
		       "!",																														//        TO 17
		       "!",																														//        TO 18
		       "!",																														//        TO 19		       
		   },
		   {																															// FROM 10
			   "!",																														//        TO 4
		       "!",																														//        TO 5
			   "!",																														//        TO 6
			   "!",																														//        TO 7
			   "!",																														//        TO 8
			   "!",																														//        TO 9
			   "!",																														//        TO 10
		       "!",																														//        TO 11
		       "!",																														//        TO 12
		       "!",																														//        TO 13
		       "!",																														//        TO 14
		       "!",																														//        TO 15
		       "!",																														//        TO 16
		       "!",																														//        TO 17
		       "!",																														//        TO 18
		       "!",																														//        TO 19		       
		   },
		   {																															// FROM 11
			   "!",																														//        TO 4
		       "!",																														//        TO 5
			   "!",																														//        TO 6
			   "!",																														//        TO 7
			   "!",																														//        TO 8
			   "!",																														//        TO 9
			   "!",																														//        TO 10
		       "!",																														//        TO 11
		       "!",																														//        TO 12
		       "!",																														//        TO 13
		       "!",																														//        TO 14
		       "!",																														//        TO 15
		       "!",																														//        TO 16
		       "!",																														//        TO 17
		       "!",																														//        TO 18
		       "!",																														//        TO 19		       
		   },
		   {																															// FROM 12
			   "!",																														//        TO 4
		       "!",																														//        TO 5
			   "!",																														//        TO 6
			   "!",																														//        TO 7
			   "!",																														//        TO 8
			   "!",																														//        TO 9
			   "!",																														//        TO 10
		       "!",																														//        TO 11
		       "!",																														//        TO 12
		       "!",																														//        TO 13
		       "!",																														//        TO 14
		       "!",																														//        TO 15
		       "!",																														//        TO 16
		       "!",																														//        TO 17
		       "!",																														//        TO 18
		       "!",																														//        TO 19		       
		   },
		   {																															// FROM 13
			   "!",																														//        TO 4
		       "!",																														//        TO 5
			   "!",																														//        TO 6
			   "!",																														//        TO 7
			   "!",																														//        TO 8
			   "!",																														//        TO 9
			   "!",																														//        TO 10
		       "!",																														//        TO 11
		       "!",																														//        TO 12
		       "!",																														//        TO 13
		       "!",																														//        TO 14
		       "!",																														//        TO 15
		       "!",																														//        TO 16
		       "!",																														//        TO 17
		       "!",																														//        TO 18
		       "!",																														//        TO 19		       
		   },
		   {																															// FROM 14
			   "!",																														//        TO 4
		       "!",																														//        TO 5
			   "!",																														//        TO 6
			   "!",																														//        TO 7
			   "!",																														//        TO 8
			   "!",																														//        TO 9
			   "!",																														//        TO 10
		       "!",																														//        TO 11
		       "!",																														//        TO 12
		       "!",																														//        TO 13
		       "!",																														//        TO 14
		       "!",																														//        TO 15
		       "!",																														//        TO 16
		       "!",																														//        TO 17
		       "!",																														//        TO 18
		       "!",																														//        TO 19		       
		   },
		   {																															// FROM 15
			   "!",																														//        TO 4
		       "!",																														//        TO 5
			   "!",																														//        TO 6
			   "!",																														//        TO 7
			   "!",																														//        TO 8
			   "!",																														//        TO 9
			   "!",																														//        TO 10
		       "!",																														//        TO 11
		       "!",																														//        TO 12
		       "!",																														//        TO 13
		       "!",																														//        TO 14
		       "!",																														//        TO 15
		       "!",																														//        TO 16
		       "!",																														//        TO 17
		       "!",																														//        TO 18
		       "!",																														//        TO 19		       
		   },
		   {																															// FROM 16
			   "!",																														//        TO 4
		       "!",																														//        TO 5
			   "!",																														//        TO 6
			   "!",																														//        TO 7
			   "!",																														//        TO 8
			   "!",																														//        TO 9
			   "!",																														//        TO 10
		       "!",																														//        TO 11
		       "!",																														//        TO 12
		       "!",																														//        TO 13
		       "!",																														//        TO 14
		       "!",																														//        TO 15
		       "!",																														//        TO 16
		       "!",																														//        TO 17
		       "!",																														//        TO 18
		       "!",																														//        TO 19		       
		   },
		   {																															// FROM 17
			   "!",																														//        TO 4
		       "!",																														//        TO 5
			   "!",																														//        TO 6
			   "!",																														//        TO 7
			   "!",																														//        TO 8
			   "!",																														//        TO 9
			   "!",																														//        TO 10
		       "!",																														//        TO 11
		       "!",																														//        TO 12
		       "!",																														//        TO 13
		       "!",																														//        TO 14
		       "!",																														//        TO 15
		       "!",																														//        TO 16
		       "!",																														//        TO 17
		       "!",																														//        TO 18
		       "!",																														//        TO 19		       
		   },
		   {																															// FROM 18
			   "!",																														//        TO 4
		       "!",																														//        TO 5
			   "!",																														//        TO 6
			   "!",																														//        TO 7
			   "!",																														//        TO 8
			   "!",																														//        TO 9
			   "!",																														//        TO 10
		       "!",																														//        TO 11
		       "!",																														//        TO 12
		       "!",																														//        TO 13
		       "!",																														//        TO 14
		       "!",																														//        TO 15
		       "!",																														//        TO 16
		       "!",																														//        TO 17
		       "!",																														//        TO 18
		       "!",																														//        TO 19		       
		   },
		   {																															// FROM 19
			   "!",																														//        TO 4
		       "!",																														//        TO 5
			   "!",																														//        TO 6
			   "!",																														//        TO 7
			   "!",																														//        TO 8
			   "!",																														//        TO 9
			   "!",																														//        TO 10
		       "!",																														//        TO 11
		       "!",																														//        TO 12
		       "!",																														//        TO 13
		       "!",																														//        TO 14
		       "!",																														//        TO 15
		       "!",																														//        TO 16
		       "!",																														//        TO 17
		       "!",																														//        TO 18
		       "!",																														//        TO 19		       
		   },
	   };
	   
}
