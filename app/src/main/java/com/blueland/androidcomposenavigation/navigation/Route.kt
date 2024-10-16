package com.blueland.androidcomposenavigation.navigation

import com.blueland.androidcomposenavigation.model.UserModel
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

sealed class Route(val route: String) {
    object AScreen : Route("aScreen")

    object BScreen : Route("bScreen?${NavigationArgs.INT_PARAM}={${NavigationArgs.INT_PARAM}}&${NavigationArgs.STRING_PARAM}={${NavigationArgs.STRING_PARAM}}&${NavigationArgs.BOOL_PARAM}={${NavigationArgs.BOOL_PARAM}}") {
        fun createRoute(intParam: Int, stringParam: String, boolParam: Boolean): String {
            return "bScreen?${NavigationArgs.INT_PARAM}=$intParam&${NavigationArgs.STRING_PARAM}=$stringParam&${NavigationArgs.BOOL_PARAM}=$boolParam"
        }
    }

    object CScreen : Route("cScreen?${NavigationArgs.USER_MODEL_PARAM}={${NavigationArgs.USER_MODEL_PARAM}}") {
        fun createRoute(userModel: UserModel): String {
            val userModelJson = Json.encodeToString(userModel) // UserModel을 JSON 문자열로 변환
            return "cScreen?${NavigationArgs.USER_MODEL_PARAM}=$userModelJson"
        }
    }
}

// 네비게이션에서 사용하는 파라미터를 정의하는 객체
object NavigationArgs {
    const val INT_PARAM = "intParam"
    const val STRING_PARAM = "stringParam"
    const val BOOL_PARAM = "boolParam"
    const val USER_MODEL_PARAM = "userModelParam"
}
