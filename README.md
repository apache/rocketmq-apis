## Overview

## Extension Spec

## Message Model

## Producer Flow

## Consumer Flow

## Error handling
This API spec adopts a rich error model developed by Google as described [here](https://github.com/googleapis/googleapis/blob/master/google/rpc/status.proto). This model enables servers to return and clients to consume additional [error details](https://github.com/googleapis/googleapis/blob/master/google/rpc/error_details.proto) expressed as one or more protobuf messages. It further specifies a standard set of error message types to cover the most common needs (such as invalid parameters, quota violations, and stack traces).

The whole set of response codes are listed [here](https://github.com/googleapis/googleapis/blob/master/google/rpc/code.proto), except the offical gRPC error model, please refer to `service.proto` for more details about the error responses of each RPC service.

## Reserved Fields
Messages and enumerations of the API spec reserve the first 64 fields for the evolution of RocketMQ exclusively. Vendor-specific extensions to the protocol are supposed to use fields beyond 64.