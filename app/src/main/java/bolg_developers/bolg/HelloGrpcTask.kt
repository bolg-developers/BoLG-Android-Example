package bolg_developers.bolg

import bolg_developers.bolg.hello.v1.GreetResponse
import bolg_developers.bolg.hello.v1.HelloGrpc
import bolg_developers.bolg.type.Empty
import io.grpc.ManagedChannelBuilder
import android.util.Log


class HelloService {
    fun greet(): GreetResponse {
        Log.d(javaClass.simpleName, "call greet")
        val channel = ManagedChannelBuilder
                // 127.0.0.1 はダメ！　local ipを直接指定する。
                .forAddress("172.20.10.5", 50051)
                .usePlaintext()
                .build()
        val stub = HelloGrpc.newBlockingStub(channel)
        val request = Empty.newBuilder().build()
        return try {
            stub.greet(request)
        } catch (e: Exception) {
            Log.e(javaClass.simpleName, "Failed to get message", e)
            GreetResponse.newBuilder().setMessage(e.toString()).build()
        }
    }
}

