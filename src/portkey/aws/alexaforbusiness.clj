(ns portkey.aws.alexaforbusiness (:require [portkey.aws]))

(def
 endpoints
 '{"us-east-1"
   {:credential-scope {:service "a4b", :region "us-east-1"},
    :ssl-common-name "a4b.us-east-1.amazonaws.com",
    :endpoint "https://a4b.us-east-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-sort-list)

(clojure.core/declare ser-address)

(clojure.core/declare ser-sort)

(clojure.core/declare ser-filter-value-list)

(clojure.core/declare ser-sort-key)

(clojure.core/declare ser-filter)

(clojure.core/declare ser-client-request-token)

(clojure.core/declare ser-provider-calendar-id)

(clojure.core/declare ser-email)

(clojure.core/declare ser-enrollment-id)

(clojure.core/declare ser-wake-word)

(clojure.core/declare seruser-user-id)

(clojure.core/declare ser-contact-name)

(clojure.core/declare ser-address-book-description)

(clojure.core/declare ser-feature)

(clojure.core/declare ser-user-id)

(clojure.core/declare ser-tag-key)

(clojure.core/declare ser-skill-group-name)

(clojure.core/declare ser-room-skill-parameter)

(clojure.core/declare ser-next-token)

(clojure.core/declare ser-address-book-name)

(clojure.core/declare ser-filter-key)

(clojure.core/declare ser-tag-list)

(clojure.core/declare ser-timezone)

(clojure.core/declare ser-tag-key-list)

(clojure.core/declare seruser-first-name)

(clojure.core/declare ser-tag-value)

(clojure.core/declare ser-max-volume-limit)

(clojure.core/declare ser-sort-value)

(clojure.core/declare ser-room-description)

(clojure.core/declare ser-room-skill-parameter-key)

(clojure.core/declare ser-arn)

(clojure.core/declare ser-skill-list-max-results)

(clojure.core/declare seruser-last-name)

(clojure.core/declare ser-device-name)

(clojure.core/declare ser-temperature-unit)

(clojure.core/declare ser-room-skill-parameter-value)

(clojure.core/declare ser-distance-unit)

(clojure.core/declare ser-max-results)

(clojure.core/declare ser-tag)

(clojure.core/declare ser-device-event-type)

(clojure.core/declare ser-e-164-phone-number)

(clojure.core/declare ser-skill-group-description)

(clojure.core/declare ser-room-name)

(clojure.core/declare ser-filter-list)

(clojure.core/declare ser-skill-id)

(clojure.core/declare ser-profile-name)

(clojure.core/declare ser-filter-value)

(clojure.core/declare ser-features)

(clojure.core/declare ser-boolean)

(clojure.core/defn- ser-sort-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-sort coll) #:http.request.field{:shape "Sort"}))) input), :shape "SortList", :type "list", :max 25})

(clojure.core/defn- ser-address [input] #:http.request.field{:value input, :shape "Address"})

(clojure.core/defn- ser-sort [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-sort-key (:key input)) #:http.request.field{:name "Key", :shape "SortKey"}) (clojure.core/into (ser-sort-value (:value input)) #:http.request.field{:name "Value", :shape "SortValue"})], :shape "Sort", :type "structure"}))

(clojure.core/defn- ser-filter-value-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-filter-value coll) #:http.request.field{:shape "FilterValue"}))) input), :shape "FilterValueList", :type "list", :max 5})

(clojure.core/defn- ser-sort-key [input] #:http.request.field{:value input, :shape "SortKey"})

(clojure.core/defn- ser-filter [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-filter-key (:key input)) #:http.request.field{:name "Key", :shape "FilterKey"}) (clojure.core/into (ser-filter-value-list (:values input)) #:http.request.field{:name "Values", :shape "FilterValueList"})], :shape "Filter", :type "structure"}))

(clojure.core/defn- ser-client-request-token [input] #:http.request.field{:value input, :shape "ClientRequestToken"})

(clojure.core/defn- ser-provider-calendar-id [input] #:http.request.field{:value input, :shape "ProviderCalendarId"})

(clojure.core/defn- ser-email [input] #:http.request.field{:value input, :shape "Email"})

(clojure.core/defn- ser-enrollment-id [input] #:http.request.field{:value input, :shape "EnrollmentId"})

(clojure.core/defn- ser-wake-word [input] #:http.request.field{:value (clojure.core/get {"ALEXA" "ALEXA", :alexa "ALEXA", "AMAZON" "AMAZON", :amazon "AMAZON", "ECHO" "ECHO", :echo "ECHO", "COMPUTER" "COMPUTER", :computer "COMPUTER"} input), :shape "WakeWord"})

(clojure.core/defn- seruser-user-id [input] #:http.request.field{:value input, :shape "user_UserId"})

(clojure.core/defn- ser-contact-name [input] #:http.request.field{:value input, :shape "ContactName"})

(clojure.core/defn- ser-address-book-description [input] #:http.request.field{:value input, :shape "AddressBookDescription"})

(clojure.core/defn- ser-feature [input] #:http.request.field{:value (clojure.core/get {"NOTIFICATIONS" "NOTIFICATIONS", :lists "LISTS", "SKILLS" "SKILLS", "LISTS" "LISTS", :bluetooth "BLUETOOTH", "BLUETOOTH" "BLUETOOTH", :all "ALL", :volume "VOLUME", :notifications "NOTIFICATIONS", :skills "SKILLS", "VOLUME" "VOLUME", "ALL" "ALL"} input), :shape "Feature"})

(clojure.core/defn- ser-user-id [input] #:http.request.field{:value input, :shape "UserId"})

(clojure.core/defn- ser-tag-key [input] #:http.request.field{:value input, :shape "TagKey"})

(clojure.core/defn- ser-skill-group-name [input] #:http.request.field{:value input, :shape "SkillGroupName"})

(clojure.core/defn- ser-room-skill-parameter [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-room-skill-parameter-key (:parameter-key input)) #:http.request.field{:name "ParameterKey", :shape "RoomSkillParameterKey"}) (clojure.core/into (ser-room-skill-parameter-value (:parameter-value input)) #:http.request.field{:name "ParameterValue", :shape "RoomSkillParameterValue"})], :shape "RoomSkillParameter", :type "structure"}))

(clojure.core/defn- ser-next-token [input] #:http.request.field{:value input, :shape "NextToken"})

(clojure.core/defn- ser-address-book-name [input] #:http.request.field{:value input, :shape "AddressBookName"})

(clojure.core/defn- ser-filter-key [input] #:http.request.field{:value input, :shape "FilterKey"})

(clojure.core/defn- ser-tag-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag coll) #:http.request.field{:shape "Tag"}))) input), :shape "TagList", :type "list"})

(clojure.core/defn- ser-timezone [input] #:http.request.field{:value input, :shape "Timezone"})

(clojure.core/defn- ser-tag-key-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag-key coll) #:http.request.field{:shape "TagKey"}))) input), :shape "TagKeyList", :type "list"})

(clojure.core/defn- seruser-first-name [input] #:http.request.field{:value input, :shape "user_FirstName"})

(clojure.core/defn- ser-tag-value [input] #:http.request.field{:value input, :shape "TagValue"})

(clojure.core/defn- ser-max-volume-limit [input] #:http.request.field{:value input, :shape "MaxVolumeLimit"})

(clojure.core/defn- ser-sort-value [input] #:http.request.field{:value (clojure.core/get {"ASC" "ASC", :asc "ASC", "DESC" "DESC", :desc "DESC"} input), :shape "SortValue"})

(clojure.core/defn- ser-room-description [input] #:http.request.field{:value input, :shape "RoomDescription"})

(clojure.core/defn- ser-room-skill-parameter-key [input] #:http.request.field{:value input, :shape "RoomSkillParameterKey"})

(clojure.core/defn- ser-arn [input] #:http.request.field{:value input, :shape "Arn"})

(clojure.core/defn- ser-skill-list-max-results [input] #:http.request.field{:value input, :shape "SkillListMaxResults"})

(clojure.core/defn- seruser-last-name [input] #:http.request.field{:value input, :shape "user_LastName"})

(clojure.core/defn- ser-device-name [input] #:http.request.field{:value input, :shape "DeviceName"})

(clojure.core/defn- ser-temperature-unit [input] #:http.request.field{:value (clojure.core/get {"FAHRENHEIT" "FAHRENHEIT", :fahrenheit "FAHRENHEIT", "CELSIUS" "CELSIUS", :celsius "CELSIUS"} input), :shape "TemperatureUnit"})

(clojure.core/defn- ser-room-skill-parameter-value [input] #:http.request.field{:value input, :shape "RoomSkillParameterValue"})

(clojure.core/defn- ser-distance-unit [input] #:http.request.field{:value (clojure.core/get {"METRIC" "METRIC", :metric "METRIC", "IMPERIAL" "IMPERIAL", :imperial "IMPERIAL"} input), :shape "DistanceUnit"})

(clojure.core/defn- ser-max-results [input] #:http.request.field{:value input, :shape "MaxResults"})

(clojure.core/defn- ser-tag [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Tag", :type "structure"} (clojure.core/contains? input :key) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-key (input :key)) #:http.request.field{:name "Key", :shape "TagKey"})) (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-value (input :value)) #:http.request.field{:name "Value", :shape "TagValue"}))))

(clojure.core/defn- ser-device-event-type [input] #:http.request.field{:value (clojure.core/get {"CONNECTION_STATUS" "CONNECTION_STATUS", :connection-status "CONNECTION_STATUS", "DEVICE_STATUS" "DEVICE_STATUS", :device-status "DEVICE_STATUS"} input), :shape "DeviceEventType"})

(clojure.core/defn- ser-e-164-phone-number [input] #:http.request.field{:value input, :shape "E164PhoneNumber"})

(clojure.core/defn- ser-skill-group-description [input] #:http.request.field{:value input, :shape "SkillGroupDescription"})

(clojure.core/defn- ser-room-name [input] #:http.request.field{:value input, :shape "RoomName"})

(clojure.core/defn- ser-filter-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-filter coll) #:http.request.field{:shape "Filter"}))) input), :shape "FilterList", :type "list", :max 25})

(clojure.core/defn- ser-skill-id [input] #:http.request.field{:value input, :shape "SkillId"})

(clojure.core/defn- ser-profile-name [input] #:http.request.field{:value input, :shape "ProfileName"})

(clojure.core/defn- ser-filter-value [input] #:http.request.field{:value input, :shape "FilterValue"})

(clojure.core/defn- ser-features [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-feature coll) #:http.request.field{:shape "Feature"}))) input), :shape "Features", :type "list"})

(clojure.core/defn- ser-boolean [input] #:http.request.field{:value input, :shape "Boolean"})

(clojure.core/defn- req-update-profile-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :address) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-address (input :address)) #:http.request.field{:name "Address", :shape "Address"})) (clojure.core/contains? input :wake-word) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-wake-word (input :wake-word)) #:http.request.field{:name "WakeWord", :shape "WakeWord"})) (clojure.core/contains? input :setup-mode-disabled) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :setup-mode-disabled)) #:http.request.field{:name "SetupModeDisabled", :shape "Boolean"})) (clojure.core/contains? input :pstn-enabled) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :pstn-enabled)) #:http.request.field{:name "PSTNEnabled", :shape "Boolean"})) (clojure.core/contains? input :timezone) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timezone (input :timezone)) #:http.request.field{:name "Timezone", :shape "Timezone"})) (clojure.core/contains? input :max-volume-limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-volume-limit (input :max-volume-limit)) #:http.request.field{:name "MaxVolumeLimit", :shape "MaxVolumeLimit"})) (clojure.core/contains? input :profile-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn (input :profile-arn)) #:http.request.field{:name "ProfileArn", :shape "Arn"})) (clojure.core/contains? input :temperature-unit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-temperature-unit (input :temperature-unit)) #:http.request.field{:name "TemperatureUnit", :shape "TemperatureUnit"})) (clojure.core/contains? input :distance-unit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-distance-unit (input :distance-unit)) #:http.request.field{:name "DistanceUnit", :shape "DistanceUnit"})) (clojure.core/contains? input :profile-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-profile-name (input :profile-name)) #:http.request.field{:name "ProfileName", :shape "ProfileName"}))))

(clojure.core/defn- req-disassociate-device-from-room-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :device-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn (input :device-arn)) #:http.request.field{:name "DeviceArn", :shape "Arn"}))))

(clojure.core/defn- req-delete-room-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :room-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn (input :room-arn)) #:http.request.field{:name "RoomArn", :shape "Arn"}))))

(clojure.core/defn- req-get-profile-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :profile-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn (input :profile-arn)) #:http.request.field{:name "ProfileArn", :shape "Arn"}))))

(clojure.core/defn- req-list-device-events-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :device-arn)) #:http.request.field{:name "DeviceArn", :shape "Arn"})]} (clojure.core/contains? input :event-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-device-event-type (input :event-type)) #:http.request.field{:name "EventType", :shape "DeviceEventType"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"}))))

(clojure.core/defn- req-search-devices-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"})) (clojure.core/contains? input :filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-filter-list (input :filters)) #:http.request.field{:name "Filters", :shape "FilterList"})) (clojure.core/contains? input :sort-criteria) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sort-list (input :sort-criteria)) #:http.request.field{:name "SortCriteria", :shape "SortList"}))))

(clojure.core/defn- req-search-address-books-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-filter-list (input :filters)) #:http.request.field{:name "Filters", :shape "FilterList"})) (clojure.core/contains? input :sort-criteria) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sort-list (input :sort-criteria)) #:http.request.field{:name "SortCriteria", :shape "SortList"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"}))))

(clojure.core/defn- req-get-address-book-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :address-book-arn)) #:http.request.field{:name "AddressBookArn", :shape "Arn"})]}))

(clojure.core/defn- req-disassociate-skill-group-from-room-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :skill-group-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn (input :skill-group-arn)) #:http.request.field{:name "SkillGroupArn", :shape "Arn"})) (clojure.core/contains? input :room-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn (input :room-arn)) #:http.request.field{:name "RoomArn", :shape "Arn"}))))

(clojure.core/defn- req-search-rooms-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"})) (clojure.core/contains? input :filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-filter-list (input :filters)) #:http.request.field{:name "Filters", :shape "FilterList"})) (clojure.core/contains? input :sort-criteria) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sort-list (input :sort-criteria)) #:http.request.field{:name "SortCriteria", :shape "SortList"}))))

(clojure.core/defn- req-get-device-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :device-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn (input :device-arn)) #:http.request.field{:name "DeviceArn", :shape "Arn"}))))

(clojure.core/defn- req-update-device-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :device-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn (input :device-arn)) #:http.request.field{:name "DeviceArn", :shape "Arn"})) (clojure.core/contains? input :device-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-device-name (input :device-name)) #:http.request.field{:name "DeviceName", :shape "DeviceName"}))))

(clojure.core/defn- req-search-users-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"})) (clojure.core/contains? input :filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-filter-list (input :filters)) #:http.request.field{:name "Filters", :shape "FilterList"})) (clojure.core/contains? input :sort-criteria) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sort-list (input :sort-criteria)) #:http.request.field{:name "SortCriteria", :shape "SortList"}))))

(clojure.core/defn- req-delete-room-skill-parameter-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-skill-id (input :skill-id)) #:http.request.field{:name "SkillId", :shape "SkillId"}) (clojure.core/into (ser-room-skill-parameter-key (input :parameter-key)) #:http.request.field{:name "ParameterKey", :shape "RoomSkillParameterKey"})]} (clojure.core/contains? input :room-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn (input :room-arn)) #:http.request.field{:name "RoomArn", :shape "Arn"}))))

(clojure.core/defn- req-revoke-invitation-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :user-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn (input :user-arn)) #:http.request.field{:name "UserArn", :shape "Arn"})) (clojure.core/contains? input :enrollment-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-enrollment-id (input :enrollment-id)) #:http.request.field{:name "EnrollmentId", :shape "EnrollmentId"}))))

(clojure.core/defn- req-associate-skill-group-with-room-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :skill-group-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn (input :skill-group-arn)) #:http.request.field{:name "SkillGroupArn", :shape "Arn"})) (clojure.core/contains? input :room-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn (input :room-arn)) #:http.request.field{:name "RoomArn", :shape "Arn"}))))

(clojure.core/defn- req-get-skill-group-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :skill-group-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn (input :skill-group-arn)) #:http.request.field{:name "SkillGroupArn", :shape "Arn"}))))

(clojure.core/defn- req-associate-contact-with-address-book-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :contact-arn)) #:http.request.field{:name "ContactArn", :shape "Arn"}) (clojure.core/into (ser-arn (input :address-book-arn)) #:http.request.field{:name "AddressBookArn", :shape "Arn"})]}))

(clojure.core/defn- req-create-profile-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-profile-name (input :profile-name)) #:http.request.field{:name "ProfileName", :shape "ProfileName"}) (clojure.core/into (ser-timezone (input :timezone)) #:http.request.field{:name "Timezone", :shape "Timezone"}) (clojure.core/into (ser-address (input :address)) #:http.request.field{:name "Address", :shape "Address"}) (clojure.core/into (ser-distance-unit (input :distance-unit)) #:http.request.field{:name "DistanceUnit", :shape "DistanceUnit"}) (clojure.core/into (ser-temperature-unit (input :temperature-unit)) #:http.request.field{:name "TemperatureUnit", :shape "TemperatureUnit"}) (clojure.core/into (ser-wake-word (input :wake-word)) #:http.request.field{:name "WakeWord", :shape "WakeWord"})]} (clojure.core/contains? input :client-request-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-request-token (input :client-request-token)) #:http.request.field{:name "ClientRequestToken", :shape "ClientRequestToken", :idempotency-token true})) (clojure.core/contains? input :setup-mode-disabled) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :setup-mode-disabled)) #:http.request.field{:name "SetupModeDisabled", :shape "Boolean"})) (clojure.core/contains? input :pstn-enabled) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :pstn-enabled)) #:http.request.field{:name "PSTNEnabled", :shape "Boolean"})) (clojure.core/contains? input :max-volume-limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-volume-limit (input :max-volume-limit)) #:http.request.field{:name "MaxVolumeLimit", :shape "MaxVolumeLimit"}))))

(clojure.core/defn- req-resolve-room-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-user-id (input :user-id)) #:http.request.field{:name "UserId", :shape "UserId"}) (clojure.core/into (ser-skill-id (input :skill-id)) #:http.request.field{:name "SkillId", :shape "SkillId"})]}))

(clojure.core/defn- req-delete-address-book-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :address-book-arn)) #:http.request.field{:name "AddressBookArn", :shape "Arn"})]}))

(clojure.core/defn- req-create-contact-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-contact-name (input :first-name)) #:http.request.field{:name "FirstName", :shape "ContactName"}) (clojure.core/into (ser-e-164-phone-number (input :phone-number)) #:http.request.field{:name "PhoneNumber", :shape "E164PhoneNumber"})]} (clojure.core/contains? input :display-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-contact-name (input :display-name)) #:http.request.field{:name "DisplayName", :shape "ContactName"})) (clojure.core/contains? input :last-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-contact-name (input :last-name)) #:http.request.field{:name "LastName", :shape "ContactName"})) (clojure.core/contains? input :client-request-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-request-token (input :client-request-token)) #:http.request.field{:name "ClientRequestToken", :shape "ClientRequestToken", :idempotency-token true}))))

(clojure.core/defn- req-tag-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :arn)) #:http.request.field{:name "Arn", :shape "Arn"}) (clojure.core/into (ser-tag-list (input :tags)) #:http.request.field{:name "Tags", :shape "TagList"})]}))

(clojure.core/defn- req-delete-skill-group-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :skill-group-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn (input :skill-group-arn)) #:http.request.field{:name "SkillGroupArn", :shape "Arn"}))))

(clojure.core/defn- req-search-contacts-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-filter-list (input :filters)) #:http.request.field{:name "Filters", :shape "FilterList"})) (clojure.core/contains? input :sort-criteria) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sort-list (input :sort-criteria)) #:http.request.field{:name "SortCriteria", :shape "SortList"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"}))))

(clojure.core/defn- req-get-room-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :room-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn (input :room-arn)) #:http.request.field{:name "RoomArn", :shape "Arn"}))))

(clojure.core/defn- req-search-skill-groups-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"})) (clojure.core/contains? input :filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-filter-list (input :filters)) #:http.request.field{:name "Filters", :shape "FilterList"})) (clojure.core/contains? input :sort-criteria) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sort-list (input :sort-criteria)) #:http.request.field{:name "SortCriteria", :shape "SortList"}))))

(clojure.core/defn- req-get-room-skill-parameter-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-skill-id (input :skill-id)) #:http.request.field{:name "SkillId", :shape "SkillId"}) (clojure.core/into (ser-room-skill-parameter-key (input :parameter-key)) #:http.request.field{:name "ParameterKey", :shape "RoomSkillParameterKey"})]} (clojure.core/contains? input :room-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn (input :room-arn)) #:http.request.field{:name "RoomArn", :shape "Arn"}))))

(clojure.core/defn- req-create-address-book-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-address-book-name (input :name)) #:http.request.field{:name "Name", :shape "AddressBookName"})]} (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-address-book-description (input :description)) #:http.request.field{:name "Description", :shape "AddressBookDescription"})) (clojure.core/contains? input :client-request-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-request-token (input :client-request-token)) #:http.request.field{:name "ClientRequestToken", :shape "ClientRequestToken", :idempotency-token true}))))

(clojure.core/defn- req-start-device-sync-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-features (input :features)) #:http.request.field{:name "Features", :shape "Features"})]} (clojure.core/contains? input :room-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn (input :room-arn)) #:http.request.field{:name "RoomArn", :shape "Arn"})) (clojure.core/contains? input :device-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn (input :device-arn)) #:http.request.field{:name "DeviceArn", :shape "Arn"}))))

(clojure.core/defn- req-list-skills-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :skill-group-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn (input :skill-group-arn)) #:http.request.field{:name "SkillGroupArn", :shape "Arn"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-skill-list-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "SkillListMaxResults"}))))

(clojure.core/defn- req-update-address-book-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :address-book-arn)) #:http.request.field{:name "AddressBookArn", :shape "Arn"})]} (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-address-book-name (input :name)) #:http.request.field{:name "Name", :shape "AddressBookName"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-address-book-description (input :description)) #:http.request.field{:name "Description", :shape "AddressBookDescription"}))))

(clojure.core/defn- req-create-user-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (seruser-user-id (input :user-id)) #:http.request.field{:name "UserId", :shape "user_UserId"})]} (clojure.core/contains? input :first-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (seruser-first-name (input :first-name)) #:http.request.field{:name "FirstName", :shape "user_FirstName"})) (clojure.core/contains? input :last-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (seruser-last-name (input :last-name)) #:http.request.field{:name "LastName", :shape "user_LastName"})) (clojure.core/contains? input :email) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-email (input :email)) #:http.request.field{:name "Email", :shape "Email"})) (clojure.core/contains? input :client-request-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-request-token (input :client-request-token)) #:http.request.field{:name "ClientRequestToken", :shape "ClientRequestToken", :idempotency-token true})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-list (input :tags)) #:http.request.field{:name "Tags", :shape "TagList"}))))

(clojure.core/defn- req-disassociate-contact-from-address-book-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :contact-arn)) #:http.request.field{:name "ContactArn", :shape "Arn"}) (clojure.core/into (ser-arn (input :address-book-arn)) #:http.request.field{:name "AddressBookArn", :shape "Arn"})]}))

(clojure.core/defn- req-search-profiles-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"})) (clojure.core/contains? input :filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-filter-list (input :filters)) #:http.request.field{:name "Filters", :shape "FilterList"})) (clojure.core/contains? input :sort-criteria) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sort-list (input :sort-criteria)) #:http.request.field{:name "SortCriteria", :shape "SortList"}))))

(clojure.core/defn- req-create-skill-group-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-skill-group-name (input :skill-group-name)) #:http.request.field{:name "SkillGroupName", :shape "SkillGroupName"})]} (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-skill-group-description (input :description)) #:http.request.field{:name "Description", :shape "SkillGroupDescription"})) (clojure.core/contains? input :client-request-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-request-token (input :client-request-token)) #:http.request.field{:name "ClientRequestToken", :shape "ClientRequestToken", :idempotency-token true}))))

(clojure.core/defn- req-update-contact-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :contact-arn)) #:http.request.field{:name "ContactArn", :shape "Arn"})]} (clojure.core/contains? input :display-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-contact-name (input :display-name)) #:http.request.field{:name "DisplayName", :shape "ContactName"})) (clojure.core/contains? input :first-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-contact-name (input :first-name)) #:http.request.field{:name "FirstName", :shape "ContactName"})) (clojure.core/contains? input :last-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-contact-name (input :last-name)) #:http.request.field{:name "LastName", :shape "ContactName"})) (clojure.core/contains? input :phone-number) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-e-164-phone-number (input :phone-number)) #:http.request.field{:name "PhoneNumber", :shape "E164PhoneNumber"}))))

(clojure.core/defn- req-update-room-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :room-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn (input :room-arn)) #:http.request.field{:name "RoomArn", :shape "Arn"})) (clojure.core/contains? input :room-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-room-name (input :room-name)) #:http.request.field{:name "RoomName", :shape "RoomName"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-room-description (input :description)) #:http.request.field{:name "Description", :shape "RoomDescription"})) (clojure.core/contains? input :provider-calendar-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-provider-calendar-id (input :provider-calendar-id)) #:http.request.field{:name "ProviderCalendarId", :shape "ProviderCalendarId"})) (clojure.core/contains? input :profile-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn (input :profile-arn)) #:http.request.field{:name "ProfileArn", :shape "Arn"}))))

(clojure.core/defn- req-delete-user-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-enrollment-id (input :enrollment-id)) #:http.request.field{:name "EnrollmentId", :shape "EnrollmentId"})]} (clojure.core/contains? input :user-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn (input :user-arn)) #:http.request.field{:name "UserArn", :shape "Arn"}))))

(clojure.core/defn- req-create-room-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-room-name (input :room-name)) #:http.request.field{:name "RoomName", :shape "RoomName"})]} (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-room-description (input :description)) #:http.request.field{:name "Description", :shape "RoomDescription"})) (clojure.core/contains? input :profile-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn (input :profile-arn)) #:http.request.field{:name "ProfileArn", :shape "Arn"})) (clojure.core/contains? input :provider-calendar-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-provider-calendar-id (input :provider-calendar-id)) #:http.request.field{:name "ProviderCalendarId", :shape "ProviderCalendarId"})) (clojure.core/contains? input :client-request-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-request-token (input :client-request-token)) #:http.request.field{:name "ClientRequestToken", :shape "ClientRequestToken", :idempotency-token true})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-list (input :tags)) #:http.request.field{:name "Tags", :shape "TagList"}))))

(clojure.core/defn- req-send-invitation-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :user-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn (input :user-arn)) #:http.request.field{:name "UserArn", :shape "Arn"}))))

(clojure.core/defn- req-put-room-skill-parameter-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-skill-id (input :skill-id)) #:http.request.field{:name "SkillId", :shape "SkillId"}) (clojure.core/into (ser-room-skill-parameter (input :room-skill-parameter)) #:http.request.field{:name "RoomSkillParameter", :shape "RoomSkillParameter"})]} (clojure.core/contains? input :room-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn (input :room-arn)) #:http.request.field{:name "RoomArn", :shape "Arn"}))))

(clojure.core/defn- req-update-skill-group-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :skill-group-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn (input :skill-group-arn)) #:http.request.field{:name "SkillGroupArn", :shape "Arn"})) (clojure.core/contains? input :skill-group-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-skill-group-name (input :skill-group-name)) #:http.request.field{:name "SkillGroupName", :shape "SkillGroupName"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-skill-group-description (input :description)) #:http.request.field{:name "Description", :shape "SkillGroupDescription"}))))

(clojure.core/defn- req-associate-device-with-room-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :device-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn (input :device-arn)) #:http.request.field{:name "DeviceArn", :shape "Arn"})) (clojure.core/contains? input :room-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn (input :room-arn)) #:http.request.field{:name "RoomArn", :shape "Arn"}))))

(clojure.core/defn- req-get-contact-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :contact-arn)) #:http.request.field{:name "ContactArn", :shape "Arn"})]}))

(clojure.core/defn- req-delete-profile-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :profile-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn (input :profile-arn)) #:http.request.field{:name "ProfileArn", :shape "Arn"}))))

(clojure.core/defn- req-delete-contact-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :contact-arn)) #:http.request.field{:name "ContactArn", :shape "Arn"})]}))

(clojure.core/defn- req-untag-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :arn)) #:http.request.field{:name "Arn", :shape "Arn"}) (clojure.core/into (ser-tag-key-list (input :tag-keys)) #:http.request.field{:name "TagKeys", :shape "TagKeyList"})]}))

(clojure.core/defn- req-list-tags-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :arn)) #:http.request.field{:name "Arn", :shape "Arn"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"}))))

(clojure.core/declare deser-skill-name)

(clojure.core/declare deserboolean)

(clojure.core/declare deser-address)

(clojure.core/declare deser-device-serial-number)

(clojure.core/declare deser-client-request-token)

(clojure.core/declare deser-provider-calendar-id)

(clojure.core/declare deser-device-status-details)

(clojure.core/declare deser-software-version)

(clojure.core/declare deser-email)

(clojure.core/declare deser-device-status-info)

(clojure.core/declare deser-enrollment-id)

(clojure.core/declare deser-room)

(clojure.core/declare deser-wake-word)

(clojure.core/declare deser-profile-data)

(clojure.core/declare deser-contact-name)

(clojure.core/declare deser-address-book-data-list)

(clojure.core/declare deser-address-book-description)

(clojure.core/declare deser-mac-address)

(clojure.core/declare deser-skill-group)

(clojure.core/declare deser-tag-key)

(clojure.core/declare deser-skill-group-name)

(clojure.core/declare deser-room-skill-parameter)

(clojure.core/declare deser-address-book-data)

(clojure.core/declare deser-device-status-detail-code)

(clojure.core/declare deser-device-status-detail)

(clojure.core/declare deser-device-data-list)

(clojure.core/declare deser-room-skill-parameters)

(clojure.core/declare deser-contact)

(clojure.core/declare deser-next-token)

(clojure.core/declare deser-error-message)

(clojure.core/declare deser-connection-status)

(clojure.core/declare deser-device-event)

(clojure.core/declare deser-address-book-name)

(clojure.core/declare deser-skill-summary-list)

(clojure.core/declare deser-skill-group-data-list)

(clojure.core/declare deser-tag-list)

(clojure.core/declare deser-timezone)

(clojure.core/declare deser-skill-summary)

(clojure.core/declare deser-device-data)

(clojure.core/declare deser-profile)

(clojure.core/declare deseruser-first-name)

(clojure.core/declare deser-tag-value)

(clojure.core/declare deser-total-count)

(clojure.core/declare deser-device-type)

(clojure.core/declare deser-profile-data-list)

(clojure.core/declare deser-max-volume-limit)

(clojure.core/declare deser-device-status)

(clojure.core/declare deser-address-book)

(clojure.core/declare deser-user-data-list)

(clojure.core/declare deser-room-description)

(clojure.core/declare deser-room-skill-parameter-key)

(clojure.core/declare deser-arn)

(clojure.core/declare deseruser-last-name)

(clojure.core/declare deser-device-name)

(clojure.core/declare deser-temperature-unit)

(clojure.core/declare deser-timestamp)

(clojure.core/declare deser-room-skill-parameter-value)

(clojure.core/declare deser-contact-data)

(clojure.core/declare deser-distance-unit)

(clojure.core/declare deser-tag)

(clojure.core/declare deser-room-data)

(clojure.core/declare deser-device-event-value)

(clojure.core/declare deser-device-event-list)

(clojure.core/declare deser-device-event-type)

(clojure.core/declare deser-e-164-phone-number)

(clojure.core/declare deser-contact-data-list)

(clojure.core/declare deser-skill-group-description)

(clojure.core/declare deser-room-name)

(clojure.core/declare deser-device)

(clojure.core/declare deser-user-data)

(clojure.core/declare deser-skill-id)

(clojure.core/declare deser-profile-name)

(clojure.core/declare deser-skill-group-data)

(clojure.core/declare deser-enrollment-status)

(clojure.core/declare deser-boolean)

(clojure.core/declare deser-room-data-list)

(clojure.core/defn- deser-skill-name [input] input)

(clojure.core/defn- deserboolean [input] input)

(clojure.core/defn- deser-address [input] input)

(clojure.core/defn- deser-device-serial-number [input] input)

(clojure.core/defn- deser-client-request-token [input] input)

(clojure.core/defn- deser-provider-calendar-id [input] input)

(clojure.core/defn- deser-device-status-details [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-device-status-detail coll))) input))

(clojure.core/defn- deser-software-version [input] input)

(clojure.core/defn- deser-email [input] input)

(clojure.core/defn- deser-device-status-info [input] (clojure.core/cond-> {} (clojure.core/contains? input "DeviceStatusDetails") (clojure.core/assoc :device-status-details (deser-device-status-details (input "DeviceStatusDetails"))) (clojure.core/contains? input "ConnectionStatus") (clojure.core/assoc :connection-status (deser-connection-status (input "ConnectionStatus")))))

(clojure.core/defn- deser-enrollment-id [input] input)

(clojure.core/defn- deser-room [input] (clojure.core/cond-> {} (clojure.core/contains? input "RoomArn") (clojure.core/assoc :room-arn (deser-arn (input "RoomArn"))) (clojure.core/contains? input "RoomName") (clojure.core/assoc :room-name (deser-room-name (input "RoomName"))) (clojure.core/contains? input "Description") (clojure.core/assoc :description (deser-room-description (input "Description"))) (clojure.core/contains? input "ProviderCalendarId") (clojure.core/assoc :provider-calendar-id (deser-provider-calendar-id (input "ProviderCalendarId"))) (clojure.core/contains? input "ProfileArn") (clojure.core/assoc :profile-arn (deser-arn (input "ProfileArn")))))

(clojure.core/defn- deser-wake-word [input] (clojure.core/get {"ALEXA" :alexa, "AMAZON" :amazon, "ECHO" :echo, "COMPUTER" :computer} input))

(clojure.core/defn- deser-profile-data [input] (clojure.core/cond-> {} (clojure.core/contains? input "ProfileArn") (clojure.core/assoc :profile-arn (deser-arn (input "ProfileArn"))) (clojure.core/contains? input "ProfileName") (clojure.core/assoc :profile-name (deser-profile-name (input "ProfileName"))) (clojure.core/contains? input "Address") (clojure.core/assoc :address (deser-address (input "Address"))) (clojure.core/contains? input "Timezone") (clojure.core/assoc :timezone (deser-timezone (input "Timezone"))) (clojure.core/contains? input "DistanceUnit") (clojure.core/assoc :distance-unit (deser-distance-unit (input "DistanceUnit"))) (clojure.core/contains? input "TemperatureUnit") (clojure.core/assoc :temperature-unit (deser-temperature-unit (input "TemperatureUnit"))) (clojure.core/contains? input "WakeWord") (clojure.core/assoc :wake-word (deser-wake-word (input "WakeWord")))))

(clojure.core/defn- deser-contact-name [input] input)

(clojure.core/defn- deser-address-book-data-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-address-book-data coll))) input))

(clojure.core/defn- deser-address-book-description [input] input)

(clojure.core/defn- deser-mac-address [input] input)

(clojure.core/defn- deser-skill-group [input] (clojure.core/cond-> {} (clojure.core/contains? input "SkillGroupArn") (clojure.core/assoc :skill-group-arn (deser-arn (input "SkillGroupArn"))) (clojure.core/contains? input "SkillGroupName") (clojure.core/assoc :skill-group-name (deser-skill-group-name (input "SkillGroupName"))) (clojure.core/contains? input "Description") (clojure.core/assoc :description (deser-skill-group-description (input "Description")))))

(clojure.core/defn- deser-tag-key [input] input)

(clojure.core/defn- deser-skill-group-name [input] input)

(clojure.core/defn- deser-room-skill-parameter [input] (clojure.core/cond-> {:parameter-key (deser-room-skill-parameter-key (input "ParameterKey")), :parameter-value (deser-room-skill-parameter-value (input "ParameterValue"))}))

(clojure.core/defn- deser-address-book-data [input] (clojure.core/cond-> {} (clojure.core/contains? input "AddressBookArn") (clojure.core/assoc :address-book-arn (deser-arn (input "AddressBookArn"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-address-book-name (input "Name"))) (clojure.core/contains? input "Description") (clojure.core/assoc :description (deser-address-book-description (input "Description")))))

(clojure.core/defn- deser-device-status-detail-code [input] (clojure.core/get {"DEVICE_SOFTWARE_UPDATE_NEEDED" :device-software-update-needed, "DEVICE_WAS_OFFLINE" :device-was-offline} input))

(clojure.core/defn- deser-device-status-detail [input] (clojure.core/cond-> {} (clojure.core/contains? input "Code") (clojure.core/assoc :code (deser-device-status-detail-code (input "Code")))))

(clojure.core/defn- deser-device-data-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-device-data coll))) input))

(clojure.core/defn- deser-room-skill-parameters [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-room-skill-parameter coll))) input))

(clojure.core/defn- deser-contact [input] (clojure.core/cond-> {} (clojure.core/contains? input "ContactArn") (clojure.core/assoc :contact-arn (deser-arn (input "ContactArn"))) (clojure.core/contains? input "DisplayName") (clojure.core/assoc :display-name (deser-contact-name (input "DisplayName"))) (clojure.core/contains? input "FirstName") (clojure.core/assoc :first-name (deser-contact-name (input "FirstName"))) (clojure.core/contains? input "LastName") (clojure.core/assoc :last-name (deser-contact-name (input "LastName"))) (clojure.core/contains? input "PhoneNumber") (clojure.core/assoc :phone-number (deser-e-164-phone-number (input "PhoneNumber")))))

(clojure.core/defn- deser-next-token [input] input)

(clojure.core/defn- deser-error-message [input] input)

(clojure.core/defn- deser-connection-status [input] (clojure.core/get {"ONLINE" :online, "OFFLINE" :offline} input))

(clojure.core/defn- deser-device-event [input] (clojure.core/cond-> {} (clojure.core/contains? input "Type") (clojure.core/assoc :type (deser-device-event-type (input "Type"))) (clojure.core/contains? input "Value") (clojure.core/assoc :value (deser-device-event-value (input "Value"))) (clojure.core/contains? input "Timestamp") (clojure.core/assoc :timestamp (deser-timestamp (input "Timestamp")))))

(clojure.core/defn- deser-address-book-name [input] input)

(clojure.core/defn- deser-skill-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-skill-summary coll))) input))

(clojure.core/defn- deser-skill-group-data-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-skill-group-data coll))) input))

(clojure.core/defn- deser-tag-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-tag coll))) input))

(clojure.core/defn- deser-timezone [input] input)

(clojure.core/defn- deser-skill-summary [input] (clojure.core/cond-> {} (clojure.core/contains? input "SkillId") (clojure.core/assoc :skill-id (deser-skill-id (input "SkillId"))) (clojure.core/contains? input "SkillName") (clojure.core/assoc :skill-name (deser-skill-name (input "SkillName"))) (clojure.core/contains? input "SupportsLinking") (clojure.core/assoc :supports-linking (deserboolean (input "SupportsLinking")))))

(clojure.core/defn- deser-device-data [input] (clojure.core/cond-> {} (clojure.core/contains? input "DeviceSerialNumber") (clojure.core/assoc :device-serial-number (deser-device-serial-number (input "DeviceSerialNumber"))) (clojure.core/contains? input "SoftwareVersion") (clojure.core/assoc :software-version (deser-software-version (input "SoftwareVersion"))) (clojure.core/contains? input "DeviceStatusInfo") (clojure.core/assoc :device-status-info (deser-device-status-info (input "DeviceStatusInfo"))) (clojure.core/contains? input "MacAddress") (clojure.core/assoc :mac-address (deser-mac-address (input "MacAddress"))) (clojure.core/contains? input "DeviceArn") (clojure.core/assoc :device-arn (deser-arn (input "DeviceArn"))) (clojure.core/contains? input "DeviceType") (clojure.core/assoc :device-type (deser-device-type (input "DeviceType"))) (clojure.core/contains? input "DeviceStatus") (clojure.core/assoc :device-status (deser-device-status (input "DeviceStatus"))) (clojure.core/contains? input "DeviceName") (clojure.core/assoc :device-name (deser-device-name (input "DeviceName"))) (clojure.core/contains? input "RoomArn") (clojure.core/assoc :room-arn (deser-arn (input "RoomArn"))) (clojure.core/contains? input "RoomName") (clojure.core/assoc :room-name (deser-room-name (input "RoomName")))))

(clojure.core/defn- deser-profile [input] (clojure.core/cond-> {} (clojure.core/contains? input "Address") (clojure.core/assoc :address (deser-address (input "Address"))) (clojure.core/contains? input "WakeWord") (clojure.core/assoc :wake-word (deser-wake-word (input "WakeWord"))) (clojure.core/contains? input "SetupModeDisabled") (clojure.core/assoc :setup-mode-disabled (deser-boolean (input "SetupModeDisabled"))) (clojure.core/contains? input "PSTNEnabled") (clojure.core/assoc :pstn-enabled (deser-boolean (input "PSTNEnabled"))) (clojure.core/contains? input "Timezone") (clojure.core/assoc :timezone (deser-timezone (input "Timezone"))) (clojure.core/contains? input "MaxVolumeLimit") (clojure.core/assoc :max-volume-limit (deser-max-volume-limit (input "MaxVolumeLimit"))) (clojure.core/contains? input "ProfileArn") (clojure.core/assoc :profile-arn (deser-arn (input "ProfileArn"))) (clojure.core/contains? input "TemperatureUnit") (clojure.core/assoc :temperature-unit (deser-temperature-unit (input "TemperatureUnit"))) (clojure.core/contains? input "DistanceUnit") (clojure.core/assoc :distance-unit (deser-distance-unit (input "DistanceUnit"))) (clojure.core/contains? input "ProfileName") (clojure.core/assoc :profile-name (deser-profile-name (input "ProfileName")))))

(clojure.core/defn- deseruser-first-name [input] input)

(clojure.core/defn- deser-tag-value [input] input)

(clojure.core/defn- deser-total-count [input] input)

(clojure.core/defn- deser-device-type [input] input)

(clojure.core/defn- deser-profile-data-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-profile-data coll))) input))

(clojure.core/defn- deser-max-volume-limit [input] input)

(clojure.core/defn- deser-device-status [input] (clojure.core/get {"READY" :ready, "PENDING" :pending, "WAS_OFFLINE" :was-offline, "DEREGISTERED" :deregistered} input))

(clojure.core/defn- deser-address-book [input] (clojure.core/cond-> {} (clojure.core/contains? input "AddressBookArn") (clojure.core/assoc :address-book-arn (deser-arn (input "AddressBookArn"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-address-book-name (input "Name"))) (clojure.core/contains? input "Description") (clojure.core/assoc :description (deser-address-book-description (input "Description")))))

(clojure.core/defn- deser-user-data-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-user-data coll))) input))

(clojure.core/defn- deser-room-description [input] input)

(clojure.core/defn- deser-room-skill-parameter-key [input] input)

(clojure.core/defn- deser-arn [input] input)

(clojure.core/defn- deseruser-last-name [input] input)

(clojure.core/defn- deser-device-name [input] input)

(clojure.core/defn- deser-temperature-unit [input] (clojure.core/get {"FAHRENHEIT" :fahrenheit, "CELSIUS" :celsius} input))

(clojure.core/defn- deser-timestamp [input] input)

(clojure.core/defn- deser-room-skill-parameter-value [input] input)

(clojure.core/defn- deser-contact-data [input] (clojure.core/cond-> {} (clojure.core/contains? input "ContactArn") (clojure.core/assoc :contact-arn (deser-arn (input "ContactArn"))) (clojure.core/contains? input "DisplayName") (clojure.core/assoc :display-name (deser-contact-name (input "DisplayName"))) (clojure.core/contains? input "FirstName") (clojure.core/assoc :first-name (deser-contact-name (input "FirstName"))) (clojure.core/contains? input "LastName") (clojure.core/assoc :last-name (deser-contact-name (input "LastName"))) (clojure.core/contains? input "PhoneNumber") (clojure.core/assoc :phone-number (deser-e-164-phone-number (input "PhoneNumber")))))

(clojure.core/defn- deser-distance-unit [input] (clojure.core/get {"METRIC" :metric, "IMPERIAL" :imperial} input))

(clojure.core/defn- deser-tag [input] (clojure.core/cond-> {} (clojure.core/contains? input "Key") (clojure.core/assoc :key (deser-tag-key (input "Key"))) (clojure.core/contains? input "Value") (clojure.core/assoc :value (deser-tag-value (input "Value")))))

(clojure.core/defn- deser-room-data [input] (clojure.core/cond-> {} (clojure.core/contains? input "RoomArn") (clojure.core/assoc :room-arn (deser-arn (input "RoomArn"))) (clojure.core/contains? input "RoomName") (clojure.core/assoc :room-name (deser-room-name (input "RoomName"))) (clojure.core/contains? input "Description") (clojure.core/assoc :description (deser-room-description (input "Description"))) (clojure.core/contains? input "ProviderCalendarId") (clojure.core/assoc :provider-calendar-id (deser-provider-calendar-id (input "ProviderCalendarId"))) (clojure.core/contains? input "ProfileArn") (clojure.core/assoc :profile-arn (deser-arn (input "ProfileArn"))) (clojure.core/contains? input "ProfileName") (clojure.core/assoc :profile-name (deser-profile-name (input "ProfileName")))))

(clojure.core/defn- deser-device-event-value [input] input)

(clojure.core/defn- deser-device-event-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-device-event coll))) input))

(clojure.core/defn- deser-device-event-type [input] (clojure.core/get {"CONNECTION_STATUS" :connection-status, "DEVICE_STATUS" :device-status} input))

(clojure.core/defn- deser-e-164-phone-number [input] input)

(clojure.core/defn- deser-contact-data-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-contact-data coll))) input))

(clojure.core/defn- deser-skill-group-description [input] input)

(clojure.core/defn- deser-room-name [input] input)

(clojure.core/defn- deser-device [input] (clojure.core/cond-> {} (clojure.core/contains? input "DeviceSerialNumber") (clojure.core/assoc :device-serial-number (deser-device-serial-number (input "DeviceSerialNumber"))) (clojure.core/contains? input "SoftwareVersion") (clojure.core/assoc :software-version (deser-software-version (input "SoftwareVersion"))) (clojure.core/contains? input "DeviceStatusInfo") (clojure.core/assoc :device-status-info (deser-device-status-info (input "DeviceStatusInfo"))) (clojure.core/contains? input "MacAddress") (clojure.core/assoc :mac-address (deser-mac-address (input "MacAddress"))) (clojure.core/contains? input "DeviceArn") (clojure.core/assoc :device-arn (deser-arn (input "DeviceArn"))) (clojure.core/contains? input "DeviceType") (clojure.core/assoc :device-type (deser-device-type (input "DeviceType"))) (clojure.core/contains? input "DeviceStatus") (clojure.core/assoc :device-status (deser-device-status (input "DeviceStatus"))) (clojure.core/contains? input "DeviceName") (clojure.core/assoc :device-name (deser-device-name (input "DeviceName"))) (clojure.core/contains? input "RoomArn") (clojure.core/assoc :room-arn (deser-arn (input "RoomArn")))))

(clojure.core/defn- deser-user-data [input] (clojure.core/cond-> {} (clojure.core/contains? input "UserArn") (clojure.core/assoc :user-arn (deser-arn (input "UserArn"))) (clojure.core/contains? input "FirstName") (clojure.core/assoc :first-name (deseruser-first-name (input "FirstName"))) (clojure.core/contains? input "LastName") (clojure.core/assoc :last-name (deseruser-last-name (input "LastName"))) (clojure.core/contains? input "Email") (clojure.core/assoc :email (deser-email (input "Email"))) (clojure.core/contains? input "EnrollmentStatus") (clojure.core/assoc :enrollment-status (deser-enrollment-status (input "EnrollmentStatus"))) (clojure.core/contains? input "EnrollmentId") (clojure.core/assoc :enrollment-id (deser-enrollment-id (input "EnrollmentId")))))

(clojure.core/defn- deser-skill-id [input] input)

(clojure.core/defn- deser-profile-name [input] input)

(clojure.core/defn- deser-skill-group-data [input] (clojure.core/cond-> {} (clojure.core/contains? input "SkillGroupArn") (clojure.core/assoc :skill-group-arn (deser-arn (input "SkillGroupArn"))) (clojure.core/contains? input "SkillGroupName") (clojure.core/assoc :skill-group-name (deser-skill-group-name (input "SkillGroupName"))) (clojure.core/contains? input "Description") (clojure.core/assoc :description (deser-skill-group-description (input "Description")))))

(clojure.core/defn- deser-enrollment-status [input] (clojure.core/get {"INITIALIZED" :initialized, "PENDING" :pending, "REGISTERED" :registered, "DISASSOCIATING" :disassociating, "DEREGISTERING" :deregistering} input))

(clojure.core/defn- deser-boolean [input] input)

(clojure.core/defn- deser-room-data-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-room-data coll))) input))

(clojure.core/defn- deser-create-user-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "UserArn") (clojure.core/assoc :user-arn (deser-arn (input "UserArn")))))

(clojure.core/defn- deser-update-contact-response [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-create-address-book-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "AddressBookArn") (clojure.core/assoc :address-book-arn (deser-arn (input "AddressBookArn")))))

(clojure.core/defn- deser-associate-contact-with-address-book-response [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-already-exists-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "Message") (clojure.core/assoc :message (deser-error-message (input "Message")))))

(clojure.core/defn- deser-associate-device-with-room-response [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-name-in-use-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "Message") (clojure.core/assoc :message (deser-error-message (input "Message")))))

(clojure.core/defn- deser-create-contact-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "ContactArn") (clojure.core/assoc :contact-arn (deser-arn (input "ContactArn")))))

(clojure.core/defn- deser-get-address-book-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "AddressBook") (clojure.core/assoc :address-book (deser-address-book (input "AddressBook")))))

(clojure.core/defn- deser-delete-profile-response [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-delete-room-response [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-get-device-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "Device") (clojure.core/assoc :device (deser-device (input "Device")))))

(clojure.core/defn- deser-search-users-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "Users") (clojure.core/assoc :users (deser-user-data-list (input "Users"))) (clojure.core/contains? input "NextToken") (clojure.core/assoc :next-token (deser-next-token (input "NextToken"))) (clojure.core/contains? input "TotalCount") (clojure.core/assoc :total-count (deser-total-count (input "TotalCount")))))

(clojure.core/defn- deser-list-tags-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "Tags") (clojure.core/assoc :tags (deser-tag-list (input "Tags"))) (clojure.core/contains? input "NextToken") (clojure.core/assoc :next-token (deser-next-token (input "NextToken")))))

(clojure.core/defn- deser-search-contacts-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "Contacts") (clojure.core/assoc :contacts (deser-contact-data-list (input "Contacts"))) (clojure.core/contains? input "NextToken") (clojure.core/assoc :next-token (deser-next-token (input "NextToken"))) (clojure.core/contains? input "TotalCount") (clojure.core/assoc :total-count (deser-total-count (input "TotalCount")))))

(clojure.core/defn- deser-search-address-books-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "AddressBooks") (clojure.core/assoc :address-books (deser-address-book-data-list (input "AddressBooks"))) (clojure.core/contains? input "NextToken") (clojure.core/assoc :next-token (deser-next-token (input "NextToken"))) (clojure.core/contains? input "TotalCount") (clojure.core/assoc :total-count (deser-total-count (input "TotalCount")))))

(clojure.core/defn- deser-resource-in-use-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "Message") (clojure.core/assoc :message (deser-error-message (input "Message"))) (clojure.core/contains? input "ClientRequestToken") (clojure.core/assoc :client-request-token (deser-client-request-token (input "ClientRequestToken")))))

(clojure.core/defn- deser-search-profiles-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "Profiles") (clojure.core/assoc :profiles (deser-profile-data-list (input "Profiles"))) (clojure.core/contains? input "NextToken") (clojure.core/assoc :next-token (deser-next-token (input "NextToken"))) (clojure.core/contains? input "TotalCount") (clojure.core/assoc :total-count (deser-total-count (input "TotalCount")))))

(clojure.core/defn- deser-search-devices-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "Devices") (clojure.core/assoc :devices (deser-device-data-list (input "Devices"))) (clojure.core/contains? input "NextToken") (clojure.core/assoc :next-token (deser-next-token (input "NextToken"))) (clojure.core/contains? input "TotalCount") (clojure.core/assoc :total-count (deser-total-count (input "TotalCount")))))

(clojure.core/defn- deser-limit-exceeded-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "Message") (clojure.core/assoc :message (deser-error-message (input "Message")))))

(clojure.core/defn- deser-resolve-room-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "RoomArn") (clojure.core/assoc :room-arn (deser-arn (input "RoomArn"))) (clojure.core/contains? input "RoomName") (clojure.core/assoc :room-name (deser-room-name (input "RoomName"))) (clojure.core/contains? input "RoomSkillParameters") (clojure.core/assoc :room-skill-parameters (deser-room-skill-parameters (input "RoomSkillParameters")))))

(clojure.core/defn- deser-invalid-user-status-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "Message") (clojure.core/assoc :message (deser-error-message (input "Message")))))

(clojure.core/defn- deser-update-profile-response [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-disassociate-contact-from-address-book-response [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-update-device-response [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-disassociate-device-from-room-response [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-put-room-skill-parameter-response [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-update-skill-group-response [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-tag-resource-response [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-delete-user-response [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-send-invitation-response [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-get-room-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "Room") (clojure.core/assoc :room (deser-room (input "Room")))))

(clojure.core/defn- deser-disassociate-skill-group-from-room-response [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-revoke-invitation-response [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-device-not-registered-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "Message") (clojure.core/assoc :message (deser-error-message (input "Message")))))

(clojure.core/defn- deser-not-found-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "Message") (clojure.core/assoc :message (deser-error-message (input "Message")))))

(clojure.core/defn- deser-get-contact-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "Contact") (clojure.core/assoc :contact (deser-contact (input "Contact")))))

(clojure.core/defn- deser-delete-address-book-response [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-search-skill-groups-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "SkillGroups") (clojure.core/assoc :skill-groups (deser-skill-group-data-list (input "SkillGroups"))) (clojure.core/contains? input "NextToken") (clojure.core/assoc :next-token (deser-next-token (input "NextToken"))) (clojure.core/contains? input "TotalCount") (clojure.core/assoc :total-count (deser-total-count (input "TotalCount")))))

(clojure.core/defn- deser-update-room-response [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-update-address-book-response [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-create-skill-group-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "SkillGroupArn") (clojure.core/assoc :skill-group-arn (deser-arn (input "SkillGroupArn")))))

(clojure.core/defn- deser-get-room-skill-parameter-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "RoomSkillParameter") (clojure.core/assoc :room-skill-parameter (deser-room-skill-parameter (input "RoomSkillParameter")))))

(clojure.core/defn- deser-list-device-events-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "DeviceEvents") (clojure.core/assoc :device-events (deser-device-event-list (input "DeviceEvents"))) (clojure.core/contains? input "NextToken") (clojure.core/assoc :next-token (deser-next-token (input "NextToken")))))

(clojure.core/defn- deser-create-profile-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "ProfileArn") (clojure.core/assoc :profile-arn (deser-arn (input "ProfileArn")))))

(clojure.core/defn- deser-start-device-sync-response [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-delete-contact-response [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-delete-room-skill-parameter-response [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-create-room-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "RoomArn") (clojure.core/assoc :room-arn (deser-arn (input "RoomArn")))))

(clojure.core/defn- deser-get-skill-group-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "SkillGroup") (clojure.core/assoc :skill-group (deser-skill-group (input "SkillGroup")))))

(clojure.core/defn- deser-get-profile-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "Profile") (clojure.core/assoc :profile (deser-profile (input "Profile")))))

(clojure.core/defn- deser-list-skills-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "SkillSummaries") (clojure.core/assoc :skill-summaries (deser-skill-summary-list (input "SkillSummaries"))) (clojure.core/contains? input "NextToken") (clojure.core/assoc :next-token (deser-next-token (input "NextToken")))))

(clojure.core/defn- deser-delete-skill-group-response [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-associate-skill-group-with-room-response [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-untag-resource-response [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-search-rooms-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "Rooms") (clojure.core/assoc :rooms (deser-room-data-list (input "Rooms"))) (clojure.core/contains? input "NextToken") (clojure.core/assoc :next-token (deser-next-token (input "NextToken"))) (clojure.core/contains? input "TotalCount") (clojure.core/assoc :total-count (deser-total-count (input "TotalCount")))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/skill-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 100)) (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"[\u0009\u000A\u000D\u0020-\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/sort-list (clojure.spec.alpha/coll-of :portkey.aws.alexaforbusiness/sort :max-count 25))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/address (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 500))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.sort/key (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/sort-key))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.sort/value (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/sort-value))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/sort (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness.sort/key :portkey.aws.alexaforbusiness.sort/value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.create-user-response/user-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/create-user-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.create-user-response/user-arn]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/update-contact-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/filter-value-list (clojure.spec.alpha/coll-of :portkey.aws.alexaforbusiness/filter-value :max-count 5))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.create-address-book-response/address-book-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/create-address-book-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.create-address-book-response/address-book-arn]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/sort-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 500))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/associate-contact-with-address-book-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.filter/key (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/filter-key))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.filter/values (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/filter-value-list))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/filter (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness.filter/key :portkey.aws.alexaforbusiness.filter/values] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/device-serial-number (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"[a-zA-Z0-9]{1,200}" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.already-exists-exception/message (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/error-message))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/already-exists-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.already-exists-exception/message]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/client-request-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 10 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 150)) (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"[a-zA-Z0-9][a-zA-Z0-9_-]*" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/associate-device-with-room-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.update-profile-request/setup-mode-disabled (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/boolean))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.update-profile-request/pstn-enabled (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/boolean))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.update-profile-request/profile-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/update-profile-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness/address :portkey.aws.alexaforbusiness/wake-word :portkey.aws.alexaforbusiness.update-profile-request/setup-mode-disabled :portkey.aws.alexaforbusiness.update-profile-request/pstn-enabled :portkey.aws.alexaforbusiness/timezone :portkey.aws.alexaforbusiness/max-volume-limit :portkey.aws.alexaforbusiness.update-profile-request/profile-arn :portkey.aws.alexaforbusiness/temperature-unit :portkey.aws.alexaforbusiness/distance-unit :portkey.aws.alexaforbusiness/profile-name]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/provider-calendar-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 0 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 100))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/device-status-details (clojure.spec.alpha/coll-of :portkey.aws.alexaforbusiness/device-status-detail))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.disassociate-device-from-room-request/device-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/disassociate-device-from-room-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.disassociate-device-from-room-request/device-arn]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.name-in-use-exception/message (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/error-message))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/name-in-use-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.name-in-use-exception/message]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/software-version (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/email (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 128)) (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"([0-9a-zA-Z]([+-.\w]*[0-9a-zA-Z])*@([0-9a-zA-Z][-\w]*[0-9a-zA-Z]\.)+[a-zA-Z]{2,9})" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.create-contact-response/contact-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/create-contact-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.create-contact-response/contact-arn]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/device-status-info (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness/device-status-details :portkey.aws.alexaforbusiness/connection-status]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.delete-room-request/room-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/delete-room-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.delete-room-request/room-arn]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.get-profile-request/profile-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/get-profile-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.get-profile-request/profile-arn]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/get-address-book-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness/address-book]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/delete-profile-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.list-device-events-request/device-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.list-device-events-request/event-type (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/device-event-type))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/list-device-events-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness.list-device-events-request/device-arn] :opt-un [:portkey.aws.alexaforbusiness.list-device-events-request/event-type :portkey.aws.alexaforbusiness/next-token :portkey.aws.alexaforbusiness/max-results]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/enrollment-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 0 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/delete-room-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.search-devices-request/filters (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/filter-list))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.search-devices-request/sort-criteria (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/sort-list))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/search-devices-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness/next-token :portkey.aws.alexaforbusiness/max-results :portkey.aws.alexaforbusiness.search-devices-request/filters :portkey.aws.alexaforbusiness.search-devices-request/sort-criteria]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/get-device-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness/device]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.room/room-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.room/description (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/room-description))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.room/profile-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/room (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.room/room-arn :portkey.aws.alexaforbusiness/room-name :portkey.aws.alexaforbusiness.room/description :portkey.aws.alexaforbusiness/provider-calendar-id :portkey.aws.alexaforbusiness.room/profile-arn]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.search-users-response/users (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/user-data-list))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/search-users-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.search-users-response/users :portkey.aws.alexaforbusiness/next-token :portkey.aws.alexaforbusiness/total-count]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.search-address-books-request/filters (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/filter-list))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.search-address-books-request/sort-criteria (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/sort-list))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/search-address-books-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.search-address-books-request/filters :portkey.aws.alexaforbusiness.search-address-books-request/sort-criteria :portkey.aws.alexaforbusiness/next-token :portkey.aws.alexaforbusiness/max-results]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.get-address-book-request/address-book-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/get-address-book-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness.get-address-book-request/address-book-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/wake-word #{:computer :amazon :alexa "COMPUTER" "ECHO" :echo "ALEXA" "AMAZON"})

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.disassociate-skill-group-from-room-request/skill-group-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.disassociate-skill-group-from-room-request/room-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/disassociate-skill-group-from-room-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.disassociate-skill-group-from-room-request/skill-group-arn :portkey.aws.alexaforbusiness.disassociate-skill-group-from-room-request/room-arn]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.profile-data/profile-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/profile-data (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.profile-data/profile-arn :portkey.aws.alexaforbusiness/profile-name :portkey.aws.alexaforbusiness/address :portkey.aws.alexaforbusiness/timezone :portkey.aws.alexaforbusiness/distance-unit :portkey.aws.alexaforbusiness/temperature-unit :portkey.aws.alexaforbusiness/wake-word]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/user-user-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 128)) (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"[a-zA-Z0-9@_+.-]*" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/contact-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 100)) (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"[\u0009\u000A\u000D\u0020-\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.search-rooms-request/filters (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/filter-list))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.search-rooms-request/sort-criteria (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/sort-list))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/search-rooms-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness/next-token :portkey.aws.alexaforbusiness/max-results :portkey.aws.alexaforbusiness.search-rooms-request/filters :portkey.aws.alexaforbusiness.search-rooms-request/sort-criteria]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/address-book-data-list (clojure.spec.alpha/coll-of :portkey.aws.alexaforbusiness/address-book-data))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/address-book-description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 200)) (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"[\u0009\u000A\u000D\u0020-\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.list-tags-response/tags (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/tag-list))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/list-tags-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.list-tags-response/tags :portkey.aws.alexaforbusiness/next-token]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/feature #{"NOTIFICATIONS" :lists "SKILLS" "LISTS" :bluetooth "BLUETOOTH" :all :volume :notifications :skills "VOLUME" "ALL"})

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/mac-address (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/user-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"amzn1\.[A-Za-z0-9+-\/=.]{1,300}" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.search-contacts-response/contacts (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/contact-data-list))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/search-contacts-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.search-contacts-response/contacts :portkey.aws.alexaforbusiness/next-token :portkey.aws.alexaforbusiness/total-count]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.skill-group/skill-group-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.skill-group/description (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/skill-group-description))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/skill-group (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.skill-group/skill-group-arn :portkey.aws.alexaforbusiness/skill-group-name :portkey.aws.alexaforbusiness.skill-group/description]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 128)) (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.get-device-request/device-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/get-device-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.get-device-request/device-arn]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.update-device-request/device-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/update-device-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.update-device-request/device-arn :portkey.aws.alexaforbusiness/device-name]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.search-users-request/filters (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/filter-list))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.search-users-request/sort-criteria (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/sort-list))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/search-users-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness/next-token :portkey.aws.alexaforbusiness/max-results :portkey.aws.alexaforbusiness.search-users-request/filters :portkey.aws.alexaforbusiness.search-users-request/sort-criteria]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.search-address-books-response/address-books (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/address-book-data-list))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/search-address-books-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.search-address-books-response/address-books :portkey.aws.alexaforbusiness/next-token :portkey.aws.alexaforbusiness/total-count]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.resource-in-use-exception/message (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/error-message))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/resource-in-use-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.resource-in-use-exception/message :portkey.aws.alexaforbusiness/client-request-token]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/skill-group-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 100)) (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"[\u0009\u000A\u000D\u0020-\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.delete-room-skill-parameter-request/room-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.delete-room-skill-parameter-request/parameter-key (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/room-skill-parameter-key))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/delete-room-skill-parameter-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness/skill-id :portkey.aws.alexaforbusiness.delete-room-skill-parameter-request/parameter-key] :opt-un [:portkey.aws.alexaforbusiness.delete-room-skill-parameter-request/room-arn]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.search-profiles-response/profiles (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/profile-data-list))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/search-profiles-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.search-profiles-response/profiles :portkey.aws.alexaforbusiness/next-token :portkey.aws.alexaforbusiness/total-count]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.search-devices-response/devices (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/device-data-list))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/search-devices-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.search-devices-response/devices :portkey.aws.alexaforbusiness/next-token :portkey.aws.alexaforbusiness/total-count]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/error-message))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.room-skill-parameter/parameter-key (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/room-skill-parameter-key))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.room-skill-parameter/parameter-value (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/room-skill-parameter-value))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/room-skill-parameter (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness.room-skill-parameter/parameter-key :portkey.aws.alexaforbusiness.room-skill-parameter/parameter-value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.revoke-invitation-request/user-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/revoke-invitation-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.revoke-invitation-request/user-arn :portkey.aws.alexaforbusiness/enrollment-id]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.address-book-data/address-book-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.address-book-data/name (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/address-book-name))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.address-book-data/description (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/address-book-description))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/address-book-data (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.address-book-data/address-book-arn :portkey.aws.alexaforbusiness.address-book-data/name :portkey.aws.alexaforbusiness.address-book-data/description]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/device-status-detail-code #{"DEVICE_WAS_OFFLINE" :device-was-offline "DEVICE_SOFTWARE_UPDATE_NEEDED" :device-software-update-needed})

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.resolve-room-response/room-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/resolve-room-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.resolve-room-response/room-arn :portkey.aws.alexaforbusiness/room-name :portkey.aws.alexaforbusiness/room-skill-parameters]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.device-status-detail/code (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/device-status-detail-code))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/device-status-detail (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.device-status-detail/code]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.invalid-user-status-exception/message (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/error-message))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/invalid-user-status-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.invalid-user-status-exception/message]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/device-data-list (clojure.spec.alpha/coll-of :portkey.aws.alexaforbusiness/device-data))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/update-profile-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.associate-skill-group-with-room-request/skill-group-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.associate-skill-group-with-room-request/room-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/associate-skill-group-with-room-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.associate-skill-group-with-room-request/skill-group-arn :portkey.aws.alexaforbusiness.associate-skill-group-with-room-request/room-arn]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/disassociate-contact-from-address-book-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.get-skill-group-request/skill-group-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/get-skill-group-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.get-skill-group-request/skill-group-arn]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/room-skill-parameters (clojure.spec.alpha/coll-of :portkey.aws.alexaforbusiness/room-skill-parameter))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/update-device-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/disassociate-device-from-room-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/put-room-skill-parameter-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/update-skill-group-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.contact/contact-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.contact/display-name (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/contact-name))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.contact/first-name (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/contact-name))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.contact/last-name (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/contact-name))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.contact/phone-number (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/e-164-phone-number))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/contact (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.contact/contact-arn :portkey.aws.alexaforbusiness.contact/display-name :portkey.aws.alexaforbusiness.contact/first-name :portkey.aws.alexaforbusiness.contact/last-name :portkey.aws.alexaforbusiness.contact/phone-number]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/next-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 1000))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/tag-resource-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/delete-user-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/connection-status #{:offline :online "OFFLINE" "ONLINE"})

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.associate-contact-with-address-book-request/contact-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.associate-contact-with-address-book-request/address-book-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/associate-contact-with-address-book-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness.associate-contact-with-address-book-request/contact-arn :portkey.aws.alexaforbusiness.associate-contact-with-address-book-request/address-book-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.device-event/type (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/device-event-type))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.device-event/value (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/device-event-value))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/device-event (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.device-event/type :portkey.aws.alexaforbusiness.device-event/value :portkey.aws.alexaforbusiness/timestamp]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/address-book-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 100)) (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"[\u0009\u000A\u000D\u0020-\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.create-profile-request/setup-mode-disabled (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/boolean))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.create-profile-request/pstn-enabled (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/boolean))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/create-profile-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness/profile-name :portkey.aws.alexaforbusiness/timezone :portkey.aws.alexaforbusiness/address :portkey.aws.alexaforbusiness/distance-unit :portkey.aws.alexaforbusiness/temperature-unit :portkey.aws.alexaforbusiness/wake-word] :opt-un [:portkey.aws.alexaforbusiness/client-request-token :portkey.aws.alexaforbusiness.create-profile-request/setup-mode-disabled :portkey.aws.alexaforbusiness.create-profile-request/pstn-enabled :portkey.aws.alexaforbusiness/max-volume-limit]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/resolve-room-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness/user-id :portkey.aws.alexaforbusiness/skill-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.delete-address-book-request/address-book-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/delete-address-book-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness.delete-address-book-request/address-book-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.create-contact-request/display-name (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/contact-name))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.create-contact-request/first-name (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/contact-name))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.create-contact-request/last-name (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/contact-name))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.create-contact-request/phone-number (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/e-164-phone-number))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/create-contact-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness.create-contact-request/first-name :portkey.aws.alexaforbusiness.create-contact-request/phone-number] :opt-un [:portkey.aws.alexaforbusiness.create-contact-request/display-name :portkey.aws.alexaforbusiness.create-contact-request/last-name :portkey.aws.alexaforbusiness/client-request-token]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.tag-resource-request/tags (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/tag-list))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/tag-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness/arn :portkey.aws.alexaforbusiness.tag-resource-request/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/filter-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 500))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/send-invitation-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/skill-summary-list (clojure.spec.alpha/coll-of :portkey.aws.alexaforbusiness/skill-summary))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/skill-group-data-list (clojure.spec.alpha/coll-of :portkey.aws.alexaforbusiness/skill-group-data))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/tag-list (clojure.spec.alpha/coll-of :portkey.aws.alexaforbusiness/tag))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.delete-skill-group-request/skill-group-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/delete-skill-group-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.delete-skill-group-request/skill-group-arn]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.search-contacts-request/filters (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/filter-list))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.search-contacts-request/sort-criteria (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/sort-list))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/search-contacts-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.search-contacts-request/filters :portkey.aws.alexaforbusiness.search-contacts-request/sort-criteria :portkey.aws.alexaforbusiness/next-token :portkey.aws.alexaforbusiness/max-results]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.get-room-request/room-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/get-room-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.get-room-request/room-arn]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/get-room-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness/room]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/timezone (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 100))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/tag-key-list (clojure.spec.alpha/coll-of :portkey.aws.alexaforbusiness/tag-key))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/disassociate-skill-group-from-room-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.skill-summary/supports-linking (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/boolean))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/skill-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness/skill-id :portkey.aws.alexaforbusiness/skill-name :portkey.aws.alexaforbusiness.skill-summary/supports-linking]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/revoke-invitation-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.device-data/device-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.device-data/room-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/device-data (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness/device-serial-number :portkey.aws.alexaforbusiness/software-version :portkey.aws.alexaforbusiness/device-status-info :portkey.aws.alexaforbusiness/mac-address :portkey.aws.alexaforbusiness.device-data/device-arn :portkey.aws.alexaforbusiness/device-type :portkey.aws.alexaforbusiness/device-status :portkey.aws.alexaforbusiness/device-name :portkey.aws.alexaforbusiness.device-data/room-arn :portkey.aws.alexaforbusiness/room-name]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.device-not-registered-exception/message (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/error-message))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/device-not-registered-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.device-not-registered-exception/message]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.profile/setup-mode-disabled (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/boolean))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.profile/pstn-enabled (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/boolean))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.profile/profile-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/profile (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness/address :portkey.aws.alexaforbusiness/wake-word :portkey.aws.alexaforbusiness.profile/setup-mode-disabled :portkey.aws.alexaforbusiness.profile/pstn-enabled :portkey.aws.alexaforbusiness/timezone :portkey.aws.alexaforbusiness/max-volume-limit :portkey.aws.alexaforbusiness.profile/profile-arn :portkey.aws.alexaforbusiness/temperature-unit :portkey.aws.alexaforbusiness/distance-unit :portkey.aws.alexaforbusiness/profile-name]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/user-first-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 0 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 30)) (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"([A-Za-z\-' 0-9._]|\p{IsLetter})*" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.search-skill-groups-request/filters (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/filter-list))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.search-skill-groups-request/sort-criteria (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/sort-list))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/search-skill-groups-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness/next-token :portkey.aws.alexaforbusiness/max-results :portkey.aws.alexaforbusiness.search-skill-groups-request/filters :portkey.aws.alexaforbusiness.search-skill-groups-request/sort-criteria]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 0 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 256)) (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/total-count clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/device-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"[a-zA-Z0-9]{1,200}" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.get-room-skill-parameter-request/room-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.get-room-skill-parameter-request/parameter-key (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/room-skill-parameter-key))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/get-room-skill-parameter-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness/skill-id :portkey.aws.alexaforbusiness.get-room-skill-parameter-request/parameter-key] :opt-un [:portkey.aws.alexaforbusiness.get-room-skill-parameter-request/room-arn]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/profile-data-list (clojure.spec.alpha/coll-of :portkey.aws.alexaforbusiness/profile-data))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/max-volume-limit clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.create-address-book-request/name (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/address-book-name))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.create-address-book-request/description (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/address-book-description))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/create-address-book-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness.create-address-book-request/name] :opt-un [:portkey.aws.alexaforbusiness.create-address-book-request/description :portkey.aws.alexaforbusiness/client-request-token]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/device-status #{:ready :pending "READY" "PENDING" "WAS_OFFLINE" :deregistered "DEREGISTERED" :was-offline})

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.not-found-exception/message (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/error-message))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/get-contact-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness/contact]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.start-device-sync-request/room-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.start-device-sync-request/device-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/start-device-sync-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness/features] :opt-un [:portkey.aws.alexaforbusiness.start-device-sync-request/room-arn :portkey.aws.alexaforbusiness.start-device-sync-request/device-arn]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.address-book/address-book-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.address-book/name (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/address-book-name))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.address-book/description (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/address-book-description))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/address-book (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.address-book/address-book-arn :portkey.aws.alexaforbusiness.address-book/name :portkey.aws.alexaforbusiness.address-book/description]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/delete-address-book-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/sort-value #{:desc "DESC" :asc "ASC"})

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/user-data-list (clojure.spec.alpha/coll-of :portkey.aws.alexaforbusiness/user-data))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.search-skill-groups-response/skill-groups (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/skill-group-data-list))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/search-skill-groups-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.search-skill-groups-response/skill-groups :portkey.aws.alexaforbusiness/next-token :portkey.aws.alexaforbusiness/total-count]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/update-room-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/update-address-book-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/room-description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 200)) (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"[\u0009\u000A\u000D\u0020-\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.create-skill-group-response/skill-group-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/create-skill-group-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.create-skill-group-response/skill-group-arn]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/room-skill-parameter-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/get-room-skill-parameter-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness/room-skill-parameter]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.list-skills-request/skill-group-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.list-skills-request/max-results (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/skill-list-max-results))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/list-skills-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.list-skills-request/skill-group-arn :portkey.aws.alexaforbusiness/next-token :portkey.aws.alexaforbusiness.list-skills-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.list-device-events-response/device-events (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/device-event-list))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/list-device-events-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.list-device-events-response/device-events :portkey.aws.alexaforbusiness/next-token]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:[^/].{0,1023}" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.update-address-book-request/address-book-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.update-address-book-request/name (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/address-book-name))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.update-address-book-request/description (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/address-book-description))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/update-address-book-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness.update-address-book-request/address-book-arn] :opt-un [:portkey.aws.alexaforbusiness.update-address-book-request/name :portkey.aws.alexaforbusiness.update-address-book-request/description]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.create-profile-response/profile-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/create-profile-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.create-profile-response/profile-arn]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/skill-list-max-results (clojure.spec.alpha/int-in 1 10))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.create-user-request/user-id (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/user-user-id))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.create-user-request/first-name (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/user-first-name))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.create-user-request/last-name (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/user-last-name))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.create-user-request/tags (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/tag-list))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/create-user-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness.create-user-request/user-id] :opt-un [:portkey.aws.alexaforbusiness.create-user-request/first-name :portkey.aws.alexaforbusiness.create-user-request/last-name :portkey.aws.alexaforbusiness/email :portkey.aws.alexaforbusiness/client-request-token :portkey.aws.alexaforbusiness.create-user-request/tags]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/start-device-sync-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/user-last-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 0 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 30)) (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"([A-Za-z\-' 0-9._]|\p{IsLetter})*" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.disassociate-contact-from-address-book-request/contact-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.disassociate-contact-from-address-book-request/address-book-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/disassociate-contact-from-address-book-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness.disassociate-contact-from-address-book-request/contact-arn :portkey.aws.alexaforbusiness.disassociate-contact-from-address-book-request/address-book-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/delete-contact-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.search-profiles-request/filters (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/filter-list))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.search-profiles-request/sort-criteria (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/sort-list))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/search-profiles-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness/next-token :portkey.aws.alexaforbusiness/max-results :portkey.aws.alexaforbusiness.search-profiles-request/filters :portkey.aws.alexaforbusiness.search-profiles-request/sort-criteria]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.create-skill-group-request/description (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/skill-group-description))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/create-skill-group-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness/skill-group-name] :opt-un [:portkey.aws.alexaforbusiness.create-skill-group-request/description :portkey.aws.alexaforbusiness/client-request-token]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/device-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 2 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 100)) (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"[\u0009\u000A\u000D\u0020-\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.update-contact-request/contact-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.update-contact-request/display-name (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/contact-name))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.update-contact-request/first-name (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/contact-name))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.update-contact-request/last-name (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/contact-name))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.update-contact-request/phone-number (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/e-164-phone-number))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/update-contact-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness.update-contact-request/contact-arn] :opt-un [:portkey.aws.alexaforbusiness.update-contact-request/display-name :portkey.aws.alexaforbusiness.update-contact-request/first-name :portkey.aws.alexaforbusiness.update-contact-request/last-name :portkey.aws.alexaforbusiness.update-contact-request/phone-number]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/delete-room-skill-parameter-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/temperature-unit #{:fahrenheit "CELSIUS" :celsius "FAHRENHEIT"})

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.create-room-response/room-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/create-room-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.create-room-response/room-arn]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/room-skill-parameter-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 512))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.contact-data/contact-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.contact-data/display-name (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/contact-name))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.contact-data/first-name (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/contact-name))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.contact-data/last-name (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/contact-name))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.contact-data/phone-number (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/e-164-phone-number))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/contact-data (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.contact-data/contact-arn :portkey.aws.alexaforbusiness.contact-data/display-name :portkey.aws.alexaforbusiness.contact-data/first-name :portkey.aws.alexaforbusiness.contact-data/last-name :portkey.aws.alexaforbusiness.contact-data/phone-number]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.update-room-request/room-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.update-room-request/description (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/room-description))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.update-room-request/profile-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/update-room-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.update-room-request/room-arn :portkey.aws.alexaforbusiness/room-name :portkey.aws.alexaforbusiness.update-room-request/description :portkey.aws.alexaforbusiness/provider-calendar-id :portkey.aws.alexaforbusiness.update-room-request/profile-arn]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/get-skill-group-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness/skill-group]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/get-profile-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness/profile]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.delete-user-request/user-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/delete-user-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness/enrollment-id] :opt-un [:portkey.aws.alexaforbusiness.delete-user-request/user-arn]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/distance-unit #{"IMPERIAL" :imperial :metric "METRIC"})

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/max-results (clojure.spec.alpha/int-in 1 50))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.tag/key (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/tag-key))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.tag/value (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/tag-value))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/tag (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.tag/key :portkey.aws.alexaforbusiness.tag/value]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.list-skills-response/skill-summaries (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/skill-summary-list))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/list-skills-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.list-skills-response/skill-summaries :portkey.aws.alexaforbusiness/next-token]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.create-room-request/description (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/room-description))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.create-room-request/profile-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.create-room-request/tags (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/tag-list))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/create-room-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness/room-name] :opt-un [:portkey.aws.alexaforbusiness.create-room-request/description :portkey.aws.alexaforbusiness.create-room-request/profile-arn :portkey.aws.alexaforbusiness/provider-calendar-id :portkey.aws.alexaforbusiness/client-request-token :portkey.aws.alexaforbusiness.create-room-request/tags]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.room-data/room-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.room-data/description (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/room-description))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.room-data/profile-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/room-data (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.room-data/room-arn :portkey.aws.alexaforbusiness/room-name :portkey.aws.alexaforbusiness.room-data/description :portkey.aws.alexaforbusiness/provider-calendar-id :portkey.aws.alexaforbusiness.room-data/profile-arn :portkey.aws.alexaforbusiness/profile-name]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/delete-skill-group-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/device-event-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.send-invitation-request/user-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/send-invitation-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.send-invitation-request/user-arn]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/device-event-list (clojure.spec.alpha/coll-of :portkey.aws.alexaforbusiness/device-event))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.put-room-skill-parameter-request/room-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/put-room-skill-parameter-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness/skill-id :portkey.aws.alexaforbusiness/room-skill-parameter] :opt-un [:portkey.aws.alexaforbusiness.put-room-skill-parameter-request/room-arn]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/device-event-type #{"DEVICE_STATUS" :connection-status "CONNECTION_STATUS" :device-status})

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/e-164-phone-number (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"^\+\d{8,}$" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/contact-data-list (clojure.spec.alpha/coll-of :portkey.aws.alexaforbusiness/contact-data))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.update-skill-group-request/skill-group-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.update-skill-group-request/description (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/skill-group-description))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/update-skill-group-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.update-skill-group-request/skill-group-arn :portkey.aws.alexaforbusiness/skill-group-name :portkey.aws.alexaforbusiness.update-skill-group-request/description]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.associate-device-with-room-request/device-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.associate-device-with-room-request/room-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/associate-device-with-room-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.associate-device-with-room-request/device-arn :portkey.aws.alexaforbusiness.associate-device-with-room-request/room-arn]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.get-contact-request/contact-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/get-contact-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness.get-contact-request/contact-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/skill-group-description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 200)) (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"[\u0009\u000A\u000D\u0020-\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/room-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 100)) (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"[\u0009\u000A\u000D\u0020-\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.device/device-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.device/room-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/device (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness/device-serial-number :portkey.aws.alexaforbusiness/software-version :portkey.aws.alexaforbusiness/device-status-info :portkey.aws.alexaforbusiness/mac-address :portkey.aws.alexaforbusiness.device/device-arn :portkey.aws.alexaforbusiness/device-type :portkey.aws.alexaforbusiness/device-status :portkey.aws.alexaforbusiness/device-name :portkey.aws.alexaforbusiness.device/room-arn]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/associate-skill-group-with-room-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.user-data/user-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.user-data/first-name (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/user-first-name))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.user-data/last-name (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/user-last-name))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/user-data (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.user-data/user-arn :portkey.aws.alexaforbusiness.user-data/first-name :portkey.aws.alexaforbusiness.user-data/last-name :portkey.aws.alexaforbusiness/email :portkey.aws.alexaforbusiness/enrollment-status :portkey.aws.alexaforbusiness/enrollment-id]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/untag-resource-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.search-rooms-response/rooms (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/room-data-list))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/search-rooms-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.search-rooms-response/rooms :portkey.aws.alexaforbusiness/next-token :portkey.aws.alexaforbusiness/total-count]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.delete-profile-request/profile-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/delete-profile-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.delete-profile-request/profile-arn]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/filter-list (clojure.spec.alpha/coll-of :portkey.aws.alexaforbusiness/filter :max-count 25))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/skill-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"(^amzn1\.ask\.skill\.[0-9a-f\-]{1,200})|(^amzn1\.echo-sdk-ams\.app\.[0-9a-f\-]{1,200})" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/profile-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 100)) (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"[\u0009\u000A\u000D\u0020-\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/filter-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 500))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.delete-contact-request/contact-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/delete-contact-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness.delete-contact-request/contact-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.untag-resource-request/tag-keys (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/tag-key-list))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/untag-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness/arn :portkey.aws.alexaforbusiness.untag-resource-request/tag-keys] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.skill-group-data/skill-group-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.skill-group-data/description (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/skill-group-description))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/skill-group-data (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.skill-group-data/skill-group-arn :portkey.aws.alexaforbusiness/skill-group-name :portkey.aws.alexaforbusiness.skill-group-data/description]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/features (clojure.spec.alpha/coll-of :portkey.aws.alexaforbusiness/feature))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/enrollment-status #{:initialized :pending "DEREGISTERING" "PENDING" :deregistering "REGISTERED" "INITIALIZED" :disassociating :registered "DISASSOCIATING"})

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/room-data-list (clojure.spec.alpha/coll-of :portkey.aws.alexaforbusiness/room-data))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/list-tags-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness/arn] :opt-un [:portkey.aws.alexaforbusiness/next-token :portkey.aws.alexaforbusiness/max-results]))

(clojure.core/defn tag-resource ([tag-resource-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-tag-resource-request tag-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/tag-resource-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/tag-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "TagResource", :http.request.configuration/output-deser-fn deser-tag-resource-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.alexaforbusiness/not-found-exception}})))))
(clojure.spec.alpha/fdef tag-resource :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness/tag-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/tag-resource-response))

(clojure.core/defn list-device-events ([list-device-events-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-list-device-events-request list-device-events-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/list-device-events-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/list-device-events-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListDeviceEvents", :http.request.configuration/output-deser-fn deser-list-device-events-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.alexaforbusiness/not-found-exception}})))))
(clojure.spec.alpha/fdef list-device-events :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness/list-device-events-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/list-device-events-response))

(clojure.core/defn associate-skill-group-with-room ([] (associate-skill-group-with-room {})) ([associate-skill-group-with-room-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-associate-skill-group-with-room-request associate-skill-group-with-room-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/associate-skill-group-with-room-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/associate-skill-group-with-room-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "AssociateSkillGroupWithRoom", :http.request.configuration/output-deser-fn deser-associate-skill-group-with-room-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef associate-skill-group-with-room :args (clojure.spec.alpha/? :portkey.aws.alexaforbusiness/associate-skill-group-with-room-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/associate-skill-group-with-room-response))

(clojure.core/defn disassociate-contact-from-address-book ([disassociate-contact-from-address-book-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-disassociate-contact-from-address-book-request disassociate-contact-from-address-book-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/disassociate-contact-from-address-book-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/disassociate-contact-from-address-book-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DisassociateContactFromAddressBook", :http.request.configuration/output-deser-fn deser-disassociate-contact-from-address-book-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef disassociate-contact-from-address-book :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness/disassociate-contact-from-address-book-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/disassociate-contact-from-address-book-response))

(clojure.core/defn search-profiles ([] (search-profiles {})) ([search-profiles-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-search-profiles-request search-profiles-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/search-profiles-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/search-profiles-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "SearchProfiles", :http.request.configuration/output-deser-fn deser-search-profiles-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef search-profiles :args (clojure.spec.alpha/? :portkey.aws.alexaforbusiness/search-profiles-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/search-profiles-response))

(clojure.core/defn get-device ([] (get-device {})) ([get-device-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-get-device-request get-device-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/get-device-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/get-device-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetDevice", :http.request.configuration/output-deser-fn deser-get-device-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.alexaforbusiness/not-found-exception}})))))
(clojure.spec.alpha/fdef get-device :args (clojure.spec.alpha/? :portkey.aws.alexaforbusiness/get-device-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/get-device-response))

(clojure.core/defn associate-contact-with-address-book ([associate-contact-with-address-book-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-associate-contact-with-address-book-request associate-contact-with-address-book-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/associate-contact-with-address-book-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/associate-contact-with-address-book-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "AssociateContactWithAddressBook", :http.request.configuration/output-deser-fn deser-associate-contact-with-address-book-response, :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.alexaforbusiness/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef associate-contact-with-address-book :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness/associate-contact-with-address-book-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/associate-contact-with-address-book-response))

(clojure.core/defn update-address-book ([update-address-book-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-update-address-book-request update-address-book-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/update-address-book-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/update-address-book-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateAddressBook", :http.request.configuration/output-deser-fn deser-update-address-book-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.alexaforbusiness/not-found-exception, "NameInUseException" :portkey.aws.alexaforbusiness/name-in-use-exception}})))))
(clojure.spec.alpha/fdef update-address-book :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness/update-address-book-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/update-address-book-response))

(clojure.core/defn put-room-skill-parameter ([put-room-skill-parameter-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-put-room-skill-parameter-request put-room-skill-parameter-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/put-room-skill-parameter-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/put-room-skill-parameter-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "PutRoomSkillParameter", :http.request.configuration/output-deser-fn deser-put-room-skill-parameter-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef put-room-skill-parameter :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness/put-room-skill-parameter-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/put-room-skill-parameter-response))

(clojure.core/defn delete-contact ([delete-contact-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-delete-contact-request delete-contact-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/delete-contact-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/delete-contact-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteContact", :http.request.configuration/output-deser-fn deser-delete-contact-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.alexaforbusiness/not-found-exception}})))))
(clojure.spec.alpha/fdef delete-contact :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness/delete-contact-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/delete-contact-response))

(clojure.core/defn delete-skill-group ([] (delete-skill-group {})) ([delete-skill-group-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-delete-skill-group-request delete-skill-group-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/delete-skill-group-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/delete-skill-group-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteSkillGroup", :http.request.configuration/output-deser-fn deser-delete-skill-group-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.alexaforbusiness/not-found-exception}})))))
(clojure.spec.alpha/fdef delete-skill-group :args (clojure.spec.alpha/? :portkey.aws.alexaforbusiness/delete-skill-group-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/delete-skill-group-response))

(clojure.core/defn create-address-book ([create-address-book-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-create-address-book-request create-address-book-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/create-address-book-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/create-address-book-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateAddressBook", :http.request.configuration/output-deser-fn deser-create-address-book-response, :http.request.spec/error-spec {"AlreadyExistsException" :portkey.aws.alexaforbusiness/already-exists-exception, "LimitExceededException" :portkey.aws.alexaforbusiness/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-address-book :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness/create-address-book-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/create-address-book-response))

(clojure.core/defn search-address-books ([] (search-address-books {})) ([search-address-books-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-search-address-books-request search-address-books-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/search-address-books-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/search-address-books-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "SearchAddressBooks", :http.request.configuration/output-deser-fn deser-search-address-books-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef search-address-books :args (clojure.spec.alpha/? :portkey.aws.alexaforbusiness/search-address-books-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/search-address-books-response))

(clojure.core/defn start-device-sync ([start-device-sync-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-start-device-sync-request start-device-sync-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/start-device-sync-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/start-device-sync-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StartDeviceSync", :http.request.configuration/output-deser-fn deser-start-device-sync-response, :http.request.spec/error-spec {"DeviceNotRegisteredException" :portkey.aws.alexaforbusiness/device-not-registered-exception}})))))
(clojure.spec.alpha/fdef start-device-sync :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness/start-device-sync-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/start-device-sync-response))

(clojure.core/defn list-tags ([list-tags-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-list-tags-request list-tags-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/list-tags-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/list-tags-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListTags", :http.request.configuration/output-deser-fn deser-list-tags-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.alexaforbusiness/not-found-exception}})))))
(clojure.spec.alpha/fdef list-tags :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness/list-tags-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/list-tags-response))

(clojure.core/defn delete-profile ([] (delete-profile {})) ([delete-profile-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-delete-profile-request delete-profile-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/delete-profile-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/delete-profile-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteProfile", :http.request.configuration/output-deser-fn deser-delete-profile-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.alexaforbusiness/not-found-exception}})))))
(clojure.spec.alpha/fdef delete-profile :args (clojure.spec.alpha/? :portkey.aws.alexaforbusiness/delete-profile-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/delete-profile-response))

(clojure.core/defn disassociate-device-from-room ([] (disassociate-device-from-room {})) ([disassociate-device-from-room-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-disassociate-device-from-room-request disassociate-device-from-room-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/disassociate-device-from-room-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/disassociate-device-from-room-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DisassociateDeviceFromRoom", :http.request.configuration/output-deser-fn deser-disassociate-device-from-room-response, :http.request.spec/error-spec {"DeviceNotRegisteredException" :portkey.aws.alexaforbusiness/device-not-registered-exception}})))))
(clojure.spec.alpha/fdef disassociate-device-from-room :args (clojure.spec.alpha/? :portkey.aws.alexaforbusiness/disassociate-device-from-room-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/disassociate-device-from-room-response))

(clojure.core/defn search-devices ([] (search-devices {})) ([search-devices-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-search-devices-request search-devices-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/search-devices-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/search-devices-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "SearchDevices", :http.request.configuration/output-deser-fn deser-search-devices-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef search-devices :args (clojure.spec.alpha/? :portkey.aws.alexaforbusiness/search-devices-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/search-devices-response))

(clojure.core/defn update-room ([] (update-room {})) ([update-room-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-update-room-request update-room-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/update-room-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/update-room-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateRoom", :http.request.configuration/output-deser-fn deser-update-room-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.alexaforbusiness/not-found-exception, "NameInUseException" :portkey.aws.alexaforbusiness/name-in-use-exception}})))))
(clojure.spec.alpha/fdef update-room :args (clojure.spec.alpha/? :portkey.aws.alexaforbusiness/update-room-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/update-room-response))

(clojure.core/defn create-contact ([create-contact-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-create-contact-request create-contact-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/create-contact-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/create-contact-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateContact", :http.request.configuration/output-deser-fn deser-create-contact-response, :http.request.spec/error-spec {"AlreadyExistsException" :portkey.aws.alexaforbusiness/already-exists-exception, "LimitExceededException" :portkey.aws.alexaforbusiness/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-contact :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness/create-contact-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/create-contact-response))

(clojure.core/defn get-room-skill-parameter ([get-room-skill-parameter-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-get-room-skill-parameter-request get-room-skill-parameter-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/get-room-skill-parameter-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/get-room-skill-parameter-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetRoomSkillParameter", :http.request.configuration/output-deser-fn deser-get-room-skill-parameter-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.alexaforbusiness/not-found-exception}})))))
(clojure.spec.alpha/fdef get-room-skill-parameter :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness/get-room-skill-parameter-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/get-room-skill-parameter-response))

(clojure.core/defn get-address-book ([get-address-book-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-get-address-book-request get-address-book-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/get-address-book-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/get-address-book-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetAddressBook", :http.request.configuration/output-deser-fn deser-get-address-book-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.alexaforbusiness/not-found-exception}})))))
(clojure.spec.alpha/fdef get-address-book :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness/get-address-book-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/get-address-book-response))

(clojure.core/defn list-skills ([] (list-skills {})) ([list-skills-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-list-skills-request list-skills-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/list-skills-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/list-skills-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListSkills", :http.request.configuration/output-deser-fn deser-list-skills-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-skills :args (clojure.spec.alpha/? :portkey.aws.alexaforbusiness/list-skills-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/list-skills-response))

(clojure.core/defn delete-user ([delete-user-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-delete-user-request delete-user-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/delete-user-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/delete-user-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteUser", :http.request.configuration/output-deser-fn deser-delete-user-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.alexaforbusiness/not-found-exception}})))))
(clojure.spec.alpha/fdef delete-user :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness/delete-user-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/delete-user-response))

(clojure.core/defn create-user ([create-user-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-create-user-request create-user-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/create-user-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/create-user-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateUser", :http.request.configuration/output-deser-fn deser-create-user-response, :http.request.spec/error-spec {"ResourceInUseException" :portkey.aws.alexaforbusiness/resource-in-use-exception, "LimitExceededException" :portkey.aws.alexaforbusiness/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-user :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness/create-user-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/create-user-response))

(clojure.core/defn get-contact ([get-contact-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-get-contact-request get-contact-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/get-contact-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/get-contact-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetContact", :http.request.configuration/output-deser-fn deser-get-contact-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.alexaforbusiness/not-found-exception}})))))
(clojure.spec.alpha/fdef get-contact :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness/get-contact-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/get-contact-response))

(clojure.core/defn delete-room ([] (delete-room {})) ([delete-room-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-delete-room-request delete-room-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/delete-room-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/delete-room-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteRoom", :http.request.configuration/output-deser-fn deser-delete-room-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.alexaforbusiness/not-found-exception}})))))
(clojure.spec.alpha/fdef delete-room :args (clojure.spec.alpha/? :portkey.aws.alexaforbusiness/delete-room-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/delete-room-response))

(clojure.core/defn delete-address-book ([delete-address-book-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-delete-address-book-request delete-address-book-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/delete-address-book-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/delete-address-book-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteAddressBook", :http.request.configuration/output-deser-fn deser-delete-address-book-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.alexaforbusiness/not-found-exception}})))))
(clojure.spec.alpha/fdef delete-address-book :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness/delete-address-book-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/delete-address-book-response))

(clojure.core/defn search-rooms ([] (search-rooms {})) ([search-rooms-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-search-rooms-request search-rooms-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/search-rooms-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/search-rooms-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "SearchRooms", :http.request.configuration/output-deser-fn deser-search-rooms-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef search-rooms :args (clojure.spec.alpha/? :portkey.aws.alexaforbusiness/search-rooms-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/search-rooms-response))

(clojure.core/defn send-invitation ([] (send-invitation {})) ([send-invitation-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-send-invitation-request send-invitation-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/send-invitation-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/send-invitation-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "SendInvitation", :http.request.configuration/output-deser-fn deser-send-invitation-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.alexaforbusiness/not-found-exception, "InvalidUserStatusException" :portkey.aws.alexaforbusiness/invalid-user-status-exception}})))))
(clojure.spec.alpha/fdef send-invitation :args (clojure.spec.alpha/? :portkey.aws.alexaforbusiness/send-invitation-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/send-invitation-response))

(clojure.core/defn resolve-room ([resolve-room-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-resolve-room-request resolve-room-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/resolve-room-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/resolve-room-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ResolveRoom", :http.request.configuration/output-deser-fn deser-resolve-room-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.alexaforbusiness/not-found-exception}})))))
(clojure.spec.alpha/fdef resolve-room :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness/resolve-room-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/resolve-room-response))

(clojure.core/defn get-room ([] (get-room {})) ([get-room-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-get-room-request get-room-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/get-room-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/get-room-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetRoom", :http.request.configuration/output-deser-fn deser-get-room-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.alexaforbusiness/not-found-exception}})))))
(clojure.spec.alpha/fdef get-room :args (clojure.spec.alpha/? :portkey.aws.alexaforbusiness/get-room-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/get-room-response))

(clojure.core/defn search-skill-groups ([] (search-skill-groups {})) ([search-skill-groups-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-search-skill-groups-request search-skill-groups-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/search-skill-groups-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/search-skill-groups-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "SearchSkillGroups", :http.request.configuration/output-deser-fn deser-search-skill-groups-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef search-skill-groups :args (clojure.spec.alpha/? :portkey.aws.alexaforbusiness/search-skill-groups-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/search-skill-groups-response))

(clojure.core/defn update-profile ([] (update-profile {})) ([update-profile-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-update-profile-request update-profile-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/update-profile-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/update-profile-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateProfile", :http.request.configuration/output-deser-fn deser-update-profile-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.alexaforbusiness/not-found-exception, "NameInUseException" :portkey.aws.alexaforbusiness/name-in-use-exception}})))))
(clojure.spec.alpha/fdef update-profile :args (clojure.spec.alpha/? :portkey.aws.alexaforbusiness/update-profile-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/update-profile-response))

(clojure.core/defn search-users ([] (search-users {})) ([search-users-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-search-users-request search-users-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/search-users-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/search-users-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "SearchUsers", :http.request.configuration/output-deser-fn deser-search-users-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef search-users :args (clojure.spec.alpha/? :portkey.aws.alexaforbusiness/search-users-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/search-users-response))

(clojure.core/defn update-skill-group ([] (update-skill-group {})) ([update-skill-group-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-update-skill-group-request update-skill-group-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/update-skill-group-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/update-skill-group-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateSkillGroup", :http.request.configuration/output-deser-fn deser-update-skill-group-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.alexaforbusiness/not-found-exception, "NameInUseException" :portkey.aws.alexaforbusiness/name-in-use-exception}})))))
(clojure.spec.alpha/fdef update-skill-group :args (clojure.spec.alpha/? :portkey.aws.alexaforbusiness/update-skill-group-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/update-skill-group-response))

(clojure.core/defn search-contacts ([] (search-contacts {})) ([search-contacts-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-search-contacts-request search-contacts-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/search-contacts-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/search-contacts-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "SearchContacts", :http.request.configuration/output-deser-fn deser-search-contacts-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef search-contacts :args (clojure.spec.alpha/? :portkey.aws.alexaforbusiness/search-contacts-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/search-contacts-response))

(clojure.core/defn untag-resource ([untag-resource-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-untag-resource-request untag-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/untag-resource-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/untag-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UntagResource", :http.request.configuration/output-deser-fn deser-untag-resource-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.alexaforbusiness/not-found-exception}})))))
(clojure.spec.alpha/fdef untag-resource :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness/untag-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/untag-resource-response))

(clojure.core/defn create-skill-group ([create-skill-group-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-create-skill-group-request create-skill-group-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/create-skill-group-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/create-skill-group-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateSkillGroup", :http.request.configuration/output-deser-fn deser-create-skill-group-response, :http.request.spec/error-spec {"AlreadyExistsException" :portkey.aws.alexaforbusiness/already-exists-exception, "LimitExceededException" :portkey.aws.alexaforbusiness/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-skill-group :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness/create-skill-group-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/create-skill-group-response))

(clojure.core/defn revoke-invitation ([] (revoke-invitation {})) ([revoke-invitation-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-revoke-invitation-request revoke-invitation-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/revoke-invitation-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/revoke-invitation-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "RevokeInvitation", :http.request.configuration/output-deser-fn deser-revoke-invitation-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.alexaforbusiness/not-found-exception}})))))
(clojure.spec.alpha/fdef revoke-invitation :args (clojure.spec.alpha/? :portkey.aws.alexaforbusiness/revoke-invitation-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/revoke-invitation-response))

(clojure.core/defn delete-room-skill-parameter ([delete-room-skill-parameter-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-delete-room-skill-parameter-request delete-room-skill-parameter-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/delete-room-skill-parameter-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/delete-room-skill-parameter-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteRoomSkillParameter", :http.request.configuration/output-deser-fn deser-delete-room-skill-parameter-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef delete-room-skill-parameter :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness/delete-room-skill-parameter-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/delete-room-skill-parameter-response))

(clojure.core/defn update-device ([] (update-device {})) ([update-device-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-update-device-request update-device-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/update-device-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/update-device-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateDevice", :http.request.configuration/output-deser-fn deser-update-device-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.alexaforbusiness/not-found-exception, "DeviceNotRegisteredException" :portkey.aws.alexaforbusiness/device-not-registered-exception}})))))
(clojure.spec.alpha/fdef update-device :args (clojure.spec.alpha/? :portkey.aws.alexaforbusiness/update-device-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/update-device-response))

(clojure.core/defn associate-device-with-room ([] (associate-device-with-room {})) ([associate-device-with-room-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-associate-device-with-room-request associate-device-with-room-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/associate-device-with-room-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/associate-device-with-room-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "AssociateDeviceWithRoom", :http.request.configuration/output-deser-fn deser-associate-device-with-room-response, :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.alexaforbusiness/limit-exceeded-exception, "DeviceNotRegisteredException" :portkey.aws.alexaforbusiness/device-not-registered-exception}})))))
(clojure.spec.alpha/fdef associate-device-with-room :args (clojure.spec.alpha/? :portkey.aws.alexaforbusiness/associate-device-with-room-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/associate-device-with-room-response))

(clojure.core/defn create-room ([create-room-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-create-room-request create-room-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/create-room-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/create-room-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateRoom", :http.request.configuration/output-deser-fn deser-create-room-response, :http.request.spec/error-spec {"AlreadyExistsException" :portkey.aws.alexaforbusiness/already-exists-exception, "LimitExceededException" :portkey.aws.alexaforbusiness/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-room :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness/create-room-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/create-room-response))

(clojure.core/defn update-contact ([update-contact-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-update-contact-request update-contact-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/update-contact-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/update-contact-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateContact", :http.request.configuration/output-deser-fn deser-update-contact-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.alexaforbusiness/not-found-exception}})))))
(clojure.spec.alpha/fdef update-contact :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness/update-contact-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/update-contact-response))

(clojure.core/defn disassociate-skill-group-from-room ([] (disassociate-skill-group-from-room {})) ([disassociate-skill-group-from-room-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-disassociate-skill-group-from-room-request disassociate-skill-group-from-room-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/disassociate-skill-group-from-room-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/disassociate-skill-group-from-room-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DisassociateSkillGroupFromRoom", :http.request.configuration/output-deser-fn deser-disassociate-skill-group-from-room-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef disassociate-skill-group-from-room :args (clojure.spec.alpha/? :portkey.aws.alexaforbusiness/disassociate-skill-group-from-room-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/disassociate-skill-group-from-room-response))

(clojure.core/defn get-skill-group ([] (get-skill-group {})) ([get-skill-group-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-get-skill-group-request get-skill-group-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/get-skill-group-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/get-skill-group-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetSkillGroup", :http.request.configuration/output-deser-fn deser-get-skill-group-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.alexaforbusiness/not-found-exception}})))))
(clojure.spec.alpha/fdef get-skill-group :args (clojure.spec.alpha/? :portkey.aws.alexaforbusiness/get-skill-group-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/get-skill-group-response))

(clojure.core/defn get-profile ([] (get-profile {})) ([get-profile-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-get-profile-request get-profile-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/get-profile-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/get-profile-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetProfile", :http.request.configuration/output-deser-fn deser-get-profile-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.alexaforbusiness/not-found-exception}})))))
(clojure.spec.alpha/fdef get-profile :args (clojure.spec.alpha/? :portkey.aws.alexaforbusiness/get-profile-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/get-profile-response))

(clojure.core/defn create-profile ([create-profile-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-create-profile-request create-profile-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/create-profile-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/create-profile-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateProfile", :http.request.configuration/output-deser-fn deser-create-profile-response, :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.alexaforbusiness/limit-exceeded-exception, "AlreadyExistsException" :portkey.aws.alexaforbusiness/already-exists-exception}})))))
(clojure.spec.alpha/fdef create-profile :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness/create-profile-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/create-profile-response))
