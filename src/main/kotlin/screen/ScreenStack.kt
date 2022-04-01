package screen
/*
Step 13. 화면 이동을 관리하는 Stack
Step 14. 장바구니 이전화면 이동 구현
 */
object ScreenStack {
    private val screenStack = mutableListOf<Screen>()

    fun push(screen: Screen) {
        screenStack.add(screen)
    }

    fun pop() {
        screenStack.removeLastOrNull()
    }

    fun peek(): Screen? {
        return screenStack.lastOrNull()
    }
}

sealed class Screen