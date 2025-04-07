package GameControllers

class GameController {
    var playerArea = ShipArea()
    var enemyArea = ShipArea()

    var s1Count = 4
    var s2Count = 3
    var s3Count = 2
    var s4Count = 1

    fun initGame(s1Count:Int, s2Count:Int, s3Count:Int, s4Count: Int){
        this.s1Count = s1Count
        this.s2Count = s2Count
        this.s3Count = s3Count
        this.s4Count = s4Count

        playerArea.reset()

    }
    fun placeEnemyShips(){

    }
    fun recurPlace(currentMap: MutableList<MutableList<Int>>, curS1Count:Int, curS2Count:Int, curS3Count:Int, curS4Count: Int): MutableList<MutableList<Int>>?{
        return null
    }

    fun simplePlace(currentMap: MutableList<MutableList<Int>>): MutableList<MutableList<Int>>{
        var curRow = 0
        var curCol = 0
        fun simplePlaceShip(size: Int){
            var ok = false
            while(!ok) {
                if (curCol + size < 10) {
                    ok = true
                    for (curCell in 0..size-1) {
                        currentMap[curRow][curCol + curCell] = size
                    }
                    curCol += size+1
                }
                else{
                    curCol = 0
                    curRow++
                    if(curRow>=10){
                        return
                    }
                }
            }
        }

        for(i in 1..s4Count){
            simplePlaceShip(4)
        }
        for(i in 1..s3Count){
            simplePlaceShip(3)
        }
        for(i in 1..s2Count){
            simplePlaceShip(2)
        }
        for(i in 1..s1Count){
            simplePlaceShip(1)
        }
        return currentMap
    }



    constructor(){

    }
}