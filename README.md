## pythonbyte-krux
Core library for Kotlin development.

### Recent Releases ###

* [v2.0](https://github.com/MarkNenadov/pythonbyte-krux/releases/download/v2.0/pythonbyte-krux.jar) - May 24, 2024
* [v2.2](https://github.com/MarkNenadov/pythonbyte-krux/releases/download/v2.2/pythonbyte-krux.jar) - Aug 6, 2024

Note: 2.0 is using Kotlin 2.0 and 2.2 is using Kotlin 2.0.10.

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
