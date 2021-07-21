import org.apache.spark.sql._
import org.apache.spark.sql.types._
import org.apache.spark.sql.functions._
import org.apache.spark.sql.expressions._
import spark.implicits._


val queryWords = scala.io.StdIn.readLine("Query words: ").split(" ")


// Task 3c:
// TODO: *** Put your solution here ***
for(queryWord <- queryWords) {

}


// Required to exit the spark-shell
sys.exit(0)
