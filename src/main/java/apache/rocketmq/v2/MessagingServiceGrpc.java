package apache.rocketmq.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * For all the RPCs in MessagingService, the following error handling policies
 * apply:
 * If the request doesn't bear a valid authentication credential, return a
 * response with common.status.code == `UNAUTHENTICATED`. If the authenticated
 * user is not granted with sufficient permission to execute the requested
 * operation, return a response with common.status.code == `PERMISSION_DENIED`.
 * If the per-user-resource-based quota is exhausted, return a response with
 * common.status.code == `RESOURCE_EXHAUSTED`. If any unexpected server-side
 * errors raise, return a response with common.status.code == `INTERNAL`.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.45.0)",
    comments = "Source: apache/rocketmq/v2/service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MessagingServiceGrpc {

  private MessagingServiceGrpc() {}

  public static final String SERVICE_NAME = "apache.rocketmq.v2.MessagingService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<apache.rocketmq.v2.QueryRouteRequest,
      apache.rocketmq.v2.QueryRouteResponse> getQueryRouteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryRoute",
      requestType = apache.rocketmq.v2.QueryRouteRequest.class,
      responseType = apache.rocketmq.v2.QueryRouteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<apache.rocketmq.v2.QueryRouteRequest,
      apache.rocketmq.v2.QueryRouteResponse> getQueryRouteMethod() {
    io.grpc.MethodDescriptor<apache.rocketmq.v2.QueryRouteRequest, apache.rocketmq.v2.QueryRouteResponse> getQueryRouteMethod;
    if ((getQueryRouteMethod = MessagingServiceGrpc.getQueryRouteMethod) == null) {
      synchronized (MessagingServiceGrpc.class) {
        if ((getQueryRouteMethod = MessagingServiceGrpc.getQueryRouteMethod) == null) {
          MessagingServiceGrpc.getQueryRouteMethod = getQueryRouteMethod =
              io.grpc.MethodDescriptor.<apache.rocketmq.v2.QueryRouteRequest, apache.rocketmq.v2.QueryRouteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryRoute"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  apache.rocketmq.v2.QueryRouteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  apache.rocketmq.v2.QueryRouteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MessagingServiceMethodDescriptorSupplier("QueryRoute"))
              .build();
        }
      }
    }
    return getQueryRouteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<apache.rocketmq.v2.HeartbeatRequest,
      apache.rocketmq.v2.HeartbeatResponse> getHeartbeatMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Heartbeat",
      requestType = apache.rocketmq.v2.HeartbeatRequest.class,
      responseType = apache.rocketmq.v2.HeartbeatResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<apache.rocketmq.v2.HeartbeatRequest,
      apache.rocketmq.v2.HeartbeatResponse> getHeartbeatMethod() {
    io.grpc.MethodDescriptor<apache.rocketmq.v2.HeartbeatRequest, apache.rocketmq.v2.HeartbeatResponse> getHeartbeatMethod;
    if ((getHeartbeatMethod = MessagingServiceGrpc.getHeartbeatMethod) == null) {
      synchronized (MessagingServiceGrpc.class) {
        if ((getHeartbeatMethod = MessagingServiceGrpc.getHeartbeatMethod) == null) {
          MessagingServiceGrpc.getHeartbeatMethod = getHeartbeatMethod =
              io.grpc.MethodDescriptor.<apache.rocketmq.v2.HeartbeatRequest, apache.rocketmq.v2.HeartbeatResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Heartbeat"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  apache.rocketmq.v2.HeartbeatRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  apache.rocketmq.v2.HeartbeatResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MessagingServiceMethodDescriptorSupplier("Heartbeat"))
              .build();
        }
      }
    }
    return getHeartbeatMethod;
  }

  private static volatile io.grpc.MethodDescriptor<apache.rocketmq.v2.SendMessageRequest,
      apache.rocketmq.v2.SendMessageResponse> getSendMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendMessage",
      requestType = apache.rocketmq.v2.SendMessageRequest.class,
      responseType = apache.rocketmq.v2.SendMessageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<apache.rocketmq.v2.SendMessageRequest,
      apache.rocketmq.v2.SendMessageResponse> getSendMessageMethod() {
    io.grpc.MethodDescriptor<apache.rocketmq.v2.SendMessageRequest, apache.rocketmq.v2.SendMessageResponse> getSendMessageMethod;
    if ((getSendMessageMethod = MessagingServiceGrpc.getSendMessageMethod) == null) {
      synchronized (MessagingServiceGrpc.class) {
        if ((getSendMessageMethod = MessagingServiceGrpc.getSendMessageMethod) == null) {
          MessagingServiceGrpc.getSendMessageMethod = getSendMessageMethod =
              io.grpc.MethodDescriptor.<apache.rocketmq.v2.SendMessageRequest, apache.rocketmq.v2.SendMessageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  apache.rocketmq.v2.SendMessageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  apache.rocketmq.v2.SendMessageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MessagingServiceMethodDescriptorSupplier("SendMessage"))
              .build();
        }
      }
    }
    return getSendMessageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<apache.rocketmq.v2.QueryAssignmentRequest,
      apache.rocketmq.v2.QueryAssignmentResponse> getQueryAssignmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryAssignment",
      requestType = apache.rocketmq.v2.QueryAssignmentRequest.class,
      responseType = apache.rocketmq.v2.QueryAssignmentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<apache.rocketmq.v2.QueryAssignmentRequest,
      apache.rocketmq.v2.QueryAssignmentResponse> getQueryAssignmentMethod() {
    io.grpc.MethodDescriptor<apache.rocketmq.v2.QueryAssignmentRequest, apache.rocketmq.v2.QueryAssignmentResponse> getQueryAssignmentMethod;
    if ((getQueryAssignmentMethod = MessagingServiceGrpc.getQueryAssignmentMethod) == null) {
      synchronized (MessagingServiceGrpc.class) {
        if ((getQueryAssignmentMethod = MessagingServiceGrpc.getQueryAssignmentMethod) == null) {
          MessagingServiceGrpc.getQueryAssignmentMethod = getQueryAssignmentMethod =
              io.grpc.MethodDescriptor.<apache.rocketmq.v2.QueryAssignmentRequest, apache.rocketmq.v2.QueryAssignmentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryAssignment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  apache.rocketmq.v2.QueryAssignmentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  apache.rocketmq.v2.QueryAssignmentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MessagingServiceMethodDescriptorSupplier("QueryAssignment"))
              .build();
        }
      }
    }
    return getQueryAssignmentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<apache.rocketmq.v2.ReceiveMessageRequest,
      apache.rocketmq.v2.ReceiveMessageResponse> getReceiveMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReceiveMessage",
      requestType = apache.rocketmq.v2.ReceiveMessageRequest.class,
      responseType = apache.rocketmq.v2.ReceiveMessageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<apache.rocketmq.v2.ReceiveMessageRequest,
      apache.rocketmq.v2.ReceiveMessageResponse> getReceiveMessageMethod() {
    io.grpc.MethodDescriptor<apache.rocketmq.v2.ReceiveMessageRequest, apache.rocketmq.v2.ReceiveMessageResponse> getReceiveMessageMethod;
    if ((getReceiveMessageMethod = MessagingServiceGrpc.getReceiveMessageMethod) == null) {
      synchronized (MessagingServiceGrpc.class) {
        if ((getReceiveMessageMethod = MessagingServiceGrpc.getReceiveMessageMethod) == null) {
          MessagingServiceGrpc.getReceiveMessageMethod = getReceiveMessageMethod =
              io.grpc.MethodDescriptor.<apache.rocketmq.v2.ReceiveMessageRequest, apache.rocketmq.v2.ReceiveMessageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReceiveMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  apache.rocketmq.v2.ReceiveMessageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  apache.rocketmq.v2.ReceiveMessageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MessagingServiceMethodDescriptorSupplier("ReceiveMessage"))
              .build();
        }
      }
    }
    return getReceiveMessageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<apache.rocketmq.v2.AckMessageRequest,
      apache.rocketmq.v2.AckMessageResponse> getAckMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AckMessage",
      requestType = apache.rocketmq.v2.AckMessageRequest.class,
      responseType = apache.rocketmq.v2.AckMessageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<apache.rocketmq.v2.AckMessageRequest,
      apache.rocketmq.v2.AckMessageResponse> getAckMessageMethod() {
    io.grpc.MethodDescriptor<apache.rocketmq.v2.AckMessageRequest, apache.rocketmq.v2.AckMessageResponse> getAckMessageMethod;
    if ((getAckMessageMethod = MessagingServiceGrpc.getAckMessageMethod) == null) {
      synchronized (MessagingServiceGrpc.class) {
        if ((getAckMessageMethod = MessagingServiceGrpc.getAckMessageMethod) == null) {
          MessagingServiceGrpc.getAckMessageMethod = getAckMessageMethod =
              io.grpc.MethodDescriptor.<apache.rocketmq.v2.AckMessageRequest, apache.rocketmq.v2.AckMessageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AckMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  apache.rocketmq.v2.AckMessageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  apache.rocketmq.v2.AckMessageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MessagingServiceMethodDescriptorSupplier("AckMessage"))
              .build();
        }
      }
    }
    return getAckMessageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<apache.rocketmq.v2.NackMessageRequest,
      apache.rocketmq.v2.NackMessageResponse> getNackMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NackMessage",
      requestType = apache.rocketmq.v2.NackMessageRequest.class,
      responseType = apache.rocketmq.v2.NackMessageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<apache.rocketmq.v2.NackMessageRequest,
      apache.rocketmq.v2.NackMessageResponse> getNackMessageMethod() {
    io.grpc.MethodDescriptor<apache.rocketmq.v2.NackMessageRequest, apache.rocketmq.v2.NackMessageResponse> getNackMessageMethod;
    if ((getNackMessageMethod = MessagingServiceGrpc.getNackMessageMethod) == null) {
      synchronized (MessagingServiceGrpc.class) {
        if ((getNackMessageMethod = MessagingServiceGrpc.getNackMessageMethod) == null) {
          MessagingServiceGrpc.getNackMessageMethod = getNackMessageMethod =
              io.grpc.MethodDescriptor.<apache.rocketmq.v2.NackMessageRequest, apache.rocketmq.v2.NackMessageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NackMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  apache.rocketmq.v2.NackMessageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  apache.rocketmq.v2.NackMessageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MessagingServiceMethodDescriptorSupplier("NackMessage"))
              .build();
        }
      }
    }
    return getNackMessageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<apache.rocketmq.v2.ForwardMessageToDeadLetterQueueRequest,
      apache.rocketmq.v2.ForwardMessageToDeadLetterQueueResponse> getForwardMessageToDeadLetterQueueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ForwardMessageToDeadLetterQueue",
      requestType = apache.rocketmq.v2.ForwardMessageToDeadLetterQueueRequest.class,
      responseType = apache.rocketmq.v2.ForwardMessageToDeadLetterQueueResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<apache.rocketmq.v2.ForwardMessageToDeadLetterQueueRequest,
      apache.rocketmq.v2.ForwardMessageToDeadLetterQueueResponse> getForwardMessageToDeadLetterQueueMethod() {
    io.grpc.MethodDescriptor<apache.rocketmq.v2.ForwardMessageToDeadLetterQueueRequest, apache.rocketmq.v2.ForwardMessageToDeadLetterQueueResponse> getForwardMessageToDeadLetterQueueMethod;
    if ((getForwardMessageToDeadLetterQueueMethod = MessagingServiceGrpc.getForwardMessageToDeadLetterQueueMethod) == null) {
      synchronized (MessagingServiceGrpc.class) {
        if ((getForwardMessageToDeadLetterQueueMethod = MessagingServiceGrpc.getForwardMessageToDeadLetterQueueMethod) == null) {
          MessagingServiceGrpc.getForwardMessageToDeadLetterQueueMethod = getForwardMessageToDeadLetterQueueMethod =
              io.grpc.MethodDescriptor.<apache.rocketmq.v2.ForwardMessageToDeadLetterQueueRequest, apache.rocketmq.v2.ForwardMessageToDeadLetterQueueResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ForwardMessageToDeadLetterQueue"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  apache.rocketmq.v2.ForwardMessageToDeadLetterQueueRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  apache.rocketmq.v2.ForwardMessageToDeadLetterQueueResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MessagingServiceMethodDescriptorSupplier("ForwardMessageToDeadLetterQueue"))
              .build();
        }
      }
    }
    return getForwardMessageToDeadLetterQueueMethod;
  }

  private static volatile io.grpc.MethodDescriptor<apache.rocketmq.v2.EndTransactionRequest,
      apache.rocketmq.v2.EndTransactionResponse> getEndTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EndTransaction",
      requestType = apache.rocketmq.v2.EndTransactionRequest.class,
      responseType = apache.rocketmq.v2.EndTransactionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<apache.rocketmq.v2.EndTransactionRequest,
      apache.rocketmq.v2.EndTransactionResponse> getEndTransactionMethod() {
    io.grpc.MethodDescriptor<apache.rocketmq.v2.EndTransactionRequest, apache.rocketmq.v2.EndTransactionResponse> getEndTransactionMethod;
    if ((getEndTransactionMethod = MessagingServiceGrpc.getEndTransactionMethod) == null) {
      synchronized (MessagingServiceGrpc.class) {
        if ((getEndTransactionMethod = MessagingServiceGrpc.getEndTransactionMethod) == null) {
          MessagingServiceGrpc.getEndTransactionMethod = getEndTransactionMethod =
              io.grpc.MethodDescriptor.<apache.rocketmq.v2.EndTransactionRequest, apache.rocketmq.v2.EndTransactionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EndTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  apache.rocketmq.v2.EndTransactionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  apache.rocketmq.v2.EndTransactionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MessagingServiceMethodDescriptorSupplier("EndTransaction"))
              .build();
        }
      }
    }
    return getEndTransactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<apache.rocketmq.v2.TelemetryCommand,
      apache.rocketmq.v2.TelemetryCommand> getTelemetryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Telemetry",
      requestType = apache.rocketmq.v2.TelemetryCommand.class,
      responseType = apache.rocketmq.v2.TelemetryCommand.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<apache.rocketmq.v2.TelemetryCommand,
      apache.rocketmq.v2.TelemetryCommand> getTelemetryMethod() {
    io.grpc.MethodDescriptor<apache.rocketmq.v2.TelemetryCommand, apache.rocketmq.v2.TelemetryCommand> getTelemetryMethod;
    if ((getTelemetryMethod = MessagingServiceGrpc.getTelemetryMethod) == null) {
      synchronized (MessagingServiceGrpc.class) {
        if ((getTelemetryMethod = MessagingServiceGrpc.getTelemetryMethod) == null) {
          MessagingServiceGrpc.getTelemetryMethod = getTelemetryMethod =
              io.grpc.MethodDescriptor.<apache.rocketmq.v2.TelemetryCommand, apache.rocketmq.v2.TelemetryCommand>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Telemetry"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  apache.rocketmq.v2.TelemetryCommand.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  apache.rocketmq.v2.TelemetryCommand.getDefaultInstance()))
              .setSchemaDescriptor(new MessagingServiceMethodDescriptorSupplier("Telemetry"))
              .build();
        }
      }
    }
    return getTelemetryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<apache.rocketmq.v2.NotifyClientTerminationRequest,
      apache.rocketmq.v2.NotifyClientTerminationResponse> getNotifyClientTerminationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NotifyClientTermination",
      requestType = apache.rocketmq.v2.NotifyClientTerminationRequest.class,
      responseType = apache.rocketmq.v2.NotifyClientTerminationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<apache.rocketmq.v2.NotifyClientTerminationRequest,
      apache.rocketmq.v2.NotifyClientTerminationResponse> getNotifyClientTerminationMethod() {
    io.grpc.MethodDescriptor<apache.rocketmq.v2.NotifyClientTerminationRequest, apache.rocketmq.v2.NotifyClientTerminationResponse> getNotifyClientTerminationMethod;
    if ((getNotifyClientTerminationMethod = MessagingServiceGrpc.getNotifyClientTerminationMethod) == null) {
      synchronized (MessagingServiceGrpc.class) {
        if ((getNotifyClientTerminationMethod = MessagingServiceGrpc.getNotifyClientTerminationMethod) == null) {
          MessagingServiceGrpc.getNotifyClientTerminationMethod = getNotifyClientTerminationMethod =
              io.grpc.MethodDescriptor.<apache.rocketmq.v2.NotifyClientTerminationRequest, apache.rocketmq.v2.NotifyClientTerminationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NotifyClientTermination"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  apache.rocketmq.v2.NotifyClientTerminationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  apache.rocketmq.v2.NotifyClientTerminationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MessagingServiceMethodDescriptorSupplier("NotifyClientTermination"))
              .build();
        }
      }
    }
    return getNotifyClientTerminationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<apache.rocketmq.v2.ChangeInvisibleDurationRequest,
      apache.rocketmq.v2.ChangeInvisibleDurationResponse> getChangeInvisibleDurationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ChangeInvisibleDuration",
      requestType = apache.rocketmq.v2.ChangeInvisibleDurationRequest.class,
      responseType = apache.rocketmq.v2.ChangeInvisibleDurationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<apache.rocketmq.v2.ChangeInvisibleDurationRequest,
      apache.rocketmq.v2.ChangeInvisibleDurationResponse> getChangeInvisibleDurationMethod() {
    io.grpc.MethodDescriptor<apache.rocketmq.v2.ChangeInvisibleDurationRequest, apache.rocketmq.v2.ChangeInvisibleDurationResponse> getChangeInvisibleDurationMethod;
    if ((getChangeInvisibleDurationMethod = MessagingServiceGrpc.getChangeInvisibleDurationMethod) == null) {
      synchronized (MessagingServiceGrpc.class) {
        if ((getChangeInvisibleDurationMethod = MessagingServiceGrpc.getChangeInvisibleDurationMethod) == null) {
          MessagingServiceGrpc.getChangeInvisibleDurationMethod = getChangeInvisibleDurationMethod =
              io.grpc.MethodDescriptor.<apache.rocketmq.v2.ChangeInvisibleDurationRequest, apache.rocketmq.v2.ChangeInvisibleDurationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ChangeInvisibleDuration"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  apache.rocketmq.v2.ChangeInvisibleDurationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  apache.rocketmq.v2.ChangeInvisibleDurationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MessagingServiceMethodDescriptorSupplier("ChangeInvisibleDuration"))
              .build();
        }
      }
    }
    return getChangeInvisibleDurationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MessagingServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MessagingServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MessagingServiceStub>() {
        @java.lang.Override
        public MessagingServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MessagingServiceStub(channel, callOptions);
        }
      };
    return MessagingServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MessagingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MessagingServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MessagingServiceBlockingStub>() {
        @java.lang.Override
        public MessagingServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MessagingServiceBlockingStub(channel, callOptions);
        }
      };
    return MessagingServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MessagingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MessagingServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MessagingServiceFutureStub>() {
        @java.lang.Override
        public MessagingServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MessagingServiceFutureStub(channel, callOptions);
        }
      };
    return MessagingServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * For all the RPCs in MessagingService, the following error handling policies
   * apply:
   * If the request doesn't bear a valid authentication credential, return a
   * response with common.status.code == `UNAUTHENTICATED`. If the authenticated
   * user is not granted with sufficient permission to execute the requested
   * operation, return a response with common.status.code == `PERMISSION_DENIED`.
   * If the per-user-resource-based quota is exhausted, return a response with
   * common.status.code == `RESOURCE_EXHAUSTED`. If any unexpected server-side
   * errors raise, return a response with common.status.code == `INTERNAL`.
   * </pre>
   */
  public static abstract class MessagingServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Queries the route entries of the requested topic in the perspective of the
     * given endpoints. On success, servers should return a collection of
     * addressable message-queues. Note servers may return customized route
     * entries based on endpoints provided.
     * If the requested topic doesn't exist, returns `NOT_FOUND`.
     * If the specific endpoints is empty, returns `INVALID_ARGUMENT`.
     * </pre>
     */
    public void queryRoute(apache.rocketmq.v2.QueryRouteRequest request,
        io.grpc.stub.StreamObserver<apache.rocketmq.v2.QueryRouteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryRouteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Producer or consumer sends HeartbeatRequest to servers periodically to
     * keep-alive. Additionally, it also reports client-side configuration,
     * including topic subscription, load-balancing group name, etc.
     * Returns `OK` if success.
     * If a client specifies a language that is not yet supported by servers,
     * returns `INVALID_ARGUMENT`
     * </pre>
     */
    public void heartbeat(apache.rocketmq.v2.HeartbeatRequest request,
        io.grpc.stub.StreamObserver<apache.rocketmq.v2.HeartbeatResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHeartbeatMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delivers messages to brokers.
     * Clients may further:
     * 1. Refine a message destination to message-queues which fulfills parts of
     * FIFO semantic;
     * 2. Flag a message as transactional, which keeps it invisible to consumers
     * until it commits;
     * 3. Time a message, making it invisible to consumers till specified
     * time-point;
     * 4. And more...
     * Returns message-id or transaction-id with status `OK` on success.
     * If the destination topic doesn't exist, returns `NOT_FOUND`.
     * </pre>
     */
    public void sendMessage(apache.rocketmq.v2.SendMessageRequest request,
        io.grpc.stub.StreamObserver<apache.rocketmq.v2.SendMessageResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendMessageMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries the assigned route info of a topic for current consumer,
     * the returned assignment result is decided by server-side load balancer.
     * If the corresponding topic doesn't exist, returns `NOT_FOUND`.
     * If the specific endpoints is empty, returns `INVALID_ARGUMENT`.
     * </pre>
     */
    public void queryAssignment(apache.rocketmq.v2.QueryAssignmentRequest request,
        io.grpc.stub.StreamObserver<apache.rocketmq.v2.QueryAssignmentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryAssignmentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Receives messages from the server in batch manner, returns a set of
     * messages if success. The received messages should be acked or nacked after
     * processed.
     * If the pending concurrent receive requests exceed the quota of the given
     * consumer group, returns `UNAVAILABLE`. If the upstream store server hangs,
     * return `DEADLINE_EXCEEDED` in a timely manner. If the corresponding topic
     * or consumer group doesn't exist, returns `NOT_FOUND`. If there is no new
     * message in the specific topic, returns `OK` with an empty message set.
     * Please note that client may suffer from false empty responses.
     * If failed to receive message from remote, server must return only one
     * `ReceiveMessageResponse` as the reply to the request, whose `Status` indicates
     * the specific reason of failure, otherwise, the reply is considered successful.
     * </pre>
     */
    public void receiveMessage(apache.rocketmq.v2.ReceiveMessageRequest request,
        io.grpc.stub.StreamObserver<apache.rocketmq.v2.ReceiveMessageResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReceiveMessageMethod(), responseObserver);
    }

    /**
     * <pre>
     * Acknowledges the message associated with the `receipt_handle` or `offset`
     * in the `AckMessageRequest`, it means the message has been successfully
     * processed. Returns `OK` if the message server remove the relevant message
     * successfully.
     * If the given receipt_handle is illegal or out of date, returns
     * `INVALID_ARGUMENT`.
     * </pre>
     */
    public void ackMessage(apache.rocketmq.v2.AckMessageRequest request,
        io.grpc.stub.StreamObserver<apache.rocketmq.v2.AckMessageResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAckMessageMethod(), responseObserver);
    }

    /**
     * <pre>
     * Signals that the message has not been successfully processed. The message
     * server should resend the message follow the retry policy defined at
     * server-side.
     * If the corresponding topic or consumer group doesn't exist, returns
     * `NOT_FOUND`.
     * </pre>
     */
    public void nackMessage(apache.rocketmq.v2.NackMessageRequest request,
        io.grpc.stub.StreamObserver<apache.rocketmq.v2.NackMessageResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNackMessageMethod(), responseObserver);
    }

    /**
     * <pre>
     * Forwards one message to dead letter queue if the max delivery attempts is
     * exceeded by this message at client-side, return `OK` if success.
     * </pre>
     */
    public void forwardMessageToDeadLetterQueue(apache.rocketmq.v2.ForwardMessageToDeadLetterQueueRequest request,
        io.grpc.stub.StreamObserver<apache.rocketmq.v2.ForwardMessageToDeadLetterQueueResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getForwardMessageToDeadLetterQueueMethod(), responseObserver);
    }

    /**
     * <pre>
     * Commits or rollback one transactional message.
     * </pre>
     */
    public void endTransaction(apache.rocketmq.v2.EndTransactionRequest request,
        io.grpc.stub.StreamObserver<apache.rocketmq.v2.EndTransactionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEndTransactionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Once a client starts, it would immediately establishes bi-lateral stream
     * RPCs with brokers, reporting its settings as the initiative command.
     * When servers have need of inspecting client status, they would issue
     * telemetry commands to clients. After executing received instructions,
     * clients shall report command execution results through client-side streams.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<apache.rocketmq.v2.TelemetryCommand> telemetry(
        io.grpc.stub.StreamObserver<apache.rocketmq.v2.TelemetryCommand> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getTelemetryMethod(), responseObserver);
    }

    /**
     * <pre>
     * Notify the server that the client is terminated.
     * </pre>
     */
    public void notifyClientTermination(apache.rocketmq.v2.NotifyClientTerminationRequest request,
        io.grpc.stub.StreamObserver<apache.rocketmq.v2.NotifyClientTerminationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNotifyClientTerminationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Once a message is retrieved from consume queue on behalf of the group, it
     * will be kept invisible to other clients of the same group for a period of
     * time. The message is supposed to be processed within the invisible
     * duration. If the client, which is in charge of the invisible message, is
     * not capable of processing the message timely, it may use
     * ChangeInvisibleDuration to lengthen invisible duration.
     * </pre>
     */
    public void changeInvisibleDuration(apache.rocketmq.v2.ChangeInvisibleDurationRequest request,
        io.grpc.stub.StreamObserver<apache.rocketmq.v2.ChangeInvisibleDurationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getChangeInvisibleDurationMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getQueryRouteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                apache.rocketmq.v2.QueryRouteRequest,
                apache.rocketmq.v2.QueryRouteResponse>(
                  this, METHODID_QUERY_ROUTE)))
          .addMethod(
            getHeartbeatMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                apache.rocketmq.v2.HeartbeatRequest,
                apache.rocketmq.v2.HeartbeatResponse>(
                  this, METHODID_HEARTBEAT)))
          .addMethod(
            getSendMessageMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                apache.rocketmq.v2.SendMessageRequest,
                apache.rocketmq.v2.SendMessageResponse>(
                  this, METHODID_SEND_MESSAGE)))
          .addMethod(
            getQueryAssignmentMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                apache.rocketmq.v2.QueryAssignmentRequest,
                apache.rocketmq.v2.QueryAssignmentResponse>(
                  this, METHODID_QUERY_ASSIGNMENT)))
          .addMethod(
            getReceiveMessageMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                apache.rocketmq.v2.ReceiveMessageRequest,
                apache.rocketmq.v2.ReceiveMessageResponse>(
                  this, METHODID_RECEIVE_MESSAGE)))
          .addMethod(
            getAckMessageMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                apache.rocketmq.v2.AckMessageRequest,
                apache.rocketmq.v2.AckMessageResponse>(
                  this, METHODID_ACK_MESSAGE)))
          .addMethod(
            getNackMessageMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                apache.rocketmq.v2.NackMessageRequest,
                apache.rocketmq.v2.NackMessageResponse>(
                  this, METHODID_NACK_MESSAGE)))
          .addMethod(
            getForwardMessageToDeadLetterQueueMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                apache.rocketmq.v2.ForwardMessageToDeadLetterQueueRequest,
                apache.rocketmq.v2.ForwardMessageToDeadLetterQueueResponse>(
                  this, METHODID_FORWARD_MESSAGE_TO_DEAD_LETTER_QUEUE)))
          .addMethod(
            getEndTransactionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                apache.rocketmq.v2.EndTransactionRequest,
                apache.rocketmq.v2.EndTransactionResponse>(
                  this, METHODID_END_TRANSACTION)))
          .addMethod(
            getTelemetryMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                apache.rocketmq.v2.TelemetryCommand,
                apache.rocketmq.v2.TelemetryCommand>(
                  this, METHODID_TELEMETRY)))
          .addMethod(
            getNotifyClientTerminationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                apache.rocketmq.v2.NotifyClientTerminationRequest,
                apache.rocketmq.v2.NotifyClientTerminationResponse>(
                  this, METHODID_NOTIFY_CLIENT_TERMINATION)))
          .addMethod(
            getChangeInvisibleDurationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                apache.rocketmq.v2.ChangeInvisibleDurationRequest,
                apache.rocketmq.v2.ChangeInvisibleDurationResponse>(
                  this, METHODID_CHANGE_INVISIBLE_DURATION)))
          .build();
    }
  }

  /**
   * <pre>
   * For all the RPCs in MessagingService, the following error handling policies
   * apply:
   * If the request doesn't bear a valid authentication credential, return a
   * response with common.status.code == `UNAUTHENTICATED`. If the authenticated
   * user is not granted with sufficient permission to execute the requested
   * operation, return a response with common.status.code == `PERMISSION_DENIED`.
   * If the per-user-resource-based quota is exhausted, return a response with
   * common.status.code == `RESOURCE_EXHAUSTED`. If any unexpected server-side
   * errors raise, return a response with common.status.code == `INTERNAL`.
   * </pre>
   */
  public static final class MessagingServiceStub extends io.grpc.stub.AbstractAsyncStub<MessagingServiceStub> {
    private MessagingServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MessagingServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MessagingServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Queries the route entries of the requested topic in the perspective of the
     * given endpoints. On success, servers should return a collection of
     * addressable message-queues. Note servers may return customized route
     * entries based on endpoints provided.
     * If the requested topic doesn't exist, returns `NOT_FOUND`.
     * If the specific endpoints is empty, returns `INVALID_ARGUMENT`.
     * </pre>
     */
    public void queryRoute(apache.rocketmq.v2.QueryRouteRequest request,
        io.grpc.stub.StreamObserver<apache.rocketmq.v2.QueryRouteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryRouteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Producer or consumer sends HeartbeatRequest to servers periodically to
     * keep-alive. Additionally, it also reports client-side configuration,
     * including topic subscription, load-balancing group name, etc.
     * Returns `OK` if success.
     * If a client specifies a language that is not yet supported by servers,
     * returns `INVALID_ARGUMENT`
     * </pre>
     */
    public void heartbeat(apache.rocketmq.v2.HeartbeatRequest request,
        io.grpc.stub.StreamObserver<apache.rocketmq.v2.HeartbeatResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHeartbeatMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delivers messages to brokers.
     * Clients may further:
     * 1. Refine a message destination to message-queues which fulfills parts of
     * FIFO semantic;
     * 2. Flag a message as transactional, which keeps it invisible to consumers
     * until it commits;
     * 3. Time a message, making it invisible to consumers till specified
     * time-point;
     * 4. And more...
     * Returns message-id or transaction-id with status `OK` on success.
     * If the destination topic doesn't exist, returns `NOT_FOUND`.
     * </pre>
     */
    public void sendMessage(apache.rocketmq.v2.SendMessageRequest request,
        io.grpc.stub.StreamObserver<apache.rocketmq.v2.SendMessageResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendMessageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries the assigned route info of a topic for current consumer,
     * the returned assignment result is decided by server-side load balancer.
     * If the corresponding topic doesn't exist, returns `NOT_FOUND`.
     * If the specific endpoints is empty, returns `INVALID_ARGUMENT`.
     * </pre>
     */
    public void queryAssignment(apache.rocketmq.v2.QueryAssignmentRequest request,
        io.grpc.stub.StreamObserver<apache.rocketmq.v2.QueryAssignmentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryAssignmentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Receives messages from the server in batch manner, returns a set of
     * messages if success. The received messages should be acked or nacked after
     * processed.
     * If the pending concurrent receive requests exceed the quota of the given
     * consumer group, returns `UNAVAILABLE`. If the upstream store server hangs,
     * return `DEADLINE_EXCEEDED` in a timely manner. If the corresponding topic
     * or consumer group doesn't exist, returns `NOT_FOUND`. If there is no new
     * message in the specific topic, returns `OK` with an empty message set.
     * Please note that client may suffer from false empty responses.
     * If failed to receive message from remote, server must return only one
     * `ReceiveMessageResponse` as the reply to the request, whose `Status` indicates
     * the specific reason of failure, otherwise, the reply is considered successful.
     * </pre>
     */
    public void receiveMessage(apache.rocketmq.v2.ReceiveMessageRequest request,
        io.grpc.stub.StreamObserver<apache.rocketmq.v2.ReceiveMessageResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getReceiveMessageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Acknowledges the message associated with the `receipt_handle` or `offset`
     * in the `AckMessageRequest`, it means the message has been successfully
     * processed. Returns `OK` if the message server remove the relevant message
     * successfully.
     * If the given receipt_handle is illegal or out of date, returns
     * `INVALID_ARGUMENT`.
     * </pre>
     */
    public void ackMessage(apache.rocketmq.v2.AckMessageRequest request,
        io.grpc.stub.StreamObserver<apache.rocketmq.v2.AckMessageResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAckMessageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Signals that the message has not been successfully processed. The message
     * server should resend the message follow the retry policy defined at
     * server-side.
     * If the corresponding topic or consumer group doesn't exist, returns
     * `NOT_FOUND`.
     * </pre>
     */
    public void nackMessage(apache.rocketmq.v2.NackMessageRequest request,
        io.grpc.stub.StreamObserver<apache.rocketmq.v2.NackMessageResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNackMessageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Forwards one message to dead letter queue if the max delivery attempts is
     * exceeded by this message at client-side, return `OK` if success.
     * </pre>
     */
    public void forwardMessageToDeadLetterQueue(apache.rocketmq.v2.ForwardMessageToDeadLetterQueueRequest request,
        io.grpc.stub.StreamObserver<apache.rocketmq.v2.ForwardMessageToDeadLetterQueueResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getForwardMessageToDeadLetterQueueMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Commits or rollback one transactional message.
     * </pre>
     */
    public void endTransaction(apache.rocketmq.v2.EndTransactionRequest request,
        io.grpc.stub.StreamObserver<apache.rocketmq.v2.EndTransactionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEndTransactionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Once a client starts, it would immediately establishes bi-lateral stream
     * RPCs with brokers, reporting its settings as the initiative command.
     * When servers have need of inspecting client status, they would issue
     * telemetry commands to clients. After executing received instructions,
     * clients shall report command execution results through client-side streams.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<apache.rocketmq.v2.TelemetryCommand> telemetry(
        io.grpc.stub.StreamObserver<apache.rocketmq.v2.TelemetryCommand> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getTelemetryMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * Notify the server that the client is terminated.
     * </pre>
     */
    public void notifyClientTermination(apache.rocketmq.v2.NotifyClientTerminationRequest request,
        io.grpc.stub.StreamObserver<apache.rocketmq.v2.NotifyClientTerminationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNotifyClientTerminationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Once a message is retrieved from consume queue on behalf of the group, it
     * will be kept invisible to other clients of the same group for a period of
     * time. The message is supposed to be processed within the invisible
     * duration. If the client, which is in charge of the invisible message, is
     * not capable of processing the message timely, it may use
     * ChangeInvisibleDuration to lengthen invisible duration.
     * </pre>
     */
    public void changeInvisibleDuration(apache.rocketmq.v2.ChangeInvisibleDurationRequest request,
        io.grpc.stub.StreamObserver<apache.rocketmq.v2.ChangeInvisibleDurationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getChangeInvisibleDurationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * For all the RPCs in MessagingService, the following error handling policies
   * apply:
   * If the request doesn't bear a valid authentication credential, return a
   * response with common.status.code == `UNAUTHENTICATED`. If the authenticated
   * user is not granted with sufficient permission to execute the requested
   * operation, return a response with common.status.code == `PERMISSION_DENIED`.
   * If the per-user-resource-based quota is exhausted, return a response with
   * common.status.code == `RESOURCE_EXHAUSTED`. If any unexpected server-side
   * errors raise, return a response with common.status.code == `INTERNAL`.
   * </pre>
   */
  public static final class MessagingServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<MessagingServiceBlockingStub> {
    private MessagingServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MessagingServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MessagingServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Queries the route entries of the requested topic in the perspective of the
     * given endpoints. On success, servers should return a collection of
     * addressable message-queues. Note servers may return customized route
     * entries based on endpoints provided.
     * If the requested topic doesn't exist, returns `NOT_FOUND`.
     * If the specific endpoints is empty, returns `INVALID_ARGUMENT`.
     * </pre>
     */
    public apache.rocketmq.v2.QueryRouteResponse queryRoute(apache.rocketmq.v2.QueryRouteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryRouteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Producer or consumer sends HeartbeatRequest to servers periodically to
     * keep-alive. Additionally, it also reports client-side configuration,
     * including topic subscription, load-balancing group name, etc.
     * Returns `OK` if success.
     * If a client specifies a language that is not yet supported by servers,
     * returns `INVALID_ARGUMENT`
     * </pre>
     */
    public apache.rocketmq.v2.HeartbeatResponse heartbeat(apache.rocketmq.v2.HeartbeatRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHeartbeatMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delivers messages to brokers.
     * Clients may further:
     * 1. Refine a message destination to message-queues which fulfills parts of
     * FIFO semantic;
     * 2. Flag a message as transactional, which keeps it invisible to consumers
     * until it commits;
     * 3. Time a message, making it invisible to consumers till specified
     * time-point;
     * 4. And more...
     * Returns message-id or transaction-id with status `OK` on success.
     * If the destination topic doesn't exist, returns `NOT_FOUND`.
     * </pre>
     */
    public apache.rocketmq.v2.SendMessageResponse sendMessage(apache.rocketmq.v2.SendMessageRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendMessageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries the assigned route info of a topic for current consumer,
     * the returned assignment result is decided by server-side load balancer.
     * If the corresponding topic doesn't exist, returns `NOT_FOUND`.
     * If the specific endpoints is empty, returns `INVALID_ARGUMENT`.
     * </pre>
     */
    public apache.rocketmq.v2.QueryAssignmentResponse queryAssignment(apache.rocketmq.v2.QueryAssignmentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryAssignmentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Receives messages from the server in batch manner, returns a set of
     * messages if success. The received messages should be acked or nacked after
     * processed.
     * If the pending concurrent receive requests exceed the quota of the given
     * consumer group, returns `UNAVAILABLE`. If the upstream store server hangs,
     * return `DEADLINE_EXCEEDED` in a timely manner. If the corresponding topic
     * or consumer group doesn't exist, returns `NOT_FOUND`. If there is no new
     * message in the specific topic, returns `OK` with an empty message set.
     * Please note that client may suffer from false empty responses.
     * If failed to receive message from remote, server must return only one
     * `ReceiveMessageResponse` as the reply to the request, whose `Status` indicates
     * the specific reason of failure, otherwise, the reply is considered successful.
     * </pre>
     */
    public java.util.Iterator<apache.rocketmq.v2.ReceiveMessageResponse> receiveMessage(
        apache.rocketmq.v2.ReceiveMessageRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getReceiveMessageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Acknowledges the message associated with the `receipt_handle` or `offset`
     * in the `AckMessageRequest`, it means the message has been successfully
     * processed. Returns `OK` if the message server remove the relevant message
     * successfully.
     * If the given receipt_handle is illegal or out of date, returns
     * `INVALID_ARGUMENT`.
     * </pre>
     */
    public apache.rocketmq.v2.AckMessageResponse ackMessage(apache.rocketmq.v2.AckMessageRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAckMessageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Signals that the message has not been successfully processed. The message
     * server should resend the message follow the retry policy defined at
     * server-side.
     * If the corresponding topic or consumer group doesn't exist, returns
     * `NOT_FOUND`.
     * </pre>
     */
    public apache.rocketmq.v2.NackMessageResponse nackMessage(apache.rocketmq.v2.NackMessageRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNackMessageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Forwards one message to dead letter queue if the max delivery attempts is
     * exceeded by this message at client-side, return `OK` if success.
     * </pre>
     */
    public apache.rocketmq.v2.ForwardMessageToDeadLetterQueueResponse forwardMessageToDeadLetterQueue(apache.rocketmq.v2.ForwardMessageToDeadLetterQueueRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getForwardMessageToDeadLetterQueueMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Commits or rollback one transactional message.
     * </pre>
     */
    public apache.rocketmq.v2.EndTransactionResponse endTransaction(apache.rocketmq.v2.EndTransactionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEndTransactionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Notify the server that the client is terminated.
     * </pre>
     */
    public apache.rocketmq.v2.NotifyClientTerminationResponse notifyClientTermination(apache.rocketmq.v2.NotifyClientTerminationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNotifyClientTerminationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Once a message is retrieved from consume queue on behalf of the group, it
     * will be kept invisible to other clients of the same group for a period of
     * time. The message is supposed to be processed within the invisible
     * duration. If the client, which is in charge of the invisible message, is
     * not capable of processing the message timely, it may use
     * ChangeInvisibleDuration to lengthen invisible duration.
     * </pre>
     */
    public apache.rocketmq.v2.ChangeInvisibleDurationResponse changeInvisibleDuration(apache.rocketmq.v2.ChangeInvisibleDurationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getChangeInvisibleDurationMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * For all the RPCs in MessagingService, the following error handling policies
   * apply:
   * If the request doesn't bear a valid authentication credential, return a
   * response with common.status.code == `UNAUTHENTICATED`. If the authenticated
   * user is not granted with sufficient permission to execute the requested
   * operation, return a response with common.status.code == `PERMISSION_DENIED`.
   * If the per-user-resource-based quota is exhausted, return a response with
   * common.status.code == `RESOURCE_EXHAUSTED`. If any unexpected server-side
   * errors raise, return a response with common.status.code == `INTERNAL`.
   * </pre>
   */
  public static final class MessagingServiceFutureStub extends io.grpc.stub.AbstractFutureStub<MessagingServiceFutureStub> {
    private MessagingServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MessagingServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MessagingServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Queries the route entries of the requested topic in the perspective of the
     * given endpoints. On success, servers should return a collection of
     * addressable message-queues. Note servers may return customized route
     * entries based on endpoints provided.
     * If the requested topic doesn't exist, returns `NOT_FOUND`.
     * If the specific endpoints is empty, returns `INVALID_ARGUMENT`.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<apache.rocketmq.v2.QueryRouteResponse> queryRoute(
        apache.rocketmq.v2.QueryRouteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryRouteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Producer or consumer sends HeartbeatRequest to servers periodically to
     * keep-alive. Additionally, it also reports client-side configuration,
     * including topic subscription, load-balancing group name, etc.
     * Returns `OK` if success.
     * If a client specifies a language that is not yet supported by servers,
     * returns `INVALID_ARGUMENT`
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<apache.rocketmq.v2.HeartbeatResponse> heartbeat(
        apache.rocketmq.v2.HeartbeatRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHeartbeatMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delivers messages to brokers.
     * Clients may further:
     * 1. Refine a message destination to message-queues which fulfills parts of
     * FIFO semantic;
     * 2. Flag a message as transactional, which keeps it invisible to consumers
     * until it commits;
     * 3. Time a message, making it invisible to consumers till specified
     * time-point;
     * 4. And more...
     * Returns message-id or transaction-id with status `OK` on success.
     * If the destination topic doesn't exist, returns `NOT_FOUND`.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<apache.rocketmq.v2.SendMessageResponse> sendMessage(
        apache.rocketmq.v2.SendMessageRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendMessageMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries the assigned route info of a topic for current consumer,
     * the returned assignment result is decided by server-side load balancer.
     * If the corresponding topic doesn't exist, returns `NOT_FOUND`.
     * If the specific endpoints is empty, returns `INVALID_ARGUMENT`.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<apache.rocketmq.v2.QueryAssignmentResponse> queryAssignment(
        apache.rocketmq.v2.QueryAssignmentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryAssignmentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Acknowledges the message associated with the `receipt_handle` or `offset`
     * in the `AckMessageRequest`, it means the message has been successfully
     * processed. Returns `OK` if the message server remove the relevant message
     * successfully.
     * If the given receipt_handle is illegal or out of date, returns
     * `INVALID_ARGUMENT`.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<apache.rocketmq.v2.AckMessageResponse> ackMessage(
        apache.rocketmq.v2.AckMessageRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAckMessageMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Signals that the message has not been successfully processed. The message
     * server should resend the message follow the retry policy defined at
     * server-side.
     * If the corresponding topic or consumer group doesn't exist, returns
     * `NOT_FOUND`.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<apache.rocketmq.v2.NackMessageResponse> nackMessage(
        apache.rocketmq.v2.NackMessageRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNackMessageMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Forwards one message to dead letter queue if the max delivery attempts is
     * exceeded by this message at client-side, return `OK` if success.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<apache.rocketmq.v2.ForwardMessageToDeadLetterQueueResponse> forwardMessageToDeadLetterQueue(
        apache.rocketmq.v2.ForwardMessageToDeadLetterQueueRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getForwardMessageToDeadLetterQueueMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Commits or rollback one transactional message.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<apache.rocketmq.v2.EndTransactionResponse> endTransaction(
        apache.rocketmq.v2.EndTransactionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEndTransactionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Notify the server that the client is terminated.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<apache.rocketmq.v2.NotifyClientTerminationResponse> notifyClientTermination(
        apache.rocketmq.v2.NotifyClientTerminationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNotifyClientTerminationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Once a message is retrieved from consume queue on behalf of the group, it
     * will be kept invisible to other clients of the same group for a period of
     * time. The message is supposed to be processed within the invisible
     * duration. If the client, which is in charge of the invisible message, is
     * not capable of processing the message timely, it may use
     * ChangeInvisibleDuration to lengthen invisible duration.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<apache.rocketmq.v2.ChangeInvisibleDurationResponse> changeInvisibleDuration(
        apache.rocketmq.v2.ChangeInvisibleDurationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getChangeInvisibleDurationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_QUERY_ROUTE = 0;
  private static final int METHODID_HEARTBEAT = 1;
  private static final int METHODID_SEND_MESSAGE = 2;
  private static final int METHODID_QUERY_ASSIGNMENT = 3;
  private static final int METHODID_RECEIVE_MESSAGE = 4;
  private static final int METHODID_ACK_MESSAGE = 5;
  private static final int METHODID_NACK_MESSAGE = 6;
  private static final int METHODID_FORWARD_MESSAGE_TO_DEAD_LETTER_QUEUE = 7;
  private static final int METHODID_END_TRANSACTION = 8;
  private static final int METHODID_NOTIFY_CLIENT_TERMINATION = 9;
  private static final int METHODID_CHANGE_INVISIBLE_DURATION = 10;
  private static final int METHODID_TELEMETRY = 11;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MessagingServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MessagingServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_QUERY_ROUTE:
          serviceImpl.queryRoute((apache.rocketmq.v2.QueryRouteRequest) request,
              (io.grpc.stub.StreamObserver<apache.rocketmq.v2.QueryRouteResponse>) responseObserver);
          break;
        case METHODID_HEARTBEAT:
          serviceImpl.heartbeat((apache.rocketmq.v2.HeartbeatRequest) request,
              (io.grpc.stub.StreamObserver<apache.rocketmq.v2.HeartbeatResponse>) responseObserver);
          break;
        case METHODID_SEND_MESSAGE:
          serviceImpl.sendMessage((apache.rocketmq.v2.SendMessageRequest) request,
              (io.grpc.stub.StreamObserver<apache.rocketmq.v2.SendMessageResponse>) responseObserver);
          break;
        case METHODID_QUERY_ASSIGNMENT:
          serviceImpl.queryAssignment((apache.rocketmq.v2.QueryAssignmentRequest) request,
              (io.grpc.stub.StreamObserver<apache.rocketmq.v2.QueryAssignmentResponse>) responseObserver);
          break;
        case METHODID_RECEIVE_MESSAGE:
          serviceImpl.receiveMessage((apache.rocketmq.v2.ReceiveMessageRequest) request,
              (io.grpc.stub.StreamObserver<apache.rocketmq.v2.ReceiveMessageResponse>) responseObserver);
          break;
        case METHODID_ACK_MESSAGE:
          serviceImpl.ackMessage((apache.rocketmq.v2.AckMessageRequest) request,
              (io.grpc.stub.StreamObserver<apache.rocketmq.v2.AckMessageResponse>) responseObserver);
          break;
        case METHODID_NACK_MESSAGE:
          serviceImpl.nackMessage((apache.rocketmq.v2.NackMessageRequest) request,
              (io.grpc.stub.StreamObserver<apache.rocketmq.v2.NackMessageResponse>) responseObserver);
          break;
        case METHODID_FORWARD_MESSAGE_TO_DEAD_LETTER_QUEUE:
          serviceImpl.forwardMessageToDeadLetterQueue((apache.rocketmq.v2.ForwardMessageToDeadLetterQueueRequest) request,
              (io.grpc.stub.StreamObserver<apache.rocketmq.v2.ForwardMessageToDeadLetterQueueResponse>) responseObserver);
          break;
        case METHODID_END_TRANSACTION:
          serviceImpl.endTransaction((apache.rocketmq.v2.EndTransactionRequest) request,
              (io.grpc.stub.StreamObserver<apache.rocketmq.v2.EndTransactionResponse>) responseObserver);
          break;
        case METHODID_NOTIFY_CLIENT_TERMINATION:
          serviceImpl.notifyClientTermination((apache.rocketmq.v2.NotifyClientTerminationRequest) request,
              (io.grpc.stub.StreamObserver<apache.rocketmq.v2.NotifyClientTerminationResponse>) responseObserver);
          break;
        case METHODID_CHANGE_INVISIBLE_DURATION:
          serviceImpl.changeInvisibleDuration((apache.rocketmq.v2.ChangeInvisibleDurationRequest) request,
              (io.grpc.stub.StreamObserver<apache.rocketmq.v2.ChangeInvisibleDurationResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_TELEMETRY:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.telemetry(
              (io.grpc.stub.StreamObserver<apache.rocketmq.v2.TelemetryCommand>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class MessagingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MessagingServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return apache.rocketmq.v2.MQService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MessagingService");
    }
  }

  private static final class MessagingServiceFileDescriptorSupplier
      extends MessagingServiceBaseDescriptorSupplier {
    MessagingServiceFileDescriptorSupplier() {}
  }

  private static final class MessagingServiceMethodDescriptorSupplier
      extends MessagingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MessagingServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (MessagingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MessagingServiceFileDescriptorSupplier())
              .addMethod(getQueryRouteMethod())
              .addMethod(getHeartbeatMethod())
              .addMethod(getSendMessageMethod())
              .addMethod(getQueryAssignmentMethod())
              .addMethod(getReceiveMessageMethod())
              .addMethod(getAckMessageMethod())
              .addMethod(getNackMessageMethod())
              .addMethod(getForwardMessageToDeadLetterQueueMethod())
              .addMethod(getEndTransactionMethod())
              .addMethod(getTelemetryMethod())
              .addMethod(getNotifyClientTerminationMethod())
              .addMethod(getChangeInvisibleDurationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
