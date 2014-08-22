
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
 * Dispatch: IKHInterface
 * Description: IKHInterface Interface
 * Help file:   
 *
 * @author JawinTypeBrowser
 */

public class IKHInterface extends DispatchPtr {
	public static final GUID DIID = new GUID("{80a43f86-e2cd-4671-A7FA-E5627B519711}");
	public static final int IID_TOKEN;
	static {
		IID_TOKEN = IdentityManager.registerProxy(DIID, IKHInterface.class);
	}

	/**
	 * The required public no arg constructor.
	 * <br><br>
	 * <b>Important:</b>Should never be used as this creates an uninitialized
	 * IKHInterface (it is required by Jawin for some internal working though).
	 */
	public IKHInterface() {
		super();
	}

	/**
	 * For creating a new COM-object with the given progid and with 
	 * the IKHInterface interface.
	 * 
	 * @param progid the progid of the COM-object to create.
	 */
	public IKHInterface(String progid) throws COMException {
		super(progid, DIID);
	}

	/**
	 * For creating a new COM-object with the given clsid and with 
	 * the IKHInterface interface.
	 * 
	 * @param clsid the GUID of the COM-object to create.
	 */
	public IKHInterface(GUID clsid) throws COMException {
		super(clsid, DIID);
	}

	/**
	 * For getting the IKHInterface interface on an existing COM-object.
	 * This is an alternative to calling {@link #queryInterface(Class)}
	 * on comObject.
	 * 
	 * @param comObject the COM-object to get the IKHInterface interface on.
	 */
	public IKHInterface(COMPtr comObject) throws COMException {
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
    
    * @param terrain
    * @return void
    **/
    public IKHViewInfo currentView(int terrain) throws COMException
    {
      IKHViewInfo res = new IKHViewInfo();
          DispatchPtr dispPtr = (DispatchPtr)invokeN("currentView", new Object[] {new Integer(terrain)});
          res.stealUnknown(dispPtr);
          return res;
        
    }
    /**
    *
    * @return int
    **/
    public int getStreamingProgressPercentage() throws COMException
    {
        return ((Integer)get("StreamingProgressPercentage")).intValue();
    }
        
    /**
    *
    
    * @param fileName
    * @param quality
    * @return void
    **/
    public void SaveScreenShot(String fileName,int quality) throws COMException
    {
      
		invokeN("SaveScreenShot", new Object[] {fileName, new Integer(quality)});
        
    }
    /**
    *
    
    * @param fileName
    * @return void
    **/
    public void OpenFile(String fileName) throws COMException
    {
      
		invokeN("OpenFile", new Object[] {fileName});
        
    }
    /**
    *
    
    * @return void
    **/
    public void QuitApplication() throws COMException
    {
      
		invokeN("QuitApplication", new Object[] {});
        
    }
    /**
    *
    
    * @param width
    * @param height
    * @return void
    **/
    public void SetRenderWindowSize(int width,int height) throws COMException
    {
      
		invokeN("SetRenderWindowSize", new Object[] {new Integer(width), new Integer(height)});
        
    }
    /**
    *
    * @return double
    **/
    public double getAutoPilotSpeed() throws COMException
    {
         return ((Double)get("AutoPilotSpeed")).doubleValue();
    }
        
    /**
    *
    * @param AutoPilotSpeed
    **/
    public void setAutoPilotSpeed(double AutoPilotSpeed) throws COMException
    {
        put("AutoPilotSpeed", AutoPilotSpeed);
    }
        
    /**
    *
    * @return void
    **/
    public IKHViewExtents getcurrentViewExtents() throws COMException
    {
        IKHViewExtents res = new IKHViewExtents();
          DispatchPtr dispPtr = (DispatchPtr)get("currentViewExtents");
          res.stealUnknown(dispPtr);
          return res;
    }
        
    /**
    *
    
    * @param terrain
    * @param speed
    * @return void
    **/
    public void setView(Object[] view,int terrain,double speed) throws COMException
    {
      
		invokeN("setView", new Object[] {view, new Integer(terrain), new Double(speed)});
        
    }
    /**
    *
    
    * @return void
    **/
    public void LoadKml(String[] kmlData) throws COMException
    {
      
		invokeN("LoadKml", new Object[] {kmlData});
        
    }
    /**
    *
    
    * @param Name
    * @return void
    **/
    public IKHFeature GetFeatureByName(String Name) throws COMException
    {
      IKHFeature res = new IKHFeature();
          DispatchPtr dispPtr = (DispatchPtr)invokeN("GetFeatureByName", new Object[] {Name});
          res.stealUnknown(dispPtr);
          return res;
        
    }
    /**
    *
    
    * @param lat
    * @param lon
    * @param Range
    * @param Tilt
    * @param Azimuth
    * @param terrain
    * @param speed
    * @return void
    **/
    public void setViewParams(double lat,double lon,double Range,double Tilt,double Azimuth,int terrain,double speed) throws COMException
    {
      
		invokeN("setViewParams", new Object[] {new Double(lat), new Double(lon), new Double(Range), new Double(Tilt), new Double(Azimuth), new Integer(terrain), new Double(speed)});
        
    }
    /**
    *
    
    * @param speed
    * @return void
    **/
    public void SetFeatureView(Object[] feature,double speed) throws COMException
    {
      
		invokeN("SetFeatureView", new Object[] {feature, new Double(speed)});
        
    }
    /**
    *
    
    * @param screen_x
    * @param screen_y
    * @return Object[]
    **/
    public Object[] GetPointOnTerrainFromScreenCoords(double screen_x,double screen_y) throws COMException
    {
      
          return null;  //Object[] not implemented
        
    }
    /**
    *
    
    * @return void
    **/
    public void getCurrentVersion(int[] major,int[] minor,int[] build,int[] appType) throws COMException
    {
      
		invokeN("getCurrentVersion", new Object[] {major, minor, build, appType});
        
    }
    /**
    *
    
    * @return void
    **/
    public void isClientInitialized(int[] IsInitialized) throws COMException
    {
      
		invokeN("isClientInitialized", new Object[] {IsInitialized});
        
    }
}
