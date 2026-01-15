package br.com.rocketseat.nextlevelweek.plantmanager.datasource.localdb.plantdb.dbtypesconverters

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.lang.reflect.Type

class EnvironmentDbConverter {

    @TypeConverter
    fun fromString(value: String?): List<String> {
        val listType: Type = object: TypeToken<List<String>>(){}.type
        return Gson().fromJson(value, listType)
    }

    @TypeConverter
    fun toListString(list: List<String?>): String {
        return Gson().toJson(list)
    }
}