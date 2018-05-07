(ns portkey.aws.mobile.-2017-07-01 (:require [portkey.aws]))

(def endpoints 'nil)

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.describe-project-result/details (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/project-details))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/describe-project-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.mobile.-2017-07-01.describe-project-result/details] :locations {}))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.list-projects-request/max-results (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/max-results))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.list-projects-request/next-token (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/next-token))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/list-projects-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.mobile.-2017-07-01.list-projects-request/maxResults :portkey.aws.mobile.-2017-07-01.list-projects-request/nextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.list-projects-result/projects (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/project-summaries))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.list-projects-result/next-token (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/next-token))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/list-projects-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.mobile.-2017-07-01.list-projects-result/projects :portkey.aws.mobile.-2017-07-01.list-projects-result/nextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.update-project-result/details (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/project-details))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/update-project-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.mobile.-2017-07-01.update-project-result/details] :locations {}))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.unauthorized-exception/message (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/error-message))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/unauthorized-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.mobile.-2017-07-01.unauthorized-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/platform (clojure.spec.alpha/conformer (clojure.core/let [m__16140__auto__ {"JAVASCRIPT" "JAVASCRIPT", :javascript "JAVASCRIPT", :windows "WINDOWS", "OSX" "OSX", :osx "OSX", "WINDOWS" "WINDOWS", :swift "SWIFT", "LINUX" "LINUX", "OBJC" "OBJC", :android "ANDROID", :linux "LINUX", "ANDROID" "ANDROID", "SWIFT" "SWIFT", :objc "OBJC"}] (clojure.core/fn [s__16141__auto__] (m__16140__auto__ s__16141__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/bundle-version (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.bad-request-exception/message (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/error-message))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/bad-request-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.mobile.-2017-07-01.bad-request-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/download-url (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/share-url (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/project-state (clojure.spec.alpha/conformer (clojure.core/let [m__16140__auto__ {"NORMAL" "NORMAL", :normal "NORMAL", "SYNCING" "SYNCING", :syncing "SYNCING", "IMPORTING" "IMPORTING", :importing "IMPORTING"}] (clojure.core/fn [s__16141__auto__] (m__16140__auto__ s__16141__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.export-bundle-result/download-url (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/download-url))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/export-bundle-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.mobile.-2017-07-01.export-bundle-result/downloadUrl] :locations {}))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/feature (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.export-project-request/project-id (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/project-id))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/export-project-request (portkey.aws/json-keys :req-un [:portkey.aws.mobile.-2017-07-01.export-project-request/projectId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/bundle-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.mobile.-2017-07-01/bundle-details) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__16061__16062__auto__] (if (clojure.core/sequential? p1__16061__16062__auto__) p1__16061__16062__auto__ [p1__16061__16062__auto__])))))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.limit-exceeded-exception/retry-after-seconds (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/error-message))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/error-message))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/limit-exceeded-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.mobile.-2017-07-01.limit-exceeded-exception/retryAfterSeconds :portkey.aws.mobile.-2017-07-01.limit-exceeded-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.update-project-request/contents (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/contents))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.update-project-request/project-id (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/project-id))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/update-project-request (portkey.aws/json-keys :req-un [:portkey.aws.mobile.-2017-07-01.update-project-request/projectId] :opt-un [:portkey.aws.mobile.-2017-07-01.update-project-request/contents] :locations {}))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.service-unavailable-exception/retry-after-seconds (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/error-message))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.service-unavailable-exception/message (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/error-message))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/service-unavailable-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.mobile.-2017-07-01.service-unavailable-exception/retryAfterSeconds :portkey.aws.mobile.-2017-07-01.service-unavailable-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/next-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.export-bundle-request/bundle-id (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/bundle-id))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.export-bundle-request/project-id (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/project-id))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.export-bundle-request/platform (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/platform))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/export-bundle-request (portkey.aws/json-keys :req-un [:portkey.aws.mobile.-2017-07-01.export-bundle-request/bundleId] :opt-un [:portkey.aws.mobile.-2017-07-01.export-bundle-request/projectId :portkey.aws.mobile.-2017-07-01.export-bundle-request/platform] :locations {}))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.create-project-request/name (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/project-name))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.create-project-request/region (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/project-region))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.create-project-request/contents (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/contents))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.create-project-request/snapshot-id (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/snapshot-id))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/create-project-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.mobile.-2017-07-01.create-project-request/name :portkey.aws.mobile.-2017-07-01.create-project-request/region :portkey.aws.mobile.-2017-07-01.create-project-request/contents :portkey.aws.mobile.-2017-07-01.create-project-request/snapshotId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/project-summaries (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.mobile.-2017-07-01/project-summary) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__16061__16062__auto__] (if (clojure.core/sequential? p1__16061__16062__auto__) p1__16061__16062__auto__ [p1__16061__16062__auto__])))))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/date clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.describe-bundle-result/details (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/bundle-details))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/describe-bundle-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.mobile.-2017-07-01.describe-bundle-result/details] :locations {}))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.too-many-requests-exception/retry-after-seconds (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/error-message))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.too-many-requests-exception/message (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/error-message))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/too-many-requests-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.mobile.-2017-07-01.too-many-requests-exception/retryAfterSeconds :portkey.aws.mobile.-2017-07-01.too-many-requests-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/attributes (clojure.spec.alpha/map-of :portkey.aws.mobile.-2017-07-01/attribute-key :portkey.aws.mobile.-2017-07-01/attribute-value))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/bundle-title (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.internal-failure-exception/message (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/error-message))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/internal-failure-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.mobile.-2017-07-01.internal-failure-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.describe-project-request/project-id (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/project-id))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.describe-project-request/sync-from-resources (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/boolean))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/describe-project-request (portkey.aws/json-keys :req-un [:portkey.aws.mobile.-2017-07-01.describe-project-request/projectId] :opt-un [:portkey.aws.mobile.-2017-07-01.describe-project-request/syncFromResources] :locations {}))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.create-project-result/details (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/project-details))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/create-project-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.mobile.-2017-07-01.create-project-result/details] :locations {}))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/attribute-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/resources (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.mobile.-2017-07-01/resource) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__16061__16062__auto__] (if (clojure.core/sequential? p1__16061__16062__auto__) p1__16061__16062__auto__ [p1__16061__16062__auto__])))))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/attribute-key (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.not-found-exception/message (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/error-message))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/not-found-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.mobile.-2017-07-01.not-found-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/resource-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/bundle-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/contents (clojure.spec.alpha/and clojure.core/bytes? (clojure.spec.alpha/conformer portkey.aws/base64-encode portkey.aws/base64-decode)))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.delete-project-result/deleted-resources (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/resources))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.delete-project-result/orphaned-resources (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/resources))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/delete-project-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.mobile.-2017-07-01.delete-project-result/deletedResources :portkey.aws.mobile.-2017-07-01.delete-project-result/orphanedResources] :locations {}))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.export-project-result/download-url (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/download-url))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.export-project-result/share-url (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/share-url))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.export-project-result/snapshot-id (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/snapshot-id))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/export-project-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.mobile.-2017-07-01.export-project-result/downloadUrl :portkey.aws.mobile.-2017-07-01.export-project-result/shareUrl :portkey.aws.mobile.-2017-07-01.export-project-result/snapshotId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.bundle-details/bundle-id (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/bundle-id))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.bundle-details/title (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/bundle-title))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.bundle-details/version (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/bundle-version))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.bundle-details/description (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/bundle-description))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.bundle-details/icon-url (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/icon-url))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.bundle-details/available-platforms (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/platforms))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/bundle-details (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.mobile.-2017-07-01.bundle-details/bundleId :portkey.aws.mobile.-2017-07-01.bundle-details/title :portkey.aws.mobile.-2017-07-01.bundle-details/version :portkey.aws.mobile.-2017-07-01.bundle-details/description :portkey.aws.mobile.-2017-07-01.bundle-details/iconUrl :portkey.aws.mobile.-2017-07-01.bundle-details/availablePlatforms] :locations {}))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/bundle-description (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/resource-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/console-url (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/project-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.list-bundles-request/max-results (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/max-results))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.list-bundles-request/next-token (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/next-token))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/list-bundles-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.mobile.-2017-07-01.list-bundles-request/maxResults :portkey.aws.mobile.-2017-07-01.list-bundles-request/nextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.project-summary/name (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/project-name))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.project-summary/project-id (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/project-id))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/project-summary (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.mobile.-2017-07-01.project-summary/name :portkey.aws.mobile.-2017-07-01.project-summary/projectId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.describe-bundle-request/bundle-id (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/bundle-id))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/describe-bundle-request (portkey.aws/json-keys :req-un [:portkey.aws.mobile.-2017-07-01.describe-bundle-request/bundleId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.account-action-required-exception/message (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/error-message))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/account-action-required-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.mobile.-2017-07-01.account-action-required-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/resource-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/max-results (clojure.spec.alpha/and clojure.core/int?))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.resource/type (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/resource-type))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.resource/name (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/resource-name))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.resource/arn (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/resource-arn))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.resource/feature (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/feature))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.resource/attributes (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/attributes))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/resource (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.mobile.-2017-07-01.resource/type :portkey.aws.mobile.-2017-07-01.resource/name :portkey.aws.mobile.-2017-07-01.resource/arn :portkey.aws.mobile.-2017-07-01.resource/feature :portkey.aws.mobile.-2017-07-01.resource/attributes] :locations {}))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/icon-url (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/project-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.list-bundles-result/bundle-list (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/bundle-list))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.list-bundles-result/next-token (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/next-token))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/list-bundles-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.mobile.-2017-07-01.list-bundles-result/bundleList :portkey.aws.mobile.-2017-07-01.list-bundles-result/nextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.delete-project-request/project-id (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/project-id))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/delete-project-request (portkey.aws/json-keys :req-un [:portkey.aws.mobile.-2017-07-01.delete-project-request/projectId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/project-region (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.project-details/name (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/project-name))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.project-details/project-id (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/project-id))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.project-details/region (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/project-region))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.project-details/state (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/project-state))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.project-details/created-date (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/date))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.project-details/last-updated-date (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/date))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.project-details/console-url (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/console-url))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.project-details/resources (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/resources))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/project-details (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.mobile.-2017-07-01.project-details/name :portkey.aws.mobile.-2017-07-01.project-details/projectId :portkey.aws.mobile.-2017-07-01.project-details/region :portkey.aws.mobile.-2017-07-01.project-details/state :portkey.aws.mobile.-2017-07-01.project-details/createdDate :portkey.aws.mobile.-2017-07-01.project-details/lastUpdatedDate :portkey.aws.mobile.-2017-07-01.project-details/consoleUrl :portkey.aws.mobile.-2017-07-01.project-details/resources] :locations {}))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/snapshot-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/platforms (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.mobile.-2017-07-01/platform) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__16061__16062__auto__] (if (clojure.core/sequential? p1__16061__16062__auto__) p1__16061__16062__auto__ [p1__16061__16062__auto__])))))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/boolean clojure.core/boolean?)

(clojure.core/defn describe-bundle " Get the bundle details for the requested bundle id." ([describe-bundle-request] (portkey.aws/-rest-json-call portkey.aws.mobile.-2017-07-01/endpoints "GET" "/bundles/{bundleId}" describe-bundle-request :portkey.aws.mobile.-2017-07-01/describe-bundle-request {:payload nil, :move {}, :headers {}, :uri {"bundleId" "bundleId"}, :querystring {}} nil :portkey.aws.mobile.-2017-07-01/describe-bundle-result {"InternalFailureException" :portkey.aws.mobile.-2017-07-01/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.mobile.-2017-07-01/service-unavailable-exception, "UnauthorizedException" :portkey.aws.mobile.-2017-07-01/unauthorized-exception, "TooManyRequestsException" :portkey.aws.mobile.-2017-07-01/too-many-requests-exception, "BadRequestException" :portkey.aws.mobile.-2017-07-01/bad-request-exception, "NotFoundException" :portkey.aws.mobile.-2017-07-01/not-found-exception})))
(clojure.spec.alpha/fdef describe-bundle :args (clojure.spec.alpha/tuple :portkey.aws.mobile.-2017-07-01/describe-bundle-request) :ret (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/describe-bundle-result))

(clojure.core/defn describe-project " Gets details about a project in AWS Mobile Hub." ([describe-project-request] (portkey.aws/-rest-json-call portkey.aws.mobile.-2017-07-01/endpoints "GET" "/project" describe-project-request :portkey.aws.mobile.-2017-07-01/describe-project-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {"projectId" "projectId", "syncFromResources" "syncFromResources"}} nil :portkey.aws.mobile.-2017-07-01/describe-project-result {"InternalFailureException" :portkey.aws.mobile.-2017-07-01/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.mobile.-2017-07-01/service-unavailable-exception, "UnauthorizedException" :portkey.aws.mobile.-2017-07-01/unauthorized-exception, "TooManyRequestsException" :portkey.aws.mobile.-2017-07-01/too-many-requests-exception, "BadRequestException" :portkey.aws.mobile.-2017-07-01/bad-request-exception, "NotFoundException" :portkey.aws.mobile.-2017-07-01/not-found-exception})))
(clojure.spec.alpha/fdef describe-project :args (clojure.spec.alpha/tuple :portkey.aws.mobile.-2017-07-01/describe-project-request) :ret (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/describe-project-result))

(clojure.core/defn list-projects " Lists projects in AWS Mobile Hub." ([] (list-projects {})) ([list-projects-request] (portkey.aws/-rest-json-call portkey.aws.mobile.-2017-07-01/endpoints "GET" "/projects" list-projects-request :portkey.aws.mobile.-2017-07-01/list-projects-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {"maxResults" "maxResults", "nextToken" "nextToken"}} nil :portkey.aws.mobile.-2017-07-01/list-projects-result {"InternalFailureException" :portkey.aws.mobile.-2017-07-01/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.mobile.-2017-07-01/service-unavailable-exception, "UnauthorizedException" :portkey.aws.mobile.-2017-07-01/unauthorized-exception, "TooManyRequestsException" :portkey.aws.mobile.-2017-07-01/too-many-requests-exception, "BadRequestException" :portkey.aws.mobile.-2017-07-01/bad-request-exception})))
(clojure.spec.alpha/fdef list-projects :args (clojure.spec.alpha/? :portkey.aws.mobile.-2017-07-01/list-projects-request) :ret (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/list-projects-result))

(clojure.core/defn update-project " Update an existing project." ([update-project-request] (portkey.aws/-rest-json-call portkey.aws.mobile.-2017-07-01/endpoints "POST" "/update" update-project-request :portkey.aws.mobile.-2017-07-01/update-project-request {:payload "contents", :move {}, :headers {}, :uri {}, :querystring {"projectId" "projectId"}} nil :portkey.aws.mobile.-2017-07-01/update-project-result {"InternalFailureException" :portkey.aws.mobile.-2017-07-01/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.mobile.-2017-07-01/service-unavailable-exception, "UnauthorizedException" :portkey.aws.mobile.-2017-07-01/unauthorized-exception, "TooManyRequestsException" :portkey.aws.mobile.-2017-07-01/too-many-requests-exception, "BadRequestException" :portkey.aws.mobile.-2017-07-01/bad-request-exception, "NotFoundException" :portkey.aws.mobile.-2017-07-01/not-found-exception, "AccountActionRequiredException" :portkey.aws.mobile.-2017-07-01/account-action-required-exception, "LimitExceededException" :portkey.aws.mobile.-2017-07-01/limit-exceeded-exception})))
(clojure.spec.alpha/fdef update-project :args (clojure.spec.alpha/tuple :portkey.aws.mobile.-2017-07-01/update-project-request) :ret (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/update-project-result))

(clojure.core/defn export-bundle " Generates customized software development kit (SDK) and or tool packages used\nto integrate mobile web or mobile app clients with backend AWS resources." ([export-bundle-request] (portkey.aws/-rest-json-call portkey.aws.mobile.-2017-07-01/endpoints "POST" "/bundles/{bundleId}" export-bundle-request :portkey.aws.mobile.-2017-07-01/export-bundle-request {:payload nil, :move {}, :headers {}, :uri {"bundleId" "bundleId"}, :querystring {"projectId" "projectId", "platform" "platform"}} nil :portkey.aws.mobile.-2017-07-01/export-bundle-result {"InternalFailureException" :portkey.aws.mobile.-2017-07-01/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.mobile.-2017-07-01/service-unavailable-exception, "UnauthorizedException" :portkey.aws.mobile.-2017-07-01/unauthorized-exception, "TooManyRequestsException" :portkey.aws.mobile.-2017-07-01/too-many-requests-exception, "BadRequestException" :portkey.aws.mobile.-2017-07-01/bad-request-exception, "NotFoundException" :portkey.aws.mobile.-2017-07-01/not-found-exception})))
(clojure.spec.alpha/fdef export-bundle :args (clojure.spec.alpha/tuple :portkey.aws.mobile.-2017-07-01/export-bundle-request) :ret (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/export-bundle-result))

(clojure.core/defn delete-project " Delets a project in AWS Mobile Hub." ([delete-project-request] (portkey.aws/-rest-json-call portkey.aws.mobile.-2017-07-01/endpoints "DELETE" "/projects/{projectId}" delete-project-request :portkey.aws.mobile.-2017-07-01/delete-project-request {:payload nil, :move {}, :headers {}, :uri {"projectId" "projectId"}, :querystring {}} nil :portkey.aws.mobile.-2017-07-01/delete-project-result {"InternalFailureException" :portkey.aws.mobile.-2017-07-01/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.mobile.-2017-07-01/service-unavailable-exception, "UnauthorizedException" :portkey.aws.mobile.-2017-07-01/unauthorized-exception, "TooManyRequestsException" :portkey.aws.mobile.-2017-07-01/too-many-requests-exception, "NotFoundException" :portkey.aws.mobile.-2017-07-01/not-found-exception})))
(clojure.spec.alpha/fdef delete-project :args (clojure.spec.alpha/tuple :portkey.aws.mobile.-2017-07-01/delete-project-request) :ret (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/delete-project-result))

(clojure.core/defn list-bundles " List all available bundles." ([] (list-bundles {})) ([list-bundles-request] (portkey.aws/-rest-json-call portkey.aws.mobile.-2017-07-01/endpoints "GET" "/bundles" list-bundles-request :portkey.aws.mobile.-2017-07-01/list-bundles-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {"maxResults" "maxResults", "nextToken" "nextToken"}} nil :portkey.aws.mobile.-2017-07-01/list-bundles-result {"InternalFailureException" :portkey.aws.mobile.-2017-07-01/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.mobile.-2017-07-01/service-unavailable-exception, "UnauthorizedException" :portkey.aws.mobile.-2017-07-01/unauthorized-exception, "TooManyRequestsException" :portkey.aws.mobile.-2017-07-01/too-many-requests-exception, "BadRequestException" :portkey.aws.mobile.-2017-07-01/bad-request-exception})))
(clojure.spec.alpha/fdef list-bundles :args (clojure.spec.alpha/? :portkey.aws.mobile.-2017-07-01/list-bundles-request) :ret (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/list-bundles-result))

(clojure.core/defn export-project " Exports project configuration to a snapshot which can be downloaded and shared.\nNote that mobile app push credentials are encrypted in exported projects, so\nthey can only be shared successfully within the same AWS account." ([export-project-request] (portkey.aws/-rest-json-call portkey.aws.mobile.-2017-07-01/endpoints "POST" "/exports/{projectId}" export-project-request :portkey.aws.mobile.-2017-07-01/export-project-request {:payload nil, :move {}, :headers {}, :uri {"projectId" "projectId"}, :querystring {}} nil :portkey.aws.mobile.-2017-07-01/export-project-result {"InternalFailureException" :portkey.aws.mobile.-2017-07-01/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.mobile.-2017-07-01/service-unavailable-exception, "UnauthorizedException" :portkey.aws.mobile.-2017-07-01/unauthorized-exception, "TooManyRequestsException" :portkey.aws.mobile.-2017-07-01/too-many-requests-exception, "BadRequestException" :portkey.aws.mobile.-2017-07-01/bad-request-exception, "NotFoundException" :portkey.aws.mobile.-2017-07-01/not-found-exception})))
(clojure.spec.alpha/fdef export-project :args (clojure.spec.alpha/tuple :portkey.aws.mobile.-2017-07-01/export-project-request) :ret (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/export-project-result))

(clojure.core/defn create-project " Creates an AWS Mobile Hub project." ([] (create-project {})) ([create-project-request] (portkey.aws/-rest-json-call portkey.aws.mobile.-2017-07-01/endpoints "POST" "/projects" create-project-request :portkey.aws.mobile.-2017-07-01/create-project-request {:payload "contents", :move {}, :headers {}, :uri {}, :querystring {"name" "name", "region" "region", "snapshotId" "snapshotId"}} nil :portkey.aws.mobile.-2017-07-01/create-project-result {"InternalFailureException" :portkey.aws.mobile.-2017-07-01/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.mobile.-2017-07-01/service-unavailable-exception, "UnauthorizedException" :portkey.aws.mobile.-2017-07-01/unauthorized-exception, "TooManyRequestsException" :portkey.aws.mobile.-2017-07-01/too-many-requests-exception, "BadRequestException" :portkey.aws.mobile.-2017-07-01/bad-request-exception, "NotFoundException" :portkey.aws.mobile.-2017-07-01/not-found-exception, "LimitExceededException" :portkey.aws.mobile.-2017-07-01/limit-exceeded-exception})))
(clojure.spec.alpha/fdef create-project :args (clojure.spec.alpha/? :portkey.aws.mobile.-2017-07-01/create-project-request) :ret (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/create-project-result))
