package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class Replica(regionName: Option[String] = None) {
  def withRegionName(value: Option[String]): Replica = copy(regionName = value)
}