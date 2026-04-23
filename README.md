# o28m-component-informer

This Spring AI MCP server is intended to provide information about the functionality, architecture
and components of
the [Open Telekom Integration Platform](https://github.com/telekom/Open-Telekom-Integration-Platform/tree/main).

## How to run

The MCP server is intended to be provided as a native binary.

### Building

To compile the native binary run:

```bash
./gradlew nativeCompile
```

### Running

By default, this will output a binary in the `build/native/nativeCompile` directory, e.g.

```bash
./build/native/nativeCompile/o28m-component-informer
```

### Using

To tell your agent about it, add the following to your mcp server configuration:

```json
{
  "mcpServers": {
    "o28m-component-informer-native": {
      "command": "~/path-to/o28m-component-informer/build/native/nativeCompile/o28m-component-informer"
    }
  }
}
```
