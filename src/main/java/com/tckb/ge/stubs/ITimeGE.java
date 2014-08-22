
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
 * Dispatch: ITimeGE
 * Description: ITimeGE Interface
 * Help file:   
 *
 * @author JawinTypeBrowser
 */

public class ITimeGE extends DispatchPtr {
	public static final GUID DIID = new GUID("{e39391ae-51c0-4fbd-9042-F9C5B6094445}");
	public static final int IID_TOKEN;
	static {
		IID_TOKEN = IdentityManager.registerProxy(DIID, ITimeGE.class);
	}

	/**
	 * The required public no arg constructor.
	 * <br><br>
	 * <b>Important:</b>Should never be used as this creates an uninitialized
	 * ITimeGE (it is required by Jawin for some internal working though).
	 */
	public ITimeGE() {
		super();
	}

	/**
	 * For creating a new COM-object with the given progid and with 
	 * the ITimeGE interface.
	 * 
	 * @param progid the progid of the COM-object to create.
	 */
	public ITimeGE(String progid) throws COMException {
		super(progid, DIID);
	}

	/**
	 * For creating a new COM-object with the given clsid and with 
	 * the ITimeGE interface.
	 * 
	 * @param clsid the GUID of the COM-object to create.
	 */
	public ITimeGE(GUID clsid) throws COMException {
		super(clsid, DIID);
	}

	/**
	 * For getting the ITimeGE interface on an existing COM-object.
	 * This is an alternative to calling {@link #queryInterface(Class)}
	 * on comObject.
	 * 
	 * @param comObject the COM-object to get the ITimeGE interface on.
	 */
	public ITimeGE(COMPtr comObject) throws COMException {
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
    * @return int
    **/
    public int getType() throws COMException
    {
        return ((Integer)get("Type")).intValue();
    }
        
    /**
    *
    * @param Type
    **/
    public void setType(int Type) throws COMException
    {
        put("Type", Type);
    }
        
    /**
    *
    * @return int
    **/
    public int getYear() throws COMException
    {
        return ((Integer)get("Year")).intValue();
    }
        
    /**
    *
    * @param Year
    **/
    public void setYear(int Year) throws COMException
    {
        put("Year", Year);
    }
        
    /**
    *
    * @return int
    **/
    public int getMonth() throws COMException
    {
        return ((Integer)get("Month")).intValue();
    }
        
    /**
    *
    * @param Month
    **/
    public void setMonth(int Month) throws COMException
    {
        put("Month", Month);
    }
        
    /**
    *
    * @return int
    **/
    public int getDay() throws COMException
    {
        return ((Integer)get("Day")).intValue();
    }
        
    /**
    *
    * @param Day
    **/
    public void setDay(int Day) throws COMException
    {
        put("Day", Day);
    }
        
    /**
    *
    * @return int
    **/
    public int getHour() throws COMException
    {
        return ((Integer)get("Hour")).intValue();
    }
        
    /**
    *
    * @param Hour
    **/
    public void setHour(int Hour) throws COMException
    {
        put("Hour", Hour);
    }
        
    /**
    *
    * @return int
    **/
    public int getMinute() throws COMException
    {
        return ((Integer)get("Minute")).intValue();
    }
        
    /**
    *
    * @param Minute
    **/
    public void setMinute(int Minute) throws COMException
    {
        put("Minute", Minute);
    }
        
    /**
    *
    * @return int
    **/
    public int getSecond() throws COMException
    {
        return ((Integer)get("Second")).intValue();
    }
        
    /**
    *
    * @param Second
    **/
    public void setSecond(int Second) throws COMException
    {
        put("Second", Second);
    }
        
    /**
    *
    * @return double
    **/
    public double getTimeZone() throws COMException
    {
         return ((Double)get("TimeZone")).doubleValue();
    }
        
    /**
    *
    * @param TimeZone
    **/
    public void setTimeZone(double TimeZone) throws COMException
    {
        put("TimeZone", TimeZone);
    }
        
    /**
    *
    
    * @return void
    **/
    public ITimeGE Clone() throws COMException
    {
      ITimeGE res = new ITimeGE();
          DispatchPtr dispPtr = (DispatchPtr)invokeN("Clone", new Object[] {});
          res.stealUnknown(dispPtr);
          return res;
        
    }
    /**
    *
    
    * @param TimeZone
    * @return void
    **/
    public ITimeGE ConvertToZone(double TimeZone) throws COMException
    {
      ITimeGE res = new ITimeGE();
          DispatchPtr dispPtr = (DispatchPtr)invokeN("ConvertToZone", new Object[] {new Double(TimeZone)});
          res.stealUnknown(dispPtr);
          return res;
        
    }
}
