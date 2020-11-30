package com.example.kfeedreader

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.AsyncTask
import android.widget.ImageView
import java.net.URL

class DownloadImageTask(val imageView: ImageView): AsyncTask<String, Void, Bitmap>() {


    override fun doInBackground(vararg p0: String?): Bitmap {
        val url = p0[0]

        val stream = URL(url).openStream()
        val bitmap = BitmapFactory.decodeStream(stream)

        return bitmap
    }

    override fun onPostExecute(result: Bitmap?) {
        imageView.setImageBitmap(result)
    }

}