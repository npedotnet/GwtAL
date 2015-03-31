/**
 * WebALDevice.java
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

public class WebALDevice extends JavaScriptObject {
	
	public native void handleUpdates() /*-{
		this.handleUpdates();
	}-*/;
	
	public native void sourceUpdateRequested(WebALSource source) /*-{
		this.sourceUpdateRequested(source);
	}-*/;
	
	public native void sourceStateChange(WebALSource source, int oldState, int newState) /*-{
		this.sourceStateChange(source, oldState, newState);
	}-*/;
	
	public native void bindSourceBuffer(WebALSource source, WebALBuffer buffer) /*-{
		this.bindSourceBuffer(source, buffer);
	}-*/;
	
	public native void unbindSourceBuffer(WebALSource source, WebALBuffer buffer) /*-{
		this.unbindSourceBuffer(source, buffer);

	}-*/;

	protected WebALDevice() {}
	
}

