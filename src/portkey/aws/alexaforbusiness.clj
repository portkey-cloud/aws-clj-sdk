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

(clojure.core/defn- response-create-user-response ([input] (response-create-user-response nil input)) ([resultWrapper1488944 input] (clojure.core/let [rawinput1488943 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1488945 {"UserArn" (rawinput1488943 "UserArn")}] (clojure.core/cond-> {} (letvar1488945 "UserArn") (clojure.core/assoc :user-arn (deser-arn (clojure.core/get-in letvar1488945 ["UserArn"])))))))

(clojure.core/defn- response-unauthorized-exception ([input] (response-unauthorized-exception nil input)) ([resultWrapper1488947 input] (clojure.core/let [rawinput1488946 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1488948 {"Message" (rawinput1488946 "Message")}] (clojure.core/cond-> {} (letvar1488948 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1488948 ["Message"])))))))

(clojure.core/defn- response-update-contact-response ([input] (response-update-contact-response nil input)) ([resultWrapper1488950 input] (clojure.core/let [rawinput1488949 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1488951 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-create-address-book-response ([input] (response-create-address-book-response nil input)) ([resultWrapper1488953 input] (clojure.core/let [rawinput1488952 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1488954 {"AddressBookArn" (rawinput1488952 "AddressBookArn")}] (clojure.core/cond-> {} (letvar1488954 "AddressBookArn") (clojure.core/assoc :address-book-arn (deser-arn (clojure.core/get-in letvar1488954 ["AddressBookArn"])))))))

(clojure.core/defn- response-associate-contact-with-address-book-response ([input] (response-associate-contact-with-address-book-response nil input)) ([resultWrapper1488956 input] (clojure.core/let [rawinput1488955 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1488957 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-already-exists-exception ([input] (response-already-exists-exception nil input)) ([resultWrapper1488959 input] (clojure.core/let [rawinput1488958 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1488960 {"Message" (rawinput1488958 "Message")}] (clojure.core/cond-> {} (letvar1488960 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1488960 ["Message"])))))))

(clojure.core/defn- response-associate-device-with-room-response ([input] (response-associate-device-with-room-response nil input)) ([resultWrapper1488962 input] (clojure.core/let [rawinput1488961 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1488963 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-name-in-use-exception ([input] (response-name-in-use-exception nil input)) ([resultWrapper1488965 input] (clojure.core/let [rawinput1488964 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1488966 {"Message" (rawinput1488964 "Message")}] (clojure.core/cond-> {} (letvar1488966 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1488966 ["Message"])))))))

(clojure.core/defn- response-put-conference-preference-response ([input] (response-put-conference-preference-response nil input)) ([resultWrapper1488968 input] (clojure.core/let [rawinput1488967 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1488969 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-create-contact-response ([input] (response-create-contact-response nil input)) ([resultWrapper1488971 input] (clojure.core/let [rawinput1488970 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1488972 {"ContactArn" (rawinput1488970 "ContactArn")}] (clojure.core/cond-> {} (letvar1488972 "ContactArn") (clojure.core/assoc :contact-arn (deser-arn (clojure.core/get-in letvar1488972 ["ContactArn"])))))))

(clojure.core/defn- response-create-conference-provider-response ([input] (response-create-conference-provider-response nil input)) ([resultWrapper1488974 input] (clojure.core/let [rawinput1488973 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1488975 {"ConferenceProviderArn" (rawinput1488973 "ConferenceProviderArn")}] (clojure.core/cond-> {} (letvar1488975 "ConferenceProviderArn") (clojure.core/assoc :conference-provider-arn (deser-arn (clojure.core/get-in letvar1488975 ["ConferenceProviderArn"])))))))

(clojure.core/defn- response-put-invitation-configuration-response ([input] (response-put-invitation-configuration-response nil input)) ([resultWrapper1488977 input] (clojure.core/let [rawinput1488976 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1488978 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-conference-preference-response ([input] (response-get-conference-preference-response nil input)) ([resultWrapper1488980 input] (clojure.core/let [rawinput1488979 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1488981 {"Preference" (rawinput1488979 "Preference")}] (clojure.core/cond-> {} (letvar1488981 "Preference") (clojure.core/assoc :preference (deser-conference-preference (clojure.core/get-in letvar1488981 ["Preference"])))))))

(clojure.core/defn- response-get-address-book-response ([input] (response-get-address-book-response nil input)) ([resultWrapper1488983 input] (clojure.core/let [rawinput1488982 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1488984 {"AddressBook" (rawinput1488982 "AddressBook")}] (clojure.core/cond-> {} (letvar1488984 "AddressBook") (clojure.core/assoc :address-book (deser-address-book (clojure.core/get-in letvar1488984 ["AddressBook"])))))))

(clojure.core/defn- response-delete-profile-response ([input] (response-delete-profile-response nil input)) ([resultWrapper1488986 input] (clojure.core/let [rawinput1488985 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1488987 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-associate-skill-with-users-response ([input] (response-associate-skill-with-users-response nil input)) ([resultWrapper1488989 input] (clojure.core/let [rawinput1488988 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1488990 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-delete-room-response ([input] (response-delete-room-response nil input)) ([resultWrapper1488992 input] (clojure.core/let [rawinput1488991 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1488993 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-device-response ([input] (response-get-device-response nil input)) ([resultWrapper1488995 input] (clojure.core/let [rawinput1488994 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1488996 {"Device" (rawinput1488994 "Device")}] (clojure.core/cond-> {} (letvar1488996 "Device") (clojure.core/assoc :device (deser-device (clojure.core/get-in letvar1488996 ["Device"])))))))

(clojure.core/defn- response-search-users-response ([input] (response-search-users-response nil input)) ([resultWrapper1488998 input] (clojure.core/let [rawinput1488997 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1488999 {"Users" (rawinput1488997 "Users"), "NextToken" (rawinput1488997 "NextToken"), "TotalCount" (rawinput1488997 "TotalCount")}] (clojure.core/cond-> {} (letvar1488999 "Users") (clojure.core/assoc :users (deser-user-data-list (clojure.core/get-in letvar1488999 ["Users"]))) (letvar1488999 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1488999 ["NextToken"]))) (letvar1488999 "TotalCount") (clojure.core/assoc :total-count (deser-total-count (clojure.core/get-in letvar1488999 ["TotalCount"])))))))

(clojure.core/defn- response-reject-skill-response ([input] (response-reject-skill-response nil input)) ([resultWrapper1489001 input] (clojure.core/let [rawinput1489000 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1489002 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-create-business-report-schedule-response ([input] (response-create-business-report-schedule-response nil input)) ([resultWrapper1489004 input] (clojure.core/let [rawinput1489003 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1489005 {"ScheduleArn" (rawinput1489003 "ScheduleArn")}] (clojure.core/cond-> {} (letvar1489005 "ScheduleArn") (clojure.core/assoc :schedule-arn (deser-arn (clojure.core/get-in letvar1489005 ["ScheduleArn"])))))))

(clojure.core/defn- response-update-conference-provider-response ([input] (response-update-conference-provider-response nil input)) ([resultWrapper1489007 input] (clojure.core/let [rawinput1489006 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1489008 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-start-smart-home-appliance-discovery-response ([input] (response-start-smart-home-appliance-discovery-response nil input)) ([resultWrapper1489010 input] (clojure.core/let [rawinput1489009 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1489011 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-skill-not-linked-exception ([input] (response-skill-not-linked-exception nil input)) ([resultWrapper1489013 input] (clojure.core/let [rawinput1489012 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1489014 {"Message" (rawinput1489012 "Message")}] (clojure.core/cond-> {} (letvar1489014 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1489014 ["Message"])))))))

(clojure.core/defn- response-list-tags-response ([input] (response-list-tags-response nil input)) ([resultWrapper1489016 input] (clojure.core/let [rawinput1489015 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1489017 {"Tags" (rawinput1489015 "Tags"), "NextToken" (rawinput1489015 "NextToken")}] (clojure.core/cond-> {} (letvar1489017 "Tags") (clojure.core/assoc :tags (deser-tag-list (clojure.core/get-in letvar1489017 ["Tags"]))) (letvar1489017 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1489017 ["NextToken"])))))))

(clojure.core/defn- response-approve-skill-response ([input] (response-approve-skill-response nil input)) ([resultWrapper1489019 input] (clojure.core/let [rawinput1489018 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1489020 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-search-contacts-response ([input] (response-search-contacts-response nil input)) ([resultWrapper1489022 input] (clojure.core/let [rawinput1489021 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1489023 {"Contacts" (rawinput1489021 "Contacts"), "NextToken" (rawinput1489021 "NextToken"), "TotalCount" (rawinput1489021 "TotalCount")}] (clojure.core/cond-> {} (letvar1489023 "Contacts") (clojure.core/assoc :contacts (deser-contact-data-list (clojure.core/get-in letvar1489023 ["Contacts"]))) (letvar1489023 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1489023 ["NextToken"]))) (letvar1489023 "TotalCount") (clojure.core/assoc :total-count (deser-total-count (clojure.core/get-in letvar1489023 ["TotalCount"])))))))

(clojure.core/defn- response-search-address-books-response ([input] (response-search-address-books-response nil input)) ([resultWrapper1489025 input] (clojure.core/let [rawinput1489024 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1489026 {"AddressBooks" (rawinput1489024 "AddressBooks"), "NextToken" (rawinput1489024 "NextToken"), "TotalCount" (rawinput1489024 "TotalCount")}] (clojure.core/cond-> {} (letvar1489026 "AddressBooks") (clojure.core/assoc :address-books (deser-address-book-data-list (clojure.core/get-in letvar1489026 ["AddressBooks"]))) (letvar1489026 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1489026 ["NextToken"]))) (letvar1489026 "TotalCount") (clojure.core/assoc :total-count (deser-total-count (clojure.core/get-in letvar1489026 ["TotalCount"])))))))

(clojure.core/defn- response-resource-in-use-exception ([input] (response-resource-in-use-exception nil input)) ([resultWrapper1489028 input] (clojure.core/let [rawinput1489027 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1489029 {"Message" (rawinput1489027 "Message"), "ClientRequestToken" (rawinput1489027 "ClientRequestToken")}] (clojure.core/cond-> {} (letvar1489029 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1489029 ["Message"]))) (letvar1489029 "ClientRequestToken") (clojure.core/assoc :client-request-token (deser-client-request-token (clojure.core/get-in letvar1489029 ["ClientRequestToken"])))))))

(clojure.core/defn- response-search-profiles-response ([input] (response-search-profiles-response nil input)) ([resultWrapper1489031 input] (clojure.core/let [rawinput1489030 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1489032 {"Profiles" (rawinput1489030 "Profiles"), "NextToken" (rawinput1489030 "NextToken"), "TotalCount" (rawinput1489030 "TotalCount")}] (clojure.core/cond-> {} (letvar1489032 "Profiles") (clojure.core/assoc :profiles (deser-profile-data-list (clojure.core/get-in letvar1489032 ["Profiles"]))) (letvar1489032 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1489032 ["NextToken"]))) (letvar1489032 "TotalCount") (clojure.core/assoc :total-count (deser-total-count (clojure.core/get-in letvar1489032 ["TotalCount"])))))))

(clojure.core/defn- response-search-devices-response ([input] (response-search-devices-response nil input)) ([resultWrapper1489034 input] (clojure.core/let [rawinput1489033 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1489035 {"Devices" (rawinput1489033 "Devices"), "NextToken" (rawinput1489033 "NextToken"), "TotalCount" (rawinput1489033 "TotalCount")}] (clojure.core/cond-> {} (letvar1489035 "Devices") (clojure.core/assoc :devices (deser-device-data-list (clojure.core/get-in letvar1489035 ["Devices"]))) (letvar1489035 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1489035 ["NextToken"]))) (letvar1489035 "TotalCount") (clojure.core/assoc :total-count (deser-total-count (clojure.core/get-in letvar1489035 ["TotalCount"])))))))

(clojure.core/defn- response-invalid-certificate-authority-exception ([input] (response-invalid-certificate-authority-exception nil input)) ([resultWrapper1489037 input] (clojure.core/let [rawinput1489036 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1489038 {"Message" (rawinput1489036 "Message")}] (clojure.core/cond-> {} (letvar1489038 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1489038 ["Message"])))))))

(clojure.core/defn- response-limit-exceeded-exception ([input] (response-limit-exceeded-exception nil input)) ([resultWrapper1489040 input] (clojure.core/let [rawinput1489039 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1489041 {"Message" (rawinput1489039 "Message")}] (clojure.core/cond-> {} (letvar1489041 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1489041 ["Message"])))))))

(clojure.core/defn- response-resolve-room-response ([input] (response-resolve-room-response nil input)) ([resultWrapper1489043 input] (clojure.core/let [rawinput1489042 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1489044 {"RoomArn" (rawinput1489042 "RoomArn"), "RoomName" (rawinput1489042 "RoomName"), "RoomSkillParameters" (rawinput1489042 "RoomSkillParameters")}] (clojure.core/cond-> {} (letvar1489044 "RoomArn") (clojure.core/assoc :room-arn (deser-arn (clojure.core/get-in letvar1489044 ["RoomArn"]))) (letvar1489044 "RoomName") (clojure.core/assoc :room-name (deser-room-name (clojure.core/get-in letvar1489044 ["RoomName"]))) (letvar1489044 "RoomSkillParameters") (clojure.core/assoc :room-skill-parameters (deser-room-skill-parameters (clojure.core/get-in letvar1489044 ["RoomSkillParameters"])))))))

(clojure.core/defn- response-invalid-user-status-exception ([input] (response-invalid-user-status-exception nil input)) ([resultWrapper1489046 input] (clojure.core/let [rawinput1489045 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1489047 {"Message" (rawinput1489045 "Message")}] (clojure.core/cond-> {} (letvar1489047 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1489047 ["Message"])))))))

(clojure.core/defn- response-update-profile-response ([input] (response-update-profile-response nil input)) ([resultWrapper1489049 input] (clojure.core/let [rawinput1489048 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1489050 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-disassociate-contact-from-address-book-response ([input] (response-disassociate-contact-from-address-book-response nil input)) ([resultWrapper1489052 input] (clojure.core/let [rawinput1489051 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1489053 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-update-device-response ([input] (response-update-device-response nil input)) ([resultWrapper1489055 input] (clojure.core/let [rawinput1489054 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1489056 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-disassociate-device-from-room-response ([input] (response-disassociate-device-from-room-response nil input)) ([resultWrapper1489058 input] (clojure.core/let [rawinput1489057 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1489059 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-disassociate-skill-from-skill-group-response ([input] (response-disassociate-skill-from-skill-group-response nil input)) ([resultWrapper1489061 input] (clojure.core/let [rawinput1489060 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1489062 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-put-room-skill-parameter-response ([input] (response-put-room-skill-parameter-response nil input)) ([resultWrapper1489064 input] (clojure.core/let [rawinput1489063 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1489065 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-update-skill-group-response ([input] (response-update-skill-group-response nil input)) ([resultWrapper1489067 input] (clojure.core/let [rawinput1489066 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1489068 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-tag-resource-response ([input] (response-tag-resource-response nil input)) ([resultWrapper1489070 input] (clojure.core/let [rawinput1489069 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1489071 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-delete-user-response ([input] (response-delete-user-response nil input)) ([resultWrapper1489073 input] (clojure.core/let [rawinput1489072 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1489074 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-delete-skill-authorization-response ([input] (response-delete-skill-authorization-response nil input)) ([resultWrapper1489076 input] (clojure.core/let [rawinput1489075 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1489077 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-update-business-report-schedule-response ([input] (response-update-business-report-schedule-response nil input)) ([resultWrapper1489079 input] (clojure.core/let [rawinput1489078 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1489080 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-send-invitation-response ([input] (response-send-invitation-response nil input)) ([resultWrapper1489082 input] (clojure.core/let [rawinput1489081 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1489083 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-room-response ([input] (response-get-room-response nil input)) ([resultWrapper1489085 input] (clojure.core/let [rawinput1489084 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1489086 {"Room" (rawinput1489084 "Room")}] (clojure.core/cond-> {} (letvar1489086 "Room") (clojure.core/assoc :room (deser-room (clojure.core/get-in letvar1489086 ["Room"])))))))

(clojure.core/defn- response-disassociate-skill-group-from-room-response ([input] (response-disassociate-skill-group-from-room-response nil input)) ([resultWrapper1489088 input] (clojure.core/let [rawinput1489087 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1489089 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-forget-smart-home-appliances-response ([input] (response-forget-smart-home-appliances-response nil input)) ([resultWrapper1489091 input] (clojure.core/let [rawinput1489090 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1489092 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-invitation-configuration-response ([input] (response-get-invitation-configuration-response nil input)) ([resultWrapper1489094 input] (clojure.core/let [rawinput1489093 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1489095 {"OrganizationName" (rawinput1489093 "OrganizationName"), "ContactEmail" (rawinput1489093 "ContactEmail"), "PrivateSkillIds" (rawinput1489093 "PrivateSkillIds")}] (clojure.core/cond-> {} (letvar1489095 "OrganizationName") (clojure.core/assoc :organization-name (deser-organization-name (clojure.core/get-in letvar1489095 ["OrganizationName"]))) (letvar1489095 "ContactEmail") (clojure.core/assoc :contact-email (deser-email (clojure.core/get-in letvar1489095 ["ContactEmail"]))) (letvar1489095 "PrivateSkillIds") (clojure.core/assoc :private-skill-ids (deser-short-skill-id-list (clojure.core/get-in letvar1489095 ["PrivateSkillIds"])))))))

(clojure.core/defn- response-revoke-invitation-response ([input] (response-revoke-invitation-response nil input)) ([resultWrapper1489097 input] (clojure.core/let [rawinput1489096 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1489098 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-conference-provider-response ([input] (response-get-conference-provider-response nil input)) ([resultWrapper1489100 input] (clojure.core/let [rawinput1489099 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1489101 {"ConferenceProvider" (rawinput1489099 "ConferenceProvider")}] (clojure.core/cond-> {} (letvar1489101 "ConferenceProvider") (clojure.core/assoc :conference-provider (deser-conference-provider (clojure.core/get-in letvar1489101 ["ConferenceProvider"])))))))

(clojure.core/defn- response-device-not-registered-exception ([input] (response-device-not-registered-exception nil input)) ([resultWrapper1489103 input] (clojure.core/let [rawinput1489102 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1489104 {"Message" (rawinput1489102 "Message")}] (clojure.core/cond-> {} (letvar1489104 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1489104 ["Message"])))))))

(clojure.core/defn- response-invalid-device-exception ([input] (response-invalid-device-exception nil input)) ([resultWrapper1489106 input] (clojure.core/let [rawinput1489105 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1489107 {"Message" (rawinput1489105 "Message")}] (clojure.core/cond-> {} (letvar1489107 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1489107 ["Message"])))))))

(clojure.core/defn- response-associate-skill-with-skill-group-response ([input] (response-associate-skill-with-skill-group-response nil input)) ([resultWrapper1489109 input] (clojure.core/let [rawinput1489108 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1489110 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-not-found-exception ([input] (response-not-found-exception nil input)) ([resultWrapper1489112 input] (clojure.core/let [rawinput1489111 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1489113 {"Message" (rawinput1489111 "Message")}] (clojure.core/cond-> {} (letvar1489113 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1489113 ["Message"])))))))

(clojure.core/defn- response-get-contact-response ([input] (response-get-contact-response nil input)) ([resultWrapper1489115 input] (clojure.core/let [rawinput1489114 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1489116 {"Contact" (rawinput1489114 "Contact")}] (clojure.core/cond-> {} (letvar1489116 "Contact") (clojure.core/assoc :contact (deser-contact (clojure.core/get-in letvar1489116 ["Contact"])))))))

(clojure.core/defn- response-list-skills-store-categories-response ([input] (response-list-skills-store-categories-response nil input)) ([resultWrapper1489118 input] (clojure.core/let [rawinput1489117 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1489119 {"CategoryList" (rawinput1489117 "CategoryList"), "NextToken" (rawinput1489117 "NextToken")}] (clojure.core/cond-> {} (letvar1489119 "CategoryList") (clojure.core/assoc :category-list (deser-category-list (clojure.core/get-in letvar1489119 ["CategoryList"]))) (letvar1489119 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1489119 ["NextToken"])))))))

(clojure.core/defn- response-delete-address-book-response ([input] (response-delete-address-book-response nil input)) ([resultWrapper1489121 input] (clojure.core/let [rawinput1489120 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1489122 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-put-skill-authorization-response ([input] (response-put-skill-authorization-response nil input)) ([resultWrapper1489124 input] (clojure.core/let [rawinput1489123 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1489125 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-search-skill-groups-response ([input] (response-search-skill-groups-response nil input)) ([resultWrapper1489127 input] (clojure.core/let [rawinput1489126 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1489128 {"SkillGroups" (rawinput1489126 "SkillGroups"), "NextToken" (rawinput1489126 "NextToken"), "TotalCount" (rawinput1489126 "TotalCount")}] (clojure.core/cond-> {} (letvar1489128 "SkillGroups") (clojure.core/assoc :skill-groups (deser-skill-group-data-list (clojure.core/get-in letvar1489128 ["SkillGroups"]))) (letvar1489128 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1489128 ["NextToken"]))) (letvar1489128 "TotalCount") (clojure.core/assoc :total-count (deser-total-count (clojure.core/get-in letvar1489128 ["TotalCount"])))))))

(clojure.core/defn- response-update-room-response ([input] (response-update-room-response nil input)) ([resultWrapper1489130 input] (clojure.core/let [rawinput1489129 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1489131 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-update-address-book-response ([input] (response-update-address-book-response nil input)) ([resultWrapper1489133 input] (clojure.core/let [rawinput1489132 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1489134 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-create-skill-group-response ([input] (response-create-skill-group-response nil input)) ([resultWrapper1489136 input] (clojure.core/let [rawinput1489135 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1489137 {"SkillGroupArn" (rawinput1489135 "SkillGroupArn")}] (clojure.core/cond-> {} (letvar1489137 "SkillGroupArn") (clojure.core/assoc :skill-group-arn (deser-arn (clojure.core/get-in letvar1489137 ["SkillGroupArn"])))))))

(clojure.core/defn- response-get-room-skill-parameter-response ([input] (response-get-room-skill-parameter-response nil input)) ([resultWrapper1489139 input] (clojure.core/let [rawinput1489138 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1489140 {"RoomSkillParameter" (rawinput1489138 "RoomSkillParameter")}] (clojure.core/cond-> {} (letvar1489140 "RoomSkillParameter") (clojure.core/assoc :room-skill-parameter (deser-room-skill-parameter (clojure.core/get-in letvar1489140 ["RoomSkillParameter"])))))))

(clojure.core/defn- response-list-device-events-response ([input] (response-list-device-events-response nil input)) ([resultWrapper1489142 input] (clojure.core/let [rawinput1489141 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1489143 {"DeviceEvents" (rawinput1489141 "DeviceEvents"), "NextToken" (rawinput1489141 "NextToken")}] (clojure.core/cond-> {} (letvar1489143 "DeviceEvents") (clojure.core/assoc :device-events (deser-device-event-list (clojure.core/get-in letvar1489143 ["DeviceEvents"]))) (letvar1489143 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1489143 ["NextToken"])))))))

(clojure.core/defn- response-create-profile-response ([input] (response-create-profile-response nil input)) ([resultWrapper1489145 input] (clojure.core/let [rawinput1489144 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1489146 {"ProfileArn" (rawinput1489144 "ProfileArn")}] (clojure.core/cond-> {} (letvar1489146 "ProfileArn") (clojure.core/assoc :profile-arn (deser-arn (clojure.core/get-in letvar1489146 ["ProfileArn"])))))))

(clojure.core/defn- response-start-device-sync-response ([input] (response-start-device-sync-response nil input)) ([resultWrapper1489148 input] (clojure.core/let [rawinput1489147 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1489149 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-disassociate-skill-from-users-response ([input] (response-disassociate-skill-from-users-response nil input)) ([resultWrapper1489151 input] (clojure.core/let [rawinput1489150 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1489152 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-delete-contact-response ([input] (response-delete-contact-response nil input)) ([resultWrapper1489154 input] (clojure.core/let [rawinput1489153 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1489155 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-delete-room-skill-parameter-response ([input] (response-delete-room-skill-parameter-response nil input)) ([resultWrapper1489157 input] (clojure.core/let [rawinput1489156 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1489158 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-create-room-response ([input] (response-create-room-response nil input)) ([resultWrapper1489160 input] (clojure.core/let [rawinput1489159 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1489161 {"RoomArn" (rawinput1489159 "RoomArn")}] (clojure.core/cond-> {} (letvar1489161 "RoomArn") (clojure.core/assoc :room-arn (deser-arn (clojure.core/get-in letvar1489161 ["RoomArn"])))))))

(clojure.core/defn- response-list-skills-store-skills-by-category-response ([input] (response-list-skills-store-skills-by-category-response nil input)) ([resultWrapper1489163 input] (clojure.core/let [rawinput1489162 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1489164 {"SkillsStoreSkills" (rawinput1489162 "SkillsStoreSkills"), "NextToken" (rawinput1489162 "NextToken")}] (clojure.core/cond-> {} (letvar1489164 "SkillsStoreSkills") (clojure.core/assoc :skills-store-skills (deser-skills-store-skill-list (clojure.core/get-in letvar1489164 ["SkillsStoreSkills"]))) (letvar1489164 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1489164 ["NextToken"])))))))

(clojure.core/defn- response-get-skill-group-response ([input] (response-get-skill-group-response nil input)) ([resultWrapper1489166 input] (clojure.core/let [rawinput1489165 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1489167 {"SkillGroup" (rawinput1489165 "SkillGroup")}] (clojure.core/cond-> {} (letvar1489167 "SkillGroup") (clojure.core/assoc :skill-group (deser-skill-group (clojure.core/get-in letvar1489167 ["SkillGroup"])))))))

(clojure.core/defn- response-get-profile-response ([input] (response-get-profile-response nil input)) ([resultWrapper1489169 input] (clojure.core/let [rawinput1489168 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1489170 {"Profile" (rawinput1489168 "Profile")}] (clojure.core/cond-> {} (letvar1489170 "Profile") (clojure.core/assoc :profile (deser-profile (clojure.core/get-in letvar1489170 ["Profile"])))))))

(clojure.core/defn- response-list-skills-response ([input] (response-list-skills-response nil input)) ([resultWrapper1489172 input] (clojure.core/let [rawinput1489171 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1489173 {"SkillSummaries" (rawinput1489171 "SkillSummaries"), "NextToken" (rawinput1489171 "NextToken")}] (clojure.core/cond-> {} (letvar1489173 "SkillSummaries") (clojure.core/assoc :skill-summaries (deser-skill-summary-list (clojure.core/get-in letvar1489173 ["SkillSummaries"]))) (letvar1489173 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1489173 ["NextToken"])))))))

(clojure.core/defn- response-list-business-report-schedules-response ([input] (response-list-business-report-schedules-response nil input)) ([resultWrapper1489175 input] (clojure.core/let [rawinput1489174 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1489176 {"BusinessReportSchedules" (rawinput1489174 "BusinessReportSchedules"), "NextToken" (rawinput1489174 "NextToken")}] (clojure.core/cond-> {} (letvar1489176 "BusinessReportSchedules") (clojure.core/assoc :business-report-schedules (deser-business-report-schedule-list (clojure.core/get-in letvar1489176 ["BusinessReportSchedules"]))) (letvar1489176 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1489176 ["NextToken"])))))))

(clojure.core/defn- response-delete-device-response ([input] (response-delete-device-response nil input)) ([resultWrapper1489178 input] (clojure.core/let [rawinput1489177 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1489179 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-delete-skill-group-response ([input] (response-delete-skill-group-response nil input)) ([resultWrapper1489181 input] (clojure.core/let [rawinput1489180 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1489182 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-list-conference-providers-response ([input] (response-list-conference-providers-response nil input)) ([resultWrapper1489184 input] (clojure.core/let [rawinput1489183 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1489185 {"ConferenceProviders" (rawinput1489183 "ConferenceProviders"), "NextToken" (rawinput1489183 "NextToken")}] (clojure.core/cond-> {} (letvar1489185 "ConferenceProviders") (clojure.core/assoc :conference-providers (deser-conference-providers-list (clojure.core/get-in letvar1489185 ["ConferenceProviders"]))) (letvar1489185 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1489185 ["NextToken"])))))))

(clojure.core/defn- response-concurrent-modification-exception ([input] (response-concurrent-modification-exception nil input)) ([resultWrapper1489187 input] (clojure.core/let [rawinput1489186 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1489188 {"Message" (rawinput1489186 "Message")}] (clojure.core/cond-> {} (letvar1489188 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1489188 ["Message"])))))))

(clojure.core/defn- response-delete-business-report-schedule-response ([input] (response-delete-business-report-schedule-response nil input)) ([resultWrapper1489190 input] (clojure.core/let [rawinput1489189 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1489191 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-register-avs-device-response ([input] (response-register-avs-device-response nil input)) ([resultWrapper1489193 input] (clojure.core/let [rawinput1489192 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1489194 {"DeviceArn" (rawinput1489192 "DeviceArn")}] (clojure.core/cond-> {} (letvar1489194 "DeviceArn") (clojure.core/assoc :device-arn (deser-arn (clojure.core/get-in letvar1489194 ["DeviceArn"])))))))

(clojure.core/defn- response-associate-skill-group-with-room-response ([input] (response-associate-skill-group-with-room-response nil input)) ([resultWrapper1489196 input] (clojure.core/let [rawinput1489195 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1489197 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-untag-resource-response ([input] (response-untag-resource-response nil input)) ([resultWrapper1489199 input] (clojure.core/let [rawinput1489198 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1489200 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-search-rooms-response ([input] (response-search-rooms-response nil input)) ([resultWrapper1489202 input] (clojure.core/let [rawinput1489201 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1489203 {"Rooms" (rawinput1489201 "Rooms"), "NextToken" (rawinput1489201 "NextToken"), "TotalCount" (rawinput1489201 "TotalCount")}] (clojure.core/cond-> {} (letvar1489203 "Rooms") (clojure.core/assoc :rooms (deser-room-data-list (clojure.core/get-in letvar1489203 ["Rooms"]))) (letvar1489203 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1489203 ["NextToken"]))) (letvar1489203 "TotalCount") (clojure.core/assoc :total-count (deser-total-count (clojure.core/get-in letvar1489203 ["TotalCount"])))))))

(clojure.core/defn- response-list-smart-home-appliances-response ([input] (response-list-smart-home-appliances-response nil input)) ([resultWrapper1489205 input] (clojure.core/let [rawinput1489204 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1489206 {"SmartHomeAppliances" (rawinput1489204 "SmartHomeAppliances"), "NextToken" (rawinput1489204 "NextToken")}] (clojure.core/cond-> {} (letvar1489206 "SmartHomeAppliances") (clojure.core/assoc :smart-home-appliances (deser-smart-home-appliance-list (clojure.core/get-in letvar1489206 ["SmartHomeAppliances"]))) (letvar1489206 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1489206 ["NextToken"])))))))

(clojure.core/defn- response-delete-conference-provider-response ([input] (response-delete-conference-provider-response nil input)) ([resultWrapper1489208 input] (clojure.core/let [rawinput1489207 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1489209 {}] (clojure.core/cond-> {}))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/skill-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 100)) (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"[\u0009\u000A\u000D\u0020-\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/sort-list (clojure.spec.alpha/coll-of :portkey.aws.alexaforbusiness/sort :max-count 25))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/address (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 500))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.sort/key (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/sort-key))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.sort/value (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/sort-value))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/sort (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness.sort/key :portkey.aws.alexaforbusiness.sort/value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.create-user-response/user-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/create-user-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.create-user-response/user-arn]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.disassociate-skill-from-skill-group-request/skill-group-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/disassociate-skill-from-skill-group-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness/skill-id] :opt-un [:portkey.aws.alexaforbusiness.disassociate-skill-from-skill-group-request/skill-group-arn]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.business-report-recurrence/start-date (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/date))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/business-report-recurrence (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.business-report-recurrence/start-date]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.unauthorized-exception/message (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/error-message))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/unauthorized-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.unauthorized-exception/message]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/update-contact-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/filter-value-list (clojure.spec.alpha/coll-of :portkey.aws.alexaforbusiness/filter-value :max-count 5))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.create-address-book-response/address-book-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/create-address-book-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.create-address-book-response/address-book-arn]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/sort-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 500))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/associate-contact-with-address-book-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/ip-dial-in (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness/endpoint :portkey.aws.alexaforbusiness/comms-protocol] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.filter/key (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/filter-key))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.filter/values (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/filter-value-list))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/filter (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness.filter/key :portkey.aws.alexaforbusiness.filter/values] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/device-serial-number (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"[a-zA-Z0-9]{1,200}" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.already-exists-exception/message (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/error-message))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/already-exists-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.already-exists-exception/message]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/client-request-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 10 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 150)) (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"[a-zA-Z0-9][a-zA-Z0-9_-]*" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/associate-device-with-room-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.conference-provider/name (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/conference-provider-name))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.conference-provider/type (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/conference-provider-type))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/conference-provider (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness/arn :portkey.aws.alexaforbusiness.conference-provider/name :portkey.aws.alexaforbusiness.conference-provider/type :portkey.aws.alexaforbusiness/ip-dial-in :portkey.aws.alexaforbusiness/pstn-dial-in :portkey.aws.alexaforbusiness/meeting-setting]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/privacy-policy (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.update-profile-request/setup-mode-disabled (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/boolean))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.update-profile-request/pstn-enabled (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/boolean))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.update-profile-request/profile-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.update-profile-request/is-default (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/boolean))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/update-profile-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness/address :portkey.aws.alexaforbusiness/wake-word :portkey.aws.alexaforbusiness.update-profile-request/setup-mode-disabled :portkey.aws.alexaforbusiness.update-profile-request/pstn-enabled :portkey.aws.alexaforbusiness/timezone :portkey.aws.alexaforbusiness/max-volume-limit :portkey.aws.alexaforbusiness.update-profile-request/profile-arn :portkey.aws.alexaforbusiness/temperature-unit :portkey.aws.alexaforbusiness/distance-unit :portkey.aws.alexaforbusiness.update-profile-request/is-default :portkey.aws.alexaforbusiness/profile-name]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/provider-calendar-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 0 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 100))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/device-status-details (clojure.spec.alpha/coll-of :portkey.aws.alexaforbusiness/device-status-detail))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.disassociate-device-from-room-request/device-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/disassociate-device-from-room-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.disassociate-device-from-room-request/device-arn]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.name-in-use-exception/message (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/error-message))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/name-in-use-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.name-in-use-exception/message]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/associate-skill-with-users-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness/skill-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/put-conference-preference-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/software-version (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.delete-conference-provider-request/conference-provider-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/delete-conference-provider-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness.delete-conference-provider-request/conference-provider-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/conference-providers-list (clojure.spec.alpha/coll-of :portkey.aws.alexaforbusiness/conference-provider))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/email (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 128)) (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"([0-9a-zA-Z]([+-.\w]*[0-9a-zA-Z])*@([0-9a-zA-Z][-\w]*[0-9a-zA-Z]\.)+[a-zA-Z]{2,9})" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/short-skill-id-list (clojure.spec.alpha/coll-of :portkey.aws.alexaforbusiness/skill-id :min-count 0 :max-count 3))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.create-contact-response/contact-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/create-contact-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.create-contact-response/contact-arn]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.create-conference-provider-response/conference-provider-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/create-conference-provider-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.create-conference-provider-response/conference-provider-arn]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/device-status-info (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness/device-status-details :portkey.aws.alexaforbusiness/connection-status]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/put-invitation-configuration-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.get-conference-preference-response/preference (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/conference-preference))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/get-conference-preference-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.get-conference-preference-response/preference]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.delete-room-request/room-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/delete-room-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.delete-room-request/room-arn]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.put-invitation-configuration-request/contact-email (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/email))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.put-invitation-configuration-request/private-skill-ids (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/short-skill-id-list))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/put-invitation-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness/organization-name] :opt-un [:portkey.aws.alexaforbusiness.put-invitation-configuration-request/contact-email :portkey.aws.alexaforbusiness.put-invitation-configuration-request/private-skill-ids]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.get-profile-request/profile-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/get-profile-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.get-profile-request/profile-arn]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/get-address-book-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness/address-book]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/delete-profile-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/category (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness/category-id :portkey.aws.alexaforbusiness/category-name]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/associate-skill-with-users-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.list-device-events-request/device-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.list-device-events-request/event-type (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/device-event-type))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/list-device-events-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness.list-device-events-request/device-arn] :opt-un [:portkey.aws.alexaforbusiness.list-device-events-request/event-type :portkey.aws.alexaforbusiness/next-token :portkey.aws.alexaforbusiness/max-results]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/enrollment-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 0 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 128))))

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

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.forget-smart-home-appliances-request/room-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/forget-smart-home-appliances-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness.forget-smart-home-appliances-request/room-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.search-address-books-request/filters (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/filter-list))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.search-address-books-request/sort-criteria (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/sort-list))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/search-address-books-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.search-address-books-request/filters :portkey.aws.alexaforbusiness.search-address-books-request/sort-criteria :portkey.aws.alexaforbusiness/next-token :portkey.aws.alexaforbusiness/max-results]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/reject-skill-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.create-business-report-schedule-response/schedule-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/create-business-report-schedule-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.create-business-report-schedule-response/schedule-arn]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.get-address-book-request/address-book-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/get-address-book-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness.get-address-book-request/address-book-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/wake-word #{:computer :amazon :alexa "COMPUTER" "ECHO" :echo "ALEXA" "AMAZON"})

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/update-conference-provider-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.disassociate-skill-group-from-room-request/skill-group-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.disassociate-skill-group-from-room-request/room-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/disassociate-skill-group-from-room-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.disassociate-skill-group-from-room-request/skill-group-arn :portkey.aws.alexaforbusiness.disassociate-skill-group-from-room-request/room-arn]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.profile-data/profile-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.profile-data/is-default (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/boolean))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/profile-data (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.profile-data/profile-arn :portkey.aws.alexaforbusiness/profile-name :portkey.aws.alexaforbusiness.profile-data/is-default :portkey.aws.alexaforbusiness/address :portkey.aws.alexaforbusiness/timezone :portkey.aws.alexaforbusiness/distance-unit :portkey.aws.alexaforbusiness/temperature-unit :portkey.aws.alexaforbusiness/wake-word]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/user-user-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 128)) (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"[a-zA-Z0-9@_+.-]*" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/contact-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 100)) (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"[\u0009\u000A\u000D\u0020-\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.search-rooms-request/filters (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/filter-list))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.search-rooms-request/sort-criteria (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/sort-list))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/search-rooms-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness/next-token :portkey.aws.alexaforbusiness/max-results :portkey.aws.alexaforbusiness.search-rooms-request/filters :portkey.aws.alexaforbusiness.search-rooms-request/sort-criteria]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/user-code (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/start-smart-home-appliance-discovery-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/address-book-data-list (clojure.spec.alpha/coll-of :portkey.aws.alexaforbusiness/address-book-data))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/address-book-description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 200)) (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"[\u0009\u000A\u000D\u0020-\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/developer-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.skill-not-linked-exception/message (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/error-message))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/skill-not-linked-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.skill-not-linked-exception/message]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.register-avs-device-request/device-serial-number (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/device-serial-number-for-avs))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/register-avs-device-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness/client-id :portkey.aws.alexaforbusiness/user-code :portkey.aws.alexaforbusiness/product-id :portkey.aws.alexaforbusiness.register-avs-device-request/device-serial-number :portkey.aws.alexaforbusiness/amazon-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.associate-skill-with-skill-group-request/skill-group-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/associate-skill-with-skill-group-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness/skill-id] :opt-un [:portkey.aws.alexaforbusiness.associate-skill-with-skill-group-request/skill-group-arn]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.list-tags-response/tags (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/tag-list))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/list-tags-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.list-tags-response/tags :portkey.aws.alexaforbusiness/next-token]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/skill-type-filter #{:private :public :all "PRIVATE" "PUBLIC" "ALL"})

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.conference-preference/default-conference-provider-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/conference-preference (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.conference-preference/default-conference-provider-arn]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/approve-skill-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/feature #{"NOTIFICATIONS" :lists "SKILLS" "LISTS" :bluetooth "BLUETOOTH" :all :volume :notifications :skills "VOLUME" "ALL"})

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/mac-address (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/user-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"amzn1\.[A-Za-z0-9+-\/=.]{1,300}" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/device-serial-number-for-avs (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9]{1,50}$" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.search-contacts-response/contacts (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/contact-data-list))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/search-contacts-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.search-contacts-response/contacts :portkey.aws.alexaforbusiness/next-token :portkey.aws.alexaforbusiness/total-count]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.skill-group/skill-group-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.skill-group/description (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/skill-group-description))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/skill-group (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.skill-group/skill-group-arn :portkey.aws.alexaforbusiness/skill-group-name :portkey.aws.alexaforbusiness.skill-group/description]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/amazon-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"[a-zA-Z0-9]{1,18}" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 128)) (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.get-device-request/device-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/get-device-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.get-device-request/device-arn]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.update-device-request/device-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/update-device-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.update-device-request/device-arn :portkey.aws.alexaforbusiness/device-name]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/business-report-schedule-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 0 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 64)) (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"[\u0009\u000A\u000D\u0020-\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/category-list (clojure.spec.alpha/coll-of :portkey.aws.alexaforbusiness/category))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.search-users-request/filters (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/filter-list))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.search-users-request/sort-criteria (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/sort-list))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/search-users-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness/next-token :portkey.aws.alexaforbusiness/max-results :portkey.aws.alexaforbusiness.search-users-request/filters :portkey.aws.alexaforbusiness.search-users-request/sort-criteria]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/country-code (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"\d{1,3}" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/generic-keywords (clojure.spec.alpha/coll-of :portkey.aws.alexaforbusiness/generic-keyword))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.search-address-books-response/address-books (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/address-book-data-list))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/search-address-books-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.search-address-books-response/address-books :portkey.aws.alexaforbusiness/next-token :portkey.aws.alexaforbusiness/total-count]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.resource-in-use-exception/message (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/error-message))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/resource-in-use-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.resource-in-use-exception/message :portkey.aws.alexaforbusiness/client-request-token]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/skill-group-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 100)) (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"[\u0009\u000A\u000D\u0020-\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.delete-room-skill-parameter-request/room-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.delete-room-skill-parameter-request/parameter-key (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/room-skill-parameter-key))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/delete-room-skill-parameter-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness/skill-id :portkey.aws.alexaforbusiness.delete-room-skill-parameter-request/parameter-key] :opt-un [:portkey.aws.alexaforbusiness.delete-room-skill-parameter-request/room-arn]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.search-profiles-response/profiles (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/profile-data-list))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/search-profiles-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.search-profiles-response/profiles :portkey.aws.alexaforbusiness/next-token :portkey.aws.alexaforbusiness/total-count]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.search-devices-response/devices (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/device-data-list))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/search-devices-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.search-devices-response/devices :portkey.aws.alexaforbusiness/next-token :portkey.aws.alexaforbusiness/total-count]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.invalid-certificate-authority-exception/message (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/error-message))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/invalid-certificate-authority-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.invalid-certificate-authority-exception/message]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/organization-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 100)) (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"([A-Za-z\-' 0-9._]|\p{IsLetter})*" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.pstn-dial-in/phone-number (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/outbound-phone-number))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/pstn-dial-in (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness/country-code :portkey.aws.alexaforbusiness.pstn-dial-in/phone-number :portkey.aws.alexaforbusiness/one-click-id-delay :portkey.aws.alexaforbusiness/one-click-pin-delay] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/error-message))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.room-skill-parameter/parameter-key (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/room-skill-parameter-key))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.room-skill-parameter/parameter-value (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/room-skill-parameter-value))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/room-skill-parameter (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness.room-skill-parameter/parameter-key :portkey.aws.alexaforbusiness.room-skill-parameter/parameter-value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.revoke-invitation-request/user-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/revoke-invitation-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.revoke-invitation-request/user-arn :portkey.aws.alexaforbusiness/enrollment-id]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/short-description (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.address-book-data/address-book-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.address-book-data/name (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/address-book-name))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.address-book-data/description (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/address-book-description))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/address-book-data (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.address-book-data/address-book-arn :portkey.aws.alexaforbusiness.address-book-data/name :portkey.aws.alexaforbusiness.address-book-data/description]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/device-status-detail-code #{"DEVICE_WAS_OFFLINE" :device-was-offline "DEVICE_SOFTWARE_UPDATE_NEEDED" :device-software-update-needed})

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.put-skill-authorization-request/room-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/put-skill-authorization-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness/authorization-result :portkey.aws.alexaforbusiness/skill-id] :opt-un [:portkey.aws.alexaforbusiness.put-skill-authorization-request/room-arn]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.resolve-room-response/room-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/resolve-room-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.resolve-room-response/room-arn :portkey.aws.alexaforbusiness/room-name :portkey.aws.alexaforbusiness/room-skill-parameters]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.device-status-detail/code (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/device-status-detail-code))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/device-status-detail (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.device-status-detail/code]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.invalid-user-status-exception/message (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/error-message))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/invalid-user-status-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.invalid-user-status-exception/message]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/device-data-list (clojure.spec.alpha/coll-of :portkey.aws.alexaforbusiness/device-data))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/update-profile-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/appliance-friendly-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.associate-skill-group-with-room-request/skill-group-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.associate-skill-group-with-room-request/room-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/associate-skill-group-with-room-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.associate-skill-group-with-room-request/skill-group-arn :portkey.aws.alexaforbusiness.associate-skill-group-with-room-request/room-arn]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/disassociate-contact-from-address-book-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/reject-skill-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness/skill-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/skills-store-skill-list (clojure.spec.alpha/coll-of :portkey.aws.alexaforbusiness/skills-store-skill))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.get-skill-group-request/skill-group-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/get-skill-group-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.get-skill-group-request/skill-group-arn]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/room-skill-parameters (clojure.spec.alpha/coll-of :portkey.aws.alexaforbusiness/room-skill-parameter))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/update-device-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/disassociate-device-from-room-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/disassociate-skill-from-skill-group-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/put-room-skill-parameter-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/update-skill-group-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/conference-provider-type #{:zoom "CUSTOM" "BLUEJEANS" :fuze "WEBEX" "FUZE" "GOOGLE_HANGOUTS" :custom "ZOOM" "RINGCENTRAL" :bluejeans "POLYCOM" :ringcentral :google-hangouts "SKYPE_FOR_BUSINESS" :skype-for-business :webex "CHIME" :chime :polycom})

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.contact/contact-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.contact/display-name (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/contact-name))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.contact/first-name (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/contact-name))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.contact/last-name (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/contact-name))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.contact/phone-number (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/e-164-phone-number))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/contact (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.contact/contact-arn :portkey.aws.alexaforbusiness.contact/display-name :portkey.aws.alexaforbusiness.contact/first-name :portkey.aws.alexaforbusiness.contact/last-name :portkey.aws.alexaforbusiness.contact/phone-number]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/next-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 1000))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/sample-utterances (clojure.spec.alpha/coll-of :portkey.aws.alexaforbusiness/utterance))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/tag-resource-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/delete-user-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/review-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/connection-status #{:offline :online "OFFLINE" "ONLINE"})

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/date (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"^\d{4}\-(0?[1-9]|1[012])\-(0?[1-9]|[12][0-9]|3[01])$" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/business-report-status #{:running "SUCCEEDED" "FAILED" :failed "RUNNING" :succeeded})

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.associate-contact-with-address-book-request/contact-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.associate-contact-with-address-book-request/address-book-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/associate-contact-with-address-book-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness.associate-contact-with-address-book-request/contact-arn :portkey.aws.alexaforbusiness.associate-contact-with-address-book-request/address-book-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/review-key (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/conference-provider-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 50)) (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"[\u0009\u000A\u000D\u0020-\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.device-event/type (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/device-event-type))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.device-event/value (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/device-event-value))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/device-event (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.device-event/type :portkey.aws.alexaforbusiness.device-event/value :portkey.aws.alexaforbusiness/timestamp]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/delete-skill-authorization-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/enablement-type-filter #{:pending "PENDING" "ENABLED" :enabled})

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/update-business-report-schedule-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/address-book-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 100)) (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"[\u0009\u000A\u000D\u0020-\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/outbound-phone-number (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"\d{10}" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.get-conference-provider-request/conference-provider-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/get-conference-provider-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness.get-conference-provider-request/conference-provider-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__)))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/comms-protocol #{"SIP" :sips "H323" :h-323 :sip "SIPS"})

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
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/create-contact-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness.create-contact-request/first-name] :opt-un [:portkey.aws.alexaforbusiness.create-contact-request/display-name :portkey.aws.alexaforbusiness.create-contact-request/last-name :portkey.aws.alexaforbusiness.create-contact-request/phone-number :portkey.aws.alexaforbusiness/client-request-token]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.tag-resource-request/tags (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/tag-list))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/tag-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness/arn :portkey.aws.alexaforbusiness.tag-resource-request/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/filter-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 500))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/send-invitation-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/skill-summary-list (clojure.spec.alpha/coll-of :portkey.aws.alexaforbusiness/skill-summary))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/skill-group-data-list (clojure.spec.alpha/coll-of :portkey.aws.alexaforbusiness/skill-group-data))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/tag-list (clojure.spec.alpha/coll-of :portkey.aws.alexaforbusiness/tag))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/category-id clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/list-skills-store-categories-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness/next-token :portkey.aws.alexaforbusiness/max-results]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.delete-skill-group-request/skill-group-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/delete-skill-group-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.delete-skill-group-request/skill-group-arn]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.search-contacts-request/filters (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/filter-list))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.search-contacts-request/sort-criteria (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/sort-list))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/search-contacts-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.search-contacts-request/filters :portkey.aws.alexaforbusiness.search-contacts-request/sort-criteria :portkey.aws.alexaforbusiness/next-token :portkey.aws.alexaforbusiness/max-results]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.get-room-request/room-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/get-room-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.get-room-request/room-arn]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/get-room-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness/room]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/timezone (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 100))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/tag-key-list (clojure.spec.alpha/coll-of :portkey.aws.alexaforbusiness/tag-key))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/one-click-pin-delay (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 2))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/disassociate-skill-group-from-room-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.skill-summary/supports-linking (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/boolean))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/skill-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness/skill-id :portkey.aws.alexaforbusiness/skill-name :portkey.aws.alexaforbusiness.skill-summary/supports-linking :portkey.aws.alexaforbusiness/enablement-type :portkey.aws.alexaforbusiness/skill-type]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/skill-details (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness/generic-keywords :portkey.aws.alexaforbusiness/release-date :portkey.aws.alexaforbusiness/product-description :portkey.aws.alexaforbusiness/developer-info :portkey.aws.alexaforbusiness/reviews :portkey.aws.alexaforbusiness/bullet-points :portkey.aws.alexaforbusiness/skill-types :portkey.aws.alexaforbusiness/new-in-this-version-bullet-points :portkey.aws.alexaforbusiness/end-user-license-agreement :portkey.aws.alexaforbusiness/invocation-phrase]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.update-conference-provider-request/conference-provider-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/update-conference-provider-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness.update-conference-provider-request/conference-provider-arn :portkey.aws.alexaforbusiness/conference-provider-type :portkey.aws.alexaforbusiness/meeting-setting] :opt-un [:portkey.aws.alexaforbusiness/ip-dial-in :portkey.aws.alexaforbusiness/pstn-dial-in]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/forget-smart-home-appliances-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.get-invitation-configuration-response/contact-email (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/email))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.get-invitation-configuration-response/private-skill-ids (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/short-skill-id-list))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/get-invitation-configuration-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness/organization-name :portkey.aws.alexaforbusiness.get-invitation-configuration-response/contact-email :portkey.aws.alexaforbusiness.get-invitation-configuration-response/private-skill-ids]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/revoke-invitation-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/utterance (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__)))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/get-conference-provider-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness/conference-provider]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/appliance-description (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.device-data/device-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.device-data/room-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/device-data (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness/device-serial-number :portkey.aws.alexaforbusiness/software-version :portkey.aws.alexaforbusiness/device-status-info :portkey.aws.alexaforbusiness/mac-address :portkey.aws.alexaforbusiness.device-data/device-arn :portkey.aws.alexaforbusiness/device-type :portkey.aws.alexaforbusiness/device-status :portkey.aws.alexaforbusiness/device-name :portkey.aws.alexaforbusiness.device-data/room-arn :portkey.aws.alexaforbusiness/room-name]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/approve-skill-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness/skill-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.device-not-registered-exception/message (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/error-message))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/device-not-registered-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.device-not-registered-exception/message]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.profile/setup-mode-disabled (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/boolean))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.profile/pstn-enabled (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/boolean))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.profile/profile-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.profile/address-book-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.profile/is-default (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/boolean))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/profile (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness/address :portkey.aws.alexaforbusiness/wake-word :portkey.aws.alexaforbusiness.profile/setup-mode-disabled :portkey.aws.alexaforbusiness.profile/pstn-enabled :portkey.aws.alexaforbusiness/timezone :portkey.aws.alexaforbusiness/max-volume-limit :portkey.aws.alexaforbusiness.profile/profile-arn :portkey.aws.alexaforbusiness.profile/address-book-arn :portkey.aws.alexaforbusiness/temperature-unit :portkey.aws.alexaforbusiness/distance-unit :portkey.aws.alexaforbusiness.profile/is-default :portkey.aws.alexaforbusiness/profile-name]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/url (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/user-first-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 0 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 30)) (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"([A-Za-z\-' 0-9._]|\p{IsLetter})*" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/authorization-result (clojure.spec.alpha/map-of :portkey.aws.alexaforbusiness/key :portkey.aws.alexaforbusiness/value))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/require-pin #{:yes "OPTIONAL" :optional "NO" "YES" :no})

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.search-skill-groups-request/filters (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/filter-list))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.search-skill-groups-request/sort-criteria (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/sort-list))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/search-skill-groups-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness/next-token :portkey.aws.alexaforbusiness/max-results :portkey.aws.alexaforbusiness.search-skill-groups-request/filters :portkey.aws.alexaforbusiness.search-skill-groups-request/sort-criteria]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 0 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 256)) (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.invalid-device-exception/message (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/error-message))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/invalid-device-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.invalid-device-exception/message]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/total-count clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/associate-skill-with-skill-group-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/device-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"[a-zA-Z0-9]{1,200}" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/customer-s-3-bucket-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"[a-z0-9-\.]{3,63}" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.get-room-skill-parameter-request/room-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.get-room-skill-parameter-request/parameter-key (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/room-skill-parameter-key))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/get-room-skill-parameter-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness/skill-id :portkey.aws.alexaforbusiness.get-room-skill-parameter-request/parameter-key] :opt-un [:portkey.aws.alexaforbusiness.get-room-skill-parameter-request/room-arn]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.delete-business-report-schedule-request/schedule-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/delete-business-report-schedule-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness.delete-business-report-schedule-request/schedule-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/profile-data-list (clojure.spec.alpha/coll-of :portkey.aws.alexaforbusiness/profile-data))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/max-volume-limit clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.create-address-book-request/name (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/address-book-name))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.create-address-book-request/description (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/address-book-description))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/create-address-book-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness.create-address-book-request/name] :opt-un [:portkey.aws.alexaforbusiness.create-address-book-request/description :portkey.aws.alexaforbusiness/client-request-token]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/device-status #{:ready :pending "READY" "PENDING" "WAS_OFFLINE" :deregistered "DEREGISTERED" :was-offline})

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.not-found-exception/message (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/error-message))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/get-contact-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness/contact]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/get-conference-preference-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.start-device-sync-request/room-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.start-device-sync-request/device-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/start-device-sync-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness/features] :opt-un [:portkey.aws.alexaforbusiness.start-device-sync-request/room-arn :portkey.aws.alexaforbusiness.start-device-sync-request/device-arn]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.update-business-report-schedule-request/schedule-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.update-business-report-schedule-request/s-3-bucket-name (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/customer-s-3-bucket-name))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.update-business-report-schedule-request/format (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/business-report-format))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.update-business-report-schedule-request/schedule-name (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/business-report-schedule-name))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.update-business-report-schedule-request/recurrence (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/business-report-recurrence))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/update-business-report-schedule-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness.update-business-report-schedule-request/schedule-arn] :opt-un [:portkey.aws.alexaforbusiness.update-business-report-schedule-request/s-3-bucket-name :portkey.aws.alexaforbusiness/s-3-key-prefix :portkey.aws.alexaforbusiness.update-business-report-schedule-request/format :portkey.aws.alexaforbusiness.update-business-report-schedule-request/schedule-name :portkey.aws.alexaforbusiness.update-business-report-schedule-request/recurrence]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.address-book/address-book-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.address-book/name (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/address-book-name))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.address-book/description (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/address-book-description))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/address-book (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.address-book/address-book-arn :portkey.aws.alexaforbusiness.address-book/name :portkey.aws.alexaforbusiness.address-book/description]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/list-skills-store-categories-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness/category-list :portkey.aws.alexaforbusiness/next-token]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/delete-address-book-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.business-report-schedule/schedule-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.business-report-schedule/schedule-name (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/business-report-schedule-name))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.business-report-schedule/s-3-bucket-name (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/customer-s-3-bucket-name))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.business-report-schedule/format (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/business-report-format))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.business-report-schedule/content-range (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/business-report-content-range))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.business-report-schedule/recurrence (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/business-report-recurrence))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.business-report-schedule/last-business-report (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/business-report))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/business-report-schedule (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.business-report-schedule/schedule-arn :portkey.aws.alexaforbusiness.business-report-schedule/schedule-name :portkey.aws.alexaforbusiness.business-report-schedule/s-3-bucket-name :portkey.aws.alexaforbusiness/s-3-key-prefix :portkey.aws.alexaforbusiness.business-report-schedule/format :portkey.aws.alexaforbusiness.business-report-schedule/content-range :portkey.aws.alexaforbusiness.business-report-schedule/recurrence :portkey.aws.alexaforbusiness.business-report-schedule/last-business-report]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/one-click-id-delay (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 2))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/sort-value #{:desc "DESC" :asc "ASC"})

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/business-report-s-3-path (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/put-skill-authorization-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/user-data-list (clojure.spec.alpha/coll-of :portkey.aws.alexaforbusiness/user-data))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.search-skill-groups-response/skill-groups (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/skill-group-data-list))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/search-skill-groups-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.search-skill-groups-response/skill-groups :portkey.aws.alexaforbusiness/next-token :portkey.aws.alexaforbusiness/total-count]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.delete-device-request/device-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/delete-device-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness.delete-device-request/device-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/update-room-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/disassociate-skill-from-users-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness/skill-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/release-date (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/update-address-book-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/room-description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 200)) (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"[\u0009\u000A\u000D\u0020-\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.create-skill-group-response/skill-group-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/create-skill-group-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.create-skill-group-response/skill-group-arn]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/appliance-manufacturer-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/get-invitation-configuration-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/list-conference-providers-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness/next-token :portkey.aws.alexaforbusiness/max-results]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/business-report-failure-code #{"NO_SUCH_BUCKET" "INTERNAL_FAILURE" :internal-failure "ACCESS_DENIED" :no-such-bucket :access-denied})

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/room-skill-parameter-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/client-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"^\S+{1,256}$" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/get-room-skill-parameter-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness/room-skill-parameter]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.list-skills-request/skill-group-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.list-skills-request/enablement-type (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/enablement-type-filter))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.list-skills-request/skill-type (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/skill-type-filter))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.list-skills-request/max-results (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/skill-list-max-results))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/list-skills-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.list-skills-request/skill-group-arn :portkey.aws.alexaforbusiness.list-skills-request/enablement-type :portkey.aws.alexaforbusiness.list-skills-request/skill-type :portkey.aws.alexaforbusiness/next-token :portkey.aws.alexaforbusiness.list-skills-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.list-device-events-response/device-events (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/device-event-list))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/list-device-events-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.list-device-events-response/device-events :portkey.aws.alexaforbusiness/next-token]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/s-3-key-prefix (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 0 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 100)) (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"[A-Za-z0-9!_\-\.\*'()/]*" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/product-description (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:[^/].{0,1023}" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.update-address-book-request/address-book-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.update-address-book-request/name (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/address-book-name))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.update-address-book-request/description (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/address-book-description))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/update-address-book-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness.update-address-book-request/address-book-arn] :opt-un [:portkey.aws.alexaforbusiness.update-address-book-request/name :portkey.aws.alexaforbusiness.update-address-book-request/description]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.start-smart-home-appliance-discovery-request/room-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/start-smart-home-appliance-discovery-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness.start-smart-home-appliance-discovery-request/room-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/create-conference-provider-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness/conference-provider-name :portkey.aws.alexaforbusiness/conference-provider-type :portkey.aws.alexaforbusiness/meeting-setting] :opt-un [:portkey.aws.alexaforbusiness/ip-dial-in :portkey.aws.alexaforbusiness/pstn-dial-in :portkey.aws.alexaforbusiness/client-request-token]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.create-profile-response/profile-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/create-profile-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.create-profile-response/profile-arn]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.skills-store-skill/supports-linking (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/boolean))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/skills-store-skill (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness/skill-id :portkey.aws.alexaforbusiness/skill-name :portkey.aws.alexaforbusiness/short-description :portkey.aws.alexaforbusiness/icon-url :portkey.aws.alexaforbusiness/sample-utterances :portkey.aws.alexaforbusiness/skill-details :portkey.aws.alexaforbusiness.skills-store-skill/supports-linking]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/skill-list-max-results (clojure.spec.alpha/int-in 1 10))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.create-user-request/user-id (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/user-user-id))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.create-user-request/first-name (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/user-first-name))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.create-user-request/last-name (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/user-last-name))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.create-user-request/tags (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/tag-list))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/create-user-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness.create-user-request/user-id] :opt-un [:portkey.aws.alexaforbusiness.create-user-request/first-name :portkey.aws.alexaforbusiness.create-user-request/last-name :portkey.aws.alexaforbusiness/email :portkey.aws.alexaforbusiness/client-request-token :portkey.aws.alexaforbusiness.create-user-request/tags]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/start-device-sync-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/endpoint (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/user-last-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 0 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 30)) (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"([A-Za-z\-' 0-9._]|\p{IsLetter})*" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.disassociate-contact-from-address-book-request/contact-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.disassociate-contact-from-address-book-request/address-book-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/disassociate-contact-from-address-book-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness.disassociate-contact-from-address-book-request/contact-arn :portkey.aws.alexaforbusiness.disassociate-contact-from-address-book-request/address-book-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/disassociate-skill-from-users-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/delete-contact-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.search-profiles-request/filters (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/filter-list))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.search-profiles-request/sort-criteria (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/sort-list))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/search-profiles-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness/next-token :portkey.aws.alexaforbusiness/max-results :portkey.aws.alexaforbusiness.search-profiles-request/filters :portkey.aws.alexaforbusiness.search-profiles-request/sort-criteria]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.create-skill-group-request/description (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/skill-group-description))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/create-skill-group-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness/skill-group-name] :opt-un [:portkey.aws.alexaforbusiness.create-skill-group-request/description :portkey.aws.alexaforbusiness/client-request-token]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/device-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 2 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 100)) (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"[\u0009\u000A\u000D\u0020-\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*" s__1467903__auto__))))

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

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/category-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.list-skills-store-skills-by-category-response/skills-store-skills (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/skills-store-skill-list))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/list-skills-store-skills-by-category-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.list-skills-store-skills-by-category-response/skills-store-skills :portkey.aws.alexaforbusiness/next-token]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/room-skill-parameter-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 512))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.contact-data/contact-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.contact-data/display-name (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/contact-name))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.contact-data/first-name (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/contact-name))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.contact-data/last-name (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/contact-name))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.contact-data/phone-number (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/e-164-phone-number))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/contact-data (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.contact-data/contact-arn :portkey.aws.alexaforbusiness.contact-data/display-name :portkey.aws.alexaforbusiness.contact-data/first-name :portkey.aws.alexaforbusiness.contact-data/last-name :portkey.aws.alexaforbusiness.contact-data/phone-number]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.business-report-content-range/interval (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/business-report-interval))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/business-report-content-range (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.business-report-content-range/interval]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.update-room-request/room-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.update-room-request/description (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/room-description))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.update-room-request/profile-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/update-room-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.update-room-request/room-arn :portkey.aws.alexaforbusiness/room-name :portkey.aws.alexaforbusiness.update-room-request/description :portkey.aws.alexaforbusiness/provider-calendar-id :portkey.aws.alexaforbusiness.update-room-request/profile-arn]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/get-skill-group-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness/skill-group]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/get-profile-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness/profile]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.delete-user-request/user-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/delete-user-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness/enrollment-id] :opt-un [:portkey.aws.alexaforbusiness.delete-user-request/user-arn]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/distance-unit #{"IMPERIAL" :imperial :metric "METRIC"})

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/developer-info (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness/developer-name :portkey.aws.alexaforbusiness/privacy-policy :portkey.aws.alexaforbusiness/email :portkey.aws.alexaforbusiness/url]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/max-results (clojure.spec.alpha/int-in 1 50))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.tag/key (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/tag-key))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.tag/value (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/tag-value))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/tag (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness.tag/key :portkey.aws.alexaforbusiness.tag/value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/business-report-format #{"CSV" :csv :csv-zip "CSV_ZIP"})

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/business-report-schedule-list (clojure.spec.alpha/coll-of :portkey.aws.alexaforbusiness/business-report-schedule))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.list-skills-response/skill-summaries (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/skill-summary-list))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/list-skills-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.list-skills-response/skill-summaries :portkey.aws.alexaforbusiness/next-token]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.list-business-report-schedules-response/business-report-schedules (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/business-report-schedule-list))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/list-business-report-schedules-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.list-business-report-schedules-response/business-report-schedules :portkey.aws.alexaforbusiness/next-token]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/skill-store-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/reviews (clojure.spec.alpha/map-of :portkey.aws.alexaforbusiness/review-key :portkey.aws.alexaforbusiness/review-value))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.create-room-request/description (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/room-description))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.create-room-request/profile-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.create-room-request/tags (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/tag-list))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/create-room-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness/room-name] :opt-un [:portkey.aws.alexaforbusiness.create-room-request/description :portkey.aws.alexaforbusiness.create-room-request/profile-arn :portkey.aws.alexaforbusiness/provider-calendar-id :portkey.aws.alexaforbusiness/client-request-token :portkey.aws.alexaforbusiness.create-room-request/tags]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/business-report-interval #{"ONE_DAY" :one-day "ONE_WEEK" :one-week})

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/business-report-download-url (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/delete-device-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/icon-url (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.room-data/room-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.room-data/description (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/room-description))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.room-data/profile-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/room-data (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.room-data/room-arn :portkey.aws.alexaforbusiness/room-name :portkey.aws.alexaforbusiness.room-data/description :portkey.aws.alexaforbusiness/provider-calendar-id :portkey.aws.alexaforbusiness.room-data/profile-arn :portkey.aws.alexaforbusiness/profile-name]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/delete-skill-group-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/device-event-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.delete-skill-authorization-request/room-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/delete-skill-authorization-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness/skill-id] :opt-un [:portkey.aws.alexaforbusiness.delete-skill-authorization-request/room-arn]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.send-invitation-request/user-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/send-invitation-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.send-invitation-request/user-arn]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/device-event-list (clojure.spec.alpha/coll-of :portkey.aws.alexaforbusiness/device-event))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.list-conference-providers-response/conference-providers (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/conference-providers-list))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/list-conference-providers-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.list-conference-providers-response/conference-providers :portkey.aws.alexaforbusiness/next-token]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/bullet-point (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.concurrent-modification-exception/message (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/error-message))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/concurrent-modification-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.concurrent-modification-exception/message]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/enablement-type #{:pending "PENDING" "ENABLED" :enabled})

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/put-conference-preference-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness/conference-preference] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.put-room-skill-parameter-request/room-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/put-room-skill-parameter-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness/skill-id :portkey.aws.alexaforbusiness/room-skill-parameter] :opt-un [:portkey.aws.alexaforbusiness.put-room-skill-parameter-request/room-arn]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/device-event-type #{"DEVICE_STATUS" :connection-status "CONNECTION_STATUS" :device-status})

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/e-164-phone-number (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"^\+\d{8,}$" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/contact-data-list (clojure.spec.alpha/coll-of :portkey.aws.alexaforbusiness/contact-data))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/bullet-points (clojure.spec.alpha/coll-of :portkey.aws.alexaforbusiness/bullet-point))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/skill-types (clojure.spec.alpha/coll-of :portkey.aws.alexaforbusiness/skill-store-type))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.update-skill-group-request/skill-group-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.update-skill-group-request/description (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/skill-group-description))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/update-skill-group-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.update-skill-group-request/skill-group-arn :portkey.aws.alexaforbusiness/skill-group-name :portkey.aws.alexaforbusiness.update-skill-group-request/description]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.list-skills-store-skills-by-category-request/max-results (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/skill-list-max-results))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/list-skills-store-skills-by-category-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness/category-id] :opt-un [:portkey.aws.alexaforbusiness/next-token :portkey.aws.alexaforbusiness.list-skills-store-skills-by-category-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.business-report/status (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/business-report-status))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.business-report/failure-code (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/business-report-failure-code))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.business-report/s-3-location (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/business-report-s-3-location))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.business-report/delivery-time (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/timestamp))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.business-report/download-url (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/business-report-download-url))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/business-report (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.business-report/status :portkey.aws.alexaforbusiness.business-report/failure-code :portkey.aws.alexaforbusiness.business-report/s-3-location :portkey.aws.alexaforbusiness.business-report/delivery-time :portkey.aws.alexaforbusiness.business-report/download-url]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/delete-business-report-schedule-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/new-in-this-version-bullet-points (clojure.spec.alpha/coll-of :portkey.aws.alexaforbusiness/bullet-point))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/product-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9_]{1,256}$" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.associate-device-with-room-request/device-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.associate-device-with-room-request/room-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/associate-device-with-room-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.associate-device-with-room-request/device-arn :portkey.aws.alexaforbusiness.associate-device-with-room-request/room-arn]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.get-contact-request/contact-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/get-contact-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness.get-contact-request/contact-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/skill-group-description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 200)) (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"[\u0009\u000A\u000D\u0020-\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.create-business-report-schedule-request/schedule-name (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/business-report-schedule-name))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.create-business-report-schedule-request/s-3-bucket-name (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/customer-s-3-bucket-name))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.create-business-report-schedule-request/format (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/business-report-format))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.create-business-report-schedule-request/content-range (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/business-report-content-range))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.create-business-report-schedule-request/recurrence (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/business-report-recurrence))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/create-business-report-schedule-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness.create-business-report-schedule-request/format :portkey.aws.alexaforbusiness.create-business-report-schedule-request/content-range] :opt-un [:portkey.aws.alexaforbusiness.create-business-report-schedule-request/schedule-name :portkey.aws.alexaforbusiness.create-business-report-schedule-request/s-3-bucket-name :portkey.aws.alexaforbusiness/s-3-key-prefix :portkey.aws.alexaforbusiness.create-business-report-schedule-request/recurrence :portkey.aws.alexaforbusiness/client-request-token]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.register-avs-device-response/device-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/register-avs-device-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.register-avs-device-response/device-arn]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/room-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 100)) (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"[\u0009\u000A\u000D\u0020-\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.device/device-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.device/room-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/device (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness/device-serial-number :portkey.aws.alexaforbusiness/software-version :portkey.aws.alexaforbusiness/device-status-info :portkey.aws.alexaforbusiness/mac-address :portkey.aws.alexaforbusiness.device/device-arn :portkey.aws.alexaforbusiness/device-type :portkey.aws.alexaforbusiness/device-status :portkey.aws.alexaforbusiness/device-name :portkey.aws.alexaforbusiness.device/room-arn]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/generic-keyword (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/associate-skill-group-with-room-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.user-data/user-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.user-data/first-name (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/user-first-name))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.user-data/last-name (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/user-last-name))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/user-data (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.user-data/user-arn :portkey.aws.alexaforbusiness.user-data/first-name :portkey.aws.alexaforbusiness.user-data/last-name :portkey.aws.alexaforbusiness/email :portkey.aws.alexaforbusiness/enrollment-status :portkey.aws.alexaforbusiness/enrollment-id]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.smart-home-appliance/friendly-name (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/appliance-friendly-name))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.smart-home-appliance/description (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/appliance-description))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.smart-home-appliance/manufacturer-name (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/appliance-manufacturer-name))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/smart-home-appliance (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.smart-home-appliance/friendly-name :portkey.aws.alexaforbusiness.smart-home-appliance/description :portkey.aws.alexaforbusiness.smart-home-appliance/manufacturer-name]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.list-smart-home-appliances-request/room-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/list-smart-home-appliances-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness.list-smart-home-appliances-request/room-arn] :opt-un [:portkey.aws.alexaforbusiness/max-results :portkey.aws.alexaforbusiness/next-token]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/list-business-report-schedules-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness/next-token :portkey.aws.alexaforbusiness/max-results]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/untag-resource-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.search-rooms-response/rooms (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/room-data-list))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/search-rooms-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.search-rooms-response/rooms :portkey.aws.alexaforbusiness/next-token :portkey.aws.alexaforbusiness/total-count]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/skill-type #{:private :public "PRIVATE" "PUBLIC"})

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.list-smart-home-appliances-response/smart-home-appliances (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/smart-home-appliance-list))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/list-smart-home-appliances-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.list-smart-home-appliances-response/smart-home-appliances :portkey.aws.alexaforbusiness/next-token]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.delete-profile-request/profile-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/delete-profile-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.delete-profile-request/profile-arn]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/end-user-license-agreement (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/filter-list (clojure.spec.alpha/coll-of :portkey.aws.alexaforbusiness/filter :max-count 25))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/skill-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"(^amzn1\.ask\.skill\.[0-9a-f\-]{1,200})|(^amzn1\.echo-sdk-ams\.app\.[0-9a-f\-]{1,200})" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/profile-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 100)) (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"[\u0009\u000A\u000D\u0020-\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/filter-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 500))))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.delete-contact-request/contact-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/delete-contact-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness.delete-contact-request/contact-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.untag-resource-request/tag-keys (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/tag-key-list))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/untag-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness/arn :portkey.aws.alexaforbusiness.untag-resource-request/tag-keys] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.skill-group-data/skill-group-arn (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/arn))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.skill-group-data/description (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/skill-group-description))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/skill-group-data (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.skill-group-data/skill-group-arn :portkey.aws.alexaforbusiness/skill-group-name :portkey.aws.alexaforbusiness.skill-group-data/description]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/invocation-phrase (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/features (clojure.spec.alpha/coll-of :portkey.aws.alexaforbusiness/feature))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/delete-conference-provider-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/smart-home-appliance-list (clojure.spec.alpha/coll-of :portkey.aws.alexaforbusiness/smart-home-appliance))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/enrollment-status #{:initialized :pending "DEREGISTERING" "PENDING" :deregistering "REGISTERED" "INITIALIZED" :disassociating :registered "DISASSOCIATING"})

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.business-report-s-3-location/path (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/business-report-s-3-path))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness.business-report-s-3-location/bucket-name (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/customer-s-3-bucket-name))
(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/business-report-s-3-location (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.alexaforbusiness.business-report-s-3-location/path :portkey.aws.alexaforbusiness.business-report-s-3-location/bucket-name]))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/meeting-setting (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness/require-pin] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/room-data-list (clojure.spec.alpha/coll-of :portkey.aws.alexaforbusiness/room-data))

(clojure.spec.alpha/def :portkey.aws.alexaforbusiness/list-tags-request (clojure.spec.alpha/keys :req-un [:portkey.aws.alexaforbusiness/arn] :opt-un [:portkey.aws.alexaforbusiness/next-token :portkey.aws.alexaforbusiness/max-results]))

(clojure.core/defn tag-resource ([tag-resource-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-tag-resource-request tag-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/tag-resource-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/tag-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "TagResource", :http.request.configuration/output-deser-fn response-tag-resource-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.alexaforbusiness/not-found-exception}})))))
(clojure.spec.alpha/fdef tag-resource :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness/tag-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/tag-resource-response))

(clojure.core/defn list-conference-providers ([] (list-conference-providers {})) ([list-conference-providers-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-list-conference-providers-request list-conference-providers-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/list-conference-providers-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/list-conference-providers-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListConferenceProviders", :http.request.configuration/output-deser-fn response-list-conference-providers-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-conference-providers :args (clojure.spec.alpha/? :portkey.aws.alexaforbusiness/list-conference-providers-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/list-conference-providers-response))

(clojure.core/defn list-device-events ([list-device-events-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-list-device-events-request list-device-events-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/list-device-events-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/list-device-events-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListDeviceEvents", :http.request.configuration/output-deser-fn response-list-device-events-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.alexaforbusiness/not-found-exception}})))))
(clojure.spec.alpha/fdef list-device-events :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness/list-device-events-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/list-device-events-response))

(clojure.core/defn associate-skill-group-with-room ([] (associate-skill-group-with-room {})) ([associate-skill-group-with-room-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-associate-skill-group-with-room-request associate-skill-group-with-room-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/associate-skill-group-with-room-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/associate-skill-group-with-room-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AssociateSkillGroupWithRoom", :http.request.configuration/output-deser-fn response-associate-skill-group-with-room-response, :http.request.spec/error-spec {"ConcurrentModificationException" :portkey.aws.alexaforbusiness/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef associate-skill-group-with-room :args (clojure.spec.alpha/? :portkey.aws.alexaforbusiness/associate-skill-group-with-room-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/associate-skill-group-with-room-response))

(clojure.core/defn disassociate-contact-from-address-book ([disassociate-contact-from-address-book-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-disassociate-contact-from-address-book-request disassociate-contact-from-address-book-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/disassociate-contact-from-address-book-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/disassociate-contact-from-address-book-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DisassociateContactFromAddressBook", :http.request.configuration/output-deser-fn response-disassociate-contact-from-address-book-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef disassociate-contact-from-address-book :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness/disassociate-contact-from-address-book-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/disassociate-contact-from-address-book-response))

(clojure.core/defn forget-smart-home-appliances ([forget-smart-home-appliances-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-forget-smart-home-appliances-request forget-smart-home-appliances-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/forget-smart-home-appliances-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/forget-smart-home-appliances-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ForgetSmartHomeAppliances", :http.request.configuration/output-deser-fn response-forget-smart-home-appliances-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.alexaforbusiness/not-found-exception}})))))
(clojure.spec.alpha/fdef forget-smart-home-appliances :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness/forget-smart-home-appliances-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/forget-smart-home-appliances-response))

(clojure.core/defn search-profiles ([] (search-profiles {})) ([search-profiles-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-search-profiles-request search-profiles-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/search-profiles-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/search-profiles-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "SearchProfiles", :http.request.configuration/output-deser-fn response-search-profiles-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef search-profiles :args (clojure.spec.alpha/? :portkey.aws.alexaforbusiness/search-profiles-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/search-profiles-response))

(clojure.core/defn get-device ([] (get-device {})) ([get-device-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-get-device-request get-device-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/get-device-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/get-device-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetDevice", :http.request.configuration/output-deser-fn response-get-device-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.alexaforbusiness/not-found-exception}})))))
(clojure.spec.alpha/fdef get-device :args (clojure.spec.alpha/? :portkey.aws.alexaforbusiness/get-device-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/get-device-response))

(clojure.core/defn create-business-report-schedule ([create-business-report-schedule-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-create-business-report-schedule-request create-business-report-schedule-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/create-business-report-schedule-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/create-business-report-schedule-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateBusinessReportSchedule", :http.request.configuration/output-deser-fn response-create-business-report-schedule-response, :http.request.spec/error-spec {"AlreadyExistsException" :portkey.aws.alexaforbusiness/already-exists-exception}})))))
(clojure.spec.alpha/fdef create-business-report-schedule :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness/create-business-report-schedule-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/create-business-report-schedule-response))

(clojure.core/defn associate-skill-with-users ([associate-skill-with-users-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-associate-skill-with-users-request associate-skill-with-users-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/associate-skill-with-users-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/associate-skill-with-users-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AssociateSkillWithUsers", :http.request.configuration/output-deser-fn response-associate-skill-with-users-response, :http.request.spec/error-spec {"ConcurrentModificationException" :portkey.aws.alexaforbusiness/concurrent-modification-exception, "NotFoundException" :portkey.aws.alexaforbusiness/not-found-exception}})))))
(clojure.spec.alpha/fdef associate-skill-with-users :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness/associate-skill-with-users-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/associate-skill-with-users-response))

(clojure.core/defn associate-contact-with-address-book ([associate-contact-with-address-book-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-associate-contact-with-address-book-request associate-contact-with-address-book-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/associate-contact-with-address-book-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/associate-contact-with-address-book-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AssociateContactWithAddressBook", :http.request.configuration/output-deser-fn response-associate-contact-with-address-book-response, :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.alexaforbusiness/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef associate-contact-with-address-book :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness/associate-contact-with-address-book-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/associate-contact-with-address-book-response))

(clojure.core/defn get-conference-preference ([] (get-conference-preference {})) ([get-conference-preference-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-get-conference-preference-request get-conference-preference-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/get-conference-preference-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/get-conference-preference-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetConferencePreference", :http.request.configuration/output-deser-fn response-get-conference-preference-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.alexaforbusiness/not-found-exception}})))))
(clojure.spec.alpha/fdef get-conference-preference :args (clojure.spec.alpha/? :portkey.aws.alexaforbusiness/get-conference-preference-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/get-conference-preference-response))

(clojure.core/defn update-address-book ([update-address-book-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-update-address-book-request update-address-book-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/update-address-book-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/update-address-book-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateAddressBook", :http.request.configuration/output-deser-fn response-update-address-book-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.alexaforbusiness/not-found-exception, "NameInUseException" :portkey.aws.alexaforbusiness/name-in-use-exception, "ConcurrentModificationException" :portkey.aws.alexaforbusiness/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef update-address-book :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness/update-address-book-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/update-address-book-response))

(clojure.core/defn put-room-skill-parameter ([put-room-skill-parameter-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-put-room-skill-parameter-request put-room-skill-parameter-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/put-room-skill-parameter-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/put-room-skill-parameter-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutRoomSkillParameter", :http.request.configuration/output-deser-fn response-put-room-skill-parameter-response, :http.request.spec/error-spec {"ConcurrentModificationException" :portkey.aws.alexaforbusiness/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef put-room-skill-parameter :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness/put-room-skill-parameter-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/put-room-skill-parameter-response))

(clojure.core/defn delete-contact ([delete-contact-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-delete-contact-request delete-contact-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/delete-contact-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/delete-contact-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteContact", :http.request.configuration/output-deser-fn response-delete-contact-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.alexaforbusiness/not-found-exception, "ConcurrentModificationException" :portkey.aws.alexaforbusiness/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef delete-contact :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness/delete-contact-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/delete-contact-response))

(clojure.core/defn delete-skill-group ([] (delete-skill-group {})) ([delete-skill-group-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-delete-skill-group-request delete-skill-group-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/delete-skill-group-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/delete-skill-group-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteSkillGroup", :http.request.configuration/output-deser-fn response-delete-skill-group-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.alexaforbusiness/not-found-exception, "ConcurrentModificationException" :portkey.aws.alexaforbusiness/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef delete-skill-group :args (clojure.spec.alpha/? :portkey.aws.alexaforbusiness/delete-skill-group-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/delete-skill-group-response))

(clojure.core/defn delete-skill-authorization ([delete-skill-authorization-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-delete-skill-authorization-request delete-skill-authorization-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/delete-skill-authorization-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/delete-skill-authorization-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteSkillAuthorization", :http.request.configuration/output-deser-fn response-delete-skill-authorization-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.alexaforbusiness/not-found-exception, "ConcurrentModificationException" :portkey.aws.alexaforbusiness/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef delete-skill-authorization :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness/delete-skill-authorization-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/delete-skill-authorization-response))

(clojure.core/defn create-address-book ([create-address-book-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-create-address-book-request create-address-book-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/create-address-book-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/create-address-book-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateAddressBook", :http.request.configuration/output-deser-fn response-create-address-book-response, :http.request.spec/error-spec {"AlreadyExistsException" :portkey.aws.alexaforbusiness/already-exists-exception, "LimitExceededException" :portkey.aws.alexaforbusiness/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-address-book :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness/create-address-book-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/create-address-book-response))

(clojure.core/defn delete-conference-provider ([delete-conference-provider-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-delete-conference-provider-request delete-conference-provider-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/delete-conference-provider-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/delete-conference-provider-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteConferenceProvider", :http.request.configuration/output-deser-fn response-delete-conference-provider-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.alexaforbusiness/not-found-exception}})))))
(clojure.spec.alpha/fdef delete-conference-provider :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness/delete-conference-provider-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/delete-conference-provider-response))

(clojure.core/defn search-address-books ([] (search-address-books {})) ([search-address-books-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-search-address-books-request search-address-books-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/search-address-books-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/search-address-books-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "SearchAddressBooks", :http.request.configuration/output-deser-fn response-search-address-books-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef search-address-books :args (clojure.spec.alpha/? :portkey.aws.alexaforbusiness/search-address-books-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/search-address-books-response))

(clojure.core/defn start-device-sync ([start-device-sync-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-start-device-sync-request start-device-sync-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/start-device-sync-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/start-device-sync-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StartDeviceSync", :http.request.configuration/output-deser-fn response-start-device-sync-response, :http.request.spec/error-spec {"DeviceNotRegisteredException" :portkey.aws.alexaforbusiness/device-not-registered-exception}})))))
(clojure.spec.alpha/fdef start-device-sync :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness/start-device-sync-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/start-device-sync-response))

(clojure.core/defn list-tags ([list-tags-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-list-tags-request list-tags-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/list-tags-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/list-tags-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListTags", :http.request.configuration/output-deser-fn response-list-tags-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.alexaforbusiness/not-found-exception}})))))
(clojure.spec.alpha/fdef list-tags :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness/list-tags-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/list-tags-response))

(clojure.core/defn create-conference-provider ([create-conference-provider-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-create-conference-provider-request create-conference-provider-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/create-conference-provider-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/create-conference-provider-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateConferenceProvider", :http.request.configuration/output-deser-fn response-create-conference-provider-response, :http.request.spec/error-spec {"AlreadyExistsException" :portkey.aws.alexaforbusiness/already-exists-exception}})))))
(clojure.spec.alpha/fdef create-conference-provider :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness/create-conference-provider-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/create-conference-provider-response))

(clojure.core/defn delete-profile ([] (delete-profile {})) ([delete-profile-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-delete-profile-request delete-profile-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/delete-profile-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/delete-profile-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteProfile", :http.request.configuration/output-deser-fn response-delete-profile-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.alexaforbusiness/not-found-exception, "ConcurrentModificationException" :portkey.aws.alexaforbusiness/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef delete-profile :args (clojure.spec.alpha/? :portkey.aws.alexaforbusiness/delete-profile-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/delete-profile-response))

(clojure.core/defn disassociate-device-from-room ([] (disassociate-device-from-room {})) ([disassociate-device-from-room-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-disassociate-device-from-room-request disassociate-device-from-room-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/disassociate-device-from-room-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/disassociate-device-from-room-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DisassociateDeviceFromRoom", :http.request.configuration/output-deser-fn response-disassociate-device-from-room-response, :http.request.spec/error-spec {"ConcurrentModificationException" :portkey.aws.alexaforbusiness/concurrent-modification-exception, "DeviceNotRegisteredException" :portkey.aws.alexaforbusiness/device-not-registered-exception}})))))
(clojure.spec.alpha/fdef disassociate-device-from-room :args (clojure.spec.alpha/? :portkey.aws.alexaforbusiness/disassociate-device-from-room-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/disassociate-device-from-room-response))

(clojure.core/defn search-devices ([] (search-devices {})) ([search-devices-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-search-devices-request search-devices-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/search-devices-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/search-devices-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "SearchDevices", :http.request.configuration/output-deser-fn response-search-devices-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef search-devices :args (clojure.spec.alpha/? :portkey.aws.alexaforbusiness/search-devices-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/search-devices-response))

(clojure.core/defn update-room ([] (update-room {})) ([update-room-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-update-room-request update-room-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/update-room-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/update-room-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateRoom", :http.request.configuration/output-deser-fn response-update-room-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.alexaforbusiness/not-found-exception, "NameInUseException" :portkey.aws.alexaforbusiness/name-in-use-exception}})))))
(clojure.spec.alpha/fdef update-room :args (clojure.spec.alpha/? :portkey.aws.alexaforbusiness/update-room-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/update-room-response))

(clojure.core/defn create-contact ([create-contact-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-create-contact-request create-contact-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/create-contact-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/create-contact-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateContact", :http.request.configuration/output-deser-fn response-create-contact-response, :http.request.spec/error-spec {"AlreadyExistsException" :portkey.aws.alexaforbusiness/already-exists-exception, "LimitExceededException" :portkey.aws.alexaforbusiness/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-contact :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness/create-contact-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/create-contact-response))

(clojure.core/defn list-smart-home-appliances ([list-smart-home-appliances-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-list-smart-home-appliances-request list-smart-home-appliances-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/list-smart-home-appliances-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/list-smart-home-appliances-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListSmartHomeAppliances", :http.request.configuration/output-deser-fn response-list-smart-home-appliances-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.alexaforbusiness/not-found-exception}})))))
(clojure.spec.alpha/fdef list-smart-home-appliances :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness/list-smart-home-appliances-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/list-smart-home-appliances-response))

(clojure.core/defn get-room-skill-parameter ([get-room-skill-parameter-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-get-room-skill-parameter-request get-room-skill-parameter-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/get-room-skill-parameter-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/get-room-skill-parameter-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetRoomSkillParameter", :http.request.configuration/output-deser-fn response-get-room-skill-parameter-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.alexaforbusiness/not-found-exception}})))))
(clojure.spec.alpha/fdef get-room-skill-parameter :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness/get-room-skill-parameter-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/get-room-skill-parameter-response))

(clojure.core/defn update-business-report-schedule ([update-business-report-schedule-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-update-business-report-schedule-request update-business-report-schedule-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/update-business-report-schedule-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/update-business-report-schedule-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateBusinessReportSchedule", :http.request.configuration/output-deser-fn response-update-business-report-schedule-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.alexaforbusiness/not-found-exception, "ConcurrentModificationException" :portkey.aws.alexaforbusiness/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef update-business-report-schedule :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness/update-business-report-schedule-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/update-business-report-schedule-response))

(clojure.core/defn get-address-book ([get-address-book-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-get-address-book-request get-address-book-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/get-address-book-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/get-address-book-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetAddressBook", :http.request.configuration/output-deser-fn response-get-address-book-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.alexaforbusiness/not-found-exception}})))))
(clojure.spec.alpha/fdef get-address-book :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness/get-address-book-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/get-address-book-response))

(clojure.core/defn put-invitation-configuration ([put-invitation-configuration-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-put-invitation-configuration-request put-invitation-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/put-invitation-configuration-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/put-invitation-configuration-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutInvitationConfiguration", :http.request.configuration/output-deser-fn response-put-invitation-configuration-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.alexaforbusiness/not-found-exception, "ConcurrentModificationException" :portkey.aws.alexaforbusiness/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef put-invitation-configuration :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness/put-invitation-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/put-invitation-configuration-response))

(clojure.core/defn list-skills ([] (list-skills {})) ([list-skills-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-list-skills-request list-skills-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/list-skills-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/list-skills-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListSkills", :http.request.configuration/output-deser-fn response-list-skills-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-skills :args (clojure.spec.alpha/? :portkey.aws.alexaforbusiness/list-skills-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/list-skills-response))

(clojure.core/defn delete-user ([delete-user-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-delete-user-request delete-user-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/delete-user-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/delete-user-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteUser", :http.request.configuration/output-deser-fn response-delete-user-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.alexaforbusiness/not-found-exception, "ConcurrentModificationException" :portkey.aws.alexaforbusiness/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef delete-user :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness/delete-user-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/delete-user-response))

(clojure.core/defn register-avs-device ([register-avs-device-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-register-avs-device-request register-avs-device-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/register-avs-device-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/register-avs-device-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "RegisterAVSDevice", :http.request.configuration/output-deser-fn response-register-avs-device-response, :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.alexaforbusiness/limit-exceeded-exception, "ConcurrentModificationException" :portkey.aws.alexaforbusiness/concurrent-modification-exception, "InvalidDeviceException" :portkey.aws.alexaforbusiness/invalid-device-exception}})))))
(clojure.spec.alpha/fdef register-avs-device :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness/register-avs-device-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/register-avs-device-response))

(clojure.core/defn create-user ([create-user-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-create-user-request create-user-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/create-user-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/create-user-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateUser", :http.request.configuration/output-deser-fn response-create-user-response, :http.request.spec/error-spec {"ResourceInUseException" :portkey.aws.alexaforbusiness/resource-in-use-exception, "LimitExceededException" :portkey.aws.alexaforbusiness/limit-exceeded-exception, "ConcurrentModificationException" :portkey.aws.alexaforbusiness/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef create-user :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness/create-user-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/create-user-response))

(clojure.core/defn put-conference-preference ([put-conference-preference-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-put-conference-preference-request put-conference-preference-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/put-conference-preference-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/put-conference-preference-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutConferencePreference", :http.request.configuration/output-deser-fn response-put-conference-preference-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.alexaforbusiness/not-found-exception}})))))
(clojure.spec.alpha/fdef put-conference-preference :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness/put-conference-preference-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/put-conference-preference-response))

(clojure.core/defn get-contact ([get-contact-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-get-contact-request get-contact-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/get-contact-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/get-contact-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetContact", :http.request.configuration/output-deser-fn response-get-contact-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.alexaforbusiness/not-found-exception}})))))
(clojure.spec.alpha/fdef get-contact :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness/get-contact-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/get-contact-response))

(clojure.core/defn delete-device ([delete-device-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-delete-device-request delete-device-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/delete-device-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/delete-device-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteDevice", :http.request.configuration/output-deser-fn response-delete-device-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.alexaforbusiness/not-found-exception, "ConcurrentModificationException" :portkey.aws.alexaforbusiness/concurrent-modification-exception, "InvalidCertificateAuthorityException" :portkey.aws.alexaforbusiness/invalid-certificate-authority-exception}})))))
(clojure.spec.alpha/fdef delete-device :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness/delete-device-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/delete-device-response))

(clojure.core/defn disassociate-skill-from-skill-group ([disassociate-skill-from-skill-group-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-disassociate-skill-from-skill-group-request disassociate-skill-from-skill-group-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/disassociate-skill-from-skill-group-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/disassociate-skill-from-skill-group-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DisassociateSkillFromSkillGroup", :http.request.configuration/output-deser-fn response-disassociate-skill-from-skill-group-response, :http.request.spec/error-spec {"ConcurrentModificationException" :portkey.aws.alexaforbusiness/concurrent-modification-exception, "NotFoundException" :portkey.aws.alexaforbusiness/not-found-exception}})))))
(clojure.spec.alpha/fdef disassociate-skill-from-skill-group :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness/disassociate-skill-from-skill-group-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/disassociate-skill-from-skill-group-response))

(clojure.core/defn put-skill-authorization ([put-skill-authorization-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-put-skill-authorization-request put-skill-authorization-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/put-skill-authorization-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/put-skill-authorization-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutSkillAuthorization", :http.request.configuration/output-deser-fn response-put-skill-authorization-response, :http.request.spec/error-spec {"UnauthorizedException" :portkey.aws.alexaforbusiness/unauthorized-exception, "ConcurrentModificationException" :portkey.aws.alexaforbusiness/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef put-skill-authorization :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness/put-skill-authorization-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/put-skill-authorization-response))

(clojure.core/defn delete-room ([] (delete-room {})) ([delete-room-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-delete-room-request delete-room-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/delete-room-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/delete-room-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteRoom", :http.request.configuration/output-deser-fn response-delete-room-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.alexaforbusiness/not-found-exception, "ConcurrentModificationException" :portkey.aws.alexaforbusiness/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef delete-room :args (clojure.spec.alpha/? :portkey.aws.alexaforbusiness/delete-room-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/delete-room-response))

(clojure.core/defn delete-address-book ([delete-address-book-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-delete-address-book-request delete-address-book-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/delete-address-book-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/delete-address-book-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteAddressBook", :http.request.configuration/output-deser-fn response-delete-address-book-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.alexaforbusiness/not-found-exception, "ConcurrentModificationException" :portkey.aws.alexaforbusiness/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef delete-address-book :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness/delete-address-book-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/delete-address-book-response))

(clojure.core/defn search-rooms ([] (search-rooms {})) ([search-rooms-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-search-rooms-request search-rooms-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/search-rooms-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/search-rooms-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "SearchRooms", :http.request.configuration/output-deser-fn response-search-rooms-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef search-rooms :args (clojure.spec.alpha/? :portkey.aws.alexaforbusiness/search-rooms-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/search-rooms-response))

(clojure.core/defn send-invitation ([] (send-invitation {})) ([send-invitation-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-send-invitation-request send-invitation-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/send-invitation-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/send-invitation-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "SendInvitation", :http.request.configuration/output-deser-fn response-send-invitation-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.alexaforbusiness/not-found-exception, "InvalidUserStatusException" :portkey.aws.alexaforbusiness/invalid-user-status-exception, "ConcurrentModificationException" :portkey.aws.alexaforbusiness/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef send-invitation :args (clojure.spec.alpha/? :portkey.aws.alexaforbusiness/send-invitation-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/send-invitation-response))

(clojure.core/defn resolve-room ([resolve-room-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-resolve-room-request resolve-room-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/resolve-room-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/resolve-room-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ResolveRoom", :http.request.configuration/output-deser-fn response-resolve-room-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.alexaforbusiness/not-found-exception}})))))
(clojure.spec.alpha/fdef resolve-room :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness/resolve-room-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/resolve-room-response))

(clojure.core/defn get-room ([] (get-room {})) ([get-room-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-get-room-request get-room-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/get-room-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/get-room-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetRoom", :http.request.configuration/output-deser-fn response-get-room-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.alexaforbusiness/not-found-exception}})))))
(clojure.spec.alpha/fdef get-room :args (clojure.spec.alpha/? :portkey.aws.alexaforbusiness/get-room-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/get-room-response))

(clojure.core/defn delete-business-report-schedule ([delete-business-report-schedule-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-delete-business-report-schedule-request delete-business-report-schedule-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/delete-business-report-schedule-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/delete-business-report-schedule-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteBusinessReportSchedule", :http.request.configuration/output-deser-fn response-delete-business-report-schedule-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.alexaforbusiness/not-found-exception, "ConcurrentModificationException" :portkey.aws.alexaforbusiness/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef delete-business-report-schedule :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness/delete-business-report-schedule-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/delete-business-report-schedule-response))

(clojure.core/defn update-conference-provider ([update-conference-provider-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-update-conference-provider-request update-conference-provider-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/update-conference-provider-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/update-conference-provider-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateConferenceProvider", :http.request.configuration/output-deser-fn response-update-conference-provider-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.alexaforbusiness/not-found-exception}})))))
(clojure.spec.alpha/fdef update-conference-provider :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness/update-conference-provider-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/update-conference-provider-response))

(clojure.core/defn reject-skill ([reject-skill-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-reject-skill-request reject-skill-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/reject-skill-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/reject-skill-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "RejectSkill", :http.request.configuration/output-deser-fn response-reject-skill-response, :http.request.spec/error-spec {"ConcurrentModificationException" :portkey.aws.alexaforbusiness/concurrent-modification-exception, "NotFoundException" :portkey.aws.alexaforbusiness/not-found-exception}})))))
(clojure.spec.alpha/fdef reject-skill :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness/reject-skill-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/reject-skill-response))

(clojure.core/defn search-skill-groups ([] (search-skill-groups {})) ([search-skill-groups-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-search-skill-groups-request search-skill-groups-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/search-skill-groups-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/search-skill-groups-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "SearchSkillGroups", :http.request.configuration/output-deser-fn response-search-skill-groups-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef search-skill-groups :args (clojure.spec.alpha/? :portkey.aws.alexaforbusiness/search-skill-groups-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/search-skill-groups-response))

(clojure.core/defn start-smart-home-appliance-discovery ([start-smart-home-appliance-discovery-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-start-smart-home-appliance-discovery-request start-smart-home-appliance-discovery-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/start-smart-home-appliance-discovery-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/start-smart-home-appliance-discovery-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StartSmartHomeApplianceDiscovery", :http.request.configuration/output-deser-fn response-start-smart-home-appliance-discovery-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.alexaforbusiness/not-found-exception}})))))
(clojure.spec.alpha/fdef start-smart-home-appliance-discovery :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness/start-smart-home-appliance-discovery-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/start-smart-home-appliance-discovery-response))

(clojure.core/defn list-skills-store-categories ([] (list-skills-store-categories {})) ([list-skills-store-categories-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-list-skills-store-categories-request list-skills-store-categories-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/list-skills-store-categories-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/list-skills-store-categories-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListSkillsStoreCategories", :http.request.configuration/output-deser-fn response-list-skills-store-categories-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-skills-store-categories :args (clojure.spec.alpha/? :portkey.aws.alexaforbusiness/list-skills-store-categories-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/list-skills-store-categories-response))

(clojure.core/defn update-profile ([] (update-profile {})) ([update-profile-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-update-profile-request update-profile-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/update-profile-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/update-profile-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateProfile", :http.request.configuration/output-deser-fn response-update-profile-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.alexaforbusiness/not-found-exception, "NameInUseException" :portkey.aws.alexaforbusiness/name-in-use-exception, "ConcurrentModificationException" :portkey.aws.alexaforbusiness/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef update-profile :args (clojure.spec.alpha/? :portkey.aws.alexaforbusiness/update-profile-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/update-profile-response))

(clojure.core/defn get-invitation-configuration ([] (get-invitation-configuration {})) ([get-invitation-configuration-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-get-invitation-configuration-request get-invitation-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/get-invitation-configuration-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/get-invitation-configuration-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetInvitationConfiguration", :http.request.configuration/output-deser-fn response-get-invitation-configuration-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.alexaforbusiness/not-found-exception}})))))
(clojure.spec.alpha/fdef get-invitation-configuration :args (clojure.spec.alpha/? :portkey.aws.alexaforbusiness/get-invitation-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/get-invitation-configuration-response))

(clojure.core/defn search-users ([] (search-users {})) ([search-users-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-search-users-request search-users-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/search-users-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/search-users-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "SearchUsers", :http.request.configuration/output-deser-fn response-search-users-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef search-users :args (clojure.spec.alpha/? :portkey.aws.alexaforbusiness/search-users-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/search-users-response))

(clojure.core/defn update-skill-group ([] (update-skill-group {})) ([update-skill-group-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-update-skill-group-request update-skill-group-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/update-skill-group-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/update-skill-group-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateSkillGroup", :http.request.configuration/output-deser-fn response-update-skill-group-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.alexaforbusiness/not-found-exception, "NameInUseException" :portkey.aws.alexaforbusiness/name-in-use-exception, "ConcurrentModificationException" :portkey.aws.alexaforbusiness/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef update-skill-group :args (clojure.spec.alpha/? :portkey.aws.alexaforbusiness/update-skill-group-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/update-skill-group-response))

(clojure.core/defn search-contacts ([] (search-contacts {})) ([search-contacts-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-search-contacts-request search-contacts-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/search-contacts-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/search-contacts-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "SearchContacts", :http.request.configuration/output-deser-fn response-search-contacts-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef search-contacts :args (clojure.spec.alpha/? :portkey.aws.alexaforbusiness/search-contacts-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/search-contacts-response))

(clojure.core/defn untag-resource ([untag-resource-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-untag-resource-request untag-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/untag-resource-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/untag-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UntagResource", :http.request.configuration/output-deser-fn response-untag-resource-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.alexaforbusiness/not-found-exception}})))))
(clojure.spec.alpha/fdef untag-resource :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness/untag-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/untag-resource-response))

(clojure.core/defn associate-skill-with-skill-group ([associate-skill-with-skill-group-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-associate-skill-with-skill-group-request associate-skill-with-skill-group-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/associate-skill-with-skill-group-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/associate-skill-with-skill-group-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AssociateSkillWithSkillGroup", :http.request.configuration/output-deser-fn response-associate-skill-with-skill-group-response, :http.request.spec/error-spec {"ConcurrentModificationException" :portkey.aws.alexaforbusiness/concurrent-modification-exception, "NotFoundException" :portkey.aws.alexaforbusiness/not-found-exception, "SkillNotLinkedException" :portkey.aws.alexaforbusiness/skill-not-linked-exception}})))))
(clojure.spec.alpha/fdef associate-skill-with-skill-group :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness/associate-skill-with-skill-group-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/associate-skill-with-skill-group-response))

(clojure.core/defn create-skill-group ([create-skill-group-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-create-skill-group-request create-skill-group-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/create-skill-group-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/create-skill-group-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateSkillGroup", :http.request.configuration/output-deser-fn response-create-skill-group-response, :http.request.spec/error-spec {"AlreadyExistsException" :portkey.aws.alexaforbusiness/already-exists-exception, "LimitExceededException" :portkey.aws.alexaforbusiness/limit-exceeded-exception, "ConcurrentModificationException" :portkey.aws.alexaforbusiness/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef create-skill-group :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness/create-skill-group-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/create-skill-group-response))

(clojure.core/defn revoke-invitation ([] (revoke-invitation {})) ([revoke-invitation-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-revoke-invitation-request revoke-invitation-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/revoke-invitation-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/revoke-invitation-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "RevokeInvitation", :http.request.configuration/output-deser-fn response-revoke-invitation-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.alexaforbusiness/not-found-exception, "ConcurrentModificationException" :portkey.aws.alexaforbusiness/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef revoke-invitation :args (clojure.spec.alpha/? :portkey.aws.alexaforbusiness/revoke-invitation-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/revoke-invitation-response))

(clojure.core/defn delete-room-skill-parameter ([delete-room-skill-parameter-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-delete-room-skill-parameter-request delete-room-skill-parameter-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/delete-room-skill-parameter-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/delete-room-skill-parameter-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteRoomSkillParameter", :http.request.configuration/output-deser-fn response-delete-room-skill-parameter-response, :http.request.spec/error-spec {"ConcurrentModificationException" :portkey.aws.alexaforbusiness/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef delete-room-skill-parameter :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness/delete-room-skill-parameter-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/delete-room-skill-parameter-response))

(clojure.core/defn update-device ([] (update-device {})) ([update-device-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-update-device-request update-device-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/update-device-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/update-device-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateDevice", :http.request.configuration/output-deser-fn response-update-device-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.alexaforbusiness/not-found-exception, "ConcurrentModificationException" :portkey.aws.alexaforbusiness/concurrent-modification-exception, "DeviceNotRegisteredException" :portkey.aws.alexaforbusiness/device-not-registered-exception}})))))
(clojure.spec.alpha/fdef update-device :args (clojure.spec.alpha/? :portkey.aws.alexaforbusiness/update-device-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/update-device-response))

(clojure.core/defn list-business-report-schedules ([] (list-business-report-schedules {})) ([list-business-report-schedules-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-list-business-report-schedules-request list-business-report-schedules-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/list-business-report-schedules-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/list-business-report-schedules-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListBusinessReportSchedules", :http.request.configuration/output-deser-fn response-list-business-report-schedules-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-business-report-schedules :args (clojure.spec.alpha/? :portkey.aws.alexaforbusiness/list-business-report-schedules-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/list-business-report-schedules-response))

(clojure.core/defn associate-device-with-room ([] (associate-device-with-room {})) ([associate-device-with-room-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-associate-device-with-room-request associate-device-with-room-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/associate-device-with-room-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/associate-device-with-room-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AssociateDeviceWithRoom", :http.request.configuration/output-deser-fn response-associate-device-with-room-response, :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.alexaforbusiness/limit-exceeded-exception, "ConcurrentModificationException" :portkey.aws.alexaforbusiness/concurrent-modification-exception, "DeviceNotRegisteredException" :portkey.aws.alexaforbusiness/device-not-registered-exception}})))))
(clojure.spec.alpha/fdef associate-device-with-room :args (clojure.spec.alpha/? :portkey.aws.alexaforbusiness/associate-device-with-room-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/associate-device-with-room-response))

(clojure.core/defn create-room ([create-room-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-create-room-request create-room-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/create-room-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/create-room-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateRoom", :http.request.configuration/output-deser-fn response-create-room-response, :http.request.spec/error-spec {"AlreadyExistsException" :portkey.aws.alexaforbusiness/already-exists-exception, "LimitExceededException" :portkey.aws.alexaforbusiness/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-room :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness/create-room-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/create-room-response))

(clojure.core/defn get-conference-provider ([get-conference-provider-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-get-conference-provider-request get-conference-provider-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/get-conference-provider-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/get-conference-provider-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetConferenceProvider", :http.request.configuration/output-deser-fn response-get-conference-provider-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.alexaforbusiness/not-found-exception}})))))
(clojure.spec.alpha/fdef get-conference-provider :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness/get-conference-provider-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/get-conference-provider-response))

(clojure.core/defn list-skills-store-skills-by-category ([list-skills-store-skills-by-category-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-list-skills-store-skills-by-category-request list-skills-store-skills-by-category-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/list-skills-store-skills-by-category-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/list-skills-store-skills-by-category-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListSkillsStoreSkillsByCategory", :http.request.configuration/output-deser-fn response-list-skills-store-skills-by-category-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-skills-store-skills-by-category :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness/list-skills-store-skills-by-category-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/list-skills-store-skills-by-category-response))

(clojure.core/defn disassociate-skill-from-users ([disassociate-skill-from-users-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-disassociate-skill-from-users-request disassociate-skill-from-users-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/disassociate-skill-from-users-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/disassociate-skill-from-users-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DisassociateSkillFromUsers", :http.request.configuration/output-deser-fn response-disassociate-skill-from-users-response, :http.request.spec/error-spec {"ConcurrentModificationException" :portkey.aws.alexaforbusiness/concurrent-modification-exception, "NotFoundException" :portkey.aws.alexaforbusiness/not-found-exception}})))))
(clojure.spec.alpha/fdef disassociate-skill-from-users :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness/disassociate-skill-from-users-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/disassociate-skill-from-users-response))

(clojure.core/defn update-contact ([update-contact-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-update-contact-request update-contact-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/update-contact-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/update-contact-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateContact", :http.request.configuration/output-deser-fn response-update-contact-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.alexaforbusiness/not-found-exception, "ConcurrentModificationException" :portkey.aws.alexaforbusiness/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef update-contact :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness/update-contact-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/update-contact-response))

(clojure.core/defn approve-skill ([approve-skill-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-approve-skill-request approve-skill-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/approve-skill-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/approve-skill-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ApproveSkill", :http.request.configuration/output-deser-fn response-approve-skill-response, :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.alexaforbusiness/limit-exceeded-exception, "NotFoundException" :portkey.aws.alexaforbusiness/not-found-exception, "ConcurrentModificationException" :portkey.aws.alexaforbusiness/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef approve-skill :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness/approve-skill-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/approve-skill-response))

(clojure.core/defn disassociate-skill-group-from-room ([] (disassociate-skill-group-from-room {})) ([disassociate-skill-group-from-room-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-disassociate-skill-group-from-room-request disassociate-skill-group-from-room-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/disassociate-skill-group-from-room-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/disassociate-skill-group-from-room-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DisassociateSkillGroupFromRoom", :http.request.configuration/output-deser-fn response-disassociate-skill-group-from-room-response, :http.request.spec/error-spec {"ConcurrentModificationException" :portkey.aws.alexaforbusiness/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef disassociate-skill-group-from-room :args (clojure.spec.alpha/? :portkey.aws.alexaforbusiness/disassociate-skill-group-from-room-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/disassociate-skill-group-from-room-response))

(clojure.core/defn get-skill-group ([] (get-skill-group {})) ([get-skill-group-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-get-skill-group-request get-skill-group-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/get-skill-group-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/get-skill-group-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetSkillGroup", :http.request.configuration/output-deser-fn response-get-skill-group-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.alexaforbusiness/not-found-exception}})))))
(clojure.spec.alpha/fdef get-skill-group :args (clojure.spec.alpha/? :portkey.aws.alexaforbusiness/get-skill-group-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/get-skill-group-response))

(clojure.core/defn get-profile ([] (get-profile {})) ([get-profile-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-get-profile-request get-profile-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/get-profile-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/get-profile-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetProfile", :http.request.configuration/output-deser-fn response-get-profile-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.alexaforbusiness/not-found-exception}})))))
(clojure.spec.alpha/fdef get-profile :args (clojure.spec.alpha/? :portkey.aws.alexaforbusiness/get-profile-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/get-profile-response))

(clojure.core/defn create-profile ([create-profile-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-create-profile-request create-profile-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.alexaforbusiness/endpoints, :http.request.configuration/target-prefix "AlexaForBusiness", :http.request.spec/output-spec :portkey.aws.alexaforbusiness/create-profile-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-09", :http.request.configuration/service-id "Alexa For Business", :http.request.spec/input-spec :portkey.aws.alexaforbusiness/create-profile-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateProfile", :http.request.configuration/output-deser-fn response-create-profile-response, :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.alexaforbusiness/limit-exceeded-exception, "AlreadyExistsException" :portkey.aws.alexaforbusiness/already-exists-exception, "ConcurrentModificationException" :portkey.aws.alexaforbusiness/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef create-profile :args (clojure.spec.alpha/tuple :portkey.aws.alexaforbusiness/create-profile-request) :ret (clojure.spec.alpha/and :portkey.aws.alexaforbusiness/create-profile-response))
