
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
 * Dispatch: ISearchControllerGE
 * Description: ISearchControllerGE Interface
 * Help file:   
 *
 * @author JawinTypeBrowser
 */

public class ISearchControllerGE extends DispatchPtr {
	public static final GUID DIID = new GUID("{524e5b0f-d593-45a6-9F87-1BAE7D338373}");
	public static final int IID_TOKEN;
	static {
		IID_TOKEN = IdentityManager.registerProxy(DIID, ISearchControllerGE.class);
	}

	/**
	 * The required public no arg constructor.
	 * <br><br>
	 * <b>Important:</b>Should never be used as this creates an uninitialized
	 * ISearchControllerGE (it is required by Jawin for some internal working though).
	 */
	public ISearchControllerGE() {
		super();
	}

	/**
	 * For creating a new COM-object with the given progid and with 
	 * the ISearchControllerGE interface.
	 * 
	 * @param progid the progid of the COM-object to create.
	 */
	public ISearchControllerGE(String progid) throws COMException {
		super(progid, DIID);
	}

	/**
	 * For creating a new COM-object with the given clsid and with 
	 * the ISearchControllerGE interface.
	 * 
	 * @param clsid the GUID of the COM-object to create.
	 */
	public ISearchControllerGE(GUID clsid) throws COMException {
		super(clsid, DIID);
	}

	/**
	 * For getting the ISearchControllerGE interface on an existing COM-object.
	 * This is an alternative to calling {@link #queryInterface(Class)}
	 * on comObject.
	 * 
	 * @param comObject the COM-object to get the ISearchControllerGE interface on.
	 */
	public ISearchControllerGE(COMPtr comObject) throws COMException {
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
    
    * @param searchString
    * @return void
    **/
    public void Search(String searchString) throws COMException
    {
      
		invokeN("Search", new Object[] {searchString});
        
    }
    /**
    *
    
    * @return int
    **/
    public int IsSearchInProgress() throws COMException
    {
      
		return ((Integer)invokeN("IsSearchInProgress", new Object[] {})).intValue();
        
    }
    /**
    *
    
    * @return void
    **/
    public IFeatureCollectionGE GetResults() throws COMException
    {
      IFeatureCollectionGE res = new IFeatureCollectionGE();
          DispatchPtr dispPtr = (DispatchPtr)invokeN("GetResults", new Object[] {});
          res.stealUnknown(dispPtr);
          return res;
        
    }
    /**
    *
    
    * @return void
    **/
    public void ClearResults() throws COMException
    {
      
		invokeN("ClearResults", new Object[] {});
        
    }
}
