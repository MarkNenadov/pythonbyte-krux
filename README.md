# pythonbyte-krux
Core library for Kotlin development.

### Recent Releases ###

* v0.8 - [https://github.com/MarkNenadov/pythonbyte-krux/releases/download/v0.8/pythonbyte-krux.jar] - October 23, 2023
* v0.9 - [https://github.com/MarkNenadov/pythonbyte-krux/releases/download/v0.9/pythonbyte-krux.jar] - October 26, 2023
* v1.0 - [https://github.com/MarkNenadov/pythonbyte-krux/releases/download/v1.0/pythonbyte-krux.jar] - November 18, 2023

### Key Classes/Files

json
* JsonObject (class-wraps JSONObject)

properties
* PropertyReader (class)

mapping
* GpsCoordinates (class)

crypto
* HashUtils (class)

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