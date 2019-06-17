package bolg_developers.bolg.hello.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.22.0-SNAPSHOT)",
    comments = "Source: bolg/hello/v1/hello.proto")
public final class HelloGrpc {

  private HelloGrpc() {}

  public static final String SERVICE_NAME = "bolg.hello.v1.Hello";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<bolg_developers.bolg.type.Empty,
      bolg_developers.bolg.hello.v1.GreetResponse> getGreetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Greet",
      requestType = bolg_developers.bolg.type.Empty.class,
      responseType = bolg_developers.bolg.hello.v1.GreetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bolg_developers.bolg.type.Empty,
      bolg_developers.bolg.hello.v1.GreetResponse> getGreetMethod() {
    io.grpc.MethodDescriptor<bolg_developers.bolg.type.Empty, bolg_developers.bolg.hello.v1.GreetResponse> getGreetMethod;
    if ((getGreetMethod = HelloGrpc.getGreetMethod) == null) {
      synchronized (HelloGrpc.class) {
        if ((getGreetMethod = HelloGrpc.getGreetMethod) == null) {
          HelloGrpc.getGreetMethod = getGreetMethod = 
              io.grpc.MethodDescriptor.<bolg_developers.bolg.type.Empty, bolg_developers.bolg.hello.v1.GreetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bolg.hello.v1.Hello", "Greet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  bolg_developers.bolg.type.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  bolg_developers.bolg.hello.v1.GreetResponse.getDefaultInstance()))
                  .build();
          }
        }
     }
     return getGreetMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HelloStub newStub(io.grpc.Channel channel) {
    return new HelloStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HelloBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new HelloBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HelloFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new HelloFutureStub(channel);
  }

  /**
   */
  public static abstract class HelloImplBase implements io.grpc.BindableService {

    /**
     */
    public void greet(bolg_developers.bolg.type.Empty request,
        io.grpc.stub.StreamObserver<bolg_developers.bolg.hello.v1.GreetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGreetMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGreetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                bolg_developers.bolg.type.Empty,
                bolg_developers.bolg.hello.v1.GreetResponse>(
                  this, METHODID_GREET)))
          .build();
    }
  }

  /**
   */
  public static final class HelloStub extends io.grpc.stub.AbstractStub<HelloStub> {
    private HelloStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HelloStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HelloStub(channel, callOptions);
    }

    /**
     */
    public void greet(bolg_developers.bolg.type.Empty request,
        io.grpc.stub.StreamObserver<bolg_developers.bolg.hello.v1.GreetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGreetMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class HelloBlockingStub extends io.grpc.stub.AbstractStub<HelloBlockingStub> {
    private HelloBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HelloBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HelloBlockingStub(channel, callOptions);
    }

    /**
     */
    public bolg_developers.bolg.hello.v1.GreetResponse greet(bolg_developers.bolg.type.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGreetMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class HelloFutureStub extends io.grpc.stub.AbstractStub<HelloFutureStub> {
    private HelloFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HelloFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HelloFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bolg_developers.bolg.hello.v1.GreetResponse> greet(
        bolg_developers.bolg.type.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGreetMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GREET = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HelloImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HelloImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GREET:
          serviceImpl.greet((bolg_developers.bolg.type.Empty) request,
              (io.grpc.stub.StreamObserver<bolg_developers.bolg.hello.v1.GreetResponse>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (HelloGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getGreetMethod())
              .build();
        }
      }
    }
    return result;
  }
}
