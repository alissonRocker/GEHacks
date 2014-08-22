
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
 * Dispatch: IApplicationGE
 * Description: IApplicationGE Interface
 * Help file:   
 *
 * @author JawinTypeBrowser
 */

public class IApplicationGE extends DispatchPtr {
	public static final GUID DIID = new GUID("{2830837b-d4e8-48c6-B6EE-04633372ABE4}");
	public static final int IID_TOKEN;
	static {
		IID_TOKEN = IdentityManager.registerProxy(DIID, IApplicationGE.class);
	}

	/**
	 * The required public no arg constructor.
	 * <br><br>
	 * <b>Important:</b>Should never be used as this creates an uninitialized
	 * IApplicationGE (it is required by Jawin for some internal working though).
	 */
	public IApplicationGE() {
		super();
	}

	/**
	 * For creating a new COM-object with the given progid and with 
	 * the IApplicationGE interface.
	 * 
	 * @param progid the progid of the COM-object to create.
	 */
	public IApplicationGE(String progid) throws COMException {
		super(progid, DIID);
	}

	/**
	 * For creating a new COM-object with the given clsid and with 
	 * the IApplicationGE interface.
	 * 
	 * @param clsid the GUID of the COM-object to create.
	 */
	public IApplicationGE(GUID clsid) throws COMException {
		super(clsid, DIID);
	}

	/**
	 * For getting the IApplicationGE interface on an existing COM-object.
	 * This is an alternative to calling {@link #queryInterface(Class)}
	 * on comObject.
	 * 
	 * @param comObject the COM-object to get the IApplicationGE interface on.
	 */
	public IApplicationGE(COMPtr comObject) throws COMException {
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
    
    * @param considerTerrain
    * @return void
    **/
    public ICameraInfoGE GetCamera(int considerTerrain) throws COMException
    {
      ICameraInfoGE res = new ICameraInfoGE();
          DispatchPtr dispPtr = (DispatchPtr)invokeN("GetCamera", new Object[] {new Integer(considerTerrain)});
          res.stealUnknown(dispPtr);
          return res;
        
    }
    /**
    *
    
    * @param speed
    * @return void
    **/
    // tckb: Modified to set the actual com api
    public void SetCamera(Object camera,double speed) throws COMException
    {
      
		invokeN("SetCamera", new Object[] {camera, new Double(speed)});
        
    }
    /**
    *
    
    * @param lat
    * @param lon
    * @param alt
    * @param altMode
    * @param Range
    * @param Tilt
    * @param Azimuth
    * @param speed
    * @return void
    **/
    public void SetCameraParams(double lat,double lon,double alt,int altMode,double Range,double Tilt,double Azimuth,double speed) throws COMException
    {
      
		invokeN("SetCameraParams", new Object[] {new Double(lat), new Double(lon), new Double(alt), new Integer(altMode), new Double(Range), new Double(Tilt), new Double(Azimuth), new Double(speed)});
        
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
    * @param suppressMessages
    * @return void
    **/
    public void OpenKmlFile(String fileName,int suppressMessages) throws COMException
    {
      
		invokeN("OpenKmlFile", new Object[] {fileName, new Integer(suppressMessages)});
        
    }
    /**
    *
    
    * @return void
    **/
    public void LoadKmlData(String kmlData) throws COMException
    {
      
		invokeN("LoadKmlData", new String[] {kmlData});
        
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
    public IViewExtentsGE getViewExtents() throws COMException
    {
        IViewExtentsGE res = new IViewExtentsGE();
          DispatchPtr dispPtr = (DispatchPtr)get("ViewExtents");
          res.stealUnknown(dispPtr);
          return res;
    }
        
    /**
    *
    
    * @param Name
    * @return void
    **/
    public IFeatureGE GetFeatureByName(String Name) throws COMException
    {
      IFeatureGE res = new IFeatureGE();
          DispatchPtr dispPtr = (DispatchPtr)invokeN("GetFeatureByName", new Object[] {Name});
          res.stealUnknown(dispPtr);
          return res;
        
    }
    /**
    *
    
    * @param href
    * @return void
    **/
    public IFeatureGE GetFeatureByHref(String href) throws COMException
    {
      IFeatureGE res = new IFeatureGE();
          DispatchPtr dispPtr = (DispatchPtr)invokeN("GetFeatureByHref", new Object[] {href});
          res.stealUnknown(dispPtr);
          return res;
        
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
    * @return void
    **/
    public IPointOnTerrainGE GetPointOnTerrainFromScreenCoords(double screen_x,double screen_y) throws COMException
    {
      IPointOnTerrainGE res = new IPointOnTerrainGE();
          DispatchPtr dispPtr = (DispatchPtr)invokeN("GetPointOnTerrainFromScreenCoords", new Object[] {new Double(screen_x), new Double(screen_y)});
          res.stealUnknown(dispPtr);
          return res;
        
    }
    /**
    *
    * @return int
    **/
    public int getVersionMajor() throws COMException
    {
        return ((Integer)get("VersionMajor")).intValue();
    }
        
    /**
    *
    * @return int
    **/
    public int getVersionMinor() throws COMException
    {
        return ((Integer)get("VersionMinor")).intValue();
    }
        
    /**
    *
    * @return int
    **/
    public int getVersionBuild() throws COMException
    {
        return ((Integer)get("VersionBuild")).intValue();
    }
        
    /**
    *
    * @return int
    **/
    public int getVersionAppType() throws COMException
    {
        return ((Integer)get("VersionAppType")).intValue();
    }
        
    /**
    *
    
    * @return int
    **/
    public int IsInitialized() throws COMException
    {
      
		return ((Integer)invokeN("IsInitialized", new Object[] {})).intValue();
        
    }
    /**
    *
    
    * @return int
    **/
    public int IsOnline() throws COMException
    {
      
		return ((Integer)invokeN("IsOnline", new Object[] {})).intValue();
        
    }
    /**
    *
    
    * @return void
    **/
    public void Login() throws COMException
    {
      
		invokeN("Login", new Object[] {});
        
    }
    /**
    *
    
    * @return void
    **/
    public void Logout() throws COMException
    {
      
		invokeN("Logout", new Object[] {});
        
    }
    /**
    *
    
    * @return void
    **/
    public void ShowDescriptionBalloon(Object[] feature) throws COMException
    {
      
		invokeN("ShowDescriptionBalloon", new Object[] {feature});
        
    }
    /**
    *
    
    * @return void
    **/
    public void HideDescriptionBalloons() throws COMException
    {
      
		invokeN("HideDescriptionBalloons", new Object[] {});
        
    }
    /**
    *
    
    * @return void
    **/
    public IFeatureGE GetHighlightedFeature() throws COMException
    {
      IFeatureGE res = new IFeatureGE();
          DispatchPtr dispPtr = (DispatchPtr)invokeN("GetHighlightedFeature", new Object[] {});
          res.stealUnknown(dispPtr);
          return res;
        
    }
    /**
    *
    
    * @return void
    **/
    public IFeatureGE GetMyPlaces() throws COMException
    {
      IFeatureGE res = new IFeatureGE();
          DispatchPtr dispPtr = (DispatchPtr)invokeN("GetMyPlaces", new Object[] {});
          res.stealUnknown(dispPtr);
          return res;
        
    }
    /**
    *
    
    * @return void
    **/
    public IFeatureGE GetTemporaryPlaces() throws COMException
    {
      IFeatureGE res = new IFeatureGE();
          DispatchPtr dispPtr = (DispatchPtr)invokeN("GetTemporaryPlaces", new Object[] {});
          res.stealUnknown(dispPtr);
          return res;
        
    }
    /**
    *
    
    * @return void
    **/
    public IFeatureCollectionGE GetLayersDatabases() throws COMException
    {
      IFeatureCollectionGE res = new IFeatureCollectionGE();
          DispatchPtr dispPtr = (DispatchPtr)invokeN("GetLayersDatabases", new Object[] {});
          res.stealUnknown(dispPtr);
          return res;
        
    }
    /**
    *
    * @return double
    **/
    public double getElevationExaggeration() throws COMException
    {
         return ((Double)get("ElevationExaggeration")).doubleValue();
    }
        
    /**
    *
    * @param ElevationExaggeration
    **/
    public void setElevationExaggeration(double ElevationExaggeration) throws COMException
    {
        put("ElevationExaggeration", ElevationExaggeration);
    }
        
    /**
    *
    
    * @return Object
    **/
    public Object GetMainHwnd() throws COMException
    {
      
          return (Integer)invokeN("GetMainHwnd", new Object[] {});
        
    }
    /**
    *
    * @return void
    **/
    public ITourControllerGE getTourController() throws COMException
    {
        ITourControllerGE res = new ITourControllerGE();
          DispatchPtr dispPtr = (DispatchPtr)get("TourController");
          res.stealUnknown(dispPtr);
          return res;
    }
        
    /**
    *
    * @return void
    **/
    public ISearchControllerGE getSearchController() throws COMException
    {
        ISearchControllerGE res = new ISearchControllerGE();
          DispatchPtr dispPtr = (DispatchPtr)get("SearchController");
          res.stealUnknown(dispPtr);
          return res;
    }
        
    /**
    *
    * @return void
    **/
    public IAnimationControllerGE getAnimationController() throws COMException
    {
        IAnimationControllerGE res = new IAnimationControllerGE();
          DispatchPtr dispPtr = (DispatchPtr)get("AnimationController");
          res.stealUnknown(dispPtr);
          return res;
    }
        
    /**
    *
    
    * @return Object
    **/
    public Object GetRenderHwnd() throws COMException
    {
      
          return (Integer)invokeN("GetRenderHwnd", new Object[] {});
        
    }
}
