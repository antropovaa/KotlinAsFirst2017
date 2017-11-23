@file:Suppress("UNUSED_PARAMETER", "unused")
package lesson7.task1

/**
 * Ячейка матрицы: row = ряд, column = колонка
 */
data class Cell(val row: Int, val column: Int)

/**
 * Интерфейс, описывающий возможности матрицы. E = тип элемента матрицы
 */
interface Matrix<E> {
    /** Высота */
    val height: Int

    /** Ширина */
    val width: Int

    /**
     * Доступ к ячейке.
     * Методы могут бросить исключение, если ячейка не существует или пуста
     */
    operator fun get(row: Int, column: Int): E
    operator fun get(cell: Cell): E

    /**
     * Запись в ячейку.
     * Методы могут бросить исключение, если ячейка не существует
     */
    operator fun set(row: Int, column: Int, value: E)
    operator fun set(cell: Cell, value: E)
}

/**
 * Простая
 *
 * Метод для создания матрицы, должен вернуть РЕАЛИЗАЦИЮ Matrix<E>.
 * height = высота, width = ширина, e = чем заполнить элементы.
 * Бросить исключение IllegalArgumentException, если height или width <= 0.
 */
fun <E> createMatrix(height: Int, width: Int, e: E): Matrix<E> = MatrixImpl(height, width, e)

/**
 * Средняя сложность
 *
 * Реализация интерфейса "матрица"
 */
class MatrixImpl<E>(override val height: Int, override val width: Int, e: E) : Matrix<E> {
    private val matrix = mutableListOf<E>()

    init {
        require(height > 0 && width > 0)
        for (i in 0 until height * width)
            matrix.add(e)
    }

    override fun get(row: Int, column: Int): E  =
            matrix[row * width + column]

    override fun get(cell: Cell): E  =
            matrix[cell.row * width + cell.column]

    override fun set(row: Int, column: Int, value: E) {
        matrix[row * width + column] = value
    }

    override fun set(cell: Cell, value: E) {
        matrix[cell.row * width + cell.column] = value
    }

    override fun equals(other: Any?) =
            other is MatrixImpl<*> && equalsMatrix(other)

    fun equalsMatrix(other: MatrixImpl<*>): Boolean {
        if (height != other.height && width != other.width) return false
        for (i in 0 until height * width)
            if (matrix[i] != other.matrix[i]) return false
        return true
    }

    override fun toString(): String {
        val result = StringBuilder()
        result.append("[")
        for (row in 0 until height) {
            result.append("[")
            for (column in 0 until width) {
                result.append(this[row, column])
                if (column != height - 1) result.append(" ")
            }
            result.append("]")
        }
        result.append("]")
        return result.toString()
    }

    override fun hashCode(): Int {
        var result = height
        result = 31 * result + width
        result = 31 * result + matrix.hashCode()
        return result
    }
}

