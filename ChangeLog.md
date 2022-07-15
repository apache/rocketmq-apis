# Changelog

1. v1 --> v2
2. rpc ReceiveMessage(ReceiveMessageRequest) returns (stream ReceiveMessageResponse) {}
3. Removed Nack RPC to honor ChangeInvisibleDuration RPC in consistent way;
4. SendMessageRequest supports repeated messages; Corresponding response syncs with repeated SendReceipts
5. rpc Telemetry(stream TelemetryCommand) returns (stream TelemetryCommand) {}
6. Removed ProducerGroup;
7. FIFO flags moved from HeartbeatRequest to ConsumerData
8. Removed MessageModel enumeration as concept of broadcasting is totally deprecated;
9. Enums field number = 0 is redefined to meet requirement [Each enum value should end with a semicolon, not a comma. Prefer prefixing enum values instead of surrounding them in an enclosing message. The zero value enum should have the suffix UNSPECIFIED.](https://developers.google.com/protocol-buffers/docs/style)
10. Nested enumerations are externalized due to the same guide item as above.

Remaining Issues:
How server publishes conf and conf changes to clients.
