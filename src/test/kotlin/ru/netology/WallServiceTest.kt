package ru.netology

import org.junit.Test

import org.junit.Assert.*


class WallServiceTest {

    @Test
    fun add() {
    }

    @Test
    fun updateExisting() {
        val service = ru.netology.WallService()
        // заполняем несколькими постами
        service.add(Post(/* заполняете поля */))
        service.add(Post(/* заполняете поля */))
        service.add(Post(/* заполняете поля */))
        // создаём информацию об обновлении
        val update = Post(/* заполняете поля */)

        // выполняем целевое действие
        val result = service.update(update)

        // проверяем результат (используйте assertTrue или assertFalse)
        assertTrue(result)
    }
}

