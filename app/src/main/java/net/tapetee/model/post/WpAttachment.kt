package net.tapetee.model.post

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class WpAttachment {

    @SerializedName("href")
    @Expose
    var href: String? = null

}
