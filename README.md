## pythonbyte-krux
Core library for Kotlin development.

### Recent Releases ###

* [v3.2](https://github.com/MarkNenadov/pythonbyte-krux/releases/download/v3.2/pythonbyte-krux-jar-with-dependencies.jar) - Oct 14, 2024
* [v3.3](https://github.com/MarkNenadov/pythonbyte-krux/releases/download/v3.3/pythonbyte-krux-jar-with-dependencies.jar) - Mar 23, 2025
* [v3.4](https://github.com/MarkNenadov/pythonbyte-krux/releases/download/v3.4/pythonbyte-krux-jar-with-dependencies.jar) - Mar 23, 2025
* [v3.5](https://github.com/MarkNenadov/pythonbyte-krux/releases/download/v3.5/pythonbyte-krux-jar-with-dependencies.jar) - Jun 21, 2025

### Key Classes/Files

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
  - `String.hash`: Extension functions for generating hash digests.

**files:**
- `InputStreamUtils`: A file with utility functions for handling InputStream.
  - `resourceToInputStream`: A function to convert a resource to an InputStream.
  - `InputStream.asString`: An extension function to convert InputStream to String.

**http:**
- `HttpResponse`: A wrapper class for HTTP responses.
- `Http`: A file with HTTP-related functions.
  - `buildRequest`: A function for building an HTTP request.
  - `sendRequest`: A function for sending an HTTP request.
  - `buildGetRequest`: A function for building a GET request.
  - `createPostBody`: A function for creating the body of a POST request.
- `Headers`: A file with Headers-related functions
  - `buildHeaders`: Build http headers

**json:**
- `JsonObject`: A class that wraps the `JSONObject` for JSON handling.

**mapping:**
- `GpsCoordinates`: A class for handling GPS coordinates.
- `GpsCoordinateFormattingException`

**properties:**
- `PropertyReader`: A class for reading properties.
- `PropertyReaderFileNotFoundException`

**timer**
- `KruxTimer`: A class for timing operations

**types**
- `Caches`: StringArrayCache and ByteArrayCache type aliases

**url:**
- `Encoders`: A file containing URL encoding utilities.
  - `String.utf8UrlValue`: An extension function for UTF-8 URL encoding.
  - `mapToUrlParameterString`: A function for mapping to URL parameter string.

**MediaTypes:**
- An object containing media type constants.
  - `UTF_JSON`: UTF-8 JSON media type.
