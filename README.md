## pythonbyte-krux
Core library for Kotlin development.

### Recent Releases ###

* [v1.6](https://github.com/MarkNenadov/pythonbyte-krux/releases/download/v1.6/pythonbyte-krux.jar) - December 16, 2023
* [v1.7](https://github.com/MarkNenadov/pythonbyte-krux/releases/download/v1.7/pythonbyte-krux.jar) - January 16, 2024
* [v1.8](https://github.com/MarkNenadov/pythonbyte-krux/releases/download/v1.8/pythonbyte-krux.jar) - January 16, 2024
* [v1.9](https://github.com/MarkNenadov/pythonbyte-krux/releases/download/v1.9/pythonbyte-krux.jar) - March 23, 2024

Note: v1.5 is using Kotlin 2.0 Beta 1 and 1.6-1.9 is using Kotlin 2.0 Beta 2

### Key Classes/Files

**json:**
- `JsonObject`: A class that wraps the `JSONObject` for JSON handling.

**properties:**
- `PropertyReader`: A class for reading properties.

**mapping:**
- `GpsCoordinates`: A class for handling GPS coordinates.

**conversions:**
- `ConversionUtils`: A file containing various conversion utilities.
  - `ByteBuffer.asString`: An extension function to convert ByteBuffer to String.
  - `String.gzip`: An extension function for GZIP compression.
  - `String.gunzip`: An extension function for GZIP decompression.
  - `String.base64`: An extension function for Base64 encoding.

**crypto:**
- `HashUtils`: A file containing hash utility functions.
  - `String.sha1`: An extension function for SHA-1 hashing.
  - `String.sha256`: An extension function for SHA-256 hashing.

**files:**
- `InputStreamUtils`: A file with utility functions for handling InputStream.
  - `resourceToInputStream`: A function to convert a resource to an InputStream.
  - `InputStream.asString`: An extension function to convert InputStream to String.

**url:**
- `Encoders`: A file containing URL encoding utilities.
  - `String.utf8UrlValue`: An extension function for UTF-8 URL encoding.
  - `mapToUrlParameterString`: A function for mapping to URL parameter string.

**http:**
- `HttpResponse`: A wrapper class for HTTP responses.
- `http`: A file with HTTP-related functions.
  - `buildRequest`: A function for building an HTTP request.
  - `sendRequest`: A function for sending an HTTP request.
  - `buildGetRequest`: A function for building a GET request.
  - `createPostBody`: A function for creating the body of a POST request.

**MediaTypes:**
- An object containing media type constants.
  - `UTF_JSON`: UTF-8 JSON media type.
