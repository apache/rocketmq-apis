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
11. Expanded the Admin service with control-plane RPCs for topic/subscription/consumer administration and diagnostics (DescribeTopicStatus, ListSubscription, DescribeSubscription, DeleteSubscription, DescribeGroupAccumulation, ListConsumerConnection, ResetGroupOffset, QueryMessage, PrintThreadStackTrace, VerifyMessage, AdminSendMessage, GetConsumerRunningInfo, GetTopicRoute, QueryTimeSpan, GetProxyRuntimeStats).
12. Admin control-plane requests carry an optional `deployment_name` to address a single deployment in multi-tenant environments, and the lite topic dimension is exposed through `lite_topic` / `liteTopic` / `lite_topic_accumulation` plus the `LITE_SELECTIVE` consumption model. Admin field numbers are assigned so that the definitions stay wire compatible with Admin services already deployed against these RPCs.

15. RIP-2: added a dedicated, independent `ProxyAdminService` gRPC interface surface
    to apache/rocketmq/v2/admin.proto — M1 online client query
    (ListClients/DescribeClient/ListClientsByGroup/ListClientsByTopic), M2 runtime
    config / connection control / quota visualization / route observation
    (DescribeProxyConfig/UpdateProxyConfig/KickClient/DisconnectChannel/
    DescribeQuota/UpdateQuota/DescribeRouteTopology), M3 POP receipt handle
    diagnostics (DescribePopReceiptHandles), M4 batch consumption diagnostics
    (DescribeBatchConsumeDiagnostics), and server-streaming SubscribeRouteEvents.
    ACL 2.0 credentials ride gRPC request metadata (Authorization header,
    RIP-1 AUTH-01 AuthCallCredentials) and do NOT enter the message body.
    Protocol version bumped to 2.3.0.

Remaining Issues:
How server publishes conf and conf changes to clients.
