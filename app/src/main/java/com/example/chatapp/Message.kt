package com.example.chatapp

import androidx.privacysandbox.ads.adservices.appsetid.AppSetId

class Message {
    var message: String? = null
    var senderId: String? = null

    constructor(){}

    constructor(message: String?, senderId: String?){
        this.message = message
        this.senderId = senderId
    }
}