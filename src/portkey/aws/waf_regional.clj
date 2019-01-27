(ns portkey.aws.waf-regional (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope
    {:service "waf-regional", :region "ap-northeast-1"},
    :ssl-common-name "waf-regional.ap-northeast-1.amazonaws.com",
    :endpoint "https://waf-regional.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "waf-regional", :region "eu-west-1"},
    :ssl-common-name "waf-regional.eu-west-1.amazonaws.com",
    :endpoint "https://waf-regional.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "waf-regional", :region "us-east-2"},
    :ssl-common-name "waf-regional.us-east-2.amazonaws.com",
    :endpoint "https://waf-regional.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope
    {:service "waf-regional", :region "ap-southeast-2"},
    :ssl-common-name "waf-regional.ap-southeast-2.amazonaws.com",
    :endpoint "https://waf-regional.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope
    {:service "waf-regional", :region "eu-central-1"},
    :ssl-common-name "waf-regional.eu-central-1.amazonaws.com",
    :endpoint "https://waf-regional.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "waf-regional", :region "us-west-2"},
    :ssl-common-name "waf-regional.us-west-2.amazonaws.com",
    :endpoint "https://waf-regional.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "waf-regional", :region "us-east-1"},
    :ssl-common-name "waf-regional.us-east-1.amazonaws.com",
    :endpoint "https://waf-regional.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "waf-regional", :region "us-west-1"},
    :ssl-common-name "waf-regional.us-west-1.amazonaws.com",
    :endpoint "https://waf-regional.us-west-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-change-token)

(clojure.core/declare ser-rule-updates)

(clojure.core/declare ser-positional-constraint)

(clojure.core/declare ser-text-transformation)

(clojure.core/declare ser-geo-match-constraint-type)

(clojure.core/declare ser-rule-priority)

(clojure.core/declare ser-byte-match-tuple)

(clojure.core/declare ser-waf-action-type)

(clojure.core/declare ser-geo-match-constraint)

(clojure.core/declare ser-field-to-match)

(clojure.core/declare ser-waf-override-action)

(clojure.core/declare ser-size-constraint)

(clojure.core/declare ser-ip-set-update)

(clojure.core/declare ser-rate-key)

(clojure.core/declare ser-change-action)

(clojure.core/declare ser-ip-set-descriptor-value)

(clojure.core/declare ser-comparison-operator)

(clojure.core/declare ser-regex-pattern-string)

(clojure.core/declare ser-sql-injection-match-set-updates)

(clojure.core/declare ser-web-acl-updates)

(clojure.core/declare ser-byte-match-set-update)

(clojure.core/declare ser-sql-injection-match-tuple)

(clojure.core/declare ser-ip-set-descriptor-type)

(clojure.core/declare ser-time-window)

(clojure.core/declare ser-policy-string)

(clojure.core/declare ser-redacted-fields)

(clojure.core/declare ser-pagination-limit)

(clojure.core/declare ser-rule-group-update)

(clojure.core/declare ser-resource-id)

(clojure.core/declare ser-log-destination-configs)

(clojure.core/declare ser-rule-update)

(clojure.core/declare ser-xss-match-tuple)

(clojure.core/declare ser-byte-match-set-updates)

(clojure.core/declare ser-waf-action)

(clojure.core/declare ser-regex-pattern-set-updates)

(clojure.core/declare ser-ip-set-descriptor)

(clojure.core/declare ser-size-constraint-set-update)

(clojure.core/declare ser-xss-match-set-update)

(clojure.core/declare ser-regex-match-set-updates)

(clojure.core/declare ser-resource-name)

(clojure.core/declare ser-size)

(clojure.core/declare ser-ip-set-updates)

(clojure.core/declare ser-geo-match-constraint-value)

(clojure.core/declare ser-match-field-type)

(clojure.core/declare ser-regex-match-set-update)

(clojure.core/declare ser-rule-group-updates)

(clojure.core/declare ser-match-field-data)

(clojure.core/declare ser-next-marker)

(clojure.core/declare ser-xss-match-set-updates)

(clojure.core/declare ser-logging-configuration)

(clojure.core/declare ser-size-constraint-set-updates)

(clojure.core/declare ser-timestamp)

(clojure.core/declare ser-resource-arn)

(clojure.core/declare ser-metric-name)

(clojure.core/declare ser-waf-rule-type)

(clojure.core/declare ser-sql-injection-match-set-update)

(clojure.core/declare ser-predicate-type)

(clojure.core/declare ser-geo-match-set-updates)

(clojure.core/declare ser-regex-match-tuple)

(clojure.core/declare ser-predicate)

(clojure.core/declare ser-activated-rule)

(clojure.core/declare ser-geo-match-set-update)

(clojure.core/declare ser-web-acl-update)

(clojure.core/declare ser-byte-match-target-string)

(clojure.core/declare ser-regex-pattern-set-update)

(clojure.core/declare ser-waf-override-action-type)

(clojure.core/declare ser-rate-limit)

(clojure.core/declare ser-negated)

(clojure.core/declare ser-get-sampled-requests-max-items)

(clojure.core/defn- ser-change-token [input] #:http.request.field{:value input, :shape "ChangeToken"})

(clojure.core/defn- ser-rule-updates [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-rule-update coll) #:http.request.field{:shape "RuleUpdate"}))) input), :shape "RuleUpdates", :type "list"})

(clojure.core/defn- ser-positional-constraint [input] #:http.request.field{:value (clojure.core/get {:starts-with "STARTS_WITH", :exactly "EXACTLY", :contains "CONTAINS", "CONTAINS" "CONTAINS", "EXACTLY" "EXACTLY", :contains-word "CONTAINS_WORD", "CONTAINS_WORD" "CONTAINS_WORD", "ENDS_WITH" "ENDS_WITH", "STARTS_WITH" "STARTS_WITH", :ends-with "ENDS_WITH"} input), :shape "PositionalConstraint"})

(clojure.core/defn- ser-text-transformation [input] #:http.request.field{:value (clojure.core/get {"HTML_ENTITY_DECODE" "HTML_ENTITY_DECODE", :compress-white-space "COMPRESS_WHITE_SPACE", :lowercase "LOWERCASE", "URL_DECODE" "URL_DECODE", "LOWERCASE" "LOWERCASE", "NONE" "NONE", :html-entity-decode "HTML_ENTITY_DECODE", "COMPRESS_WHITE_SPACE" "COMPRESS_WHITE_SPACE", "CMD_LINE" "CMD_LINE", :url-decode "URL_DECODE", :cmd-line "CMD_LINE", :none "NONE"} input), :shape "TextTransformation"})

(clojure.core/defn- ser-geo-match-constraint-type [input] #:http.request.field{:value (clojure.core/get {"Country" "Country", :country "Country"} input), :shape "GeoMatchConstraintType"})

(clojure.core/defn- ser-rule-priority [input] #:http.request.field{:value input, :shape "RulePriority"})

(clojure.core/defn- ser-byte-match-tuple [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-field-to-match (:field-to-match input)) #:http.request.field{:name "FieldToMatch", :shape "FieldToMatch"}) (clojure.core/into (ser-byte-match-target-string (:target-string input)) #:http.request.field{:name "TargetString", :shape "ByteMatchTargetString"}) (clojure.core/into (ser-text-transformation (:text-transformation input)) #:http.request.field{:name "TextTransformation", :shape "TextTransformation"}) (clojure.core/into (ser-positional-constraint (:positional-constraint input)) #:http.request.field{:name "PositionalConstraint", :shape "PositionalConstraint"})], :shape "ByteMatchTuple", :type "structure"}))

(clojure.core/defn- ser-waf-action-type [input] #:http.request.field{:value (clojure.core/get {"BLOCK" "BLOCK", :block "BLOCK", "ALLOW" "ALLOW", :allow "ALLOW", "COUNT" "COUNT", :count "COUNT"} input), :shape "WafActionType"})

(clojure.core/defn- ser-geo-match-constraint [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-geo-match-constraint-type (:type input)) #:http.request.field{:name "Type", :shape "GeoMatchConstraintType"}) (clojure.core/into (ser-geo-match-constraint-value (:value input)) #:http.request.field{:name "Value", :shape "GeoMatchConstraintValue"})], :shape "GeoMatchConstraint", :type "structure"}))

(clojure.core/defn- ser-field-to-match [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-match-field-type (:type input)) #:http.request.field{:name "Type", :shape "MatchFieldType"})], :shape "FieldToMatch", :type "structure"} (clojure.core/contains? input :data) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-match-field-data (input :data)) #:http.request.field{:name "Data", :shape "MatchFieldData"}))))

(clojure.core/defn- ser-waf-override-action [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-waf-override-action-type (:type input)) #:http.request.field{:name "Type", :shape "WafOverrideActionType"})], :shape "WafOverrideAction", :type "structure"}))

(clojure.core/defn- ser-size-constraint [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-field-to-match (:field-to-match input)) #:http.request.field{:name "FieldToMatch", :shape "FieldToMatch"}) (clojure.core/into (ser-text-transformation (:text-transformation input)) #:http.request.field{:name "TextTransformation", :shape "TextTransformation"}) (clojure.core/into (ser-comparison-operator (:comparison-operator input)) #:http.request.field{:name "ComparisonOperator", :shape "ComparisonOperator"}) (clojure.core/into (ser-size (:size input)) #:http.request.field{:name "Size", :shape "Size"})], :shape "SizeConstraint", :type "structure"}))

(clojure.core/defn- ser-ip-set-update [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-change-action (:action input)) #:http.request.field{:name "Action", :shape "ChangeAction"}) (clojure.core/into (ser-ip-set-descriptor (:ip-set-descriptor input)) #:http.request.field{:name "IPSetDescriptor", :shape "IPSetDescriptor"})], :shape "IPSetUpdate", :type "structure"}))

(clojure.core/defn- ser-rate-key [input] #:http.request.field{:value (clojure.core/get {"IP" "IP", :ip "IP"} input), :shape "RateKey"})

(clojure.core/defn- ser-change-action [input] #:http.request.field{:value (clojure.core/get {"INSERT" "INSERT", :insert "INSERT", "DELETE" "DELETE", :delete "DELETE"} input), :shape "ChangeAction"})

(clojure.core/defn- ser-ip-set-descriptor-value [input] #:http.request.field{:value input, :shape "IPSetDescriptorValue"})

(clojure.core/defn- ser-comparison-operator [input] #:http.request.field{:value (clojure.core/get {:ge "GE", :eq "EQ", "NE" "NE", "LT" "LT", "GE" "GE", "LE" "LE", :gt "GT", "EQ" "EQ", :ne "NE", "GT" "GT", :le "LE", :lt "LT"} input), :shape "ComparisonOperator"})

(clojure.core/defn- ser-regex-pattern-string [input] #:http.request.field{:value input, :shape "RegexPatternString"})

(clojure.core/defn- ser-sql-injection-match-set-updates [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-sql-injection-match-set-update coll) #:http.request.field{:shape "SqlInjectionMatchSetUpdate"}))) input), :shape "SqlInjectionMatchSetUpdates", :type "list", :min 1})

(clojure.core/defn- ser-web-acl-updates [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-web-acl-update coll) #:http.request.field{:shape "WebACLUpdate"}))) input), :shape "WebACLUpdates", :type "list"})

(clojure.core/defn- ser-byte-match-set-update [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-change-action (:action input)) #:http.request.field{:name "Action", :shape "ChangeAction"}) (clojure.core/into (ser-byte-match-tuple (:byte-match-tuple input)) #:http.request.field{:name "ByteMatchTuple", :shape "ByteMatchTuple"})], :shape "ByteMatchSetUpdate", :type "structure"}))

(clojure.core/defn- ser-sql-injection-match-tuple [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-field-to-match (:field-to-match input)) #:http.request.field{:name "FieldToMatch", :shape "FieldToMatch"}) (clojure.core/into (ser-text-transformation (:text-transformation input)) #:http.request.field{:name "TextTransformation", :shape "TextTransformation"})], :shape "SqlInjectionMatchTuple", :type "structure"}))

(clojure.core/defn- ser-ip-set-descriptor-type [input] #:http.request.field{:value (clojure.core/get {"IPV4" "IPV4", :ipv-4 "IPV4", "IPV6" "IPV6", :ipv-6 "IPV6"} input), :shape "IPSetDescriptorType"})

(clojure.core/defn- ser-time-window [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-timestamp (:start-time input)) #:http.request.field{:name "StartTime", :shape "Timestamp"}) (clojure.core/into (ser-timestamp (:end-time input)) #:http.request.field{:name "EndTime", :shape "Timestamp"})], :shape "TimeWindow", :type "structure"}))

(clojure.core/defn- ser-policy-string [input] #:http.request.field{:value input, :shape "PolicyString"})

(clojure.core/defn- ser-redacted-fields [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-field-to-match coll) #:http.request.field{:shape "FieldToMatch"}))) input), :shape "RedactedFields", :type "list"})

(clojure.core/defn- ser-pagination-limit [input] #:http.request.field{:value input, :shape "PaginationLimit"})

(clojure.core/defn- ser-rule-group-update [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-change-action (:action input)) #:http.request.field{:name "Action", :shape "ChangeAction"}) (clojure.core/into (ser-activated-rule (:activated-rule input)) #:http.request.field{:name "ActivatedRule", :shape "ActivatedRule"})], :shape "RuleGroupUpdate", :type "structure"}))

(clojure.core/defn- ser-resource-id [input] #:http.request.field{:value input, :shape "ResourceId"})

(clojure.core/defn- ser-log-destination-configs [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-resource-arn coll) #:http.request.field{:shape "ResourceArn"}))) input), :shape "LogDestinationConfigs", :type "list", :max 1, :min 1})

(clojure.core/defn- ser-rule-update [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-change-action (:action input)) #:http.request.field{:name "Action", :shape "ChangeAction"}) (clojure.core/into (ser-predicate (:predicate input)) #:http.request.field{:name "Predicate", :shape "Predicate"})], :shape "RuleUpdate", :type "structure"}))

(clojure.core/defn- ser-xss-match-tuple [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-field-to-match (:field-to-match input)) #:http.request.field{:name "FieldToMatch", :shape "FieldToMatch"}) (clojure.core/into (ser-text-transformation (:text-transformation input)) #:http.request.field{:name "TextTransformation", :shape "TextTransformation"})], :shape "XssMatchTuple", :type "structure"}))

(clojure.core/defn- ser-byte-match-set-updates [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-byte-match-set-update coll) #:http.request.field{:shape "ByteMatchSetUpdate"}))) input), :shape "ByteMatchSetUpdates", :type "list", :min 1})

(clojure.core/defn- ser-waf-action [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-waf-action-type (:type input)) #:http.request.field{:name "Type", :shape "WafActionType"})], :shape "WafAction", :type "structure"}))

(clojure.core/defn- ser-regex-pattern-set-updates [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-regex-pattern-set-update coll) #:http.request.field{:shape "RegexPatternSetUpdate"}))) input), :shape "RegexPatternSetUpdates", :type "list", :min 1})

(clojure.core/defn- ser-ip-set-descriptor [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-ip-set-descriptor-type (:type input)) #:http.request.field{:name "Type", :shape "IPSetDescriptorType"}) (clojure.core/into (ser-ip-set-descriptor-value (:value input)) #:http.request.field{:name "Value", :shape "IPSetDescriptorValue"})], :shape "IPSetDescriptor", :type "structure"}))

(clojure.core/defn- ser-size-constraint-set-update [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-change-action (:action input)) #:http.request.field{:name "Action", :shape "ChangeAction"}) (clojure.core/into (ser-size-constraint (:size-constraint input)) #:http.request.field{:name "SizeConstraint", :shape "SizeConstraint"})], :shape "SizeConstraintSetUpdate", :type "structure"}))

(clojure.core/defn- ser-xss-match-set-update [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-change-action (:action input)) #:http.request.field{:name "Action", :shape "ChangeAction"}) (clojure.core/into (ser-xss-match-tuple (:xss-match-tuple input)) #:http.request.field{:name "XssMatchTuple", :shape "XssMatchTuple"})], :shape "XssMatchSetUpdate", :type "structure"}))

(clojure.core/defn- ser-regex-match-set-updates [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-regex-match-set-update coll) #:http.request.field{:shape "RegexMatchSetUpdate"}))) input), :shape "RegexMatchSetUpdates", :type "list", :min 1})

(clojure.core/defn- ser-resource-name [input] #:http.request.field{:value input, :shape "ResourceName"})

(clojure.core/defn- ser-size [input] #:http.request.field{:value input, :shape "Size"})

(clojure.core/defn- ser-ip-set-updates [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-ip-set-update coll) #:http.request.field{:shape "IPSetUpdate"}))) input), :shape "IPSetUpdates", :type "list", :min 1})

(clojure.core/defn- ser-geo-match-constraint-value [input] #:http.request.field{:value (clojure.core/get {:mm "MM", "CR" "CR", :tw "TW", "TG" "TG", :fr "FR", "TJ" "TJ", "ZA" "ZA", "IM" "IM", "PE" "PE", :ni "NI", :bd "BD", "LC" "LC", :gh "GH", "CH" "CH", :kp "KP", :mh "MH", "RU" "RU", :tv "TV", :gu "GU", :bt "BT", "MP" "MP", "CK" "CK", "SI" "SI", :lr "LR", "AU" "AU", "KR" "KR", "IT" "IT", "FI" "FI", :gn "GN", "GF" "GF", :ge "GE", :az "AZ", "SC" "SC", "SX" "SX", :fo "FO", "TT" "TT", :kh "KH", "TK" "TK", :rw "RW", :sz "SZ", "MY" "MY", "SY" "SY", "MN" "MN", "TF" "TF", "KP" "KP", :ma "MA", "AM" "AM", :ws "WS", "DZ" "DZ", :mv "MV", :hr "HR", "UY" "UY", :gp "GP", :es "ES", :io "IO", "TD" "TD", "DJ" "DJ", :pt "PT", :vg "VG", :cz "CZ", "BI" "BI", "MK" "MK", :gm "GM", "MU" "MU", "LI" "LI", :pg "PG", :pe "PE", :pk "PK", "NU" "NU", :lu "LU", "GR" "GR", "GY" "GY", :fi "FI", "CG" "CG", :ax "AX", :bz "BZ", :ga "GA", :pf "PF", "NF" "NF", :do "DO", "ML" "ML", "AX" "AX", "GM" "GM", :cl "CL", "SA" "SA", :ye "YE", :au "AU", "CX" "CX", "BH" "BH", :bb "BB", "NE" "NE", :er "ER", :bi "BI", :tl "TL", "BN" "BN", "MF" "MF", "CD" "CD", "DK" "DK", :is "IS", :be "BE", "BJ" "BJ", :ug "UG", :ba "BA", :tc "TC", :cv "CV", :kg "KG", "ME" "ME", "SJ" "SJ", :dk "DK", "BO" "BO", :sm "SM", "JO" "JO", "CV" "CV", "VE" "VE", "CI" "CI", :gb "GB", "UZ" "UZ", :cu "CU", :mo "MO", :dm "DM", "TN" "TN", :cd "CD", "IS" "IS", :ca "CA", :as "AS", :ro "RO", :sy "SY", :nc "NC", :td "TD", :li "LI", :ai "AI", :tz "TZ", :sl "SL", "EH" "EH", :bj "BJ", "TM" "TM", "GA" "GA", :th "TH", "LS" "LS", "TZ" "TZ", :jp "JP", :ua "UA", "AT" "AT", :tr "TR", :et "ET", :lc "LC", :re "RE", :bl "BL", :aw "AW", :lk "LK", :us "US", "LT" "LT", :hu "HU", "NP" "NP", :sg "SG", "BG" "BG", :mw "MW", "IL" "IL", "GU" "GU", "PK" "PK", :ec "EC", :mr "MR", :uz "UZ", "PT" "PT", :gg "GG", "HR" "HR", "VU" "VU", "PF" "PF", "BM" "BM", :cr "CR", "MR" "MR", "GE" "GE", "HU" "HU", "TW" "TW", "MM" "MM", :nz "NZ", :tn "TN", :gy "GY", :fj "FJ", :ci "CI", :cc "CC", :la "LA", "VG" "VG", "YE" "YE", :so "SO", :kn "KN", "SR" "SR", :mq "MQ", "PN" "PN", :zw "ZW", :af "AF", "VA" "VA", "PR" "PR", "KW" "KW", :sa "SA", "SE" "SE", "GB" "GB", :cg "CG", :tf "TF", :pl "PL", "UM" "UM", "VN" "VN", "CF" "CF", "PA" "PA", "VC" "VC", :gq "GQ", "JP" "JP", :ls "LS", :je "JE", "IR" "IR", :zm "ZM", "AF" "AF", :vn "VN", "LY" "LY", :tj "TJ", "MZ" "MZ", "RO" "RO", "QA" "QA", "CM" "CM", "GG" "GG", :dj "DJ", "BY" "BY", :ch "CH", :kw "KW", :am "AM", "SD" "SD", :ck "CK", "BQ" "BQ", "MO" "MO", "KY" "KY", :tm "TM", "AR" "AR", :jo "JO", :sb "SB", :mf "MF", :eh "EH", :it "IT", :ht "HT", :om "OM", "BR" "BR", :cm "CM", "ZW" "ZW", :bh "BH", "NR" "NR", "NZ" "NZ", "AW" "AW", :gr "GR", :pw "PW", :gw "GW", "FJ" "FJ", :co "CO", :ml "ML", "ID" "ID", "SV" "SV", "CN" "CN", :tt "TT", "FM" "FM", :uy "UY", "HT" "HT", "CC" "CC", "RW" "RW", "BA" "BA", :nu "NU", :mk "MK", "TL" "TL", :rs "RS", :nl "NL", "JM" "JM", "KM" "KM", :mz "MZ", "KE" "KE", "WS" "WS", "TO" "TO", :bv "BV", "PY" "PY", "SH" "SH", :iq "IQ", "CY" "CY", :sj "SJ", :bf "BF", "GH" "GH", "MA" "MA", :vc "VC", "SG" "SG", :bn "BN", "LK" "LK", :gd "GD", "PH" "PH", "SM" "SM", :lb "LB", :pa "PA", :va "VA", "WF" "WF", "TR" "TR", "PS" "PS", "BZ" "BZ", "CU" "CU", "TV" "TV", :za "ZA", :mn "MN", "AD" "AD", "SB" "SB", "DM" "DM", "LR" "LR", :np "NP", :al "AL", "OM" "OM", "SO" "SO", :sk "SK", :kz "KZ", :na "NA", :ie "IE", "DO" "DO", :ag "AG", :st "ST", "AL" "AL", "BL" "BL", :de "DE", "FR" "FR", "GW" "GW", :qa "QA", :nr "NR", :cx "CX", :id "ID", "MS" "MS", "BB" "BB", "CA" "CA", :mx "MX", :gt "GT", :pm "PM", :jm "JM", "MG" "MG", :cy "CY", :ar "AR", "KH" "KH", "LA" "LA", :at "AT", "GP" "GP", "BV" "BV", "HN" "HN", :aq "AQ", "TH" "TH", :ke "KE", "DE" "DE", "LB" "LB", :gf "GF", "KZ" "KZ", "AS" "AS", "EC" "EC", :ao "AO", :il "IL", "NO" "NO", :cf "CF", "AO" "AO", "FK" "FK", :ss "SS", "ET" "ET", "GS" "GS", "MD" "MD", :ru "RU", :gl "GL", :se "SE", "AG" "AG", "BE" "BE", :ph "PH", :bs "BS", "MV" "MV", "SZ" "SZ", "CZ" "CZ", "CL" "CL", :gi "GI", "BT" "BT", :sc "SC", "NL" "NL", :sd "SD", "EG" "EG", :sx "SX", :ve "VE", :sn "SN", "MQ" "MQ", :bw "BW", :km "KM", :ee "EE", "SN" "SN", :by "BY", "FO" "FO", :br "BR", "EE" "EE", "AQ" "AQ", "ST" "ST", "KN" "KN", "BW" "BW", "MH" "MH", "NI" "NI", "PG" "PG", :sv "SV", "VI" "VI", :sh "SH", "IQ" "IQ", :mu "MU", :ne "NE", "KG" "KG", :hk "HK", :dz "DZ", :mg "MG", "US" "US", "ZM" "ZM", "MC" "MC", "GI" "GI", "NC" "NC", :hm "HM", "GT" "GT", :mc "MC", :eg "EG", "BF" "BF", "YT" "YT", :ir "IR", :fk "FK", "LU" "LU", :me "ME", "UA" "UA", :ki "KI", "IE" "IE", "LV" "LV", "GD" "GD", :bm "BM", :ad "AD", "MW" "MW", :ae "AE", :my "MY", "BS" "BS", :bg "BG", :lt "LT", :ms "MS", "AZ" "AZ", :bq "BQ", :wf "WF", "SK" "SK", :hn "HN", :um "UM", :ng "NG", :pr "PR", "GQ" "GQ", "TC" "TC", :py "PY", :yt "YT", "RE" "RE", "IN" "IN", "ES" "ES", :ly "LY", "GL" "GL", :lv "LV", :gs "GS", :tk "TK", "KI" "KI", :mt "MT", :mp "MP", "HK" "HK", :kr "KR", "CO" "CO", "SS" "SS", "RS" "RS", "IO" "IO", :im "IM", "NG" "NG", :cw "CW", :fm "FM", :pn "PN", :sr "SR", "UG" "UG", "CW" "CW", "SL" "SL", :si "SI", "ER" "ER", "JE" "JE", :tg "TG", :cn "CN", "AE" "AE", :vi "VI", "HM" "HM", :no "NO", :ps "PS", "PM" "PM", "BD" "BD", "MT" "MT", "AI" "AI", :bo "BO", "GN" "GN", :in "IN", "PW" "PW", :vu "VU", :md "MD", :to "TO", "NA" "NA", "MX" "MX", :nf "NF", :ky "KY", "PL" "PL"} input), :shape "GeoMatchConstraintValue"})

(clojure.core/defn- ser-match-field-type [input] #:http.request.field{:value (clojure.core/get {"SINGLE_QUERY_ARG" "SINGLE_QUERY_ARG", "QUERY_STRING" "QUERY_STRING", :method "METHOD", :header "HEADER", "METHOD" "METHOD", "HEADER" "HEADER", :all-query-args "ALL_QUERY_ARGS", "URI" "URI", "ALL_QUERY_ARGS" "ALL_QUERY_ARGS", "BODY" "BODY", :uri "URI", :query-string "QUERY_STRING", :single-query-arg "SINGLE_QUERY_ARG", :body "BODY"} input), :shape "MatchFieldType"})

(clojure.core/defn- ser-regex-match-set-update [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-change-action (:action input)) #:http.request.field{:name "Action", :shape "ChangeAction"}) (clojure.core/into (ser-regex-match-tuple (:regex-match-tuple input)) #:http.request.field{:name "RegexMatchTuple", :shape "RegexMatchTuple"})], :shape "RegexMatchSetUpdate", :type "structure"}))

(clojure.core/defn- ser-rule-group-updates [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-rule-group-update coll) #:http.request.field{:shape "RuleGroupUpdate"}))) input), :shape "RuleGroupUpdates", :type "list", :min 1})

(clojure.core/defn- ser-match-field-data [input] #:http.request.field{:value input, :shape "MatchFieldData"})

(clojure.core/defn- ser-next-marker [input] #:http.request.field{:value input, :shape "NextMarker"})

(clojure.core/defn- ser-xss-match-set-updates [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-xss-match-set-update coll) #:http.request.field{:shape "XssMatchSetUpdate"}))) input), :shape "XssMatchSetUpdates", :type "list", :min 1})

(clojure.core/defn- ser-logging-configuration [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-resource-arn (:resource-arn input)) #:http.request.field{:name "ResourceArn", :shape "ResourceArn"}) (clojure.core/into (ser-log-destination-configs (:log-destination-configs input)) #:http.request.field{:name "LogDestinationConfigs", :shape "LogDestinationConfigs"})], :shape "LoggingConfiguration", :type "structure"} (clojure.core/contains? input :redacted-fields) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-redacted-fields (input :redacted-fields)) #:http.request.field{:name "RedactedFields", :shape "RedactedFields"}))))

(clojure.core/defn- ser-size-constraint-set-updates [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-size-constraint-set-update coll) #:http.request.field{:shape "SizeConstraintSetUpdate"}))) input), :shape "SizeConstraintSetUpdates", :type "list", :min 1})

(clojure.core/defn- ser-timestamp [input] #:http.request.field{:value input, :shape "Timestamp"})

(clojure.core/defn- ser-resource-arn [input] #:http.request.field{:value input, :shape "ResourceArn"})

(clojure.core/defn- ser-metric-name [input] #:http.request.field{:value input, :shape "MetricName"})

(clojure.core/defn- ser-waf-rule-type [input] #:http.request.field{:value (clojure.core/get {"REGULAR" "REGULAR", :regular "REGULAR", "RATE_BASED" "RATE_BASED", :rate-based "RATE_BASED", "GROUP" "GROUP", :group "GROUP"} input), :shape "WafRuleType"})

(clojure.core/defn- ser-sql-injection-match-set-update [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-change-action (:action input)) #:http.request.field{:name "Action", :shape "ChangeAction"}) (clojure.core/into (ser-sql-injection-match-tuple (:sql-injection-match-tuple input)) #:http.request.field{:name "SqlInjectionMatchTuple", :shape "SqlInjectionMatchTuple"})], :shape "SqlInjectionMatchSetUpdate", :type "structure"}))

(clojure.core/defn- ser-predicate-type [input] #:http.request.field{:value (clojure.core/get {:byte-match "ByteMatch", "SizeConstraint" "SizeConstraint", "XssMatch" "XssMatch", :ip-match "IPMatch", "GeoMatch" "GeoMatch", "SqlInjectionMatch" "SqlInjectionMatch", :regex-match "RegexMatch", :geo-match "GeoMatch", :sql-injection-match "SqlInjectionMatch", :xss-match "XssMatch", "ByteMatch" "ByteMatch", "RegexMatch" "RegexMatch", :size-constraint "SizeConstraint", "IPMatch" "IPMatch"} input), :shape "PredicateType"})

(clojure.core/defn- ser-geo-match-set-updates [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-geo-match-set-update coll) #:http.request.field{:shape "GeoMatchSetUpdate"}))) input), :shape "GeoMatchSetUpdates", :type "list", :min 1})

(clojure.core/defn- ser-regex-match-tuple [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-field-to-match (:field-to-match input)) #:http.request.field{:name "FieldToMatch", :shape "FieldToMatch"}) (clojure.core/into (ser-text-transformation (:text-transformation input)) #:http.request.field{:name "TextTransformation", :shape "TextTransformation"}) (clojure.core/into (ser-resource-id (:regex-pattern-set-id input)) #:http.request.field{:name "RegexPatternSetId", :shape "ResourceId"})], :shape "RegexMatchTuple", :type "structure"}))

(clojure.core/defn- ser-predicate [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-negated (:negated input)) #:http.request.field{:name "Negated", :shape "Negated"}) (clojure.core/into (ser-predicate-type (:type input)) #:http.request.field{:name "Type", :shape "PredicateType"}) (clojure.core/into (ser-resource-id (:data-id input)) #:http.request.field{:name "DataId", :shape "ResourceId"})], :shape "Predicate", :type "structure"}))

(clojure.core/defn- ser-activated-rule [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-rule-priority (:priority input)) #:http.request.field{:name "Priority", :shape "RulePriority"}) (clojure.core/into (ser-resource-id (:rule-id input)) #:http.request.field{:name "RuleId", :shape "ResourceId"})], :shape "ActivatedRule", :type "structure"} (clojure.core/contains? input :action) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-waf-action (input :action)) #:http.request.field{:name "Action", :shape "WafAction"})) (clojure.core/contains? input :override-action) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-waf-override-action (input :override-action)) #:http.request.field{:name "OverrideAction", :shape "WafOverrideAction"})) (clojure.core/contains? input :type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-waf-rule-type (input :type)) #:http.request.field{:name "Type", :shape "WafRuleType"}))))

(clojure.core/defn- ser-geo-match-set-update [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-change-action (:action input)) #:http.request.field{:name "Action", :shape "ChangeAction"}) (clojure.core/into (ser-geo-match-constraint (:geo-match-constraint input)) #:http.request.field{:name "GeoMatchConstraint", :shape "GeoMatchConstraint"})], :shape "GeoMatchSetUpdate", :type "structure"}))

(clojure.core/defn- ser-web-acl-update [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-change-action (:action input)) #:http.request.field{:name "Action", :shape "ChangeAction"}) (clojure.core/into (ser-activated-rule (:activated-rule input)) #:http.request.field{:name "ActivatedRule", :shape "ActivatedRule"})], :shape "WebACLUpdate", :type "structure"}))

(clojure.core/defn- ser-byte-match-target-string [input] #:http.request.field{:value (portkey.aws/base64-encode input), :shape "ByteMatchTargetString"})

(clojure.core/defn- ser-regex-pattern-set-update [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-change-action (:action input)) #:http.request.field{:name "Action", :shape "ChangeAction"}) (clojure.core/into (ser-regex-pattern-string (:regex-pattern-string input)) #:http.request.field{:name "RegexPatternString", :shape "RegexPatternString"})], :shape "RegexPatternSetUpdate", :type "structure"}))

(clojure.core/defn- ser-waf-override-action-type [input] #:http.request.field{:value (clojure.core/get {"NONE" "NONE", :none "NONE", "COUNT" "COUNT", :count "COUNT"} input), :shape "WafOverrideActionType"})

(clojure.core/defn- ser-rate-limit [input] #:http.request.field{:value input, :shape "RateLimit"})

(clojure.core/defn- ser-negated [input] #:http.request.field{:value input, :shape "Negated"})

(clojure.core/defn- ser-get-sampled-requests-max-items [input] #:http.request.field{:value input, :shape "GetSampledRequestsMaxItems"})

(clojure.core/defn- req-get-rule-group-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :rule-group-id)) #:http.request.field{:name "RuleGroupId", :shape "ResourceId"})]}))

(clojure.core/defn- req-list-subscribed-rule-groups-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-marker (input :next-marker)) #:http.request.field{:name "NextMarker", :shape "NextMarker"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-limit (input :limit)) #:http.request.field{:name "Limit", :shape "PaginationLimit"}))))

(clojure.core/defn- req-create-size-constraint-set-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :name)) #:http.request.field{:name "Name", :shape "ResourceName"}) (clojure.core/into (ser-change-token (input :change-token)) #:http.request.field{:name "ChangeToken", :shape "ChangeToken"})]}))

(clojure.core/defn- req-update-xss-match-set-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :xss-match-set-id)) #:http.request.field{:name "XssMatchSetId", :shape "ResourceId"}) (clojure.core/into (ser-change-token (input :change-token)) #:http.request.field{:name "ChangeToken", :shape "ChangeToken"}) (clojure.core/into (ser-xss-match-set-updates (input :updates)) #:http.request.field{:name "Updates", :shape "XssMatchSetUpdates"})]}))

(clojure.core/defn- req-get-rate-based-rule-managed-keys-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :rule-id)) #:http.request.field{:name "RuleId", :shape "ResourceId"})]} (clojure.core/contains? input :next-marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-marker (input :next-marker)) #:http.request.field{:name "NextMarker", :shape "NextMarker"}))))

(clojure.core/defn- req-list-byte-match-sets-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-marker (input :next-marker)) #:http.request.field{:name "NextMarker", :shape "NextMarker"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-limit (input :limit)) #:http.request.field{:name "Limit", :shape "PaginationLimit"}))))

(clojure.core/defn- req-update-regex-pattern-set-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :regex-pattern-set-id)) #:http.request.field{:name "RegexPatternSetId", :shape "ResourceId"}) (clojure.core/into (ser-regex-pattern-set-updates (input :updates)) #:http.request.field{:name "Updates", :shape "RegexPatternSetUpdates"}) (clojure.core/into (ser-change-token (input :change-token)) #:http.request.field{:name "ChangeToken", :shape "ChangeToken"})]}))

(clojure.core/defn- req-list-geo-match-sets-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-marker (input :next-marker)) #:http.request.field{:name "NextMarker", :shape "NextMarker"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-limit (input :limit)) #:http.request.field{:name "Limit", :shape "PaginationLimit"}))))

(clojure.core/defn- req-create-byte-match-set-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :name)) #:http.request.field{:name "Name", :shape "ResourceName"}) (clojure.core/into (ser-change-token (input :change-token)) #:http.request.field{:name "ChangeToken", :shape "ChangeToken"})]}))

(clojure.core/defn- req-get-regex-pattern-set-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :regex-pattern-set-id)) #:http.request.field{:name "RegexPatternSetId", :shape "ResourceId"})]}))

(clojure.core/defn- req-update-sql-injection-match-set-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :sql-injection-match-set-id)) #:http.request.field{:name "SqlInjectionMatchSetId", :shape "ResourceId"}) (clojure.core/into (ser-change-token (input :change-token)) #:http.request.field{:name "ChangeToken", :shape "ChangeToken"}) (clojure.core/into (ser-sql-injection-match-set-updates (input :updates)) #:http.request.field{:name "Updates", :shape "SqlInjectionMatchSetUpdates"})]}))

(clojure.core/defn- req-delete-sql-injection-match-set-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :sql-injection-match-set-id)) #:http.request.field{:name "SqlInjectionMatchSetId", :shape "ResourceId"}) (clojure.core/into (ser-change-token (input :change-token)) #:http.request.field{:name "ChangeToken", :shape "ChangeToken"})]}))

(clojure.core/defn- req-create-rule-group-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :name)) #:http.request.field{:name "Name", :shape "ResourceName"}) (clojure.core/into (ser-metric-name (input :metric-name)) #:http.request.field{:name "MetricName", :shape "MetricName"}) (clojure.core/into (ser-change-token (input :change-token)) #:http.request.field{:name "ChangeToken", :shape "ChangeToken"})]}))

(clojure.core/defn- req-list-ip-sets-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-marker (input :next-marker)) #:http.request.field{:name "NextMarker", :shape "NextMarker"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-limit (input :limit)) #:http.request.field{:name "Limit", :shape "PaginationLimit"}))))

(clojure.core/defn- req-get-sampled-requests-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :web-acl-id)) #:http.request.field{:name "WebAclId", :shape "ResourceId"}) (clojure.core/into (ser-resource-id (input :rule-id)) #:http.request.field{:name "RuleId", :shape "ResourceId"}) (clojure.core/into (ser-time-window (input :time-window)) #:http.request.field{:name "TimeWindow", :shape "TimeWindow"}) (clojure.core/into (ser-get-sampled-requests-max-items (input :max-items)) #:http.request.field{:name "MaxItems", :shape "GetSampledRequestsMaxItems"})]}))

(clojure.core/defn- req-associate-web-acl-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :web-acl-id)) #:http.request.field{:name "WebACLId", :shape "ResourceId"}) (clojure.core/into (ser-resource-arn (input :resource-arn)) #:http.request.field{:name "ResourceArn", :shape "ResourceArn"})]}))

(clojure.core/defn- req-create-regex-match-set-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :name)) #:http.request.field{:name "Name", :shape "ResourceName"}) (clojure.core/into (ser-change-token (input :change-token)) #:http.request.field{:name "ChangeToken", :shape "ChangeToken"})]}))

(clojure.core/defn- req-get-xss-match-set-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :xss-match-set-id)) #:http.request.field{:name "XssMatchSetId", :shape "ResourceId"})]}))

(clojure.core/defn- req-delete-logging-configuration-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-arn (input :resource-arn)) #:http.request.field{:name "ResourceArn", :shape "ResourceArn"})]}))

(clojure.core/defn- req-get-web-acl-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :web-acl-id)) #:http.request.field{:name "WebACLId", :shape "ResourceId"})]}))

(clojure.core/defn- req-list-rate-based-rules-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-marker (input :next-marker)) #:http.request.field{:name "NextMarker", :shape "NextMarker"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-limit (input :limit)) #:http.request.field{:name "Limit", :shape "PaginationLimit"}))))

(clojure.core/defn- req-create-ip-set-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :name)) #:http.request.field{:name "Name", :shape "ResourceName"}) (clojure.core/into (ser-change-token (input :change-token)) #:http.request.field{:name "ChangeToken", :shape "ChangeToken"})]}))

(clojure.core/defn- req-delete-rate-based-rule-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :rule-id)) #:http.request.field{:name "RuleId", :shape "ResourceId"}) (clojure.core/into (ser-change-token (input :change-token)) #:http.request.field{:name "ChangeToken", :shape "ChangeToken"})]}))

(clojure.core/defn- req-update-rule-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :rule-id)) #:http.request.field{:name "RuleId", :shape "ResourceId"}) (clojure.core/into (ser-change-token (input :change-token)) #:http.request.field{:name "ChangeToken", :shape "ChangeToken"}) (clojure.core/into (ser-rule-updates (input :updates)) #:http.request.field{:name "Updates", :shape "RuleUpdates"})]}))

(clojure.core/defn- req-list-resources-for-web-acl-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :web-acl-id)) #:http.request.field{:name "WebACLId", :shape "ResourceId"})]}))

(clojure.core/defn- req-delete-geo-match-set-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :geo-match-set-id)) #:http.request.field{:name "GeoMatchSetId", :shape "ResourceId"}) (clojure.core/into (ser-change-token (input :change-token)) #:http.request.field{:name "ChangeToken", :shape "ChangeToken"})]}))

(clojure.core/defn- req-get-permission-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-arn (input :resource-arn)) #:http.request.field{:name "ResourceArn", :shape "ResourceArn"})]}))

(clojure.core/defn- req-create-rule-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :name)) #:http.request.field{:name "Name", :shape "ResourceName"}) (clojure.core/into (ser-metric-name (input :metric-name)) #:http.request.field{:name "MetricName", :shape "MetricName"}) (clojure.core/into (ser-change-token (input :change-token)) #:http.request.field{:name "ChangeToken", :shape "ChangeToken"})]}))

(clojure.core/defn- req-get-logging-configuration-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-arn (input :resource-arn)) #:http.request.field{:name "ResourceArn", :shape "ResourceArn"})]}))

(clojure.core/defn- req-list-web-ac-ls-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-marker (input :next-marker)) #:http.request.field{:name "NextMarker", :shape "NextMarker"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-limit (input :limit)) #:http.request.field{:name "Limit", :shape "PaginationLimit"}))))

(clojure.core/defn- req-list-regex-match-sets-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-marker (input :next-marker)) #:http.request.field{:name "NextMarker", :shape "NextMarker"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-limit (input :limit)) #:http.request.field{:name "Limit", :shape "PaginationLimit"}))))

(clojure.core/defn- req-create-xss-match-set-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :name)) #:http.request.field{:name "Name", :shape "ResourceName"}) (clojure.core/into (ser-change-token (input :change-token)) #:http.request.field{:name "ChangeToken", :shape "ChangeToken"})]}))

(clojure.core/defn- req-update-ip-set-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :ip-set-id)) #:http.request.field{:name "IPSetId", :shape "ResourceId"}) (clojure.core/into (ser-change-token (input :change-token)) #:http.request.field{:name "ChangeToken", :shape "ChangeToken"}) (clojure.core/into (ser-ip-set-updates (input :updates)) #:http.request.field{:name "Updates", :shape "IPSetUpdates"})]}))

(clojure.core/defn- req-put-logging-configuration-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-logging-configuration (input :logging-configuration)) #:http.request.field{:name "LoggingConfiguration", :shape "LoggingConfiguration"})]}))

(clojure.core/defn- req-get-change-token-request [input] (clojure.core/cond-> {}))

(clojure.core/defn- req-update-web-acl-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :web-acl-id)) #:http.request.field{:name "WebACLId", :shape "ResourceId"}) (clojure.core/into (ser-change-token (input :change-token)) #:http.request.field{:name "ChangeToken", :shape "ChangeToken"})]} (clojure.core/contains? input :updates) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-web-acl-updates (input :updates)) #:http.request.field{:name "Updates", :shape "WebACLUpdates"})) (clojure.core/contains? input :default-action) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-waf-action (input :default-action)) #:http.request.field{:name "DefaultAction", :shape "WafAction"}))))

(clojure.core/defn- req-create-geo-match-set-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :name)) #:http.request.field{:name "Name", :shape "ResourceName"}) (clojure.core/into (ser-change-token (input :change-token)) #:http.request.field{:name "ChangeToken", :shape "ChangeToken"})]}))

(clojure.core/defn- req-delete-regex-match-set-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :regex-match-set-id)) #:http.request.field{:name "RegexMatchSetId", :shape "ResourceId"}) (clojure.core/into (ser-change-token (input :change-token)) #:http.request.field{:name "ChangeToken", :shape "ChangeToken"})]}))

(clojure.core/defn- req-update-geo-match-set-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :geo-match-set-id)) #:http.request.field{:name "GeoMatchSetId", :shape "ResourceId"}) (clojure.core/into (ser-change-token (input :change-token)) #:http.request.field{:name "ChangeToken", :shape "ChangeToken"}) (clojure.core/into (ser-geo-match-set-updates (input :updates)) #:http.request.field{:name "Updates", :shape "GeoMatchSetUpdates"})]}))

(clojure.core/defn- req-get-web-acl-for-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-arn (input :resource-arn)) #:http.request.field{:name "ResourceArn", :shape "ResourceArn"})]}))

(clojure.core/defn- req-get-change-token-status-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-change-token (input :change-token)) #:http.request.field{:name "ChangeToken", :shape "ChangeToken"})]}))

(clojure.core/defn- req-disassociate-web-acl-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-arn (input :resource-arn)) #:http.request.field{:name "ResourceArn", :shape "ResourceArn"})]}))

(clojure.core/defn- req-delete-rule-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :rule-id)) #:http.request.field{:name "RuleId", :shape "ResourceId"}) (clojure.core/into (ser-change-token (input :change-token)) #:http.request.field{:name "ChangeToken", :shape "ChangeToken"})]}))

(clojure.core/defn- req-list-xss-match-sets-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-marker (input :next-marker)) #:http.request.field{:name "NextMarker", :shape "NextMarker"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-limit (input :limit)) #:http.request.field{:name "Limit", :shape "PaginationLimit"}))))

(clojure.core/defn- req-list-size-constraint-sets-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-marker (input :next-marker)) #:http.request.field{:name "NextMarker", :shape "NextMarker"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-limit (input :limit)) #:http.request.field{:name "Limit", :shape "PaginationLimit"}))))

(clojure.core/defn- req-delete-permission-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-arn (input :resource-arn)) #:http.request.field{:name "ResourceArn", :shape "ResourceArn"})]}))

(clojure.core/defn- req-delete-regex-pattern-set-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :regex-pattern-set-id)) #:http.request.field{:name "RegexPatternSetId", :shape "ResourceId"}) (clojure.core/into (ser-change-token (input :change-token)) #:http.request.field{:name "ChangeToken", :shape "ChangeToken"})]}))

(clojure.core/defn- req-list-rule-groups-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-marker (input :next-marker)) #:http.request.field{:name "NextMarker", :shape "NextMarker"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-limit (input :limit)) #:http.request.field{:name "Limit", :shape "PaginationLimit"}))))

(clojure.core/defn- req-update-byte-match-set-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :byte-match-set-id)) #:http.request.field{:name "ByteMatchSetId", :shape "ResourceId"}) (clojure.core/into (ser-change-token (input :change-token)) #:http.request.field{:name "ChangeToken", :shape "ChangeToken"}) (clojure.core/into (ser-byte-match-set-updates (input :updates)) #:http.request.field{:name "Updates", :shape "ByteMatchSetUpdates"})]}))

(clojure.core/defn- req-get-regex-match-set-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :regex-match-set-id)) #:http.request.field{:name "RegexMatchSetId", :shape "ResourceId"})]}))

(clojure.core/defn- req-get-rule-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :rule-id)) #:http.request.field{:name "RuleId", :shape "ResourceId"})]}))

(clojure.core/defn- req-update-regex-match-set-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :regex-match-set-id)) #:http.request.field{:name "RegexMatchSetId", :shape "ResourceId"}) (clojure.core/into (ser-regex-match-set-updates (input :updates)) #:http.request.field{:name "Updates", :shape "RegexMatchSetUpdates"}) (clojure.core/into (ser-change-token (input :change-token)) #:http.request.field{:name "ChangeToken", :shape "ChangeToken"})]}))

(clojure.core/defn- req-get-sql-injection-match-set-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :sql-injection-match-set-id)) #:http.request.field{:name "SqlInjectionMatchSetId", :shape "ResourceId"})]}))

(clojure.core/defn- req-get-geo-match-set-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :geo-match-set-id)) #:http.request.field{:name "GeoMatchSetId", :shape "ResourceId"})]}))

(clojure.core/defn- req-delete-rule-group-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :rule-group-id)) #:http.request.field{:name "RuleGroupId", :shape "ResourceId"}) (clojure.core/into (ser-change-token (input :change-token)) #:http.request.field{:name "ChangeToken", :shape "ChangeToken"})]}))

(clojure.core/defn- req-create-rate-based-rule-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :name)) #:http.request.field{:name "Name", :shape "ResourceName"}) (clojure.core/into (ser-metric-name (input :metric-name)) #:http.request.field{:name "MetricName", :shape "MetricName"}) (clojure.core/into (ser-rate-key (input :rate-key)) #:http.request.field{:name "RateKey", :shape "RateKey"}) (clojure.core/into (ser-rate-limit (input :rate-limit)) #:http.request.field{:name "RateLimit", :shape "RateLimit"}) (clojure.core/into (ser-change-token (input :change-token)) #:http.request.field{:name "ChangeToken", :shape "ChangeToken"})]}))

(clojure.core/defn- req-create-sql-injection-match-set-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :name)) #:http.request.field{:name "Name", :shape "ResourceName"}) (clojure.core/into (ser-change-token (input :change-token)) #:http.request.field{:name "ChangeToken", :shape "ChangeToken"})]}))

(clojure.core/defn- req-get-size-constraint-set-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :size-constraint-set-id)) #:http.request.field{:name "SizeConstraintSetId", :shape "ResourceId"})]}))

(clojure.core/defn- req-create-regex-pattern-set-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :name)) #:http.request.field{:name "Name", :shape "ResourceName"}) (clojure.core/into (ser-change-token (input :change-token)) #:http.request.field{:name "ChangeToken", :shape "ChangeToken"})]}))

(clojure.core/defn- req-get-rate-based-rule-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :rule-id)) #:http.request.field{:name "RuleId", :shape "ResourceId"})]}))

(clojure.core/defn- req-delete-ip-set-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :ip-set-id)) #:http.request.field{:name "IPSetId", :shape "ResourceId"}) (clojure.core/into (ser-change-token (input :change-token)) #:http.request.field{:name "ChangeToken", :shape "ChangeToken"})]}))

(clojure.core/defn- req-list-activated-rules-in-rule-group-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :rule-group-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-id (input :rule-group-id)) #:http.request.field{:name "RuleGroupId", :shape "ResourceId"})) (clojure.core/contains? input :next-marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-marker (input :next-marker)) #:http.request.field{:name "NextMarker", :shape "NextMarker"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-limit (input :limit)) #:http.request.field{:name "Limit", :shape "PaginationLimit"}))))

(clojure.core/defn- req-delete-web-acl-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :web-acl-id)) #:http.request.field{:name "WebACLId", :shape "ResourceId"}) (clojure.core/into (ser-change-token (input :change-token)) #:http.request.field{:name "ChangeToken", :shape "ChangeToken"})]}))

(clojure.core/defn- req-list-regex-pattern-sets-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-marker (input :next-marker)) #:http.request.field{:name "NextMarker", :shape "NextMarker"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-limit (input :limit)) #:http.request.field{:name "Limit", :shape "PaginationLimit"}))))

(clojure.core/defn- req-list-rules-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-marker (input :next-marker)) #:http.request.field{:name "NextMarker", :shape "NextMarker"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-limit (input :limit)) #:http.request.field{:name "Limit", :shape "PaginationLimit"}))))

(clojure.core/defn- req-update-rule-group-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :rule-group-id)) #:http.request.field{:name "RuleGroupId", :shape "ResourceId"}) (clojure.core/into (ser-rule-group-updates (input :updates)) #:http.request.field{:name "Updates", :shape "RuleGroupUpdates"}) (clojure.core/into (ser-change-token (input :change-token)) #:http.request.field{:name "ChangeToken", :shape "ChangeToken"})]}))

(clojure.core/defn- req-list-logging-configurations-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-marker (input :next-marker)) #:http.request.field{:name "NextMarker", :shape "NextMarker"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-limit (input :limit)) #:http.request.field{:name "Limit", :shape "PaginationLimit"}))))

(clojure.core/defn- req-delete-size-constraint-set-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :size-constraint-set-id)) #:http.request.field{:name "SizeConstraintSetId", :shape "ResourceId"}) (clojure.core/into (ser-change-token (input :change-token)) #:http.request.field{:name "ChangeToken", :shape "ChangeToken"})]}))

(clojure.core/defn- req-delete-byte-match-set-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :byte-match-set-id)) #:http.request.field{:name "ByteMatchSetId", :shape "ResourceId"}) (clojure.core/into (ser-change-token (input :change-token)) #:http.request.field{:name "ChangeToken", :shape "ChangeToken"})]}))

(clojure.core/defn- req-update-rate-based-rule-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :rule-id)) #:http.request.field{:name "RuleId", :shape "ResourceId"}) (clojure.core/into (ser-change-token (input :change-token)) #:http.request.field{:name "ChangeToken", :shape "ChangeToken"}) (clojure.core/into (ser-rule-updates (input :updates)) #:http.request.field{:name "Updates", :shape "RuleUpdates"}) (clojure.core/into (ser-rate-limit (input :rate-limit)) #:http.request.field{:name "RateLimit", :shape "RateLimit"})]}))

(clojure.core/defn- req-update-size-constraint-set-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :size-constraint-set-id)) #:http.request.field{:name "SizeConstraintSetId", :shape "ResourceId"}) (clojure.core/into (ser-change-token (input :change-token)) #:http.request.field{:name "ChangeToken", :shape "ChangeToken"}) (clojure.core/into (ser-size-constraint-set-updates (input :updates)) #:http.request.field{:name "Updates", :shape "SizeConstraintSetUpdates"})]}))

(clojure.core/defn- req-delete-xss-match-set-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :xss-match-set-id)) #:http.request.field{:name "XssMatchSetId", :shape "ResourceId"}) (clojure.core/into (ser-change-token (input :change-token)) #:http.request.field{:name "ChangeToken", :shape "ChangeToken"})]}))

(clojure.core/defn- req-get-byte-match-set-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :byte-match-set-id)) #:http.request.field{:name "ByteMatchSetId", :shape "ResourceId"})]}))

(clojure.core/defn- req-get-ip-set-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :ip-set-id)) #:http.request.field{:name "IPSetId", :shape "ResourceId"})]}))

(clojure.core/defn- req-create-web-acl-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :name)) #:http.request.field{:name "Name", :shape "ResourceName"}) (clojure.core/into (ser-metric-name (input :metric-name)) #:http.request.field{:name "MetricName", :shape "MetricName"}) (clojure.core/into (ser-waf-action (input :default-action)) #:http.request.field{:name "DefaultAction", :shape "WafAction"}) (clojure.core/into (ser-change-token (input :change-token)) #:http.request.field{:name "ChangeToken", :shape "ChangeToken"})]}))

(clojure.core/defn- req-put-permission-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-arn (input :resource-arn)) #:http.request.field{:name "ResourceArn", :shape "ResourceArn"}) (clojure.core/into (ser-policy-string (input :policy)) #:http.request.field{:name "Policy", :shape "PolicyString"})]}))

(clojure.core/defn- req-list-sql-injection-match-sets-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-marker (input :next-marker)) #:http.request.field{:name "NextMarker", :shape "NextMarker"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-limit (input :limit)) #:http.request.field{:name "Limit", :shape "PaginationLimit"}))))

(clojure.spec.alpha/def :portkey.aws.waf-regional.get-rule-group-request/rule-group-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional/get-rule-group-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.get-rule-group-request/rule-group-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional.list-subscribed-rule-groups-request/limit (clojure.spec.alpha/and :portkey.aws.waf-regional/pagination-limit))
(clojure.spec.alpha/def :portkey.aws.waf-regional/list-subscribed-rule-groups-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/next-marker :portkey.aws.waf-regional.list-subscribed-rule-groups-request/limit]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.create-size-constraint-set-request/name (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-name))
(clojure.spec.alpha/def :portkey.aws.waf-regional/create-size-constraint-set-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.create-size-constraint-set-request/name :portkey.aws.waf-regional/change-token] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional/change-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__)))))

(clojure.spec.alpha/def :portkey.aws.waf-regional.update-xss-match-set-request/xss-match-set-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional.update-xss-match-set-request/updates (clojure.spec.alpha/and :portkey.aws.waf-regional/xss-match-set-updates))
(clojure.spec.alpha/def :portkey.aws.waf-regional/update-xss-match-set-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.update-xss-match-set-request/xss-match-set-id :portkey.aws.waf-regional/change-token :portkey.aws.waf-regional.update-xss-match-set-request/updates] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional/rule-updates (clojure.spec.alpha/coll-of :portkey.aws.waf-regional/rule-update))

(clojure.spec.alpha/def :portkey.aws.waf-regional.get-rate-based-rule-managed-keys-request/rule-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional/get-rate-based-rule-managed-keys-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.get-rate-based-rule-managed-keys-request/rule-id] :opt-un [:portkey.aws.waf-regional/next-marker]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/positional-constraint #{:starts-with :exactly :contains "CONTAINS" "EXACTLY" :contains-word "CONTAINS_WORD" "ENDS_WITH" "STARTS_WITH" :ends-with})

(clojure.spec.alpha/def :portkey.aws.waf-regional/get-web-acl-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/web-acl]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.list-byte-match-sets-request/limit (clojure.spec.alpha/and :portkey.aws.waf-regional/pagination-limit))
(clojure.spec.alpha/def :portkey.aws.waf-regional/list-byte-match-sets-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/next-marker :portkey.aws.waf-regional.list-byte-match-sets-request/limit]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.rule-group-summary/rule-group-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional.rule-group-summary/name (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-name))
(clojure.spec.alpha/def :portkey.aws.waf-regional/rule-group-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.rule-group-summary/rule-group-id :portkey.aws.waf-regional.rule-group-summary/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional.update-regex-pattern-set-request/regex-pattern-set-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional.update-regex-pattern-set-request/updates (clojure.spec.alpha/and :portkey.aws.waf-regional/regex-pattern-set-updates))
(clojure.spec.alpha/def :portkey.aws.waf-regional/update-regex-pattern-set-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.update-regex-pattern-set-request/regex-pattern-set-id :portkey.aws.waf-regional.update-regex-pattern-set-request/updates :portkey.aws.waf-regional/change-token] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional.list-geo-match-sets-request/limit (clojure.spec.alpha/and :portkey.aws.waf-regional/pagination-limit))
(clojure.spec.alpha/def :portkey.aws.waf-regional/list-geo-match-sets-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/next-marker :portkey.aws.waf-regional.list-geo-match-sets-request/limit]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.list-regex-pattern-sets-response/regex-pattern-sets (clojure.spec.alpha/and :portkey.aws.waf-regional/regex-pattern-set-summaries))
(clojure.spec.alpha/def :portkey.aws.waf-regional/list-regex-pattern-sets-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/next-marker :portkey.aws.waf-regional.list-regex-pattern-sets-response/regex-pattern-sets]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.waf-invalid-parameter-exception/field (clojure.spec.alpha/and :portkey.aws.waf-regional/parameter-exception-field))
(clojure.spec.alpha/def :portkey.aws.waf-regional.waf-invalid-parameter-exception/parameter (clojure.spec.alpha/and :portkey.aws.waf-regional/parameter-exception-parameter))
(clojure.spec.alpha/def :portkey.aws.waf-regional.waf-invalid-parameter-exception/reason (clojure.spec.alpha/and :portkey.aws.waf-regional/parameter-exception-reason))
(clojure.spec.alpha/def :portkey.aws.waf-regional/waf-invalid-parameter-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional.waf-invalid-parameter-exception/field :portkey.aws.waf-regional.waf-invalid-parameter-exception/parameter :portkey.aws.waf-regional.waf-invalid-parameter-exception/reason]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.create-byte-match-set-request/name (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-name))
(clojure.spec.alpha/def :portkey.aws.waf-regional/create-byte-match-set-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.create-byte-match-set-request/name :portkey.aws.waf-regional/change-token] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional/update-regex-match-set-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/change-token]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/update-xss-match-set-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/change-token]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/create-regex-match-set-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/regex-match-set :portkey.aws.waf-regional/change-token]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.get-regex-pattern-set-request/regex-pattern-set-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional/get-regex-pattern-set-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.get-regex-pattern-set-request/regex-pattern-set-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional.update-sql-injection-match-set-request/sql-injection-match-set-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional.update-sql-injection-match-set-request/updates (clojure.spec.alpha/and :portkey.aws.waf-regional/sql-injection-match-set-updates))
(clojure.spec.alpha/def :portkey.aws.waf-regional/update-sql-injection-match-set-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.update-sql-injection-match-set-request/sql-injection-match-set-id :portkey.aws.waf-regional/change-token :portkey.aws.waf-regional.update-sql-injection-match-set-request/updates] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional/waf-invalid-account-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional.web-acl/web-acl-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional.web-acl/name (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-name))
(clojure.spec.alpha/def :portkey.aws.waf-regional.web-acl/default-action (clojure.spec.alpha/and :portkey.aws.waf-regional/waf-action))
(clojure.spec.alpha/def :portkey.aws.waf-regional.web-acl/rules (clojure.spec.alpha/and :portkey.aws.waf-regional/activated-rules))
(clojure.spec.alpha/def :portkey.aws.waf-regional/web-acl (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.web-acl/web-acl-id :portkey.aws.waf-regional.web-acl/default-action :portkey.aws.waf-regional.web-acl/rules] :opt-un [:portkey.aws.waf-regional.web-acl/name :portkey.aws.waf-regional/metric-name]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.delete-sql-injection-match-set-request/sql-injection-match-set-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional/delete-sql-injection-match-set-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.delete-sql-injection-match-set-request/sql-injection-match-set-id :portkey.aws.waf-regional/change-token] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional/regex-pattern-strings (clojure.spec.alpha/coll-of :portkey.aws.waf-regional/regex-pattern-string :max-count 10))

(clojure.spec.alpha/def :portkey.aws.waf-regional.list-rules-response/rules (clojure.spec.alpha/and :portkey.aws.waf-regional/rule-summaries))
(clojure.spec.alpha/def :portkey.aws.waf-regional/list-rules-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/next-marker :portkey.aws.waf-regional.list-rules-response/rules]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.create-rule-group-request/name (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-name))
(clojure.spec.alpha/def :portkey.aws.waf-regional/create-rule-group-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.create-rule-group-request/name :portkey.aws.waf-regional/metric-name :portkey.aws.waf-regional/change-token] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional/activated-rules (clojure.spec.alpha/coll-of :portkey.aws.waf-regional/activated-rule))

(clojure.spec.alpha/def :portkey.aws.waf-regional/text-transformation #{"HTML_ENTITY_DECODE" :compress-white-space :lowercase "URL_DECODE" "LOWERCASE" "NONE" :html-entity-decode "COMPRESS_WHITE_SPACE" "CMD_LINE" :url-decode :cmd-line :none})

(clojure.spec.alpha/def :portkey.aws.waf-regional/geo-match-constraint-type #{"Country" :country})

(clojure.spec.alpha/def :portkey.aws.waf-regional.regex-pattern-set/regex-pattern-set-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional.regex-pattern-set/name (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-name))
(clojure.spec.alpha/def :portkey.aws.waf-regional/regex-pattern-set (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.regex-pattern-set/regex-pattern-set-id :portkey.aws.waf-regional/regex-pattern-strings] :opt-un [:portkey.aws.waf-regional.regex-pattern-set/name]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/regex-match-set-summaries (clojure.spec.alpha/coll-of :portkey.aws.waf-regional/regex-match-set-summary))

(clojure.spec.alpha/def :portkey.aws.waf-regional.list-ip-sets-request/limit (clojure.spec.alpha/and :portkey.aws.waf-regional/pagination-limit))
(clojure.spec.alpha/def :portkey.aws.waf-regional/list-ip-sets-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/next-marker :portkey.aws.waf-regional.list-ip-sets-request/limit]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/subscribed-rule-group-summaries (clojure.spec.alpha/coll-of :portkey.aws.waf-regional/subscribed-rule-group-summary))

(clojure.spec.alpha/def :portkey.aws.waf-regional/rule-priority clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.waf-regional.byte-match-tuple/target-string (clojure.spec.alpha/and :portkey.aws.waf-regional/byte-match-target-string))
(clojure.spec.alpha/def :portkey.aws.waf-regional/byte-match-tuple (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional/field-to-match :portkey.aws.waf-regional.byte-match-tuple/target-string :portkey.aws.waf-regional/text-transformation :portkey.aws.waf-regional/positional-constraint] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional/country (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.waf-regional.get-sampled-requests-request/web-acl-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional.get-sampled-requests-request/rule-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional.get-sampled-requests-request/max-items (clojure.spec.alpha/and :portkey.aws.waf-regional/get-sampled-requests-max-items))
(clojure.spec.alpha/def :portkey.aws.waf-regional/get-sampled-requests-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.get-sampled-requests-request/web-acl-id :portkey.aws.waf-regional.get-sampled-requests-request/rule-id :portkey.aws.waf-regional/time-window :portkey.aws.waf-regional.get-sampled-requests-request/max-items] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional.waf-internal-error-exception/message (clojure.spec.alpha/and :portkey.aws.waf-regional/error-message))
(clojure.spec.alpha/def :portkey.aws.waf-regional/waf-internal-error-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional.waf-internal-error-exception/message]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/waf-action-type #{:block "COUNT" "BLOCK" :allow :count "ALLOW"})

(clojure.spec.alpha/def :portkey.aws.waf-regional/geo-match-constraints (clojure.spec.alpha/coll-of :portkey.aws.waf-regional/geo-match-constraint))

(clojure.spec.alpha/def :portkey.aws.waf-regional/regex-pattern-set-summaries (clojure.spec.alpha/coll-of :portkey.aws.waf-regional/regex-pattern-set-summary))

(clojure.spec.alpha/def :portkey.aws.waf-regional.geo-match-constraint/type (clojure.spec.alpha/and :portkey.aws.waf-regional/geo-match-constraint-type))
(clojure.spec.alpha/def :portkey.aws.waf-regional.geo-match-constraint/value (clojure.spec.alpha/and :portkey.aws.waf-regional/geo-match-constraint-value))
(clojure.spec.alpha/def :portkey.aws.waf-regional/geo-match-constraint (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.geo-match-constraint/type :portkey.aws.waf-regional.geo-match-constraint/value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional.waf-invalid-operation-exception/message (clojure.spec.alpha/and :portkey.aws.waf-regional/error-message))
(clojure.spec.alpha/def :portkey.aws.waf-regional/waf-invalid-operation-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional.waf-invalid-operation-exception/message]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.field-to-match/type (clojure.spec.alpha/and :portkey.aws.waf-regional/match-field-type))
(clojure.spec.alpha/def :portkey.aws.waf-regional.field-to-match/data (clojure.spec.alpha/and :portkey.aws.waf-regional/match-field-data))
(clojure.spec.alpha/def :portkey.aws.waf-regional/field-to-match (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.field-to-match/type] :opt-un [:portkey.aws.waf-regional.field-to-match/data]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/delete-sql-injection-match-set-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/change-token]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/geo-match-set-summaries (clojure.spec.alpha/coll-of :portkey.aws.waf-regional/geo-match-set-summary))

(clojure.spec.alpha/def :portkey.aws.waf-regional.ip-set-summary/ip-set-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional.ip-set-summary/name (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-name))
(clojure.spec.alpha/def :portkey.aws.waf-regional/ip-set-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.ip-set-summary/ip-set-id :portkey.aws.waf-regional.ip-set-summary/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional.waf-override-action/type (clojure.spec.alpha/and :portkey.aws.waf-regional/waf-override-action-type))
(clojure.spec.alpha/def :portkey.aws.waf-regional/waf-override-action (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.waf-override-action/type] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional.associate-web-acl-request/web-acl-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional/associate-web-acl-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.associate-web-acl-request/web-acl-id :portkey.aws.waf-regional/resource-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional/get-xss-match-set-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/xss-match-set]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/header-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.waf-regional.create-regex-match-set-request/name (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-name))
(clojure.spec.alpha/def :portkey.aws.waf-regional/create-regex-match-set-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.create-regex-match-set-request/name :portkey.aws.waf-regional/change-token] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional.ip-set/ip-set-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional.ip-set/name (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-name))
(clojure.spec.alpha/def :portkey.aws.waf-regional/ip-set (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.ip-set/ip-set-id :portkey.aws.waf-regional/ip-set-descriptors] :opt-un [:portkey.aws.waf-regional.ip-set/name]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.rule-summary/rule-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional.rule-summary/name (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-name))
(clojure.spec.alpha/def :portkey.aws.waf-regional/rule-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.rule-summary/rule-id :portkey.aws.waf-regional.rule-summary/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional/update-sql-injection-match-set-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/change-token]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/delete-rule-group-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/change-token]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/uri-string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.waf-regional.list-xss-match-sets-response/xss-match-sets (clojure.spec.alpha/and :portkey.aws.waf-regional/xss-match-set-summaries))
(clojure.spec.alpha/def :portkey.aws.waf-regional/list-xss-match-sets-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/next-marker :portkey.aws.waf-regional.list-xss-match-sets-response/xss-match-sets]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.waf-regional.geo-match-set-summary/geo-match-set-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional.geo-match-set-summary/name (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-name))
(clojure.spec.alpha/def :portkey.aws.waf-regional/geo-match-set-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.geo-match-set-summary/geo-match-set-id :portkey.aws.waf-regional.geo-match-set-summary/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional.get-xss-match-set-request/xss-match-set-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional/get-xss-match-set-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.get-xss-match-set-request/xss-match-set-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional/delete-permission-policy-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional/parameter-exception-reason #{:illegal-combination "ILLEGAL_COMBINATION" "INVALID_OPTION" :invalid-option})

(clojure.spec.alpha/def :portkey.aws.waf-regional/create-sql-injection-match-set-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/sql-injection-match-set :portkey.aws.waf-regional/change-token]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/size-constraint (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional/field-to-match :portkey.aws.waf-regional/text-transformation :portkey.aws.waf-regional/comparison-operator :portkey.aws.waf-regional/size] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional/delete-logging-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional/resource-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional.get-web-acl-request/web-acl-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional/get-web-acl-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.get-web-acl-request/web-acl-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional.list-rate-based-rules-request/limit (clojure.spec.alpha/and :portkey.aws.waf-regional/pagination-limit))
(clojure.spec.alpha/def :portkey.aws.waf-regional/list-rate-based-rules-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/next-marker :portkey.aws.waf-regional.list-rate-based-rules-request/limit]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/delete-regex-match-set-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/change-token]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/put-permission-policy-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional.create-ip-set-request/name (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-name))
(clojure.spec.alpha/def :portkey.aws.waf-regional/create-ip-set-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.create-ip-set-request/name :portkey.aws.waf-regional/change-token] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional.waf-invalid-regex-pattern-exception/message (clojure.spec.alpha/and :portkey.aws.waf-regional/error-message))
(clojure.spec.alpha/def :portkey.aws.waf-regional/waf-invalid-regex-pattern-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional.waf-invalid-regex-pattern-exception/message]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.ip-set-update/action (clojure.spec.alpha/and :portkey.aws.waf-regional/change-action))
(clojure.spec.alpha/def :portkey.aws.waf-regional/ip-set-update (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.ip-set-update/action :portkey.aws.waf-regional/ip-set-descriptor] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional.delete-rate-based-rule-request/rule-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional/delete-rate-based-rule-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.delete-rate-based-rule-request/rule-id :portkey.aws.waf-regional/change-token] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional/update-regex-pattern-set-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/change-token]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/rate-key #{:ip "IP"})

(clojure.spec.alpha/def :portkey.aws.waf-regional/change-action #{"DELETE" :insert :delete "INSERT"})

(clojure.spec.alpha/def :portkey.aws.waf-regional/ip-set-descriptor-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.waf-regional.update-rule-request/rule-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional.update-rule-request/updates (clojure.spec.alpha/and :portkey.aws.waf-regional/rule-updates))
(clojure.spec.alpha/def :portkey.aws.waf-regional/update-rule-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.update-rule-request/rule-id :portkey.aws.waf-regional/change-token :portkey.aws.waf-regional.update-rule-request/updates] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional/rule-group-summaries (clojure.spec.alpha/coll-of :portkey.aws.waf-regional/rule-group-summary))

(clojure.spec.alpha/def :portkey.aws.waf-regional.list-resources-for-web-acl-request/web-acl-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional/list-resources-for-web-acl-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.list-resources-for-web-acl-request/web-acl-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional.geo-match-set/geo-match-set-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional.geo-match-set/name (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-name))
(clojure.spec.alpha/def :portkey.aws.waf-regional/geo-match-set (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.geo-match-set/geo-match-set-id :portkey.aws.waf-regional/geo-match-constraints] :opt-un [:portkey.aws.waf-regional.geo-match-set/name]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.delete-geo-match-set-request/geo-match-set-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional/delete-geo-match-set-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.delete-geo-match-set-request/geo-match-set-id :portkey.aws.waf-regional/change-token] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional/delete-logging-configuration-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional.waf-nonexistent-item-exception/message (clojure.spec.alpha/and :portkey.aws.waf-regional/error-message))
(clojure.spec.alpha/def :portkey.aws.waf-regional/waf-nonexistent-item-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional.waf-nonexistent-item-exception/message]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/get-permission-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional/resource-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional/get-rule-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/rule]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.list-geo-match-sets-response/geo-match-sets (clojure.spec.alpha/and :portkey.aws.waf-regional/geo-match-set-summaries))
(clojure.spec.alpha/def :portkey.aws.waf-regional/list-geo-match-sets-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/next-marker :portkey.aws.waf-regional.list-geo-match-sets-response/geo-match-sets]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/comparison-operator #{:ge :eq "NE" "LT" "GE" "LE" :gt "EQ" :ne "GT" :le :lt})

(clojure.spec.alpha/def :portkey.aws.waf-regional/regex-pattern-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__)))))

(clojure.spec.alpha/def :portkey.aws.waf-regional/sql-injection-match-set-updates (clojure.spec.alpha/coll-of :portkey.aws.waf-regional/sql-injection-match-set-update :min-count 1))

(clojure.spec.alpha/def :portkey.aws.waf-regional/get-byte-match-set-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/byte-match-set]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/web-acl-updates (clojure.spec.alpha/coll-of :portkey.aws.waf-regional/web-acl-update))

(clojure.spec.alpha/def :portkey.aws.waf-regional.create-rule-request/name (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-name))
(clojure.spec.alpha/def :portkey.aws.waf-regional/create-rule-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.create-rule-request/name :portkey.aws.waf-regional/metric-name :portkey.aws.waf-regional/change-token] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional.byte-match-set-update/action (clojure.spec.alpha/and :portkey.aws.waf-regional/change-action))
(clojure.spec.alpha/def :portkey.aws.waf-regional/byte-match-set-update (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.byte-match-set-update/action :portkey.aws.waf-regional/byte-match-tuple] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional/resource-arns (clojure.spec.alpha/coll-of :portkey.aws.waf-regional/resource-arn))

(clojure.spec.alpha/def :portkey.aws.waf-regional.waf-nonexistent-container-exception/message (clojure.spec.alpha/and :portkey.aws.waf-regional/error-message))
(clojure.spec.alpha/def :portkey.aws.waf-regional/waf-nonexistent-container-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional.waf-nonexistent-container-exception/message]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.waf-stale-data-exception/message (clojure.spec.alpha/and :portkey.aws.waf-regional/error-message))
(clojure.spec.alpha/def :portkey.aws.waf-regional/waf-stale-data-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional.waf-stale-data-exception/message]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/get-logging-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional/resource-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional.waf-referenced-item-exception/message (clojure.spec.alpha/and :portkey.aws.waf-regional/error-message))
(clojure.spec.alpha/def :portkey.aws.waf-regional/waf-referenced-item-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional.waf-referenced-item-exception/message]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.list-web-ac-ls-request/limit (clojure.spec.alpha/and :portkey.aws.waf-regional/pagination-limit))
(clojure.spec.alpha/def :portkey.aws.waf-regional/list-web-ac-ls-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/next-marker :portkey.aws.waf-regional.list-web-ac-ls-request/limit]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.list-regex-match-sets-request/limit (clojure.spec.alpha/and :portkey.aws.waf-regional/pagination-limit))
(clojure.spec.alpha/def :portkey.aws.waf-regional/list-regex-match-sets-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/next-marker :portkey.aws.waf-regional.list-regex-match-sets-request/limit]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/update-rule-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/change-token]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/create-size-constraint-set-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/size-constraint-set :portkey.aws.waf-regional/change-token]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/update-ip-set-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/change-token]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/delete-rule-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/change-token]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.create-xss-match-set-request/name (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-name))
(clojure.spec.alpha/def :portkey.aws.waf-regional/create-xss-match-set-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.create-xss-match-set-request/name :portkey.aws.waf-regional/change-token] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional.sampled-http-request/request (clojure.spec.alpha/and :portkey.aws.waf-regional/http-request))
(clojure.spec.alpha/def :portkey.aws.waf-regional.sampled-http-request/weight (clojure.spec.alpha/and :portkey.aws.waf-regional/sample-weight))
(clojure.spec.alpha/def :portkey.aws.waf-regional.sampled-http-request/rule-within-rule-group (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional/sampled-http-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.sampled-http-request/request :portkey.aws.waf-regional.sampled-http-request/weight] :opt-un [:portkey.aws.waf-regional/timestamp :portkey.aws.waf-regional/action :portkey.aws.waf-regional.sampled-http-request/rule-within-rule-group]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/delete-xss-match-set-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/change-token]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.update-ip-set-request/ip-set-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional.update-ip-set-request/updates (clojure.spec.alpha/and :portkey.aws.waf-regional/ip-set-updates))
(clojure.spec.alpha/def :portkey.aws.waf-regional/update-ip-set-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.update-ip-set-request/ip-set-id :portkey.aws.waf-regional/change-token :portkey.aws.waf-regional.update-ip-set-request/updates] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional/sql-injection-match-tuple (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional/field-to-match :portkey.aws.waf-regional/text-transformation] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional/put-logging-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional/logging-configuration] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional/create-web-acl-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/web-acl :portkey.aws.waf-regional/change-token]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.regex-pattern-set-summary/regex-pattern-set-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional.regex-pattern-set-summary/name (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-name))
(clojure.spec.alpha/def :portkey.aws.waf-regional/regex-pattern-set-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.regex-pattern-set-summary/regex-pattern-set-id :portkey.aws.waf-regional.regex-pattern-set-summary/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional.list-web-ac-ls-response/web-ac-ls (clojure.spec.alpha/and :portkey.aws.waf-regional/web-acl-summaries))
(clojure.spec.alpha/def :portkey.aws.waf-regional/list-web-ac-ls-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/next-marker :portkey.aws.waf-regional.list-web-ac-ls-response/web-ac-ls]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/ip-set-descriptor-type #{:ipv-4 "IPV4" :ipv-6 "IPV6"})

(clojure.spec.alpha/def :portkey.aws.waf-regional.list-sql-injection-match-sets-response/sql-injection-match-sets (clojure.spec.alpha/and :portkey.aws.waf-regional/sql-injection-match-set-summaries))
(clojure.spec.alpha/def :portkey.aws.waf-regional/list-sql-injection-match-sets-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/next-marker :portkey.aws.waf-regional.list-sql-injection-match-sets-response/sql-injection-match-sets]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.time-window/start-time (clojure.spec.alpha/and :portkey.aws.waf-regional/timestamp))
(clojure.spec.alpha/def :portkey.aws.waf-regional.time-window/end-time (clojure.spec.alpha/and :portkey.aws.waf-regional/timestamp))
(clojure.spec.alpha/def :portkey.aws.waf-regional/time-window (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.time-window/start-time :portkey.aws.waf-regional.time-window/end-time] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional/get-change-token-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional.list-rule-groups-response/rule-groups (clojure.spec.alpha/and :portkey.aws.waf-regional/rule-group-summaries))
(clojure.spec.alpha/def :portkey.aws.waf-regional/list-rule-groups-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/next-marker :portkey.aws.waf-regional.list-rule-groups-response/rule-groups]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.waf-non-empty-entity-exception/message (clojure.spec.alpha/and :portkey.aws.waf-regional/error-message))
(clojure.spec.alpha/def :portkey.aws.waf-regional/waf-non-empty-entity-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional.waf-non-empty-entity-exception/message]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/policy-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__)))))

(clojure.spec.alpha/def :portkey.aws.waf-regional/redacted-fields (clojure.spec.alpha/coll-of :portkey.aws.waf-regional/field-to-match))

(clojure.spec.alpha/def :portkey.aws.waf-regional/get-regex-pattern-set-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/regex-pattern-set]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/get-ip-set-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/ip-set]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/delete-web-acl-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/change-token]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/pagination-limit (clojure.spec.alpha/int-in 0 100))

(clojure.spec.alpha/def :portkey.aws.waf-regional.update-web-acl-request/web-acl-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional.update-web-acl-request/updates (clojure.spec.alpha/and :portkey.aws.waf-regional/web-acl-updates))
(clojure.spec.alpha/def :portkey.aws.waf-regional.update-web-acl-request/default-action (clojure.spec.alpha/and :portkey.aws.waf-regional/waf-action))
(clojure.spec.alpha/def :portkey.aws.waf-regional/update-web-acl-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.update-web-acl-request/web-acl-id :portkey.aws.waf-regional/change-token] :opt-un [:portkey.aws.waf-regional.update-web-acl-request/updates :portkey.aws.waf-regional.update-web-acl-request/default-action]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.rule-group-update/action (clojure.spec.alpha/and :portkey.aws.waf-regional/change-action))
(clojure.spec.alpha/def :portkey.aws.waf-regional/rule-group-update (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.rule-group-update/action :portkey.aws.waf-regional/activated-rule] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional.get-rate-based-rule-response/rule (clojure.spec.alpha/and :portkey.aws.waf-regional/rate-based-rule))
(clojure.spec.alpha/def :portkey.aws.waf-regional/get-rate-based-rule-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional.get-rate-based-rule-response/rule]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/web-acl-summaries (clojure.spec.alpha/coll-of :portkey.aws.waf-regional/web-acl-summary))

(clojure.spec.alpha/def :portkey.aws.waf-regional/list-activated-rules-in-rule-group-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/next-marker :portkey.aws.waf-regional/activated-rules]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.size-constraint-set-summary/size-constraint-set-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional.size-constraint-set-summary/name (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-name))
(clojure.spec.alpha/def :portkey.aws.waf-regional/size-constraint-set-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.size-constraint-set-summary/size-constraint-set-id :portkey.aws.waf-regional.size-constraint-set-summary/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional.create-geo-match-set-request/name (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-name))
(clojure.spec.alpha/def :portkey.aws.waf-regional/create-geo-match-set-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.create-geo-match-set-request/name :portkey.aws.waf-regional/change-token] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional/size-constraint-set-summaries (clojure.spec.alpha/coll-of :portkey.aws.waf-regional/size-constraint-set-summary))

(clojure.spec.alpha/def :portkey.aws.waf-regional/header-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.waf-regional/population-size clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.waf-regional/resource-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.waf-regional/put-logging-configuration-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/logging-configuration]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/parameter-exception-parameter (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__)))))

(clojure.spec.alpha/def :portkey.aws.waf-regional/disassociate-web-acl-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional/log-destination-configs (clojure.spec.alpha/coll-of :portkey.aws.waf-regional/resource-arn :min-count 1 :max-count 1))

(clojure.spec.alpha/def :portkey.aws.waf-regional/get-logging-configuration-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/logging-configuration]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.rule-update/action (clojure.spec.alpha/and :portkey.aws.waf-regional/change-action))
(clojure.spec.alpha/def :portkey.aws.waf-regional/rule-update (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.rule-update/action :portkey.aws.waf-regional/predicate] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional/update-byte-match-set-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/change-token]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.delete-regex-match-set-request/regex-match-set-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional/delete-regex-match-set-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.delete-regex-match-set-request/regex-match-set-id :portkey.aws.waf-regional/change-token] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional/xss-match-tuple (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional/field-to-match :portkey.aws.waf-regional/text-transformation] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional.list-subscribed-rule-groups-response/rule-groups (clojure.spec.alpha/and :portkey.aws.waf-regional/subscribed-rule-group-summaries))
(clojure.spec.alpha/def :portkey.aws.waf-regional/list-subscribed-rule-groups-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/next-marker :portkey.aws.waf-regional.list-subscribed-rule-groups-response/rule-groups]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/byte-match-set-updates (clojure.spec.alpha/coll-of :portkey.aws.waf-regional/byte-match-set-update :min-count 1))

(clojure.spec.alpha/def :portkey.aws.waf-regional/http-version (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.waf-regional.xss-match-set-summary/xss-match-set-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional.xss-match-set-summary/name (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-name))
(clojure.spec.alpha/def :portkey.aws.waf-regional/xss-match-set-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.xss-match-set-summary/xss-match-set-id :portkey.aws.waf-regional.xss-match-set-summary/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional/update-geo-match-set-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/change-token]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.regex-match-set-summary/regex-match-set-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional.regex-match-set-summary/name (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-name))
(clojure.spec.alpha/def :portkey.aws.waf-regional/regex-match-set-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.regex-match-set-summary/regex-match-set-id :portkey.aws.waf-regional.regex-match-set-summary/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional.update-geo-match-set-request/geo-match-set-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional.update-geo-match-set-request/updates (clojure.spec.alpha/and :portkey.aws.waf-regional/geo-match-set-updates))
(clojure.spec.alpha/def :portkey.aws.waf-regional/update-geo-match-set-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.update-geo-match-set-request/geo-match-set-id :portkey.aws.waf-regional/change-token :portkey.aws.waf-regional.update-geo-match-set-request/updates] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional/xss-match-tuples (clojure.spec.alpha/coll-of :portkey.aws.waf-regional/xss-match-tuple))

(clojure.spec.alpha/def :portkey.aws.waf-regional/get-web-acl-for-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional/resource-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional/ip-set-summaries (clojure.spec.alpha/coll-of :portkey.aws.waf-regional/ip-set-summary))

(clojure.spec.alpha/def :portkey.aws.waf-regional.waf-limits-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.waf-regional/error-message))
(clojure.spec.alpha/def :portkey.aws.waf-regional/waf-limits-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional.waf-limits-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/get-change-token-status-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional/change-token] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional/size-constraints (clojure.spec.alpha/coll-of :portkey.aws.waf-regional/size-constraint))

(clojure.spec.alpha/def :portkey.aws.waf-regional.rate-based-rule/rule-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional.rate-based-rule/name (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-name))
(clojure.spec.alpha/def :portkey.aws.waf-regional.rate-based-rule/match-predicates (clojure.spec.alpha/and :portkey.aws.waf-regional/predicates))
(clojure.spec.alpha/def :portkey.aws.waf-regional/rate-based-rule (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.rate-based-rule/rule-id :portkey.aws.waf-regional.rate-based-rule/match-predicates :portkey.aws.waf-regional/rate-key :portkey.aws.waf-regional/rate-limit] :opt-un [:portkey.aws.waf-regional.rate-based-rule/name :portkey.aws.waf-regional/metric-name]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/http-headers (clojure.spec.alpha/coll-of :portkey.aws.waf-regional/http-header))

(clojure.spec.alpha/def :portkey.aws.waf-regional.list-rate-based-rules-response/rules (clojure.spec.alpha/and :portkey.aws.waf-regional/rule-summaries))
(clojure.spec.alpha/def :portkey.aws.waf-regional/list-rate-based-rules-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/next-marker :portkey.aws.waf-regional.list-rate-based-rules-response/rules]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/create-byte-match-set-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/byte-match-set :portkey.aws.waf-regional/change-token]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/disassociate-web-acl-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional/resource-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional.waf-action/type (clojure.spec.alpha/and :portkey.aws.waf-regional/waf-action-type))
(clojure.spec.alpha/def :portkey.aws.waf-regional/waf-action (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.waf-action/type] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional.delete-rule-request/rule-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional/delete-rule-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.delete-rule-request/rule-id :portkey.aws.waf-regional/change-token] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional/delete-ip-set-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/change-token]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.list-xss-match-sets-request/limit (clojure.spec.alpha/and :portkey.aws.waf-regional/pagination-limit))
(clojure.spec.alpha/def :portkey.aws.waf-regional/list-xss-match-sets-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/next-marker :portkey.aws.waf-regional.list-xss-match-sets-request/limit]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.waf-subscription-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.waf-regional/error-message))
(clojure.spec.alpha/def :portkey.aws.waf-regional/waf-subscription-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional.waf-subscription-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/delete-size-constraint-set-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/change-token]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/regex-pattern-set-updates (clojure.spec.alpha/coll-of :portkey.aws.waf-regional/regex-pattern-set-update :min-count 1))

(clojure.spec.alpha/def :portkey.aws.waf-regional/get-geo-match-set-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/geo-match-set]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.ip-set-descriptor/type (clojure.spec.alpha/and :portkey.aws.waf-regional/ip-set-descriptor-type))
(clojure.spec.alpha/def :portkey.aws.waf-regional.ip-set-descriptor/value (clojure.spec.alpha/and :portkey.aws.waf-regional/ip-set-descriptor-value))
(clojure.spec.alpha/def :portkey.aws.waf-regional/ip-set-descriptor (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.ip-set-descriptor/type :portkey.aws.waf-regional.ip-set-descriptor/value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional.size-constraint-set-update/action (clojure.spec.alpha/and :portkey.aws.waf-regional/change-action))
(clojure.spec.alpha/def :portkey.aws.waf-regional/size-constraint-set-update (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.size-constraint-set-update/action :portkey.aws.waf-regional/size-constraint] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional/rule-summaries (clojure.spec.alpha/coll-of :portkey.aws.waf-regional/rule-summary))

(clojure.spec.alpha/def :portkey.aws.waf-regional.rule-group/rule-group-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional.rule-group/name (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-name))
(clojure.spec.alpha/def :portkey.aws.waf-regional/rule-group (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.rule-group/rule-group-id] :opt-un [:portkey.aws.waf-regional.rule-group/name :portkey.aws.waf-regional/metric-name]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.list-size-constraint-sets-request/limit (clojure.spec.alpha/and :portkey.aws.waf-regional/pagination-limit))
(clojure.spec.alpha/def :portkey.aws.waf-regional/list-size-constraint-sets-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/next-marker :portkey.aws.waf-regional.list-size-constraint-sets-request/limit]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/create-geo-match-set-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/geo-match-set :portkey.aws.waf-regional/change-token]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/delete-permission-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional/resource-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional.delete-regex-pattern-set-request/regex-pattern-set-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional/delete-regex-pattern-set-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.delete-regex-pattern-set-request/regex-pattern-set-id :portkey.aws.waf-regional/change-token] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional/delete-byte-match-set-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/change-token]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/update-rule-group-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/change-token]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.waf-invalid-permission-policy-exception/message (clojure.spec.alpha/and :portkey.aws.waf-regional/error-message))
(clojure.spec.alpha/def :portkey.aws.waf-regional/waf-invalid-permission-policy-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional.waf-invalid-permission-policy-exception/message]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.get-sampled-requests-response/sampled-requests (clojure.spec.alpha/and :portkey.aws.waf-regional/sampled-http-requests))
(clojure.spec.alpha/def :portkey.aws.waf-regional/get-sampled-requests-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional.get-sampled-requests-response/sampled-requests :portkey.aws.waf-regional/population-size :portkey.aws.waf-regional/time-window]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.subscribed-rule-group-summary/rule-group-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional.subscribed-rule-group-summary/name (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-name))
(clojure.spec.alpha/def :portkey.aws.waf-regional/subscribed-rule-group-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.subscribed-rule-group-summary/rule-group-id :portkey.aws.waf-regional.subscribed-rule-group-summary/name :portkey.aws.waf-regional/metric-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional.xss-match-set-update/action (clojure.spec.alpha/and :portkey.aws.waf-regional/change-action))
(clojure.spec.alpha/def :portkey.aws.waf-regional/xss-match-set-update (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.xss-match-set-update/action :portkey.aws.waf-regional/xss-match-tuple] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional/ip-set-descriptors (clojure.spec.alpha/coll-of :portkey.aws.waf-regional/ip-set-descriptor))

(clojure.spec.alpha/def :portkey.aws.waf-regional.list-rule-groups-request/limit (clojure.spec.alpha/and :portkey.aws.waf-regional/pagination-limit))
(clojure.spec.alpha/def :portkey.aws.waf-regional/list-rule-groups-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/next-marker :portkey.aws.waf-regional.list-rule-groups-request/limit]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/regex-match-set-updates (clojure.spec.alpha/coll-of :portkey.aws.waf-regional/regex-match-set-update :min-count 1))

(clojure.spec.alpha/def :portkey.aws.waf-regional.web-acl-summary/web-acl-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional.web-acl-summary/name (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-name))
(clojure.spec.alpha/def :portkey.aws.waf-regional/web-acl-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.web-acl-summary/web-acl-id :portkey.aws.waf-regional.web-acl-summary/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional.update-byte-match-set-request/byte-match-set-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional.update-byte-match-set-request/updates (clojure.spec.alpha/and :portkey.aws.waf-regional/byte-match-set-updates))
(clojure.spec.alpha/def :portkey.aws.waf-regional/update-byte-match-set-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.update-byte-match-set-request/byte-match-set-id :portkey.aws.waf-regional/change-token :portkey.aws.waf-regional.update-byte-match-set-request/updates] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional/create-xss-match-set-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/xss-match-set :portkey.aws.waf-regional/change-token]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/update-rate-based-rule-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/change-token]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/resource-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.waf-regional.get-regex-match-set-request/regex-match-set-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional/get-regex-match-set-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.get-regex-match-set-request/regex-match-set-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional.get-rule-request/rule-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional/get-rule-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.get-rule-request/rule-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional/size clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.waf-regional/ip-set-updates (clojure.spec.alpha/coll-of :portkey.aws.waf-regional/ip-set-update :min-count 1))

(clojure.spec.alpha/def :portkey.aws.waf-regional/get-size-constraint-set-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/size-constraint-set]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.waf-unavailable-entity-exception/message (clojure.spec.alpha/and :portkey.aws.waf-regional/error-message))
(clojure.spec.alpha/def :portkey.aws.waf-regional/waf-unavailable-entity-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional.waf-unavailable-entity-exception/message]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.update-regex-match-set-request/regex-match-set-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional.update-regex-match-set-request/updates (clojure.spec.alpha/and :portkey.aws.waf-regional/regex-match-set-updates))
(clojure.spec.alpha/def :portkey.aws.waf-regional/update-regex-match-set-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.update-regex-match-set-request/regex-match-set-id :portkey.aws.waf-regional.update-regex-match-set-request/updates :portkey.aws.waf-regional/change-token] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional.waf-disallowed-name-exception/message (clojure.spec.alpha/and :portkey.aws.waf-regional/error-message))
(clojure.spec.alpha/def :portkey.aws.waf-regional/waf-disallowed-name-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional.waf-disallowed-name-exception/message]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/managed-keys (clojure.spec.alpha/coll-of :portkey.aws.waf-regional/managed-key))

(clojure.spec.alpha/def :portkey.aws.waf-regional/update-size-constraint-set-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/change-token]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/geo-match-constraint-value #{:mm "CR" :tw "TG" :fr "TJ" "ZA" "IM" "PE" :ni :bd "LC" :gh "CH" :kp :mh "RU" :tv :gu :bt "MP" "CK" "SI" :lr "AU" "KR" "IT" "FI" :gn "GF" :ge :az "SC" "SX" :fo "TT" :kh "TK" :rw :sz "MY" "SY" "MN" "TF" "KP" :ma "AM" :ws "DZ" :mv :hr "UY" :gp :es :io "TD" "DJ" :pt :vg :cz "BI" "MK" :gm "MU" "LI" :pg :pe :pk "NU" :lu "GR" "GY" :fi "CG" :ax :bz :ga :pf "NF" :do "ML" "AX" "GM" :cl "SA" :ye :au "CX" "BH" :bb "NE" :er :bi :tl "BN" "MF" "CD" "DK" :is :be "BJ" :ug :ba :tc :cv :kg "ME" "SJ" :dk "BO" :sm "JO" "CV" "VE" "CI" :gb "UZ" :cu :mo :dm "TN" :cd "IS" :ca :as :ro :sy :nc :td :li :ai :tz :sl "EH" :bj "TM" "GA" :th "LS" "TZ" :jp :ua "AT" :tr :et :lc :re :bl :aw :lk :us "LT" :hu "NP" :sg "BG" :mw "IL" "GU" "PK" :ec :mr :uz "PT" :gg "HR" "VU" "PF" "BM" :cr "MR" "GE" "HU" "TW" "MM" :nz :tn :gy :fj :ci :cc :la "VG" "YE" :so :kn "SR" :mq "PN" :zw :af "VA" "PR" "KW" :sa "SE" "GB" :cg :tf :pl "UM" "VN" "CF" "PA" "VC" :gq "JP" :ls :je "IR" :zm "AF" :vn "LY" :tj "MZ" "RO" "QA" "CM" "GG" :dj "BY" :ch :kw :am "SD" :ck "BQ" "MO" "KY" :tm "AR" :jo :sb :mf :eh :it :ht :om "BR" :cm "ZW" :bh "NR" "NZ" "AW" :gr :pw :gw "FJ" :co :ml "ID" "SV" "CN" :tt "FM" :uy "HT" "CC" "RW" "BA" :nu :mk "TL" :rs :nl "JM" "KM" :mz "KE" "WS" "TO" :bv "PY" "SH" :iq "CY" :sj :bf "GH" "MA" :vc "SG" :bn "LK" :gd "PH" "SM" :lb :pa :va "WF" "TR" "PS" "BZ" "CU" "TV" :za :mn "AD" "SB" "DM" "LR" :np :al "OM" "SO" :sk :kz :na :ie "DO" :ag :st "AL" "BL" :de "FR" "GW" :qa :nr :cx :id "MS" "BB" "CA" :mx :gt :pm :jm "MG" :cy :ar "KH" "LA" :at "GP" "BV" "HN" :aq "TH" :ke "DE" "LB" :gf "KZ" "AS" "EC" :ao :il "NO" :cf "AO" "FK" :ss "ET" "GS" "MD" :ru :gl :se "AG" "BE" :ph :bs "MV" "SZ" "CZ" "CL" :gi "BT" :sc "NL" :sd "EG" :sx :ve :sn "MQ" :bw :km :ee "SN" :by "FO" :br "EE" "AQ" "ST" "KN" "BW" "MH" "NI" "PG" :sv "VI" :sh "IQ" :mu :ne "KG" :hk :dz :mg "US" "ZM" "MC" "GI" "NC" :hm "GT" :mc :eg "BF" "YT" :ir :fk "LU" :me "UA" :ki "IE" "LV" "GD" :bm :ad "MW" :ae :my "BS" :bg :lt :ms "AZ" :bq :wf "SK" :hn :um :ng :pr "GQ" "TC" :py :yt "RE" "IN" "ES" :ly "GL" :lv :gs :tk "KI" :mt :mp "HK" :kr "CO" "SS" "RS" "IO" :im "NG" :cw :fm :pn :sr "UG" "CW" "SL" :si "ER" "JE" :tg :cn "AE" :vi "HM" :no :ps "PM" "BD" "MT" "AI" :bo "GN" :in "PW" :vu :md :to "NA" "MX" :nf :ky "PL"})

(clojure.spec.alpha/def :portkey.aws.waf-regional/create-regex-pattern-set-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/regex-pattern-set :portkey.aws.waf-regional/change-token]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.http-header/name (clojure.spec.alpha/and :portkey.aws.waf-regional/header-name))
(clojure.spec.alpha/def :portkey.aws.waf-regional.http-header/value (clojure.spec.alpha/and :portkey.aws.waf-regional/header-value))
(clojure.spec.alpha/def :portkey.aws.waf-regional/http-header (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional.http-header/name :portkey.aws.waf-regional.http-header/value]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.get-sql-injection-match-set-request/sql-injection-match-set-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional/get-sql-injection-match-set-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.get-sql-injection-match-set-request/sql-injection-match-set-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional.xss-match-set/xss-match-set-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional.xss-match-set/name (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-name))
(clojure.spec.alpha/def :portkey.aws.waf-regional/xss-match-set (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.xss-match-set/xss-match-set-id :portkey.aws.waf-regional/xss-match-tuples] :opt-un [:portkey.aws.waf-regional.xss-match-set/name]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.get-geo-match-set-request/geo-match-set-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional/get-geo-match-set-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.get-geo-match-set-request/geo-match-set-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional/list-logging-configurations-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/logging-configurations :portkey.aws.waf-regional/next-marker]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/match-field-type #{"SINGLE_QUERY_ARG" "QUERY_STRING" :method :header "METHOD" "HEADER" :all-query-args "URI" "ALL_QUERY_ARGS" "BODY" :uri :query-string :single-query-arg :body})

(clojure.spec.alpha/def :portkey.aws.waf-regional.rule/rule-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional.rule/name (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-name))
(clojure.spec.alpha/def :portkey.aws.waf-regional/rule (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.rule/rule-id :portkey.aws.waf-regional/predicates] :opt-un [:portkey.aws.waf-regional.rule/name :portkey.aws.waf-regional/metric-name]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.delete-rule-group-request/rule-group-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional/delete-rule-group-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.delete-rule-group-request/rule-group-id :portkey.aws.waf-regional/change-token] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional.create-rate-based-rule-request/name (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-name))
(clojure.spec.alpha/def :portkey.aws.waf-regional/create-rate-based-rule-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.create-rate-based-rule-request/name :portkey.aws.waf-regional/metric-name :portkey.aws.waf-regional/rate-key :portkey.aws.waf-regional/rate-limit :portkey.aws.waf-regional/change-token] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional.regex-match-set-update/action (clojure.spec.alpha/and :portkey.aws.waf-regional/change-action))
(clojure.spec.alpha/def :portkey.aws.waf-regional/regex-match-set-update (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.regex-match-set-update/action :portkey.aws.waf-regional/regex-match-tuple] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional/delete-regex-pattern-set-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/change-token]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.byte-match-set/byte-match-set-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional.byte-match-set/name (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-name))
(clojure.spec.alpha/def :portkey.aws.waf-regional/byte-match-set (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.byte-match-set/byte-match-set-id :portkey.aws.waf-regional/byte-match-tuples] :opt-un [:portkey.aws.waf-regional.byte-match-set/name]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.create-rate-based-rule-response/rule (clojure.spec.alpha/and :portkey.aws.waf-regional/rate-based-rule))
(clojure.spec.alpha/def :portkey.aws.waf-regional/create-rate-based-rule-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional.create-rate-based-rule-response/rule :portkey.aws.waf-regional/change-token]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/sample-weight clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.waf-regional/get-web-acl-for-resource-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/web-acl-summary]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.list-regex-match-sets-response/regex-match-sets (clojure.spec.alpha/and :portkey.aws.waf-regional/regex-match-set-summaries))
(clojure.spec.alpha/def :portkey.aws.waf-regional/list-regex-match-sets-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/next-marker :portkey.aws.waf-regional.list-regex-match-sets-response/regex-match-sets]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.byte-match-set-summary/byte-match-set-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional.byte-match-set-summary/name (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-name))
(clojure.spec.alpha/def :portkey.aws.waf-regional/byte-match-set-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.byte-match-set-summary/byte-match-set-id :portkey.aws.waf-regional.byte-match-set-summary/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional/get-change-token-status-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/change-token-status]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/rule-group-updates (clojure.spec.alpha/coll-of :portkey.aws.waf-regional/rule-group-update :min-count 1))

(clojure.spec.alpha/def :portkey.aws.waf-regional.create-sql-injection-match-set-request/name (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-name))
(clojure.spec.alpha/def :portkey.aws.waf-regional/create-sql-injection-match-set-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.create-sql-injection-match-set-request/name :portkey.aws.waf-regional/change-token] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional/match-field-data (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.waf-regional/next-marker (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__)))))

(clojure.spec.alpha/def :portkey.aws.waf-regional/sampled-http-requests (clojure.spec.alpha/coll-of :portkey.aws.waf-regional/sampled-http-request))

(clojure.spec.alpha/def :portkey.aws.waf-regional.get-size-constraint-set-request/size-constraint-set-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional/get-size-constraint-set-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.get-size-constraint-set-request/size-constraint-set-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional.list-byte-match-sets-response/byte-match-sets (clojure.spec.alpha/and :portkey.aws.waf-regional/byte-match-set-summaries))
(clojure.spec.alpha/def :portkey.aws.waf-regional/list-byte-match-sets-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/next-marker :portkey.aws.waf-regional.list-byte-match-sets-response/byte-match-sets]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/xss-match-set-updates (clojure.spec.alpha/coll-of :portkey.aws.waf-regional/xss-match-set-update :min-count 1))

(clojure.spec.alpha/def :portkey.aws.waf-regional/logging-configuration (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional/resource-arn :portkey.aws.waf-regional/log-destination-configs] :opt-un [:portkey.aws.waf-regional/redacted-fields]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.create-regex-pattern-set-request/name (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-name))
(clojure.spec.alpha/def :portkey.aws.waf-regional/create-regex-pattern-set-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.create-regex-pattern-set-request/name :portkey.aws.waf-regional/change-token] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional/delete-rate-based-rule-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/change-token]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/size-constraint-set-updates (clojure.spec.alpha/coll-of :portkey.aws.waf-regional/size-constraint-set-update :min-count 1))

(clojure.spec.alpha/def :portkey.aws.waf-regional/byte-match-tuples (clojure.spec.alpha/coll-of :portkey.aws.waf-regional/byte-match-tuple))

(clojure.spec.alpha/def :portkey.aws.waf-regional/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.waf-regional/sql-injection-match-set-summaries (clojure.spec.alpha/coll-of :portkey.aws.waf-regional/sql-injection-match-set-summary))

(clojure.spec.alpha/def :portkey.aws.waf-regional/get-rate-based-rule-managed-keys-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/managed-keys :portkey.aws.waf-regional/next-marker]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/resource-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 1224))))

(clojure.spec.alpha/def :portkey.aws.waf-regional.list-size-constraint-sets-response/size-constraint-sets (clojure.spec.alpha/and :portkey.aws.waf-regional/size-constraint-set-summaries))
(clojure.spec.alpha/def :portkey.aws.waf-regional/list-size-constraint-sets-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/next-marker :portkey.aws.waf-regional.list-size-constraint-sets-response/size-constraint-sets]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.get-rate-based-rule-request/rule-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional/get-rate-based-rule-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.get-rate-based-rule-request/rule-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional.get-permission-policy-response/policy (clojure.spec.alpha/and :portkey.aws.waf-regional/policy-string))
(clojure.spec.alpha/def :portkey.aws.waf-regional/get-permission-policy-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional.get-permission-policy-response/policy]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.delete-ip-set-request/ip-set-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional/delete-ip-set-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.delete-ip-set-request/ip-set-id :portkey.aws.waf-regional/change-token] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional/create-rule-group-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/rule-group :portkey.aws.waf-regional/change-token]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/predicates (clojure.spec.alpha/coll-of :portkey.aws.waf-regional/predicate))

(clojure.spec.alpha/def :portkey.aws.waf-regional.list-activated-rules-in-rule-group-request/rule-group-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional.list-activated-rules-in-rule-group-request/limit (clojure.spec.alpha/and :portkey.aws.waf-regional/pagination-limit))
(clojure.spec.alpha/def :portkey.aws.waf-regional/list-activated-rules-in-rule-group-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional.list-activated-rules-in-rule-group-request/rule-group-id :portkey.aws.waf-regional/next-marker :portkey.aws.waf-regional.list-activated-rules-in-rule-group-request/limit]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.delete-web-acl-request/web-acl-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional/delete-web-acl-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.delete-web-acl-request/web-acl-id :portkey.aws.waf-regional/change-token] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional/regex-match-tuples (clojure.spec.alpha/coll-of :portkey.aws.waf-regional/regex-match-tuple))

(clojure.spec.alpha/def :portkey.aws.waf-regional/sql-injection-match-tuples (clojure.spec.alpha/coll-of :portkey.aws.waf-regional/sql-injection-match-tuple))

(clojure.spec.alpha/def :portkey.aws.waf-regional.list-regex-pattern-sets-request/limit (clojure.spec.alpha/and :portkey.aws.waf-regional/pagination-limit))
(clojure.spec.alpha/def :portkey.aws.waf-regional/list-regex-pattern-sets-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/next-marker :portkey.aws.waf-regional.list-regex-pattern-sets-request/limit]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/metric-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.waf-regional/waf-rule-type #{:rate-based :regular :group "REGULAR" "RATE_BASED" "GROUP"})

(clojure.spec.alpha/def :portkey.aws.waf-regional/delete-geo-match-set-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/change-token]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.list-rules-request/limit (clojure.spec.alpha/and :portkey.aws.waf-regional/pagination-limit))
(clojure.spec.alpha/def :portkey.aws.waf-regional/list-rules-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/next-marker :portkey.aws.waf-regional.list-rules-request/limit]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.sql-injection-match-set-update/action (clojure.spec.alpha/and :portkey.aws.waf-regional/change-action))
(clojure.spec.alpha/def :portkey.aws.waf-regional/sql-injection-match-set-update (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.sql-injection-match-set-update/action :portkey.aws.waf-regional/sql-injection-match-tuple] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional/logging-configurations (clojure.spec.alpha/coll-of :portkey.aws.waf-regional/logging-configuration))

(clojure.spec.alpha/def :portkey.aws.waf-regional/get-change-token-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/change-token]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/predicate-type #{:byte-match "SizeConstraint" "XssMatch" :ip-match "GeoMatch" "SqlInjectionMatch" :regex-match :geo-match :sql-injection-match :xss-match "ByteMatch" "RegexMatch" :size-constraint "IPMatch"})

(clojure.spec.alpha/def :portkey.aws.waf-regional.update-rule-group-request/rule-group-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional.update-rule-group-request/updates (clojure.spec.alpha/and :portkey.aws.waf-regional/rule-group-updates))
(clojure.spec.alpha/def :portkey.aws.waf-regional/update-rule-group-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.update-rule-group-request/rule-group-id :portkey.aws.waf-regional.update-rule-group-request/updates :portkey.aws.waf-regional/change-token] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional/associate-web-acl-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional/update-web-acl-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/change-token]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/parameter-exception-field #{"RATE_KEY" "RULE_TYPE" :predicate-type "BYTE_MATCH_FIELD_TYPE" "WAF_OVERRIDE_ACTION" "GEO_MATCH_LOCATION_TYPE" "BYTE_MATCH_POSITIONAL_CONSTRAINT" "GEO_MATCH_LOCATION_VALUE" :byte-match-text-transformation :change-action "IPSET_TYPE" :ipset-type :geo-match-location-value :next-marker "WAF_ACTION" "SIZE_CONSTRAINT_COMPARISON_OPERATOR" :waf-action :rule-type :byte-match-positional-constraint "CHANGE_ACTION" :size-constraint-comparison-operator :geo-match-location-type :sql-injection-match-field-type "NEXT_MARKER" "BYTE_MATCH_TEXT_TRANSFORMATION" :byte-match-field-type "PREDICATE_TYPE" :rate-key "SQL_INJECTION_MATCH_FIELD_TYPE" :waf-override-action})

(clojure.spec.alpha/def :portkey.aws.waf-regional.list-logging-configurations-request/limit (clojure.spec.alpha/and :portkey.aws.waf-regional/pagination-limit))
(clojure.spec.alpha/def :portkey.aws.waf-regional/list-logging-configurations-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/next-marker :portkey.aws.waf-regional.list-logging-configurations-request/limit]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/geo-match-set-updates (clojure.spec.alpha/coll-of :portkey.aws.waf-regional/geo-match-set-update :min-count 1))

(clojure.spec.alpha/def :portkey.aws.waf-regional/xss-match-set-summaries (clojure.spec.alpha/coll-of :portkey.aws.waf-regional/xss-match-set-summary))

(clojure.spec.alpha/def :portkey.aws.waf-regional/list-resources-for-web-acl-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/resource-arns]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.delete-size-constraint-set-request/size-constraint-set-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional/delete-size-constraint-set-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.delete-size-constraint-set-request/size-constraint-set-id :portkey.aws.waf-regional/change-token] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional.delete-byte-match-set-request/byte-match-set-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional/delete-byte-match-set-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.delete-byte-match-set-request/byte-match-set-id :portkey.aws.waf-regional/change-token] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional.sql-injection-match-set/sql-injection-match-set-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional.sql-injection-match-set/name (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-name))
(clojure.spec.alpha/def :portkey.aws.waf-regional/sql-injection-match-set (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.sql-injection-match-set/sql-injection-match-set-id :portkey.aws.waf-regional/sql-injection-match-tuples] :opt-un [:portkey.aws.waf-regional.sql-injection-match-set/name]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.update-rate-based-rule-request/rule-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional.update-rate-based-rule-request/updates (clojure.spec.alpha/and :portkey.aws.waf-regional/rule-updates))
(clojure.spec.alpha/def :portkey.aws.waf-regional/update-rate-based-rule-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.update-rate-based-rule-request/rule-id :portkey.aws.waf-regional/change-token :portkey.aws.waf-regional.update-rate-based-rule-request/updates :portkey.aws.waf-regional/rate-limit] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional.update-size-constraint-set-request/size-constraint-set-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional.update-size-constraint-set-request/updates (clojure.spec.alpha/and :portkey.aws.waf-regional/size-constraint-set-updates))
(clojure.spec.alpha/def :portkey.aws.waf-regional/update-size-constraint-set-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.update-size-constraint-set-request/size-constraint-set-id :portkey.aws.waf-regional/change-token :portkey.aws.waf-regional.update-size-constraint-set-request/updates] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional.delete-xss-match-set-request/xss-match-set-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional/delete-xss-match-set-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.delete-xss-match-set-request/xss-match-set-id :portkey.aws.waf-regional/change-token] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional.regex-match-tuple/regex-pattern-set-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional/regex-match-tuple (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional/field-to-match :portkey.aws.waf-regional/text-transformation :portkey.aws.waf-regional.regex-match-tuple/regex-pattern-set-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional/action (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.waf-regional.get-byte-match-set-request/byte-match-set-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional/get-byte-match-set-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.get-byte-match-set-request/byte-match-set-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional/byte-match-set-summaries (clojure.spec.alpha/coll-of :portkey.aws.waf-regional/byte-match-set-summary))

(clojure.spec.alpha/def :portkey.aws.waf-regional.predicate/type (clojure.spec.alpha/and :portkey.aws.waf-regional/predicate-type))
(clojure.spec.alpha/def :portkey.aws.waf-regional.predicate/data-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional/predicate (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional/negated :portkey.aws.waf-regional.predicate/type :portkey.aws.waf-regional.predicate/data-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional.sql-injection-match-set-summary/sql-injection-match-set-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional.sql-injection-match-set-summary/name (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-name))
(clojure.spec.alpha/def :portkey.aws.waf-regional/sql-injection-match-set-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.sql-injection-match-set-summary/sql-injection-match-set-id :portkey.aws.waf-regional.sql-injection-match-set-summary/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional/ip-string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.waf-regional.activated-rule/priority (clojure.spec.alpha/and :portkey.aws.waf-regional/rule-priority))
(clojure.spec.alpha/def :portkey.aws.waf-regional.activated-rule/rule-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional.activated-rule/action (clojure.spec.alpha/and :portkey.aws.waf-regional/waf-action))
(clojure.spec.alpha/def :portkey.aws.waf-regional.activated-rule/override-action (clojure.spec.alpha/and :portkey.aws.waf-regional/waf-override-action))
(clojure.spec.alpha/def :portkey.aws.waf-regional.activated-rule/type (clojure.spec.alpha/and :portkey.aws.waf-regional/waf-rule-type))
(clojure.spec.alpha/def :portkey.aws.waf-regional/activated-rule (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.activated-rule/priority :portkey.aws.waf-regional.activated-rule/rule-id] :opt-un [:portkey.aws.waf-regional.activated-rule/action :portkey.aws.waf-regional.activated-rule/override-action :portkey.aws.waf-regional.activated-rule/type]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.get-ip-set-request/ip-set-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional/get-ip-set-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.get-ip-set-request/ip-set-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional.geo-match-set-update/action (clojure.spec.alpha/and :portkey.aws.waf-regional/change-action))
(clojure.spec.alpha/def :portkey.aws.waf-regional/geo-match-set-update (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.geo-match-set-update/action :portkey.aws.waf-regional/geo-match-constraint] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional.http-request/client-ip (clojure.spec.alpha/and :portkey.aws.waf-regional/ip-string))
(clojure.spec.alpha/def :portkey.aws.waf-regional.http-request/uri (clojure.spec.alpha/and :portkey.aws.waf-regional/uri-string))
(clojure.spec.alpha/def :portkey.aws.waf-regional.http-request/method (clojure.spec.alpha/and :portkey.aws.waf-regional/http-method))
(clojure.spec.alpha/def :portkey.aws.waf-regional.http-request/headers (clojure.spec.alpha/and :portkey.aws.waf-regional/http-headers))
(clojure.spec.alpha/def :portkey.aws.waf-regional/http-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional.http-request/client-ip :portkey.aws.waf-regional/country :portkey.aws.waf-regional.http-request/uri :portkey.aws.waf-regional.http-request/method :portkey.aws.waf-regional/http-version :portkey.aws.waf-regional.http-request/headers]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.size-constraint-set/size-constraint-set-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional.size-constraint-set/name (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-name))
(clojure.spec.alpha/def :portkey.aws.waf-regional/size-constraint-set (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.size-constraint-set/size-constraint-set-id :portkey.aws.waf-regional/size-constraints] :opt-un [:portkey.aws.waf-regional.size-constraint-set/name]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.regex-match-set/regex-match-set-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional.regex-match-set/name (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-name))
(clojure.spec.alpha/def :portkey.aws.waf-regional/regex-match-set (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional.regex-match-set/regex-match-set-id :portkey.aws.waf-regional.regex-match-set/name :portkey.aws.waf-regional/regex-match-tuples]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/get-sql-injection-match-set-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/sql-injection-match-set]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.web-acl-update/action (clojure.spec.alpha/and :portkey.aws.waf-regional/change-action))
(clojure.spec.alpha/def :portkey.aws.waf-regional/web-acl-update (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.web-acl-update/action :portkey.aws.waf-regional/activated-rule] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional/get-regex-match-set-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/regex-match-set]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/byte-match-target-string clojure.core/bytes?)

(clojure.spec.alpha/def :portkey.aws.waf-regional.create-web-acl-request/name (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-name))
(clojure.spec.alpha/def :portkey.aws.waf-regional.create-web-acl-request/default-action (clojure.spec.alpha/and :portkey.aws.waf-regional/waf-action))
(clojure.spec.alpha/def :portkey.aws.waf-regional/create-web-acl-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.create-web-acl-request/name :portkey.aws.waf-regional/metric-name :portkey.aws.waf-regional.create-web-acl-request/default-action :portkey.aws.waf-regional/change-token] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional.regex-pattern-set-update/action (clojure.spec.alpha/and :portkey.aws.waf-regional/change-action))
(clojure.spec.alpha/def :portkey.aws.waf-regional/regex-pattern-set-update (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.regex-pattern-set-update/action :portkey.aws.waf-regional/regex-pattern-string] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional/create-rule-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/rule :portkey.aws.waf-regional/change-token]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/waf-override-action-type #{"COUNT" "NONE" :count :none})

(clojure.spec.alpha/def :portkey.aws.waf-regional/rate-limit clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.waf-regional/negated clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.waf-regional/create-ip-set-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/ip-set :portkey.aws.waf-regional/change-token]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.put-permission-policy-request/policy (clojure.spec.alpha/and :portkey.aws.waf-regional/policy-string))
(clojure.spec.alpha/def :portkey.aws.waf-regional/put-permission-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional/resource-arn :portkey.aws.waf-regional.put-permission-policy-request/policy] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional/managed-key (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.waf-regional/change-token-status #{:pending :provisioned "INSYNC" "PENDING" :insync "PROVISIONED"})

(clojure.spec.alpha/def :portkey.aws.waf-regional/get-rule-group-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/rule-group]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.list-sql-injection-match-sets-request/limit (clojure.spec.alpha/and :portkey.aws.waf-regional/pagination-limit))
(clojure.spec.alpha/def :portkey.aws.waf-regional/list-sql-injection-match-sets-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/next-marker :portkey.aws.waf-regional.list-sql-injection-match-sets-request/limit]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/http-method (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.waf-regional/get-sampled-requests-max-items clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.waf-regional.list-ip-sets-response/ip-sets (clojure.spec.alpha/and :portkey.aws.waf-regional/ip-set-summaries))
(clojure.spec.alpha/def :portkey.aws.waf-regional/list-ip-sets-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/next-marker :portkey.aws.waf-regional.list-ip-sets-response/ip-sets]))

(clojure.core/defn create-size-constraint-set ([create-size-constraint-set-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-create-size-constraint-set-request create-size-constraint-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/create-size-constraint-set-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/create-size-constraint-set-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateSizeConstraintSet", :http.request.spec/error-spec {"WAFStaleDataException" :portkey.aws.waf-regional/waf-stale-data-exception, "WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception, "WAFDisallowedNameException" :portkey.aws.waf-regional/waf-disallowed-name-exception, "WAFInvalidParameterException" :portkey.aws.waf-regional/waf-invalid-parameter-exception, "WAFLimitsExceededException" :portkey.aws.waf-regional/waf-limits-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-size-constraint-set :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/create-size-constraint-set-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/create-size-constraint-set-response))

(clojure.core/defn list-rules ([] (list-rules {})) ([list-rules-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-rules-request list-rules-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/list-rules-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/list-rules-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListRules", :http.request.spec/error-spec {"WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception}})))))
(clojure.spec.alpha/fdef list-rules :args (clojure.spec.alpha/? :portkey.aws.waf-regional/list-rules-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/list-rules-response))

(clojure.core/defn delete-rule ([delete-rule-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-rule-request delete-rule-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/delete-rule-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/delete-rule-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteRule", :http.request.spec/error-spec {"WAFStaleDataException" :portkey.aws.waf-regional/waf-stale-data-exception, "WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception, "WAFNonexistentItemException" :portkey.aws.waf-regional/waf-nonexistent-item-exception, "WAFReferencedItemException" :portkey.aws.waf-regional/waf-referenced-item-exception, "WAFNonEmptyEntityException" :portkey.aws.waf-regional/waf-non-empty-entity-exception}})))))
(clojure.spec.alpha/fdef delete-rule :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/delete-rule-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/delete-rule-response))

(clojure.core/defn list-activated-rules-in-rule-group ([] (list-activated-rules-in-rule-group {})) ([list-activated-rules-in-rule-group-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-activated-rules-in-rule-group-request list-activated-rules-in-rule-group-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/list-activated-rules-in-rule-group-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/list-activated-rules-in-rule-group-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListActivatedRulesInRuleGroup", :http.request.spec/error-spec {"WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFNonexistentItemException" :portkey.aws.waf-regional/waf-nonexistent-item-exception, "WAFInvalidParameterException" :portkey.aws.waf-regional/waf-invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef list-activated-rules-in-rule-group :args (clojure.spec.alpha/? :portkey.aws.waf-regional/list-activated-rules-in-rule-group-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/list-activated-rules-in-rule-group-response))

(clojure.core/defn update-sql-injection-match-set ([update-sql-injection-match-set-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-update-sql-injection-match-set-request update-sql-injection-match-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/update-sql-injection-match-set-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/update-sql-injection-match-set-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateSqlInjectionMatchSet", :http.request.spec/error-spec {"WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception, "WAFInvalidOperationException" :portkey.aws.waf-regional/waf-invalid-operation-exception, "WAFInvalidParameterException" :portkey.aws.waf-regional/waf-invalid-parameter-exception, "WAFNonexistentContainerException" :portkey.aws.waf-regional/waf-nonexistent-container-exception, "WAFNonexistentItemException" :portkey.aws.waf-regional/waf-nonexistent-item-exception, "WAFStaleDataException" :portkey.aws.waf-regional/waf-stale-data-exception, "WAFLimitsExceededException" :portkey.aws.waf-regional/waf-limits-exceeded-exception}})))))
(clojure.spec.alpha/fdef update-sql-injection-match-set :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/update-sql-injection-match-set-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/update-sql-injection-match-set-response))

(clojure.core/defn get-regex-match-set ([get-regex-match-set-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-regex-match-set-request get-regex-match-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/get-regex-match-set-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/get-regex-match-set-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetRegexMatchSet", :http.request.spec/error-spec {"WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception, "WAFNonexistentItemException" :portkey.aws.waf-regional/waf-nonexistent-item-exception}})))))
(clojure.spec.alpha/fdef get-regex-match-set :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/get-regex-match-set-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/get-regex-match-set-response))

(clojure.core/defn update-ip-set ([update-ip-set-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-update-ip-set-request update-ip-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/update-ip-set-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/update-ip-set-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateIPSet", :http.request.spec/error-spec {"WAFInvalidParameterException" :portkey.aws.waf-regional/waf-invalid-parameter-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception, "WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidOperationException" :portkey.aws.waf-regional/waf-invalid-operation-exception, "WAFNonexistentItemException" :portkey.aws.waf-regional/waf-nonexistent-item-exception, "WAFNonexistentContainerException" :portkey.aws.waf-regional/waf-nonexistent-container-exception, "WAFStaleDataException" :portkey.aws.waf-regional/waf-stale-data-exception, "WAFReferencedItemException" :portkey.aws.waf-regional/waf-referenced-item-exception, "WAFLimitsExceededException" :portkey.aws.waf-regional/waf-limits-exceeded-exception}})))))
(clojure.spec.alpha/fdef update-ip-set :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/update-ip-set-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/update-ip-set-response))

(clojure.core/defn get-ip-set ([get-ip-set-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-ip-set-request get-ip-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/get-ip-set-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/get-ip-set-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetIPSet", :http.request.spec/error-spec {"WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception, "WAFNonexistentItemException" :portkey.aws.waf-regional/waf-nonexistent-item-exception}})))))
(clojure.spec.alpha/fdef get-ip-set :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/get-ip-set-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/get-ip-set-response))

(clojure.core/defn get-sql-injection-match-set ([get-sql-injection-match-set-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-sql-injection-match-set-request get-sql-injection-match-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/get-sql-injection-match-set-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/get-sql-injection-match-set-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetSqlInjectionMatchSet", :http.request.spec/error-spec {"WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception, "WAFNonexistentItemException" :portkey.aws.waf-regional/waf-nonexistent-item-exception}})))))
(clojure.spec.alpha/fdef get-sql-injection-match-set :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/get-sql-injection-match-set-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/get-sql-injection-match-set-response))

(clojure.core/defn put-permission-policy ([put-permission-policy-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-put-permission-policy-request put-permission-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/put-permission-policy-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/put-permission-policy-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "PutPermissionPolicy", :http.request.spec/error-spec {"WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFStaleDataException" :portkey.aws.waf-regional/waf-stale-data-exception, "WAFNonexistentItemException" :portkey.aws.waf-regional/waf-nonexistent-item-exception, "WAFInvalidPermissionPolicyException" :portkey.aws.waf-regional/waf-invalid-permission-policy-exception}})))))
(clojure.spec.alpha/fdef put-permission-policy :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/put-permission-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/put-permission-policy-response))

(clojure.core/defn create-xss-match-set ([create-xss-match-set-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-create-xss-match-set-request create-xss-match-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/create-xss-match-set-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/create-xss-match-set-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateXssMatchSet", :http.request.spec/error-spec {"WAFDisallowedNameException" :portkey.aws.waf-regional/waf-disallowed-name-exception, "WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception, "WAFInvalidParameterException" :portkey.aws.waf-regional/waf-invalid-parameter-exception, "WAFStaleDataException" :portkey.aws.waf-regional/waf-stale-data-exception, "WAFLimitsExceededException" :portkey.aws.waf-regional/waf-limits-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-xss-match-set :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/create-xss-match-set-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/create-xss-match-set-response))

(clojure.core/defn update-rule-group ([update-rule-group-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-update-rule-group-request update-rule-group-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/update-rule-group-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/update-rule-group-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateRuleGroup", :http.request.spec/error-spec {"WAFStaleDataException" :portkey.aws.waf-regional/waf-stale-data-exception, "WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFNonexistentContainerException" :portkey.aws.waf-regional/waf-nonexistent-container-exception, "WAFNonexistentItemException" :portkey.aws.waf-regional/waf-nonexistent-item-exception, "WAFInvalidOperationException" :portkey.aws.waf-regional/waf-invalid-operation-exception, "WAFLimitsExceededException" :portkey.aws.waf-regional/waf-limits-exceeded-exception, "WAFInvalidParameterException" :portkey.aws.waf-regional/waf-invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef update-rule-group :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/update-rule-group-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/update-rule-group-response))

(clojure.core/defn list-resources-for-web-acl ([list-resources-for-web-acl-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-resources-for-web-acl-request list-resources-for-web-acl-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/list-resources-for-web-acl-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/list-resources-for-web-acl-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListResourcesForWebACL", :http.request.spec/error-spec {"WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception, "WAFNonexistentItemException" :portkey.aws.waf-regional/waf-nonexistent-item-exception}})))))
(clojure.spec.alpha/fdef list-resources-for-web-acl :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/list-resources-for-web-acl-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/list-resources-for-web-acl-response))

(clojure.core/defn create-geo-match-set ([create-geo-match-set-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-create-geo-match-set-request create-geo-match-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/create-geo-match-set-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/create-geo-match-set-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateGeoMatchSet", :http.request.spec/error-spec {"WAFStaleDataException" :portkey.aws.waf-regional/waf-stale-data-exception, "WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception, "WAFDisallowedNameException" :portkey.aws.waf-regional/waf-disallowed-name-exception, "WAFInvalidParameterException" :portkey.aws.waf-regional/waf-invalid-parameter-exception, "WAFLimitsExceededException" :portkey.aws.waf-regional/waf-limits-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-geo-match-set :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/create-geo-match-set-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/create-geo-match-set-response))

(clojure.core/defn get-rate-based-rule-managed-keys ([get-rate-based-rule-managed-keys-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-rate-based-rule-managed-keys-request get-rate-based-rule-managed-keys-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/get-rate-based-rule-managed-keys-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/get-rate-based-rule-managed-keys-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetRateBasedRuleManagedKeys", :http.request.spec/error-spec {"WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception, "WAFNonexistentItemException" :portkey.aws.waf-regional/waf-nonexistent-item-exception, "WAFInvalidParameterException" :portkey.aws.waf-regional/waf-invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef get-rate-based-rule-managed-keys :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/get-rate-based-rule-managed-keys-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/get-rate-based-rule-managed-keys-response))

(clojure.core/defn list-xss-match-sets ([] (list-xss-match-sets {})) ([list-xss-match-sets-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-xss-match-sets-request list-xss-match-sets-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/list-xss-match-sets-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/list-xss-match-sets-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListXssMatchSets", :http.request.spec/error-spec {"WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception}})))))
(clojure.spec.alpha/fdef list-xss-match-sets :args (clojure.spec.alpha/? :portkey.aws.waf-regional/list-xss-match-sets-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/list-xss-match-sets-response))

(clojure.core/defn list-subscribed-rule-groups ([] (list-subscribed-rule-groups {})) ([list-subscribed-rule-groups-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-subscribed-rule-groups-request list-subscribed-rule-groups-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/list-subscribed-rule-groups-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/list-subscribed-rule-groups-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListSubscribedRuleGroups", :http.request.spec/error-spec {"WAFNonexistentItemException" :portkey.aws.waf-regional/waf-nonexistent-item-exception, "WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception}})))))
(clojure.spec.alpha/fdef list-subscribed-rule-groups :args (clojure.spec.alpha/? :portkey.aws.waf-regional/list-subscribed-rule-groups-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/list-subscribed-rule-groups-response))

(clojure.core/defn create-regex-pattern-set ([create-regex-pattern-set-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-create-regex-pattern-set-request create-regex-pattern-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/create-regex-pattern-set-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/create-regex-pattern-set-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateRegexPatternSet", :http.request.spec/error-spec {"WAFStaleDataException" :portkey.aws.waf-regional/waf-stale-data-exception, "WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFDisallowedNameException" :portkey.aws.waf-regional/waf-disallowed-name-exception, "WAFLimitsExceededException" :portkey.aws.waf-regional/waf-limits-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-regex-pattern-set :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/create-regex-pattern-set-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/create-regex-pattern-set-response))

(clojure.core/defn get-byte-match-set ([get-byte-match-set-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-byte-match-set-request get-byte-match-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/get-byte-match-set-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/get-byte-match-set-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetByteMatchSet", :http.request.spec/error-spec {"WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception, "WAFNonexistentItemException" :portkey.aws.waf-regional/waf-nonexistent-item-exception}})))))
(clojure.spec.alpha/fdef get-byte-match-set :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/get-byte-match-set-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/get-byte-match-set-response))

(clojure.core/defn delete-sql-injection-match-set ([delete-sql-injection-match-set-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-sql-injection-match-set-request delete-sql-injection-match-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/delete-sql-injection-match-set-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/delete-sql-injection-match-set-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteSqlInjectionMatchSet", :http.request.spec/error-spec {"WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception, "WAFNonexistentItemException" :portkey.aws.waf-regional/waf-nonexistent-item-exception, "WAFReferencedItemException" :portkey.aws.waf-regional/waf-referenced-item-exception, "WAFStaleDataException" :portkey.aws.waf-regional/waf-stale-data-exception, "WAFNonEmptyEntityException" :portkey.aws.waf-regional/waf-non-empty-entity-exception}})))))
(clojure.spec.alpha/fdef delete-sql-injection-match-set :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/delete-sql-injection-match-set-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/delete-sql-injection-match-set-response))

(clojure.core/defn update-rate-based-rule ([update-rate-based-rule-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-update-rate-based-rule-request update-rate-based-rule-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/update-rate-based-rule-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/update-rate-based-rule-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateRateBasedRule", :http.request.spec/error-spec {"WAFInvalidParameterException" :portkey.aws.waf-regional/waf-invalid-parameter-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception, "WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidOperationException" :portkey.aws.waf-regional/waf-invalid-operation-exception, "WAFNonexistentItemException" :portkey.aws.waf-regional/waf-nonexistent-item-exception, "WAFNonexistentContainerException" :portkey.aws.waf-regional/waf-nonexistent-container-exception, "WAFStaleDataException" :portkey.aws.waf-regional/waf-stale-data-exception, "WAFReferencedItemException" :portkey.aws.waf-regional/waf-referenced-item-exception, "WAFLimitsExceededException" :portkey.aws.waf-regional/waf-limits-exceeded-exception}})))))
(clojure.spec.alpha/fdef update-rate-based-rule :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/update-rate-based-rule-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/update-rate-based-rule-response))

(clojure.core/defn list-geo-match-sets ([] (list-geo-match-sets {})) ([list-geo-match-sets-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-geo-match-sets-request list-geo-match-sets-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/list-geo-match-sets-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/list-geo-match-sets-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListGeoMatchSets", :http.request.spec/error-spec {"WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception}})))))
(clojure.spec.alpha/fdef list-geo-match-sets :args (clojure.spec.alpha/? :portkey.aws.waf-regional/list-geo-match-sets-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/list-geo-match-sets-response))

(clojure.core/defn delete-permission-policy ([delete-permission-policy-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-permission-policy-request delete-permission-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/delete-permission-policy-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/delete-permission-policy-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeletePermissionPolicy", :http.request.spec/error-spec {"WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFStaleDataException" :portkey.aws.waf-regional/waf-stale-data-exception, "WAFNonexistentItemException" :portkey.aws.waf-regional/waf-nonexistent-item-exception}})))))
(clojure.spec.alpha/fdef delete-permission-policy :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/delete-permission-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/delete-permission-policy-response))

(clojure.core/defn update-regex-match-set ([update-regex-match-set-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-update-regex-match-set-request update-regex-match-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/update-regex-match-set-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/update-regex-match-set-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateRegexMatchSet", :http.request.spec/error-spec {"WAFStaleDataException" :portkey.aws.waf-regional/waf-stale-data-exception, "WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFDisallowedNameException" :portkey.aws.waf-regional/waf-disallowed-name-exception, "WAFLimitsExceededException" :portkey.aws.waf-regional/waf-limits-exceeded-exception, "WAFNonexistentItemException" :portkey.aws.waf-regional/waf-nonexistent-item-exception, "WAFNonexistentContainerException" :portkey.aws.waf-regional/waf-nonexistent-container-exception, "WAFInvalidOperationException" :portkey.aws.waf-regional/waf-invalid-operation-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception}})))))
(clojure.spec.alpha/fdef update-regex-match-set :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/update-regex-match-set-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/update-regex-match-set-response))

(clojure.core/defn disassociate-web-acl ([disassociate-web-acl-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-disassociate-web-acl-request disassociate-web-acl-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/disassociate-web-acl-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/disassociate-web-acl-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DisassociateWebACL", :http.request.spec/error-spec {"WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception, "WAFInvalidParameterException" :portkey.aws.waf-regional/waf-invalid-parameter-exception, "WAFNonexistentItemException" :portkey.aws.waf-regional/waf-nonexistent-item-exception}})))))
(clojure.spec.alpha/fdef disassociate-web-acl :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/disassociate-web-acl-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/disassociate-web-acl-response))

(clojure.core/defn list-size-constraint-sets ([] (list-size-constraint-sets {})) ([list-size-constraint-sets-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-size-constraint-sets-request list-size-constraint-sets-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/list-size-constraint-sets-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/list-size-constraint-sets-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListSizeConstraintSets", :http.request.spec/error-spec {"WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception}})))))
(clojure.spec.alpha/fdef list-size-constraint-sets :args (clojure.spec.alpha/? :portkey.aws.waf-regional/list-size-constraint-sets-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/list-size-constraint-sets-response))

(clojure.core/defn update-byte-match-set ([update-byte-match-set-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-update-byte-match-set-request update-byte-match-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/update-byte-match-set-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/update-byte-match-set-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateByteMatchSet", :http.request.spec/error-spec {"WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception, "WAFInvalidOperationException" :portkey.aws.waf-regional/waf-invalid-operation-exception, "WAFInvalidParameterException" :portkey.aws.waf-regional/waf-invalid-parameter-exception, "WAFNonexistentContainerException" :portkey.aws.waf-regional/waf-nonexistent-container-exception, "WAFNonexistentItemException" :portkey.aws.waf-regional/waf-nonexistent-item-exception, "WAFStaleDataException" :portkey.aws.waf-regional/waf-stale-data-exception, "WAFLimitsExceededException" :portkey.aws.waf-regional/waf-limits-exceeded-exception}})))))
(clojure.spec.alpha/fdef update-byte-match-set :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/update-byte-match-set-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/update-byte-match-set-response))

(clojure.core/defn update-geo-match-set ([update-geo-match-set-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-update-geo-match-set-request update-geo-match-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/update-geo-match-set-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/update-geo-match-set-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateGeoMatchSet", :http.request.spec/error-spec {"WAFInvalidParameterException" :portkey.aws.waf-regional/waf-invalid-parameter-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception, "WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidOperationException" :portkey.aws.waf-regional/waf-invalid-operation-exception, "WAFNonexistentItemException" :portkey.aws.waf-regional/waf-nonexistent-item-exception, "WAFNonexistentContainerException" :portkey.aws.waf-regional/waf-nonexistent-container-exception, "WAFStaleDataException" :portkey.aws.waf-regional/waf-stale-data-exception, "WAFReferencedItemException" :portkey.aws.waf-regional/waf-referenced-item-exception, "WAFLimitsExceededException" :portkey.aws.waf-regional/waf-limits-exceeded-exception}})))))
(clojure.spec.alpha/fdef update-geo-match-set :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/update-geo-match-set-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/update-geo-match-set-response))

(clojure.core/defn update-regex-pattern-set ([update-regex-pattern-set-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-update-regex-pattern-set-request update-regex-pattern-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/update-regex-pattern-set-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/update-regex-pattern-set-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateRegexPatternSet", :http.request.spec/error-spec {"WAFStaleDataException" :portkey.aws.waf-regional/waf-stale-data-exception, "WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFLimitsExceededException" :portkey.aws.waf-regional/waf-limits-exceeded-exception, "WAFNonexistentItemException" :portkey.aws.waf-regional/waf-nonexistent-item-exception, "WAFNonexistentContainerException" :portkey.aws.waf-regional/waf-nonexistent-container-exception, "WAFInvalidOperationException" :portkey.aws.waf-regional/waf-invalid-operation-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception, "WAFInvalidRegexPatternException" :portkey.aws.waf-regional/waf-invalid-regex-pattern-exception}})))))
(clojure.spec.alpha/fdef update-regex-pattern-set :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/update-regex-pattern-set-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/update-regex-pattern-set-response))

(clojure.core/defn get-change-token-status ([get-change-token-status-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-change-token-status-request get-change-token-status-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/get-change-token-status-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/get-change-token-status-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetChangeTokenStatus", :http.request.spec/error-spec {"WAFNonexistentItemException" :portkey.aws.waf-regional/waf-nonexistent-item-exception, "WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception}})))))
(clojure.spec.alpha/fdef get-change-token-status :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/get-change-token-status-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/get-change-token-status-response))

(clojure.core/defn create-web-acl ([create-web-acl-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-create-web-acl-request create-web-acl-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/create-web-acl-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/create-web-acl-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateWebACL", :http.request.spec/error-spec {"WAFStaleDataException" :portkey.aws.waf-regional/waf-stale-data-exception, "WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception, "WAFDisallowedNameException" :portkey.aws.waf-regional/waf-disallowed-name-exception, "WAFInvalidParameterException" :portkey.aws.waf-regional/waf-invalid-parameter-exception, "WAFLimitsExceededException" :portkey.aws.waf-regional/waf-limits-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-web-acl :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/create-web-acl-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/create-web-acl-response))

(clojure.core/defn create-ip-set ([create-ip-set-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-create-ip-set-request create-ip-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/create-ip-set-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/create-ip-set-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateIPSet", :http.request.spec/error-spec {"WAFStaleDataException" :portkey.aws.waf-regional/waf-stale-data-exception, "WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception, "WAFDisallowedNameException" :portkey.aws.waf-regional/waf-disallowed-name-exception, "WAFInvalidParameterException" :portkey.aws.waf-regional/waf-invalid-parameter-exception, "WAFLimitsExceededException" :portkey.aws.waf-regional/waf-limits-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-ip-set :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/create-ip-set-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/create-ip-set-response))

(clojure.core/defn delete-xss-match-set ([delete-xss-match-set-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-xss-match-set-request delete-xss-match-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/delete-xss-match-set-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/delete-xss-match-set-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteXssMatchSet", :http.request.spec/error-spec {"WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception, "WAFNonexistentItemException" :portkey.aws.waf-regional/waf-nonexistent-item-exception, "WAFReferencedItemException" :portkey.aws.waf-regional/waf-referenced-item-exception, "WAFStaleDataException" :portkey.aws.waf-regional/waf-stale-data-exception, "WAFNonEmptyEntityException" :portkey.aws.waf-regional/waf-non-empty-entity-exception}})))))
(clojure.spec.alpha/fdef delete-xss-match-set :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/delete-xss-match-set-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/delete-xss-match-set-response))

(clojure.core/defn put-logging-configuration ([put-logging-configuration-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-put-logging-configuration-request put-logging-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/put-logging-configuration-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/put-logging-configuration-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "PutLoggingConfiguration", :http.request.spec/error-spec {"WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFNonexistentItemException" :portkey.aws.waf-regional/waf-nonexistent-item-exception, "WAFStaleDataException" :portkey.aws.waf-regional/waf-stale-data-exception}})))))
(clojure.spec.alpha/fdef put-logging-configuration :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/put-logging-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/put-logging-configuration-response))

(clojure.core/defn list-rate-based-rules ([] (list-rate-based-rules {})) ([list-rate-based-rules-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-rate-based-rules-request list-rate-based-rules-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/list-rate-based-rules-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/list-rate-based-rules-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListRateBasedRules", :http.request.spec/error-spec {"WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception}})))))
(clojure.spec.alpha/fdef list-rate-based-rules :args (clojure.spec.alpha/? :portkey.aws.waf-regional/list-rate-based-rules-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/list-rate-based-rules-response))

(clojure.core/defn get-sampled-requests ([get-sampled-requests-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-sampled-requests-request get-sampled-requests-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/get-sampled-requests-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/get-sampled-requests-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetSampledRequests", :http.request.spec/error-spec {"WAFNonexistentItemException" :portkey.aws.waf-regional/waf-nonexistent-item-exception, "WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception}})))))
(clojure.spec.alpha/fdef get-sampled-requests :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/get-sampled-requests-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/get-sampled-requests-response))

(clojure.core/defn get-logging-configuration ([get-logging-configuration-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-logging-configuration-request get-logging-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/get-logging-configuration-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/get-logging-configuration-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetLoggingConfiguration", :http.request.spec/error-spec {"WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFNonexistentItemException" :portkey.aws.waf-regional/waf-nonexistent-item-exception}})))))
(clojure.spec.alpha/fdef get-logging-configuration :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/get-logging-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/get-logging-configuration-response))

(clojure.core/defn create-rule ([create-rule-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-create-rule-request create-rule-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/create-rule-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/create-rule-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateRule", :http.request.spec/error-spec {"WAFStaleDataException" :portkey.aws.waf-regional/waf-stale-data-exception, "WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFDisallowedNameException" :portkey.aws.waf-regional/waf-disallowed-name-exception, "WAFInvalidParameterException" :portkey.aws.waf-regional/waf-invalid-parameter-exception, "WAFLimitsExceededException" :portkey.aws.waf-regional/waf-limits-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-rule :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/create-rule-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/create-rule-response))

(clojure.core/defn update-rule ([update-rule-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-update-rule-request update-rule-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/update-rule-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/update-rule-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateRule", :http.request.spec/error-spec {"WAFInvalidParameterException" :portkey.aws.waf-regional/waf-invalid-parameter-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception, "WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidOperationException" :portkey.aws.waf-regional/waf-invalid-operation-exception, "WAFNonexistentItemException" :portkey.aws.waf-regional/waf-nonexistent-item-exception, "WAFNonexistentContainerException" :portkey.aws.waf-regional/waf-nonexistent-container-exception, "WAFStaleDataException" :portkey.aws.waf-regional/waf-stale-data-exception, "WAFReferencedItemException" :portkey.aws.waf-regional/waf-referenced-item-exception, "WAFLimitsExceededException" :portkey.aws.waf-regional/waf-limits-exceeded-exception}})))))
(clojure.spec.alpha/fdef update-rule :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/update-rule-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/update-rule-response))

(clojure.core/defn get-geo-match-set ([get-geo-match-set-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-geo-match-set-request get-geo-match-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/get-geo-match-set-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/get-geo-match-set-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetGeoMatchSet", :http.request.spec/error-spec {"WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception, "WAFNonexistentItemException" :portkey.aws.waf-regional/waf-nonexistent-item-exception}})))))
(clojure.spec.alpha/fdef get-geo-match-set :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/get-geo-match-set-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/get-geo-match-set-response))

(clojure.core/defn list-web-ac-ls ([] (list-web-ac-ls {})) ([list-web-ac-ls-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-web-ac-ls-request list-web-ac-ls-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/list-web-ac-ls-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/list-web-ac-ls-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListWebACLs", :http.request.spec/error-spec {"WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception}})))))
(clojure.spec.alpha/fdef list-web-ac-ls :args (clojure.spec.alpha/? :portkey.aws.waf-regional/list-web-ac-ls-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/list-web-ac-ls-response))

(clojure.core/defn update-web-acl ([update-web-acl-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-update-web-acl-request update-web-acl-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/update-web-acl-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/update-web-acl-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateWebACL", :http.request.spec/error-spec {"WAFInvalidParameterException" :portkey.aws.waf-regional/waf-invalid-parameter-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception, "WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidOperationException" :portkey.aws.waf-regional/waf-invalid-operation-exception, "WAFNonexistentItemException" :portkey.aws.waf-regional/waf-nonexistent-item-exception, "WAFNonexistentContainerException" :portkey.aws.waf-regional/waf-nonexistent-container-exception, "WAFStaleDataException" :portkey.aws.waf-regional/waf-stale-data-exception, "WAFReferencedItemException" :portkey.aws.waf-regional/waf-referenced-item-exception, "WAFLimitsExceededException" :portkey.aws.waf-regional/waf-limits-exceeded-exception, "WAFSubscriptionNotFoundException" :portkey.aws.waf-regional/waf-subscription-not-found-exception}})))))
(clojure.spec.alpha/fdef update-web-acl :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/update-web-acl-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/update-web-acl-response))

(clojure.core/defn update-xss-match-set ([update-xss-match-set-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-update-xss-match-set-request update-xss-match-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/update-xss-match-set-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/update-xss-match-set-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateXssMatchSet", :http.request.spec/error-spec {"WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception, "WAFInvalidOperationException" :portkey.aws.waf-regional/waf-invalid-operation-exception, "WAFInvalidParameterException" :portkey.aws.waf-regional/waf-invalid-parameter-exception, "WAFNonexistentContainerException" :portkey.aws.waf-regional/waf-nonexistent-container-exception, "WAFNonexistentItemException" :portkey.aws.waf-regional/waf-nonexistent-item-exception, "WAFStaleDataException" :portkey.aws.waf-regional/waf-stale-data-exception, "WAFLimitsExceededException" :portkey.aws.waf-regional/waf-limits-exceeded-exception}})))))
(clojure.spec.alpha/fdef update-xss-match-set :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/update-xss-match-set-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/update-xss-match-set-response))

(clojure.core/defn delete-web-acl ([delete-web-acl-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-web-acl-request delete-web-acl-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/delete-web-acl-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/delete-web-acl-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteWebACL", :http.request.spec/error-spec {"WAFStaleDataException" :portkey.aws.waf-regional/waf-stale-data-exception, "WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception, "WAFNonexistentItemException" :portkey.aws.waf-regional/waf-nonexistent-item-exception, "WAFReferencedItemException" :portkey.aws.waf-regional/waf-referenced-item-exception, "WAFNonEmptyEntityException" :portkey.aws.waf-regional/waf-non-empty-entity-exception}})))))
(clojure.spec.alpha/fdef delete-web-acl :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/delete-web-acl-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/delete-web-acl-response))

(clojure.core/defn update-size-constraint-set ([update-size-constraint-set-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-update-size-constraint-set-request update-size-constraint-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/update-size-constraint-set-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/update-size-constraint-set-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateSizeConstraintSet", :http.request.spec/error-spec {"WAFInvalidParameterException" :portkey.aws.waf-regional/waf-invalid-parameter-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception, "WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidOperationException" :portkey.aws.waf-regional/waf-invalid-operation-exception, "WAFNonexistentItemException" :portkey.aws.waf-regional/waf-nonexistent-item-exception, "WAFNonexistentContainerException" :portkey.aws.waf-regional/waf-nonexistent-container-exception, "WAFStaleDataException" :portkey.aws.waf-regional/waf-stale-data-exception, "WAFReferencedItemException" :portkey.aws.waf-regional/waf-referenced-item-exception, "WAFLimitsExceededException" :portkey.aws.waf-regional/waf-limits-exceeded-exception}})))))
(clojure.spec.alpha/fdef update-size-constraint-set :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/update-size-constraint-set-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/update-size-constraint-set-response))

(clojure.core/defn delete-rate-based-rule ([delete-rate-based-rule-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-rate-based-rule-request delete-rate-based-rule-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/delete-rate-based-rule-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/delete-rate-based-rule-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteRateBasedRule", :http.request.spec/error-spec {"WAFStaleDataException" :portkey.aws.waf-regional/waf-stale-data-exception, "WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception, "WAFNonexistentItemException" :portkey.aws.waf-regional/waf-nonexistent-item-exception, "WAFReferencedItemException" :portkey.aws.waf-regional/waf-referenced-item-exception, "WAFNonEmptyEntityException" :portkey.aws.waf-regional/waf-non-empty-entity-exception}})))))
(clojure.spec.alpha/fdef delete-rate-based-rule :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/delete-rate-based-rule-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/delete-rate-based-rule-response))

(clojure.core/defn delete-byte-match-set ([delete-byte-match-set-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-byte-match-set-request delete-byte-match-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/delete-byte-match-set-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/delete-byte-match-set-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteByteMatchSet", :http.request.spec/error-spec {"WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception, "WAFNonexistentItemException" :portkey.aws.waf-regional/waf-nonexistent-item-exception, "WAFReferencedItemException" :portkey.aws.waf-regional/waf-referenced-item-exception, "WAFStaleDataException" :portkey.aws.waf-regional/waf-stale-data-exception, "WAFNonEmptyEntityException" :portkey.aws.waf-regional/waf-non-empty-entity-exception}})))))
(clojure.spec.alpha/fdef delete-byte-match-set :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/delete-byte-match-set-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/delete-byte-match-set-response))

(clojure.core/defn delete-logging-configuration ([delete-logging-configuration-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-logging-configuration-request delete-logging-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/delete-logging-configuration-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/delete-logging-configuration-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteLoggingConfiguration", :http.request.spec/error-spec {"WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFNonexistentItemException" :portkey.aws.waf-regional/waf-nonexistent-item-exception, "WAFStaleDataException" :portkey.aws.waf-regional/waf-stale-data-exception}})))))
(clojure.spec.alpha/fdef delete-logging-configuration :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/delete-logging-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/delete-logging-configuration-response))

(clojure.core/defn delete-ip-set ([delete-ip-set-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-ip-set-request delete-ip-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/delete-ip-set-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/delete-ip-set-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteIPSet", :http.request.spec/error-spec {"WAFStaleDataException" :portkey.aws.waf-regional/waf-stale-data-exception, "WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception, "WAFNonexistentItemException" :portkey.aws.waf-regional/waf-nonexistent-item-exception, "WAFReferencedItemException" :portkey.aws.waf-regional/waf-referenced-item-exception, "WAFNonEmptyEntityException" :portkey.aws.waf-regional/waf-non-empty-entity-exception}})))))
(clojure.spec.alpha/fdef delete-ip-set :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/delete-ip-set-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/delete-ip-set-response))

(clojure.core/defn list-logging-configurations ([] (list-logging-configurations {})) ([list-logging-configurations-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-logging-configurations-request list-logging-configurations-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/list-logging-configurations-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/list-logging-configurations-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListLoggingConfigurations", :http.request.spec/error-spec {"WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFNonexistentItemException" :portkey.aws.waf-regional/waf-nonexistent-item-exception, "WAFInvalidParameterException" :portkey.aws.waf-regional/waf-invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef list-logging-configurations :args (clojure.spec.alpha/? :portkey.aws.waf-regional/list-logging-configurations-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/list-logging-configurations-response))

(clojure.core/defn get-rate-based-rule ([get-rate-based-rule-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-rate-based-rule-request get-rate-based-rule-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/get-rate-based-rule-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/get-rate-based-rule-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetRateBasedRule", :http.request.spec/error-spec {"WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception, "WAFNonexistentItemException" :portkey.aws.waf-regional/waf-nonexistent-item-exception}})))))
(clojure.spec.alpha/fdef get-rate-based-rule :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/get-rate-based-rule-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/get-rate-based-rule-response))

(clojure.core/defn list-regex-pattern-sets ([] (list-regex-pattern-sets {})) ([list-regex-pattern-sets-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-regex-pattern-sets-request list-regex-pattern-sets-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/list-regex-pattern-sets-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/list-regex-pattern-sets-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListRegexPatternSets", :http.request.spec/error-spec {"WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception}})))))
(clojure.spec.alpha/fdef list-regex-pattern-sets :args (clojure.spec.alpha/? :portkey.aws.waf-regional/list-regex-pattern-sets-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/list-regex-pattern-sets-response))

(clojure.core/defn associate-web-acl ([associate-web-acl-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-associate-web-acl-request associate-web-acl-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/associate-web-acl-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/associate-web-acl-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "AssociateWebACL", :http.request.spec/error-spec {"WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception, "WAFInvalidParameterException" :portkey.aws.waf-regional/waf-invalid-parameter-exception, "WAFNonexistentItemException" :portkey.aws.waf-regional/waf-nonexistent-item-exception, "WAFUnavailableEntityException" :portkey.aws.waf-regional/waf-unavailable-entity-exception}})))))
(clojure.spec.alpha/fdef associate-web-acl :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/associate-web-acl-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/associate-web-acl-response))

(clojure.core/defn get-xss-match-set ([get-xss-match-set-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-xss-match-set-request get-xss-match-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/get-xss-match-set-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/get-xss-match-set-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetXssMatchSet", :http.request.spec/error-spec {"WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception, "WAFNonexistentItemException" :portkey.aws.waf-regional/waf-nonexistent-item-exception}})))))
(clojure.spec.alpha/fdef get-xss-match-set :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/get-xss-match-set-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/get-xss-match-set-response))

(clojure.core/defn get-rule ([get-rule-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-rule-request get-rule-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/get-rule-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/get-rule-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetRule", :http.request.spec/error-spec {"WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception, "WAFNonexistentItemException" :portkey.aws.waf-regional/waf-nonexistent-item-exception}})))))
(clojure.spec.alpha/fdef get-rule :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/get-rule-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/get-rule-response))

(clojure.core/defn create-rule-group ([create-rule-group-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-create-rule-group-request create-rule-group-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/create-rule-group-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/create-rule-group-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateRuleGroup", :http.request.spec/error-spec {"WAFStaleDataException" :portkey.aws.waf-regional/waf-stale-data-exception, "WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFDisallowedNameException" :portkey.aws.waf-regional/waf-disallowed-name-exception, "WAFLimitsExceededException" :portkey.aws.waf-regional/waf-limits-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-rule-group :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/create-rule-group-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/create-rule-group-response))

(clojure.core/defn list-byte-match-sets ([] (list-byte-match-sets {})) ([list-byte-match-sets-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-byte-match-sets-request list-byte-match-sets-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/list-byte-match-sets-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/list-byte-match-sets-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListByteMatchSets", :http.request.spec/error-spec {"WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception}})))))
(clojure.spec.alpha/fdef list-byte-match-sets :args (clojure.spec.alpha/? :portkey.aws.waf-regional/list-byte-match-sets-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/list-byte-match-sets-response))

(clojure.core/defn create-regex-match-set ([create-regex-match-set-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-create-regex-match-set-request create-regex-match-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/create-regex-match-set-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/create-regex-match-set-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateRegexMatchSet", :http.request.spec/error-spec {"WAFStaleDataException" :portkey.aws.waf-regional/waf-stale-data-exception, "WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFDisallowedNameException" :portkey.aws.waf-regional/waf-disallowed-name-exception, "WAFLimitsExceededException" :portkey.aws.waf-regional/waf-limits-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-regex-match-set :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/create-regex-match-set-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/create-regex-match-set-response))

(clojure.core/defn get-rule-group ([get-rule-group-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-rule-group-request get-rule-group-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/get-rule-group-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/get-rule-group-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetRuleGroup", :http.request.spec/error-spec {"WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFNonexistentItemException" :portkey.aws.waf-regional/waf-nonexistent-item-exception}})))))
(clojure.spec.alpha/fdef get-rule-group :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/get-rule-group-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/get-rule-group-response))

(clojure.core/defn delete-size-constraint-set ([delete-size-constraint-set-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-size-constraint-set-request delete-size-constraint-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/delete-size-constraint-set-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/delete-size-constraint-set-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteSizeConstraintSet", :http.request.spec/error-spec {"WAFStaleDataException" :portkey.aws.waf-regional/waf-stale-data-exception, "WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception, "WAFNonexistentItemException" :portkey.aws.waf-regional/waf-nonexistent-item-exception, "WAFReferencedItemException" :portkey.aws.waf-regional/waf-referenced-item-exception, "WAFNonEmptyEntityException" :portkey.aws.waf-regional/waf-non-empty-entity-exception}})))))
(clojure.spec.alpha/fdef delete-size-constraint-set :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/delete-size-constraint-set-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/delete-size-constraint-set-response))

(clojure.core/defn delete-regex-pattern-set ([delete-regex-pattern-set-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-regex-pattern-set-request delete-regex-pattern-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/delete-regex-pattern-set-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/delete-regex-pattern-set-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteRegexPatternSet", :http.request.spec/error-spec {"WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception, "WAFNonexistentItemException" :portkey.aws.waf-regional/waf-nonexistent-item-exception, "WAFReferencedItemException" :portkey.aws.waf-regional/waf-referenced-item-exception, "WAFStaleDataException" :portkey.aws.waf-regional/waf-stale-data-exception, "WAFNonEmptyEntityException" :portkey.aws.waf-regional/waf-non-empty-entity-exception}})))))
(clojure.spec.alpha/fdef delete-regex-pattern-set :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/delete-regex-pattern-set-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/delete-regex-pattern-set-response))

(clojure.core/defn create-byte-match-set ([create-byte-match-set-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-create-byte-match-set-request create-byte-match-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/create-byte-match-set-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/create-byte-match-set-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateByteMatchSet", :http.request.spec/error-spec {"WAFDisallowedNameException" :portkey.aws.waf-regional/waf-disallowed-name-exception, "WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception, "WAFInvalidParameterException" :portkey.aws.waf-regional/waf-invalid-parameter-exception, "WAFStaleDataException" :portkey.aws.waf-regional/waf-stale-data-exception, "WAFLimitsExceededException" :portkey.aws.waf-regional/waf-limits-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-byte-match-set :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/create-byte-match-set-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/create-byte-match-set-response))

(clojure.core/defn delete-geo-match-set ([delete-geo-match-set-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-geo-match-set-request delete-geo-match-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/delete-geo-match-set-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/delete-geo-match-set-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteGeoMatchSet", :http.request.spec/error-spec {"WAFStaleDataException" :portkey.aws.waf-regional/waf-stale-data-exception, "WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception, "WAFNonexistentItemException" :portkey.aws.waf-regional/waf-nonexistent-item-exception, "WAFReferencedItemException" :portkey.aws.waf-regional/waf-referenced-item-exception, "WAFNonEmptyEntityException" :portkey.aws.waf-regional/waf-non-empty-entity-exception}})))))
(clojure.spec.alpha/fdef delete-geo-match-set :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/delete-geo-match-set-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/delete-geo-match-set-response))

(clojure.core/defn list-sql-injection-match-sets ([] (list-sql-injection-match-sets {})) ([list-sql-injection-match-sets-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-sql-injection-match-sets-request list-sql-injection-match-sets-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/list-sql-injection-match-sets-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/list-sql-injection-match-sets-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListSqlInjectionMatchSets", :http.request.spec/error-spec {"WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception}})))))
(clojure.spec.alpha/fdef list-sql-injection-match-sets :args (clojure.spec.alpha/? :portkey.aws.waf-regional/list-sql-injection-match-sets-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/list-sql-injection-match-sets-response))

(clojure.core/defn get-permission-policy ([get-permission-policy-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-permission-policy-request get-permission-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/get-permission-policy-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/get-permission-policy-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetPermissionPolicy", :http.request.spec/error-spec {"WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFNonexistentItemException" :portkey.aws.waf-regional/waf-nonexistent-item-exception}})))))
(clojure.spec.alpha/fdef get-permission-policy :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/get-permission-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/get-permission-policy-response))

(clojure.core/defn get-change-token ([] (get-change-token {})) ([get-change-token-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-change-token-request get-change-token-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/get-change-token-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/get-change-token-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetChangeToken", :http.request.spec/error-spec {"WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception}})))))
(clojure.spec.alpha/fdef get-change-token :args (clojure.spec.alpha/? :portkey.aws.waf-regional/get-change-token-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/get-change-token-response))

(clojure.core/defn list-rule-groups ([] (list-rule-groups {})) ([list-rule-groups-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-rule-groups-request list-rule-groups-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/list-rule-groups-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/list-rule-groups-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListRuleGroups", :http.request.spec/error-spec {"WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception}})))))
(clojure.spec.alpha/fdef list-rule-groups :args (clojure.spec.alpha/? :portkey.aws.waf-regional/list-rule-groups-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/list-rule-groups-response))

(clojure.core/defn list-regex-match-sets ([] (list-regex-match-sets {})) ([list-regex-match-sets-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-regex-match-sets-request list-regex-match-sets-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/list-regex-match-sets-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/list-regex-match-sets-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListRegexMatchSets", :http.request.spec/error-spec {"WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception}})))))
(clojure.spec.alpha/fdef list-regex-match-sets :args (clojure.spec.alpha/? :portkey.aws.waf-regional/list-regex-match-sets-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/list-regex-match-sets-response))

(clojure.core/defn delete-rule-group ([delete-rule-group-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-rule-group-request delete-rule-group-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/delete-rule-group-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/delete-rule-group-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteRuleGroup", :http.request.spec/error-spec {"WAFStaleDataException" :portkey.aws.waf-regional/waf-stale-data-exception, "WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFNonexistentItemException" :portkey.aws.waf-regional/waf-nonexistent-item-exception, "WAFReferencedItemException" :portkey.aws.waf-regional/waf-referenced-item-exception, "WAFNonEmptyEntityException" :portkey.aws.waf-regional/waf-non-empty-entity-exception, "WAFInvalidOperationException" :portkey.aws.waf-regional/waf-invalid-operation-exception}})))))
(clojure.spec.alpha/fdef delete-rule-group :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/delete-rule-group-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/delete-rule-group-response))

(clojure.core/defn get-web-acl ([get-web-acl-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-web-acl-request get-web-acl-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/get-web-acl-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/get-web-acl-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetWebACL", :http.request.spec/error-spec {"WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception, "WAFNonexistentItemException" :portkey.aws.waf-regional/waf-nonexistent-item-exception}})))))
(clojure.spec.alpha/fdef get-web-acl :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/get-web-acl-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/get-web-acl-response))

(clojure.core/defn create-sql-injection-match-set ([create-sql-injection-match-set-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-create-sql-injection-match-set-request create-sql-injection-match-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/create-sql-injection-match-set-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/create-sql-injection-match-set-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateSqlInjectionMatchSet", :http.request.spec/error-spec {"WAFDisallowedNameException" :portkey.aws.waf-regional/waf-disallowed-name-exception, "WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception, "WAFInvalidParameterException" :portkey.aws.waf-regional/waf-invalid-parameter-exception, "WAFStaleDataException" :portkey.aws.waf-regional/waf-stale-data-exception, "WAFLimitsExceededException" :portkey.aws.waf-regional/waf-limits-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-sql-injection-match-set :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/create-sql-injection-match-set-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/create-sql-injection-match-set-response))

(clojure.core/defn get-regex-pattern-set ([get-regex-pattern-set-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-regex-pattern-set-request get-regex-pattern-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/get-regex-pattern-set-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/get-regex-pattern-set-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetRegexPatternSet", :http.request.spec/error-spec {"WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception, "WAFNonexistentItemException" :portkey.aws.waf-regional/waf-nonexistent-item-exception}})))))
(clojure.spec.alpha/fdef get-regex-pattern-set :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/get-regex-pattern-set-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/get-regex-pattern-set-response))

(clojure.core/defn get-web-acl-for-resource ([get-web-acl-for-resource-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-web-acl-for-resource-request get-web-acl-for-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/get-web-acl-for-resource-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/get-web-acl-for-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetWebACLForResource", :http.request.spec/error-spec {"WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception, "WAFNonexistentItemException" :portkey.aws.waf-regional/waf-nonexistent-item-exception, "WAFInvalidParameterException" :portkey.aws.waf-regional/waf-invalid-parameter-exception, "WAFUnavailableEntityException" :portkey.aws.waf-regional/waf-unavailable-entity-exception}})))))
(clojure.spec.alpha/fdef get-web-acl-for-resource :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/get-web-acl-for-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/get-web-acl-for-resource-response))

(clojure.core/defn get-size-constraint-set ([get-size-constraint-set-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-size-constraint-set-request get-size-constraint-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/get-size-constraint-set-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/get-size-constraint-set-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetSizeConstraintSet", :http.request.spec/error-spec {"WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception, "WAFNonexistentItemException" :portkey.aws.waf-regional/waf-nonexistent-item-exception}})))))
(clojure.spec.alpha/fdef get-size-constraint-set :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/get-size-constraint-set-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/get-size-constraint-set-response))

(clojure.core/defn delete-regex-match-set ([delete-regex-match-set-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-regex-match-set-request delete-regex-match-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/delete-regex-match-set-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/delete-regex-match-set-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteRegexMatchSet", :http.request.spec/error-spec {"WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception, "WAFNonexistentItemException" :portkey.aws.waf-regional/waf-nonexistent-item-exception, "WAFReferencedItemException" :portkey.aws.waf-regional/waf-referenced-item-exception, "WAFStaleDataException" :portkey.aws.waf-regional/waf-stale-data-exception, "WAFNonEmptyEntityException" :portkey.aws.waf-regional/waf-non-empty-entity-exception}})))))
(clojure.spec.alpha/fdef delete-regex-match-set :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/delete-regex-match-set-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/delete-regex-match-set-response))

(clojure.core/defn list-ip-sets ([] (list-ip-sets {})) ([list-ip-sets-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-ip-sets-request list-ip-sets-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/list-ip-sets-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/list-ip-sets-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListIPSets", :http.request.spec/error-spec {"WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception}})))))
(clojure.spec.alpha/fdef list-ip-sets :args (clojure.spec.alpha/? :portkey.aws.waf-regional/list-ip-sets-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/list-ip-sets-response))

(clojure.core/defn create-rate-based-rule ([create-rate-based-rule-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-create-rate-based-rule-request create-rate-based-rule-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/create-rate-based-rule-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/create-rate-based-rule-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateRateBasedRule", :http.request.spec/error-spec {"WAFStaleDataException" :portkey.aws.waf-regional/waf-stale-data-exception, "WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFDisallowedNameException" :portkey.aws.waf-regional/waf-disallowed-name-exception, "WAFInvalidParameterException" :portkey.aws.waf-regional/waf-invalid-parameter-exception, "WAFLimitsExceededException" :portkey.aws.waf-regional/waf-limits-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-rate-based-rule :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/create-rate-based-rule-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/create-rate-based-rule-response))