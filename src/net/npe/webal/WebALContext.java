/**
 * WebALContext.java
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
import com.google.gwt.core.client.JsArray;
import com.google.gwt.dom.client.AudioElement;

public final class WebALContext extends JavaScriptObject {
	
	public static final int INVALID = -1;
	public static final int NONE = 0;
	public static final int FALSE = 0;
	public static final int TRUE = 1;
	public static final int UBYTE = 1;
	public static final int SHORT = 2;
	public static final int FLOAT = 4;
	public static final int SOURCE_RELATIVE = 0x202;
	public static final int CONE_INNER_ANGLE = 0x1001;
	public static final int CONE_OUTER_ANGLE = 0x1002;
	public static final int PITCH = 0x1003;
	public static final int POSITION = 0x1004;
	public static final int DIRECTION = 0x1005;
	public static final int VELOCITY = 0x1006;
	public static final int LOOPING = 0x1007;
	public static final int BUFFER = 0x1009;
	public static final int GAIN = 0x100A;
	public static final int MIN_GAIN = 0x100D;
	public static final int MAX_GAIN = 0x100E;
	public static final int ORIENTATION = 0x100F;
	public static final int SOURCE_STATE = 0x1010;
	public static final int INITIAL = 0x1011;
	public static final int PLAYING = 0x1012;
	public static final int PAUSED = 0x1013;
	public static final int STOPPED = 0x1014;
	public static final int BUFFERS_QUEUED = 0x1015;
	public static final int BUFFERS_PROCESSED = 0x1016;
	public static final int SEC_OFFSET = 0x1024;
	public static final int SAMPLE_OFFSET = 0x1025;
	public static final int BYTE_OFFSET = 0x1026;
	public static final int SOURCE_TYPE = 0x1027;
	public static final int STATIC = 0x1028;
	public static final int STREAMING = 0x1029;
	public static final int UNDETERMINED = 0x1030;
	public static final int FORMAT_MONO8 = 0x1100;
	public static final int FORMAT_MONO16 = 0x1101;
	public static final int FORMAT_MONO_FLOAT32 = 0x10010;
	public static final int FORMAT_STEREO8 = 0x1102;
	public static final int FORMAT_STEREO16 = 0x1103;
	public static final int FORMAT_STEREO_FLOAT32 = 0x10011;
	public static final int REFERENCE_DISTANCE = 0x1020;
	public static final int ROLLOFF_FACTOR = 0x1021;
	public static final int CONE_OUTER_GAIN = 0x1022;
	public static final int MAX_DISTANCE = 0x1023;
	public static final int LOADED = 0x2000;
	public static final int FREQUENCY = 0x2001;
	public static final int BITS = 0x2002;
	public static final int CHANNELS = 0x2003;
	public static final int SIZE = 0x2004;
	public static final int UNUSED = 0x2010;
	public static final int QUEUED = 0x2011;
	public static final int CURRENT = 0x2012;
	public static final int NO_ERROR = 0;
	public static final int INVALID_NAME = 0xA001;
	public static final int INVALID_ENUM = 0xA002;
	public static final int INVALID_VALUE = 0xA003;
	public static final int INVALID_OPERATION = 0xA004;
	public static final int OUT_OF_MEMORY = 0xA005;
	public static final int VENDOR = 0xB001;
	public static final int VERSION = 0xB002;
	public static final int RENDERER = 0xB003;
	public static final int EXTENSIONS = 0xB004;
	public static final int DOPPLER_FACTOR = 0xC000;
	public static final int SPEED_OF_SOUND = 0xC003;
	public static final int DISTANCE_MODEL = 0xD000;
	public static final int INVERSE_DISTANCE = 0xD001;
	public static final int INVERSE_DISTANCE_CLAMPED = 0xD002;
	public static final int LINEAR_DISTANCE = 0xD003;
	public static final int LINEAR_DISTANCE_CLAMPED = 0xD004;
	public static final int EXPONENT_DISTANCE = 0xD005;
	public static final int EXPONENT_DISTANCE_CLAMPED = 0xD006;
	
	public static native WebALContext getContext() /*-{
		return $wnd.WebAL.getContext({supportDynamicAudio:false, supportStereoMixing:false});
	}-*/;
	
	public native WebALBuffer createBuffer() /*-{
		return this.createBuffer();
	}-*/;
	
	public native void bufferData(WebALBuffer buffer, AudioElement audio, boolean streaming) /*-{
		this.bufferData(buffer, audio, streaming);
	}-*/;
	
	public native void bufferData(WebALBuffer buffer, JsArray<AudioElement> audioArray, boolean streaming) /*-{
		this.bufferData(buffer, audioArray, streaming);
	}-*/;
	
	public native WebALSource createSource() /*-{
		return this.createSource();
	}-*/;
	
	public native void sourceBuffer(WebALSource source, WebALBuffer buffer) /*-{
		this.sourceBuffer(source, buffer);
	}-*/;
	
	public native void sourceParameter(WebALSource source, int pname, boolean param) /*-{
		this.sourceParameter(source, pname, param);
	}-*/;
	
	public native void sourceParameter(WebALSource source, int pname, double param) /*-{
		this.sourceParameter(source, pname, param);
	}-*/;
	
	public native void sourcePlay(WebALSource source) /*-{
		this.sourcePlay(source);
	}-*/;
	
	public native void sourceStop(WebALSource source) /*-{
		this.sourceStop(source);
	}-*/;
	
	public native void sourceRewind(WebALSource source) /*-{
		this.sourceRewind(source);
	}-*/;
	
	public native void sourcePause(WebALSource source) /*-{
		this.sourcePause(source);
	}-*/;
	
	protected WebALContext() {}
	
}
