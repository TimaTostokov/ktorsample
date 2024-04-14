package com.tolichan.data.model

import kotlinx.serialization.Serializable
import org.bson.codecs.pojo.annotations.BsonId
import org.bson.types.ObjectId
import java.util.Objects

@Serializable
data class Message(
    val text: String,
    val username: String,
    val timestamp: Long,
    @BsonId
    val id: String = ObjectId().toString()
)