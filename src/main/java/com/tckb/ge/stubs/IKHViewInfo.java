
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
 * Dispatch: IKHViewInfo
 * Description: IKHViewInfo Interface
 * Help file:   
 *
 * @author JawinTypeBrowser
 */

public class IKHViewInfo extends DispatchPtr {
	public static final GUID DIID = new GUID("{45f89e39-7a46-4ca4-97E3-8C5AA252531C}");
	public static final int IID_TOKEN;
	static {
		IID_TOKEN = IdentityManager.registerProxy(DIID, IKHViewInfo.class);
	}

	/**
	 * The required public no arg constructor.
	 * <br><br>
	 * <b>Important:</b>Should never be used as this creates an uninitialized
	 * IKHViewInfo (it is required by Jawin for some internal working though).
	 */
	public IKHViewInfo() {
		super();
	}

	/**
	 * For creating a new COM-object with the given progid and with 
	 * the IKHViewInfo interface.
	 * 
	 * @param progid the progid of the COM-object to create.
	 */
	public IKHViewInfo(String progid) throws COMException {
		super(progid, DIID);
	}

	/**
	 * For creating a new COM-object with the given clsid and with 
	 * the IKHViewInfo interface.
	 * 
	 * @param clsid the GUID of the COM-object to create.
	 */
	public IKHViewInfo(GUID clsid) throws COMException {
		super(clsid, DIID);
	}

	/**
	 * For getting the IKHViewInfo interface on an existing COM-object.
	 * This is an alternative to calling {@link #queryInterface(Class)}
	 * on comObject.
	 * 
	 * @param comObject the COM-object to get the IKHViewInfo interface on.
	 */
	public IKHViewInfo(COMPtr comObject) throws COMException {
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
    * @return double
    **/
    public double getLatitude() throws COMException
    {
         return ((Double)get("Latitude")).doubleValue();
    }
        
    /**
    *
    * @param Latitude
    **/
    public void setLatitude(double Latitude) throws COMException
    {
        put("Latitude", Latitude);
    }
        
    /**
    *
    * @return double
    **/
    public double getLongitude() throws COMException
    {
         return ((Double)get("Longitude")).doubleValue();
    }
        
    /**
    *
    * @param Longitude
    **/
    public void setLongitude(double Longitude) throws COMException
    {
        put("Longitude", Longitude);
    }
        
    /**
    *
    * @return double
    **/
    public double getRange() throws COMException
    {
         return ((Double)get("Range")).doubleValue();
    }
        
    /**
    *
    * @param Range
    **/
    public void setRange(double Range) throws COMException
    {
        put("Range", Range);
    }
        
    /**
    *
    * @return double
    **/
    public double getTilt() throws COMException
    {
         return ((Double)get("Tilt")).doubleValue();
    }
        
    /**
    *
    * @param Tilt
    **/
    public void setTilt(double Tilt) throws COMException
    {
        put("Tilt", Tilt);
    }
        
    /**
    *
    * @return double
    **/
    public double getAzimuth() throws COMException
    {
         return ((Double)get("Azimuth")).doubleValue();
    }
        
    /**
    *
    * @param Azimuth
    **/
    public void setAzimuth(double Azimuth) throws COMException
    {
        put("Azimuth", Azimuth);
    }
        
}
