# ComposeNavigation

이 프로젝트는 Jetpack Compose를 사용하여 네비게이션 기능을 구현하는 예제입니다. Jetpack Compose에서 선언형 방식으로 네비게이션을 처리하는 방법을 보여주며, 각 화면 간의 데이터 전달 및 라우팅을 간단하고 효율적으로 처리할 수 있습니다.

## 기술 스택

- **언어**: Kotlin
- **UI 프레임워크**: Jetpack Compose

## 주요 기능

- **Composable 간 네비게이션**: Composable 함수 간에 네비게이션을 설정하고 화면을 이동하는 방법을 보여줍니다.
- **Argument 전달**: 네비게이션 시 화면 간에 데이터를 주고받는 방법을 예제로 설명합니다.
- **Sealed Class를 사용한 라우팅**: 네비게이션 경로 및 인수를 타입 안전하게 정의하고 관리하는 방식을 제시합니다.

## 프로젝트 구조

- **NavigationHost**: 네비게이션 그래프를 정의하고, 각 화면을 라우팅하는 역할을 합니다.
- **Route**: 각 화면의 경로를 sealed class로 정의하여 안전하게 네비게이션을 처리합니다.
- **Arguments**: 화면 간에 전달되는 인수를 관리하는 로직을 포함합니다.
- **UI Screens**: 네비게이션을 통해 이동되는 각 UI 화면을 Composable 함수로 정의합니다.

## 사용 라이브러리

- Jetpack Compose: UI 구성 및 상태 관리를 위한 최신 안드로이드 라이브러리
- Navigation-Compose: Jetpack Compose에서 네비게이션을 쉽게 처리할 수 있는 라이브러리
