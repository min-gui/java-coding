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
    dfs(N, M, 0)


}

fun dfs(N: Int, M: Int, depth: Int) {

    if (M == depth) {
        for (i: Int in array) {
            print("$i ")
        }
        println()
        return
    }

    for (i: Int in 0 until N) {
        if (!visted[i]) {
            visted[i] = true;
            array[depth] = i + 1;
            dfs(N, M, depth + 1)
            visted[i] = false
        }
    }

}

