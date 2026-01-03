package com.example.yourmemes.meme_editor.data

import com.example.yourmemes.meme_editor.domain.SaveToStorageStrategy
import android.content.Context
import java.io.File

actual class CacheStorageStrategy(
    private val context: Context
) : SaveToStorageStrategy {

    actual override fun getFilePath(fileName: String): String {
        return File(context.cacheDir, fileName).absolutePath
    }
}