package com.example.yourmemes.meme_editor.data

import com.example.yourmemes.meme_editor.domain.SaveToStorageStrategy

expect class CacheStorageStrategy: SaveToStorageStrategy {
    override fun getFilePath(fileName: String): String
}