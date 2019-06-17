package bolg_developers.bolg

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv: TextView = findViewById(R.id.tv)
        tv.text = "初期メッセージ"

        val btn: Button = findViewById(R.id.btn)
        btn.setOnClickListener {
            func()
        }
    }

    fun func() = GlobalScope.launch(Dispatchers.Main) {
        val hs = HelloService()
        async(Dispatchers.Default) {hs.greet()}.await().let {
            val tv: TextView = findViewById(R.id.tv)
            tv.text = it.message
        }
    }
}
