// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ ListTablesRequest => ScalaListTablesRequest, _ }
import software.amazon.awssdk.services.dynamodb.model.{ ListTablesRequest => JavaListTablesRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ListTablesRequestOps {

  implicit class ScalaListTablesRequestOps(val self: ScalaListTablesRequest) extends AnyVal {

    def toJava: JavaListTablesRequest = {
      val result = JavaListTablesRequest.builder()
      self.exclusiveStartTableName.filter(_.nonEmpty).foreach(v => result.exclusiveStartTableName(v)) // String
      self.limit.map(_.intValue).foreach(v => result.limit(v))                                        // Int

      result.build()
    }

  }

}
