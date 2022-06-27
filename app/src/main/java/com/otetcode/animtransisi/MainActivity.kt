package com.otetcode.animtransisi

import android.app.ActivityOptions
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import android.util.Pair as UtilPair

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        card_select.setOnClickListener {
            animationTransition()
        }


    }

    fun animationTransition(){
        val intent =  Intent(this, DetailActivity::class.java)
//        val pairs: Array<Pair?> = arrayOfNulls<Pair>(3)
//        pairs[0] = Pair <View, String>(foto_profil, "imageTransition")
//        pairs[1] = Pair < View, String>(textView3, "imageTransition")
//        pairs[2] = Pair < View, String>(textView, "imageTransition")

//        val p1 = Pair.create<View, String>(foto_profil, "imageTransition")
//        val p2 = Pair.create<View, String>(textView3, "imageTransition")
//        val p3 = Pair.create<View, String>(textView, "imageTransition")
        //        val options = ActivityOptions.makeSceneTransitionAnimation(this, p1, p2,p3)

        val options = ActivityOptions.makeSceneTransitionAnimation(this,
            UtilPair.create(foto_profil, "imageTransition"),
            UtilPair.create(textView3, "nameTransition"),
            UtilPair.create(textView, "descTransition"))


        startActivity(intent, options.toBundle())

    }
}
