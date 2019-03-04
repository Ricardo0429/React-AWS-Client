package com.github.j5ik2o.reactive.dynamodb.model

final case class DescribeTimeToLiveRequest(tableName: Option[String] = None) {
  def withTableName(value: Option[String]): DescribeTimeToLiveRequest = copy(tableName = value)
}
