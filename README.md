Google Earth hacks
==================

Requirements:
-------------
* [Jawin](http://jawinproject.sourceforge.net/jawin.html) - to interact with native com components  <br/>
* [Jak](http://labs.micromata.de/projects/jak/quickstart.html) - generate kml -  <br/>
* Google Earth (*ver 6 only*! ) <br/>
* Any Windows flavor <br/>

---
NOTE: <br/>
* GoogleEarth >=7 is not compatible with JaWin at the moment. Please switch back to older version of Goole Earth. Unless you wanna see this ugly message!

````
Jun 09, 2015 8:14:04 PM com.tckb.ge.GEFrame startGE
SEVERE: null
org.jawin.COMException: 800401f3: Invalid class string

        at org.jawin.marshal.GenericStub.win32Invoke0(Native Method)
        at org.jawin.marshal.GenericStub.win32Invoke(GenericStub.java:152)
        at org.jawin.FuncPtr.invoke(FuncPtr.java:186)
        at org.jawin.FuncPtr.invoke(FuncPtr.java:205)
```
* [JaWin](http://sourceforge.net/projects/jawinproject/files/jawinproject/Jawin-2.0-alpha1/) binaries in Sf.net are built on a 32-bit machine so, unless you want to rebuilt the entire project, I'd recommend you use 32bit JVM to compile and run the code.

========
The stubs (com/tckb/ge/stubs) generated from Jawin are used to interact with the Google Earth's COM API. 
The controls for the simulation are a bit fuzzy ~~but, fix can be expected sooner or later.~~ Nope, not doing it, but I guess this is just tweaking it. Give it a try! <br/>
 
The demo(s) of the hack: <br/>

<a href="http://www.youtube.com/watch?feature=player_embedded&v=2Pf8V8uubVM
" target="_blank"><img src="http://img.youtube.com/vi/2Pf8V8uubVM/0.jpg" 
alt="Demo1" width="240" height="180" border="10" /></a>

<a href="http://www.youtube.com/watch?feature=player_embedded&v=A_IxQ_KOy2s
" target="_blank"><img src="http://img.youtube.com/vi/A_IxQ_KOy2s/0.jpg" 
alt="Demo2" width="240" height="180" border="10" /></a>

viel spass!<br/>
tckb

=========
NB:
* This hack is inspired from the presentation by Rob ratcliff. Original presentation can be found at http://www.austinjug.org/presentations/GoogleEarthHacks.pdf. Although, much of the code has been done to suit the hack, the project contains parts of code from him. 

~~~* If you encounter the following error or similar then, it is most likely due to restrictions of JaWin in accessing GE on the native side. In such case, please notify me!~~~ See above note

