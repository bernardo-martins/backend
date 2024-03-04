package com.sivalabs.myapp.exceptions

import org.springframework.http.HttpStatus

class SurferNotFoundException: Exception {

    constructor() : super()
    constructor(status: HttpStatus, message: String) : super(message)
    constructor(message: String, cause: Throwable) : super(message, cause)
    constructor(cause: Throwable) : super(cause)

}