package com.example.st10454062.st10454062newproject1

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_clear =
            findViewById<Button>(R.id.btn_clear)
        val btn_enter =
            findViewById<Button>(R.id.btn_enter)
        val ev_Age =
            findViewById<EditText>(R.id.ev_Age)
        val tv_name =
            findViewById<TextView>(R.id.tv_name)
        val imageView2 =
            findViewById<ImageView>(R.id.imageView2)

        btn_enter.setOnClickListener{
            val userinput = ev_Age.text.toString()
            if (userinput.isEmpty()){
                tv_name.text = "please enter a valid age."
            }
            val user_Age = userinput.toIntOrNull()
            if (user_Age == null){
                tv_name.text = "please enter a valid age."
            }else{
                if (user_Age<20 || user_Age>100){
                    tv_name.text ="please enter age between 20 and 100"
                    ev_Age.text.clear()
                }else{
                    val result = when (user_Age){
                        31 -> "Franz Schubert was an Austrian composer best known for creating symphonies. His most notable work includes Ave Maria, and Erlkönig."
                        35 -> "Wolfgang Amadeus Mozart was an Austrian composer during the Classical period. He is most famous for his operas."
                        37 -> "Vincent van Gogh was a Dutch painter best known for painting, Starry Night"
                        40 -> "Edgar Allan Poe wan an American writer and poet. Best known for his poems, To Helen, and The Raven"
                        52 -> "William Shakespeare was an English playwright and poet. Best known for his Sonnets and tragedy plays."
                        61 -> "Li Bai was a Chinese poet during the Tang dynasty. He is known for writing romantic poems."
                        76 -> "T. S. Eliot was an American-English poet. His most famous poems include, Ash Wednesday, The waste land, and Burnt Norton"
                        82 -> "Shen Zhou was a Ming dynasty scholar and painter. He painted mostly landscapes and portraits."
                        88 -> "Hokusai was an artist during the Edo period in Japan. He is best known for the painting, The Great Wave Off Kanagawa"
                        90 -> "Winston Churchill was an influential statesman and writer from the 20th century. He is famous for being a good political leader and his inspiring speeches."
                        else -> "Nobody known to me died at this age."
                    }
                    loadImage(imageView2, user_Age)
                    tv_name.text = result
                }
            }
        }
        btn_clear.setOnClickListener {
            ev_Age.text.clear()
            tv_name.text = ""

        }
    }
    private fun loadImage(imageView2: ImageView, user_Age: Int) {


        val drawable: Drawable? = when (user_Age) {
            31 -> resources.getDrawable(R.drawable.franz, null)
            35 -> resources.getDrawable(R.drawable.wg, null)
            37 -> resources.getDrawable(R.drawable.gogh, null)
            40 -> resources.getDrawable(R.drawable.allan, null)
            52 -> resources.getDrawable(R.drawable.sp, null)
            61 -> resources.getDrawable(R.drawable.libai, null)
            76 -> resources.getDrawable(R.drawable.tseliot, null)
            82 -> resources.getDrawable(R.drawable.shen, null)
            88 -> resources.getDrawable(R.drawable.wave, null)
            90 -> resources.getDrawable(R.drawable.churchhill, null)
            else -> resources.getDrawable(R.drawable.pipa, null)
        }
        imageView2.setImageDrawable(drawable)

    }

}
