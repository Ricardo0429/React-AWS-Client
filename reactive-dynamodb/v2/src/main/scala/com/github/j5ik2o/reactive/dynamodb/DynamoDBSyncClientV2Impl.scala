package com.github.j5ik2o.reactive.dynamodb

import com.github.j5ik2o.reactive.dynamodb.model._
import software.amazon.awssdk.services.dynamodb.DynamoDbClient

class DynamoDBSyncClientV2Impl(override val underlying: DynamoDbClient) extends DynamoDBSyncClientV2 {
  import com.github.j5ik2o.reactive.dynamodb.model.v2.BatchGetItemRequestOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.BatchGetItemResponseOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.BatchWriteItemRequestOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.BatchWriteItemResponseOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.CreateBackupRequestOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.CreateBackupResponseOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.CreateGlobalTableRequestOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.CreateGlobalTableResponseOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.CreateTableRequestOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.CreateTableResponseOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.DeleteBackupRequestOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.DeleteBackupResponseOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.DeleteItemRequestOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.DeleteItemResponseOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.DeleteTableRequestOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.DeleteTableResponseOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.DescribeBackupRequestOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.DescribeBackupResponseOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.DescribeContinuousBackupsRequestOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.DescribeContinuousBackupsResponseOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.DescribeEndpointsRequestOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.DescribeEndpointsResponseOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.DescribeGlobalTableRequestOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.DescribeGlobalTableResponseOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.DescribeGlobalTableSettingsRequestOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.DescribeGlobalTableSettingsResponseOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.DescribeLimitsRequestOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.DescribeLimitsResponseOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.DescribeTableRequestOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.DescribeTableResponseOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.DescribeTimeToLiveRequestOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.DescribeTimeToLiveResponseOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.GetItemRequestOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.GetItemResponseOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.ListBackupsRequestOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.ListBackupsResponseOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.ListGlobalTablesRequestOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.ListGlobalTablesResponseOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.ListTablesRequestOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.ListTablesResponseOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.ListTagsOfResourceRequestOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.ListTagsOfResourceResponseOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.PutItemRequestOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.PutItemResponseOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.QueryRequestOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.QueryResponseOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.RestoreTableFromBackupRequestOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.RestoreTableFromBackupResponseOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.RestoreTableToPointInTimeRequestOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.RestoreTableToPointInTimeResponseOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.ScanRequestOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.ScanResponseOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.TagResourceRequestOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.TagResourceResponseOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.TransactGetItemsRequestOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.TransactGetItemsResponseOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.TransactWriteItemsRequestOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.TransactWriteItemsResponseOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.UntagResourceRequestOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.UntagResourceResponseOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.UpdateContinuousBackupsRequestOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.UpdateContinuousBackupsResponseOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.UpdateGlobalTableRequestOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.UpdateGlobalTableResponseOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.UpdateGlobalTableSettingsRequestOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.UpdateGlobalTableSettingsResponseOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.UpdateItemRequestOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.UpdateItemResponseOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.UpdateTableRequestOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.UpdateTableResponseOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.UpdateTimeToLiveRequestOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.UpdateTimeToLiveResponseOps._

  private def toEither[A](f: => A): Either[Throwable, A] = {
    try {
      Right(f)
    } catch {
      case t: Throwable =>
        Left(t)
    }
  }

  override def batchGetItem(
      request: BatchGetItemRequest
  ): Either[Throwable, BatchGetItemResponse] = {
    toEither(underlying.batchGetItem(request.toJava)).right.map(_.toScala)
  }

  override def batchWriteItem(request: BatchWriteItemRequest): Either[Throwable, BatchWriteItemResponse] = {
    toEither(underlying.batchWriteItem(request.toJava)).right.map(_.toScala)
  }

  override def createBackup(request: CreateBackupRequest): Either[Throwable, CreateBackupResponse] = {
    toEither(underlying.createBackup(request.toJava)).right.map(_.toScala)
  }

  override def createGlobalTable(request: CreateGlobalTableRequest): Either[Throwable, CreateGlobalTableResponse] = {
    toEither(underlying.createGlobalTable(request.toJava)).right.map(_.toScala)
  }

  override def createTable(request: CreateTableRequest): Either[Throwable, CreateTableResponse] = {
    toEither(underlying.createTable(request.toJava)).right.map(_.toScala)
  }

  override def describeContinuousBackups(
      request: DescribeContinuousBackupsRequest
  ): Either[Throwable, DescribeContinuousBackupsResponse] = {
    toEither(underlying.describeContinuousBackups(request.toJava)).right.map(_.toScala)
  }

  override def describeEndpoints(request: DescribeEndpointsRequest): Either[Throwable, DescribeEndpointsResponse] = {
    toEither(underlying.describeEndpoints(request.toJava)).right.map(_.toScala)
  }

  override def describeBackup(request: DescribeBackupRequest): Either[Throwable, DescribeBackupResponse] = {
    toEither(underlying.describeBackup(request.toJava)).right.map(_.toScala)
  }

  override def describeGlobalTable(
      request: DescribeGlobalTableRequest
  ): Either[Throwable, DescribeGlobalTableResponse] = {
    toEither(underlying.describeGlobalTable(request.toJava)).right.map(_.toScala)
  }

  override def describeGlobalTableSettings(
      request: DescribeGlobalTableSettingsRequest
  ): Either[Throwable, DescribeGlobalTableSettingsResponse] = {
    toEither(underlying.describeGlobalTableSettings(request.toJava)).right.map(_.toScala)
  }

  override def describeLimits(request: DescribeLimitsRequest): Either[Throwable, DescribeLimitsResponse] = {
    toEither(underlying.describeLimits(request.toJava)).right.map(_.toScala)
  }

  override def describeTimeToLive(request: DescribeTimeToLiveRequest): Either[Throwable, DescribeTimeToLiveResponse] = {
    toEither(underlying.describeTimeToLive(request.toJava)).right.map(_.toScala)
  }

  override def listGlobalTables(request: ListGlobalTablesRequest): Either[Throwable, ListGlobalTablesResponse] = {
    toEither(underlying.listGlobalTables(request.toJava)).right.map(_.toScala)
  }

  override def describeTable(request: DescribeTableRequest): Either[Throwable, DescribeTableResponse] = {
    toEither(underlying.describeTable(request.toJava)).right.map(_.toScala)
  }

  override def deleteBackup(request: DeleteBackupRequest): Either[Throwable, DeleteBackupResponse] = {
    toEither(underlying.deleteBackup(request.toJava)).right.map(_.toScala)
  }

  override def deleteItem(request: DeleteItemRequest): Either[Throwable, DeleteItemResponse] = {
    toEither(underlying.deleteItem(request.toJava)).right.map(_.toScala)
  }

  override def deleteTable(request: DeleteTableRequest): Either[Throwable, DeleteTableResponse] = {
    toEither(underlying.deleteTable(request.toJava)).right.map(_.toScala)
  }

  override def listBackups(request: ListBackupsRequest): Either[Throwable, ListBackupsResponse] = {
    toEither(underlying.listBackups(request.toJava)).right.map(_.toScala)
  }

  override def listTables(request: ListTablesRequest): Either[Throwable, ListTablesResponse] = {
    toEither(underlying.listTables(request.toJava)).right.map(_.toScala)
  }

  override def listTagsOfResource(request: ListTagsOfResourceRequest): Either[Throwable, ListTagsOfResourceResponse] = {
    toEither(underlying.listTagsOfResource(request.toJava)).right.map(_.toScala)
  }

  override def putItem(request: PutItemRequest): Either[Throwable, PutItemResponse] = {
    toEither(underlying.putItem(request.toJava)).right.map(_.toScala)
  }

  override def query(request: QueryRequest): Either[Throwable, QueryResponse] = {
    toEither(underlying.query(request.toJava)).right.map(_.toScala)
  }

  override def restoreTableFromBackup(
      request: RestoreTableFromBackupRequest
  ): Either[Throwable, RestoreTableFromBackupResponse] = {
    toEither(underlying.restoreTableFromBackup(request.toJava)).right.map(_.toScala)
  }

  override def restoreTableToPointInTime(
      request: RestoreTableToPointInTimeRequest
  ): Either[Throwable, RestoreTableToPointInTimeResponse] = {
    toEither(underlying.restoreTableToPointInTime(request.toJava)).right.map(_.toScala)
  }

  override def scan(request: ScanRequest): Either[Throwable, ScanResponse] = {
    toEither(underlying.scan(request.toJava)).right.map(_.toScala)
  }

  override def getItem(request: GetItemRequest): Either[Throwable, GetItemResponse] = {
    toEither(underlying.getItem(request.toJava)).right.map(_.toScala)
  }

  override def updateGlobalTableSettings(
      request: UpdateGlobalTableSettingsRequest
  ): Either[Throwable, UpdateGlobalTableSettingsResponse] = {
    toEither(underlying.updateGlobalTableSettings(request.toJava)).right.map(_.toScala)
  }

  override def updateItem(request: UpdateItemRequest): Either[Throwable, UpdateItemResponse] = {
    toEither(underlying.updateItem(request.toJava)).right.map(_.toScala)
  }

  override def updateTable(request: UpdateTableRequest): Either[Throwable, UpdateTableResponse] = {
    toEither(underlying.updateTable(request.toJava)).right.map(_.toScala)
  }

  override def updateTimeToLive(request: UpdateTimeToLiveRequest): Either[Throwable, UpdateTimeToLiveResponse] = {
    toEither(underlying.updateTimeToLive(request.toJava)).right.map(_.toScala)
  }

  override def tagResource(request: TagResourceRequest): Either[Throwable, TagResourceResponse] = {
    toEither(underlying.tagResource(request.toJava)).right.map(_.toScala)
  }

  override def transactGetItems(request: TransactGetItemsRequest): Either[Throwable, TransactGetItemsResponse] = {
    toEither(underlying.transactGetItems(request.toJava)).right.map(_.toScala)
  }

  override def transactWriteItems(request: TransactWriteItemsRequest): Either[Throwable, TransactWriteItemsResponse] = {
    toEither(underlying.transactWriteItems(request.toJava)).right.map(_.toScala)
  }

  override def untagResource(request: UntagResourceRequest): Either[Throwable, UntagResourceResponse] = {
    toEither(underlying.untagResource(request.toJava)).right.map(_.toScala)
  }

  override def updateContinuousBackups(
      request: UpdateContinuousBackupsRequest
  ): Either[Throwable, UpdateContinuousBackupsResponse] = {
    toEither(underlying.updateContinuousBackups(request.toJava)).right.map(_.toScala)
  }

  override def updateGlobalTable(request: UpdateGlobalTableRequest): Either[Throwable, UpdateGlobalTableResponse] = {
    toEither(underlying.updateGlobalTable(request.toJava)).right.map(_.toScala)
  }

}
