# pythonbyte-krux
Core library for Kotlin development.

### Recent Releases ###

* v1.5 - [https://github.com/MarkNenadov/pythonbyte-krux/releases/download/v1.5/pythonbyte-krux.jar] - December 7, 2023
* v1.6 - [https://github.com/MarkNenadov/pythonbyte-krux/releases/download/v1.6/pythonbyte-krux.jar] - December 16, 2023

Note: v1.5 is using Kotlin 2.0 Beta 1 and 1.6 is using Kotlin 2.0 Beta 2

### Key Classes/Files

json
* JsonObject (class-wraps JSONObject)

properties
* PropertyReader (class)

mapping
* GpsCoordinates (class)

conversions
* ConversionUtils (file)
  * ByteBuffer.asString (extension function)
  * String.gzip (extension function)
  * String gunzip (extension function)
  * String.base64 (extension function)

crypto
* HashUtils (file)
  * String.sha1 (extension function)

files
* InputStreamUtils (file)
  * resourceToInputStream (function)
  * InputStream.asString (class extension)

ByteBufferExtension
* ByteBuffer.toString (class extension)

url
* Encoders (file)
    * String.utf8UrlValue (class extensions)
    * mapTpUrlParameterString (function)

http
* HttpResponse (wrapper class)
* http (file)
  * buildRequest (function)
  * sendRequest (function)
  * buildGetRequest (function)
  * createPostBody (function)
* MediaTypes (object)
  * UTF_JSON