package com.tolichan.room

class MemberAlreadyExistsException: Exception(
    "В базе данных уже есть участник с таким именем пользователя."
)