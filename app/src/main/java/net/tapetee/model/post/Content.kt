package net.tapetee.model.post

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Content {

    @SerializedName("rendered")
    @Expose
    var rendered: String? = null
    @SerializedName("protected")
    @Expose
    var protected: Boolean? = null

}
