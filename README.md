# pythonbyte-krux
Core library for Kotlin development.

### Recent Releases ###

* v0.4 - [https://github.com/MarkNenadov/pythonbyte-krux/releases/download/v0.4/pythonbyte-krux.jar] - June 4, 2023
* v0.5 - [https://github.com/MarkNenadov/pythonbyte-krux/releases/download/v0.5/pythonbyte-krux.jar] - October 20, 2023
* v0.6 - [https://github.com/MarkNenadov/pythonbyte-krux/releases/download/v0.6/pythonbyte-krux.jar] - October 20, 2023

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