/**
 * GwtALTest.java
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

package net.npe.gwtal.test.client;

import net.npe.gwt.event.dom.client.InputEvent;
import net.npe.gwt.event.dom.client.InputHandler;
import net.npe.gwt.user.client.ui.Range;
import net.npe.webal.WebALBuffer;
import net.npe.webal.WebALContext;
import net.npe.webal.WebALSource;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.dom.client.AudioElement;
import com.google.gwt.dom.client.Document;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.RootLayoutPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class GwtALTest implements EntryPoint {
	
	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		
		final WebALContext al = WebALContext.getContext();

		AudioElement audio = Document.get().createAudioElement();
		audio.setPropertyString("type", AudioElement.TYPE_MP3);
		audio.setSrc("https://github.com/benvanik/WebAL/blob/master/samples/content/invincible.mp3?raw=true");

		/*
		JsArray<AudioElement> audioArray = JavaScriptObject.createArray(2).cast();
		AudioElement mp3 = Document.get().createAudioElement();
		mp3.setPropertyString("type", AudioElement.TYPE_MP3);
		mp3.setSrc("https://github.com/benvanik/WebAL/blob/master/samples/content/invincible.mp3?raw=true");
		audioArray.set(0, mp3);
		AudioElement ogg = Document.get().createAudioElement();
		ogg.setPropertyString("type", AudioElement.TYPE_OGG);
		ogg.setSrc("https://github.com/benvanik/WebAL/blob/master/samples/content/invincible.ogg?raw=true");
		audioArray.set(1, ogg);
		*/
		
		WebALBuffer buffer = al.createBuffer();
		al.bufferData(buffer, audio, false);
//		al.bufferData(buffer, audioArray, false);
		
		final WebALSource source = al.createSource();
		al.sourceBuffer(source, buffer);
		al.sourceParameter(source, WebALContext.LOOPING, true);
		al.sourceParameter(source, WebALContext.GAIN, 0.5);
		
		Button playButton = new Button("Play");
		playButton.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				al.sourcePlay(source);
			}
		});
		
		Button stopButton = new Button("Stop");
		stopButton.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				al.sourceStop(source);
			}
		});
		
		Button pauseButton = new Button("Pause");
		pauseButton.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				al.sourcePause(source);
			}
		});
		
		final Range gain = new Range(50, 0, 100, 1);
		gain.addInputHandler(new InputHandler() {
			@Override
			public void onInput(InputEvent event) {
				double value = gain.getValue() / 100.0;
				al.sourceParameter(source, WebALContext.GAIN, value);
			}
		});
		
		FlowPanel panel = new FlowPanel();
		panel.add(playButton);
		panel.add(stopButton);
		panel.add(pauseButton);
		panel.add(gain);
		
		RootLayoutPanel.get().add(panel);
		
	}
	
}
