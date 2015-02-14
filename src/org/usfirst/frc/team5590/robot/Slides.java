// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc.team5590.robot;


import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class Slides extends Subsystem {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private Victor drawerSlide = RobotMap.slidesDrawerSlide;
    private Encoder sliderControl = RobotMap.sliderEncoder;
    //Pulse count for fully extended drawer
    private double FULL_EXTEND = 27;
    private double curDistance;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public void init() {
    	sliderControl.reset();
    	curDistance = 0;
    }
    
    public boolean extend() {
    	if (sliderControl.getDistance() < (FULL_EXTEND - curDistance)) {
    		drawerSlide.set(.7);
    		return true;
    	} else {
    		return false;
    	}
    }
    
    public boolean retract() {
    	if(sliderControl.getDistance() > (FULL_EXTEND + curDistance)) {
    		drawerSlide.set(-.7);
    		return true;
    	} else {
    		return false;
    	}
    }
    
    public void setX(double amount) {
    	drawerSlide.set(amount);
//    	if((FULL_EXTEND>0)&&(sliderControl.getDistance()>(FULL_EXTEND + curDistance))
//    			||(FULL_EXTEND<0)&&(sliderControl.getDistance()<(FULL_EXTEND + curDistance))){
//    				//Checks if the slide is fully extended or retracted
//    		drawerSlide.set(0);
//    	}
    }

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

