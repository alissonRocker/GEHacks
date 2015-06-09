Google Earth hacks
==================

Requirements:
-------------
Jawin - to interact with native com components  - http://jawinproject.sourceforge.net/jawin.html <br/>
Jak - generate kml - http://labs.micromata.de/projects/jak/quickstart.html <br/>
Google Earth <br/>
Any Windows flavor <br/>

========
The stubs (com/tckb/ge/stubs) generated from Jawin are used to interact with the Google Earth's COM API. 
The controls for the simulation are a bit fuzzy but, fix can be expected sooner or later. <br/>
 
The demo(s) of the hack: <br/>

https://www.youtube.com/watch?v=2Pf8V8uubVM <br/>
https://www.youtube.com/watch?v=A_IxQ_KOy2s (NEW!)<br/> 
  


viel spass!<br/>
tckb

=========
NB:
* This hack is inspired from the presentation by Rob ratcliff. Original presentation can be found at http://www.austinjug.org/presentations/GoogleEarthHacks.pdf. Although, much of the code has been done to suit the hack, the project contains parts of code from him. 

* If you encounter the following error or similar then, it is most likely due to restrictions of JaWin in accessing GE on the native side. In such case, please notify me!

````
Jun 09, 2015 8:14:04 PM com.tckb.ge.GEFrame startGE
SEVERE: null
org.jawin.COMException: 800401f3: Invalid class string

        at org.jawin.marshal.GenericStub.win32Invoke0(Native Method)
        at org.jawin.marshal.GenericStub.win32Invoke(GenericStub.java:152)
        at org.jawin.FuncPtr.invoke(FuncPtr.java:186)
        at org.jawin.FuncPtr.invoke(FuncPtr.java:205)
