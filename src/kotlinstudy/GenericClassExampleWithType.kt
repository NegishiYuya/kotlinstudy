package kotlinstudy

/**
 * Userクラスもしくはその派生クラスのみ受け付けるジェネリック型
 */
class GenericClassExampleWithType<T : User>(var value: T) {
    fun getPropertyValue(): T {
        return value
    }
}