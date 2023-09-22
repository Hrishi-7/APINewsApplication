package com.hrishikesh.news.ui.db

import androidx.room.TypeConverter
import com.hrishikesh.news.ui.models.Source

class Converters {

    @TypeConverter
    fun fromSource(source: Source) : String{
        return source.name
    }

    @TypeConverter
    fun toSource(name: String) : Source {
        return Source(name, name)
    }
}