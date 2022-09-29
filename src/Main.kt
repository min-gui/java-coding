var N = 0
var M = 0

lateinit var array: Array<Int>
lateinit var visted: Array<Boolean>

fun main() = with(System.`in`.bufferedReader()) {

    val tmp = readLine().split(" ").map { it.toInt() }

    N = tmp[0]
    M = tmp[1]

    array = Array(M) { 0 }
    visted = Array(N) { false }
    dfs(0, N, M, 0)

}

fun dfs(start: Int, N: Int, M: Int, depth: Int) {

    if (M == depth) {
        for (i: Int in array) {
            print("$i ")
        }
        println()
        return
    }

    for (i: Int in start until N) {
        if (!visted[i]) {
            visted[i] = true;
            array[depth] = i + 1;
            dfs(i + 1, N, M, depth + 1)
            visted[i] = false
        }
    }
}

