package ru.netology

fun main() {
    val post = Post()
    val post1 = post.copy(id = 1, date = 1)
    val post2 = post.copy(id = 2, date = 2)
    WallService.add(post)
    WallService.add(post1)
    WallService.add(post2)
    println(WallService.update(post2))
    println(post2)
}

