import java.util.Arrays
import java.util.LinkedList
import java.util.Queue

var dx = intArrayOf(-1, 0, 1, 0)
var dy = intArrayOf(0, -1, 0, 1)

var n = 0
var m = 0

lateinit var map: Array<Array<Int>>
lateinit var visit: Array<Array<Boolean>>

fun main() = with(System.`in`.bufferedReader()) {

    val tmp = readLine().split(" ").map { it.toInt() }

    n = tmp[0]
    m = tmp[1]

    map = Array(n + 1) { Array(m + 1) { 0 } }
    visit = Array(n + 1) { Array(m + 1) { false } }

    for (i in 1..n) {
        val line = readLine().toString();
        for (j in 0 until m)
            map[i][j + 1] = line[j] - '0'
    }


    bfs()
    println(map[n][m])


}

fun bfs() {
    var queue: Queue<Point> = LinkedList()
    queue.add(Point(1, 1))

    while (!queue.isEmpty()) {
        val p = queue.poll()
        visit[p.y][p.x] = true
        for (i in 0 until 4) {

            var nextX = p.x + dx[i]
            var nextY = p.y + dy[i]

            // 0 보다 크고 해당 하는 범위보다 작게.
            if (0 < nextX && 0 < nextY && nextX <= m && nextY <= n) {
                if (!visit[nextY][nextX] && map[nextY][nextX] == 1) {
                    queue.add(Point(nextX, nextY))
                    map[nextY][nextX] = map[p.y][p.x] + 1
                }
            }
        }
    }

}

data class Point(var x: Int, var y: Int)