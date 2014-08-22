
package com.tckb.ge.stubs;

import org.jawin.*;
import org.jawin.constants.*;
import org.jawin.marshal.*;
import org.jawin.io.*;
import java.io.*;
import java.util.Date;

/**
 * Jawin generated code please do not edit
 *
 * Dispatch: IAnimationControllerGE
 * Description: IAnimationControllerGE Interface
 * Help file:   
 *
 * @author JawinTypeBrowser
 */

public class IAnimationControllerGE extends DispatchPtr {
	public static final GUID DIID = new GUID("{be5e5f15-8ec4-4dcc-B48D-9957D2DE4D05}");
	public static final int IID_TOKEN;
	static {
		IID_TOKEN = IdentityManager.registerProxy(DIID, IAnimationControllerGE.class);
	}

	/**
	 * The required public no arg constructor.
	 * <br><br>
	 * <b>Important:</b>Should never be used as this creates an uninitialized
	 * IAnimationControllerGE (it is required by Jawin for some internal working though).
	 */
	public IAnimationControllerGE() {
		super();
	}

	/**
	 * For creating a new COM-object with the given progid and with 
	 * the IAnimationControllerGE interface.
	 * 
	 * @param progid the progid of the COM-object to create.
	 */
	public IAnimationControllerGE(String progid) throws COMException {
		super(progid, DIID);
	}

	/**
	 * For creating a new COM-object with the given clsid and with 
	 * the IAnimationControllerGE interface.
	 * 
	 * @param clsid the GUID of the COM-object to create.
	 */
	public IAnimationControllerGE(GUID clsid) throws COMException {
		super(clsid, DIID);
	}

	/**
	 * For getting the IAnimationControllerGE interface on an existing COM-object.
	 * This is an alternative to calling {@link #queryInterface(Class)}
	 * on comObject.
	 * 
	 * @param comObject the COM-object to get the IAnimationControllerGE interface on.
	 */
	public IAnimationControllerGE(COMPtr comObject) throws COMException {
		super(comObject);
	}

	public int getIIDToken() {
		return IID_TOKEN;
	}
	
	
    /**
    *
    
    * @return void
    **/
    /*public void QueryInterface(Object[] riid,void[] 
        [] ppvObj) throws COMException
    {
      
		invokeN("QueryInterface", new Object[] {riid, ppvObj});
        
    }*/
    /**
    *
    
    * @return int
    **/
    /*public int AddRef() throws COMException
    {
      
		return ((Integer)invokeN("AddRef", new Object[] {})).intValue();
        
    }*/
    /**
    *
    
    * @return int
    **/
    /*public int Release() throws COMException
    {
      
		return ((Integer)invokeN("Release", new Object[] {})).intValue();
        
    }*/
    /**
    *
    
    * @return void
    **/
    /*public void GetTypeInfoCount(int[] pctinfo) throws COMException
    {
      
		invokeN("GetTypeInfoCount", new Object[] {pctinfo});
        
    }*/
    /**
    *
    
    * @param itinfo
    * @param lcid
    * @return void
    **/
    /*public void GetTypeInfo(int itinfo,int lcid,void[] 
        [] pptinfo) throws COMException
    {
      
		invokeN("GetTypeInfo", new Object[] {new Integer(itinfo), new Integer(lcid), pptinfo});
        
    }*/
    /**
    *
    
    * @param cNames
    * @param lcid
    * @return void
    **/
    /*public void GetIDsOfNames(Object[] riid,int[] 
        [] rgszNames,int cNames,int lcid,int[] rgdispid) throws COMException
    {
      
		invokeN("GetIDsOfNames", new Object[] {riid, rgszNames, new Integer(cNames), new Integer(lcid), rgdispid});
        
    }*/
    /**
    *
    
    * @param dispidMember
    * @param lcid
    * @param wFlags
    * @return void
    **/
    /*public void Invoke(int dispidMember,Object[] riid,int lcid,short wFlags,Object[] pdispparams,Variant[] pvarResult,Object[] pexcepinfo,int[] puArgErr) throws COMException
    {
      
		invokeN("Invoke", new Object[] {new Integer(dispidMember), riid, new Integer(lcid), new Short(wFlags), pdispparams, pvarResult, pexcepinfo, puArgErr});
        
    }*/
    /**
    *
    
    * @return void
    **/
    public void Play() throws COMException
    {
      
		invokeN("Play", new Object[] {});
        
    }
    /**
    *
    
    * @return void
    **/
    public void Pause() throws COMException
    {
      
		invokeN("Pause", new Object[] {});
        
    }
    /**
    *
    * @return void
    **/
    public ITimeIntervalGE getSliderTimeInterval() throws COMException
    {
        ITimeIntervalGE res = new ITimeIntervalGE();
          DispatchPtr dispPtr = (DispatchPtr)get("SliderTimeInterval");
          res.stealUnknown(dispPtr);
          return res;
    }
        
    /**
    *
    * @return void
    **/
    public ITimeIntervalGE getCurrentTimeInterval() throws COMException
    {
        ITimeIntervalGE res = new ITimeIntervalGE();
          DispatchPtr dispPtr = (DispatchPtr)get("CurrentTimeInterval");
          res.stealUnknown(dispPtr);
          return res;
    }
        
    /**
    *
    * @param CurrentTimeInterval
    **/
    public void setCurrentTimeInterval(Object[] CurrentTimeInterval) throws COMException
    {
        put("CurrentTimeInterval", CurrentTimeInterval);
    }
        
}
