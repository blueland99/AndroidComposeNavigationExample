# AndroidComposeNavigation

## 개요
이 프로젝트는 Jetpack Compose를 사용하여 화면 간의 네비게이션을 처리하고, 화면 사이에 여러 값을 전달하는 방법을 보여주는 간단한 안드로이드 앱 예제입니다. Jetpack Compose의 네비게이션 라이브러리를 사용하여 화면 이동을 처리하고, 각 화면에 필요한 데이터를 주고받는 방법을 설명합니다.

## 기술 스택
- **언어**: Kotlin
- **UI 프레임워크**: Jetpack Compose

## 프로젝트 구조

```
com.example.app
├── navigation              // 네비게이션 로직 및 경로 정의
│   ├── AppNavGraph.kt      // NavHost와 네비게이션 그래프 설정, NavigationArgs 포함
│   └── Route.kt            // 각 화면의 경로(Route)를 정의하는 sealed class
├── ui                      // 애플리케이션의 UI 구성 요소 (화면들)
│   ├── AScreen.kt          // 첫 번째 화면, 파라미터를 설정하고 BScreen으로 전달
│   ├── BScreen.kt          // 두 번째 화면, 전달된 파라미터를 받아 표시하고 CScreen으로 이동
│   └── CScreen.kt          // 세 번째 화면, 모든 백스택을 닫고 AScreen으로 돌아가는 기능
└── MainActivity.kt         // 애플리케이션의 진입점, NavHost 및 네비게이션 그래프 설정
```

## 사용 라이브러리
- Jetpack Compose: UI 구성 및 상태 관리를 위한 최신 안드로이드 라이브러리
- Navigation-Compose: Jetpack Compose에서 네비게이션을 쉽게 처리할 수 있는 라이브러리
