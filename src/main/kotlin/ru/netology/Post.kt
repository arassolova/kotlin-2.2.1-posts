package ru.netology

data class Post (
    val id: Int = 0,
    val ownerId: Int = 0,
    val fromId: Int = 0,
    val createdBy: Int	= 0,
    val date: Int = 0,
    val text: String = "text",
    val replyOwnerId: Int = 0,
    val replyPostId: Int = 0,
    val friendsOnly: Boolean = false,
    val comments: Comments = Comments(),
    val copyright: String = "Copyright",
    val likes: Int = 0,
    val reposts: Reposts = Reposts() ,
    val views: Views = Views(),
    val postType: String = "post",
    val signerId: Int = 0,
    val canPin: Boolean = true,
    val canDelete: Boolean = true,
    val canEdit: Boolean = true,
    val isPinned: Boolean = true,
    val markedAsAds: Boolean = true,
    val isFavorite: Boolean = true,
    val postponedId: Int = 0
) {

}
