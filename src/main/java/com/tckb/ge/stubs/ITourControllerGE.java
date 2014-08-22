
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
 * Dispatch: ITourControllerGE
 * Description: ITourControllerGE Interface
 * Help file:   
 *
 * @author JawinTypeBrowser
 */

public class ITourControllerGE extends DispatchPtr {
	public static final GUID DIID = new GUID("{d08577e0-365e-4216-B1A4-19353EAC1602}");
	public static final int IID_TOKEN;
	static {
		IID_TOKEN = IdentityManager.registerProxy(DIID, ITourControllerGE.class);
	}

	/**
	 * The required public no arg constructor.
	 * <br><br>
	 * <b>Important:</b>Should never be used as this creates an uninitialized
	 * ITourControllerGE (it is required by Jawin for some internal working though).
	 */
	public ITourControllerGE() {
		super();
	}

	/**
	 * For creating a new COM-object with the given progid and with 
	 * the ITourControllerGE interface.
	 * 
	 * @param progid the progid of the COM-object to create.
	 */
	public ITourControllerGE(String progid) throws COMException {
		super(progid, DIID);
	}

	/**
	 * For creating a new COM-object with the given clsid and with 
	 * the ITourControllerGE interface.
	 * 
	 * @param clsid the GUID of the COM-object to create.
	 */
	public ITourControllerGE(GUID clsid) throws COMException {
		super(clsid, DIID);
	}

	/**
	 * For getting the ITourControllerGE interface on an existing COM-object.
	 * This is an alternative to calling {@link #queryInterface(Class)}
	 * on comObject.
	 * 
	 * @param comObject the COM-object to get the ITourControllerGE interface on.
	 */
	public ITourControllerGE(COMPtr comObject) throws COMException {
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
    public void PlayOrPause() throws COMException
    {
      
		invokeN("PlayOrPause", new Object[] {});
        
    }
    /**
    *
    
    * @return void
    **/
    public void Stop() throws COMException
    {
      
		invokeN("Stop", new Object[] {});
        
    }
    /**
    *
    * @return double
    **/
    public double getspeed() throws COMException
    {
         return ((Double)get("speed")).doubleValue();
    }
        
    /**
    *
    * @param speed
    **/
    public void setspeed(double speed) throws COMException
    {
        put("speed", speed);
    }
        
    /**
    *
    * @return double
    **/
    public double getPauseDelay() throws COMException
    {
         return ((Double)get("PauseDelay")).doubleValue();
    }
        
    /**
    *
    * @param PauseDelay
    **/
    public void setPauseDelay(double PauseDelay) throws COMException
    {
        put("PauseDelay", PauseDelay);
    }
        
    /**
    *
    * @return int
    **/
    public int getCycles() throws COMException
    {
        return ((Integer)get("Cycles")).intValue();
    }
        
    /**
    *
    * @param Cycles
    **/
    public void setCycles(int Cycles) throws COMException
    {
        put("Cycles", Cycles);
    }
        
}
