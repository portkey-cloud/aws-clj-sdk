(ns portkey.aws.alexaforbusiness.-2017-11-09 (:require [portkey.aws]))

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

(clojure.core/declare ser-business-report-recurrence)

(clojure.core/declare ser-filter-value-list)

(clojure.core/declare ser-sort-key)

(clojure.core/declare ser-ip-dial-in)

(clojure.core/declare ser-filter)

(clojure.core/declare ser-client-request-token)

(clojure.core/declare ser-provider-calendar-id)

(clojure.core/declare ser-email)

(clojure.core/declare ser-short-skill-id-list)

(clojure.core/declare ser-enrollment-id)

(clojure.core/declare ser-wake-word)

(clojure.core/declare seruser-user-id)

(clojure.core/declare ser-contact-name)

(clojure.core/declare ser-user-code)

(clojure.core/declare ser-address-book-description)

(clojure.core/declare ser-skill-type-filter)

(clojure.core/declare ser-conference-preference)

(clojure.core/declare ser-feature)

(clojure.core/declare ser-user-id)

(clojure.core/declare ser-device-serial-number-for-avs)

(clojure.core/declare ser-amazon-id)

(clojure.core/declare ser-tag-key)

(clojure.core/declare ser-business-report-schedule-name)

(clojure.core/declare ser-country-code)

(clojure.core/declare ser-skill-group-name)

(clojure.core/declare ser-organization-name)

(clojure.core/declare ser-pstn-dial-in)

(clojure.core/declare ser-room-skill-parameter)

(clojure.core/declare ser-conference-provider-type)

(clojure.core/declare ser-next-token)

(clojure.core/declare ser-date)

(clojure.core/declare ser-conference-provider-name)

(clojure.core/declare ser-enablement-type-filter)

(clojure.core/declare ser-address-book-name)

(clojure.core/declare ser-outbound-phone-number)

(clojure.core/declare ser-key)

(clojure.core/declare ser-comms-protocol)

(clojure.core/declare ser-filter-key)

(clojure.core/declare ser-tag-list)

(clojure.core/declare ser-category-id)

(clojure.core/declare ser-timezone)

(clojure.core/declare ser-tag-key-list)

(clojure.core/declare ser-one-click-pin-delay)

(clojure.core/declare ser-value)

(clojure.core/declare seruser-first-name)

(clojure.core/declare ser-authorization-result)

(clojure.core/declare ser-require-pin)

(clojure.core/declare ser-tag-value)

(clojure.core/declare ser-customer-s-3-bucket-name)

(clojure.core/declare ser-max-volume-limit)

(clojure.core/declare ser-one-click-id-delay)

(clojure.core/declare ser-sort-value)

(clojure.core/declare ser-room-description)

(clojure.core/declare ser-room-skill-parameter-key)

(clojure.core/declare ser-client-id)

(clojure.core/declare ser-s-3-key-prefix)

(clojure.core/declare ser-arn)

(clojure.core/declare ser-skill-list-max-results)

(clojure.core/declare ser-endpoint)

(clojure.core/declare seruser-last-name)

(clojure.core/declare ser-device-name)

(clojure.core/declare ser-temperature-unit)

(clojure.core/declare ser-room-skill-parameter-value)

(clojure.core/declare ser-business-report-content-range)

(clojure.core/declare ser-distance-unit)

(clojure.core/declare ser-max-results)

(clojure.core/declare ser-tag)

(clojure.core/declare ser-business-report-format)

(clojure.core/declare ser-business-report-interval)

(clojure.core/declare ser-device-event-type)

(clojure.core/declare ser-e-164-phone-number)

(clojure.core/declare ser-product-id)

(clojure.core/declare ser-skill-group-description)

(clojure.core/declare ser-room-name)

(clojure.core/declare ser-filter-list)

(clojure.core/declare ser-skill-id)

(clojure.core/declare ser-profile-name)

(clojure.core/declare ser-filter-value)

(clojure.core/declare ser-features)

(clojure.core/declare ser-boolean)

(clojure.core/declare ser-meeting-setting)

(clojure.core/defn- ser-sort-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-sort coll) #:http.request.field{:shape "Sort"}))) input), :shape "SortList", :type "list", :max 25})

(clojure.core/defn- ser-address [input] #:http.request.field{:value input, :shape "Address"})

(clojure.core/defn- ser-sort [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-sort-key (:key input)) #:http.request.field{:name "Key", :shape "SortKey"}) (clojure.core/into (ser-sort-value (:value input)) #:http.request.field{:name "Value", :shape "SortValue"})], :shape "Sort", :type "structure"}))

(clojure.core/defn- ser-business-report-recurrence [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "BusinessReportRecurrence", :type "structure"} (clojure.core/contains? input :start-date) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-date (input :start-date)) #:http.request.field{:name "StartDate", :shape "Date"}))))

(clojure.core/defn- ser-filter-value-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-filter-value coll) #:http.request.field{:shape "FilterValue"}))) input), :shape "FilterValueList", :type "list", :max 5})

(clojure.core/defn- ser-sort-key [input] #:http.request.field{:value input, :shape "SortKey"})

(clojure.core/defn- ser-ip-dial-in [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-endpoint (:endpoint input)) #:http.request.field{:name "Endpoint", :shape "Endpoint"}) (clojure.core/into (ser-comms-protocol (:comms-protocol input)) #:http.request.field{:name "CommsProtocol", :shape "CommsProtocol"})], :shape "IPDialIn", :type "structure"}))

(clojure.core/defn- ser-filter [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-filter-key (:key input)) #:http.request.field{:name "Key", :shape "FilterKey"}) (clojure.core/into (ser-filter-value-list (:values input)) #:http.request.field{:name "Values", :shape "FilterValueList"})], :shape "Filter", :type "structure"}))

(clojure.core/defn- ser-client-request-token [input] #:http.request.field{:value input, :shape "ClientRequestToken"})

(clojure.core/defn- ser-provider-calendar-id [input] #:http.request.field{:value input, :shape "ProviderCalendarId"})

(clojure.core/defn- ser-email [input] #:http.request.field{:value input, :shape "Email"})

(clojure.core/defn- ser-short-skill-id-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-skill-id coll) #:http.request.field{:shape "SkillId"}))) input), :shape "ShortSkillIdList", :type "list", :max 3, :min 0})

(clojure.core/defn- ser-enrollment-id [input] #:http.request.field{:value input, :shape "EnrollmentId"})

(clojure.core/defn- ser-wake-word [input] #:http.request.field{:value (clojure.core/get {"ALEXA" "ALEXA", :alexa "ALEXA", "AMAZON" "AMAZON", :amazon "AMAZON", "ECHO" "ECHO", :echo "ECHO", "COMPUTER" "COMPUTER", :computer "COMPUTER"} input), :shape "WakeWord"})

(clojure.core/defn- seruser-user-id [input] #:http.request.field{:value input, :shape "user_UserId"})

(clojure.core/defn- ser-contact-name [input] #:http.request.field{:value input, :shape "ContactName"})

(clojure.core/defn- ser-user-code [input] #:http.request.field{:value input, :shape "UserCode"})

(clojure.core/defn- ser-address-book-description [input] #:http.request.field{:value input, :shape "AddressBookDescription"})

(clojure.core/defn- ser-skill-type-filter [input] #:http.request.field{:value (clojure.core/get {"PUBLIC" "PUBLIC", :public "PUBLIC", "PRIVATE" "PRIVATE", :private "PRIVATE", "ALL" "ALL", :all "ALL"} input), :shape "SkillTypeFilter"})

(clojure.core/defn- ser-conference-preference [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ConferencePreference", :type "structure"} (clojure.core/contains? input :default-conference-provider-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn (input :default-conference-provider-arn)) #:http.request.field{:name "DefaultConferenceProviderArn", :shape "Arn"}))))

(clojure.core/defn- ser-feature [input] #:http.request.field{:value (clojure.core/get {"NOTIFICATIONS" "NOTIFICATIONS", :lists "LISTS", "SKILLS" "SKILLS", "LISTS" "LISTS", :bluetooth "BLUETOOTH", "BLUETOOTH" "BLUETOOTH", :all "ALL", :volume "VOLUME", :notifications "NOTIFICATIONS", :skills "SKILLS", "VOLUME" "VOLUME", "ALL" "ALL"} input), :shape "Feature"})

(clojure.core/defn- ser-user-id [input] #:http.request.field{:value input, :shape "UserId"})

(clojure.core/defn- ser-device-serial-number-for-avs [input] #:http.request.field{:value input, :shape "DeviceSerialNumberForAVS"})

(clojure.core/defn- ser-amazon-id [input] #:http.request.field{:value input, :shape "AmazonId"})

(clojure.core/defn- ser-tag-key [input] #:http.request.field{:value input, :shape "TagKey"})

(clojure.core/defn- ser-business-report-schedule-name [input] #:http.request.field{:value input, :shape "BusinessReportScheduleName"})

(clojure.core/defn- ser-country-code [input] #:http.request.field{:value input, :shape "CountryCode"})

(clojure.core/defn- ser-skill-group-name [input] #:http.request.field{:value input, :shape "SkillGroupName"})

(clojure.core/defn- ser-organization-name [input] #:http.request.field{:value input, :shape "OrganizationName"})

(clojure.core/defn- ser-pstn-dial-in [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-country-code (:country-code input)) #:http.request.field{:name "CountryCode", :shape "CountryCode"}) (clojure.core/into (ser-outbound-phone-number (:phone-number input)) #:http.request.field{:name "PhoneNumber", :shape "OutboundPhoneNumber"}) (clojure.core/into (ser-one-click-id-delay (:one-click-id-delay input)) #:http.request.field{:name "OneClickIdDelay", :shape "OneClickIdDelay"}) (clojure.core/into (ser-one-click-pin-delay (:one-click-pin-delay input)) #:http.request.field{:name "OneClickPinDelay", :shape "OneClickPinDelay"})], :shape "PSTNDialIn", :type "structure"}))

(clojure.core/defn- ser-room-skill-parameter [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-room-skill-parameter-key (:parameter-key input)) #:http.request.field{:name "ParameterKey", :shape "RoomSkillParameterKey"}) (clojure.core/into (ser-room-skill-parameter-value (:parameter-value input)) #:http.request.field{:name "ParameterValue", :shape "RoomSkillParameterValue"})], :shape "RoomSkillParameter", :type "structure"}))

(clojure.core/defn- ser-conference-provider-type [input] #:http.request.field{:value (clojure.core/get {:zoom "ZOOM", "CUSTOM" "CUSTOM", "BLUEJEANS" "BLUEJEANS", :fuze "FUZE", "WEBEX" "WEBEX", "FUZE" "FUZE", "GOOGLE_HANGOUTS" "GOOGLE_HANGOUTS", :custom "CUSTOM", "ZOOM" "ZOOM", "RINGCENTRAL" "RINGCENTRAL", :bluejeans "BLUEJEANS", "POLYCOM" "POLYCOM", :ringcentral "RINGCENTRAL", :google-hangouts "GOOGLE_HANGOUTS", "SKYPE_FOR_BUSINESS" "SKYPE_FOR_BUSINESS", :skype-for-business "SKYPE_FOR_BUSINESS", :webex "WEBEX", "CHIME" "CHIME", :chime "CHIME", :polycom "POLYCOM"} input), :shape "ConferenceProviderType"})

(clojure.core/defn- ser-next-token [input] #:http.request.field{:value input, :shape "NextToken"})

(clojure.core/defn- ser-date [input] #:http.request.field{:value input, :shape "Date"})

(clojure.core/defn- ser-conference-provider-name [input] #:http.request.field{:value input, :shape "ConferenceProviderName"})

(clojure.core/defn- ser-enablement-type-filter [input] #:http.request.field{:value (clojure.core/get {"ENABLED" "ENABLED", :enabled "ENABLED", "PENDING" "PENDING", :pending "PENDING"} input), :shape "EnablementTypeFilter"})

(clojure.core/defn- ser-address-book-name [input] #:http.request.field{:value input, :shape "AddressBookName"})

(clojure.core/defn- ser-outbound-phone-number [input] #:http.request.field{:value input, :shape "OutboundPhoneNumber"})

(clojure.core/defn- ser-key [input] #:http.request.field{:value input, :shape "Key"})

(clojure.core/defn- ser-comms-protocol [input] #:http.request.field{:value (clojure.core/get {"SIP" "SIP", :sip "SIP", "SIPS" "SIPS", :sips "SIPS", "H323" "H323", :h-323 "H323"} input), :shape "CommsProtocol"})

(clojure.core/defn- ser-filter-key [input] #:http.request.field{:value input, :shape "FilterKey"})

(clojure.core/defn- ser-tag-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag coll) #:http.request.field{:shape "Tag"}))) input), :shape "TagList", :type "list"})

(clojure.core/defn- ser-category-id [input] #:http.request.field{:value input, :shape "CategoryId"})

(clojure.core/defn- ser-timezone [input] #:http.request.field{:value input, :shape "Timezone"})

(clojure.core/defn- ser-tag-key-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag-key coll) #:http.request.field{:shape "TagKey"}))) input), :shape "TagKeyList", :type "list"})

(clojure.core/defn- ser-one-click-pin-delay [input] #:http.request.field{:value input, :shape "OneClickPinDelay"})

(clojure.core/defn- ser-value [input] #:http.request.field{:value input, :shape "Value"})

(clojure.core/defn- seruser-first-name [input] #:http.request.field{:value input, :shape "user_FirstName"})

(clojure.core/defn- ser-authorization-result [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-key k) #:http.request.field{:map-info "key", :shape "Key"}) (clojure.core/into (ser-value v) #:http.request.field{:map-info "value", :shape "Value"})])) input), :shape "AuthorizationResult", :type "map", :sensitive true})

(clojure.core/defn- ser-require-pin [input] #:http.request.field{:value (clojure.core/get {"YES" "YES", :yes "YES", "NO" "NO", :no "NO", "OPTIONAL" "OPTIONAL", :optional "OPTIONAL"} input), :shape "RequirePin"})

(clojure.core/defn- ser-tag-value [input] #:http.request.field{:value input, :shape "TagValue"})

(clojure.core/defn- ser-customer-s-3-bucket-name [input] #:http.request.field{:value input, :shape "CustomerS3BucketName"})

(clojure.core/defn- ser-max-volume-limit [input] #:http.request.field{:value input, :shape "MaxVolumeLimit"})

(clojure.core/defn- ser-one-click-id-delay [input] #:http.request.field{:value input, :shape "OneClickIdDelay"})

(clojure.core/defn- ser-sort-value [input] #:http.request.field{:value (clojure.core/get {"ASC" "ASC", :asc "ASC", "DESC" "DESC", :desc "DESC"} input), :shape "SortValue"})

(clojure.core/defn- ser-room-description [input] #:http.request.field{:value input, :shape "RoomDescription"})

(clojure.core/defn- ser-room-skill-parameter-key [input] #:http.request.field{:value input, :shape "RoomSkillParameterKey"})

(clojure.core/defn- ser-client-id [input] #:http.request.field{:value input, :shape "ClientId"})

(clojure.core/defn- ser-s-3-key-prefix [input] #:http.request.field{:value input, :shape "S3KeyPrefix"})

(clojure.core/defn- ser-arn [input] #:http.request.field{:value input, :shape "Arn"})

(clojure.core/defn- ser-skill-list-max-results [input] #:http.request.field{:value input, :shape "SkillListMaxResults"})

(clojure.core/defn- ser-endpoint [input] #:http.request.field{:value input, :shape "Endpoint"})

(clojure.core/defn- seruser-last-name [input] #:http.request.field{:value input, :shape "user_LastName"})

(clojure.core/defn- ser-device-name [input] #:http.request.field{:value input, :shape "DeviceName"})

(clojure.core/defn- ser-temperature-unit [input] #:http.request.field{:value (clojure.core/get {"FAHRENHEIT" "FAHRENHEIT", :fahrenheit "FAHRENHEIT", "CELSIUS" "CELSIUS", :celsius "CELSIUS"} input), :shape "TemperatureUnit"})

(clojure.core/defn- ser-room-skill-parameter-value [input] #:http.request.field{:value input, :shape "RoomSkillParameterValue"})

(clojure.core/defn- ser-business-report-content-range [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "BusinessReportContentRange", :type "structure"} (clojure.core/contains? input :interval) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-business-report-interval (input :interval)) #:http.request.field{:name "Interval", :shape "BusinessReportInterval"}))))

(clojure.core/defn- ser-distance-unit [input] #:http.request.field{:value (clojure.core/get {"METRIC" "METRIC", :metric "METRIC", "IMPERIAL" "IMPERIAL", :imperial "IMPERIAL"} input), :shape "DistanceUnit"})

(clojure.core/defn- ser-max-results [input] #:http.request.field{:value input, :shape "MaxResults"})

(clojure.core/defn- ser-tag [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-tag-key (:key input)) #:http.request.field{:name "Key", :shape "TagKey"}) (clojure.core/into (ser-tag-value (:value input)) #:http.request.field{:name "Value", :shape "TagValue"})], :shape "Tag", :type "structure"}))

(clojure.core/defn- ser-business-report-format [input] #:http.request.field{:value (clojure.core/get {"CSV" "CSV", :csv "CSV", "CSV_ZIP" "CSV_ZIP", :csv-zip "CSV_ZIP"} input), :shape "BusinessReportFormat"})

(clojure.core/defn- ser-business-report-interval [input] #:http.request.field{:value (clojure.core/get {"ONE_DAY" "ONE_DAY", :one-day "ONE_DAY", "ONE_WEEK" "ONE_WEEK", :one-week "ONE_WEEK"} input), :shape "BusinessReportInterval"})

(clojure.core/defn- ser-device-event-type [input] #:http.request.field{:value (clojure.core/get {"CONNECTION_STATUS" "CONNECTION_STATUS", :connection-status "CONNECTION_STATUS", "DEVICE_STATUS" "DEVICE_STATUS", :device-status "DEVICE_STATUS"} input), :shape "DeviceEventType"})

(clojure.core/defn- ser-e-164-phone-number [input] #:http.request.field{:value input, :shape "E164PhoneNumber"})

(clojure.core/defn- ser-product-id [input] #:http.request.field{:value input, :shape "ProductId"})

(clojure.core/defn- ser-skill-group-description [input] #:http.request.field{:value input, :shape "SkillGroupDescription"})

(clojure.core/defn- ser-room-name [input] #:http.request.field{:value input, :shape "RoomName"})

(clojure.core/defn- ser-filter-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-filter coll) #:http.request.field{:shape "Filter"}))) input), :shape "FilterList", :type "list", :max 25})

(clojure.core/defn- ser-skill-id [input] #:http.request.field{:value input, :shape "SkillId"})

(clojure.core/defn- ser-profile-name [input] #:http.request.field{:value input, :shape "ProfileName"})

(clojure.core/defn- ser-filter-value [input] #:http.request.field{:value input, :shape "FilterValue"})

(clojure.core/defn- ser-features [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-feature coll) #:http.request.field{:shape "Feature"}))) input), :shape "Features", :type "list"})

(clojure.core/defn- ser-boolean [input] #:http.request.field{:value input, :shape "Boolean"})

(clojure.core/defn- ser-meeting-setting [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-require-pin (:require-pin input)) #:http.request.field{:name "RequirePin", :shape "RequirePin"})], :shape "MeetingSetting", :type "structure"}))

(clojure.core/defn- req-disassociate-skill-from-skill-group-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-skill-id (input :skill-id)) #:http.request.field{:name "SkillId", :shape "SkillId"})]} (clojure.core/contains? input :skill-group-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn (input :skill-group-arn)) #:http.request.field{:name "SkillGroupArn", :shape "Arn"}))))

(clojure.core/defn- req-update-profile-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :address) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-address (input :address)) #:http.request.field{:name "Address", :shape "Address"})) (clojure.core/contains? input :wake-word) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-wake-word (input :wake-word)) #:http.request.field{:name "WakeWord", :shape "WakeWord"})) (clojure.core/contains? input :setup-mode-disabled) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :setup-mode-disabled)) #:http.request.field{:name "SetupModeDisabled", :shape "Boolean"})) (clojure.core/contains? input :pstn-enabled) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :pstn-enabled)) #:http.request.field{:name "PSTNEnabled", :shape "Boolean"})) (clojure.core/contains? input :timezone) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timezone (input :timezone)) #:http.request.field{:name "Timezone", :shape "Timezone"})) (clojure.core/contains? input :max-volume-limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-volume-limit (input :max-volume-limit)) #:http.request.field{:name "MaxVolumeLimit", :shape "MaxVolumeLimit"})) (clojure.core/contains? input :profile-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn (input :profile-arn)) #:http.request.field{:name "ProfileArn", :shape "Arn"})) (clojure.core/contains? input :temperature-unit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-temperature-unit (input :temperature-unit)) #:http.request.field{:name "TemperatureUnit", :shape "TemperatureUnit"})) (clojure.core/contains? input :distance-unit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-distance-unit (input :distance-unit)) #:http.request.field{:name "DistanceUnit", :shape "DistanceUnit"})) (clojure.core/contains? input :is-default) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :is-default)) #:http.request.field{:name "IsDefault", :shape "Boolean"})) (clojure.core/contains? input :profile-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-profile-name (input :profile-name)) #:http.request.field{:name "ProfileName", :shape "ProfileName"}))))

(clojure.core/defn- req-disassociate-device-from-room-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :device-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn (input :device-arn)) #:http.request.field{:name "DeviceArn", :shape "Arn"}))))

(clojure.core/defn- req-associate-skill-with-users-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-skill-id (input :skill-id)) #:http.request.field{:name "SkillId", :shape "SkillId"})]}))

(clojure.core/defn- req-delete-conference-provider-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :conference-provider-arn)) #:http.request.field{:name "ConferenceProviderArn", :shape "Arn"})]}))

(clojure.core/defn- req-delete-room-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :room-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn (input :room-arn)) #:http.request.field{:name "RoomArn", :shape "Arn"}))))

(clojure.core/defn- req-put-invitation-configuration-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-organization-name (input :organization-name)) #:http.request.field{:name "OrganizationName", :shape "OrganizationName"})]} (clojure.core/contains? input :contact-email) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-email (input :contact-email)) #:http.request.field{:name "ContactEmail", :shape "Email"})) (clojure.core/contains? input :private-skill-ids) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-short-skill-id-list (input :private-skill-ids)) #:http.request.field{:name "PrivateSkillIds", :shape "ShortSkillIdList"}))))

(clojure.core/defn- req-get-profile-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :profile-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn (input :profile-arn)) #:http.request.field{:name "ProfileArn", :shape "Arn"}))))

(clojure.core/defn- req-list-device-events-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :device-arn)) #:http.request.field{:name "DeviceArn", :shape "Arn"})]} (clojure.core/contains? input :event-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-device-event-type (input :event-type)) #:http.request.field{:name "EventType", :shape "DeviceEventType"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"}))))

(clojure.core/defn- req-search-devices-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"})) (clojure.core/contains? input :filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-filter-list (input :filters)) #:http.request.field{:name "Filters", :shape "FilterList"})) (clojure.core/contains? input :sort-criteria) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sort-list (input :sort-criteria)) #:http.request.field{:name "SortCriteria", :shape "SortList"}))))

(clojure.core/defn- req-forget-smart-home-appliances-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :room-arn)) #:http.request.field{:name "RoomArn", :shape "Arn"})]}))

(clojure.core/defn- req-search-address-books-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-filter-list (input :filters)) #:http.request.field{:name "Filters", :shape "FilterList"})) (clojure.core/contains? input :sort-criteria) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sort-list (input :sort-criteria)) #:http.request.field{:name "SortCriteria", :shape "SortList"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"}))))

(clojure.core/defn- req-get-address-book-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :address-book-arn)) #:http.request.field{:name "AddressBookArn", :shape "Arn"})]}))

(clojure.core/defn- req-disassociate-skill-group-from-room-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :skill-group-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn (input :skill-group-arn)) #:http.request.field{:name "SkillGroupArn", :shape "Arn"})) (clojure.core/contains? input :room-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn (input :room-arn)) #:http.request.field{:name "RoomArn", :shape "Arn"}))))

(clojure.core/defn- req-search-rooms-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"})) (clojure.core/contains? input :filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-filter-list (input :filters)) #:http.request.field{:name "Filters", :shape "FilterList"})) (clojure.core/contains? input :sort-criteria) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sort-list (input :sort-criteria)) #:http.request.field{:name "SortCriteria", :shape "SortList"}))))

(clojure.core/defn- req-register-avs-device-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-client-id (input :client-id)) #:http.request.field{:name "ClientId", :shape "ClientId"}) (clojure.core/into (ser-user-code (input :user-code)) #:http.request.field{:name "UserCode", :shape "UserCode"}) (clojure.core/into (ser-product-id (input :product-id)) #:http.request.field{:name "ProductId", :shape "ProductId"}) (clojure.core/into (ser-device-serial-number-for-avs (input :device-serial-number)) #:http.request.field{:name "DeviceSerialNumber", :shape "DeviceSerialNumberForAVS"}) (clojure.core/into (ser-amazon-id (input :amazon-id)) #:http.request.field{:name "AmazonId", :shape "AmazonId"})]}))

(clojure.core/defn- req-associate-skill-with-skill-group-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-skill-id (input :skill-id)) #:http.request.field{:name "SkillId", :shape "SkillId"})]} (clojure.core/contains? input :skill-group-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn (input :skill-group-arn)) #:http.request.field{:name "SkillGroupArn", :shape "Arn"}))))

(clojure.core/defn- req-get-device-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :device-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn (input :device-arn)) #:http.request.field{:name "DeviceArn", :shape "Arn"}))))

(clojure.core/defn- req-update-device-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :device-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn (input :device-arn)) #:http.request.field{:name "DeviceArn", :shape "Arn"})) (clojure.core/contains? input :device-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-device-name (input :device-name)) #:http.request.field{:name "DeviceName", :shape "DeviceName"}))))

(clojure.core/defn- req-search-users-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"})) (clojure.core/contains? input :filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-filter-list (input :filters)) #:http.request.field{:name "Filters", :shape "FilterList"})) (clojure.core/contains? input :sort-criteria) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sort-list (input :sort-criteria)) #:http.request.field{:name "SortCriteria", :shape "SortList"}))))

(clojure.core/defn- req-delete-room-skill-parameter-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-skill-id (input :skill-id)) #:http.request.field{:name "SkillId", :shape "SkillId"}) (clojure.core/into (ser-room-skill-parameter-key (input :parameter-key)) #:http.request.field{:name "ParameterKey", :shape "RoomSkillParameterKey"})]} (clojure.core/contains? input :room-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn (input :room-arn)) #:http.request.field{:name "RoomArn", :shape "Arn"}))))

(clojure.core/defn- req-revoke-invitation-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :user-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn (input :user-arn)) #:http.request.field{:name "UserArn", :shape "Arn"})) (clojure.core/contains? input :enrollment-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-enrollment-id (input :enrollment-id)) #:http.request.field{:name "EnrollmentId", :shape "EnrollmentId"}))))

(clojure.core/defn- req-put-skill-authorization-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-authorization-result (input :authorization-result)) #:http.request.field{:name "AuthorizationResult", :shape "AuthorizationResult"}) (clojure.core/into (ser-skill-id (input :skill-id)) #:http.request.field{:name "SkillId", :shape "SkillId"})]} (clojure.core/contains? input :room-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn (input :room-arn)) #:http.request.field{:name "RoomArn", :shape "Arn"}))))

(clojure.core/defn- req-associate-skill-group-with-room-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :skill-group-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn (input :skill-group-arn)) #:http.request.field{:name "SkillGroupArn", :shape "Arn"})) (clojure.core/contains? input :room-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn (input :room-arn)) #:http.request.field{:name "RoomArn", :shape "Arn"}))))

(clojure.core/defn- req-reject-skill-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-skill-id (input :skill-id)) #:http.request.field{:name "SkillId", :shape "SkillId"})]}))

(clojure.core/defn- req-get-skill-group-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :skill-group-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn (input :skill-group-arn)) #:http.request.field{:name "SkillGroupArn", :shape "Arn"}))))

(clojure.core/defn- req-associate-contact-with-address-book-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :contact-arn)) #:http.request.field{:name "ContactArn", :shape "Arn"}) (clojure.core/into (ser-arn (input :address-book-arn)) #:http.request.field{:name "AddressBookArn", :shape "Arn"})]}))

(clojure.core/defn- req-get-conference-provider-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :conference-provider-arn)) #:http.request.field{:name "ConferenceProviderArn", :shape "Arn"})]}))

(clojure.core/defn- req-create-profile-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-profile-name (input :profile-name)) #:http.request.field{:name "ProfileName", :shape "ProfileName"}) (clojure.core/into (ser-timezone (input :timezone)) #:http.request.field{:name "Timezone", :shape "Timezone"}) (clojure.core/into (ser-address (input :address)) #:http.request.field{:name "Address", :shape "Address"}) (clojure.core/into (ser-distance-unit (input :distance-unit)) #:http.request.field{:name "DistanceUnit", :shape "DistanceUnit"}) (clojure.core/into (ser-temperature-unit (input :temperature-unit)) #:http.request.field{:name "TemperatureUnit", :shape "TemperatureUnit"}) (clojure.core/into (ser-wake-word (input :wake-word)) #:http.request.field{:name "WakeWord", :shape "WakeWord"})]} (clojure.core/contains? input :client-request-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-request-token (input :client-request-token)) #:http.request.field{:name "ClientRequestToken", :shape "ClientRequestToken", :idempotency-token true})) (clojure.core/contains? input :setup-mode-disabled) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :setup-mode-disabled)) #:http.request.field{:name "SetupModeDisabled", :shape "Boolean"})) (clojure.core/contains? input :pstn-enabled) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :pstn-enabled)) #:http.request.field{:name "PSTNEnabled", :shape "Boolean"})) (clojure.core/contains? input :max-volume-limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-volume-limit (input :max-volume-limit)) #:http.request.field{:name "MaxVolumeLimit", :shape "MaxVolumeLimit"}))))

(clojure.core/defn- req-resolve-room-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-user-id (input :user-id)) #:http.request.field{:name "UserId", :shape "UserId"}) (clojure.core/into (ser-skill-id (input :skill-id)) #:http.request.field{:name "SkillId", :shape "SkillId"})]}))

(clojure.core/defn- req-delete-address-book-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :address-book-arn)) #:http.request.field{:name "AddressBookArn", :shape "Arn"})]}))

(clojure.core/defn- req-create-contact-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-contact-name (input :first-name)) #:http.request.field{:name "FirstName", :shape "ContactName"})]} (clojure.core/contains? input :display-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-contact-name (input :display-name)) #:http.request.field{:name "DisplayName", :shape "ContactName"})) (clojure.core/contains? input :last-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-contact-name (input :last-name)) #:http.request.field{:name "LastName", :shape "ContactName"})) (clojure.core/contains? input :phone-number) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-e-164-phone-number (input :phone-number)) #:http.request.field{:name "PhoneNumber", :shape "E164PhoneNumber"})) (clojure.core/contains? input :client-request-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-request-token (input :client-request-token)) #:http.request.field{:name "ClientRequestToken", :shape "ClientRequestToken", :idempotency-token true}))))

(clojure.core/defn- req-tag-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :arn)) #:http.request.field{:name "Arn", :shape "Arn"}) (clojure.core/into (ser-tag-list (input :tags)) #:http.request.field{:name "Tags", :shape "TagList"})]}))

(clojure.core/defn- req-list-skills-store-categories-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"}))))

(clojure.core/defn- req-delete-skill-group-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :skill-group-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn (input :skill-group-arn)) #:http.request.field{:name "SkillGroupArn", :shape "Arn"}))))

(clojure.core/defn- req-search-contacts-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-filter-list (input :filters)) #:http.request.field{:name "Filters", :shape "FilterList"})) (clojure.core/contains? input :sort-criteria) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sort-list (input :sort-criteria)) #:http.request.field{:name "SortCriteria", :shape "SortList"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"}))))

(clojure.core/defn- req-get-room-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :room-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn (input :room-arn)) #:http.request.field{:name "RoomArn", :shape "Arn"}))))

(clojure.core/defn- req-update-conference-provider-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :conference-provider-arn)) #:http.request.field{:name "ConferenceProviderArn", :shape "Arn"}) (clojure.core/into (ser-conference-provider-type (input :conference-provider-type)) #:http.request.field{:name "ConferenceProviderType", :shape "ConferenceProviderType"}) (clojure.core/into (ser-meeting-setting (input :meeting-setting)) #:http.request.field{:name "MeetingSetting", :shape "MeetingSetting"})]} (clojure.core/contains? input :ip-dial-in) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ip-dial-in (input :ip-dial-in)) #:http.request.field{:name "IPDialIn", :shape "IPDialIn"})) (clojure.core/contains? input :pstn-dial-in) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pstn-dial-in (input :pstn-dial-in)) #:http.request.field{:name "PSTNDialIn", :shape "PSTNDialIn"}))))

(clojure.core/defn- req-approve-skill-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-skill-id (input :skill-id)) #:http.request.field{:name "SkillId", :shape "SkillId"})]}))

(clojure.core/defn- req-search-skill-groups-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"})) (clojure.core/contains? input :filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-filter-list (input :filters)) #:http.request.field{:name "Filters", :shape "FilterList"})) (clojure.core/contains? input :sort-criteria) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sort-list (input :sort-criteria)) #:http.request.field{:name "SortCriteria", :shape "SortList"}))))

(clojure.core/defn- req-get-room-skill-parameter-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-skill-id (input :skill-id)) #:http.request.field{:name "SkillId", :shape "SkillId"}) (clojure.core/into (ser-room-skill-parameter-key (input :parameter-key)) #:http.request.field{:name "ParameterKey", :shape "RoomSkillParameterKey"})]} (clojure.core/contains? input :room-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn (input :room-arn)) #:http.request.field{:name "RoomArn", :shape "Arn"}))))

(clojure.core/defn- req-delete-business-report-schedule-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :schedule-arn)) #:http.request.field{:name "ScheduleArn", :shape "Arn"})]}))

(clojure.core/defn- req-create-address-book-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-address-book-name (input :name)) #:http.request.field{:name "Name", :shape "AddressBookName"})]} (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-address-book-description (input :description)) #:http.request.field{:name "Description", :shape "AddressBookDescription"})) (clojure.core/contains? input :client-request-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-request-token (input :client-request-token)) #:http.request.field{:name "ClientRequestToken", :shape "ClientRequestToken", :idempotency-token true}))))

(clojure.core/defn- req-get-conference-preference-request [input] (clojure.core/cond-> {}))

(clojure.core/defn- req-start-device-sync-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-features (input :features)) #:http.request.field{:name "Features", :shape "Features"})]} (clojure.core/contains? input :room-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn (input :room-arn)) #:http.request.field{:name "RoomArn", :shape "Arn"})) (clojure.core/contains? input :device-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn (input :device-arn)) #:http.request.field{:name "DeviceArn", :shape "Arn"}))))

(clojure.core/defn- req-update-business-report-schedule-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :schedule-arn)) #:http.request.field{:name "ScheduleArn", :shape "Arn"})]} (clojure.core/contains? input :s-3-bucket-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-customer-s-3-bucket-name (input :s-3-bucket-name)) #:http.request.field{:name "S3BucketName", :shape "CustomerS3BucketName"})) (clojure.core/contains? input :s-3-key-prefix) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-key-prefix (input :s-3-key-prefix)) #:http.request.field{:name "S3KeyPrefix", :shape "S3KeyPrefix"})) (clojure.core/contains? input :format) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-business-report-format (input :format)) #:http.request.field{:name "Format", :shape "BusinessReportFormat"})) (clojure.core/contains? input :schedule-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-business-report-schedule-name (input :schedule-name)) #:http.request.field{:name "ScheduleName", :shape "BusinessReportScheduleName"})) (clojure.core/contains? input :recurrence) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-business-report-recurrence (input :recurrence)) #:http.request.field{:name "Recurrence", :shape "BusinessReportRecurrence"}))))

(clojure.core/defn- req-delete-device-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :device-arn)) #:http.request.field{:name "DeviceArn", :shape "Arn"})]}))

(clojure.core/defn- req-disassociate-skill-from-users-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-skill-id (input :skill-id)) #:http.request.field{:name "SkillId", :shape "SkillId"})]}))

(clojure.core/defn- req-get-invitation-configuration-request [input] (clojure.core/cond-> {}))

(clojure.core/defn- req-list-conference-providers-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"}))))

(clojure.core/defn- req-list-skills-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :skill-group-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn (input :skill-group-arn)) #:http.request.field{:name "SkillGroupArn", :shape "Arn"})) (clojure.core/contains? input :enablement-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-enablement-type-filter (input :enablement-type)) #:http.request.field{:name "EnablementType", :shape "EnablementTypeFilter"})) (clojure.core/contains? input :skill-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-skill-type-filter (input :skill-type)) #:http.request.field{:name "SkillType", :shape "SkillTypeFilter"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-skill-list-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "SkillListMaxResults"}))))

(clojure.core/defn- req-update-address-book-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :address-book-arn)) #:http.request.field{:name "AddressBookArn", :shape "Arn"})]} (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-address-book-name (input :name)) #:http.request.field{:name "Name", :shape "AddressBookName"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-address-book-description (input :description)) #:http.request.field{:name "Description", :shape "AddressBookDescription"}))))

(clojure.core/defn- req-start-smart-home-appliance-discovery-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :room-arn)) #:http.request.field{:name "RoomArn", :shape "Arn"})]}))

(clojure.core/defn- req-create-conference-provider-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-conference-provider-name (input :conference-provider-name)) #:http.request.field{:name "ConferenceProviderName", :shape "ConferenceProviderName"}) (clojure.core/into (ser-conference-provider-type (input :conference-provider-type)) #:http.request.field{:name "ConferenceProviderType", :shape "ConferenceProviderType"}) (clojure.core/into (ser-meeting-setting (input :meeting-setting)) #:http.request.field{:name "MeetingSetting", :shape "MeetingSetting"})]} (clojure.core/contains? input :ip-dial-in) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ip-dial-in (input :ip-dial-in)) #:http.request.field{:name "IPDialIn", :shape "IPDialIn"})) (clojure.core/contains? input :pstn-dial-in) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pstn-dial-in (input :pstn-dial-in)) #:http.request.field{:name "PSTNDialIn", :shape "PSTNDialIn"})) (clojure.core/contains? input :client-request-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-request-token (input :client-request-token)) #:http.request.field{:name "ClientRequestToken", :shape "ClientRequestToken", :idempotency-token true}))))

(clojure.core/defn- req-create-user-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (seruser-user-id (input :user-id)) #:http.request.field{:name "UserId", :shape "user_UserId"})]} (clojure.core/contains? input :first-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (seruser-first-name (input :first-name)) #:http.request.field{:name "FirstName", :shape "user_FirstName"})) (clojure.core/contains? input :last-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (seruser-last-name (input :last-name)) #:http.request.field{:name "LastName", :shape "user_LastName"})) (clojure.core/contains? input :email) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-email (input :email)) #:http.request.field{:name "Email", :shape "Email"})) (clojure.core/contains? input :client-request-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-request-token (input :client-request-token)) #:http.request.field{:name "ClientRequestToken", :shape "ClientRequestToken", :idempotency-token true})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-list (input :tags)) #:http.request.field{:name "Tags", :shape "TagList"}))))

(clojure.core/defn- req-disassociate-contact-from-address-book-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :contact-arn)) #:http.request.field{:name "ContactArn", :shape "Arn"}) (clojure.core/into (ser-arn (input :address-book-arn)) #:http.request.field{:name "AddressBookArn", :shape "Arn"})]}))

(clojure.core/defn- req-search-profiles-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"})) (clojure.core/contains? input :filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-filter-list (input :filters)) #:http.request.field{:name "Filters", :shape "FilterList"})) (clojure.core/contains? input :sort-criteria) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sort-list (input :sort-criteria)) #:http.request.field{:name "SortCriteria", :shape "SortList"}))))

(clojure.core/defn- req-create-skill-group-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-skill-group-name (input :skill-group-name)) #:http.request.field{:name "SkillGroupName", :shape "SkillGroupName"})]} (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-skill-group-description (input :description)) #:http.request.field{:name "Description", :shape "SkillGroupDescription"})) (clojure.core/contains? input :client-request-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-request-token (input :client-request-token)) #:http.request.field{:name "ClientRequestToken", :shape "ClientRequestToken", :idempotency-token true}))))

(clojure.core/defn- req-update-contact-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :contact-arn)) #:http.request.field{:name "ContactArn", :shape "Arn"})]} (clojure.core/contains? input :display-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-contact-name (input :display-name)) #:http.request.field{:name "DisplayName", :shape "ContactName"})) (clojure.core/contains? input :first-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-contact-name (input :first-name)) #:http.request.field{:name "FirstName", :shape "ContactName"})) (clojure.core/contains? input :last-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-contact-name (input :last-name)) #:http.request.field{:name "LastName", :shape "ContactName"})) (clojure.core/contains? input :phone-number) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-e-164-phone-number (input :phone-number)) #:http.request.field{:name "PhoneNumber", :shape "E164PhoneNumber"}))))

(clojure.core/defn- req-update-room-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :room-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn (input :room-arn)) #:http.request.field{:name "RoomArn", :shape "Arn"})) (clojure.core/contains? input :room-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-room-name (input :room-name)) #:http.request.field{:name "RoomName", :shape "RoomName"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-room-description (input :description)) #:http.request.field{:name "Description", :shape "RoomDescription"})) (clojure.core/contains? input :provider-calendar-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-provider-calendar-id (input :provider-calendar-id)) #:http.request.field{:name "ProviderCalendarId", :shape "ProviderCalendarId"})) (clojure.core/contains? input :profile-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn (input :profile-arn)) #:http.request.field{:name "ProfileArn", :shape "Arn"}))))

(clojure.core/defn- req-delete-user-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-enrollment-id (input :enrollment-id)) #:http.request.field{:name "EnrollmentId", :shape "EnrollmentId"})]} (clojure.core/contains? input :user-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn (input :user-arn)) #:http.request.field{:name "UserArn", :shape "Arn"}))))

(clojure.core/defn- req-create-room-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-room-name (input :room-name)) #:http.request.field{:name "RoomName", :shape "RoomName"})]} (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-room-description (input :description)) #:http.request.field{:name "Description", :shape "RoomDescription"})) (clojure.core/contains? input :profile-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn (input :profile-arn)) #:http.request.field{:name "ProfileArn", :shape "Arn"})) (clojure.core/contains? input :provider-calendar-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-provider-calendar-id (input :provider-calendar-id)) #:http.request.field{:name "ProviderCalendarId", :shape "ProviderCalendarId"})) (clojure.core/contains? input :client-request-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-request-token (input :client-request-token)) #:http.request.field{:name "ClientRequestToken", :shape "ClientRequestToken", :idempotency-token true})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-list (input :tags)) #:http.request.field{:name "Tags", :shape "TagList"}))))

(clojure.core/defn- req-delete-skill-authorization-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-skill-id (input :skill-id)) #:http.request.field{:name "SkillId", :shape "SkillId"})]} (clojure.core/contains? input :room-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn (input :room-arn)) #:http.request.field{:name "RoomArn", :shape "Arn"}))))

(clojure.core/defn- req-send-invitation-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :user-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn (input :user-arn)) #:http.request.field{:name "UserArn", :shape "Arn"}))))

(clojure.core/defn- req-put-conference-preference-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-conference-preference (input :conference-preference)) #:http.request.field{:name "ConferencePreference", :shape "ConferencePreference"})]}))

(clojure.core/defn- req-put-room-skill-parameter-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-skill-id (input :skill-id)) #:http.request.field{:name "SkillId", :shape "SkillId"}) (clojure.core/into (ser-room-skill-parameter (input :room-skill-parameter)) #:http.request.field{:name "RoomSkillParameter", :shape "RoomSkillParameter"})]} (clojure.core/contains? input :room-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn (input :room-arn)) #:http.request.field{:name "RoomArn", :shape "Arn"}))))

(clojure.core/defn- req-update-skill-group-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :skill-group-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn (input :skill-group-arn)) #:http.request.field{:name "SkillGroupArn", :shape "Arn"})) (clojure.core/contains? input :skill-group-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-skill-group-name (input :skill-group-name)) #:http.request.field{:name "SkillGroupName", :shape "SkillGroupName"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-skill-group-description (input :description)) #:http.request.field{:name "Description", :shape "SkillGroupDescription"}))))

(clojure.core/defn- req-list-skills-store-skills-by-category-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-category-id (input :category-id)) #:http.request.field{:name "CategoryId", :shape "CategoryId"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-skill-list-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "SkillListMaxResults"}))))

(clojure.core/defn- req-associate-device-with-room-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :device-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn (input :device-arn)) #:http.request.field{:name "DeviceArn", :shape "Arn"})) (clojure.core/contains? input :room-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn (input :room-arn)) #:http.request.field{:name "RoomArn", :shape "Arn"}))))

(clojure.core/defn- req-get-contact-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :contact-arn)) #:http.request.field{:name "ContactArn", :shape "Arn"})]}))

(clojure.core/defn- req-create-business-report-schedule-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-business-report-format (input :format)) #:http.request.field{:name "Format", :shape "BusinessReportFormat"}) (clojure.core/into (ser-business-report-content-range (input :content-range)) #:http.request.field{:name "ContentRange", :shape "BusinessReportContentRange"})]} (clojure.core/contains? input :schedule-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-business-report-schedule-name (input :schedule-name)) #:http.request.field{:name "ScheduleName", :shape "BusinessReportScheduleName"})) (clojure.core/contains? input :s-3-bucket-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-customer-s-3-bucket-name (input :s-3-bucket-name)) #:http.request.field{:name "S3BucketName", :shape "CustomerS3BucketName"})) (clojure.core/contains? input :s-3-key-prefix) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-key-prefix (input :s-3-key-prefix)) #:http.request.field{:name "S3KeyPrefix", :shape "S3KeyPrefix"})) (clojure.core/contains? input :recurrence) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-business-report-recurrence (input :recurrence)) #:http.request.field{:name "Recurrence", :shape "BusinessReportRecurrence"})) (clojure.core/contains? input :client-request-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-request-token (input :client-request-token)) #:http.request.field{:name "ClientRequestToken", :shape "ClientRequestToken", :idempotency-token true}))))

(clojure.core/defn- req-list-smart-home-appliances-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :room-arn)) #:http.request.field{:name "RoomArn", :shape "Arn"})]} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"}))))

(clojure.core/defn- req-list-business-report-schedules-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"}))))

(clojure.core/defn- req-delete-profile-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :profile-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn (input :profile-arn)) #:http.request.field{:name "ProfileArn", :shape "Arn"}))))

(clojure.core/defn- req-delete-contact-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :contact-arn)) #:http.request.field{:name "ContactArn", :shape "Arn"})]}))

(clojure.core/defn- req-untag-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :arn)) #:http.request.field{:name "Arn", :shape "Arn"}) (clojure.core/into (ser-tag-key-list (input :tag-keys)) #:http.request.field{:name "TagKeys", :shape "TagKeyList"})]}))

(clojure.core/defn- req-list-tags-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :arn)) #:http.request.field{:name "Arn", :shape "Arn"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"}))))

(clojure.core/declare deser-skill-name)

(clojure.core/declare deserboolean)

(clojure.core/declare deser-address)

(clojure.core/declare deser-business-report-recurrence)

(clojure.core/declare deser-ip-dial-in)

(clojure.core/declare deser-device-serial-number)

(clojure.core/declare deser-client-request-token)

(clojure.core/declare deser-conference-provider)

(clojure.core/declare deser-privacy-policy)

(clojure.core/declare deser-provider-calendar-id)

(clojure.core/declare deser-device-status-details)

(clojure.core/declare deser-software-version)

(clojure.core/declare deser-conference-providers-list)

(clojure.core/declare deser-email)

(clojure.core/declare deser-short-skill-id-list)

(clojure.core/declare deser-device-status-info)

(clojure.core/declare deser-category)

(clojure.core/declare deser-enrollment-id)

(clojure.core/declare deser-room)

(clojure.core/declare deser-wake-word)

(clojure.core/declare deser-profile-data)

(clojure.core/declare deser-contact-name)

(clojure.core/declare deser-address-book-data-list)

(clojure.core/declare deser-address-book-description)

(clojure.core/declare deser-developer-name)

(clojure.core/declare deser-conference-preference)

(clojure.core/declare deser-mac-address)

(clojure.core/declare deser-skill-group)

(clojure.core/declare deser-tag-key)

(clojure.core/declare deser-business-report-schedule-name)

(clojure.core/declare deser-category-list)

(clojure.core/declare deser-country-code)

(clojure.core/declare deser-generic-keywords)

(clojure.core/declare deser-skill-group-name)

(clojure.core/declare deser-organization-name)

(clojure.core/declare deser-pstn-dial-in)

(clojure.core/declare deser-room-skill-parameter)

(clojure.core/declare deser-short-description)

(clojure.core/declare deser-address-book-data)

(clojure.core/declare deser-device-status-detail-code)

(clojure.core/declare deser-device-status-detail)

(clojure.core/declare deser-device-data-list)

(clojure.core/declare deser-appliance-friendly-name)

(clojure.core/declare deser-skills-store-skill-list)

(clojure.core/declare deser-room-skill-parameters)

(clojure.core/declare deser-conference-provider-type)

(clojure.core/declare deser-contact)

(clojure.core/declare deser-next-token)

(clojure.core/declare deser-sample-utterances)

(clojure.core/declare deser-error-message)

(clojure.core/declare deser-review-value)

(clojure.core/declare deser-connection-status)

(clojure.core/declare deser-date)

(clojure.core/declare deser-business-report-status)

(clojure.core/declare deser-review-key)

(clojure.core/declare deser-conference-provider-name)

(clojure.core/declare deser-device-event)

(clojure.core/declare deser-address-book-name)

(clojure.core/declare deser-outbound-phone-number)

(clojure.core/declare deser-comms-protocol)

(clojure.core/declare deser-skill-summary-list)

(clojure.core/declare deser-skill-group-data-list)

(clojure.core/declare deser-tag-list)

(clojure.core/declare deser-category-id)

(clojure.core/declare deser-timezone)

(clojure.core/declare deser-one-click-pin-delay)

(clojure.core/declare deser-skill-summary)

(clojure.core/declare deser-skill-details)

(clojure.core/declare deser-utterance)

(clojure.core/declare deser-appliance-description)

(clojure.core/declare deser-device-data)

(clojure.core/declare deser-profile)

(clojure.core/declare deser-url)

(clojure.core/declare deseruser-first-name)

(clojure.core/declare deser-require-pin)

(clojure.core/declare deser-tag-value)

(clojure.core/declare deser-total-count)

(clojure.core/declare deser-device-type)

(clojure.core/declare deser-customer-s-3-bucket-name)

(clojure.core/declare deser-profile-data-list)

(clojure.core/declare deser-max-volume-limit)

(clojure.core/declare deser-device-status)

(clojure.core/declare deser-address-book)

(clojure.core/declare deser-business-report-schedule)

(clojure.core/declare deser-one-click-id-delay)

(clojure.core/declare deser-business-report-s-3-path)

(clojure.core/declare deser-user-data-list)

(clojure.core/declare deser-release-date)

(clojure.core/declare deser-room-description)

(clojure.core/declare deser-appliance-manufacturer-name)

(clojure.core/declare deser-business-report-failure-code)

(clojure.core/declare deser-room-skill-parameter-key)

(clojure.core/declare deser-s-3-key-prefix)

(clojure.core/declare deser-product-description)

(clojure.core/declare deser-arn)

(clojure.core/declare deser-skills-store-skill)

(clojure.core/declare deser-endpoint)

(clojure.core/declare deseruser-last-name)

(clojure.core/declare deser-device-name)

(clojure.core/declare deser-temperature-unit)

(clojure.core/declare deser-timestamp)

(clojure.core/declare deser-category-name)

(clojure.core/declare deser-room-skill-parameter-value)

(clojure.core/declare deser-contact-data)

(clojure.core/declare deser-business-report-content-range)

(clojure.core/declare deser-distance-unit)

(clojure.core/declare deser-developer-info)

(clojure.core/declare deser-tag)

(clojure.core/declare deser-business-report-format)

(clojure.core/declare deser-business-report-schedule-list)

(clojure.core/declare deser-skill-store-type)

(clojure.core/declare deser-reviews)

(clojure.core/declare deser-business-report-interval)

(clojure.core/declare deser-business-report-download-url)

(clojure.core/declare deser-icon-url)

(clojure.core/declare deser-room-data)

(clojure.core/declare deser-device-event-value)

(clojure.core/declare deser-device-event-list)

(clojure.core/declare deser-bullet-point)

(clojure.core/declare deser-enablement-type)

(clojure.core/declare deser-device-event-type)

(clojure.core/declare deser-e-164-phone-number)

(clojure.core/declare deser-contact-data-list)

(clojure.core/declare deser-bullet-points)

(clojure.core/declare deser-skill-types)

(clojure.core/declare deser-business-report)

(clojure.core/declare deser-new-in-this-version-bullet-points)

(clojure.core/declare deser-skill-group-description)

(clojure.core/declare deser-room-name)

(clojure.core/declare deser-device)

(clojure.core/declare deser-generic-keyword)

(clojure.core/declare deser-user-data)

(clojure.core/declare deser-smart-home-appliance)

(clojure.core/declare deser-skill-type)

(clojure.core/declare deser-end-user-license-agreement)

(clojure.core/declare deser-skill-id)

(clojure.core/declare deser-profile-name)

(clojure.core/declare deser-skill-group-data)

(clojure.core/declare deser-invocation-phrase)

(clojure.core/declare deser-smart-home-appliance-list)

(clojure.core/declare deser-enrollment-status)

(clojure.core/declare deser-business-report-s-3-location)

(clojure.core/declare deser-boolean)

(clojure.core/declare deser-meeting-setting)

(clojure.core/declare deser-room-data-list)

(clojure.core/defn- deser-skill-name [input] input)

(clojure.core/defn- deserboolean [input] input)

(clojure.core/defn- deser-address [input] input)

(clojure.core/defn- deser-business-report-recurrence [input] (clojure.core/cond-> {} (clojure.core/contains? input "StartDate") (clojure.core/assoc :start-date (deser-date (input "StartDate")))))

(clojure.core/defn- deser-ip-dial-in [input] (clojure.core/cond-> {:endpoint (deser-endpoint (input "Endpoint")), :comms-protocol (deser-comms-protocol (input "CommsProtocol"))}))

(clojure.core/defn- deser-device-serial-number [input] input)

(clojure.core/defn- deser-client-request-token [input] input)

(clojure.core/defn- deser-conference-provider [input] (clojure.core/cond-> {} (clojure.core/contains? input "Arn") (clojure.core/assoc :arn (deser-arn (input "Arn"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-conference-provider-name (input "Name"))) (clojure.core/contains? input "Type") (clojure.core/assoc :type (deser-conference-provider-type (input "Type"))) (clojure.core/contains? input "IPDialIn") (clojure.core/assoc :ip-dial-in (deser-ip-dial-in (input "IPDialIn"))) (clojure.core/contains? input "PSTNDialIn") (clojure.core/assoc :pstn-dial-in (deser-pstn-dial-in (input "PSTNDialIn"))) (clojure.core/contains? input "MeetingSetting") (clojure.core/assoc :meeting-setting (deser-meeting-setting (input "MeetingSetting")))))

(clojure.core/defn- deser-privacy-policy [input] input)

(clojure.core/defn- deser-provider-calendar-id [input] input)

(clojure.core/defn- deser-device-status-details [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-device-status-detail coll))) input))

(clojure.core/defn- deser-software-version [input] input)

(clojure.core/defn- deser-conference-providers-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-conference-provider coll))) input))

(clojure.core/defn- deser-email [input] input)

(clojure.core/defn- deser-short-skill-id-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-skill-id coll))) input))

(clojure.core/defn- deser-device-status-info [input] (clojure.core/cond-> {} (clojure.core/contains? input "DeviceStatusDetails") (clojure.core/assoc :device-status-details (deser-device-status-details (input "DeviceStatusDetails"))) (clojure.core/contains? input "ConnectionStatus") (clojure.core/assoc :connection-status (deser-connection-status (input "ConnectionStatus")))))

(clojure.core/defn- deser-category [input] (clojure.core/cond-> {} (clojure.core/contains? input "CategoryId") (clojure.core/assoc :category-id (deser-category-id (input "CategoryId"))) (clojure.core/contains? input "CategoryName") (clojure.core/assoc :category-name (deser-category-name (input "CategoryName")))))

(clojure.core/defn- deser-enrollment-id [input] input)

(clojure.core/defn- deser-room [input] (clojure.core/cond-> {} (clojure.core/contains? input "RoomArn") (clojure.core/assoc :room-arn (deser-arn (input "RoomArn"))) (clojure.core/contains? input "RoomName") (clojure.core/assoc :room-name (deser-room-name (input "RoomName"))) (clojure.core/contains? input "Description") (clojure.core/assoc :description (deser-room-description (input "Description"))) (clojure.core/contains? input "ProviderCalendarId") (clojure.core/assoc :provider-calendar-id (deser-provider-calendar-id (input "ProviderCalendarId"))) (clojure.core/contains? input "ProfileArn") (clojure.core/assoc :profile-arn (deser-arn (input "ProfileArn")))))

(clojure.core/defn- deser-wake-word [input] (clojure.core/get {"ALEXA" :alexa, "AMAZON" :amazon, "ECHO" :echo, "COMPUTER" :computer} input))

(clojure.core/defn- deser-profile-data [input] (clojure.core/cond-> {} (clojure.core/contains? input "ProfileArn") (clojure.core/assoc :profile-arn (deser-arn (input "ProfileArn"))) (clojure.core/contains? input "ProfileName") (clojure.core/assoc :profile-name (deser-profile-name (input "ProfileName"))) (clojure.core/contains? input "IsDefault") (clojure.core/assoc :is-default (deser-boolean (input "IsDefault"))) (clojure.core/contains? input "Address") (clojure.core/assoc :address (deser-address (input "Address"))) (clojure.core/contains? input "Timezone") (clojure.core/assoc :timezone (deser-timezone (input "Timezone"))) (clojure.core/contains? input "DistanceUnit") (clojure.core/assoc :distance-unit (deser-distance-unit (input "DistanceUnit"))) (clojure.core/contains? input "TemperatureUnit") (clojure.core/assoc :temperature-unit (deser-temperature-unit (input "TemperatureUnit"))) (clojure.core/contains? input "WakeWord") (clojure.core/assoc :wake-word (deser-wake-word (input "WakeWord")))))

(clojure.core/defn- deser-contact-name [input] input)

(clojure.core/defn- deser-address-book-data-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-address-book-data coll))) input))

(clojure.core/defn- deser-address-book-description [input] input)

(clojure.core/defn- deser-developer-name [input] input)

(clojure.core/defn- deser-conference-preference [input] (clojure.core/cond-> {} (clojure.core/contains? input "DefaultConferenceProviderArn") (clojure.core/assoc :default-conference-provider-arn (deser-arn (input "DefaultConferenceProviderArn")))))

(clojure.core/defn- deser-mac-address [input] input)

(clojure.core/defn- deser-skill-group [input] (clojure.core/cond-> {} (clojure.core/contains? input "SkillGroupArn") (clojure.core/assoc :skill-group-arn (deser-arn (input "SkillGroupArn"))) (clojure.core/contains? input "SkillGroupName") (clojure.core/assoc :skill-group-name (deser-skill-group-name (input "SkillGroupName"))) (clojure.core/contains? input "Description") (clojure.core/assoc :description (deser-skill-group-description (input "Description")))))

(clojure.core/defn- deser-tag-key [input] input)

(clojure.core/defn- deser-business-report-schedule-name [input] input)

(clojure.core/defn- deser-category-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-category coll))) input))

(clojure.core/defn- deser-country-code [input] input)

(clojure.core/defn- deser-generic-keywords [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-generic-keyword coll))) input))

(clojure.core/defn- deser-skill-group-name [input] input)

(clojure.core/defn- deser-organization-name [input] input)

(clojure.core/defn- deser-pstn-dial-in [input] (clojure.core/cond-> {:country-code (deser-country-code (input "CountryCode")), :phone-number (deser-outbound-phone-number (input "PhoneNumber")), :one-click-id-delay (deser-one-click-id-delay (input "OneClickIdDelay")), :one-click-pin-delay (deser-one-click-pin-delay (input "OneClickPinDelay"))}))

(clojure.core/defn- deser-room-skill-parameter [input] (clojure.core/cond-> {:parameter-key (deser-room-skill-parameter-key (input "ParameterKey")), :parameter-value (deser-room-skill-parameter-value (input "ParameterValue"))}))

(clojure.core/defn- deser-short-description [input] input)

(clojure.core/defn- deser-address-book-data [input] (clojure.core/cond-> {} (clojure.core/contains? input "AddressBookArn") (clojure.core/assoc :address-book-arn (deser-arn (input "AddressBookArn"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-address-book-name (input "Name"))) (clojure.core/contains? input "Description") (clojure.core/assoc :description (deser-address-book-description (input "Description")))))

(clojure.core/defn- deser-device-status-detail-code [input] (clojure.core/get {"DEVICE_SOFTWARE_UPDATE_NEEDED" :device-software-update-needed, "DEVICE_WAS_OFFLINE" :device-was-offline} input))

(clojure.core/defn- deser-device-status-detail [input] (clojure.core/cond-> {} (clojure.core/contains? input "Code") (clojure.core/assoc :code (deser-device-status-detail-code (input "Code")))))

(clojure.core/defn- deser-device-data-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-device-data coll))) input))

(clojure.core/defn- deser-appliance-friendly-name [input] input)

(clojure.core/defn- deser-skills-store-skill-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-skills-store-skill coll))) input))

(clojure.core/defn- deser-room-skill-parameters [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-room-skill-parameter coll))) input))

(clojure.core/defn- deser-conference-provider-type [input] (clojure.core/get {"CUSTOM" :custom, "BLUEJEANS" :bluejeans, "WEBEX" :webex, "FUZE" :fuze, "GOOGLE_HANGOUTS" :google-hangouts, "ZOOM" :zoom, "RINGCENTRAL" :ringcentral, "POLYCOM" :polycom, "SKYPE_FOR_BUSINESS" :skype-for-business, "CHIME" :chime} input))

(clojure.core/defn- deser-contact [input] (clojure.core/cond-> {} (clojure.core/contains? input "ContactArn") (clojure.core/assoc :contact-arn (deser-arn (input "ContactArn"))) (clojure.core/contains? input "DisplayName") (clojure.core/assoc :display-name (deser-contact-name (input "DisplayName"))) (clojure.core/contains? input "FirstName") (clojure.core/assoc :first-name (deser-contact-name (input "FirstName"))) (clojure.core/contains? input "LastName") (clojure.core/assoc :last-name (deser-contact-name (input "LastName"))) (clojure.core/contains? input "PhoneNumber") (clojure.core/assoc :phone-number (deser-e-164-phone-number (input "PhoneNumber")))))

(clojure.core/defn- deser-next-token [input] input)

(clojure.core/defn- deser-sample-utterances [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-utterance coll))) input))

(clojure.core/defn- deser-error-message [input] input)

(clojure.core/defn- deser-review-value [input] input)

(clojure.core/defn- deser-connection-status [input] (clojure.core/get {"ONLINE" :online, "OFFLINE" :offline} input))

(clojure.core/defn- deser-date [input] input)

(clojure.core/defn- deser-business-report-status [input] (clojure.core/get {"RUNNING" :running, "SUCCEEDED" :succeeded, "FAILED" :failed} input))

(clojure.core/defn- deser-review-key [input] input)

(clojure.core/defn- deser-conference-provider-name [input] input)

(clojure.core/defn- deser-device-event [input] (clojure.core/cond-> {} (clojure.core/contains? input "Type") (clojure.core/assoc :type (deser-device-event-type (input "Type"))) (clojure.core/contains? input "Value") (clojure.core/assoc :value (deser-device-event-value (input "Value"))) (clojure.core/contains? input "Timestamp") (clojure.core/assoc :timestamp (deser-timestamp (input "Timestamp")))))

(clojure.core/defn- deser-address-book-name [input] input)

(clojure.core/defn- deser-outbound-phone-number [input] input)

(clojure.core/defn- deser-comms-protocol [input] (clojure.core/get {"SIP" :sip, "SIPS" :sips, "H323" :h-323} input))

(clojure.core/defn- deser-skill-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-skill-summary coll))) input))

(clojure.core/defn- deser-skill-group-data-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-skill-group-data coll))) input))

(clojure.core/defn- deser-tag-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-tag coll))) input))

(clojure.core/defn- deser-category-id [input] input)

(clojure.core/defn- deser-timezone [input] input)

(clojure.core/defn- deser-one-click-pin-delay [input] input)

(clojure.core/defn- deser-skill-summary [input] (clojure.core/cond-> {} (clojure.core/contains? input "SkillId") (clojure.core/assoc :skill-id (deser-skill-id (input "SkillId"))) (clojure.core/contains? input "SkillName") (clojure.core/assoc :skill-name (deser-skill-name (input "SkillName"))) (clojure.core/contains? input "SupportsLinking") (clojure.core/assoc :supports-linking (deserboolean (input "SupportsLinking"))) (clojure.core/contains? input "EnablementType") (clojure.core/assoc :enablement-type (deser-enablement-type (input "EnablementType"))) (clojure.core/contains? input "SkillType") (clojure.core/assoc :skill-type (deser-skill-type (input "SkillType")))))

(clojure.core/defn- deser-skill-details [input] (clojure.core/cond-> {} (clojure.core/contains? input "GenericKeywords") (clojure.core/assoc :generic-keywords (deser-generic-keywords (input "GenericKeywords"))) (clojure.core/contains? input "ReleaseDate") (clojure.core/assoc :release-date (deser-release-date (input "ReleaseDate"))) (clojure.core/contains? input "ProductDescription") (clojure.core/assoc :product-description (deser-product-description (input "ProductDescription"))) (clojure.core/contains? input "DeveloperInfo") (clojure.core/assoc :developer-info (deser-developer-info (input "DeveloperInfo"))) (clojure.core/contains? input "Reviews") (clojure.core/assoc :reviews (deser-reviews (input "Reviews"))) (clojure.core/contains? input "BulletPoints") (clojure.core/assoc :bullet-points (deser-bullet-points (input "BulletPoints"))) (clojure.core/contains? input "SkillTypes") (clojure.core/assoc :skill-types (deser-skill-types (input "SkillTypes"))) (clojure.core/contains? input "NewInThisVersionBulletPoints") (clojure.core/assoc :new-in-this-version-bullet-points (deser-new-in-this-version-bullet-points (input "NewInThisVersionBulletPoints"))) (clojure.core/contains? input "EndUserLicenseAgreement") (clojure.core/assoc :end-user-license-agreement (deser-end-user-license-agreement (input "EndUserLicenseAgreement"))) (clojure.core/contains? input "InvocationPhrase") (clojure.core/assoc :invocation-phrase (deser-invocation-phrase (input "InvocationPhrase")))))

(clojure.core/defn- deser-utterance [input] input)

(clojure.core/defn- deser-appliance-description [input] input)

(clojure.core/defn- deser-device-data [input] (clojure.core/cond-> {} (clojure.core/contains? input "DeviceSerialNumber") (clojure.core/assoc :device-serial-number (deser-device-serial-number (input "DeviceSerialNumber"))) (clojure.core/contains? input "SoftwareVersion") (clojure.core/assoc :software-version (deser-software-version (input "SoftwareVersion"))) (clojure.core/contains? input "DeviceStatusInfo") (clojure.core/assoc :device-status-info (deser-device-status-info (input "DeviceStatusInfo"))) (clojure.core/contains? input "MacAddress") (clojure.core/assoc :mac-address (deser-mac-address (input "MacAddress"))) (clojure.core/contains? input "DeviceArn") (clojure.core/assoc :device-arn (deser-arn (input "DeviceArn"))) (clojure.core/contains? input "DeviceType") (clojure.core/assoc :device-type (deser-device-type (input "DeviceType"))) (clojure.core/contains? input "DeviceStatus") (clojure.core/assoc :device-status (deser-device-status (input "DeviceStatus"))) (clojure.core/contains? input "DeviceName") (clojure.core/assoc :device-name (deser-device-name (input "DeviceName"))) (clojure.core/contains? input "RoomArn") (clojure.core/assoc :room-arn (deser-arn (input "RoomArn"))) (clojure.core/contains? input "RoomName") (clojure.core/assoc :room-name (deser-room-name (input "RoomName")))))

(clojure.core/defn- deser-profile [input] (clojure.core/cond-> {} (clojure.core/contains? input "Address") (clojure.core/assoc :address (deser-address (input "Address"))) (clojure.core/contains? input "WakeWord") (clojure.core/assoc :wake-word (deser-wake-word (input "WakeWord"))) (clojure.core/contains? input "SetupModeDisabled") (clojure.core/assoc :setup-mode-disabled (deser-boolean (input "SetupModeDisabled"))) (clojure.core/contains? input "PSTNEnabled") (clojure.core/assoc :pstn-enabled (deser-boolean (input "PSTNEnabled"))) (clojure.core/contains? input "Timezone") (clojure.core/assoc :timezone (deser-timezone (input "Timezone"))) (clojure.core/contains? input "MaxVolumeLimit") (clojure.core/assoc :max-volume-limit (deser-max-volume-limit (input "MaxVolumeLimit"))) (clojure.core/contains? input "ProfileArn") (clojure.core/assoc :profile-arn (deser-arn (input "ProfileArn"))) (clojure.core/contains? input "AddressBookArn") (clojure.core/assoc :address-book-arn (deser-arn (input "AddressBookArn"))) (clojure.core/contains? input "TemperatureUnit") (clojure.core/assoc :temperature-unit (deser-temperature-unit (input "TemperatureUnit"))) (clojure.core/contains? input "DistanceUnit") (clojure.core/assoc :distance-unit (deser-distance-unit (input "DistanceUnit"))) (clojure.core/contains? input "IsDefault") (clojure.core/assoc :is-default (deser-boolean (input "IsDefault"))) (clojure.core/contains? input "ProfileName") (clojure.core/assoc :profile-name (deser-profile-name (input "ProfileName")))))

(clojure.core/defn- deser-url [input] input)

(clojure.core/defn- deseruser-first-name [input] input)

(clojure.core/defn- deser-require-pin [input] (clojure.core/get {"YES" :yes, "NO" :no, "OPTIONAL" :optional} input))

(clojure.core/defn- deser-tag-value [input] input)

(clojure.core/defn- deser-total-count [input] input)

(clojure.core/defn- deser-device-type [input] input)

(clojure.core/defn- deser-customer-s-3-bucket-name [input] input)

(clojure.core/defn- deser-profile-data-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-profile-data coll))) input))

(clojure.core/defn- deser-max-volume-limit [input] input)

(clojure.core/defn- deser-device-status [input] (clojure.core/get {"READY" :ready, "PENDING" :pending, "WAS_OFFLINE" :was-offline, "DEREGISTERED" :deregistered} input))

(clojure.core/defn- deser-address-book [input] (clojure.core/cond-> {} (clojure.core/contains? input "AddressBookArn") (clojure.core/assoc :address-book-arn (deser-arn (input "AddressBookArn"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-address-book-name (input "Name"))) (clojure.core/contains? input "Description") (clojure.core/assoc :description (deser-address-book-description (input "Description")))))

(clojure.core/defn- deser-business-report-schedule [input] (clojure.core/cond-> {} (clojure.core/contains? input "ScheduleArn") (clojure.core/assoc :schedule-arn (deser-arn (input "ScheduleArn"))) (clojure.core/contains? input "ScheduleName") (clojure.core/assoc :schedule-name (deser-business-report-schedule-name (input "ScheduleName"))) (clojure.core/contains? input "S3BucketName") (clojure.core/assoc :s-3-bucket-name (deser-customer-s-3-bucket-name (input "S3BucketName"))) (clojure.core/contains? input "S3KeyPrefix") (clojure.core/assoc :s-3-key-prefix (deser-s-3-key-prefix (input "S3KeyPrefix"))) (clojure.core/contains? input "Format") (clojure.core/assoc :format (deser-business-report-format (input "Format"))) (clojure.core/contains? input "ContentRange") (clojure.core/assoc :content-range (deser-business-report-content-range (input "ContentRange"))) (clojure.core/contains? input "Recurrence") (clojure.core/assoc :recurrence (deser-business-report-recurrence (input "Recurrence"))) (clojure.core/contains? input "LastBusinessReport") (clojure.core/assoc :last-business-report (deser-business-report (input "LastBusinessReport")))))

(clojure.core/defn- deser-one-click-id-delay [input] input)

(clojure.core/defn- deser-business-report-s-3-path [input] input)

(clojure.core/defn- deser-user-data-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-user-data coll))) input))

(clojure.core/defn- deser-release-date [input] input)

(clojure.core/defn- deser-room-description [input] input)

(clojure.core/defn- deser-appliance-manufacturer-name [input] input)

(clojure.core/defn- deser-business-report-failure-code [input] (clojure.core/get {"ACCESS_DENIED" :access-denied, "NO_SUCH_BUCKET" :no-such-bucket, "INTERNAL_FAILURE" :internal-failure} input))

(clojure.core/defn- deser-room-skill-parameter-key [input] input)

(clojure.core/defn- deser-s-3-key-prefix [input] input)

(clojure.core/defn- deser-product-description [input] input)

(clojure.core/defn- deser-arn [input] input)

(clojure.core/defn- deser-skills-store-skill [input] (clojure.core/cond-> {} (clojure.core/contains? input "SkillId") (clojure.core/assoc :skill-id (deser-skill-id (input "SkillId"))) (clojure.core/contains? input "SkillName") (clojure.core/assoc :skill-name (deser-skill-name (input "SkillName"))) (clojure.core/contains? input "ShortDescription") (clojure.core/assoc :short-description (deser-short-description (input "ShortDescription"))) (clojure.core/contains? input "IconUrl") (clojure.core/assoc :icon-url (deser-icon-url (input "IconUrl"))) (clojure.core/contains? input "SampleUtterances") (clojure.core/assoc :sample-utterances (deser-sample-utterances (input "SampleUtterances"))) (clojure.core/contains? input "SkillDetails") (clojure.core/assoc :skill-details (deser-skill-details (input "SkillDetails"))) (clojure.core/contains? input "SupportsLinking") (clojure.core/assoc :supports-linking (deserboolean (input "SupportsLinking")))))

(clojure.core/defn- deser-endpoint [input] input)

(clojure.core/defn- deseruser-last-name [input] input)

(clojure.core/defn- deser-device-name [input] input)

(clojure.core/defn- deser-temperature-unit [input] (clojure.core/get {"FAHRENHEIT" :fahrenheit, "CELSIUS" :celsius} input))

(clojure.core/defn- deser-timestamp [input] input)

(clojure.core/defn- deser-category-name [input] input)

(clojure.core/defn- deser-room-skill-parameter-value [input] input)

(clojure.core/defn- deser-contact-data [input] (clojure.core/cond-> {} (clojure.core/contains? input "ContactArn") (clojure.core/assoc :contact-arn (deser-arn (input "ContactArn"))) (clojure.core/contains? input "DisplayName") (clojure.core/assoc :display-name (deser-contact-name (input "DisplayName"))) (clojure.core/contains? input "FirstName") (clojure.core/assoc :first-name (deser-contact-name (input "FirstName"))) (clojure.core/contains? input "LastName") (clojure.core/assoc :last-name (deser-contact-name (input "LastName"))) (clojure.core/contains? input "PhoneNumber") (clojure.core/assoc :phone-number (deser-e-164-phone-number (input "PhoneNumber")))))

(clojure.core/defn- deser-business-report-content-range [input] (clojure.core/cond-> {} (clojure.core/contains? input "Interval") (clojure.core/assoc :interval (deser-business-report-interval (input "Interval")))))

(clojure.core/defn- deser-distance-unit [input] (clojure.core/get {"METRIC" :metric, "IMPERIAL" :imperial} input))

(clojure.core/defn- deser-developer-info [input] (clojure.core/cond-> {} (clojure.core/contains? input "DeveloperName") (clojure.core/assoc :developer-name (deser-developer-name (input "DeveloperName"))) (clojure.core/contains? input "PrivacyPolicy") (clojure.core/assoc :privacy-policy (deser-privacy-policy (input "PrivacyPolicy"))) (clojure.core/contains? input "Email") (clojure.core/assoc :email (deser-email (input "Email"))) (clojure.core/contains? input "Url") (clojure.core/assoc :url (deser-url (input "Url")))))

(clojure.core/defn- deser-tag [input] (clojure.core/cond-> {:key (deser-tag-key (input "Key")), :value (deser-tag-value (input "Value"))}))

(clojure.core/defn- deser-business-report-format [input] (clojure.core/get {"CSV" :csv, "CSV_ZIP" :csv-zip} input))

(clojure.core/defn- deser-business-report-schedule-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-business-report-schedule coll))) input))

(clojure.core/defn- deser-skill-store-type [input] input)

(clojure.core/defn- deser-reviews [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-review-key k) (deser-review-value v)])) input))

(clojure.core/defn- deser-business-report-interval [input] (clojure.core/get {"ONE_DAY" :one-day, "ONE_WEEK" :one-week} input))

(clojure.core/defn- deser-business-report-download-url [input] input)

(clojure.core/defn- deser-icon-url [input] input)

(clojure.core/defn- deser-room-data [input] (clojure.core/cond-> {} (clojure.core/contains? input "RoomArn") (clojure.core/assoc :room-arn (deser-arn (input "RoomArn"))) (clojure.core/contains? input "RoomName") (clojure.core/assoc :room-name (deser-room-name (input "RoomName"))) (clojure.core/contains? input "Description") (clojure.core/assoc :description (deser-room-description (input "Description"))) (clojure.core/contains? input "ProviderCalendarId") (clojure.core/assoc :provider-calendar-id (deser-provider-calendar-id (input "ProviderCalendarId"))) (clojure.core/contains? input "ProfileArn") (clojure.core/assoc :profile-arn (deser-arn (input "ProfileArn"))) (clojure.core/contains? input "ProfileName") (clojure.core/assoc :profile-name (deser-profile-name (input "ProfileName")))))

(clojure.core/defn- deser-device-event-value [input] input)

(clojure.core/defn- deser-device-event-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-device-event coll))) input))

(clojure.core/defn- deser-bullet-point [input] input)

(clojure.core/defn- deser-enablement-type [input] (clojure.core/get {"ENABLED" :enabled, "PENDING" :pending} input))

(clojure.core/defn- deser-device-event-type [input] (clojure.core/get {"CONNECTION_STATUS" :connection-status, "DEVICE_STATUS" :device-status} input))

(clojure.core/defn- deser-e-164-phone-number [input] input)

(clojure.core/defn- deser-contact-data-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-contact-data coll))) input))

(clojure.core/defn- deser-bullet-points [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-bullet-point coll))) input))

(clojure.core/defn- deser-skill-types [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-skill-store-type coll))) input))

(clojure.core/defn- deser-business-report [input] (clojure.core/cond-> {} (clojure.core/contains? input "Status") (clojure.core/assoc :status (deser-business-report-status (input "Status"))) (clojure.core/contains? input "FailureCode") (clojure.core/assoc :failure-code (deser-business-report-failure-code (input "FailureCode"))) (clojure.core/contains? input "S3Location") (clojure.core/assoc :s-3-location (deser-business-report-s-3-location (input "S3Location"))) (clojure.core/contains? input "DeliveryTime") (clojure.core/assoc :delivery-time (deser-timestamp (input "DeliveryTime"))) (clojure.core/contains? input "DownloadUrl") (clojure.core/assoc :download-url (deser-business-report-download-url (input "DownloadUrl")))))

(clojure.core/defn- deser-new-in-this-version-bullet-points [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-bullet-point coll))) input))

(clojure.core/defn- deser-skill-group-description [input] input)

(clojure.core/defn- deser-room-name [input] input)

(clojure.core/defn- deser-device [input] (clojure.core/cond-> {} (clojure.core/contains? input "DeviceSerialNumber") (clojure.core/assoc :device-serial-number (deser-device-serial-number (input "DeviceSerialNumber"))) (clojure.core/contains? input "SoftwareVersion") (clojure.core/assoc :software-version (deser-software-version (input "SoftwareVersion"))) (clojure.core/contains? input "DeviceStatusInfo") (clojure.core/assoc :device-status-info (deser-device-status-info (input "DeviceStatusInfo"))) (clojure.core/contains? input "MacAddress") (clojure.core/assoc :mac-address (deser-mac-address (input "MacAddress"))) (clojure.core/contains? input "DeviceArn") (clojure.core/assoc :device-arn (deser-arn (input "DeviceArn"))) (clojure.core/contains? input "DeviceType") (clojure.core/assoc :device-type (deser-device-type (input "DeviceType"))) (clojure.core/contains? input "DeviceStatus") (clojure.core/assoc :device-status (deser-device-status (input "DeviceStatus"))) (clojure.core/contains? input "DeviceName") (clojure.core/assoc :device-name (deser-device-name (input "DeviceName"))) (clojure.core/contains? input "RoomArn") (clojure.core/assoc :room-arn (deser-arn (input "RoomArn")))))

(clojure.core/defn- deser-generic-keyword [input] input)

(clojure.core/defn- deser-user-data [input] (clojure.core/cond-> {} (clojure.core/contains? input "UserArn") (clojure.core/assoc :user-arn (deser-arn (input "UserArn"))) (clojure.core/contains? input "FirstName") (clojure.core/assoc :first-name (deseruser-first-name (input "FirstName"))) (clojure.core/contains? input "LastName") (clojure.core/assoc :last-name (deseruser-last-name (input "LastName"))) (clojure.core/contains? input "Email") (clojure.core/assoc :email (deser-email (input "Email"))) (clojure.core/contains? input "EnrollmentStatus") (clojure.core/assoc :enrollment-status (deser-enrollment-status (input "EnrollmentStatus"))) (clojure.core/contains? input "EnrollmentId") (clojure.core/assoc :enrollment-id (deser-enrollment-id (input "EnrollmentId")))))

(clojure.core/defn- deser-smart-home-appliance [input] (clojure.core/cond-> {} (clojure.core/contains? input "FriendlyName") (clojure.core/assoc :friendly-name (deser-appliance-friendly-name (input "FriendlyName"))) (clojure.core/contains? input "Description") (clojure.core/assoc :description (deser-appliance-description (input "Description"))) (clojure.core/contains? input "ManufacturerName") (clojure.core/assoc :manufacturer-name (deser-appliance-manufacturer-name (input "ManufacturerName")))))

(clojure.core/defn- deser-skill-type [input] (clojure.core/get {"PUBLIC" :public, "PRIVATE" :private} input))

(clojure.core/defn- deser-end-user-license-agreement [input] input)

(clojure.core/defn- deser-skill-id [input] input)

(clojure.core/defn- deser-profile-name [input] input)

(clojure.core/defn- deser-skill-group-data [input] (clojure.core/cond-> {} (clojure.core/contains? input "SkillGroupArn") (clojure.core/assoc :skill-group-arn (deser-arn (input "SkillGroupArn"))) (clojure.core/contains? input "SkillGroupName") (clojure.core/assoc :skill-group-name (deser-skill-group-name (input "SkillGroupName"))) (clojure.core/contains? input "Description") (clojure.core/assoc :description (deser-skill-group-description (input "Description")))))

(clojure.core/defn- deser-invocation-phrase [input] input)

(clojure.core/defn- deser-smart-home-appliance-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-smart-home-appliance coll))) input))

(clojure.core/defn- deser-enrollment-status [input] (clojure.core/get {"INITIALIZED" :initialized, "PENDING" :pending, "REGISTERED" :registered, "DISASSOCIATING" :disassociating, "DEREGISTERING" :deregistering} input))

(clojure.core/defn- deser-business-report-s-3-location [input] (clojure.core/cond-> {} (clojure.core/contains? input "Path") (clojure.core/assoc :path (deser-business-report-s-3-path (input "Path"))) (clojure.core/contains? input "BucketName") (clojure.core/assoc :bucket-name (deser-customer-s-3-bucket-name (input "BucketName")))))

(clojure.core/defn- deser-boolean [input] input)

(clojure.core/defn- deser-meeting-setting [input] (clojure.core/cond-> {:require-pin (deser-require-pin (input "RequirePin"))}))

(clojure.core/defn- deser-room-data-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-room-data coll))) input))

(clojure.core/defn- response-create-user-response ([input] (response-create-user-response nil input)) ([resultWrapper1434626 input] (clojure.core/let [rawinput1434625 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1434627 {"UserArn" (rawinput1434625 "UserArn")}] (clojure.core/cond-> {} (letvar1434627 "UserArn") (clojure.core/assoc :user-arn (deser-arn (clojure.core/get-in letvar1434627 ["UserArn"])))))))

(clojure.core/defn- response-unauthorized-exception ([input] (response-unauthorized-exception nil input)) ([resultWrapper1434629 input] (clojure.core/let [rawinput1434628 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1434630 {"Message" (rawinput1434628 "Message")}] (clojure.core/cond-> {} (letvar1434630 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1434630 ["Message"])))))))

(clojure.core/defn- response-update-contact-response ([input] (response-update-contact-response nil input)) ([resultWrapper1434632 input] (clojure.core/let [rawinput1434631 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1434633 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-create-address-book-response ([input] (response-create-address-book-response nil input)) ([resultWrapper1434635 input] (clojure.core/let [rawinput1434634 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1434636 {"AddressBookArn" (rawinput1434634 "AddressBookArn")}] (clojure.core/cond-> {} (letvar1434636 "AddressBookArn") (clojure.core/assoc :address-book-arn (deser-arn (clojure.core/get-in letvar1434636 ["AddressBookArn"])))))))

(clojure.core/defn- response-associate-contact-with-address-book-response ([input] (response-associate-contact-with-address-book-response nil input)) ([resultWrapper1434638 input] (clojure.core/let [rawinput1434637 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1434639 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-already-exists-exception ([input] (response-already-exists-exception nil input)) ([resultWrapper1434641 input] (clojure.core/let [rawinput1434640 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1434642 {"Message" (rawinput1434640 "Message")}] (clojure.core/cond-> {} (letvar1434642 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1434642 ["Message"])))))))

(clojure.core/defn- response-associate-device-with-room-response ([input] (response-associate-device-with-room-response nil input)) ([resultWrapper1434644 input] (clojure.core/let [rawinput1434643 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1434645 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-name-in-use-exception ([input] (response-name-in-use-exception nil input)) ([resultWrapper1434647 input] (clojure.core/let [rawinput1434646 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1434648 {"Message" (rawinput1434646 "Message")}] (clojure.core/cond-> {} (letvar1434648 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1434648 ["Message"])))))))

(clojure.core/defn- response-put-conference-preference-response ([input] (response-put-conference-preference-response nil input)) ([resultWrapper1434650 input] (clojure.core/let [rawinput1434649 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1434651 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-create-contact-response ([input] (response-create-contact-response nil input)) ([resultWrapper1434653 input] (clojure.core/let [rawinput1434652 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1434654 {"ContactArn" (rawinput1434652 "ContactArn")}] (clojure.core/cond-> {} (letvar1434654 "ContactArn") (clojure.core/assoc :contact-arn (deser-arn (clojure.core/get-in letvar1434654 ["ContactArn"])))))))

(clojure.core/defn- response-create-conference-provider-response ([input] (response-create-conference-provider-response nil input)) ([resultWrapper1434656 input] (clojure.core/let [rawinput1434655 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1434657 {"ConferenceProviderArn" (rawinput1434655 "ConferenceProviderArn")}] (clojure.core/cond-> {} (letvar1434657 "ConferenceProviderArn") (clojure.core/assoc :conference-provider-arn (deser-arn (clojure.core/get-in letvar1434657 ["ConferenceProviderArn"])))))))

(clojure.core/defn- response-put-invitation-configuration-response ([input] (response-put-invitation-configuration-response nil input)) ([resultWrapper1434659 input] (clojure.core/let [rawinput1434658 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1434660 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-conference-preference-response ([input] (response-get-conference-preference-response nil input)) ([resultWrapper1434662 input] (clojure.core/let [rawinput1434661 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1434663 {"Preference" (rawinput1434661 "Preference")}] (clojure.core/cond-> {} (letvar1434663 "Preference") (clojure.core/assoc :preference (deser-conference-preference (clojure.core/get-in letvar1434663 ["Preference"])))))))

(clojure.core/defn- response-get-address-book-response ([input] (response-get-address-book-response nil input)) ([resultWrapper1434665 input] (clojure.core/let [rawinput1434664 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1434666 {"AddressBook" (rawinput1434664 "AddressBook")}] (clojure.core/cond-> {} (letvar1434666 "AddressBook") (clojure.core/assoc :address-book (deser-address-book (clojure.core/get-in letvar1434666 ["AddressBook"])))))))

(clojure.core/defn- response-delete-profile-response ([input] (response-delete-profile-response nil input)) ([resultWrapper1434668 input] (clojure.core/let [rawinput1434667 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1434669 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-associate-skill-with-users-response ([input] (response-associate-skill-with-users-response nil input)) ([resultWrapper1434671 input] (clojure.core/let [rawinput1434670 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1434672 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-delete-room-response ([input] (response-delete-room-response nil input)) ([resultWrapper1434674 input] (clojure.core/let [rawinput1434673 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1434675 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-device-response ([input] (response-get-device-response nil input)) ([resultWrapper1434677 input] (clojure.core/let [rawinput1434676 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1434678 {"Device" (rawinput1434676 "Device")}] (clojure.core/cond-> {} (letvar1434678 "Device") (clojure.core/assoc :device (deser-device (clojure.core/get-in letvar1434678 ["Device"])))))))

(clojure.core/defn- response-search-users-response ([input] (response-search-users-response nil input)) ([resultWrapper1434680 input] (clojure.core/let [rawinput1434679 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1434681 {"Users" (rawinput1434679 "Users"), "NextToken" (rawinput1434679 "NextToken"), "TotalCount" (rawinput1434679 "TotalCount")}] (clojure.core/cond-> {} (letvar1434681 "Users") (clojure.core/assoc :users (deser-user-data-list (clojure.core/get-in letvar1434681 ["Users"]))) (letvar1434681 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1434681 ["NextToken"]))) (letvar1434681 "TotalCount") (clojure.core/assoc :total-count (deser-total-count (clojure.core/get-in letvar1434681 ["TotalCount"])))))))

(clojure.core/defn- response-reject-skill-response ([input] (response-reject-skill-response nil input)) ([resultWrapper1434683 input] (clojure.core/let [rawinput1434682 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1434684 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-create-business-report-schedule-response ([input] (response-create-business-report-schedule-response nil input)) ([resultWrapper1434686 input] (clojure.core/let [rawinput1434685 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1434687 {"ScheduleArn" (rawinput1434685 "ScheduleArn")}] (clojure.core/cond-> {} (letvar1434687 "ScheduleArn") (clojure.core/assoc :schedule-arn (deser-arn (clojure.core/get-in letvar1434687 ["ScheduleArn"])))))))

(clojure.core/defn- response-update-conference-provider-response ([input] (response-update-conference-provider-response nil input)) ([resultWrapper1434689 input] (clojure.core/let [rawinput1434688 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1434690 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-start-smart-home-appliance-discovery-response ([input] (response-start-smart-home-appliance-discovery-response nil input)) ([resultWrapper1434692 input] (clojure.core/let [rawinput1434691 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1434693 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-skill-not-linked-exception ([input] (response-skill-not-linked-exception nil input)) ([resultWrapper1434695 input] (clojure.core/let [rawinput1434694 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1434696 {"Message" (rawinput1434694 "Message")}] (clojure.core/cond-> {} (letvar1434696 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1434696 ["Message"])))))))

(clojure.core/defn- response-list-tags-response ([input] (response-list-tags-response nil input)) ([resultWrapper1434698 input] (clojure.core/let [rawinput1434697 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1434699 {"Tags" (rawinput1434697 "Tags"), "NextToken" (rawinput1434697 "NextToken")}] (clojure.core/cond-> {} (letvar1434699 "Tags") (clojure.core/assoc :tags (deser-tag-list (clojure.core/get-in letvar1434699 ["Tags"]))) (letvar1434699 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1434699 ["NextToken"])))))))

(clojure.core/defn- response-approve-skill-response ([input] (response-approve-skill-response nil input)) ([resultWrapper1434701 input] (clojure.core/let [rawinput1434700 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1434702 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-search-contacts-response ([input] (response-search-contacts-response nil input)) ([resultWrapper1434704 input] (clojure.core/let [rawinput1434703 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1434705 {"Contacts" (rawinput1434703 "Contacts"), "NextToken" (rawinput1434703 "NextToken"), "TotalCount" (rawinput1434703 "TotalCount")}] (clojure.core/cond-> {} (letvar1434705 "Contacts") (clojure.core/assoc :contacts (deser-contact-data-list (clojure.core/get-in letvar1434705 ["Contacts"]))) (letvar1434705 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1434705 ["NextToken"]))) (letvar1434705 "TotalCount") (clojure.core/assoc :total-count (deser-total-count (clojure.core/get-in letvar1434705 ["TotalCount"])))))))

(clojure.core/defn- response-search-address-books-response ([input] (response-search-address-books-response nil input)) ([resultWrapper1434707 input] (clojure.core/let [rawinput1434706 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1434708 {"AddressBooks" (rawinput1434706 "AddressBooks"), "NextToken" (rawinput1434706 "NextToken"), "TotalCount" (rawinput1434706 "TotalCount")}] (clojure.core/cond-> {} (letvar1434708 "AddressBooks") (clojure.core/assoc :address-books (deser-address-book-data-list (clojure.core/get-in letvar1434708 ["AddressBooks"]))) (letvar1434708 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1434708 ["NextToken"]))) (letvar1434708 "TotalCount") (clojure.core/assoc :total-count (deser-total-count (clojure.core/get-in letvar1434708 ["TotalCount"])))))))

(clojure.core/defn- response-resource-in-use-exception ([input] (response-resource-in-use-exception nil input)) ([resultWrapper1434710 input] (clojure.core/let [rawinput1434709 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1434711 {"Message" (rawinput1434709 "Message"), "ClientRequestToken" (rawinput1434709 "ClientRequestToken")}] (clojure.core/cond-> {} (letvar1434711 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1434711 ["Message"]))) (letvar1434711 "ClientRequestToken") (clojure.core/assoc :client-request-token (deser-client-request-token (clojure.core/get-in letvar1434711 ["ClientRequestToken"])))))))

(clojure.core/defn- response-search-profiles-response ([input] (response-search-profiles-response nil input)) ([resultWrapper1434713 input] (clojure.core/let [rawinput1434712 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1434714 {"Profiles" (rawinput1434712 "Profiles"), "NextToken" (rawinput1434712 "NextToken"), "TotalCount" (rawinput1434712 "TotalCount")}] (clojure.core/cond-> {} (letvar1434714 "Profiles") (clojure.core/assoc :profiles (deser-profile-data-list (clojure.core/get-in letvar1434714 ["Profiles"]))) (letvar1434714 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1434714 ["NextToken"]))) (letvar1434714 "TotalCount") (clojure.core/assoc :total-count (deser-total-count (clojure.core/get-in letvar1434714 ["TotalCount"])))))))

(clojure.core/defn- response-search-devices-response ([input] (response-search-devices-response nil input)) ([resultWrapper1434716 input] (clojure.core/let [rawinput1434715 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1434717 {"Devices" (rawinput1434715 "Devices"), "NextToken" (rawinput1434715 "NextToken"), "TotalCount" (rawinput1434715 "TotalCount")}] (clojure.core/cond-> {} (letvar1434717 "Devices") (clojure.core/assoc :devices (deser-device-data-list (clojure.core/get-in letvar1434717 ["Devices"]))) (letvar1434717 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1434717 ["NextToken"]))) (letvar1434717 "TotalCount") (clojure.core/assoc :total-count (deser-total-count (clojure.core/get-in letvar1434717 ["TotalCount"])))))))

(clojure.core/defn- response-invalid-certificate-authority-exception ([input] (response-invalid-certificate-authority-exception nil input)) ([resultWrapper1434719 input] (clojure.core/let [rawinput1434718 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1434720 {"Message" (rawinput1434718 "Message")}] (clojure.core/cond-> {} (letvar1434720 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1434720 ["Message"])))))))

(clojure.core/defn- response-limit-exceeded-exception ([input] (response-limit-exceeded-exception nil input)) ([resultWrapper1434722 input] (clojure.core/let [rawinput1434721 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1434723 {"Message" (rawinput1434721 "Message")}] (clojure.core/cond-> {} (letvar1434723 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1434723 ["Message"])))))))

(clojure.core/defn- response-resolve-room-response ([input] (response-resolve-room-response nil input)) ([resultWrapper1434725 input] (clojure.core/let [rawinput1434724 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1434726 {"RoomArn" (rawinput1434724 "RoomArn"), "RoomName" (rawinput1434724 "RoomName"), "RoomSkillParameters" (rawinput1434724 "RoomSkillParameters")}] (clojure.core/cond-> {} (letvar1434726 "RoomArn") (clojure.core/assoc :room-arn (deser-arn (clojure.core/get-in letvar1434726 ["RoomArn"]))) (letvar1434726 "RoomName") (clojure.core/assoc :room-name (deser-room-name (clojure.core/get-in letvar1434726 ["RoomName"]))) (letvar1434726 "RoomSkillParameters") (clojure.core/assoc :room-skill-parameters (deser-room-skill-parameters (clojure.core/get-in letvar1434726 ["RoomSkillParameters"])))))))

(clojure.core/defn- response-invalid-user-status-exception ([input] (response-invalid-user-status-exception nil input)) ([resultWrapper1434728 input] (clojure.core/let [rawinput1434727 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1434729 {"Message" (rawinput1434727 "Message")}] (clojure.core/cond-> {} (letvar1434729 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1434729 ["Message"])))))))

(clojure.core/defn- response-update-profile-response ([input] (response-update-profile-response nil input)) ([resultWrapper1434731 input] (clojure.core/let [rawinput1434730 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1434732 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-disassociate-contact-from-address-book-response ([input] (response-disassociate-contact-from-address-book-response nil input)) ([resultWrapper1434734 input] (clojure.core/let [rawinput1434733 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1434735 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-update-device-response ([input] (response-update-device-response nil input)) ([resultWrapper1434737 input] (clojure.core/let [rawinput1434736 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1434738 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-disassociate-device-from-room-response ([input] (response-disassociate-device-from-room-response nil input)) ([resultWrapper1434740 input] (clojure.core/let [rawinput1434739 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1434741 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-disassociate-skill-from-skill-group-response ([input] (response-disassociate-skill-from-skill-group-response nil input)) ([resultWrapper1434743 input] (clojure.core/let [rawinput1434742 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1434744 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-put-room-skill-parameter-response ([input] (response-put-room-skill-parameter-response nil input)) ([resultWrapper1434746 input] (clojure.core/let [rawinput1434745 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1434747 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-update-skill-group-response ([input] (response-update-skill-group-response nil input)) ([resultWrapper1434749 input] (clojure.core/let [rawinput1434748 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1434750 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-tag-resource-response ([input] (response-tag-resource-response nil input)) ([resultWrapper1434752 input] (clojure.core/let [rawinput1434751 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1434753 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-delete-user-response ([input] (response-delete-user-response nil input)) ([resultWrapper1434755 input] (clojure.core/let [rawinput1434754 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1434756 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-delete-skill-authorization-response ([input] (response-delete-skill-authorization-response nil input)) ([resultWrapper1434758 input] (clojure.core/let [rawinput1434757 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1434759 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-update-business-report-schedule-response ([input] (response-update-business-report-schedule-response nil input)) ([resultWrapper1434761 input] (clojure.core/let [rawinput1434760 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1434762 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-send-invitation-response ([input] (response-send-invitation-response nil input)) ([resultWrapper1434764 input] (clojure.core/let [rawinput1434763 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1434765 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-room-response ([input] (response-get-room-response nil input)) ([resultWrapper1434767 input] (clojure.core/let [rawinput1434766 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1434768 {"Room" (rawinput1434766 "Room")}] (clojure.core/cond-> {} (letvar1434768 "Room") (clojure.core/assoc :room (deser-room (clojure.core/get-in letvar1434768 ["Room"])))))))

(clojure.core/defn- response-disassociate-skill-group-from-room-response ([input] (response-disassociate-skill-group-from-room-response nil input)) ([resultWrapper1434770 input] (clojure.core/let [rawinput1434769 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1434771 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-forget-smart-home-appliances-response ([input] (response-forget-smart-home-appliances-response nil input)) ([resultWrapper1434773 input] (clojure.core/let [rawinput1434772 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1434774 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-invitation-configuration-response ([input] (response-get-invitation-configuration-response nil input)) ([resultWrapper1434776 input] (clojure.core/let [rawinput1434775 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1434777 {"OrganizationName" (rawinput1434775 "OrganizationName"), "ContactEmail" (rawinput1434775 "ContactEmail"), "PrivateSkillIds" (rawinput1434775 "PrivateSkillIds")}] (clojure.core/cond-> {} (letvar1434777 "OrganizationName") (clojure.core/assoc :organization-name (deser-organization-name (clojure.core/get-in letvar1434777 ["OrganizationName"]))) (letvar1434777 "ContactEmail") (clojure.core/assoc :contact-email (deser-email (clojure.core/get-in letvar1434777 ["ContactEmail"]))) (letvar1434777 "PrivateSkillIds") (clojure.core/assoc :private-skill-ids (deser-short-skill-id-list (clojure.core/get-in letvar1434777 ["PrivateSkillIds"])))))))

(clojure.core/defn- response-revoke-invitation-response ([input] (response-revoke-invitation-response nil input)) ([resultWrapper1434779 input] (clojure.core/let [rawinput1434778 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1434780 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-conference-provider-response ([input] (response-get-conference-provider-response nil input)) ([resultWrapper1434782 input] (clojure.core/let [rawinput1434781 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1434783 {"ConferenceProvider" (rawinput1434781 "ConferenceProvider")}] (clojure.core/cond-> {} (letvar1434783 "ConferenceProvider") (clojure.core/assoc :conference-provider (deser-conference-provider (clojure.core/get-in letvar1434783 ["ConferenceProvider"])))))))

(clojure.core/defn- response-device-not-registered-exception ([input] (response-device-not-registered-exception nil input)) ([resultWrapper1434785 input] (clojure.core/let [rawinput1434784 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1434786 {"Message" (rawinput1434784 "Message")}] (clojure.core/cond-> {} (letvar1434786 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1434786 ["Message"])))))))

(clojure.core/defn- response-invalid-device-exception ([input] (response-invalid-device-exception nil input)) ([resultWrapper1434788 input] (clojure.core/let [rawinput1434787 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1434789 {"Message" (rawinput1434787 "Message")}] (clojure.core/cond-> {} (letvar1434789 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1434789 ["Message"])))))))

(clojure.core/defn- response-associate-skill-with-skill-group-response ([input] (response-associate-skill-with-skill-group-response nil input)) ([resultWrapper1434791 input] (clojure.core/let [rawinput1434790 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1434792 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-not-found-exception ([input] (response-not-found-exception nil input)) ([resultWrapper1434794 input] (clojure.core/let [rawinput1434793 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1434795 {"Message" (rawinput1434793 "Message")}] (clojure.core/cond-> {} (letvar1434795 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1434795 ["Message"])))))))

(clojure.core/defn- response-get-contact-response ([input] (response-get-contact-response nil input)) ([resultWrapper1434797 input] (clojure.core/let [rawinput1434796 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1434798 {"Contact" (rawinput1434796 "Contact")}] (clojure.core/cond-> {} (letvar1434798 "Contact") (clojure.core/assoc :contact (deser-contact (clojure.core/get-in letvar1434798 ["Contact"])))))))

(clojure.core/defn- response-list-skills-store-categories-response ([input] (response-list-skills-store-categories-response nil input)) ([resultWrapper1434800 input] (clojure.core/let [rawinput1434799 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1434801 {"CategoryList" (rawinput1434799 "CategoryList"), "NextToken" (rawinput1434799 "NextToken")}] (clojure.core/cond-> {} (letvar1434801 "CategoryList") (clojure.core/assoc :category-list (deser-category-list (clojure.core/get-in letvar1434801 ["CategoryList"]))) (letvar1434801 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1434801 ["NextToken"])))))))

(clojure.core/defn- response-delete-address-book-response ([input] (response-delete-address-book-response nil input)) ([resultWrapper1434803 input] (clojure.core/let [rawinput1434802 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1434804 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-put-skill-authorization-response ([input] (response-put-skill-authorization-response nil input)) ([resultWrapper1434806 input] (clojure.core/let [rawinput1434805 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1434807 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-search-skill-groups-response ([input] (response-search-skill-groups-response nil input)) ([resultWrapper1434809 input] (clojure.core/let [rawinput1434808 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1434810 {"SkillGroups" (rawinput1434808 "SkillGroups"), "NextToken" (rawinput1434808 "NextToken"), "TotalCount" (rawinput1434808 "TotalCount")}] (clojure.core/cond-> {} (letvar1434810 "SkillGroups") (clojure.core/assoc :skill-groups (deser-skill-group-data-list (clojure.core/get-in letvar1434810 ["SkillGroups"]))) (letvar1434810 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1434810 ["NextToken"]))) (letvar1434810 "TotalCount") (clojure.core/assoc :total-count (deser-total-count (clojure.core/get-in letvar1434810 ["TotalCount"])))))))

(clojure.core/defn- response-update-room-response ([input] (response-update-room-response nil input)) ([resultWrapper1434812 input] (clojure.core/let [rawinput1434811 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1434813 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-update-address-book-response ([input] (response-update-address-book-response nil input)) ([resultWrapper1434815 input] (clojure.core/let [rawinput1434814 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1434816 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-create-skill-group-response ([input] (response-create-skill-group-response nil input)) ([resultWrapper1434818 input] (clojure.core/let [rawinput1434817 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1434819 {"SkillGroupArn" (rawinput1434817 "SkillGroupArn")}] (clojure.core/cond-> {} (letvar1434819 "SkillGroupArn") (clojure.core/assoc :skill-group-arn (deser-arn (clojure.core/get-in letvar1434819 ["SkillGroupArn"])))))))

(clojure.core/defn- response-get-room-skill-parameter-response ([input] (response-get-room-skill-parameter-response nil input)) ([resultWrapper1434821 input] (clojure.core/let [rawinput1434820 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1434822 {"RoomSkillParameter" (rawinput1434820 "RoomSkillParameter")}] (clojure.core/cond-> {} (letvar1434822 "RoomSkillParameter") (clojure.core/assoc :room-skill-parameter (deser-room-skill-parameter (clojure.core/get-in letvar1434822 ["RoomSkillParameter"])))))))

(clojure.core/defn- response-list-device-events-response ([input] (response-list-device-events-response nil input)) ([resultWrapper1434824 input] (clojure.core/let [rawinput1434823 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1434825 {"DeviceEvents" (rawinput1434823 "DeviceEvents"), "NextToken" (rawinput1434823 "NextToken")}] (clojure.core/cond-> {} (letvar1434825 "DeviceEvents") (clojure.core/assoc :device-events (deser-device-event-list (clojure.core/get-in letvar1434825 ["DeviceEvents"]))) (letvar1434825 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1434825 ["NextToken"])))))))

(clojure.core/defn- response-create-profile-response ([input] (response-create-profile-response nil input)) ([resultWrapper1434827 input] (clojure.core/let [rawinput1434826 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1434828 {"ProfileArn" (rawinput1434826 "ProfileArn")}] (clojure.core/cond-> {} (letvar1434828 "ProfileArn") (clojure.core/assoc :profile-arn (deser-arn (clojure.core/get-in letvar1434828 ["ProfileArn"])))))))

(clojure.core/defn- response-start-device-sync-response ([input] (response-start-device-sync-response nil input)) ([resultWrapper1434830 input] (clojure.core/let [rawinput1434829 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1434831 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-disassociate-skill-from-users-response ([input] (response-disassociate-skill-from-users-response nil input)) ([resultWrapper1434833 input] (clojure.core/let [rawinput1434832 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1434834 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-delete-contact-response ([input] (response-delete-contact-response nil input)) ([resultWrapper1434836 input] (clojure.core/let [rawinput1434835 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1434837 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-delete-room-skill-parameter-response ([input] (response-delete-room-skill-parameter-response nil input)) ([resultWrapper1434839 input] (clojure.core/let [rawinput1434838 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1434840 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-create-room-response ([input] (response-create-room-response nil input)) ([resultWrapper1434842 input] (clojure.core/let [rawinput1434841 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1434843 {"RoomArn" (rawinput1434841 "RoomArn")}] (clojure.core/cond-> {} (letvar1434843 "RoomArn") (clojure.core/assoc :room-arn (deser-arn (clojure.core/get-in letvar1434843 ["RoomArn"])))))))

(clojure.core/defn- response-list-skills-store-skills-by-category-response ([input] (response-list-skills-store-skills-by-category-response nil input)) ([resultWrapper1434845 input] (clojure.core/let [rawinput1434844 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1434846 {"SkillsStoreSkills" (rawinput1434844 "SkillsStoreSkills"), "NextToken" (rawinput1434844 "NextToken")}] (clojure.core/cond-> {} (letvar1434846 "SkillsStoreSkills") (clojure.core/assoc :skills-store-skills (deser-skills-store-skill-list (clojure.core/get-in letvar1434846 ["SkillsStoreSkills"]))) (letvar1434846 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1434846 ["NextToken"])))))))

(clojure.core/defn- response-get-skill-group-response ([input] (response-get-skill-group-response nil input)) ([resultWrapper1434848 input] (clojure.core/let [rawinput1434847 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1434849 {"SkillGroup" (rawinput1434847 "SkillGroup")}] (clojure.core/cond-> {} (letvar1434849 "SkillGroup") (clojure.core/assoc :skill-group (deser-skill-group (clojure.core/get-in letvar1434849 ["SkillGroup"])))))))

(clojure.core/defn- response-get-profile-response ([input] (response-get-profile-response nil input)) ([resultWrapper1434851 input] (clojure.core/let [rawinput1434850 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1434852 {"Profile" (rawinput1434850 "Profile")}] (clojure.core/cond-> {} (letvar1434852 "Profile") (clojure.core/assoc :profile (deser-profile (clojure.core/get-in letvar1434852 ["Profile"])))))))

(clojure.core/defn- response-list-skills-response ([input] (response-list-skills-response nil input)) ([resultWrapper1434854 input] (clojure.core/let [rawinput1434853 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1434855 {"SkillSummaries" (rawinput1434853 "SkillSummaries"), "NextToken" (rawinput1434853 "NextToken")}] (clojure.core/cond-> {} (letvar1434855 "SkillSummaries") (clojure.core/assoc :skill-summaries (deser-skill-summary-list (clojure.core/get-in letvar1434855 ["SkillSummaries"]))) (letvar1434855 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1434855 ["NextToken"])))))))

(clojure.core/defn- response-list-business-report-schedules-response ([input] (response-list-business-report-schedules-response nil input)) ([resultWrapper1434857 input] (clojure.core/let [rawinput1434856 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1434858 {"BusinessReportSchedules" (rawinput1434856 "BusinessReportSchedules"), "NextToken" (rawinput1434856 "NextToken")}] (clojure.core/cond-> {} (letvar1434858 "BusinessReportSchedules") (clojure.core/assoc :business-report-schedules (deser-business-report-schedule-list (clojure.core/get-in letvar1434858 ["BusinessReportSchedules"]))) (letvar1434858 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1434858 ["NextToken"])))))))

(clojure.core/defn- response-delete-device-response ([input] (response-delete-device-response nil input)) ([resultWrapper1434860 input] (clojure.core/let [rawinput1434859 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1434861 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-delete-skill-group-response ([input] (response-delete-skill-group-response nil input)) ([resultWrapper1434863 input] (clojure.core/let [rawinput1434862 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1434864 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-list-conference-providers-response ([input] (response-list-conference-providers-response nil input)) ([resultWrapper1434866 input] (clojure.core/let [rawinput1434865 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1434867 {"ConferenceProviders" (rawinput1434865 "ConferenceProviders"), "NextToken" (rawinput1434865 "NextToken")}] (clojure.core/cond-> {} (letvar1434867 "ConferenceProviders") (clojure.core/assoc :conference-providers (deser-conference-providers-list (clojure.core/get-in letvar1434867 ["ConferenceProviders"]))) (letvar1434867 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1434867 ["NextToken"])))))))

(clojure.core/defn- response-concurrent-modification-exception ([input] (response-concurrent-modification-exception nil input)) ([resultWrapper1434869 input] (clojure.core/let [rawinput1434868 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1434870 {"Message" (rawinput1434868 "Message")}] (clojure.core/cond-> {} (letvar1434870 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1434870 ["Message"])))))))

(clojure.core/defn- response-delete-business-report-schedule-response ([input] (response-delete-business-report-schedule-response nil input)) ([resultWrapper1434872 input] (clojure.core/let [rawinput1434871 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1434873 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-register-avs-device-response ([input] (response-register-avs-device-response nil input)) ([resultWrapper1434875 input] (clojure.core/let [rawinput1434874 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1434876 {"DeviceArn" (rawinput1434874 "DeviceArn")}] (clojure.core/cond-> {} (letvar1434876 "DeviceArn") (clojure.core/assoc :device-arn (deser-arn (clojure.core/get-in letvar1434876 ["DeviceArn"])))))))

(clojure.core/defn- response-associate-skill-group-with-room-response ([input] (response-associate-skill-group-with-room-response nil input)) ([resultWrapper1434878 input] (clojure.core/let [rawinput1434877 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1434879 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-untag-resource-response ([input] (response-untag-resource-response nil input)) ([resultWrapper1434881 input] (clojure.core/let [rawinput1434880 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1434882 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-search-rooms-response ([input] (response-search-rooms-response nil input)) ([resultWrapper1434884 input] (clojure.core/let [rawinput1434883 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1434885 {"Rooms" (rawinput1434883 "Rooms"), "NextToken" (rawinput1434883 "NextToken"), "TotalCount" (rawinput1434883 "TotalCount")}] (clojure.core/cond-> {} (letvar1434885 "Rooms") (clojure.core/assoc :rooms (deser-room-data-list (clojure.core/get-in letvar1434885 ["Rooms"]))) (letvar1434885 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1434885 ["NextToken"]))) (letvar1434885 "TotalCount") (clojure.core/assoc :total-count (deser-total-count (clojure.core/get-in letvar1434885 ["TotalCount"])))))))

(clojure.core/defn- response-list-smart-home-appliances-response ([input] (response-list-smart-home-appliances-response nil input)) ([resultWrapper1434887 input] (clojure.core/let [rawinput1434886 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1434888 {"SmartHomeAppliances" (rawinput1434886 "SmartHomeAppliances"), "NextToken" (rawinput1434886 "NextToken")}] (clojure.core/cond-> {} (letvar1434888 "SmartHomeAppliances") (clojure.core/assoc :smart-home-appliances (deser-smart-home-appliance-list (clojure.core/get-in letvar1434888 ["SmartHomeAppliances"]))) (letvar1434888 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1434888 ["NextToken"])))))))

(clojure.core/defn- response-delete-conference-provider-response ([input] (response-delete-conference-provider-response nil input)) ([resultWrapper1434890 input] (clojure.core/let [rawinput1434889 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1434891 {}] (clojure.core/cond-> {}))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/skill-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 100)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[\u0009\u000A\u000D\u0020-\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/sort-list (clojure.spec.alpha/coll-of :portkey.aws.alexaforbusiness.-2017-11-09/sort :max-count 25))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/address (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 500))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.sort/key (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/sort-key))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.sort/value (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/sort-value))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/sort (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness.-2017-11-09.sort/key :portkey.aws.alexaforbusiness.-2017-11-09.sort/value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.create-user-response/user-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/create-user-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09.create-user-response/user-arn]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.disassociate-skill-from-skill-group-request/skill-group-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/disassociate-skill-from-skill-group-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness.-2017-11-09/skill-id] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09.disassociate-skill-from-skill-group-request/skill-group-arn]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.business-report-recurrence/start-date (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/date))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/business-report-recurrence (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09.business-report-recurrence/start-date]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.unauthorized-exception/message (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/error-message))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/unauthorized-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09.unauthorized-exception/message]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/update-contact-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/filter-value-list (clojure.spec.alpha/coll-of :portkey.aws.alexaforbusiness.-2017-11-09/filter-value :max-count 5))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.create-address-book-response/address-book-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/create-address-book-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09.create-address-book-response/address-book-arn]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/sort-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 500))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/associate-contact-with-address-book-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/ip-dial-in (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness.-2017-11-09/endpoint :portkey.aws.alexaforbusiness.-2017-11-09/comms-protocol] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.filter/key (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/filter-key))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.filter/values (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/filter-value-list))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/filter (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness.-2017-11-09.filter/key :portkey.aws.alexaforbusiness.-2017-11-09.filter/values] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/device-serial-number (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[a-zA-Z0-9]{1,200}" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.already-exists-exception/message (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/error-message))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/already-exists-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09.already-exists-exception/message]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/client-request-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 10 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 150)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[a-zA-Z0-9][a-zA-Z0-9_-]*" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/associate-device-with-room-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.conference-provider/name (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/conference-provider-name))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.conference-provider/type (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/conference-provider-type))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/conference-provider (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09/arn :portkey.aws.alexaforbusiness.-2017-11-09.conference-provider/name :portkey.aws.alexaforbusiness.-2017-11-09.conference-provider/type :portkey.aws.alexaforbusiness.-2017-11-09/ip-dial-in :portkey.aws.alexaforbusiness.-2017-11-09/pstn-dial-in :portkey.aws.alexaforbusiness.-2017-11-09/meeting-setting]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/privacy-policy (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.update-profile-request/setup-mode-disabled (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/boolean))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.update-profile-request/pstn-enabled (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/boolean))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.update-profile-request/profile-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.update-profile-request/is-default (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/boolean))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/update-profile-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09/address :portkey.aws.alexaforbusiness.-2017-11-09/wake-word :portkey.aws.alexaforbusiness.-2017-11-09.update-profile-request/setup-mode-disabled :portkey.aws.alexaforbusiness.-2017-11-09.update-profile-request/pstn-enabled :portkey.aws.alexaforbusiness.-2017-11-09/timezone :portkey.aws.alexaforbusiness.-2017-11-09/max-volume-limit :portkey.aws.alexaforbusiness.-2017-11-09.update-profile-request/profile-arn :portkey.aws.alexaforbusiness.-2017-11-09/temperature-unit :portkey.aws.alexaforbusiness.-2017-11-09/distance-unit :portkey.aws.alexaforbusiness.-2017-11-09.update-profile-request/is-default :portkey.aws.alexaforbusiness.-2017-11-09/profile-name]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/provider-calendar-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 0 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 100))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/device-status-details (clojure.spec.alpha/coll-of :portkey.aws.alexaforbusiness.-2017-11-09/device-status-detail))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.disassociate-device-from-room-request/device-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/disassociate-device-from-room-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09.disassociate-device-from-room-request/device-arn]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.name-in-use-exception/message (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/error-message))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/name-in-use-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09.name-in-use-exception/message]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/associate-skill-with-users-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness.-2017-11-09/skill-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/put-conference-preference-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/software-version (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.delete-conference-provider-request/conference-provider-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/delete-conference-provider-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness.-2017-11-09.delete-conference-provider-request/conference-provider-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/conference-providers-list (clojure.spec.alpha/coll-of :portkey.aws.alexaforbusiness.-2017-11-09/conference-provider))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/email (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 128)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"([0-9a-zA-Z]([+-.\w]*[0-9a-zA-Z])*@([0-9a-zA-Z][-\w]*[0-9a-zA-Z]\.)+[a-zA-Z]{2,9})" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/short-skill-id-list (clojure.spec.alpha/coll-of :portkey.aws.alexaforbusiness.-2017-11-09/skill-id :min-count 0 :max-count 3))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.create-contact-response/contact-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/create-contact-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09.create-contact-response/contact-arn]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.create-conference-provider-response/conference-provider-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/create-conference-provider-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09.create-conference-provider-response/conference-provider-arn]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/device-status-info (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09/device-status-details :portkey.aws.alexaforbusiness.-2017-11-09/connection-status]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/put-invitation-configuration-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.get-conference-preference-response/preference (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/conference-preference))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/get-conference-preference-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09.get-conference-preference-response/preference]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.delete-room-request/room-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/delete-room-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09.delete-room-request/room-arn]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.put-invitation-configuration-request/contact-email (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/email))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.put-invitation-configuration-request/private-skill-ids (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/short-skill-id-list))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/put-invitation-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness.-2017-11-09/organization-name] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09.put-invitation-configuration-request/contact-email :portkey.aws.alexaforbusiness.-2017-11-09.put-invitation-configuration-request/private-skill-ids]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.get-profile-request/profile-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/get-profile-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09.get-profile-request/profile-arn]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/get-address-book-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09/address-book]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/delete-profile-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/category (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09/category-id :portkey.aws.alexaforbusiness.-2017-11-09/category-name]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/associate-skill-with-users-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.list-device-events-request/device-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.list-device-events-request/event-type (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/device-event-type))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/list-device-events-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness.-2017-11-09.list-device-events-request/device-arn] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09.list-device-events-request/event-type :portkey.aws.alexaforbusiness.-2017-11-09/next-token :portkey.aws.alexaforbusiness.-2017-11-09/max-results]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/enrollment-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 0 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/delete-room-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.search-devices-request/filters (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/filter-list))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.search-devices-request/sort-criteria (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/sort-list))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/search-devices-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09/next-token :portkey.aws.alexaforbusiness.-2017-11-09/max-results :portkey.aws.alexaforbusiness.-2017-11-09.search-devices-request/filters :portkey.aws.alexaforbusiness.-2017-11-09.search-devices-request/sort-criteria]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/get-device-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09/device]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.room/room-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.room/description (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/room-description))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.room/profile-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/room (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09.room/room-arn :portkey.aws.alexaforbusiness.-2017-11-09/room-name :portkey.aws.alexaforbusiness.-2017-11-09.room/description :portkey.aws.alexaforbusiness.-2017-11-09/provider-calendar-id :portkey.aws.alexaforbusiness.-2017-11-09.room/profile-arn]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.search-users-response/users (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/user-data-list))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/search-users-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09.search-users-response/users :portkey.aws.alexaforbusiness.-2017-11-09/next-token :portkey.aws.alexaforbusiness.-2017-11-09/total-count]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.forget-smart-home-appliances-request/room-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/forget-smart-home-appliances-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness.-2017-11-09.forget-smart-home-appliances-request/room-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.search-address-books-request/filters (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/filter-list))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.search-address-books-request/sort-criteria (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/sort-list))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/search-address-books-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09.search-address-books-request/filters :portkey.aws.alexaforbusiness.-2017-11-09.search-address-books-request/sort-criteria :portkey.aws.alexaforbusiness.-2017-11-09/next-token :portkey.aws.alexaforbusiness.-2017-11-09/max-results]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/reject-skill-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.create-business-report-schedule-response/schedule-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/create-business-report-schedule-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09.create-business-report-schedule-response/schedule-arn]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.get-address-book-request/address-book-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/get-address-book-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness.-2017-11-09.get-address-book-request/address-book-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/wake-word #{:computer :amazon :alexa "COMPUTER" "ECHO" :echo "ALEXA" "AMAZON"})

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/update-conference-provider-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.disassociate-skill-group-from-room-request/skill-group-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.disassociate-skill-group-from-room-request/room-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/disassociate-skill-group-from-room-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09.disassociate-skill-group-from-room-request/skill-group-arn :portkey.aws.alexaforbusiness.-2017-11-09.disassociate-skill-group-from-room-request/room-arn]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.profile-data/profile-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.profile-data/is-default (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/boolean))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/profile-data (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09.profile-data/profile-arn :portkey.aws.alexaforbusiness.-2017-11-09/profile-name :portkey.aws.alexaforbusiness.-2017-11-09.profile-data/is-default :portkey.aws.alexaforbusiness.-2017-11-09/address :portkey.aws.alexaforbusiness.-2017-11-09/timezone :portkey.aws.alexaforbusiness.-2017-11-09/distance-unit :portkey.aws.alexaforbusiness.-2017-11-09/temperature-unit :portkey.aws.alexaforbusiness.-2017-11-09/wake-word]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/user-user-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 128)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[a-zA-Z0-9@_+.-]*" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/contact-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 100)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[\u0009\u000A\u000D\u0020-\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.search-rooms-request/filters (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/filter-list))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.search-rooms-request/sort-criteria (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/sort-list))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/search-rooms-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09/next-token :portkey.aws.alexaforbusiness.-2017-11-09/max-results :portkey.aws.alexaforbusiness.-2017-11-09.search-rooms-request/filters :portkey.aws.alexaforbusiness.-2017-11-09.search-rooms-request/sort-criteria]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/user-code (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/start-smart-home-appliance-discovery-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/address-book-data-list (clojure.spec.alpha/coll-of :portkey.aws.alexaforbusiness.-2017-11-09/address-book-data))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/address-book-description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 200)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[\u0009\u000A\u000D\u0020-\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/developer-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.skill-not-linked-exception/message (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/error-message))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/skill-not-linked-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09.skill-not-linked-exception/message]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.register-avs-device-request/device-serial-number (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/device-serial-number-for-avs))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/register-avs-device-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness.-2017-11-09/client-id :portkey.aws.alexaforbusiness.-2017-11-09/user-code :portkey.aws.alexaforbusiness.-2017-11-09/product-id :portkey.aws.alexaforbusiness.-2017-11-09.register-avs-device-request/device-serial-number :portkey.aws.alexaforbusiness.-2017-11-09/amazon-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.associate-skill-with-skill-group-request/skill-group-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/associate-skill-with-skill-group-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness.-2017-11-09/skill-id] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09.associate-skill-with-skill-group-request/skill-group-arn]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.list-tags-response/tags (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/tag-list))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/list-tags-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09.list-tags-response/tags :portkey.aws.alexaforbusiness.-2017-11-09/next-token]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/skill-type-filter #{:private :public :all "PRIVATE" "PUBLIC" "ALL"})

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.conference-preference/default-conference-provider-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/conference-preference (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09.conference-preference/default-conference-provider-arn]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/approve-skill-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/feature #{"NOTIFICATIONS" :lists "SKILLS" "LISTS" :bluetooth "BLUETOOTH" :all :volume :notifications :skills "VOLUME" "ALL"})

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/mac-address (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/user-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"amzn1\.[A-Za-z0-9+-\/=.]{1,300}" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/device-serial-number-for-avs (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9]{1,50}$" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.search-contacts-response/contacts (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/contact-data-list))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/search-contacts-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09.search-contacts-response/contacts :portkey.aws.alexaforbusiness.-2017-11-09/next-token :portkey.aws.alexaforbusiness.-2017-11-09/total-count]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.skill-group/skill-group-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.skill-group/description (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/skill-group-description))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/skill-group (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09.skill-group/skill-group-arn :portkey.aws.alexaforbusiness.-2017-11-09/skill-group-name :portkey.aws.alexaforbusiness.-2017-11-09.skill-group/description]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/amazon-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[a-zA-Z0-9]{1,18}" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 128)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.get-device-request/device-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/get-device-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09.get-device-request/device-arn]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.update-device-request/device-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/update-device-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09.update-device-request/device-arn :portkey.aws.alexaforbusiness.-2017-11-09/device-name]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/business-report-schedule-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 0 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 64)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[\u0009\u000A\u000D\u0020-\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/category-list (clojure.spec.alpha/coll-of :portkey.aws.alexaforbusiness.-2017-11-09/category))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.search-users-request/filters (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/filter-list))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.search-users-request/sort-criteria (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/sort-list))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/search-users-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09/next-token :portkey.aws.alexaforbusiness.-2017-11-09/max-results :portkey.aws.alexaforbusiness.-2017-11-09.search-users-request/filters :portkey.aws.alexaforbusiness.-2017-11-09.search-users-request/sort-criteria]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/country-code (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"\d{1,3}" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/generic-keywords (clojure.spec.alpha/coll-of :portkey.aws.alexaforbusiness.-2017-11-09/generic-keyword))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.search-address-books-response/address-books (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/address-book-data-list))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/search-address-books-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09.search-address-books-response/address-books :portkey.aws.alexaforbusiness.-2017-11-09/next-token :portkey.aws.alexaforbusiness.-2017-11-09/total-count]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.resource-in-use-exception/message (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/error-message))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/resource-in-use-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09.resource-in-use-exception/message :portkey.aws.alexaforbusiness.-2017-11-09/client-request-token]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/skill-group-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 100)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[\u0009\u000A\u000D\u0020-\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.delete-room-skill-parameter-request/room-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.delete-room-skill-parameter-request/parameter-key (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/room-skill-parameter-key))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/delete-room-skill-parameter-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness.-2017-11-09/skill-id :portkey.aws.alexaforbusiness.-2017-11-09.delete-room-skill-parameter-request/parameter-key] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09.delete-room-skill-parameter-request/room-arn]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.search-profiles-response/profiles (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/profile-data-list))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/search-profiles-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09.search-profiles-response/profiles :portkey.aws.alexaforbusiness.-2017-11-09/next-token :portkey.aws.alexaforbusiness.-2017-11-09/total-count]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.search-devices-response/devices (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/device-data-list))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/search-devices-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09.search-devices-response/devices :portkey.aws.alexaforbusiness.-2017-11-09/next-token :portkey.aws.alexaforbusiness.-2017-11-09/total-count]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.invalid-certificate-authority-exception/message (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/error-message))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/invalid-certificate-authority-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09.invalid-certificate-authority-exception/message]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/organization-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 100)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"([A-Za-z\-' 0-9._]|\p{IsLetter})*" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.pstn-dial-in/phone-number (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/outbound-phone-number))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/pstn-dial-in (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness.-2017-11-09/country-code :portkey.aws.alexaforbusiness.-2017-11-09.pstn-dial-in/phone-number :portkey.aws.alexaforbusiness.-2017-11-09/one-click-id-delay :portkey.aws.alexaforbusiness.-2017-11-09/one-click-pin-delay] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/error-message))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09.limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.room-skill-parameter/parameter-key (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/room-skill-parameter-key))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.room-skill-parameter/parameter-value (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/room-skill-parameter-value))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/room-skill-parameter (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness.-2017-11-09.room-skill-parameter/parameter-key :portkey.aws.alexaforbusiness.-2017-11-09.room-skill-parameter/parameter-value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.revoke-invitation-request/user-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/revoke-invitation-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09.revoke-invitation-request/user-arn :portkey.aws.alexaforbusiness.-2017-11-09/enrollment-id]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/short-description (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.address-book-data/address-book-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.address-book-data/name (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/address-book-name))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.address-book-data/description (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/address-book-description))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/address-book-data (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09.address-book-data/address-book-arn :portkey.aws.alexaforbusiness.-2017-11-09.address-book-data/name :portkey.aws.alexaforbusiness.-2017-11-09.address-book-data/description]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/device-status-detail-code #{"DEVICE_WAS_OFFLINE" :device-was-offline "DEVICE_SOFTWARE_UPDATE_NEEDED" :device-software-update-needed})

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.put-skill-authorization-request/room-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/put-skill-authorization-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness.-2017-11-09/authorization-result :portkey.aws.alexaforbusiness.-2017-11-09/skill-id] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09.put-skill-authorization-request/room-arn]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.resolve-room-response/room-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/resolve-room-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09.resolve-room-response/room-arn :portkey.aws.alexaforbusiness.-2017-11-09/room-name :portkey.aws.alexaforbusiness.-2017-11-09/room-skill-parameters]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.device-status-detail/code (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/device-status-detail-code))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/device-status-detail (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09.device-status-detail/code]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.invalid-user-status-exception/message (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/error-message))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/invalid-user-status-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09.invalid-user-status-exception/message]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/device-data-list (clojure.spec.alpha/coll-of :portkey.aws.alexaforbusiness.-2017-11-09/device-data))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/update-profile-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/appliance-friendly-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.associate-skill-group-with-room-request/skill-group-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.associate-skill-group-with-room-request/room-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/associate-skill-group-with-room-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09.associate-skill-group-with-room-request/skill-group-arn :portkey.aws.alexaforbusiness.-2017-11-09.associate-skill-group-with-room-request/room-arn]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/disassociate-contact-from-address-book-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/reject-skill-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness.-2017-11-09/skill-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/skills-store-skill-list (clojure.spec.alpha/coll-of :portkey.aws.alexaforbusiness.-2017-11-09/skills-store-skill))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.get-skill-group-request/skill-group-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/get-skill-group-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09.get-skill-group-request/skill-group-arn]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/room-skill-parameters (clojure.spec.alpha/coll-of :portkey.aws.alexaforbusiness.-2017-11-09/room-skill-parameter))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/update-device-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/disassociate-device-from-room-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/disassociate-skill-from-skill-group-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/put-room-skill-parameter-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/update-skill-group-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/conference-provider-type #{:zoom "CUSTOM" "BLUEJEANS" :fuze "WEBEX" "FUZE" "GOOGLE_HANGOUTS" :custom "ZOOM" "RINGCENTRAL" :bluejeans "POLYCOM" :ringcentral :google-hangouts "SKYPE_FOR_BUSINESS" :skype-for-business :webex "CHIME" :chime :polycom})

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.contact/contact-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.contact/display-name (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/contact-name))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.contact/first-name (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/contact-name))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.contact/last-name (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/contact-name))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.contact/phone-number (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/e-164-phone-number))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/contact (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09.contact/contact-arn :portkey.aws.alexaforbusiness.-2017-11-09.contact/display-name :portkey.aws.alexaforbusiness.-2017-11-09.contact/first-name :portkey.aws.alexaforbusiness.-2017-11-09.contact/last-name :portkey.aws.alexaforbusiness.-2017-11-09.contact/phone-number]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/next-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 1000))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/sample-utterances (clojure.spec.alpha/coll-of :portkey.aws.alexaforbusiness.-2017-11-09/utterance))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/tag-resource-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/delete-user-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/review-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/connection-status #{:offline :online "OFFLINE" "ONLINE"})

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/date (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"^\d{4}\-(0?[1-9]|1[012])\-(0?[1-9]|[12][0-9]|3[01])$" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/business-report-status #{:running "SUCCEEDED" "FAILED" :failed "RUNNING" :succeeded})

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.associate-contact-with-address-book-request/contact-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.associate-contact-with-address-book-request/address-book-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/associate-contact-with-address-book-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness.-2017-11-09.associate-contact-with-address-book-request/contact-arn :portkey.aws.alexaforbusiness.-2017-11-09.associate-contact-with-address-book-request/address-book-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/review-key (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/conference-provider-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 50)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[\u0009\u000A\u000D\u0020-\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.device-event/type (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/device-event-type))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.device-event/value (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/device-event-value))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/device-event (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09.device-event/type :portkey.aws.alexaforbusiness.-2017-11-09.device-event/value :portkey.aws.alexaforbusiness.-2017-11-09/timestamp]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/delete-skill-authorization-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/enablement-type-filter #{:pending "PENDING" "ENABLED" :enabled})

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/update-business-report-schedule-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/address-book-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 100)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[\u0009\u000A\u000D\u0020-\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/outbound-phone-number (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"\d{10}" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.get-conference-provider-request/conference-provider-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/get-conference-provider-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness.-2017-11-09.get-conference-provider-request/conference-provider-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__)))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/comms-protocol #{"SIP" :sips "H323" :h-323 :sip "SIPS"})

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.create-profile-request/setup-mode-disabled (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/boolean))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.create-profile-request/pstn-enabled (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/boolean))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/create-profile-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness.-2017-11-09/profile-name :portkey.aws.alexaforbusiness.-2017-11-09/timezone :portkey.aws.alexaforbusiness.-2017-11-09/address :portkey.aws.alexaforbusiness.-2017-11-09/distance-unit :portkey.aws.alexaforbusiness.-2017-11-09/temperature-unit :portkey.aws.alexaforbusiness.-2017-11-09/wake-word] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09/client-request-token :portkey.aws.alexaforbusiness.-2017-11-09.create-profile-request/setup-mode-disabled :portkey.aws.alexaforbusiness.-2017-11-09.create-profile-request/pstn-enabled :portkey.aws.alexaforbusiness.-2017-11-09/max-volume-limit]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/resolve-room-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness.-2017-11-09/user-id :portkey.aws.alexaforbusiness.-2017-11-09/skill-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.delete-address-book-request/address-book-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/delete-address-book-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness.-2017-11-09.delete-address-book-request/address-book-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.create-contact-request/display-name (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/contact-name))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.create-contact-request/first-name (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/contact-name))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.create-contact-request/last-name (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/contact-name))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.create-contact-request/phone-number (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/e-164-phone-number))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/create-contact-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness.-2017-11-09.create-contact-request/first-name] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09.create-contact-request/display-name :portkey.aws.alexaforbusiness.-2017-11-09.create-contact-request/last-name :portkey.aws.alexaforbusiness.-2017-11-09.create-contact-request/phone-number :portkey.aws.alexaforbusiness.-2017-11-09/client-request-token]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.tag-resource-request/tags (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/tag-list))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/tag-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness.-2017-11-09/arn :portkey.aws.alexaforbusiness.-2017-11-09.tag-resource-request/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/filter-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 500))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/send-invitation-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/skill-summary-list (clojure.spec.alpha/coll-of :portkey.aws.alexaforbusiness.-2017-11-09/skill-summary))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/skill-group-data-list (clojure.spec.alpha/coll-of :portkey.aws.alexaforbusiness.-2017-11-09/skill-group-data))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/tag-list (clojure.spec.alpha/coll-of :portkey.aws.alexaforbusiness.-2017-11-09/tag))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/category-id clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/list-skills-store-categories-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09/next-token :portkey.aws.alexaforbusiness.-2017-11-09/max-results]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.delete-skill-group-request/skill-group-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/delete-skill-group-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09.delete-skill-group-request/skill-group-arn]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.search-contacts-request/filters (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/filter-list))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.search-contacts-request/sort-criteria (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/sort-list))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/search-contacts-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09.search-contacts-request/filters :portkey.aws.alexaforbusiness.-2017-11-09.search-contacts-request/sort-criteria :portkey.aws.alexaforbusiness.-2017-11-09/next-token :portkey.aws.alexaforbusiness.-2017-11-09/max-results]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.get-room-request/room-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/get-room-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09.get-room-request/room-arn]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/get-room-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09/room]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/timezone (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 100))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/tag-key-list (clojure.spec.alpha/coll-of :portkey.aws.alexaforbusiness.-2017-11-09/tag-key))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/one-click-pin-delay (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 2))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/disassociate-skill-group-from-room-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.skill-summary/supports-linking (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/boolean))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/skill-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09/skill-id :portkey.aws.alexaforbusiness.-2017-11-09/skill-name :portkey.aws.alexaforbusiness.-2017-11-09.skill-summary/supports-linking :portkey.aws.alexaforbusiness.-2017-11-09/enablement-type :portkey.aws.alexaforbusiness.-2017-11-09/skill-type]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/skill-details (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09/generic-keywords :portkey.aws.alexaforbusiness.-2017-11-09/release-date :portkey.aws.alexaforbusiness.-2017-11-09/product-description :portkey.aws.alexaforbusiness.-2017-11-09/developer-info :portkey.aws.alexaforbusiness.-2017-11-09/reviews :portkey.aws.alexaforbusiness.-2017-11-09/bullet-points :portkey.aws.alexaforbusiness.-2017-11-09/skill-types :portkey.aws.alexaforbusiness.-2017-11-09/new-in-this-version-bullet-points :portkey.aws.alexaforbusiness.-2017-11-09/end-user-license-agreement :portkey.aws.alexaforbusiness.-2017-11-09/invocation-phrase]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.update-conference-provider-request/conference-provider-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/update-conference-provider-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness.-2017-11-09.update-conference-provider-request/conference-provider-arn :portkey.aws.alexaforbusiness.-2017-11-09/conference-provider-type :portkey.aws.alexaforbusiness.-2017-11-09/meeting-setting] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09/ip-dial-in :portkey.aws.alexaforbusiness.-2017-11-09/pstn-dial-in]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/forget-smart-home-appliances-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.get-invitation-configuration-response/contact-email (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/email))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.get-invitation-configuration-response/private-skill-ids (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/short-skill-id-list))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/get-invitation-configuration-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09/organization-name :portkey.aws.alexaforbusiness.-2017-11-09.get-invitation-configuration-response/contact-email :portkey.aws.alexaforbusiness.-2017-11-09.get-invitation-configuration-response/private-skill-ids]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/revoke-invitation-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/utterance (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__)))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/get-conference-provider-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09/conference-provider]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/appliance-description (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.device-data/device-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.device-data/room-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/device-data (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09/device-serial-number :portkey.aws.alexaforbusiness.-2017-11-09/software-version :portkey.aws.alexaforbusiness.-2017-11-09/device-status-info :portkey.aws.alexaforbusiness.-2017-11-09/mac-address :portkey.aws.alexaforbusiness.-2017-11-09.device-data/device-arn :portkey.aws.alexaforbusiness.-2017-11-09/device-type :portkey.aws.alexaforbusiness.-2017-11-09/device-status :portkey.aws.alexaforbusiness.-2017-11-09/device-name :portkey.aws.alexaforbusiness.-2017-11-09.device-data/room-arn :portkey.aws.alexaforbusiness.-2017-11-09/room-name]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/approve-skill-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness.-2017-11-09/skill-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.device-not-registered-exception/message (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/error-message))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/device-not-registered-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09.device-not-registered-exception/message]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.profile/setup-mode-disabled (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/boolean))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.profile/pstn-enabled (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/boolean))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.profile/profile-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.profile/address-book-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.profile/is-default (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/boolean))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/profile (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09/address :portkey.aws.alexaforbusiness.-2017-11-09/wake-word :portkey.aws.alexaforbusiness.-2017-11-09.profile/setup-mode-disabled :portkey.aws.alexaforbusiness.-2017-11-09.profile/pstn-enabled :portkey.aws.alexaforbusiness.-2017-11-09/timezone :portkey.aws.alexaforbusiness.-2017-11-09/max-volume-limit :portkey.aws.alexaforbusiness.-2017-11-09.profile/profile-arn :portkey.aws.alexaforbusiness.-2017-11-09.profile/address-book-arn :portkey.aws.alexaforbusiness.-2017-11-09/temperature-unit :portkey.aws.alexaforbusiness.-2017-11-09/distance-unit :portkey.aws.alexaforbusiness.-2017-11-09.profile/is-default :portkey.aws.alexaforbusiness.-2017-11-09/profile-name]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/url (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/user-first-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 0 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 30)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"([A-Za-z\-' 0-9._]|\p{IsLetter})*" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/authorization-result (clojure.spec.alpha/map-of :portkey.aws.alexaforbusiness.-2017-11-09/key :portkey.aws.alexaforbusiness.-2017-11-09/value))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/require-pin #{:yes "OPTIONAL" :optional "NO" "YES" :no})

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.search-skill-groups-request/filters (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/filter-list))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.search-skill-groups-request/sort-criteria (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/sort-list))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/search-skill-groups-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09/next-token :portkey.aws.alexaforbusiness.-2017-11-09/max-results :portkey.aws.alexaforbusiness.-2017-11-09.search-skill-groups-request/filters :portkey.aws.alexaforbusiness.-2017-11-09.search-skill-groups-request/sort-criteria]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 0 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 256)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.invalid-device-exception/message (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/error-message))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/invalid-device-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09.invalid-device-exception/message]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/total-count clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/associate-skill-with-skill-group-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/device-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[a-zA-Z0-9]{1,200}" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/customer-s-3-bucket-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[a-z0-9-\.]{3,63}" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.get-room-skill-parameter-request/room-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.get-room-skill-parameter-request/parameter-key (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/room-skill-parameter-key))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/get-room-skill-parameter-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness.-2017-11-09/skill-id :portkey.aws.alexaforbusiness.-2017-11-09.get-room-skill-parameter-request/parameter-key] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09.get-room-skill-parameter-request/room-arn]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.delete-business-report-schedule-request/schedule-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/delete-business-report-schedule-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness.-2017-11-09.delete-business-report-schedule-request/schedule-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/profile-data-list (clojure.spec.alpha/coll-of :portkey.aws.alexaforbusiness.-2017-11-09/profile-data))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/max-volume-limit clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.create-address-book-request/name (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/address-book-name))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.create-address-book-request/description (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/address-book-description))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/create-address-book-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness.-2017-11-09.create-address-book-request/name] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09.create-address-book-request/description :portkey.aws.alexaforbusiness.-2017-11-09/client-request-token]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/device-status #{:ready :pending "READY" "PENDING" "WAS_OFFLINE" :deregistered "DEREGISTERED" :was-offline})

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.not-found-exception/message (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/error-message))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09.not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/get-contact-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09/contact]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/get-conference-preference-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.start-device-sync-request/room-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.start-device-sync-request/device-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/start-device-sync-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness.-2017-11-09/features] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09.start-device-sync-request/room-arn :portkey.aws.alexaforbusiness.-2017-11-09.start-device-sync-request/device-arn]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.update-business-report-schedule-request/schedule-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.update-business-report-schedule-request/s-3-bucket-name (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/customer-s-3-bucket-name))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.update-business-report-schedule-request/format (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/business-report-format))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.update-business-report-schedule-request/schedule-name (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/business-report-schedule-name))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.update-business-report-schedule-request/recurrence (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/business-report-recurrence))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/update-business-report-schedule-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness.-2017-11-09.update-business-report-schedule-request/schedule-arn] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09.update-business-report-schedule-request/s-3-bucket-name :portkey.aws.alexaforbusiness.-2017-11-09/s-3-key-prefix :portkey.aws.alexaforbusiness.-2017-11-09.update-business-report-schedule-request/format :portkey.aws.alexaforbusiness.-2017-11-09.update-business-report-schedule-request/schedule-name :portkey.aws.alexaforbusiness.-2017-11-09.update-business-report-schedule-request/recurrence]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.address-book/address-book-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.address-book/name (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/address-book-name))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.address-book/description (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/address-book-description))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/address-book (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09.address-book/address-book-arn :portkey.aws.alexaforbusiness.-2017-11-09.address-book/name :portkey.aws.alexaforbusiness.-2017-11-09.address-book/description]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/list-skills-store-categories-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09/category-list :portkey.aws.alexaforbusiness.-2017-11-09/next-token]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/delete-address-book-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.business-report-schedule/schedule-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.business-report-schedule/schedule-name (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/business-report-schedule-name))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.business-report-schedule/s-3-bucket-name (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/customer-s-3-bucket-name))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.business-report-schedule/format (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/business-report-format))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.business-report-schedule/content-range (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/business-report-content-range))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.business-report-schedule/recurrence (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/business-report-recurrence))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.business-report-schedule/last-business-report (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/business-report))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/business-report-schedule (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09.business-report-schedule/schedule-arn :portkey.aws.alexaforbusiness.-2017-11-09.business-report-schedule/schedule-name :portkey.aws.alexaforbusiness.-2017-11-09.business-report-schedule/s-3-bucket-name :portkey.aws.alexaforbusiness.-2017-11-09/s-3-key-prefix :portkey.aws.alexaforbusiness.-2017-11-09.business-report-schedule/format :portkey.aws.alexaforbusiness.-2017-11-09.business-report-schedule/content-range :portkey.aws.alexaforbusiness.-2017-11-09.business-report-schedule/recurrence :portkey.aws.alexaforbusiness.-2017-11-09.business-report-schedule/last-business-report]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/one-click-id-delay (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 2))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/sort-value #{:desc "DESC" :asc "ASC"})

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/business-report-s-3-path (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/put-skill-authorization-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/user-data-list (clojure.spec.alpha/coll-of :portkey.aws.alexaforbusiness.-2017-11-09/user-data))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.search-skill-groups-response/skill-groups (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/skill-group-data-list))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/search-skill-groups-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09.search-skill-groups-response/skill-groups :portkey.aws.alexaforbusiness.-2017-11-09/next-token :portkey.aws.alexaforbusiness.-2017-11-09/total-count]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.delete-device-request/device-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/delete-device-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness.-2017-11-09.delete-device-request/device-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/update-room-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/disassociate-skill-from-users-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness.-2017-11-09/skill-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/release-date (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/update-address-book-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/room-description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 200)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[\u0009\u000A\u000D\u0020-\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.create-skill-group-response/skill-group-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/create-skill-group-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09.create-skill-group-response/skill-group-arn]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/appliance-manufacturer-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/get-invitation-configuration-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/list-conference-providers-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09/next-token :portkey.aws.alexaforbusiness.-2017-11-09/max-results]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/business-report-failure-code #{"NO_SUCH_BUCKET" "INTERNAL_FAILURE" :internal-failure "ACCESS_DENIED" :no-such-bucket :access-denied})

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/room-skill-parameter-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/client-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"^\S+{1,256}$" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/get-room-skill-parameter-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09/room-skill-parameter]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.list-skills-request/skill-group-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.list-skills-request/enablement-type (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/enablement-type-filter))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.list-skills-request/skill-type (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/skill-type-filter))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.list-skills-request/max-results (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/skill-list-max-results))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/list-skills-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09.list-skills-request/skill-group-arn :portkey.aws.alexaforbusiness.-2017-11-09.list-skills-request/enablement-type :portkey.aws.alexaforbusiness.-2017-11-09.list-skills-request/skill-type :portkey.aws.alexaforbusiness.-2017-11-09/next-token :portkey.aws.alexaforbusiness.-2017-11-09.list-skills-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.list-device-events-response/device-events (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/device-event-list))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/list-device-events-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09.list-device-events-response/device-events :portkey.aws.alexaforbusiness.-2017-11-09/next-token]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/s-3-key-prefix (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 0 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 100)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[A-Za-z0-9!_\-\.\*'()/]*" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/product-description (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:[^/].{0,1023}" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.update-address-book-request/address-book-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.update-address-book-request/name (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/address-book-name))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.update-address-book-request/description (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/address-book-description))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/update-address-book-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness.-2017-11-09.update-address-book-request/address-book-arn] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09.update-address-book-request/name :portkey.aws.alexaforbusiness.-2017-11-09.update-address-book-request/description]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.start-smart-home-appliance-discovery-request/room-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/start-smart-home-appliance-discovery-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness.-2017-11-09.start-smart-home-appliance-discovery-request/room-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/create-conference-provider-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness.-2017-11-09/conference-provider-name :portkey.aws.alexaforbusiness.-2017-11-09/conference-provider-type :portkey.aws.alexaforbusiness.-2017-11-09/meeting-setting] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09/ip-dial-in :portkey.aws.alexaforbusiness.-2017-11-09/pstn-dial-in :portkey.aws.alexaforbusiness.-2017-11-09/client-request-token]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.create-profile-response/profile-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/create-profile-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09.create-profile-response/profile-arn]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.skills-store-skill/supports-linking (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/boolean))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/skills-store-skill (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09/skill-id :portkey.aws.alexaforbusiness.-2017-11-09/skill-name :portkey.aws.alexaforbusiness.-2017-11-09/short-description :portkey.aws.alexaforbusiness.-2017-11-09/icon-url :portkey.aws.alexaforbusiness.-2017-11-09/sample-utterances :portkey.aws.alexaforbusiness.-2017-11-09/skill-details :portkey.aws.alexaforbusiness.-2017-11-09.skills-store-skill/supports-linking]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/skill-list-max-results (clojure.spec.alpha/int-in 1 10))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.create-user-request/user-id (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/user-user-id))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.create-user-request/first-name (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/user-first-name))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.create-user-request/last-name (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/user-last-name))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.create-user-request/tags (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/tag-list))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/create-user-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness.-2017-11-09.create-user-request/user-id] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09.create-user-request/first-name :portkey.aws.alexaforbusiness.-2017-11-09.create-user-request/last-name :portkey.aws.alexaforbusiness.-2017-11-09/email :portkey.aws.alexaforbusiness.-2017-11-09/client-request-token :portkey.aws.alexaforbusiness.-2017-11-09.create-user-request/tags]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/start-device-sync-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/endpoint (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/user-last-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 0 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 30)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"([A-Za-z\-' 0-9._]|\p{IsLetter})*" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.disassociate-contact-from-address-book-request/contact-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.disassociate-contact-from-address-book-request/address-book-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/disassociate-contact-from-address-book-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness.-2017-11-09.disassociate-contact-from-address-book-request/contact-arn :portkey.aws.alexaforbusiness.-2017-11-09.disassociate-contact-from-address-book-request/address-book-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/disassociate-skill-from-users-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/delete-contact-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.search-profiles-request/filters (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/filter-list))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.search-profiles-request/sort-criteria (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/sort-list))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/search-profiles-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09/next-token :portkey.aws.alexaforbusiness.-2017-11-09/max-results :portkey.aws.alexaforbusiness.-2017-11-09.search-profiles-request/filters :portkey.aws.alexaforbusiness.-2017-11-09.search-profiles-request/sort-criteria]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.create-skill-group-request/description (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/skill-group-description))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/create-skill-group-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness.-2017-11-09/skill-group-name] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09.create-skill-group-request/description :portkey.aws.alexaforbusiness.-2017-11-09/client-request-token]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/device-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 2 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 100)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[\u0009\u000A\u000D\u0020-\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.update-contact-request/contact-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.update-contact-request/display-name (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/contact-name))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.update-contact-request/first-name (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/contact-name))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.update-contact-request/last-name (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/contact-name))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.update-contact-request/phone-number (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/e-164-phone-number))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/update-contact-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness.-2017-11-09.update-contact-request/contact-arn] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09.update-contact-request/display-name :portkey.aws.alexaforbusiness.-2017-11-09.update-contact-request/first-name :portkey.aws.alexaforbusiness.-2017-11-09.update-contact-request/last-name :portkey.aws.alexaforbusiness.-2017-11-09.update-contact-request/phone-number]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/delete-room-skill-parameter-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/temperature-unit #{:fahrenheit "CELSIUS" :celsius "FAHRENHEIT"})

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.create-room-response/room-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/create-room-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09.create-room-response/room-arn]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/category-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.list-skills-store-skills-by-category-response/skills-store-skills (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/skills-store-skill-list))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/list-skills-store-skills-by-category-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09.list-skills-store-skills-by-category-response/skills-store-skills :portkey.aws.alexaforbusiness.-2017-11-09/next-token]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/room-skill-parameter-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 512))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.contact-data/contact-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.contact-data/display-name (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/contact-name))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.contact-data/first-name (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/contact-name))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.contact-data/last-name (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/contact-name))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.contact-data/phone-number (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/e-164-phone-number))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/contact-data (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09.contact-data/contact-arn :portkey.aws.alexaforbusiness.-2017-11-09.contact-data/display-name :portkey.aws.alexaforbusiness.-2017-11-09.contact-data/first-name :portkey.aws.alexaforbusiness.-2017-11-09.contact-data/last-name :portkey.aws.alexaforbusiness.-2017-11-09.contact-data/phone-number]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.business-report-content-range/interval (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/business-report-interval))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/business-report-content-range (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09.business-report-content-range/interval]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.update-room-request/room-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.update-room-request/description (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/room-description))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.update-room-request/profile-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/update-room-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09.update-room-request/room-arn :portkey.aws.alexaforbusiness.-2017-11-09/room-name :portkey.aws.alexaforbusiness.-2017-11-09.update-room-request/description :portkey.aws.alexaforbusiness.-2017-11-09/provider-calendar-id :portkey.aws.alexaforbusiness.-2017-11-09.update-room-request/profile-arn]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/get-skill-group-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09/skill-group]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/get-profile-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09/profile]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.delete-user-request/user-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/delete-user-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness.-2017-11-09/enrollment-id] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09.delete-user-request/user-arn]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/distance-unit #{"IMPERIAL" :imperial :metric "METRIC"})

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/developer-info (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09/developer-name :portkey.aws.alexaforbusiness.-2017-11-09/privacy-policy :portkey.aws.alexaforbusiness.-2017-11-09/email :portkey.aws.alexaforbusiness.-2017-11-09/url]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/max-results (clojure.spec.alpha/int-in 1 50))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.tag/key (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/tag-key))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.tag/value (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/tag-value))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/tag (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness.-2017-11-09.tag/key :portkey.aws.alexaforbusiness.-2017-11-09.tag/value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/business-report-format #{"CSV" :csv :csv-zip "CSV_ZIP"})

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/business-report-schedule-list (clojure.spec.alpha/coll-of :portkey.aws.alexaforbusiness.-2017-11-09/business-report-schedule))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.list-skills-response/skill-summaries (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/skill-summary-list))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/list-skills-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09.list-skills-response/skill-summaries :portkey.aws.alexaforbusiness.-2017-11-09/next-token]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.list-business-report-schedules-response/business-report-schedules (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/business-report-schedule-list))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/list-business-report-schedules-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09.list-business-report-schedules-response/business-report-schedules :portkey.aws.alexaforbusiness.-2017-11-09/next-token]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/skill-store-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/reviews (clojure.spec.alpha/map-of :portkey.aws.alexaforbusiness.-2017-11-09/review-key :portkey.aws.alexaforbusiness.-2017-11-09/review-value))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.create-room-request/description (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/room-description))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.create-room-request/profile-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.create-room-request/tags (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/tag-list))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/create-room-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness.-2017-11-09/room-name] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09.create-room-request/description :portkey.aws.alexaforbusiness.-2017-11-09.create-room-request/profile-arn :portkey.aws.alexaforbusiness.-2017-11-09/provider-calendar-id :portkey.aws.alexaforbusiness.-2017-11-09/client-request-token :portkey.aws.alexaforbusiness.-2017-11-09.create-room-request/tags]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/business-report-interval #{"ONE_DAY" :one-day "ONE_WEEK" :one-week})

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/business-report-download-url (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/delete-device-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/icon-url (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.room-data/room-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.room-data/description (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/room-description))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.room-data/profile-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/room-data (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09.room-data/room-arn :portkey.aws.alexaforbusiness.-2017-11-09/room-name :portkey.aws.alexaforbusiness.-2017-11-09.room-data/description :portkey.aws.alexaforbusiness.-2017-11-09/provider-calendar-id :portkey.aws.alexaforbusiness.-2017-11-09.room-data/profile-arn :portkey.aws.alexaforbusiness.-2017-11-09/profile-name]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/delete-skill-group-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/device-event-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.delete-skill-authorization-request/room-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/delete-skill-authorization-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness.-2017-11-09/skill-id] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09.delete-skill-authorization-request/room-arn]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.send-invitation-request/user-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/send-invitation-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09.send-invitation-request/user-arn]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/device-event-list (clojure.spec.alpha/coll-of :portkey.aws.alexaforbusiness.-2017-11-09/device-event))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.list-conference-providers-response/conference-providers (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/conference-providers-list))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/list-conference-providers-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09.list-conference-providers-response/conference-providers :portkey.aws.alexaforbusiness.-2017-11-09/next-token]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/bullet-point (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.concurrent-modification-exception/message (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/error-message))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/concurrent-modification-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09.concurrent-modification-exception/message]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/enablement-type #{:pending "PENDING" "ENABLED" :enabled})

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/put-conference-preference-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness.-2017-11-09/conference-preference] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.put-room-skill-parameter-request/room-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/put-room-skill-parameter-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness.-2017-11-09/skill-id :portkey.aws.alexaforbusiness.-2017-11-09/room-skill-parameter] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09.put-room-skill-parameter-request/room-arn]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/device-event-type #{"DEVICE_STATUS" :connection-status "CONNECTION_STATUS" :device-status})

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/e-164-phone-number (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"^\+\d{8,}$" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/contact-data-list (clojure.spec.alpha/coll-of :portkey.aws.alexaforbusiness.-2017-11-09/contact-data))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/bullet-points (clojure.spec.alpha/coll-of :portkey.aws.alexaforbusiness.-2017-11-09/bullet-point))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/skill-types (clojure.spec.alpha/coll-of :portkey.aws.alexaforbusiness.-2017-11-09/skill-store-type))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.update-skill-group-request/skill-group-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.update-skill-group-request/description (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/skill-group-description))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/update-skill-group-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09.update-skill-group-request/skill-group-arn :portkey.aws.alexaforbusiness.-2017-11-09/skill-group-name :portkey.aws.alexaforbusiness.-2017-11-09.update-skill-group-request/description]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.list-skills-store-skills-by-category-request/max-results (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/skill-list-max-results))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/list-skills-store-skills-by-category-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness.-2017-11-09/category-id] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09/next-token :portkey.aws.alexaforbusiness.-2017-11-09.list-skills-store-skills-by-category-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.business-report/status (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/business-report-status))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.business-report/failure-code (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/business-report-failure-code))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.business-report/s-3-location (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/business-report-s-3-location))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.business-report/delivery-time (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/timestamp))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.business-report/download-url (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/business-report-download-url))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/business-report (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09.business-report/status :portkey.aws.alexaforbusiness.-2017-11-09.business-report/failure-code :portkey.aws.alexaforbusiness.-2017-11-09.business-report/s-3-location :portkey.aws.alexaforbusiness.-2017-11-09.business-report/delivery-time :portkey.aws.alexaforbusiness.-2017-11-09.business-report/download-url]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/delete-business-report-schedule-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/new-in-this-version-bullet-points (clojure.spec.alpha/coll-of :portkey.aws.alexaforbusiness.-2017-11-09/bullet-point))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/product-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9_]{1,256}$" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.associate-device-with-room-request/device-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.associate-device-with-room-request/room-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/associate-device-with-room-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09.associate-device-with-room-request/device-arn :portkey.aws.alexaforbusiness.-2017-11-09.associate-device-with-room-request/room-arn]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.get-contact-request/contact-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/get-contact-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness.-2017-11-09.get-contact-request/contact-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/skill-group-description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 200)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[\u0009\u000A\u000D\u0020-\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.create-business-report-schedule-request/schedule-name (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/business-report-schedule-name))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.create-business-report-schedule-request/s-3-bucket-name (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/customer-s-3-bucket-name))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.create-business-report-schedule-request/format (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/business-report-format))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.create-business-report-schedule-request/content-range (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/business-report-content-range))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.create-business-report-schedule-request/recurrence (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/business-report-recurrence))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/create-business-report-schedule-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness.-2017-11-09.create-business-report-schedule-request/format :portkey.aws.alexaforbusiness.-2017-11-09.create-business-report-schedule-request/content-range] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09.create-business-report-schedule-request/schedule-name :portkey.aws.alexaforbusiness.-2017-11-09.create-business-report-schedule-request/s-3-bucket-name :portkey.aws.alexaforbusiness.-2017-11-09/s-3-key-prefix :portkey.aws.alexaforbusiness.-2017-11-09.create-business-report-schedule-request/recurrence :portkey.aws.alexaforbusiness.-2017-11-09/client-request-token]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.register-avs-device-response/device-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/register-avs-device-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09.register-avs-device-response/device-arn]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/room-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 100)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[\u0009\u000A\u000D\u0020-\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.device/device-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.device/room-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/device (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09/device-serial-number :portkey.aws.alexaforbusiness.-2017-11-09/software-version :portkey.aws.alexaforbusiness.-2017-11-09/device-status-info :portkey.aws.alexaforbusiness.-2017-11-09/mac-address :portkey.aws.alexaforbusiness.-2017-11-09.device/device-arn :portkey.aws.alexaforbusiness.-2017-11-09/device-type :portkey.aws.alexaforbusiness.-2017-11-09/device-status :portkey.aws.alexaforbusiness.-2017-11-09/device-name :portkey.aws.alexaforbusiness.-2017-11-09.device/room-arn]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/generic-keyword (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/associate-skill-group-with-room-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.user-data/user-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.user-data/first-name (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/user-first-name))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.user-data/last-name (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/user-last-name))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/user-data (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09.user-data/user-arn :portkey.aws.alexaforbusiness.-2017-11-09.user-data/first-name :portkey.aws.alexaforbusiness.-2017-11-09.user-data/last-name :portkey.aws.alexaforbusiness.-2017-11-09/email :portkey.aws.alexaforbusiness.-2017-11-09/enrollment-status :portkey.aws.alexaforbusiness.-2017-11-09/enrollment-id]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.smart-home-appliance/friendly-name (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/appliance-friendly-name))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.smart-home-appliance/description (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/appliance-description))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.smart-home-appliance/manufacturer-name (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/appliance-manufacturer-name))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/smart-home-appliance (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09.smart-home-appliance/friendly-name :portkey.aws.alexaforbusiness.-2017-11-09.smart-home-appliance/description :portkey.aws.alexaforbusiness.-2017-11-09.smart-home-appliance/manufacturer-name]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.list-smart-home-appliances-request/room-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/list-smart-home-appliances-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness.-2017-11-09.list-smart-home-appliances-request/room-arn] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09/max-results :portkey.aws.alexaforbusiness.-2017-11-09/next-token]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/list-business-report-schedules-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09/next-token :portkey.aws.alexaforbusiness.-2017-11-09/max-results]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/untag-resource-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.search-rooms-response/rooms (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/room-data-list))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/search-rooms-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09.search-rooms-response/rooms :portkey.aws.alexaforbusiness.-2017-11-09/next-token :portkey.aws.alexaforbusiness.-2017-11-09/total-count]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/skill-type #{:private :public "PRIVATE" "PUBLIC"})

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.list-smart-home-appliances-response/smart-home-appliances (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/smart-home-appliance-list))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/list-smart-home-appliances-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09.list-smart-home-appliances-response/smart-home-appliances :portkey.aws.alexaforbusiness.-2017-11-09/next-token]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.delete-profile-request/profile-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/delete-profile-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09.delete-profile-request/profile-arn]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/end-user-license-agreement (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/filter-list (clojure.spec.alpha/coll-of :portkey.aws.alexaforbusiness.-2017-11-09/filter :max-count 25))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/skill-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"(^amzn1\.ask\.skill\.[0-9a-f\-]{1,200})|(^amzn1\.echo-sdk-ams\.app\.[0-9a-f\-]{1,200})" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/profile-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 100)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[\u0009\u000A\u000D\u0020-\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/filter-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 500))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.delete-contact-request/contact-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/delete-contact-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness.-2017-11-09.delete-contact-request/contact-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.untag-resource-request/tag-keys (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/tag-key-list))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/untag-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness.-2017-11-09/arn :portkey.aws.alexaforbusiness.-2017-11-09.untag-resource-request/tag-keys] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.skill-group-data/skill-group-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.skill-group-data/description (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/skill-group-description))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/skill-group-data (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09.skill-group-data/skill-group-arn :portkey.aws.alexaforbusiness.-2017-11-09/skill-group-name :portkey.aws.alexaforbusiness.-2017-11-09.skill-group-data/description]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/invocation-phrase (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/features (clojure.spec.alpha/coll-of :portkey.aws.alexaforbusiness.-2017-11-09/feature))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/delete-conference-provider-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/smart-home-appliance-list (clojure.spec.alpha/coll-of :portkey.aws.alexaforbusiness.-2017-11-09/smart-home-appliance))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/enrollment-status #{:initialized :pending "DEREGISTERING" "PENDING" :deregistering "REGISTERED" "INITIALIZED" :disassociating :registered "DISASSOCIATING"})

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.business-report-s-3-location/path (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/business-report-s-3-path))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09.business-report-s-3-location/bucket-name (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/customer-s-3-bucket-name))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/business-report-s-3-location (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09.business-report-s-3-location/path :portkey.aws.alexaforbusiness.-2017-11-09.business-report-s-3-location/bucket-name]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/meeting-setting (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness.-2017-11-09/require-pin] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/room-data-list (clojure.spec.alpha/coll-of :portkey.aws.alexaforbusiness.-2017-11-09/room-data))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.-2017-11-09/list-tags-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness.-2017-11-09/arn] :opt-un [:portkey.aws.alexaforbusiness.-2017-11-09/next-token :portkey.aws.alexaforbusiness.-2017-11-09/max-results]))

(clojure.core/defn tag-resource "Adds metadata tags to a specified resource." ([tag-resource-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-tag-resource-request tag-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness.-2017-11-09/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness.-2017-11-09/tag-resource-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness.-2017-11-09/tag-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "TagResource", :http.request.configuration/output-deser-fn response-tag-resource-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.alexaforbusiness.-2017-11-09/not-found-exception}})))))
(clojure.spec.alpha/fdef tag-resource :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness.-2017-11-09/tag-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/tag-resource-response))

(clojure.core/defn list-conference-providers "Lists conference providers under a specific AWS account." ([] (list-conference-providers {})) ([list-conference-providers-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-list-conference-providers-request list-conference-providers-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness.-2017-11-09/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness.-2017-11-09/list-conference-providers-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness.-2017-11-09/list-conference-providers-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListConferenceProviders", :http.request.configuration/output-deser-fn response-list-conference-providers-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-conference-providers :args (clojure.spec.alpha/? :portkey.aws.alexaforbusiness.-2017-11-09/list-conference-providers-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/list-conference-providers-response))

(clojure.core/defn list-device-events "Lists the device event history, including device connection status, for up to 30\ndays." ([list-device-events-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-list-device-events-request list-device-events-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness.-2017-11-09/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness.-2017-11-09/list-device-events-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness.-2017-11-09/list-device-events-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListDeviceEvents", :http.request.configuration/output-deser-fn response-list-device-events-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.alexaforbusiness.-2017-11-09/not-found-exception}})))))
(clojure.spec.alpha/fdef list-device-events :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness.-2017-11-09/list-device-events-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/list-device-events-response))

(clojure.core/defn associate-skill-group-with-room "Associates a skill group with a given room. This enables all skills in the\nassociated skill group on all devices in the room." ([] (associate-skill-group-with-room {})) ([associate-skill-group-with-room-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-associate-skill-group-with-room-request associate-skill-group-with-room-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness.-2017-11-09/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness.-2017-11-09/associate-skill-group-with-room-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness.-2017-11-09/associate-skill-group-with-room-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AssociateSkillGroupWithRoom", :http.request.configuration/output-deser-fn response-associate-skill-group-with-room-response, :http.request.spec/error-spec {"ConcurrentModificationException" :portkey.aws.alexaforbusiness.-2017-11-09/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef associate-skill-group-with-room :args (clojure.spec.alpha/? :portkey.aws.alexaforbusiness.-2017-11-09/associate-skill-group-with-room-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/associate-skill-group-with-room-response))

(clojure.core/defn disassociate-contact-from-address-book "Disassociates a contact from a given address book." ([disassociate-contact-from-address-book-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-disassociate-contact-from-address-book-request disassociate-contact-from-address-book-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness.-2017-11-09/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness.-2017-11-09/disassociate-contact-from-address-book-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness.-2017-11-09/disassociate-contact-from-address-book-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DisassociateContactFromAddressBook", :http.request.configuration/output-deser-fn response-disassociate-contact-from-address-book-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef disassociate-contact-from-address-book :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness.-2017-11-09/disassociate-contact-from-address-book-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/disassociate-contact-from-address-book-response))

(clojure.core/defn forget-smart-home-appliances "Forgets smart home appliances associated to a room." ([forget-smart-home-appliances-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-forget-smart-home-appliances-request forget-smart-home-appliances-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness.-2017-11-09/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness.-2017-11-09/forget-smart-home-appliances-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness.-2017-11-09/forget-smart-home-appliances-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ForgetSmartHomeAppliances", :http.request.configuration/output-deser-fn response-forget-smart-home-appliances-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.alexaforbusiness.-2017-11-09/not-found-exception}})))))
(clojure.spec.alpha/fdef forget-smart-home-appliances :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness.-2017-11-09/forget-smart-home-appliances-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/forget-smart-home-appliances-response))

(clojure.core/defn search-profiles "Searches room profiles and lists the ones that meet a set of filter criteria." ([] (search-profiles {})) ([search-profiles-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-search-profiles-request search-profiles-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness.-2017-11-09/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness.-2017-11-09/search-profiles-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness.-2017-11-09/search-profiles-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "SearchProfiles", :http.request.configuration/output-deser-fn response-search-profiles-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef search-profiles :args (clojure.spec.alpha/? :portkey.aws.alexaforbusiness.-2017-11-09/search-profiles-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/search-profiles-response))

(clojure.core/defn get-device "Gets the details of a device by device ARN." ([] (get-device {})) ([get-device-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-get-device-request get-device-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness.-2017-11-09/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness.-2017-11-09/get-device-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness.-2017-11-09/get-device-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetDevice", :http.request.configuration/output-deser-fn response-get-device-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.alexaforbusiness.-2017-11-09/not-found-exception}})))))
(clojure.spec.alpha/fdef get-device :args (clojure.spec.alpha/? :portkey.aws.alexaforbusiness.-2017-11-09/get-device-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/get-device-response))

(clojure.core/defn create-business-report-schedule "Creates a recurring schedule for usage reports to deliver to the specified S3\nlocation with a specified daily or weekly interval." ([create-business-report-schedule-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-create-business-report-schedule-request create-business-report-schedule-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness.-2017-11-09/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness.-2017-11-09/create-business-report-schedule-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness.-2017-11-09/create-business-report-schedule-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateBusinessReportSchedule", :http.request.configuration/output-deser-fn response-create-business-report-schedule-response, :http.request.spec/error-spec {"AlreadyExistsException" :portkey.aws.alexaforbusiness.-2017-11-09/already-exists-exception}})))))
(clojure.spec.alpha/fdef create-business-report-schedule :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness.-2017-11-09/create-business-report-schedule-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/create-business-report-schedule-response))

(clojure.core/defn associate-skill-with-users "Makes a private skill available for enrolled users to enable on their devices." ([associate-skill-with-users-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-associate-skill-with-users-request associate-skill-with-users-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness.-2017-11-09/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness.-2017-11-09/associate-skill-with-users-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness.-2017-11-09/associate-skill-with-users-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AssociateSkillWithUsers", :http.request.configuration/output-deser-fn response-associate-skill-with-users-response, :http.request.spec/error-spec {"ConcurrentModificationException" :portkey.aws.alexaforbusiness.-2017-11-09/concurrent-modification-exception, "NotFoundException" :portkey.aws.alexaforbusiness.-2017-11-09/not-found-exception}})))))
(clojure.spec.alpha/fdef associate-skill-with-users :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness.-2017-11-09/associate-skill-with-users-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/associate-skill-with-users-response))

(clojure.core/defn associate-contact-with-address-book "Associates a contact with a given address book." ([associate-contact-with-address-book-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-associate-contact-with-address-book-request associate-contact-with-address-book-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness.-2017-11-09/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness.-2017-11-09/associate-contact-with-address-book-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness.-2017-11-09/associate-contact-with-address-book-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AssociateContactWithAddressBook", :http.request.configuration/output-deser-fn response-associate-contact-with-address-book-response, :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.alexaforbusiness.-2017-11-09/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef associate-contact-with-address-book :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness.-2017-11-09/associate-contact-with-address-book-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/associate-contact-with-address-book-response))

(clojure.core/defn get-conference-preference "Retrieves the existing conference preferences." ([] (get-conference-preference {})) ([get-conference-preference-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-get-conference-preference-request get-conference-preference-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness.-2017-11-09/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness.-2017-11-09/get-conference-preference-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness.-2017-11-09/get-conference-preference-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetConferencePreference", :http.request.configuration/output-deser-fn response-get-conference-preference-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.alexaforbusiness.-2017-11-09/not-found-exception}})))))
(clojure.spec.alpha/fdef get-conference-preference :args (clojure.spec.alpha/? :portkey.aws.alexaforbusiness.-2017-11-09/get-conference-preference-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/get-conference-preference-response))

(clojure.core/defn update-address-book "Updates address book details by the address book ARN." ([update-address-book-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-update-address-book-request update-address-book-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness.-2017-11-09/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness.-2017-11-09/update-address-book-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness.-2017-11-09/update-address-book-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateAddressBook", :http.request.configuration/output-deser-fn response-update-address-book-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.alexaforbusiness.-2017-11-09/not-found-exception, "NameInUseException" :portkey.aws.alexaforbusiness.-2017-11-09/name-in-use-exception, "ConcurrentModificationException" :portkey.aws.alexaforbusiness.-2017-11-09/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef update-address-book :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness.-2017-11-09/update-address-book-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/update-address-book-response))

(clojure.core/defn put-room-skill-parameter "Updates room skill parameter details by room, skill, and parameter key ID. Not\nall skills have a room skill parameter." ([put-room-skill-parameter-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-put-room-skill-parameter-request put-room-skill-parameter-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness.-2017-11-09/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness.-2017-11-09/put-room-skill-parameter-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness.-2017-11-09/put-room-skill-parameter-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutRoomSkillParameter", :http.request.configuration/output-deser-fn response-put-room-skill-parameter-response, :http.request.spec/error-spec {"ConcurrentModificationException" :portkey.aws.alexaforbusiness.-2017-11-09/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef put-room-skill-parameter :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness.-2017-11-09/put-room-skill-parameter-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/put-room-skill-parameter-response))

(clojure.core/defn delete-contact "Deletes a contact by the contact ARN." ([delete-contact-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-delete-contact-request delete-contact-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness.-2017-11-09/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness.-2017-11-09/delete-contact-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness.-2017-11-09/delete-contact-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteContact", :http.request.configuration/output-deser-fn response-delete-contact-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.alexaforbusiness.-2017-11-09/not-found-exception, "ConcurrentModificationException" :portkey.aws.alexaforbusiness.-2017-11-09/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef delete-contact :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness.-2017-11-09/delete-contact-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/delete-contact-response))

(clojure.core/defn delete-skill-group "Deletes a skill group by skill group ARN." ([] (delete-skill-group {})) ([delete-skill-group-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-delete-skill-group-request delete-skill-group-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness.-2017-11-09/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness.-2017-11-09/delete-skill-group-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness.-2017-11-09/delete-skill-group-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteSkillGroup", :http.request.configuration/output-deser-fn response-delete-skill-group-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.alexaforbusiness.-2017-11-09/not-found-exception, "ConcurrentModificationException" :portkey.aws.alexaforbusiness.-2017-11-09/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef delete-skill-group :args (clojure.spec.alpha/? :portkey.aws.alexaforbusiness.-2017-11-09/delete-skill-group-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/delete-skill-group-response))

(clojure.core/defn delete-skill-authorization "Unlinks a third-party account from a skill." ([delete-skill-authorization-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-delete-skill-authorization-request delete-skill-authorization-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness.-2017-11-09/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness.-2017-11-09/delete-skill-authorization-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness.-2017-11-09/delete-skill-authorization-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteSkillAuthorization", :http.request.configuration/output-deser-fn response-delete-skill-authorization-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.alexaforbusiness.-2017-11-09/not-found-exception, "ConcurrentModificationException" :portkey.aws.alexaforbusiness.-2017-11-09/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef delete-skill-authorization :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness.-2017-11-09/delete-skill-authorization-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/delete-skill-authorization-response))

(clojure.core/defn create-address-book "Creates an address book with the specified details." ([create-address-book-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-create-address-book-request create-address-book-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness.-2017-11-09/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness.-2017-11-09/create-address-book-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness.-2017-11-09/create-address-book-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateAddressBook", :http.request.configuration/output-deser-fn response-create-address-book-response, :http.request.spec/error-spec {"AlreadyExistsException" :portkey.aws.alexaforbusiness.-2017-11-09/already-exists-exception, "LimitExceededException" :portkey.aws.alexaforbusiness.-2017-11-09/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-address-book :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness.-2017-11-09/create-address-book-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/create-address-book-response))

(clojure.core/defn delete-conference-provider "Deletes a conference provider." ([delete-conference-provider-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-delete-conference-provider-request delete-conference-provider-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness.-2017-11-09/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness.-2017-11-09/delete-conference-provider-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness.-2017-11-09/delete-conference-provider-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteConferenceProvider", :http.request.configuration/output-deser-fn response-delete-conference-provider-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.alexaforbusiness.-2017-11-09/not-found-exception}})))))
(clojure.spec.alpha/fdef delete-conference-provider :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness.-2017-11-09/delete-conference-provider-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/delete-conference-provider-response))

(clojure.core/defn search-address-books "Searches address books and lists the ones that meet a set of filter and sort\ncriteria." ([] (search-address-books {})) ([search-address-books-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-search-address-books-request search-address-books-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness.-2017-11-09/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness.-2017-11-09/search-address-books-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness.-2017-11-09/search-address-books-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "SearchAddressBooks", :http.request.configuration/output-deser-fn response-search-address-books-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef search-address-books :args (clojure.spec.alpha/? :portkey.aws.alexaforbusiness.-2017-11-09/search-address-books-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/search-address-books-response))

(clojure.core/defn start-device-sync "Resets a device and its account to the known default settings, by clearing all\ninformation and settings set by previous users." ([start-device-sync-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-start-device-sync-request start-device-sync-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness.-2017-11-09/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness.-2017-11-09/start-device-sync-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness.-2017-11-09/start-device-sync-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StartDeviceSync", :http.request.configuration/output-deser-fn response-start-device-sync-response, :http.request.spec/error-spec {"DeviceNotRegisteredException" :portkey.aws.alexaforbusiness.-2017-11-09/device-not-registered-exception}})))))
(clojure.spec.alpha/fdef start-device-sync :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness.-2017-11-09/start-device-sync-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/start-device-sync-response))

(clojure.core/defn list-tags "Lists all tags for the specified resource." ([list-tags-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-list-tags-request list-tags-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness.-2017-11-09/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness.-2017-11-09/list-tags-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness.-2017-11-09/list-tags-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListTags", :http.request.configuration/output-deser-fn response-list-tags-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.alexaforbusiness.-2017-11-09/not-found-exception}})))))
(clojure.spec.alpha/fdef list-tags :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness.-2017-11-09/list-tags-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/list-tags-response))

(clojure.core/defn create-conference-provider "Adds a new conference provider under the user's AWS account." ([create-conference-provider-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-create-conference-provider-request create-conference-provider-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness.-2017-11-09/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness.-2017-11-09/create-conference-provider-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness.-2017-11-09/create-conference-provider-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateConferenceProvider", :http.request.configuration/output-deser-fn response-create-conference-provider-response, :http.request.spec/error-spec {"AlreadyExistsException" :portkey.aws.alexaforbusiness.-2017-11-09/already-exists-exception}})))))
(clojure.spec.alpha/fdef create-conference-provider :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness.-2017-11-09/create-conference-provider-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/create-conference-provider-response))

(clojure.core/defn delete-profile "Deletes a room profile by the profile ARN." ([] (delete-profile {})) ([delete-profile-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-delete-profile-request delete-profile-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness.-2017-11-09/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness.-2017-11-09/delete-profile-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness.-2017-11-09/delete-profile-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteProfile", :http.request.configuration/output-deser-fn response-delete-profile-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.alexaforbusiness.-2017-11-09/not-found-exception, "ConcurrentModificationException" :portkey.aws.alexaforbusiness.-2017-11-09/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef delete-profile :args (clojure.spec.alpha/? :portkey.aws.alexaforbusiness.-2017-11-09/delete-profile-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/delete-profile-response))

(clojure.core/defn disassociate-device-from-room "Disassociates a device from its current room. The device continues to be\nconnected to the Wi-Fi network and is still registered to the account. The\ndevice settings and skills are removed from the room." ([] (disassociate-device-from-room {})) ([disassociate-device-from-room-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-disassociate-device-from-room-request disassociate-device-from-room-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness.-2017-11-09/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness.-2017-11-09/disassociate-device-from-room-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness.-2017-11-09/disassociate-device-from-room-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DisassociateDeviceFromRoom", :http.request.configuration/output-deser-fn response-disassociate-device-from-room-response, :http.request.spec/error-spec {"ConcurrentModificationException" :portkey.aws.alexaforbusiness.-2017-11-09/concurrent-modification-exception, "DeviceNotRegisteredException" :portkey.aws.alexaforbusiness.-2017-11-09/device-not-registered-exception}})))))
(clojure.spec.alpha/fdef disassociate-device-from-room :args (clojure.spec.alpha/? :portkey.aws.alexaforbusiness.-2017-11-09/disassociate-device-from-room-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/disassociate-device-from-room-response))

(clojure.core/defn search-devices "Searches devices and lists the ones that meet a set of filter criteria." ([] (search-devices {})) ([search-devices-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-search-devices-request search-devices-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness.-2017-11-09/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness.-2017-11-09/search-devices-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness.-2017-11-09/search-devices-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "SearchDevices", :http.request.configuration/output-deser-fn response-search-devices-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef search-devices :args (clojure.spec.alpha/? :portkey.aws.alexaforbusiness.-2017-11-09/search-devices-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/search-devices-response))

(clojure.core/defn update-room "Updates room details by room ARN." ([] (update-room {})) ([update-room-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-update-room-request update-room-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness.-2017-11-09/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness.-2017-11-09/update-room-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness.-2017-11-09/update-room-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateRoom", :http.request.configuration/output-deser-fn response-update-room-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.alexaforbusiness.-2017-11-09/not-found-exception, "NameInUseException" :portkey.aws.alexaforbusiness.-2017-11-09/name-in-use-exception}})))))
(clojure.spec.alpha/fdef update-room :args (clojure.spec.alpha/? :portkey.aws.alexaforbusiness.-2017-11-09/update-room-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/update-room-response))

(clojure.core/defn create-contact "Creates a contact with the specified details." ([create-contact-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-create-contact-request create-contact-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness.-2017-11-09/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness.-2017-11-09/create-contact-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness.-2017-11-09/create-contact-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateContact", :http.request.configuration/output-deser-fn response-create-contact-response, :http.request.spec/error-spec {"AlreadyExistsException" :portkey.aws.alexaforbusiness.-2017-11-09/already-exists-exception, "LimitExceededException" :portkey.aws.alexaforbusiness.-2017-11-09/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-contact :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness.-2017-11-09/create-contact-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/create-contact-response))

(clojure.core/defn list-smart-home-appliances "Lists all of the smart home appliances associated with a room." ([list-smart-home-appliances-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-list-smart-home-appliances-request list-smart-home-appliances-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness.-2017-11-09/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness.-2017-11-09/list-smart-home-appliances-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness.-2017-11-09/list-smart-home-appliances-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListSmartHomeAppliances", :http.request.configuration/output-deser-fn response-list-smart-home-appliances-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.alexaforbusiness.-2017-11-09/not-found-exception}})))))
(clojure.spec.alpha/fdef list-smart-home-appliances :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness.-2017-11-09/list-smart-home-appliances-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/list-smart-home-appliances-response))

(clojure.core/defn get-room-skill-parameter "Gets room skill parameter details by room, skill, and parameter key ARN." ([get-room-skill-parameter-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-get-room-skill-parameter-request get-room-skill-parameter-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness.-2017-11-09/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness.-2017-11-09/get-room-skill-parameter-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness.-2017-11-09/get-room-skill-parameter-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetRoomSkillParameter", :http.request.configuration/output-deser-fn response-get-room-skill-parameter-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.alexaforbusiness.-2017-11-09/not-found-exception}})))))
(clojure.spec.alpha/fdef get-room-skill-parameter :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness.-2017-11-09/get-room-skill-parameter-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/get-room-skill-parameter-response))

(clojure.core/defn update-business-report-schedule "Updates the configuration of the report delivery schedule with the specified\nschedule ARN." ([update-business-report-schedule-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-update-business-report-schedule-request update-business-report-schedule-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness.-2017-11-09/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness.-2017-11-09/update-business-report-schedule-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness.-2017-11-09/update-business-report-schedule-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateBusinessReportSchedule", :http.request.configuration/output-deser-fn response-update-business-report-schedule-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.alexaforbusiness.-2017-11-09/not-found-exception, "ConcurrentModificationException" :portkey.aws.alexaforbusiness.-2017-11-09/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef update-business-report-schedule :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness.-2017-11-09/update-business-report-schedule-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/update-business-report-schedule-response))

(clojure.core/defn get-address-book "Gets address the book details by the address book ARN." ([get-address-book-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-get-address-book-request get-address-book-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness.-2017-11-09/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness.-2017-11-09/get-address-book-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness.-2017-11-09/get-address-book-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetAddressBook", :http.request.configuration/output-deser-fn response-get-address-book-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.alexaforbusiness.-2017-11-09/not-found-exception}})))))
(clojure.spec.alpha/fdef get-address-book :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness.-2017-11-09/get-address-book-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/get-address-book-response))

(clojure.core/defn put-invitation-configuration "Configures the email template for the user enrollment invitation with the\nspecified attributes." ([put-invitation-configuration-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-put-invitation-configuration-request put-invitation-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness.-2017-11-09/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness.-2017-11-09/put-invitation-configuration-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness.-2017-11-09/put-invitation-configuration-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutInvitationConfiguration", :http.request.configuration/output-deser-fn response-put-invitation-configuration-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.alexaforbusiness.-2017-11-09/not-found-exception, "ConcurrentModificationException" :portkey.aws.alexaforbusiness.-2017-11-09/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef put-invitation-configuration :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness.-2017-11-09/put-invitation-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/put-invitation-configuration-response))

(clojure.core/defn list-skills "Lists all enabled skills in a specific skill group." ([] (list-skills {})) ([list-skills-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-list-skills-request list-skills-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness.-2017-11-09/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness.-2017-11-09/list-skills-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness.-2017-11-09/list-skills-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListSkills", :http.request.configuration/output-deser-fn response-list-skills-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-skills :args (clojure.spec.alpha/? :portkey.aws.alexaforbusiness.-2017-11-09/list-skills-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/list-skills-response))

(clojure.core/defn delete-user "Deletes a specified user by user ARN and enrollment ARN." ([delete-user-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-delete-user-request delete-user-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness.-2017-11-09/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness.-2017-11-09/delete-user-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness.-2017-11-09/delete-user-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteUser", :http.request.configuration/output-deser-fn response-delete-user-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.alexaforbusiness.-2017-11-09/not-found-exception, "ConcurrentModificationException" :portkey.aws.alexaforbusiness.-2017-11-09/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef delete-user :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness.-2017-11-09/delete-user-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/delete-user-response))

(clojure.core/defn register-avs-device "Registers an Alexa-enabled device built by an Original Equipment Manufacturer\n(OEM) using Alexa Voice Service (AVS)." ([register-avs-device-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-register-avs-device-request register-avs-device-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness.-2017-11-09/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness.-2017-11-09/register-avs-device-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness.-2017-11-09/register-avs-device-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "RegisterAVSDevice", :http.request.configuration/output-deser-fn response-register-avs-device-response, :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.alexaforbusiness.-2017-11-09/limit-exceeded-exception, "ConcurrentModificationException" :portkey.aws.alexaforbusiness.-2017-11-09/concurrent-modification-exception, "InvalidDeviceException" :portkey.aws.alexaforbusiness.-2017-11-09/invalid-device-exception}})))))
(clojure.spec.alpha/fdef register-avs-device :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness.-2017-11-09/register-avs-device-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/register-avs-device-response))

(clojure.core/defn create-user "Creates a user." ([create-user-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-create-user-request create-user-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness.-2017-11-09/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness.-2017-11-09/create-user-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness.-2017-11-09/create-user-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateUser", :http.request.configuration/output-deser-fn response-create-user-response, :http.request.spec/error-spec {"ResourceInUseException" :portkey.aws.alexaforbusiness.-2017-11-09/resource-in-use-exception, "LimitExceededException" :portkey.aws.alexaforbusiness.-2017-11-09/limit-exceeded-exception, "ConcurrentModificationException" :portkey.aws.alexaforbusiness.-2017-11-09/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef create-user :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness.-2017-11-09/create-user-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/create-user-response))

(clojure.core/defn put-conference-preference "Sets the conference preferences on a specific conference provider at the account\nlevel." ([put-conference-preference-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-put-conference-preference-request put-conference-preference-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness.-2017-11-09/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness.-2017-11-09/put-conference-preference-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness.-2017-11-09/put-conference-preference-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutConferencePreference", :http.request.configuration/output-deser-fn response-put-conference-preference-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.alexaforbusiness.-2017-11-09/not-found-exception}})))))
(clojure.spec.alpha/fdef put-conference-preference :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness.-2017-11-09/put-conference-preference-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/put-conference-preference-response))

(clojure.core/defn get-contact "Gets the contact details by the contact ARN." ([get-contact-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-get-contact-request get-contact-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness.-2017-11-09/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness.-2017-11-09/get-contact-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness.-2017-11-09/get-contact-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetContact", :http.request.configuration/output-deser-fn response-get-contact-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.alexaforbusiness.-2017-11-09/not-found-exception}})))))
(clojure.spec.alpha/fdef get-contact :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness.-2017-11-09/get-contact-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/get-contact-response))

(clojure.core/defn delete-device "Removes a device from Alexa For Business." ([delete-device-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-delete-device-request delete-device-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness.-2017-11-09/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness.-2017-11-09/delete-device-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness.-2017-11-09/delete-device-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteDevice", :http.request.configuration/output-deser-fn response-delete-device-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.alexaforbusiness.-2017-11-09/not-found-exception, "ConcurrentModificationException" :portkey.aws.alexaforbusiness.-2017-11-09/concurrent-modification-exception, "InvalidCertificateAuthorityException" :portkey.aws.alexaforbusiness.-2017-11-09/invalid-certificate-authority-exception}})))))
(clojure.spec.alpha/fdef delete-device :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness.-2017-11-09/delete-device-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/delete-device-response))

(clojure.core/defn disassociate-skill-from-skill-group "Disassociates a skill from a skill group." ([disassociate-skill-from-skill-group-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-disassociate-skill-from-skill-group-request disassociate-skill-from-skill-group-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness.-2017-11-09/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness.-2017-11-09/disassociate-skill-from-skill-group-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness.-2017-11-09/disassociate-skill-from-skill-group-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DisassociateSkillFromSkillGroup", :http.request.configuration/output-deser-fn response-disassociate-skill-from-skill-group-response, :http.request.spec/error-spec {"ConcurrentModificationException" :portkey.aws.alexaforbusiness.-2017-11-09/concurrent-modification-exception, "NotFoundException" :portkey.aws.alexaforbusiness.-2017-11-09/not-found-exception}})))))
(clojure.spec.alpha/fdef disassociate-skill-from-skill-group :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness.-2017-11-09/disassociate-skill-from-skill-group-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/disassociate-skill-from-skill-group-response))

(clojure.core/defn put-skill-authorization "Links a user's account to a third-party skill provider. If this API operation is\ncalled by an assumed IAM role, the skill being linked must be a private skill.\nAlso, the skill must be owned by the AWS account that assumed the IAM role." ([put-skill-authorization-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-put-skill-authorization-request put-skill-authorization-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness.-2017-11-09/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness.-2017-11-09/put-skill-authorization-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness.-2017-11-09/put-skill-authorization-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutSkillAuthorization", :http.request.configuration/output-deser-fn response-put-skill-authorization-response, :http.request.spec/error-spec {"UnauthorizedException" :portkey.aws.alexaforbusiness.-2017-11-09/unauthorized-exception, "ConcurrentModificationException" :portkey.aws.alexaforbusiness.-2017-11-09/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef put-skill-authorization :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness.-2017-11-09/put-skill-authorization-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/put-skill-authorization-response))

(clojure.core/defn delete-room "Deletes a room by the room ARN." ([] (delete-room {})) ([delete-room-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-delete-room-request delete-room-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness.-2017-11-09/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness.-2017-11-09/delete-room-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness.-2017-11-09/delete-room-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteRoom", :http.request.configuration/output-deser-fn response-delete-room-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.alexaforbusiness.-2017-11-09/not-found-exception, "ConcurrentModificationException" :portkey.aws.alexaforbusiness.-2017-11-09/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef delete-room :args (clojure.spec.alpha/? :portkey.aws.alexaforbusiness.-2017-11-09/delete-room-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/delete-room-response))

(clojure.core/defn delete-address-book "Deletes an address book by the address book ARN." ([delete-address-book-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-delete-address-book-request delete-address-book-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness.-2017-11-09/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness.-2017-11-09/delete-address-book-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness.-2017-11-09/delete-address-book-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteAddressBook", :http.request.configuration/output-deser-fn response-delete-address-book-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.alexaforbusiness.-2017-11-09/not-found-exception, "ConcurrentModificationException" :portkey.aws.alexaforbusiness.-2017-11-09/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef delete-address-book :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness.-2017-11-09/delete-address-book-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/delete-address-book-response))

(clojure.core/defn search-rooms "Searches rooms and lists the ones that meet a set of filter and sort criteria." ([] (search-rooms {})) ([search-rooms-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-search-rooms-request search-rooms-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness.-2017-11-09/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness.-2017-11-09/search-rooms-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness.-2017-11-09/search-rooms-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "SearchRooms", :http.request.configuration/output-deser-fn response-search-rooms-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef search-rooms :args (clojure.spec.alpha/? :portkey.aws.alexaforbusiness.-2017-11-09/search-rooms-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/search-rooms-response))

(clojure.core/defn send-invitation "Sends an enrollment invitation email with a URL to a user. The URL is valid for\n72 hours or until you call this operation again, whichever comes first." ([] (send-invitation {})) ([send-invitation-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-send-invitation-request send-invitation-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness.-2017-11-09/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness.-2017-11-09/send-invitation-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness.-2017-11-09/send-invitation-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "SendInvitation", :http.request.configuration/output-deser-fn response-send-invitation-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.alexaforbusiness.-2017-11-09/not-found-exception, "InvalidUserStatusException" :portkey.aws.alexaforbusiness.-2017-11-09/invalid-user-status-exception, "ConcurrentModificationException" :portkey.aws.alexaforbusiness.-2017-11-09/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef send-invitation :args (clojure.spec.alpha/? :portkey.aws.alexaforbusiness.-2017-11-09/send-invitation-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/send-invitation-response))

(clojure.core/defn resolve-room "Determines the details for the room from which a skill request was invoked. This\noperation is used by skill developers." ([resolve-room-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-resolve-room-request resolve-room-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness.-2017-11-09/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness.-2017-11-09/resolve-room-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness.-2017-11-09/resolve-room-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ResolveRoom", :http.request.configuration/output-deser-fn response-resolve-room-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.alexaforbusiness.-2017-11-09/not-found-exception}})))))
(clojure.spec.alpha/fdef resolve-room :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness.-2017-11-09/resolve-room-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/resolve-room-response))

(clojure.core/defn get-room "Gets room details by room ARN." ([] (get-room {})) ([get-room-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-get-room-request get-room-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness.-2017-11-09/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness.-2017-11-09/get-room-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness.-2017-11-09/get-room-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetRoom", :http.request.configuration/output-deser-fn response-get-room-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.alexaforbusiness.-2017-11-09/not-found-exception}})))))
(clojure.spec.alpha/fdef get-room :args (clojure.spec.alpha/? :portkey.aws.alexaforbusiness.-2017-11-09/get-room-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/get-room-response))

(clojure.core/defn delete-business-report-schedule "Deletes the recurring report delivery schedule with the specified schedule ARN." ([delete-business-report-schedule-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-delete-business-report-schedule-request delete-business-report-schedule-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness.-2017-11-09/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness.-2017-11-09/delete-business-report-schedule-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness.-2017-11-09/delete-business-report-schedule-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteBusinessReportSchedule", :http.request.configuration/output-deser-fn response-delete-business-report-schedule-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.alexaforbusiness.-2017-11-09/not-found-exception, "ConcurrentModificationException" :portkey.aws.alexaforbusiness.-2017-11-09/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef delete-business-report-schedule :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness.-2017-11-09/delete-business-report-schedule-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/delete-business-report-schedule-response))

(clojure.core/defn update-conference-provider "Updates an existing conference provider's settings." ([update-conference-provider-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-update-conference-provider-request update-conference-provider-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness.-2017-11-09/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness.-2017-11-09/update-conference-provider-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness.-2017-11-09/update-conference-provider-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateConferenceProvider", :http.request.configuration/output-deser-fn response-update-conference-provider-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.alexaforbusiness.-2017-11-09/not-found-exception}})))))
(clojure.spec.alpha/fdef update-conference-provider :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness.-2017-11-09/update-conference-provider-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/update-conference-provider-response))

(clojure.core/defn reject-skill "Disassociates a skill from the organization under a user's AWS account. If the\nskill is a private skill, it moves to an AcceptStatus of PENDING. Any private or\npublic skill that is rejected can be added later by calling the ApproveSkill\nAPI." ([reject-skill-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-reject-skill-request reject-skill-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness.-2017-11-09/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness.-2017-11-09/reject-skill-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness.-2017-11-09/reject-skill-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "RejectSkill", :http.request.configuration/output-deser-fn response-reject-skill-response, :http.request.spec/error-spec {"ConcurrentModificationException" :portkey.aws.alexaforbusiness.-2017-11-09/concurrent-modification-exception, "NotFoundException" :portkey.aws.alexaforbusiness.-2017-11-09/not-found-exception}})))))
(clojure.spec.alpha/fdef reject-skill :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness.-2017-11-09/reject-skill-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/reject-skill-response))

(clojure.core/defn search-skill-groups "Searches skill groups and lists the ones that meet a set of filter and sort\ncriteria." ([] (search-skill-groups {})) ([search-skill-groups-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-search-skill-groups-request search-skill-groups-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness.-2017-11-09/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness.-2017-11-09/search-skill-groups-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness.-2017-11-09/search-skill-groups-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "SearchSkillGroups", :http.request.configuration/output-deser-fn response-search-skill-groups-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef search-skill-groups :args (clojure.spec.alpha/? :portkey.aws.alexaforbusiness.-2017-11-09/search-skill-groups-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/search-skill-groups-response))

(clojure.core/defn start-smart-home-appliance-discovery "Initiates the discovery of any smart home appliances associated with the room." ([start-smart-home-appliance-discovery-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-start-smart-home-appliance-discovery-request start-smart-home-appliance-discovery-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness.-2017-11-09/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness.-2017-11-09/start-smart-home-appliance-discovery-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness.-2017-11-09/start-smart-home-appliance-discovery-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StartSmartHomeApplianceDiscovery", :http.request.configuration/output-deser-fn response-start-smart-home-appliance-discovery-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.alexaforbusiness.-2017-11-09/not-found-exception}})))))
(clojure.spec.alpha/fdef start-smart-home-appliance-discovery :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness.-2017-11-09/start-smart-home-appliance-discovery-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/start-smart-home-appliance-discovery-response))

(clojure.core/defn list-skills-store-categories "Lists all categories in the Alexa skill store." ([] (list-skills-store-categories {})) ([list-skills-store-categories-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-list-skills-store-categories-request list-skills-store-categories-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness.-2017-11-09/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness.-2017-11-09/list-skills-store-categories-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness.-2017-11-09/list-skills-store-categories-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListSkillsStoreCategories", :http.request.configuration/output-deser-fn response-list-skills-store-categories-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-skills-store-categories :args (clojure.spec.alpha/? :portkey.aws.alexaforbusiness.-2017-11-09/list-skills-store-categories-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/list-skills-store-categories-response))

(clojure.core/defn update-profile "Updates an existing room profile by room profile ARN." ([] (update-profile {})) ([update-profile-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-update-profile-request update-profile-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness.-2017-11-09/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness.-2017-11-09/update-profile-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness.-2017-11-09/update-profile-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateProfile", :http.request.configuration/output-deser-fn response-update-profile-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.alexaforbusiness.-2017-11-09/not-found-exception, "NameInUseException" :portkey.aws.alexaforbusiness.-2017-11-09/name-in-use-exception, "ConcurrentModificationException" :portkey.aws.alexaforbusiness.-2017-11-09/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef update-profile :args (clojure.spec.alpha/? :portkey.aws.alexaforbusiness.-2017-11-09/update-profile-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/update-profile-response))

(clojure.core/defn get-invitation-configuration "Retrieves the configured values for the user enrollment invitation email\ntemplate." ([] (get-invitation-configuration {})) ([get-invitation-configuration-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-get-invitation-configuration-request get-invitation-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness.-2017-11-09/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness.-2017-11-09/get-invitation-configuration-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness.-2017-11-09/get-invitation-configuration-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetInvitationConfiguration", :http.request.configuration/output-deser-fn response-get-invitation-configuration-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.alexaforbusiness.-2017-11-09/not-found-exception}})))))
(clojure.spec.alpha/fdef get-invitation-configuration :args (clojure.spec.alpha/? :portkey.aws.alexaforbusiness.-2017-11-09/get-invitation-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/get-invitation-configuration-response))

(clojure.core/defn search-users "Searches users and lists the ones that meet a set of filter and sort criteria." ([] (search-users {})) ([search-users-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-search-users-request search-users-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness.-2017-11-09/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness.-2017-11-09/search-users-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness.-2017-11-09/search-users-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "SearchUsers", :http.request.configuration/output-deser-fn response-search-users-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef search-users :args (clojure.spec.alpha/? :portkey.aws.alexaforbusiness.-2017-11-09/search-users-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/search-users-response))

(clojure.core/defn update-skill-group "Updates skill group details by skill group ARN." ([] (update-skill-group {})) ([update-skill-group-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-update-skill-group-request update-skill-group-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness.-2017-11-09/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness.-2017-11-09/update-skill-group-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness.-2017-11-09/update-skill-group-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateSkillGroup", :http.request.configuration/output-deser-fn response-update-skill-group-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.alexaforbusiness.-2017-11-09/not-found-exception, "NameInUseException" :portkey.aws.alexaforbusiness.-2017-11-09/name-in-use-exception, "ConcurrentModificationException" :portkey.aws.alexaforbusiness.-2017-11-09/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef update-skill-group :args (clojure.spec.alpha/? :portkey.aws.alexaforbusiness.-2017-11-09/update-skill-group-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/update-skill-group-response))

(clojure.core/defn search-contacts "Searches contacts and lists the ones that meet a set of filter and sort\ncriteria." ([] (search-contacts {})) ([search-contacts-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-search-contacts-request search-contacts-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness.-2017-11-09/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness.-2017-11-09/search-contacts-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness.-2017-11-09/search-contacts-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "SearchContacts", :http.request.configuration/output-deser-fn response-search-contacts-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef search-contacts :args (clojure.spec.alpha/? :portkey.aws.alexaforbusiness.-2017-11-09/search-contacts-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/search-contacts-response))

(clojure.core/defn untag-resource "Removes metadata tags from a specified resource." ([untag-resource-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-untag-resource-request untag-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness.-2017-11-09/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness.-2017-11-09/untag-resource-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness.-2017-11-09/untag-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UntagResource", :http.request.configuration/output-deser-fn response-untag-resource-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.alexaforbusiness.-2017-11-09/not-found-exception}})))))
(clojure.spec.alpha/fdef untag-resource :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness.-2017-11-09/untag-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/untag-resource-response))

(clojure.core/defn associate-skill-with-skill-group "Associates a skill with a skill group." ([associate-skill-with-skill-group-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-associate-skill-with-skill-group-request associate-skill-with-skill-group-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness.-2017-11-09/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness.-2017-11-09/associate-skill-with-skill-group-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness.-2017-11-09/associate-skill-with-skill-group-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AssociateSkillWithSkillGroup", :http.request.configuration/output-deser-fn response-associate-skill-with-skill-group-response, :http.request.spec/error-spec {"ConcurrentModificationException" :portkey.aws.alexaforbusiness.-2017-11-09/concurrent-modification-exception, "NotFoundException" :portkey.aws.alexaforbusiness.-2017-11-09/not-found-exception, "SkillNotLinkedException" :portkey.aws.alexaforbusiness.-2017-11-09/skill-not-linked-exception}})))))
(clojure.spec.alpha/fdef associate-skill-with-skill-group :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness.-2017-11-09/associate-skill-with-skill-group-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/associate-skill-with-skill-group-response))

(clojure.core/defn create-skill-group "Creates a skill group with a specified name and description." ([create-skill-group-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-create-skill-group-request create-skill-group-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness.-2017-11-09/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness.-2017-11-09/create-skill-group-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness.-2017-11-09/create-skill-group-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateSkillGroup", :http.request.configuration/output-deser-fn response-create-skill-group-response, :http.request.spec/error-spec {"AlreadyExistsException" :portkey.aws.alexaforbusiness.-2017-11-09/already-exists-exception, "LimitExceededException" :portkey.aws.alexaforbusiness.-2017-11-09/limit-exceeded-exception, "ConcurrentModificationException" :portkey.aws.alexaforbusiness.-2017-11-09/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef create-skill-group :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness.-2017-11-09/create-skill-group-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/create-skill-group-response))

(clojure.core/defn revoke-invitation "Revokes an invitation and invalidates the enrollment URL." ([] (revoke-invitation {})) ([revoke-invitation-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-revoke-invitation-request revoke-invitation-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness.-2017-11-09/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness.-2017-11-09/revoke-invitation-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness.-2017-11-09/revoke-invitation-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "RevokeInvitation", :http.request.configuration/output-deser-fn response-revoke-invitation-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.alexaforbusiness.-2017-11-09/not-found-exception, "ConcurrentModificationException" :portkey.aws.alexaforbusiness.-2017-11-09/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef revoke-invitation :args (clojure.spec.alpha/? :portkey.aws.alexaforbusiness.-2017-11-09/revoke-invitation-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/revoke-invitation-response))

(clojure.core/defn delete-room-skill-parameter "Deletes room skill parameter details by room, skill, and parameter key ID." ([delete-room-skill-parameter-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-delete-room-skill-parameter-request delete-room-skill-parameter-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness.-2017-11-09/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness.-2017-11-09/delete-room-skill-parameter-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness.-2017-11-09/delete-room-skill-parameter-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteRoomSkillParameter", :http.request.configuration/output-deser-fn response-delete-room-skill-parameter-response, :http.request.spec/error-spec {"ConcurrentModificationException" :portkey.aws.alexaforbusiness.-2017-11-09/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef delete-room-skill-parameter :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness.-2017-11-09/delete-room-skill-parameter-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/delete-room-skill-parameter-response))

(clojure.core/defn update-device "Updates the device name by device ARN." ([] (update-device {})) ([update-device-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-update-device-request update-device-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness.-2017-11-09/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness.-2017-11-09/update-device-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness.-2017-11-09/update-device-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateDevice", :http.request.configuration/output-deser-fn response-update-device-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.alexaforbusiness.-2017-11-09/not-found-exception, "ConcurrentModificationException" :portkey.aws.alexaforbusiness.-2017-11-09/concurrent-modification-exception, "DeviceNotRegisteredException" :portkey.aws.alexaforbusiness.-2017-11-09/device-not-registered-exception}})))))
(clojure.spec.alpha/fdef update-device :args (clojure.spec.alpha/? :portkey.aws.alexaforbusiness.-2017-11-09/update-device-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/update-device-response))

(clojure.core/defn list-business-report-schedules "Lists the details of the schedules that a user configured." ([] (list-business-report-schedules {})) ([list-business-report-schedules-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-list-business-report-schedules-request list-business-report-schedules-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness.-2017-11-09/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness.-2017-11-09/list-business-report-schedules-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness.-2017-11-09/list-business-report-schedules-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListBusinessReportSchedules", :http.request.configuration/output-deser-fn response-list-business-report-schedules-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-business-report-schedules :args (clojure.spec.alpha/? :portkey.aws.alexaforbusiness.-2017-11-09/list-business-report-schedules-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/list-business-report-schedules-response))

(clojure.core/defn associate-device-with-room "Associates a device with a given room. This applies all the settings from the\nroom profile to the device, and all the skills in any skill groups added to that\nroom. This operation requires the device to be online, or else a manual sync is\nrequired." ([] (associate-device-with-room {})) ([associate-device-with-room-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-associate-device-with-room-request associate-device-with-room-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness.-2017-11-09/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness.-2017-11-09/associate-device-with-room-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness.-2017-11-09/associate-device-with-room-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AssociateDeviceWithRoom", :http.request.configuration/output-deser-fn response-associate-device-with-room-response, :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.alexaforbusiness.-2017-11-09/limit-exceeded-exception, "ConcurrentModificationException" :portkey.aws.alexaforbusiness.-2017-11-09/concurrent-modification-exception, "DeviceNotRegisteredException" :portkey.aws.alexaforbusiness.-2017-11-09/device-not-registered-exception}})))))
(clojure.spec.alpha/fdef associate-device-with-room :args (clojure.spec.alpha/? :portkey.aws.alexaforbusiness.-2017-11-09/associate-device-with-room-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/associate-device-with-room-response))

(clojure.core/defn create-room "Creates a room with the specified details." ([create-room-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-create-room-request create-room-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness.-2017-11-09/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness.-2017-11-09/create-room-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness.-2017-11-09/create-room-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateRoom", :http.request.configuration/output-deser-fn response-create-room-response, :http.request.spec/error-spec {"AlreadyExistsException" :portkey.aws.alexaforbusiness.-2017-11-09/already-exists-exception, "LimitExceededException" :portkey.aws.alexaforbusiness.-2017-11-09/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-room :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness.-2017-11-09/create-room-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/create-room-response))

(clojure.core/defn get-conference-provider "Gets details about a specific conference provider." ([get-conference-provider-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-get-conference-provider-request get-conference-provider-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness.-2017-11-09/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness.-2017-11-09/get-conference-provider-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness.-2017-11-09/get-conference-provider-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetConferenceProvider", :http.request.configuration/output-deser-fn response-get-conference-provider-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.alexaforbusiness.-2017-11-09/not-found-exception}})))))
(clojure.spec.alpha/fdef get-conference-provider :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness.-2017-11-09/get-conference-provider-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/get-conference-provider-response))

(clojure.core/defn list-skills-store-skills-by-category "Lists all skills in the Alexa skill store by category." ([list-skills-store-skills-by-category-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-list-skills-store-skills-by-category-request list-skills-store-skills-by-category-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness.-2017-11-09/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness.-2017-11-09/list-skills-store-skills-by-category-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness.-2017-11-09/list-skills-store-skills-by-category-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListSkillsStoreSkillsByCategory", :http.request.configuration/output-deser-fn response-list-skills-store-skills-by-category-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-skills-store-skills-by-category :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness.-2017-11-09/list-skills-store-skills-by-category-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/list-skills-store-skills-by-category-response))

(clojure.core/defn disassociate-skill-from-users "Makes a private skill unavailable for enrolled users and prevents them from\nenabling it on their devices." ([disassociate-skill-from-users-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-disassociate-skill-from-users-request disassociate-skill-from-users-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness.-2017-11-09/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness.-2017-11-09/disassociate-skill-from-users-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness.-2017-11-09/disassociate-skill-from-users-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DisassociateSkillFromUsers", :http.request.configuration/output-deser-fn response-disassociate-skill-from-users-response, :http.request.spec/error-spec {"ConcurrentModificationException" :portkey.aws.alexaforbusiness.-2017-11-09/concurrent-modification-exception, "NotFoundException" :portkey.aws.alexaforbusiness.-2017-11-09/not-found-exception}})))))
(clojure.spec.alpha/fdef disassociate-skill-from-users :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness.-2017-11-09/disassociate-skill-from-users-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/disassociate-skill-from-users-response))

(clojure.core/defn update-contact "Updates the contact details by the contact ARN." ([update-contact-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-update-contact-request update-contact-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness.-2017-11-09/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness.-2017-11-09/update-contact-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness.-2017-11-09/update-contact-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateContact", :http.request.configuration/output-deser-fn response-update-contact-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.alexaforbusiness.-2017-11-09/not-found-exception, "ConcurrentModificationException" :portkey.aws.alexaforbusiness.-2017-11-09/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef update-contact :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness.-2017-11-09/update-contact-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/update-contact-response))

(clojure.core/defn approve-skill "Associates a skill with the organization under the customer's AWS account. If a\nskill is private, the user implicitly accepts access to this skill during\nenablement." ([approve-skill-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-approve-skill-request approve-skill-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness.-2017-11-09/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness.-2017-11-09/approve-skill-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness.-2017-11-09/approve-skill-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ApproveSkill", :http.request.configuration/output-deser-fn response-approve-skill-response, :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.alexaforbusiness.-2017-11-09/limit-exceeded-exception, "NotFoundException" :portkey.aws.alexaforbusiness.-2017-11-09/not-found-exception, "ConcurrentModificationException" :portkey.aws.alexaforbusiness.-2017-11-09/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef approve-skill :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness.-2017-11-09/approve-skill-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/approve-skill-response))

(clojure.core/defn disassociate-skill-group-from-room "Disassociates a skill group from a specified room. This disables all skills in\nthe skill group on all devices in the room." ([] (disassociate-skill-group-from-room {})) ([disassociate-skill-group-from-room-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-disassociate-skill-group-from-room-request disassociate-skill-group-from-room-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness.-2017-11-09/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness.-2017-11-09/disassociate-skill-group-from-room-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness.-2017-11-09/disassociate-skill-group-from-room-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DisassociateSkillGroupFromRoom", :http.request.configuration/output-deser-fn response-disassociate-skill-group-from-room-response, :http.request.spec/error-spec {"ConcurrentModificationException" :portkey.aws.alexaforbusiness.-2017-11-09/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef disassociate-skill-group-from-room :args (clojure.spec.alpha/? :portkey.aws.alexaforbusiness.-2017-11-09/disassociate-skill-group-from-room-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/disassociate-skill-group-from-room-response))

(clojure.core/defn get-skill-group "Gets skill group details by skill group ARN." ([] (get-skill-group {})) ([get-skill-group-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-get-skill-group-request get-skill-group-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness.-2017-11-09/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness.-2017-11-09/get-skill-group-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness.-2017-11-09/get-skill-group-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetSkillGroup", :http.request.configuration/output-deser-fn response-get-skill-group-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.alexaforbusiness.-2017-11-09/not-found-exception}})))))
(clojure.spec.alpha/fdef get-skill-group :args (clojure.spec.alpha/? :portkey.aws.alexaforbusiness.-2017-11-09/get-skill-group-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/get-skill-group-response))

(clojure.core/defn get-profile "Gets the details of a room profile by profile ARN." ([] (get-profile {})) ([get-profile-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-get-profile-request get-profile-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness.-2017-11-09/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness.-2017-11-09/get-profile-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness.-2017-11-09/get-profile-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetProfile", :http.request.configuration/output-deser-fn response-get-profile-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.alexaforbusiness.-2017-11-09/not-found-exception}})))))
(clojure.spec.alpha/fdef get-profile :args (clojure.spec.alpha/? :portkey.aws.alexaforbusiness.-2017-11-09/get-profile-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/get-profile-response))

(clojure.core/defn create-profile "Creates a new room profile with the specified details." ([create-profile-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-create-profile-request create-profile-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness.-2017-11-09/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness.-2017-11-09/create-profile-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness.-2017-11-09/create-profile-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateProfile", :http.request.configuration/output-deser-fn response-create-profile-response, :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.alexaforbusiness.-2017-11-09/limit-exceeded-exception, "AlreadyExistsException" :portkey.aws.alexaforbusiness.-2017-11-09/already-exists-exception, "ConcurrentModificationException" :portkey.aws.alexaforbusiness.-2017-11-09/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef create-profile :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness.-2017-11-09/create-profile-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness.-2017-11-09/create-profile-response))
