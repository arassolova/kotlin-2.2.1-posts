package ru.netology

class Comments {
    val count: Int = 0 //(integer) — количество комментариев;
    val canPost: Boolean = true //* (integer, [0,1]) — информация о том, может ли текущий пользователь комментировать запись (1 — может, 0 — не может);
    val groupsCanPost: Boolean = true //(integer, [0,1]) — информация о том, могут ли сообщества комментировать запись;
    val canClose: Boolean = true //(boolean) — может ли текущий пользователь закрыть комментарии к записи;
    val canOpen: Boolean = true //(boolean) — может ли текущий пользователь открыть комментарии к записи.
}