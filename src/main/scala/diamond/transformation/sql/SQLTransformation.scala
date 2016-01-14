package diamond.transformation.sql

import org.apache.spark.sql.{DataFrame, SQLContext}

/**
  * Created by markmo on 16/12/2015.
  */
class SQLTransformation(sql: String, params: Map[String, String]) extends Serializable {

  import diamond.transformation.functions._

  def apply(sqlContext: SQLContext): DataFrame = sqlContext.sql(sql.template(params))

}
