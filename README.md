# pythonbyte-krux
Core library for Kotlin development.

### Recent Releases ###

* v1.0 - [https://github.com/MarkNenadov/pythonbyte-krux/releases/download/v1.0/pythonbyte-krux.jar] - November 18, 2023
* v1.1 - [https://github.com/MarkNenadov/pythonbyte-krux/releases/download/v1.1/pythonbyte-krux.jar] - November 24, 2023
* v1.2 - [https://github.com/MarkNenadov/pythonbyte-krux/releases/download/v1.2/pythonbyte-krux.jar] - December 2, 2023

Note: v1.0/v1.1/v1.2 are using Kotlin 2.0.0-Beta1.

### Key Classes/Files

json
* JsonObject (class-wraps JSONObject)

properties
* PropertyReader (class)

mapping
* GpsCoordinates (class)

crypto
* HashUtils (class)

ByteBufferExtension
* ByteBuffer.toString (class extension)

url
* encoders (file)
    * utf8Url (function)
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