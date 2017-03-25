/*
 * Copyright 2013 Profile Systems, All Rights Reserved.
 */
package com.profileSystems.psNiagaraDriver.Widget;

import javax.baja.control.*;
import javax.baja.sys.*;
import javax.baja.units.BUnit;

import com.profileSystems.psNiagaraDriver.Widget.BPsNiagaraDriverWidgetProxyExt;

public class BPsSunsetOffset extends BNumericWritable
{
  /*-
  class BPsSunsetOffset
  {
   
    properties 
	 {
	      facets : BFacets
         flags { readonly }
         default{[BFacets.makeNumeric(BUnit.getUnit("minute"), BInteger.make(0), BDouble.make(-60), BDouble.make(60))]}         
         
        proxyExt : BPsNiagaraDriverWidgetProxyExt
         default{[new BPsNiagaraDriverWidgetProxyExt()]}
	 }
	 
	 actions
     {
       
     }
  }
  -*/
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.profileSystems.psNiagaraDriver.Widget.BPsSunsetOffset(4182138803)1.0$ @*/
/* Generated Mon Mar 17 20:07:06 CDT 2014 by Slot-o-Matic 2000 (c) Tridium, Inc. 2000 */

////////////////////////////////////////////////////////////////
// Property "facets"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>facets</code> property.
   * @see com.profileSystems.psNiagaraDriver.Widget.BPsSunsetOffset#getFacets
   * @see com.profileSystems.psNiagaraDriver.Widget.BPsSunsetOffset#setFacets
   */
  public static final Property facets = newProperty(Flags.READONLY, BFacets.makeNumeric(BUnit.getUnit("minute"), BInteger.make(0), BDouble.make(-60), BDouble.make(60)),null);
  
  /**
   * Get the <code>facets</code> property.
   * @see com.profileSystems.psNiagaraDriver.Widget.BPsSunsetOffset#facets
   */
  public BFacets getFacets() { return (BFacets)get(facets); }
  
  /**
   * Set the <code>facets</code> property.
   * @see com.profileSystems.psNiagaraDriver.Widget.BPsSunsetOffset#facets
   */
  public void setFacets(BFacets v) { set(facets,v,null); }

////////////////////////////////////////////////////////////////
// Property "proxyExt"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>proxyExt</code> property.
   * @see com.profileSystems.psNiagaraDriver.Widget.BPsSunsetOffset#getProxyExt
   * @see com.profileSystems.psNiagaraDriver.Widget.BPsSunsetOffset#setProxyExt
   */
  public static final Property proxyExt = newProperty(0, new BPsNiagaraDriverWidgetProxyExt(),null);
  
  /**
   * Get the <code>proxyExt</code> property.
   * @see com.profileSystems.psNiagaraDriver.Widget.BPsSunsetOffset#proxyExt
   */
  public BPsNiagaraDriverWidgetProxyExt getProxyExt() { return (BPsNiagaraDriverWidgetProxyExt)get(proxyExt); }
  
  /**
   * Set the <code>proxyExt</code> property.
   * @see com.profileSystems.psNiagaraDriver.Widget.BPsSunsetOffset#proxyExt
   */
  public void setProxyExt(BPsNiagaraDriverWidgetProxyExt v) { set(proxyExt,v,null); }

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BPsSunsetOffset.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

	
}