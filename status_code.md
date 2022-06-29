# Status Code

## Non-Telemetry RPC Status Code Mapping Table

|                                              | QueryRoute | Heartbeat | SendMessage | QueryAssignment | ReceiveMessage | AckMessage | ForwardMessageToDeadLetterQueue | EndTransaction | NotifyClientTermination | ChangeInvisibleDuration |
| :------------------------------------------: | :--------: | :-------: | :---------: | :-------------: | :------------: | :--------: | :-----------------------------: | :------------: | :---------------------: | :---------------------: |
|                      OK                      |     ✅      |     ✅     |      ✅      |        ✅        |       ✅        |     ✅      |                ✅                |       ✅        |            ✅            |            ✅            |
|             ILLEGAL_ACCESS_POINT             |     ✅      |     ❌     |      ❌      |        ✅        |       ❌        |     ❌      |                ❌                |       ❌        |            ❌            |            ❌            |
|                ILLEGAL_TOPIC                 |     ✅      |     ✅     |      ✅      |        ✅        |       ✅        |     ✅      |                ✅                |       ✅        |            ❌            |            ✅            |
|            ILLEGAL_CONSUMER_GROUP            |     ❌      |     ✅     |      ❌      |        ❌        |       ✅        |     ✅      |                ✅                |       ✅        |            ✅            |            ✅            |
|             ILLEGAL_MESSAGE_TAG              |     ❌      |     ❌     |      ✅      |        ❌        |       ❌        |     ❌      |                ❌                |       ❌        |            ❌            |            ❌            |
|             ILLEGAL_MESSAGE_KEY              |     ❌      |     ❌     |      ✅      |        ❌        |       ❌        |     ❌      |                ❌                |       ❌        |            ❌            |            ❌            |
|            ILLEGAL_MESSAGE_GROUP             |     ❌      |     ❌     |      ✅      |        ❌        |       ❌        |     ❌      |                ❌                |       ❌        |            ❌            |            ❌            |
|         ILLEGAL_MESSAGE_PROPERTY_KEY         |     ❌      |     ❌     |      ✅      |        ❌        |       ❌        |     ❌      |                ❌                |       ❌        |            ❌            |            ❌            |
|         MESSAGE_PROPERTIES_TOO_LARGE         |     ❌      |     ❌     |      ✅      |        ❌        |       ❌        |     ❌      |                ❌                |       ❌        |            ❌            |            ❌            |
|            MESSAGE_BODY_TOO_LARGE            |     ❌      |     ❌     |      ✅      |        ❌        |       ❌        |     ❌      |                ❌                |       ❌        |            ❌            |            ❌            |
|                  FORBIDDEN                   |     ❌      |     ❌     |      ✅      |        ✅        |       ✅        |     ❌      |                ❌                |       ❌        |            ❌            |            ❌            |
|                 UNAUTHORIZED                 |     ❌      |     ✅     |      ✅      |        ❌        |       ✅        |     ✅      |                ✅                |       ✅        |            ✅            |            ✅            |
|               TOPIC_NOT_FOUND                |     ✅      |     ❌     |      ✅      |        ✅        |       ✅        |     ✅      |                ✅                |       ❌        |            ❌            |            ✅            |
|           CONSUMER_GROUP_NOT_FOUND           |     ❌      |     ❌     |      ❌      |        ❌        |       ✅        |     ❌      |                ❌                |       ❌        |            ❌            |            ❌            |
|       VERIFY_FIFO_MESSAGE_UNSUPPORTED        |     ❌      |     ❌     |      ❌      |        ❌        |       ❌        |     ❌      |                ❌                |       ❌        |            ❌            |            ❌            |
|          FAILED_TO_CONSUME_MESSAGE           |     ❌      |     ❌     |      ❌      |        ❌        |       ❌        |     ❌      |                ❌                |       ❌        |            ❌            |            ❌            |
|              MESSAGE_CORRUPTED               |     ❌      |     ❌     |      ✅      |        ❌        |       ❌        |     ❌      |                ❌                |       ❌        |            ❌            |            ❌            |
|              TOO_MANY_REQUESTS               |     ✅      |     ✅     |      ✅      |        ✅        |       ✅        |     ✅      |                ✅                |       ✅        |            ✅            |            ✅            |
| MESSAGE_PROPERTY_DOES_NOT_MATCH_MESSAGE_TYPE |     ❌      |     ❌     |      ✅      |        ❌        |       ❌        |     ❌      |                ❌                |       ❌        |            ❌            |            ❌            |
|              ILLEGAL_MESSAGE_ID              |     ❌      |     ❌     |      ✅      |        ❌        |       ❌        |     ❌      |                ❌                |       ❌        |            ❌            |            ❌            |
|            INVALID_TRANSACTION_ID            |     ❌      |     ❌     |      ❌      |        ❌        |       ❌        |     ❌      |                ❌                |       ✅        |            ❌            |            ❌            |
|          ILLEGAL_FILTER_EXPRESSION           |     ❌      |     ❌     |      ❌      |        ❌        |       ✅        |     ❌      |                ❌                |       ❌        |            ❌            |            ❌            |
|            INVALID_RECEIPT_HANDLE            |     ❌      |     ❌     |      ❌      |        ❌        |       ❌        |     ✅      |                ✅                |       ❌        |            ❌            |            ✅            |
|          MASTER_PERSISTENCE_TIMEOUT          |     ❌      |     ❌     |      ✅      |        ❌        |       ❌        |     ❌      |                ❌                |       ❌        |            ❌            |            ❌            |
|          SLAVE_PERSISTENCE_TIMEOUT           |     ❌      |     ❌     |      ✅      |        ❌        |       ❌        |     ❌      |                ❌                |       ❌        |            ❌            |            ❌            |
|               HA_NOT_AVAILABLE               |     ❌      |     ❌     |      ✅      |        ❌        |       ❌        |     ❌      |                ❌                |       ❌        |            ❌            |            ❌            |
|             VERSION_UNSUPPORTED              |     ❌      |     ❌     |      ❌      |        ❌        |       ❌        |     ❌      |                ❌                |       ❌        |            ❌            |            ❌            |
|              MESSAGE_NOT_FOUND               |     ❌      |     ❌     |      ❌      |        ❌        |       ✅        |     ❌      |                ❌                |       ❌        |            ❌            |            ❌            |
|           UNRECOGNIZED_CLIENT_TYPE           |     ❌      |     ✅     |      ❌      |        ❌        |       ❌        |     ❌      |                ❌                |       ❌        |            ✅            |            ❌            |
|               MULTIPLE_RESULTS               |     ❌      |     ❌     |      ✅      |        ❌        |       ❌        |     ✅      |                ❌                |       ❌        |            ❌            |            ❌            |
|                 BAD_REQUEST                  |     ❌      |     ❌     |      ❌      |        ❌        |       ❌        |     ❌      |                ❌                |       ❌        |            ❌            |            ❌            |
|              CLIENT_ID_REQUIRED              |     ✅      |     ✅     |      ✅      |        ✅        |       ✅        |     ✅      |                ✅                |       ✅        |            ✅            |            ✅            |
|            INTERNAL_SERVER_ERROR             |     ✅      |     ✅     |      ✅      |        ✅        |       ✅        |     ✅      |                ✅                |       ✅        |            ✅            |            ✅            |
|               NOT_IMPLEMENTED                |     ❌      |     ❌     |      ❌      |        ❌        |       ❌        |     ❌      |                ❌                |       ❌        |            ❌            |            ❌            |
|                PROXY_TIMEOUT                 |     ✅      |     ❌     |      ✅      |        ✅        |       ✅        |     ✅      |                ✅                |       ✅        |            ❌            |            ✅            |

## Server-Client Telemetry RPC Status Code Mapping Table

|                                 | ThreadStackTrace | VerifyMessageResult |
| :-----------------------------: | :--------------: | :-----------------: |
|               OK                |        ✅         |          ✅          |
|         NOT_IMPLEMENTED         |        ✅         |          ❌          |
|    FAILED_TO_CONSUME_MESSAGE    |        ❌         |          ✅          |
| VERIFY_FIFO_MESSAGE_UNSUPPORTED |        ❌         |          ✅          |
|        MESSAGE_CORRUPTED        |        ❌         |          ✅          |