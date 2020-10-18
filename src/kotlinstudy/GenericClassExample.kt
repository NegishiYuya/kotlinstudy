package kotlinstudy

class GenericClassExample<T>(var value: T) {
    fun getPropertyValue(): T {
        return value
    }
}