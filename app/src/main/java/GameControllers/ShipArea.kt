package GameControllers

class Cord(
    var x: Int,
    var y: Int
)
class  Dir(
    var x: Int,
    var y: Int
)

class ShipArea {
    var area: MutableList<MutableList<Int>> = mutableListOf()

    var s4List: MutableList<List<Int>> = mutableListOf()
    var s3List: MutableList<List<Int>> = mutableListOf()
    var s2List: MutableList<List<Int>> = mutableListOf()
    var s1List: MutableList<List<Int>> = mutableListOf()

    class Ship(
        var pos: Cord,
        var dir: Dir,
        var size: Int
    ){
        fun getCells(): List<Cord>{
            var res = mutableListOf(pos)
            for (i in 1..<size){
                res.add(Cord(pos.x + i*dir.x, pos.y + i*dir.y))
            }
            return res
        }
    }

    fun addS1(x: Int, y: Int): Boolean{
        if(area[y][x]!=0) {return false}
        else{

        }
        return true
    }

    fun addS2(x: Int, y: Int, dir: Int): Boolean{
        return true
    }

    fun addS3(x: Int, y: Int, dir: Int): Boolean{
        return true
    }

    fun addS4(x: Int, y: Int, dir: Int): Boolean{
        return true
    }

    fun reset()
    {
        area = mutableListOf()
        for (i in 1..10){
            area.add(mutableListOf())
            for (j in 1..10){
                area[i].add(0)
            }
        }
    }


}