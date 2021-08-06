package uz.mobiller.recyclerviewkotlindemo.models

import java.util.*

class Cinema {

    var picture: Int? = null
    var name: String? = null
    var views: Int? = null
    var data: String? = null

    constructor(picture: Int?, name: String?, views: Int?, data: String?) {
        this.picture = picture
        this.name = name
        this.views = views
        this.data = data
    }
}