## Overview
RocketMQ APIs use Protocol Buffers version 3 (proto3) as their Interface Definition Language (IDL) to define the API interface and the structure of the payload messages. Reading these definitions can understand RocketMQ 5.0 models and API behaviors easily.

Currently, Apache RocketMQ only supports these APIs over gRPC, a high-performance binary RPC protocol over HTTP/2. The implementation consists of two parts:

  * [rocketmq](https://github.com/apache/rocketmq): The main repo of Apache RocketMQ contains a `proxy` module that implements this specification in the server-side.
  * [rocketmq-clients](https://github.com/apache/rocketmq-clients): A mono repo consists of polyglot clients that implement this specification in the client-side.
