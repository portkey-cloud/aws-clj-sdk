(ns portkey.aws.rds-data.-2018-08-01 (:require [portkey.aws]))

(def endpoints 'nil)

(clojure.core/declare ser-db-name)

(clojure.core/declare ser-sql-statement)

(clojure.core/declare ser-arn)

(clojure.core/defn- ser-db-name [input] #:http.request.field{:value input, :shape "DbName"})

(clojure.core/defn- ser-sql-statement [input] #:http.request.field{:value input, :shape "SqlStatement"})

(clojure.core/defn- ser-arn [input] #:http.request.field{:value input, :shape "Arn"})

(clojure.core/defn- req-execute-sql-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :aws-secret-store-arn)) #:http.request.field{:name "awsSecretStoreArn", :shape "Arn"}) (clojure.core/into (ser-arn (input :db-cluster-or-instance-arn)) #:http.request.field{:name "dbClusterOrInstanceArn", :shape "Arn"}) (clojure.core/into (ser-sql-statement (input :sql-statements)) #:http.request.field{:name "sqlStatements", :shape "SqlStatement"})]} (clojure.core/contains? input :database) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-db-name (input :database)) #:http.request.field{:name "database", :shape "DbName"})) (clojure.core/contains? input :schema) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-db-name (input :schema)) #:http.request.field{:name "schema", :shape "DbName"}))))

(clojure.core/declare deser-double)

(clojure.core/declare deser-row)

(clojure.core/declare deser-column-metadata-list)

(clojure.core/declare deser-value)

(clojure.core/declare deser-result-set-metadata)

(clojure.core/declare deser-integer)

(clojure.core/declare deser-string)

(clojure.core/declare deser-record)

(clojure.core/declare deser-struct-value)

(clojure.core/declare deser-sql-statement-results)

(clojure.core/declare deser-long)

(clojure.core/declare deser-records)

(clojure.core/declare deser-array-values)

(clojure.core/declare deser-blob)

(clojure.core/declare deser-column-metadata)

(clojure.core/declare deser-float)

(clojure.core/declare deser-sql-statement-result)

(clojure.core/declare deser-result-frame)

(clojure.core/declare deser-boolean)

(clojure.core/defn- deser-double [input] input)

(clojure.core/defn- deser-row [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-value coll))) input))

(clojure.core/defn- deser-column-metadata-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-column-metadata coll))) input))

(clojure.core/defn- deser-value [input] (clojure.core/cond-> {} (clojure.core/contains? input "structValue") (clojure.core/assoc :struct-value (deser-struct-value (input "structValue"))) (clojure.core/contains? input "doubleValue") (clojure.core/assoc :double-value (deser-double (input "doubleValue"))) (clojure.core/contains? input "isNull") (clojure.core/assoc :is-null (deser-boolean (input "isNull"))) (clojure.core/contains? input "bigIntValue") (clojure.core/assoc :big-int-value (deser-long (input "bigIntValue"))) (clojure.core/contains? input "realValue") (clojure.core/assoc :real-value (deser-float (input "realValue"))) (clojure.core/contains? input "bitValue") (clojure.core/assoc :bit-value (deser-boolean (input "bitValue"))) (clojure.core/contains? input "arrayValues") (clojure.core/assoc :array-values (deser-array-values (input "arrayValues"))) (clojure.core/contains? input "intValue") (clojure.core/assoc :int-value (deser-integer (input "intValue"))) (clojure.core/contains? input "blobValue") (clojure.core/assoc :blob-value (deser-blob (input "blobValue"))) (clojure.core/contains? input "stringValue") (clojure.core/assoc :string-value (deser-string (input "stringValue")))))

(clojure.core/defn- deser-result-set-metadata [input] (clojure.core/cond-> {} (clojure.core/contains? input "columnCount") (clojure.core/assoc :column-count (deser-long (input "columnCount"))) (clojure.core/contains? input "columnMetadata") (clojure.core/assoc :column-metadata (deser-column-metadata-list (input "columnMetadata")))))

(clojure.core/defn- deser-integer [input] input)

(clojure.core/defn- deser-string [input] input)

(clojure.core/defn- deser-record [input] (clojure.core/cond-> {} (clojure.core/contains? input "values") (clojure.core/assoc :values (deser-row (input "values")))))

(clojure.core/defn- deser-struct-value [input] (clojure.core/cond-> {} (clojure.core/contains? input "attributes") (clojure.core/assoc :attributes (deser-array-values (input "attributes")))))

(clojure.core/defn- deser-sql-statement-results [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-sql-statement-result coll))) input))

(clojure.core/defn- deser-long [input] input)

(clojure.core/defn- deser-records [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-record coll))) input))

(clojure.core/defn- deser-array-values [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-value coll))) input))

(clojure.core/defn- deser-blob [input] (portkey.aws/base64-decode input))

(clojure.core/defn- deser-column-metadata [input] (clojure.core/cond-> {} (clojure.core/contains? input "schemaName") (clojure.core/assoc :schema-name (deser-string (input "schemaName"))) (clojure.core/contains? input "precision") (clojure.core/assoc :precision (deser-integer (input "precision"))) (clojure.core/contains? input "tableName") (clojure.core/assoc :table-name (deser-string (input "tableName"))) (clojure.core/contains? input "scale") (clojure.core/assoc :scale (deser-integer (input "scale"))) (clojure.core/contains? input "typeName") (clojure.core/assoc :type-name (deser-string (input "typeName"))) (clojure.core/contains? input "label") (clojure.core/assoc :label (deser-string (input "label"))) (clojure.core/contains? input "isAutoIncrement") (clojure.core/assoc :is-auto-increment (deser-boolean (input "isAutoIncrement"))) (clojure.core/contains? input "arrayBaseColumnType") (clojure.core/assoc :array-base-column-type (deser-integer (input "arrayBaseColumnType"))) (clojure.core/contains? input "name") (clojure.core/assoc :name (deser-string (input "name"))) (clojure.core/contains? input "isCurrency") (clojure.core/assoc :is-currency (deser-boolean (input "isCurrency"))) (clojure.core/contains? input "nullable") (clojure.core/assoc :nullable (deser-integer (input "nullable"))) (clojure.core/contains? input "type") (clojure.core/assoc :type (deser-integer (input "type"))) (clojure.core/contains? input "isSigned") (clojure.core/assoc :is-signed (deser-boolean (input "isSigned"))) (clojure.core/contains? input "isCaseSensitive") (clojure.core/assoc :is-case-sensitive (deser-boolean (input "isCaseSensitive")))))

(clojure.core/defn- deser-float [input] input)

(clojure.core/defn- deser-sql-statement-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "numberOfRecordsUpdated") (clojure.core/assoc :number-of-records-updated (deser-long (input "numberOfRecordsUpdated"))) (clojure.core/contains? input "resultFrame") (clojure.core/assoc :result-frame (deser-result-frame (input "resultFrame")))))

(clojure.core/defn- deser-result-frame [input] (clojure.core/cond-> {} (clojure.core/contains? input "records") (clojure.core/assoc :records (deser-records (input "records"))) (clojure.core/contains? input "resultSetMetadata") (clojure.core/assoc :result-set-metadata (deser-result-set-metadata (input "resultSetMetadata")))))

(clojure.core/defn- deser-boolean [input] input)

(clojure.core/defn- response-internal-server-error-exception ([input] (response-internal-server-error-exception nil input)) ([resultWrapper1527321 input] (clojure.core/let [rawinput1527320 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1527322 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-bad-request-exception ([input] (response-bad-request-exception nil input)) ([resultWrapper1527324 input] (clojure.core/let [rawinput1527323 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1527325 {"message" (rawinput1527323 "message")}] (clojure.core/cond-> {} (letvar1527325 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1527325 ["message"])))))))

(clojure.core/defn- response-forbidden-exception ([input] (response-forbidden-exception nil input)) ([resultWrapper1527327 input] (clojure.core/let [rawinput1527326 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1527328 {"message" (rawinput1527326 "message")}] (clojure.core/cond-> {} (letvar1527328 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1527328 ["message"])))))))

(clojure.core/defn- response-service-unavailable-error ([input] (response-service-unavailable-error nil input)) ([resultWrapper1527330 input] (clojure.core/let [rawinput1527329 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1527331 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-execute-sql-response ([input] (response-execute-sql-response nil input)) ([resultWrapper1527333 input] (clojure.core/let [rawinput1527332 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1527334 {"sqlStatementResults" (rawinput1527332 "sqlStatementResults")}] (clojure.core/cond-> {:sql-statement-results (deser-sql-statement-results (clojure.core/get-in letvar1527334 ["sqlStatementResults"]))}))))

(clojure.spec.alpha/def :portkey.aws.rds-data.-2018-08-01/internal-server-error-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.rds-data.-2018-08-01/double clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.rds-data.-2018-08-01.bad-request-exception/message (clojure.spec.alpha/and :portkey.aws.rds-data.-2018-08-01/string))
(clojure.spec.alpha/def :portkey.aws.rds-data.-2018-08-01/bad-request-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rds-data.-2018-08-01.bad-request-exception/message]))

(clojure.spec.alpha/def :portkey.aws.rds-data.-2018-08-01.forbidden-exception/message (clojure.spec.alpha/and :portkey.aws.rds-data.-2018-08-01/string))
(clojure.spec.alpha/def :portkey.aws.rds-data.-2018-08-01/forbidden-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rds-data.-2018-08-01.forbidden-exception/message]))

(clojure.spec.alpha/def :portkey.aws.rds-data.-2018-08-01/db-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 64))))

(clojure.spec.alpha/def :portkey.aws.rds-data.-2018-08-01.execute-sql-request/aws-secret-store-arn (clojure.spec.alpha/and :portkey.aws.rds-data.-2018-08-01/arn))
(clojure.spec.alpha/def :portkey.aws.rds-data.-2018-08-01.execute-sql-request/database (clojure.spec.alpha/and :portkey.aws.rds-data.-2018-08-01/db-name))
(clojure.spec.alpha/def :portkey.aws.rds-data.-2018-08-01.execute-sql-request/db-cluster-or-instance-arn (clojure.spec.alpha/and :portkey.aws.rds-data.-2018-08-01/arn))
(clojure.spec.alpha/def :portkey.aws.rds-data.-2018-08-01.execute-sql-request/schema (clojure.spec.alpha/and :portkey.aws.rds-data.-2018-08-01/db-name))
(clojure.spec.alpha/def :portkey.aws.rds-data.-2018-08-01.execute-sql-request/sql-statements (clojure.spec.alpha/and :portkey.aws.rds-data.-2018-08-01/sql-statement))
(clojure.spec.alpha/def :portkey.aws.rds-data.-2018-08-01/execute-sql-request (clojure.spec.alpha/keys :req-un [:portkey.aws.rds-data.-2018-08-01.execute-sql-request/aws-secret-store-arn :portkey.aws.rds-data.-2018-08-01.execute-sql-request/db-cluster-or-instance-arn :portkey.aws.rds-data.-2018-08-01.execute-sql-request/sql-statements] :opt-un [:portkey.aws.rds-data.-2018-08-01.execute-sql-request/database :portkey.aws.rds-data.-2018-08-01.execute-sql-request/schema]))

(clojure.spec.alpha/def :portkey.aws.rds-data.-2018-08-01/row (clojure.spec.alpha/coll-of :portkey.aws.rds-data.-2018-08-01/value))

(clojure.spec.alpha/def :portkey.aws.rds-data.-2018-08-01/column-metadata-list (clojure.spec.alpha/coll-of :portkey.aws.rds-data.-2018-08-01/column-metadata))

(clojure.spec.alpha/def :portkey.aws.rds-data.-2018-08-01.value/struct-value (clojure.spec.alpha/and :portkey.aws.rds-data.-2018-08-01/struct-value))
(clojure.spec.alpha/def :portkey.aws.rds-data.-2018-08-01.value/double-value (clojure.spec.alpha/and :portkey.aws.rds-data.-2018-08-01/double))
(clojure.spec.alpha/def :portkey.aws.rds-data.-2018-08-01.value/is-null (clojure.spec.alpha/and :portkey.aws.rds-data.-2018-08-01/boolean))
(clojure.spec.alpha/def :portkey.aws.rds-data.-2018-08-01.value/big-int-value (clojure.spec.alpha/and :portkey.aws.rds-data.-2018-08-01/long))
(clojure.spec.alpha/def :portkey.aws.rds-data.-2018-08-01.value/real-value (clojure.spec.alpha/and :portkey.aws.rds-data.-2018-08-01/float))
(clojure.spec.alpha/def :portkey.aws.rds-data.-2018-08-01.value/bit-value (clojure.spec.alpha/and :portkey.aws.rds-data.-2018-08-01/boolean))
(clojure.spec.alpha/def :portkey.aws.rds-data.-2018-08-01.value/array-values (clojure.spec.alpha/and :portkey.aws.rds-data.-2018-08-01/array-values))
(clojure.spec.alpha/def :portkey.aws.rds-data.-2018-08-01.value/int-value (clojure.spec.alpha/and :portkey.aws.rds-data.-2018-08-01/integer))
(clojure.spec.alpha/def :portkey.aws.rds-data.-2018-08-01.value/blob-value (clojure.spec.alpha/and :portkey.aws.rds-data.-2018-08-01/blob))
(clojure.spec.alpha/def :portkey.aws.rds-data.-2018-08-01.value/string-value (clojure.spec.alpha/and :portkey.aws.rds-data.-2018-08-01/string))
(clojure.spec.alpha/def :portkey.aws.rds-data.-2018-08-01/value (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rds-data.-2018-08-01.value/struct-value :portkey.aws.rds-data.-2018-08-01.value/double-value :portkey.aws.rds-data.-2018-08-01.value/is-null :portkey.aws.rds-data.-2018-08-01.value/big-int-value :portkey.aws.rds-data.-2018-08-01.value/real-value :portkey.aws.rds-data.-2018-08-01.value/bit-value :portkey.aws.rds-data.-2018-08-01.value/array-values :portkey.aws.rds-data.-2018-08-01.value/int-value :portkey.aws.rds-data.-2018-08-01.value/blob-value :portkey.aws.rds-data.-2018-08-01.value/string-value]))

(clojure.spec.alpha/def :portkey.aws.rds-data.-2018-08-01/sql-statement (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 65536))))

(clojure.spec.alpha/def :portkey.aws.rds-data.-2018-08-01.result-set-metadata/column-count (clojure.spec.alpha/and :portkey.aws.rds-data.-2018-08-01/long))
(clojure.spec.alpha/def :portkey.aws.rds-data.-2018-08-01.result-set-metadata/column-metadata (clojure.spec.alpha/and :portkey.aws.rds-data.-2018-08-01/column-metadata-list))
(clojure.spec.alpha/def :portkey.aws.rds-data.-2018-08-01/result-set-metadata (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rds-data.-2018-08-01.result-set-metadata/column-count :portkey.aws.rds-data.-2018-08-01.result-set-metadata/column-metadata]))

(clojure.spec.alpha/def :portkey.aws.rds-data.-2018-08-01/integer clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.rds-data.-2018-08-01/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.rds-data.-2018-08-01.record/values (clojure.spec.alpha/and :portkey.aws.rds-data.-2018-08-01/row))
(clojure.spec.alpha/def :portkey.aws.rds-data.-2018-08-01/record (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rds-data.-2018-08-01.record/values]))

(clojure.spec.alpha/def :portkey.aws.rds-data.-2018-08-01/service-unavailable-error (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.rds-data.-2018-08-01/arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.rds-data.-2018-08-01.struct-value/attributes (clojure.spec.alpha/and :portkey.aws.rds-data.-2018-08-01/array-values))
(clojure.spec.alpha/def :portkey.aws.rds-data.-2018-08-01/struct-value (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rds-data.-2018-08-01.struct-value/attributes]))

(clojure.spec.alpha/def :portkey.aws.rds-data.-2018-08-01.execute-sql-response/sql-statement-results (clojure.spec.alpha/and :portkey.aws.rds-data.-2018-08-01/sql-statement-results))
(clojure.spec.alpha/def :portkey.aws.rds-data.-2018-08-01/execute-sql-response (clojure.spec.alpha/keys :req-un [:portkey.aws.rds-data.-2018-08-01.execute-sql-response/sql-statement-results] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.rds-data.-2018-08-01/sql-statement-results (clojure.spec.alpha/coll-of :portkey.aws.rds-data.-2018-08-01/sql-statement-result))

(clojure.spec.alpha/def :portkey.aws.rds-data.-2018-08-01/long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.rds-data.-2018-08-01/records (clojure.spec.alpha/coll-of :portkey.aws.rds-data.-2018-08-01/record))

(clojure.spec.alpha/def :portkey.aws.rds-data.-2018-08-01/array-values (clojure.spec.alpha/coll-of :portkey.aws.rds-data.-2018-08-01/value))

(clojure.spec.alpha/def :portkey.aws.rds-data.-2018-08-01/blob clojure.core/bytes?)

(clojure.spec.alpha/def :portkey.aws.rds-data.-2018-08-01.column-metadata/schema-name (clojure.spec.alpha/and :portkey.aws.rds-data.-2018-08-01/string))
(clojure.spec.alpha/def :portkey.aws.rds-data.-2018-08-01.column-metadata/precision (clojure.spec.alpha/and :portkey.aws.rds-data.-2018-08-01/integer))
(clojure.spec.alpha/def :portkey.aws.rds-data.-2018-08-01.column-metadata/table-name (clojure.spec.alpha/and :portkey.aws.rds-data.-2018-08-01/string))
(clojure.spec.alpha/def :portkey.aws.rds-data.-2018-08-01.column-metadata/scale (clojure.spec.alpha/and :portkey.aws.rds-data.-2018-08-01/integer))
(clojure.spec.alpha/def :portkey.aws.rds-data.-2018-08-01.column-metadata/type-name (clojure.spec.alpha/and :portkey.aws.rds-data.-2018-08-01/string))
(clojure.spec.alpha/def :portkey.aws.rds-data.-2018-08-01.column-metadata/label (clojure.spec.alpha/and :portkey.aws.rds-data.-2018-08-01/string))
(clojure.spec.alpha/def :portkey.aws.rds-data.-2018-08-01.column-metadata/is-auto-increment (clojure.spec.alpha/and :portkey.aws.rds-data.-2018-08-01/boolean))
(clojure.spec.alpha/def :portkey.aws.rds-data.-2018-08-01.column-metadata/array-base-column-type (clojure.spec.alpha/and :portkey.aws.rds-data.-2018-08-01/integer))
(clojure.spec.alpha/def :portkey.aws.rds-data.-2018-08-01.column-metadata/name (clojure.spec.alpha/and :portkey.aws.rds-data.-2018-08-01/string))
(clojure.spec.alpha/def :portkey.aws.rds-data.-2018-08-01.column-metadata/is-currency (clojure.spec.alpha/and :portkey.aws.rds-data.-2018-08-01/boolean))
(clojure.spec.alpha/def :portkey.aws.rds-data.-2018-08-01.column-metadata/nullable (clojure.spec.alpha/and :portkey.aws.rds-data.-2018-08-01/integer))
(clojure.spec.alpha/def :portkey.aws.rds-data.-2018-08-01.column-metadata/type (clojure.spec.alpha/and :portkey.aws.rds-data.-2018-08-01/integer))
(clojure.spec.alpha/def :portkey.aws.rds-data.-2018-08-01.column-metadata/is-signed (clojure.spec.alpha/and :portkey.aws.rds-data.-2018-08-01/boolean))
(clojure.spec.alpha/def :portkey.aws.rds-data.-2018-08-01.column-metadata/is-case-sensitive (clojure.spec.alpha/and :portkey.aws.rds-data.-2018-08-01/boolean))
(clojure.spec.alpha/def :portkey.aws.rds-data.-2018-08-01/column-metadata (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rds-data.-2018-08-01.column-metadata/schema-name :portkey.aws.rds-data.-2018-08-01.column-metadata/precision :portkey.aws.rds-data.-2018-08-01.column-metadata/table-name :portkey.aws.rds-data.-2018-08-01.column-metadata/scale :portkey.aws.rds-data.-2018-08-01.column-metadata/type-name :portkey.aws.rds-data.-2018-08-01.column-metadata/label :portkey.aws.rds-data.-2018-08-01.column-metadata/is-auto-increment :portkey.aws.rds-data.-2018-08-01.column-metadata/array-base-column-type :portkey.aws.rds-data.-2018-08-01.column-metadata/name :portkey.aws.rds-data.-2018-08-01.column-metadata/is-currency :portkey.aws.rds-data.-2018-08-01.column-metadata/nullable :portkey.aws.rds-data.-2018-08-01.column-metadata/type :portkey.aws.rds-data.-2018-08-01.column-metadata/is-signed :portkey.aws.rds-data.-2018-08-01.column-metadata/is-case-sensitive]))

(clojure.spec.alpha/def :portkey.aws.rds-data.-2018-08-01/float clojure.core/float?)

(clojure.spec.alpha/def :portkey.aws.rds-data.-2018-08-01.sql-statement-result/number-of-records-updated (clojure.spec.alpha/and :portkey.aws.rds-data.-2018-08-01/long))
(clojure.spec.alpha/def :portkey.aws.rds-data.-2018-08-01.sql-statement-result/result-frame (clojure.spec.alpha/and :portkey.aws.rds-data.-2018-08-01/result-frame))
(clojure.spec.alpha/def :portkey.aws.rds-data.-2018-08-01/sql-statement-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rds-data.-2018-08-01.sql-statement-result/number-of-records-updated :portkey.aws.rds-data.-2018-08-01.sql-statement-result/result-frame]))

(clojure.spec.alpha/def :portkey.aws.rds-data.-2018-08-01.result-frame/records (clojure.spec.alpha/and :portkey.aws.rds-data.-2018-08-01/records))
(clojure.spec.alpha/def :portkey.aws.rds-data.-2018-08-01.result-frame/result-set-metadata (clojure.spec.alpha/and :portkey.aws.rds-data.-2018-08-01/result-set-metadata))
(clojure.spec.alpha/def :portkey.aws.rds-data.-2018-08-01/result-frame (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rds-data.-2018-08-01.result-frame/records :portkey.aws.rds-data.-2018-08-01.result-frame/result-set-metadata]))

(clojure.spec.alpha/def :portkey.aws.rds-data.-2018-08-01/boolean clojure.core/boolean?)

(clojure.core/defn execute-sql "Executes any SQL statement on the target database synchronously" ([execute-sql-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-execute-sql-request execute-sql-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.rds-data.-2018-08-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.rds-data.-2018-08-01/execute-sql-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/ExecuteSql", :http.request.configuration/version "2018-08-01", :http.request.configuration/service-id "RDS Data", :http.request.spec/input-spec :portkey.aws.rds-data.-2018-08-01/execute-sql-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ExecuteSql", :http.request.configuration/output-deser-fn response-execute-sql-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.rds-data.-2018-08-01/bad-request-exception, "ForbiddenException" :portkey.aws.rds-data.-2018-08-01/forbidden-exception, "InternalServerErrorException" :portkey.aws.rds-data.-2018-08-01/internal-server-error-exception, "ServiceUnavailableError" :portkey.aws.rds-data.-2018-08-01/service-unavailable-error}})))))
(clojure.spec.alpha/fdef execute-sql :args (clojure.spec.alpha/tuple :portkey.aws.rds-data.-2018-08-01/execute-sql-request) :ret (clojure.spec.alpha/and :portkey.aws.rds-data.-2018-08-01/execute-sql-response))
