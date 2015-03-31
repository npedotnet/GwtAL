/**
 * WebALSoftwareMixer.java
 * 
 * Copyright (c) 2015 Kenji Sasaki
 * Released under the MIT license.
 * https://github.com/npedotnet/GwtAL/blob/master/LICENSE
 * 
 * English document
 * https://github.com/npedotnet/GwtAL/blob/master/README.md
 * 
 * Japanese document
 * http://3dtech.jp/wiki/index.php?GwtAL
 * 
 */

package net.npe.webal;

import com.google.gwt.core.client.JavaScriptObject;

public class WebALSoftwareMixer extends JavaScriptObject {
	
	public native void write(int target, int sampleCount) /*-{
		this.write(target, sampleCount);
	}-*/;
	
	public native void fillBuffer(int target, int sampleCapacity) /*-{
		this.fillBuffer(target, sampleCapacity);
	}-*/;
	
	public native void mixSource(WebALSource source, int sampleCount) /*-{
		this.mixSource(source, sampleCount);
	}-*/;

	protected WebALSoftwareMixer() {}
	
}
