package main.scala.org.scala.lession02

/**
  * ━━━━━━神兽出没━━━━━━
  * 　　　┏┓　　　┏┓
  * 　　┏┛┻━━━┛┻┓
  * 　　┃　　　　　　　┃
  * 　　┃　　　━　　　┃
  * 　　┃　┳┛　┗┳　┃
  * 　　┃　　　　　　　┃
  * 　　┃　　　┻　　　┃
  * 　　┃　　　　　　　┃
  * 　　┗━┓　　　┏━┛
  * 　　　　┃　　　┃神兽保佑, 永无BUG!
  * 　　　　 ┃　　　┃Code is far away from bug with the animal protecting
  * 　　　　┃　　　┗━━━┓
  * 　　　　┃　　　　　　　┣┓
  * 　　　　┃　　　　　　　┏┛
  * 　　　　┗┓┓┏━┳┓┏┛
  * 　　　　　┃┫┫　┃┫┫
  * 　　　　　┗┻┛　┗┻┛
  * ━━━━━━感觉萌萌哒━━━━━━
  * Module Desc:在scala中，使用java的collection，比如hashmap，并在这个collection对象上调用foreach方法
  * User: wangyue
  * DateTime: 15-7-22下午8:42
  */

object Answer2_1 {
   def main(args: Array[String]): Unit = {

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

   }

 }
