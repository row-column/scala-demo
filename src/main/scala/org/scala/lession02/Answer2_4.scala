package main.scala.org.scala.lession02

import scala.collection.mutable.HashMap

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
  * Module Desc:RDD是一个范型类，在一段程序中大量出现RDD[(String, String, String, String, String)]这个类，换一种更简洁的写法替代它
  * User: wangyue
  * DateTime: 15-7-22下午8:42
  */

object Answer2_4 {
   def main(args: Array[String]): Unit = {


     //type  newRDD = RDD[(String,String,String,String)] //因为没有使用spark类库，所以这行 目前是报错的，所以给注释了

     //举例实验
     type  newMap = HashMap[String,String]
     val myNewMap:newMap = new newMap

   }

 }
