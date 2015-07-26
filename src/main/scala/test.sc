val array = Array(1,2,3)

//val x = array(0)
//val y = array(1)
//val z = array(2)

// val x = array.head
// val y = array.slice(1,2).head
// val y1 = array.tail.head
// val z = array.last

//val x = array.take(1).head
//val y = array.take(2).last
//val z = array.take(3).last


array.toList match {
  case List(x,y,z) => println("x,y,z = " + x,y,z)
  case _ => println("can not match ")
}

val size = array.size
for(i <- 0 to size-1){
  if(1==array(i)) {
    val x = array(i)
    println("x = " + x)
  } else if (2 == array(i)){
    val y = array(i)
    println("y = " + y)
  } else if (3 == array(i)){
    val z = array(i)
    println("z = " + z)
  }

}

for(i <- 0 to array.size -1 if 1==array(i)){
  val x =array(i)
}
for(i <- 0 to array.size -1 if 2==array(i)){
  val y =array(i)
}
for(i <- 0 to array.size -1 if 3==array(i)){
  val z =array(i)
}


import java.util.{HashMap => JHashMap}

val javaMap = new JHashMap[String,String]()
javaMap.put("1","a")
javaMap.put("2","b")
for(key <- javaMap.keySet().toArray){
  println(key+":"+javaMap.get(key))
}


import scala.collection.mutable.HashMap
implicit def forToForeach(javaMap:JHashMap[String,String]) = new HashMap[String,String]()
javaMap.foreach(e => {
  val (k,v) = e
  println(k+":"+v)
})

val myTuple = Tuple1(1)

//type  newRDD = RDD[(String,String,String,String)]
type  newMap = HashMap[String,String]
val myNewMap:newMap = new newMap
































