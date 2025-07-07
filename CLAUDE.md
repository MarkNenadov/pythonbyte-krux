# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project Overview

This is **pythonbyte-krux**, a core library for Kotlin development containing utility functions across multiple domains. It's a Maven project using Kotlin 2.2.0 with JVM target 12.

## Build and Development Commands

### Build Commands
- `mvn compile` - Compile the project
- `mvn test` - Run all tests
- `mvn package` - Build JAR with dependencies
- `mvn clean` - Clean build artifacts

### Linting
- `mvn ktlint:check` - Check code style (runs automatically during validate phase)
- `mvn ktlint:format` - Format code to match ktlint standards

### Testing
- `mvn test` - Run all JUnit 5 tests
- `mvn test -Dtest=ClassName` - Run specific test class
- `mvn test -Dtest=ClassName#methodName` - Run specific test method

## Architecture and Structure

### Core Library Organization
The project follows a domain-based package structure under `org.pythonbyte.krux`:

- **conversions** - Data conversion utilities (gzip, base64, ByteBuffer extensions)
- **crypto** - Cryptographic utilities (SHA hashing functions)
- **files** - File and stream utilities (resource loading, InputStream extensions)
- **http** - HTTP client utilities (OkHttp3 wrappers, request builders)
- **json** - JSON handling (JSONObject wrapper with convenience methods)
- **mapping** - Geographic utilities (GPS coordinate handling)
- **privacy** - PII scrubbing utilities (email, phone, government ID scrubbers)
- **properties** - Configuration file utilities
- **timer** - Timing utilities
- **types** - Type aliases and caches
- **url** - URL encoding utilities

### Key Dependencies
- **OkHttp3** - HTTP client functionality
- **org.json** - JSON parsing and manipulation
- **JUnit 5** - Testing framework
- **MockWebServer** - HTTP testing utilities

### Extension Function Pattern
The library heavily uses Kotlin extension functions to add functionality to existing types:
- `String.gzip()`, `String.gunzip()`, `String.base64()` - Conversion extensions
- `String.sha1()`, `String.sha256()` - Crypto extensions
- `InputStream.asString()` - Stream conversion
- `ByteBuffer.asString()` - Buffer conversion

### Testing Approach
- Uses JUnit 5 for all tests
- MockWebServer for HTTP testing
- Tests follow the pattern `ClassName + Test.kt`
- Tests use backtick method names for readability
- All test resources are in `src/test/resources/`

## Development Guidelines

### Code Style
- Follow ktlint formatting rules (enforced during build)
- Use extension functions for utility methods on existing types
- Prefer immutable data structures and functional programming patterns
- Use descriptive backtick method names in tests

### Testing Requirements
- Write tests for all new utility functions
- Use MockWebServer for HTTP-related functionality testing
- Test both success and failure scenarios
- Include edge cases and error conditions

### Package Structure
When adding new functionality, follow the existing domain-based organization:
- Utility functions should be extension functions where appropriate
- Group related functionality in domain-specific packages
- Create corresponding test files in matching test package structure