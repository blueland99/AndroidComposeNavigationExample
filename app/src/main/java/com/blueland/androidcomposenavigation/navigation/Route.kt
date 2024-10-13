package com.blueland.androidcomposenavigation.navigation

sealed class Route(val route: String) {
    object AScreen : Route("aScreen")

    object BScreen : Route("bScreen?${NavigationArgs.INT_PARAM}={${NavigationArgs.INT_PARAM}}&${NavigationArgs.STRING_PARAM}={${NavigationArgs.STRING_PARAM}}&${NavigationArgs.BOOL_PARAM}={${NavigationArgs.BOOL_PARAM}}") {
        fun createRoute(intParam: Int, stringParam: String, boolParam: Boolean): String {
            return "bScreen?${NavigationArgs.INT_PARAM}=$intParam&${NavigationArgs.STRING_PARAM}=$stringParam&${NavigationArgs.BOOL_PARAM}=$boolParam"
        }
    }

    object CScreen : Route("cScreen")
}

// 네비게이션에서 사용하는 파라미터를 정의하는 객체
object NavigationArgs {
    const val INT_PARAM = "intParam"
    const val STRING_PARAM = "stringParam"
    const val BOOL_PARAM = "boolParam"
}
