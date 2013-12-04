// -*- mode: java; c-basic-offset: 2; -*-
// Copyright 2009-2011 Google, All Rights reserved
// Copyright 2011-2012 MIT, All rights reserved
// Released under the MIT License https://raw.github.com/mit-cml/app-inventor/master/mitlicense.txt

package com.google.appinventor.components.runtime;

import com.google.appinventor.components.annotations.SimpleObject;

/**
 * A base class for components that can control a LEGO MINDSTORMS NXT robot.
 *
 * @author lizlooney@google.com (Liz Looney)
 */
@SimpleObject
public class iSENSE extends AndroidNonvisibleComponent
    implements Component {
 


  /**
   * Creates a new iSENSE.
   */
  protected iSENSE(ComponentContainer container, String logTag) {
    super(container.$form());
  }

  /**
   * This constructor is for testing purposes only.
   */
  protected iSENSE() {
    super(null);
  }

  /**
   * Default Initialize
   */
  public final void Initialize() {
  }


}
