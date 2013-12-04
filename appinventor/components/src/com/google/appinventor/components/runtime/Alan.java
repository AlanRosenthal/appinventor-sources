// -*- mode: java; c-basic-offset: 2; -*-
// Copyright 2009-2011 Google, All Rights reserved
// Copyright 2011-2012 MIT, All rights reserved
// Released under the MIT License https://raw.github.com/mit-cml/app-inventor/master/mitlicense.txt

package com.google.appinventor.components.runtime;

import com.google.appinventor.components.annotations.DesignerComponent;
import com.google.appinventor.components.annotations.DesignerProperty;
import com.google.appinventor.components.annotations.PropertyCategory;
import com.google.appinventor.components.annotations.SimpleFunction;
import com.google.appinventor.components.annotations.SimpleObject;
import com.google.appinventor.components.annotations.SimpleProperty;
import com.google.appinventor.components.common.ComponentCategory;
import com.google.appinventor.components.common.PropertyTypeConstants;
import com.google.appinventor.components.common.YaVersion;

// TODO(lizlooney) - We need to document what configuration of robot this component will work
// with.
/**
 * A component that provides a high-level interface to a LEGO MINDSTORMS NXT
 * robot, with functions that can move and turn the robot.
 * 
 * @author lizlooney@google.com (Liz Looney)
 */
@DesignerComponent(version = YaVersion.NXT_DRIVE_COMPONENT_VERSION, description = "AA component that provides a high-level interface to a LEGO MINDSTORMS NXT "
		+ "robot, with functions that can move and turn the robot.", category = ComponentCategory.ISENSE, nonVisible = true, iconName = "images/legoMindstormsNxt.png")
@SimpleObject
public class Alan extends iSENSE {

	private String lastName;
	private int age;
	/**
	 * Creates a new Alan component.
	 */
	public Alan(ComponentContainer container) {
		super(container, "Alan");
		lastName = "ROSENTHAL";
		age = 25;
	}

	/**
	 * Specifies the motor ports that are used for driving.
	 */
	@DesignerProperty(editorType = PropertyTypeConstants.PROPERTY_TYPE_STRING, defaultValue = "ROSENTHAL")
	@SimpleProperty
	public void LastName(String Str) {
		lastName = Str;
	}
	/**
	 * Returns the text displayed by the button.
	 * 
	 * @return button caption
	 */
	@SimpleProperty(category = PropertyCategory.APPEARANCE)
	public String LastName() {
		return lastName + "TEST";
	}

	@SimpleFunction(description = "asdf")
	public void CalcAge(int birthyear, int currentyear)
	{
		age = currentyear - birthyear;
	}
	
	@SimpleProperty(category = PropertyCategory.APPEARANCE)
	public int Age()
	{
		return age;
	}


}
