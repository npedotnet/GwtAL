# GwtAL
GwtAL is a GWT port of benvanik/WebAL.

https://github.com/benvanik/WebAL

# Getting Started

Download gwtal-1.0.jar and edit yourproject.gwt.xml.

http://npedotnet.github.io/archives/gwtal-1.0.jar

```xml
<inherits name='net.npe.webal' />
```

Download WebAL-debug-gwtal-1.0.js and edit your html file.

http://npedotnet.github.io/archives/WebAL-debug-gwtal-1.0.js

```html
<script type="text/javascript" language="javascript" src="WebAL-debug-gwtal-1.0.js"></script>
```

## 1. Create a WebALContext instance

```java
import net.npe.webal.WebALContext;

WebALContext al = WebALContext.getContext();
```

## 2. Create a WebALBuffer instance with HTML5 AudioElement

```java
import com.google.gwt.dom.client.AudioElement;
import com.google.gwt.dom.client.Document;
import net.npe.webal.WebALBuffer;

AudioElement audio = Document.get().createAudioElement();
audio.setPropertyString("type", AudioElement.TYPE_MP3);
audio.setSrc("https://github.com/benvanik/WebAL/blob/master/samples/content/invincible.mp3?raw=true");

WebALBuffer buffer = al.createBuffer();
al.bufferData(buffer, audio, false);
```

or

```java
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.dom.client.AudioElement;
import com.google.gwt.dom.client.Document;
import net.npe.webal.WebALBuffer;

JsArray<AudioElement> audioArray = JavaScriptObject.createArray(2).cast();

AudioElement mp3 = Document.get().createAudioElement();
mp3.setPropertyString("type", AudioElement.TYPE_MP3);
mp3.setSrc("https://github.com/benvanik/WebAL/blob/master/samples/content/invincible.mp3?raw=true");
audioArray.set(0, mp3);

AudioElement ogg = Document.get().createAudioElement();
ogg.setPropertyString("type", AudioElement.TYPE_OGG);
ogg.setSrc("https://github.com/benvanik/WebAL/blob/master/samples/content/invincible.ogg?raw=true");
audioArray.set(1, ogg);

WebALBuffer buffer = al.createBuffer();
al.bufferData(buffer, audioArray, false);
```

## 3. Create a WebALSource instance and play sounds!

```java
import net.npe.webal.WebALContext;
import net.npe.webal.WebALSource;

WebALSource source = al.createSource();
al.sourceBuffer(source, buffer);
al.sourceParameter(source, WebALContext.LOOPING, true);
al.sourceParameter(source, WebALContext.GAIN, 0.5);
al.sourcePlay(source);
```

For more details, see a GwtAL sample
https://github.com/npedotnet/GwtAL/blob/master/sample/GwtALTest.java

and a online demo page.
http://npe-net.appspot.com/gwtal/demo/index.html

# Customizing for GWT

changes **instanceof Array** to **Array.isArray()** method.
```js
audioElement instanceof Array
```
```js
Array.isArray(audioElement)
```

changes **instanceof Audio** to **instanceof HTMLAudioElement**.

```js
audioElement instanceof Audio
```
```js
audioElement instanceof HTMLAudioElement
```

For more details, compare

http://npedotnet.github.io/archives/WebAL-debug-gwtal-1.0.js

and

http://benvanik.github.io/WebAL/lib/WebAL-debug.js

Thank you for reading through. Enjoy your programming life! :shipit:
