(ns portkey.aws.route53domains (:require [portkey.aws]))

(def
 endpoints
 '{"us-east-1"
   {:credential-scope {:service "route53domains", :region "us-east-1"},
    :ssl-common-name "route53domains.us-east-1.amazonaws.com",
    :endpoint "https://route53domains.us-east-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-email)

(clojure.core/declare ser-contact-detail)

(clojure.core/declare ser-nameserver)

(clojure.core/declare ser-duration-in-years)

(clojure.core/declare ser-contact-name)

(clojure.core/declare ser-zip-code)

(clojure.core/declare ser-tag-key)

(clojure.core/declare ser-extra-param)

(clojure.core/declare ser-country-code)

(clojure.core/declare ser-extra-param-value)

(clojure.core/declare ser-extra-param-list)

(clojure.core/declare ser-lang-code)

(clojure.core/declare ser-contact-number)

(clojure.core/declare ser-tag-list)

(clojure.core/declare ser-tag-key-list)

(clojure.core/declare ser-glue-ip-list)

(clojure.core/declare ser-extra-param-name)

(clojure.core/declare ser-tag-value)

(clojure.core/declare ser-operation-id)

(clojure.core/declare ser-fi-auth-key)

(clojure.core/declare ser-integer)

(clojure.core/declare ser-address-line)

(clojure.core/declare ser-glue-ip)

(clojure.core/declare ser-nameserver-list)

(clojure.core/declare ser-timestamp)

(clojure.core/declare ser-city)

(clojure.core/declare ser-state)

(clojure.core/declare ser-tag)

(clojure.core/declare ser-domain-auth-code)

(clojure.core/declare ser-page-marker)

(clojure.core/declare ser-domain-name)

(clojure.core/declare ser-contact-type)

(clojure.core/declare ser-host-name)

(clojure.core/declare ser-current-expiry-year)

(clojure.core/declare ser-page-max-items)

(clojure.core/declare ser-boolean)

(clojure.core/defn- ser-email [input] #:http.request.field{:value input, :shape "Email"})

(clojure.core/defn- ser-contact-detail [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ContactDetail", :type "structure", :sensitive true} (clojure.core/contains? input :extra-params) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-extra-param-list (input :extra-params)) #:http.request.field{:name "ExtraParams", :shape "ExtraParamList"})) (clojure.core/contains? input :email) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-email (input :email)) #:http.request.field{:name "Email", :shape "Email"})) (clojure.core/contains? input :zip-code) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-zip-code (input :zip-code)) #:http.request.field{:name "ZipCode", :shape "ZipCode"})) (clojure.core/contains? input :country-code) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-country-code (input :country-code)) #:http.request.field{:name "CountryCode", :shape "CountryCode"})) (clojure.core/contains? input :organization-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-contact-name (input :organization-name)) #:http.request.field{:name "OrganizationName", :shape "ContactName"})) (clojure.core/contains? input :address-line-1) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-address-line (input :address-line-1)) #:http.request.field{:name "AddressLine1", :shape "AddressLine"})) (clojure.core/contains? input :fax) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-contact-number (input :fax)) #:http.request.field{:name "Fax", :shape "ContactNumber"})) (clojure.core/contains? input :address-line-2) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-address-line (input :address-line-2)) #:http.request.field{:name "AddressLine2", :shape "AddressLine"})) (clojure.core/contains? input :city) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-city (input :city)) #:http.request.field{:name "City", :shape "City"})) (clojure.core/contains? input :state) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-state (input :state)) #:http.request.field{:name "State", :shape "State"})) (clojure.core/contains? input :last-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-contact-name (input :last-name)) #:http.request.field{:name "LastName", :shape "ContactName"})) (clojure.core/contains? input :contact-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-contact-type (input :contact-type)) #:http.request.field{:name "ContactType", :shape "ContactType"})) (clojure.core/contains? input :first-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-contact-name (input :first-name)) #:http.request.field{:name "FirstName", :shape "ContactName"})) (clojure.core/contains? input :phone-number) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-contact-number (input :phone-number)) #:http.request.field{:name "PhoneNumber", :shape "ContactNumber"}))))

(clojure.core/defn- ser-nameserver [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-host-name (:name input)) #:http.request.field{:name "Name", :shape "HostName"})], :shape "Nameserver", :type "structure"} (clojure.core/contains? input :glue-ips) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-glue-ip-list (input :glue-ips)) #:http.request.field{:name "GlueIps", :shape "GlueIpList"}))))

(clojure.core/defn- ser-duration-in-years [input] #:http.request.field{:value input, :shape "DurationInYears"})

(clojure.core/defn- ser-contact-name [input] #:http.request.field{:value input, :shape "ContactName"})

(clojure.core/defn- ser-zip-code [input] #:http.request.field{:value input, :shape "ZipCode"})

(clojure.core/defn- ser-tag-key [input] #:http.request.field{:value input, :shape "TagKey"})

(clojure.core/defn- ser-extra-param [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-extra-param-name (:name input)) #:http.request.field{:name "Name", :shape "ExtraParamName"}) (clojure.core/into (ser-extra-param-value (:value input)) #:http.request.field{:name "Value", :shape "ExtraParamValue"})], :shape "ExtraParam", :type "structure"}))

(clojure.core/defn- ser-country-code [input] #:http.request.field{:value (clojure.core/get {:mm "MM", "CR" "CR", :tw "TW", "TG" "TG", :fr "FR", "TJ" "TJ", "ZA" "ZA", "IM" "IM", "PE" "PE", :ni "NI", :bd "BD", "LC" "LC", :gh "GH", "CH" "CH", :kp "KP", :mh "MH", "RU" "RU", :tv "TV", :gu "GU", :bt "BT", "MP" "MP", "CK" "CK", "SI" "SI", :lr "LR", "AU" "AU", "KR" "KR", "IT" "IT", "FI" "FI", :gn "GN", :ge "GE", :az "AZ", "SC" "SC", :fo "FO", "TT" "TT", :kh "KH", "TK" "TK", :rw "RW", :sz "SZ", "MY" "MY", "SY" "SY", "MN" "MN", "KP" "KP", :ma "MA", "AM" "AM", :ws "WS", "DZ" "DZ", :mv "MV", :hr "HR", "UY" "UY", :es "ES", "TD" "TD", "DJ" "DJ", :pt "PT", :vg "VG", :cz "CZ", "BI" "BI", "MK" "MK", :gm "GM", "MU" "MU", "LI" "LI", :pg "PG", :pe "PE", :pk "PK", "NU" "NU", :lu "LU", "GR" "GR", "GY" "GY", :fi "FI", "CG" "CG", :bz "BZ", :ga "GA", :pf "PF", :do "DO", "ML" "ML", "GM" "GM", :cl "CL", "SA" "SA", :ye "YE", :au "AU", "CX" "CX", "BH" "BH", :bb "BB", "NE" "NE", :er "ER", :bi "BI", :tl "TL", "BN" "BN", "MF" "MF", "CD" "CD", "DK" "DK", :is "IS", :be "BE", "BJ" "BJ", :ug "UG", :ba "BA", :tc "TC", :cv "CV", :kg "KG", "ME" "ME", :dk "DK", "BO" "BO", :sm "SM", "JO" "JO", "CV" "CV", "VE" "VE", "CI" "CI", :gb "GB", "UZ" "UZ", :cu "CU", :mo "MO", :dm "DM", "TN" "TN", :cd "CD", "IS" "IS", :ca "CA", :as "AS", :ro "RO", :sy "SY", :nc "NC", :td "TD", :li "LI", :ai "AI", :tz "TZ", :sl "SL", :bj "BJ", "TM" "TM", "GA" "GA", :th "TH", "LS" "LS", "TZ" "TZ", :jp "JP", :ua "UA", "AT" "AT", :tr "TR", :et "ET", :lc "LC", :bl "BL", :aw "AW", :lk "LK", :us "US", "LT" "LT", :hu "HU", "NP" "NP", :sg "SG", "BG" "BG", :mw "MW", "IL" "IL", "GU" "GU", "PK" "PK", :ec "EC", :mr "MR", :uz "UZ", "PT" "PT", "HR" "HR", "VU" "VU", "PF" "PF", "BM" "BM", :cr "CR", "MR" "MR", "GE" "GE", "HU" "HU", "TW" "TW", "MM" "MM", :nz "NZ", :tn "TN", :gy "GY", :fj "FJ", :ci "CI", :cc "CC", :la "LA", "VG" "VG", "YE" "YE", :so "SO", :kn "KN", "SR" "SR", "PN" "PN", :zw "ZW", :af "AF", "VA" "VA", "AN" "AN", "PR" "PR", "KW" "KW", :sa "SA", "SE" "SE", "GB" "GB", :cg "CG", :pl "PL", "VN" "VN", "CF" "CF", "PA" "PA", "VC" "VC", :gq "GQ", "JP" "JP", :ls "LS", "IR" "IR", :zm "ZM", "AF" "AF", :vn "VN", "LY" "LY", :tj "TJ", "MZ" "MZ", "RO" "RO", "QA" "QA", "CM" "CM", :dj "DJ", "BY" "BY", :ch "CH", :kw "KW", :am "AM", "SD" "SD", :ck "CK", "MO" "MO", "KY" "KY", :tm "TM", "AR" "AR", :jo "JO", :sb "SB", :mf "MF", :it "IT", :ht "HT", :om "OM", "BR" "BR", :cm "CM", "ZW" "ZW", :bh "BH", "NR" "NR", "NZ" "NZ", "AW" "AW", :gr "GR", :pw "PW", :gw "GW", "FJ" "FJ", :co "CO", :ml "ML", "ID" "ID", "SV" "SV", "CN" "CN", :tt "TT", "FM" "FM", :uy "UY", "HT" "HT", "CC" "CC", "RW" "RW", "BA" "BA", :nu "NU", :mk "MK", "TL" "TL", :rs "RS", :nl "NL", "JM" "JM", "KM" "KM", :mz "MZ", "KE" "KE", "WS" "WS", "TO" "TO", "PY" "PY", "SH" "SH", :iq "IQ", "CY" "CY", :bf "BF", "GH" "GH", "MA" "MA", :vc "VC", "SG" "SG", :bn "BN", "LK" "LK", :gd "GD", "PH" "PH", "SM" "SM", :lb "LB", :pa "PA", :va "VA", "WF" "WF", "TR" "TR", "BZ" "BZ", "CU" "CU", "TV" "TV", :za "ZA", :mn "MN", "AD" "AD", "SB" "SB", "DM" "DM", "LR" "LR", :np "NP", :al "AL", "OM" "OM", "SO" "SO", :sk "SK", :kz "KZ", :na "NA", :ie "IE", "DO" "DO", :ag "AG", :an "AN", :st "ST", "AL" "AL", "BL" "BL", :de "DE", "FR" "FR", "GW" "GW", :qa "QA", :nr "NR", :cx "CX", :id "ID", "MS" "MS", "BB" "BB", "CA" "CA", :mx "MX", :gt "GT", :pm "PM", :jm "JM", "MG" "MG", :cy "CY", :ar "AR", "KH" "KH", "LA" "LA", :at "AT", "HN" "HN", :aq "AQ", "TH" "TH", :ke "KE", "DE" "DE", "LB" "LB", "KZ" "KZ", "AS" "AS", "EC" "EC", :ao "AO", :il "IL", "NO" "NO", :cf "CF", "AO" "AO", "FK" "FK", "ET" "ET", "MD" "MD", :ru "RU", :gl "GL", :se "SE", "AG" "AG", "BE" "BE", :ph "PH", :bs "BS", "MV" "MV", "SZ" "SZ", "CZ" "CZ", "CL" "CL", :gi "GI", "BT" "BT", :sc "SC", "NL" "NL", :sd "SD", "EG" "EG", :ve "VE", :sn "SN", :bw "BW", :km "KM", :ee "EE", "SN" "SN", :by "BY", "FO" "FO", :br "BR", "EE" "EE", "AQ" "AQ", "ST" "ST", "KN" "KN", "BW" "BW", "MH" "MH", "NI" "NI", "PG" "PG", :sv "SV", "VI" "VI", :sh "SH", "IQ" "IQ", :mu "MU", :ne "NE", "KG" "KG", :hk "HK", :dz "DZ", :mg "MG", "US" "US", "ZM" "ZM", "MC" "MC", "GI" "GI", "NC" "NC", "GT" "GT", :mc "MC", :eg "EG", "BF" "BF", "YT" "YT", :ir "IR", :fk "FK", "LU" "LU", :me "ME", "UA" "UA", :ki "KI", "IE" "IE", "LV" "LV", "GD" "GD", :bm "BM", :ad "AD", "MW" "MW", :ae "AE", :my "MY", "BS" "BS", :bg "BG", :lt "LT", :ms "MS", "AZ" "AZ", :wf "WF", "SK" "SK", :hn "HN", :ng "NG", :pr "PR", "GQ" "GQ", "TC" "TC", :py "PY", :yt "YT", "IN" "IN", "ES" "ES", :ly "LY", "GL" "GL", :lv "LV", :tk "TK", "KI" "KI", :mt "MT", :mp "MP", "HK" "HK", :kr "KR", "CO" "CO", "RS" "RS", :im "IM", "NG" "NG", :fm "FM", :pn "PN", :sr "SR", "UG" "UG", "SL" "SL", :si "SI", "ER" "ER", :tg "TG", :cn "CN", "AE" "AE", :vi "VI", :no "NO", "PM" "PM", "BD" "BD", "MT" "MT", "AI" "AI", :bo "BO", "GN" "GN", :in "IN", "PW" "PW", :vu "VU", :md "MD", :to "TO", "NA" "NA", "MX" "MX", :ky "KY", "PL" "PL"} input), :shape "CountryCode"})

(clojure.core/defn- ser-extra-param-value [input] #:http.request.field{:value input, :shape "ExtraParamValue"})

(clojure.core/defn- ser-extra-param-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-extra-param coll) #:http.request.field{:shape "ExtraParam"}))) input), :shape "ExtraParamList", :type "list"})

(clojure.core/defn- ser-lang-code [input] #:http.request.field{:value input, :shape "LangCode"})

(clojure.core/defn- ser-contact-number [input] #:http.request.field{:value input, :shape "ContactNumber"})

(clojure.core/defn- ser-tag-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag coll) #:http.request.field{:shape "Tag"}))) input), :shape "TagList", :type "list"})

(clojure.core/defn- ser-tag-key-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag-key coll) #:http.request.field{:shape "TagKey"}))) input), :shape "TagKeyList", :type "list"})

(clojure.core/defn- ser-glue-ip-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-glue-ip coll) #:http.request.field{:shape "GlueIp"}))) input), :shape "GlueIpList", :type "list"})

(clojure.core/defn- ser-extra-param-name [input] #:http.request.field{:value (clojure.core/get {:uk-contact-type "UK_CONTACT_TYPE", "CA_LEGAL_TYPE" "CA_LEGAL_TYPE", "DOCUMENT_NUMBER" "DOCUMENT_NUMBER", :es-identification "ES_IDENTIFICATION", :ca-business-entity-type "CA_BUSINESS_ENTITY_TYPE", :birth-date-in-yyyy-mm-dd "BIRTH_DATE_IN_YYYY_MM_DD", :ca-legal-type "CA_LEGAL_TYPE", "ES_IDENTIFICATION" "ES_IDENTIFICATION", "ES_IDENTIFICATION_TYPE" "ES_IDENTIFICATION_TYPE", :es-legal-form "ES_LEGAL_FORM", "BIRTH_COUNTRY" "BIRTH_COUNTRY", "AU_ID_NUMBER" "AU_ID_NUMBER", "BIRTH_CITY" "BIRTH_CITY", :fi-nationality "FI_NATIONALITY", :uk-company-number "UK_COMPANY_NUMBER", :fi-organization-type "FI_ORGANIZATION_TYPE", "RU_PASSPORT_DATA" "RU_PASSPORT_DATA", :birth-city "BIRTH_CITY", "FI_BUSINESS_NUMBER" "FI_BUSINESS_NUMBER", :it-registrant-entity-type "IT_REGISTRANT_ENTITY_TYPE", "AU_ID_TYPE" "AU_ID_TYPE", :birth-department "BIRTH_DEPARTMENT", :se-id-number "SE_ID_NUMBER", :vat-number "VAT_NUMBER", "BIRTH_DATE_IN_YYYY_MM_DD" "BIRTH_DATE_IN_YYYY_MM_DD", :es-identification-type "ES_IDENTIFICATION_TYPE", "VAT_NUMBER" "VAT_NUMBER", :document-number "DOCUMENT_NUMBER", "IT_PIN" "IT_PIN", "ES_LEGAL_FORM" "ES_LEGAL_FORM", :ru-passport-data "RU_PASSPORT_DATA", :au-id-type "AU_ID_TYPE", "BRAND_NUMBER" "BRAND_NUMBER", "FI_ID_NUMBER" "FI_ID_NUMBER", "IT_REGISTRANT_ENTITY_TYPE" "IT_REGISTRANT_ENTITY_TYPE", :duns-number "DUNS_NUMBER", "BIRTH_DEPARTMENT" "BIRTH_DEPARTMENT", :fi-id-number "FI_ID_NUMBER", "UK_COMPANY_NUMBER" "UK_COMPANY_NUMBER", :birth-country "BIRTH_COUNTRY", :sg-id-number "SG_ID_NUMBER", :au-id-number "AU_ID_NUMBER", "UK_CONTACT_TYPE" "UK_CONTACT_TYPE", "FI_ORGANIZATION_TYPE" "FI_ORGANIZATION_TYPE", :fi-business-number "FI_BUSINESS_NUMBER", :it-pin "IT_PIN", "DUNS_NUMBER" "DUNS_NUMBER", "SG_ID_NUMBER" "SG_ID_NUMBER", :brand-number "BRAND_NUMBER", "CA_BUSINESS_ENTITY_TYPE" "CA_BUSINESS_ENTITY_TYPE", "FI_NATIONALITY" "FI_NATIONALITY", "SE_ID_NUMBER" "SE_ID_NUMBER"} input), :shape "ExtraParamName"})

(clojure.core/defn- ser-tag-value [input] #:http.request.field{:value input, :shape "TagValue"})

(clojure.core/defn- ser-operation-id [input] #:http.request.field{:value input, :shape "OperationId"})

(clojure.core/defn- ser-fi-auth-key [input] #:http.request.field{:value input, :shape "FIAuthKey"})

(clojure.core/defn- ser-integer [input] #:http.request.field{:value input, :shape "Integer"})

(clojure.core/defn- ser-address-line [input] #:http.request.field{:value input, :shape "AddressLine"})

(clojure.core/defn- ser-glue-ip [input] #:http.request.field{:value input, :shape "GlueIp"})

(clojure.core/defn- ser-nameserver-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-nameserver coll) #:http.request.field{:shape "Nameserver"}))) input), :shape "NameserverList", :type "list"})

(clojure.core/defn- ser-timestamp [input] #:http.request.field{:value input, :shape "Timestamp"})

(clojure.core/defn- ser-city [input] #:http.request.field{:value input, :shape "City"})

(clojure.core/defn- ser-state [input] #:http.request.field{:value input, :shape "State"})

(clojure.core/defn- ser-tag [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Tag", :type "structure"} (clojure.core/contains? input :key) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-key (input :key)) #:http.request.field{:name "Key", :shape "TagKey"})) (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-value (input :value)) #:http.request.field{:name "Value", :shape "TagValue"}))))

(clojure.core/defn- ser-domain-auth-code [input] #:http.request.field{:value input, :shape "DomainAuthCode"})

(clojure.core/defn- ser-page-marker [input] #:http.request.field{:value input, :shape "PageMarker"})

(clojure.core/defn- ser-domain-name [input] #:http.request.field{:value input, :shape "DomainName"})

(clojure.core/defn- ser-contact-type [input] #:http.request.field{:value (clojure.core/get {:reseller "RESELLER", "PUBLIC_BODY" "PUBLIC_BODY", :person "PERSON", "ASSOCIATION" "ASSOCIATION", "COMPANY" "COMPANY", "PERSON" "PERSON", "RESELLER" "RESELLER", :association "ASSOCIATION", :public-body "PUBLIC_BODY", :company "COMPANY"} input), :shape "ContactType"})

(clojure.core/defn- ser-host-name [input] #:http.request.field{:value input, :shape "HostName"})

(clojure.core/defn- ser-current-expiry-year [input] #:http.request.field{:value input, :shape "CurrentExpiryYear"})

(clojure.core/defn- ser-page-max-items [input] #:http.request.field{:value input, :shape "PageMaxItems"})

(clojure.core/defn- ser-boolean [input] #:http.request.field{:value input, :shape "Boolean"})

(clojure.core/defn- req-check-domain-availability-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain-name (input :domain-name)) #:http.request.field{:name "DomainName", :shape "DomainName"})]} (clojure.core/contains? input :idn-lang-code) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-lang-code (input :idn-lang-code)) #:http.request.field{:name "IdnLangCode", :shape "LangCode"}))))

(clojure.core/defn- req-get-contact-reachability-status-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :domain-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-domain-name (input :domain-name)) #:http.request.field{:name "domainName", :shape "DomainName"}))))

(clojure.core/defn- req-update-domain-contact-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain-name (input :domain-name)) #:http.request.field{:name "DomainName", :shape "DomainName"})]} (clojure.core/contains? input :admin-contact) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-contact-detail (input :admin-contact)) #:http.request.field{:name "AdminContact", :shape "ContactDetail"})) (clojure.core/contains? input :registrant-contact) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-contact-detail (input :registrant-contact)) #:http.request.field{:name "RegistrantContact", :shape "ContactDetail"})) (clojure.core/contains? input :tech-contact) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-contact-detail (input :tech-contact)) #:http.request.field{:name "TechContact", :shape "ContactDetail"}))))

(clojure.core/defn- req-get-operation-detail-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-operation-id (input :operation-id)) #:http.request.field{:name "OperationId", :shape "OperationId"})]}))

(clojure.core/defn- req-resend-contact-reachability-email-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :domain-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-domain-name (input :domain-name)) #:http.request.field{:name "domainName", :shape "DomainName"}))))

(clojure.core/defn- req-enable-domain-auto-renew-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain-name (input :domain-name)) #:http.request.field{:name "DomainName", :shape "DomainName"})]}))

(clojure.core/defn- req-disable-domain-auto-renew-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain-name (input :domain-name)) #:http.request.field{:name "DomainName", :shape "DomainName"})]}))

(clojure.core/defn- req-check-domain-transferability-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain-name (input :domain-name)) #:http.request.field{:name "DomainName", :shape "DomainName"})]} (clojure.core/contains? input :auth-code) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-domain-auth-code (input :auth-code)) #:http.request.field{:name "AuthCode", :shape "DomainAuthCode"}))))

(clojure.core/defn- req-get-domain-suggestions-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain-name (input :domain-name)) #:http.request.field{:name "DomainName", :shape "DomainName"}) (clojure.core/into (ser-integer (input :suggestion-count)) #:http.request.field{:name "SuggestionCount", :shape "Integer"}) (clojure.core/into (ser-boolean (input :only-available)) #:http.request.field{:name "OnlyAvailable", :shape "Boolean"})]}))

(clojure.core/defn- req-view-billing-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :start) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :start)) #:http.request.field{:name "Start", :shape "Timestamp"})) (clojure.core/contains? input :end) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :end)) #:http.request.field{:name "End", :shape "Timestamp"})) (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-marker (input :marker)) #:http.request.field{:name "Marker", :shape "PageMarker"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-max-items (input :max-items)) #:http.request.field{:name "MaxItems", :shape "PageMaxItems"}))))

(clojure.core/defn- req-update-domain-contact-privacy-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain-name (input :domain-name)) #:http.request.field{:name "DomainName", :shape "DomainName"})]} (clojure.core/contains? input :admin-privacy) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :admin-privacy)) #:http.request.field{:name "AdminPrivacy", :shape "Boolean"})) (clojure.core/contains? input :registrant-privacy) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :registrant-privacy)) #:http.request.field{:name "RegistrantPrivacy", :shape "Boolean"})) (clojure.core/contains? input :tech-privacy) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :tech-privacy)) #:http.request.field{:name "TechPrivacy", :shape "Boolean"}))))

(clojure.core/defn- req-list-tags-for-domain-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain-name (input :domain-name)) #:http.request.field{:name "DomainName", :shape "DomainName"})]}))

(clojure.core/defn- req-list-operations-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :submitted-since) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :submitted-since)) #:http.request.field{:name "SubmittedSince", :shape "Timestamp"})) (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-marker (input :marker)) #:http.request.field{:name "Marker", :shape "PageMarker"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-max-items (input :max-items)) #:http.request.field{:name "MaxItems", :shape "PageMaxItems"}))))

(clojure.core/defn- req-update-domain-nameservers-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain-name (input :domain-name)) #:http.request.field{:name "DomainName", :shape "DomainName"}) (clojure.core/into (ser-nameserver-list (input :nameservers)) #:http.request.field{:name "Nameservers", :shape "NameserverList"})]} (clojure.core/contains? input :fi-auth-key) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-fi-auth-key (input :fi-auth-key)) #:http.request.field{:name "FIAuthKey", :shape "FIAuthKey", :deprecated true}))))

(clojure.core/defn- req-get-domain-detail-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain-name (input :domain-name)) #:http.request.field{:name "DomainName", :shape "DomainName"})]}))

(clojure.core/defn- req-list-domains-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-marker (input :marker)) #:http.request.field{:name "Marker", :shape "PageMarker"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-max-items (input :max-items)) #:http.request.field{:name "MaxItems", :shape "PageMaxItems"}))))

(clojure.core/defn- req-update-tags-for-domain-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain-name (input :domain-name)) #:http.request.field{:name "DomainName", :shape "DomainName"})]} (clojure.core/contains? input :tags-to-update) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-list (input :tags-to-update)) #:http.request.field{:name "TagsToUpdate", :shape "TagList"}))))

(clojure.core/defn- req-retrieve-domain-auth-code-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain-name (input :domain-name)) #:http.request.field{:name "DomainName", :shape "DomainName"})]}))

(clojure.core/defn- req-renew-domain-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain-name (input :domain-name)) #:http.request.field{:name "DomainName", :shape "DomainName"}) (clojure.core/into (ser-current-expiry-year (input :current-expiry-year)) #:http.request.field{:name "CurrentExpiryYear", :shape "CurrentExpiryYear"})]} (clojure.core/contains? input :duration-in-years) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-duration-in-years (input :duration-in-years)) #:http.request.field{:name "DurationInYears", :shape "DurationInYears"}))))

(clojure.core/defn- req-register-domain-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain-name (input :domain-name)) #:http.request.field{:name "DomainName", :shape "DomainName"}) (clojure.core/into (ser-duration-in-years (input :duration-in-years)) #:http.request.field{:name "DurationInYears", :shape "DurationInYears"}) (clojure.core/into (ser-contact-detail (input :admin-contact)) #:http.request.field{:name "AdminContact", :shape "ContactDetail"}) (clojure.core/into (ser-contact-detail (input :registrant-contact)) #:http.request.field{:name "RegistrantContact", :shape "ContactDetail"}) (clojure.core/into (ser-contact-detail (input :tech-contact)) #:http.request.field{:name "TechContact", :shape "ContactDetail"})]} (clojure.core/contains? input :idn-lang-code) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-lang-code (input :idn-lang-code)) #:http.request.field{:name "IdnLangCode", :shape "LangCode"})) (clojure.core/contains? input :privacy-protect-registrant-contact) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :privacy-protect-registrant-contact)) #:http.request.field{:name "PrivacyProtectRegistrantContact", :shape "Boolean"})) (clojure.core/contains? input :auto-renew) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :auto-renew)) #:http.request.field{:name "AutoRenew", :shape "Boolean"})) (clojure.core/contains? input :privacy-protect-admin-contact) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :privacy-protect-admin-contact)) #:http.request.field{:name "PrivacyProtectAdminContact", :shape "Boolean"})) (clojure.core/contains? input :privacy-protect-tech-contact) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :privacy-protect-tech-contact)) #:http.request.field{:name "PrivacyProtectTechContact", :shape "Boolean"}))))

(clojure.core/defn- req-delete-tags-for-domain-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain-name (input :domain-name)) #:http.request.field{:name "DomainName", :shape "DomainName"}) (clojure.core/into (ser-tag-key-list (input :tags-to-delete)) #:http.request.field{:name "TagsToDelete", :shape "TagKeyList"})]}))

(clojure.core/defn- req-disable-domain-transfer-lock-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain-name (input :domain-name)) #:http.request.field{:name "DomainName", :shape "DomainName"})]}))

(clojure.core/defn- req-transfer-domain-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain-name (input :domain-name)) #:http.request.field{:name "DomainName", :shape "DomainName"}) (clojure.core/into (ser-duration-in-years (input :duration-in-years)) #:http.request.field{:name "DurationInYears", :shape "DurationInYears"}) (clojure.core/into (ser-contact-detail (input :admin-contact)) #:http.request.field{:name "AdminContact", :shape "ContactDetail"}) (clojure.core/into (ser-contact-detail (input :registrant-contact)) #:http.request.field{:name "RegistrantContact", :shape "ContactDetail"}) (clojure.core/into (ser-contact-detail (input :tech-contact)) #:http.request.field{:name "TechContact", :shape "ContactDetail"})]} (clojure.core/contains? input :idn-lang-code) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-lang-code (input :idn-lang-code)) #:http.request.field{:name "IdnLangCode", :shape "LangCode"})) (clojure.core/contains? input :nameservers) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-nameserver-list (input :nameservers)) #:http.request.field{:name "Nameservers", :shape "NameserverList"})) (clojure.core/contains? input :privacy-protect-registrant-contact) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :privacy-protect-registrant-contact)) #:http.request.field{:name "PrivacyProtectRegistrantContact", :shape "Boolean"})) (clojure.core/contains? input :auto-renew) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :auto-renew)) #:http.request.field{:name "AutoRenew", :shape "Boolean"})) (clojure.core/contains? input :auth-code) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-domain-auth-code (input :auth-code)) #:http.request.field{:name "AuthCode", :shape "DomainAuthCode"})) (clojure.core/contains? input :privacy-protect-admin-contact) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :privacy-protect-admin-contact)) #:http.request.field{:name "PrivacyProtectAdminContact", :shape "Boolean"})) (clojure.core/contains? input :privacy-protect-tech-contact) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :privacy-protect-tech-contact)) #:http.request.field{:name "PrivacyProtectTechContact", :shape "Boolean"}))))

(clojure.core/defn- req-enable-domain-transfer-lock-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain-name (input :domain-name)) #:http.request.field{:name "DomainName", :shape "DomainName"})]}))

(clojure.spec.alpha/def :portkey.aws.route53domains.check-domain-availability-request/idn-lang-code (clojure.spec.alpha/and :portkey.aws.route53domains/lang-code))
(clojure.spec.alpha/def :portkey.aws.route53domains/check-domain-availability-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53domains/domain-name] :opt-un [:portkey.aws.route53domains.check-domain-availability-request/idn-lang-code]))

(clojure.spec.alpha/def :portkey.aws.route53domains.get-contact-reachability-status-request/domain-name (clojure.spec.alpha/and :portkey.aws.route53domains/domain-name))
(clojure.spec.alpha/def :portkey.aws.route53domains/get-contact-reachability-status-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53domains.get-contact-reachability-status-request/domain-name]))

(clojure.spec.alpha/def :portkey.aws.route53domains.domain-limit-exceeded/message (clojure.spec.alpha/and :portkey.aws.route53domains/error-message))
(clojure.spec.alpha/def :portkey.aws.route53domains/domain-limit-exceeded (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53domains.domain-limit-exceeded/message]))

(clojure.spec.alpha/def :portkey.aws.route53domains/domain-status-list (clojure.spec.alpha/coll-of :portkey.aws.route53domains/domain-status))

(clojure.spec.alpha/def :portkey.aws.route53domains.get-domain-suggestions-response/suggestions-list (clojure.spec.alpha/and :portkey.aws.route53domains/domain-suggestions-list))
(clojure.spec.alpha/def :portkey.aws.route53domains/get-domain-suggestions-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53domains.get-domain-suggestions-response/suggestions-list]))

(clojure.spec.alpha/def :portkey.aws.route53domains/update-domain-contact-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53domains/operation-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53domains/email (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 254))))

(clojure.spec.alpha/def :portkey.aws.route53domains.contact-detail/extra-params (clojure.spec.alpha/and :portkey.aws.route53domains/extra-param-list))
(clojure.spec.alpha/def :portkey.aws.route53domains.contact-detail/organization-name (clojure.spec.alpha/and :portkey.aws.route53domains/contact-name))
(clojure.spec.alpha/def :portkey.aws.route53domains.contact-detail/address-line-1 (clojure.spec.alpha/and :portkey.aws.route53domains/address-line))
(clojure.spec.alpha/def :portkey.aws.route53domains.contact-detail/fax (clojure.spec.alpha/and :portkey.aws.route53domains/contact-number))
(clojure.spec.alpha/def :portkey.aws.route53domains.contact-detail/address-line-2 (clojure.spec.alpha/and :portkey.aws.route53domains/address-line))
(clojure.spec.alpha/def :portkey.aws.route53domains.contact-detail/last-name (clojure.spec.alpha/and :portkey.aws.route53domains/contact-name))
(clojure.spec.alpha/def :portkey.aws.route53domains.contact-detail/first-name (clojure.spec.alpha/and :portkey.aws.route53domains/contact-name))
(clojure.spec.alpha/def :portkey.aws.route53domains.contact-detail/phone-number (clojure.spec.alpha/and :portkey.aws.route53domains/contact-number))
(clojure.spec.alpha/def :portkey.aws.route53domains/contact-detail (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53domains.contact-detail/extra-params :portkey.aws.route53domains/email :portkey.aws.route53domains/zip-code :portkey.aws.route53domains/country-code :portkey.aws.route53domains.contact-detail/organization-name :portkey.aws.route53domains.contact-detail/address-line-1 :portkey.aws.route53domains.contact-detail/fax :portkey.aws.route53domains.contact-detail/address-line-2 :portkey.aws.route53domains/city :portkey.aws.route53domains/state :portkey.aws.route53domains.contact-detail/last-name :portkey.aws.route53domains/contact-type :portkey.aws.route53domains.contact-detail/first-name :portkey.aws.route53domains.contact-detail/phone-number]))

(clojure.spec.alpha/def :portkey.aws.route53domains.update-domain-contact-request/admin-contact (clojure.spec.alpha/and :portkey.aws.route53domains/contact-detail))
(clojure.spec.alpha/def :portkey.aws.route53domains.update-domain-contact-request/registrant-contact (clojure.spec.alpha/and :portkey.aws.route53domains/contact-detail))
(clojure.spec.alpha/def :portkey.aws.route53domains.update-domain-contact-request/tech-contact (clojure.spec.alpha/and :portkey.aws.route53domains/contact-detail))
(clojure.spec.alpha/def :portkey.aws.route53domains/update-domain-contact-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53domains/domain-name] :opt-un [:portkey.aws.route53domains.update-domain-contact-request/admin-contact :portkey.aws.route53domains.update-domain-contact-request/registrant-contact :portkey.aws.route53domains.update-domain-contact-request/tech-contact]))

(clojure.spec.alpha/def :portkey.aws.route53domains.get-domain-detail-response/who-is-server (clojure.spec.alpha/and :portkey.aws.route53domains/registrar-who-is-server))
(clojure.spec.alpha/def :portkey.aws.route53domains.get-domain-detail-response/dns-sec (clojure.spec.alpha/and :portkey.aws.route53domains/dns-sec))
(clojure.spec.alpha/def :portkey.aws.route53domains.get-domain-detail-response/admin-contact (clojure.spec.alpha/and :portkey.aws.route53domains/contact-detail))
(clojure.spec.alpha/def :portkey.aws.route53domains.get-domain-detail-response/admin-privacy (clojure.spec.alpha/and :portkey.aws.route53domains/boolean))
(clojure.spec.alpha/def :portkey.aws.route53domains.get-domain-detail-response/tech-contact (clojure.spec.alpha/and :portkey.aws.route53domains/contact-detail))
(clojure.spec.alpha/def :portkey.aws.route53domains.get-domain-detail-response/registrant-privacy (clojure.spec.alpha/and :portkey.aws.route53domains/boolean))
(clojure.spec.alpha/def :portkey.aws.route53domains.get-domain-detail-response/registrant-contact (clojure.spec.alpha/and :portkey.aws.route53domains/contact-detail))
(clojure.spec.alpha/def :portkey.aws.route53domains.get-domain-detail-response/expiration-date (clojure.spec.alpha/and :portkey.aws.route53domains/timestamp))
(clojure.spec.alpha/def :portkey.aws.route53domains.get-domain-detail-response/nameservers (clojure.spec.alpha/and :portkey.aws.route53domains/nameserver-list))
(clojure.spec.alpha/def :portkey.aws.route53domains.get-domain-detail-response/abuse-contact-email (clojure.spec.alpha/and :portkey.aws.route53domains/email))
(clojure.spec.alpha/def :portkey.aws.route53domains.get-domain-detail-response/auto-renew (clojure.spec.alpha/and :portkey.aws.route53domains/boolean))
(clojure.spec.alpha/def :portkey.aws.route53domains.get-domain-detail-response/updated-date (clojure.spec.alpha/and :portkey.aws.route53domains/timestamp))
(clojure.spec.alpha/def :portkey.aws.route53domains.get-domain-detail-response/tech-privacy (clojure.spec.alpha/and :portkey.aws.route53domains/boolean))
(clojure.spec.alpha/def :portkey.aws.route53domains.get-domain-detail-response/creation-date (clojure.spec.alpha/and :portkey.aws.route53domains/timestamp))
(clojure.spec.alpha/def :portkey.aws.route53domains.get-domain-detail-response/status-list (clojure.spec.alpha/and :portkey.aws.route53domains/domain-status-list))
(clojure.spec.alpha/def :portkey.aws.route53domains.get-domain-detail-response/abuse-contact-phone (clojure.spec.alpha/and :portkey.aws.route53domains/contact-number))
(clojure.spec.alpha/def :portkey.aws.route53domains/get-domain-detail-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53domains/domain-name :portkey.aws.route53domains.get-domain-detail-response/nameservers :portkey.aws.route53domains.get-domain-detail-response/admin-contact :portkey.aws.route53domains.get-domain-detail-response/registrant-contact :portkey.aws.route53domains.get-domain-detail-response/tech-contact] :opt-un [:portkey.aws.route53domains.get-domain-detail-response/who-is-server :portkey.aws.route53domains.get-domain-detail-response/dns-sec :portkey.aws.route53domains.get-domain-detail-response/admin-privacy :portkey.aws.route53domains/registry-domain-id :portkey.aws.route53domains.get-domain-detail-response/registrant-privacy :portkey.aws.route53domains.get-domain-detail-response/expiration-date :portkey.aws.route53domains.get-domain-detail-response/abuse-contact-email :portkey.aws.route53domains.get-domain-detail-response/auto-renew :portkey.aws.route53domains.get-domain-detail-response/updated-date :portkey.aws.route53domains/registrar-url :portkey.aws.route53domains/registrar-name :portkey.aws.route53domains.get-domain-detail-response/tech-privacy :portkey.aws.route53domains.get-domain-detail-response/creation-date :portkey.aws.route53domains/reseller :portkey.aws.route53domains.get-domain-detail-response/status-list :portkey.aws.route53domains.get-domain-detail-response/abuse-contact-phone]))

(clojure.spec.alpha/def :portkey.aws.route53domains/update-tags-for-domain-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53domains.domain-suggestion/availability (clojure.spec.alpha/and :portkey.aws.route53domains/string))
(clojure.spec.alpha/def :portkey.aws.route53domains/domain-suggestion (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53domains/domain-name :portkey.aws.route53domains.domain-suggestion/availability]))

(clojure.spec.alpha/def :portkey.aws.route53domains.list-operations-response/operations (clojure.spec.alpha/and :portkey.aws.route53domains/operation-summary-list))
(clojure.spec.alpha/def :portkey.aws.route53domains.list-operations-response/next-page-marker (clojure.spec.alpha/and :portkey.aws.route53domains/page-marker))
(clojure.spec.alpha/def :portkey.aws.route53domains/list-operations-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53domains.list-operations-response/operations] :opt-un [:portkey.aws.route53domains.list-operations-response/next-page-marker]))

(clojure.spec.alpha/def :portkey.aws.route53domains.nameserver/name (clojure.spec.alpha/and :portkey.aws.route53domains/host-name))
(clojure.spec.alpha/def :portkey.aws.route53domains.nameserver/glue-ips (clojure.spec.alpha/and :portkey.aws.route53domains/glue-ip-list))
(clojure.spec.alpha/def :portkey.aws.route53domains/nameserver (clojure.spec.alpha/keys :req-un [:portkey.aws.route53domains.nameserver/name] :opt-un [:portkey.aws.route53domains.nameserver/glue-ips]))

(clojure.spec.alpha/def :portkey.aws.route53domains/registry-domain-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.route53domains/duration-in-years (clojure.spec.alpha/int-in 1 10))

(clojure.spec.alpha/def :portkey.aws.route53domains/contact-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.route53domains/get-operation-detail-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53domains/operation-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53domains.resend-contact-reachability-email-response/domain-name (clojure.spec.alpha/and :portkey.aws.route53domains/domain-name))
(clojure.spec.alpha/def :portkey.aws.route53domains.resend-contact-reachability-email-response/email-address (clojure.spec.alpha/and :portkey.aws.route53domains/email))
(clojure.spec.alpha/def :portkey.aws.route53domains.resend-contact-reachability-email-response/is-already-verified (clojure.spec.alpha/and :portkey.aws.route53domains/boolean))
(clojure.spec.alpha/def :portkey.aws.route53domains/resend-contact-reachability-email-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53domains.resend-contact-reachability-email-response/domain-name :portkey.aws.route53domains.resend-contact-reachability-email-response/email-address :portkey.aws.route53domains.resend-contact-reachability-email-response/is-already-verified]))

(clojure.spec.alpha/def :portkey.aws.route53domains.resend-contact-reachability-email-request/domain-name (clojure.spec.alpha/and :portkey.aws.route53domains/domain-name))
(clojure.spec.alpha/def :portkey.aws.route53domains/resend-contact-reachability-email-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53domains.resend-contact-reachability-email-request/domain-name]))

(clojure.spec.alpha/def :portkey.aws.route53domains/zip-code (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.route53domains/invoice-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.route53domains/enable-domain-auto-renew-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53domains/domain-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53domains/disable-domain-auto-renew-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53domains/domain-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53domains/tag-key (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.route53domains/domain-availability #{:dont-know :unavailable "AVAILABLE" :unavailable-restricted :available-preorder :unavailable-premium "UNAVAILABLE" "DONT_KNOW" :available-reserved :reserved "UNAVAILABLE_RESTRICTED" "UNAVAILABLE_PREMIUM" "RESERVED" :available "AVAILABLE_PREORDER" "AVAILABLE_RESERVED"})

(clojure.spec.alpha/def :portkey.aws.route53domains.check-domain-transferability-request/auth-code (clojure.spec.alpha/and :portkey.aws.route53domains/domain-auth-code))
(clojure.spec.alpha/def :portkey.aws.route53domains/check-domain-transferability-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53domains/domain-name] :opt-un [:portkey.aws.route53domains.check-domain-transferability-request/auth-code]))

(clojure.spec.alpha/def :portkey.aws.route53domains.extra-param/name (clojure.spec.alpha/and :portkey.aws.route53domains/extra-param-name))
(clojure.spec.alpha/def :portkey.aws.route53domains.extra-param/value (clojure.spec.alpha/and :portkey.aws.route53domains/extra-param-value))
(clojure.spec.alpha/def :portkey.aws.route53domains/extra-param (clojure.spec.alpha/keys :req-un [:portkey.aws.route53domains.extra-param/name :portkey.aws.route53domains.extra-param/value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53domains/country-code #{:mm "CR" :tw "TG" :fr "TJ" "ZA" "IM" "PE" :ni :bd "LC" :gh "CH" :kp :mh "RU" :tv :gu :bt "MP" "CK" "SI" :lr "AU" "KR" "IT" "FI" :gn :ge :az "SC" :fo "TT" :kh "TK" :rw :sz "MY" "SY" "MN" "KP" :ma "AM" :ws "DZ" :mv :hr "UY" :es "TD" "DJ" :pt :vg :cz "BI" "MK" :gm "MU" "LI" :pg :pe :pk "NU" :lu "GR" "GY" :fi "CG" :bz :ga :pf :do "ML" "GM" :cl "SA" :ye :au "CX" "BH" :bb "NE" :er :bi :tl "BN" "MF" "CD" "DK" :is :be "BJ" :ug :ba :tc :cv :kg "ME" :dk "BO" :sm "JO" "CV" "VE" "CI" :gb "UZ" :cu :mo :dm "TN" :cd "IS" :ca :as :ro :sy :nc :td :li :ai :tz :sl :bj "TM" "GA" :th "LS" "TZ" :jp :ua "AT" :tr :et :lc :bl :aw :lk :us "LT" :hu "NP" :sg "BG" :mw "IL" "GU" "PK" :ec :mr :uz "PT" "HR" "VU" "PF" "BM" :cr "MR" "GE" "HU" "TW" "MM" :nz :tn :gy :fj :ci :cc :la "VG" "YE" :so :kn "SR" "PN" :zw :af "VA" "AN" "PR" "KW" :sa "SE" "GB" :cg :pl "VN" "CF" "PA" "VC" :gq "JP" :ls "IR" :zm "AF" :vn "LY" :tj "MZ" "RO" "QA" "CM" :dj "BY" :ch :kw :am "SD" :ck "MO" "KY" :tm "AR" :jo :sb :mf :it :ht :om "BR" :cm "ZW" :bh "NR" "NZ" "AW" :gr :pw :gw "FJ" :co :ml "ID" "SV" "CN" :tt "FM" :uy "HT" "CC" "RW" "BA" :nu :mk "TL" :rs :nl "JM" "KM" :mz "KE" "WS" "TO" "PY" "SH" :iq "CY" :bf "GH" "MA" :vc "SG" :bn "LK" :gd "PH" "SM" :lb :pa :va "WF" "TR" "BZ" "CU" "TV" :za :mn "AD" "SB" "DM" "LR" :np :al "OM" "SO" :sk :kz :na :ie "DO" :ag :an :st "AL" "BL" :de "FR" "GW" :qa :nr :cx :id "MS" "BB" "CA" :mx :gt :pm :jm "MG" :cy :ar "KH" "LA" :at "HN" :aq "TH" :ke "DE" "LB" "KZ" "AS" "EC" :ao :il "NO" :cf "AO" "FK" "ET" "MD" :ru :gl :se "AG" "BE" :ph :bs "MV" "SZ" "CZ" "CL" :gi "BT" :sc "NL" :sd "EG" :ve :sn :bw :km :ee "SN" :by "FO" :br "EE" "AQ" "ST" "KN" "BW" "MH" "NI" "PG" :sv "VI" :sh "IQ" :mu :ne "KG" :hk :dz :mg "US" "ZM" "MC" "GI" "NC" "GT" :mc :eg "BF" "YT" :ir :fk "LU" :me "UA" :ki "IE" "LV" "GD" :bm :ad "MW" :ae :my "BS" :bg :lt :ms "AZ" :wf "SK" :hn :ng :pr "GQ" "TC" :py :yt "IN" "ES" :ly "GL" :lv :tk "KI" :mt :mp "HK" :kr "CO" "RS" :im "NG" :fm :pn :sr "UG" "SL" :si "ER" :tg :cn "AE" :vi :no "PM" "BD" "MT" "AI" :bo "GN" :in "PW" :vu :md :to "NA" "MX" :ky "PL"})

(clojure.spec.alpha/def :portkey.aws.route53domains/extra-param-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.route53domains/extra-param-list (clojure.spec.alpha/coll-of :portkey.aws.route53domains/extra-param))

(clojure.spec.alpha/def :portkey.aws.route53domains.get-domain-suggestions-request/suggestion-count (clojure.spec.alpha/and :portkey.aws.route53domains/integer))
(clojure.spec.alpha/def :portkey.aws.route53domains.get-domain-suggestions-request/only-available (clojure.spec.alpha/and :portkey.aws.route53domains/boolean))
(clojure.spec.alpha/def :portkey.aws.route53domains/get-domain-suggestions-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53domains/domain-name :portkey.aws.route53domains.get-domain-suggestions-request/suggestion-count :portkey.aws.route53domains.get-domain-suggestions-request/only-available] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53domains.view-billing-response/next-page-marker (clojure.spec.alpha/and :portkey.aws.route53domains/page-marker))
(clojure.spec.alpha/def :portkey.aws.route53domains/view-billing-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53domains.view-billing-response/next-page-marker :portkey.aws.route53domains/billing-records]))

(clojure.spec.alpha/def :portkey.aws.route53domains.view-billing-request/start (clojure.spec.alpha/and :portkey.aws.route53domains/timestamp))
(clojure.spec.alpha/def :portkey.aws.route53domains.view-billing-request/end (clojure.spec.alpha/and :portkey.aws.route53domains/timestamp))
(clojure.spec.alpha/def :portkey.aws.route53domains.view-billing-request/marker (clojure.spec.alpha/and :portkey.aws.route53domains/page-marker))
(clojure.spec.alpha/def :portkey.aws.route53domains.view-billing-request/max-items (clojure.spec.alpha/and :portkey.aws.route53domains/page-max-items))
(clojure.spec.alpha/def :portkey.aws.route53domains/view-billing-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53domains.view-billing-request/start :portkey.aws.route53domains.view-billing-request/end :portkey.aws.route53domains.view-billing-request/marker :portkey.aws.route53domains.view-billing-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.route53domains.check-domain-availability-response/availability (clojure.spec.alpha/and :portkey.aws.route53domains/domain-availability))
(clojure.spec.alpha/def :portkey.aws.route53domains/check-domain-availability-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53domains.check-domain-availability-response/availability] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53domains/lang-code (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 3))))

(clojure.spec.alpha/def :portkey.aws.route53domains/contact-number (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 30))))

(clojure.spec.alpha/def :portkey.aws.route53domains.update-domain-contact-privacy-request/admin-privacy (clojure.spec.alpha/and :portkey.aws.route53domains/boolean))
(clojure.spec.alpha/def :portkey.aws.route53domains.update-domain-contact-privacy-request/registrant-privacy (clojure.spec.alpha/and :portkey.aws.route53domains/boolean))
(clojure.spec.alpha/def :portkey.aws.route53domains.update-domain-contact-privacy-request/tech-privacy (clojure.spec.alpha/and :portkey.aws.route53domains/boolean))
(clojure.spec.alpha/def :portkey.aws.route53domains/update-domain-contact-privacy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53domains/domain-name] :opt-un [:portkey.aws.route53domains.update-domain-contact-privacy-request/admin-privacy :portkey.aws.route53domains.update-domain-contact-privacy-request/registrant-privacy :portkey.aws.route53domains.update-domain-contact-privacy-request/tech-privacy]))

(clojure.spec.alpha/def :portkey.aws.route53domains/list-tags-for-domain-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53domains/domain-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53domains.list-operations-request/submitted-since (clojure.spec.alpha/and :portkey.aws.route53domains/timestamp))
(clojure.spec.alpha/def :portkey.aws.route53domains.list-operations-request/marker (clojure.spec.alpha/and :portkey.aws.route53domains/page-marker))
(clojure.spec.alpha/def :portkey.aws.route53domains.list-operations-request/max-items (clojure.spec.alpha/and :portkey.aws.route53domains/page-max-items))
(clojure.spec.alpha/def :portkey.aws.route53domains/list-operations-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53domains.list-operations-request/submitted-since :portkey.aws.route53domains.list-operations-request/marker :portkey.aws.route53domains.list-operations-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.route53domains/register-domain-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53domains/operation-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53domains.update-domain-nameservers-request/nameservers (clojure.spec.alpha/and :portkey.aws.route53domains/nameserver-list))
(clojure.spec.alpha/def :portkey.aws.route53domains/update-domain-nameservers-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53domains/domain-name :portkey.aws.route53domains.update-domain-nameservers-request/nameservers] :opt-un [:portkey.aws.route53domains/fi-auth-key]))

(clojure.spec.alpha/def :portkey.aws.route53domains/domain-summary-list (clojure.spec.alpha/coll-of :portkey.aws.route53domains/domain-summary))

(clojure.spec.alpha/def :portkey.aws.route53domains.get-contact-reachability-status-response/domain-name (clojure.spec.alpha/and :portkey.aws.route53domains/domain-name))
(clojure.spec.alpha/def :portkey.aws.route53domains.get-contact-reachability-status-response/status (clojure.spec.alpha/and :portkey.aws.route53domains/reachability-status))
(clojure.spec.alpha/def :portkey.aws.route53domains/get-contact-reachability-status-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53domains.get-contact-reachability-status-response/domain-name :portkey.aws.route53domains.get-contact-reachability-status-response/status]))

(clojure.spec.alpha/def :portkey.aws.route53domains/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.route53domains/price clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.route53domains/transferable #{:untransferable :dont-know "TRANSFERABLE" "UNTRANSFERABLE" :transferable "DONT_KNOW"})

(clojure.spec.alpha/def :portkey.aws.route53domains.invalid-input/message (clojure.spec.alpha/and :portkey.aws.route53domains/error-message))
(clojure.spec.alpha/def :portkey.aws.route53domains/invalid-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53domains.invalid-input/message]))

(clojure.spec.alpha/def :portkey.aws.route53domains/disable-domain-transfer-lock-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53domains/operation-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53domains/domain-status (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.route53domains/tag-list (clojure.spec.alpha/coll-of :portkey.aws.route53domains/tag))

(clojure.spec.alpha/def :portkey.aws.route53domains/disable-domain-auto-renew-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53domains/get-domain-detail-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53domains/domain-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53domains.list-domains-request/marker (clojure.spec.alpha/and :portkey.aws.route53domains/page-marker))
(clojure.spec.alpha/def :portkey.aws.route53domains.list-domains-request/max-items (clojure.spec.alpha/and :portkey.aws.route53domains/page-max-items))
(clojure.spec.alpha/def :portkey.aws.route53domains/list-domains-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53domains.list-domains-request/marker :portkey.aws.route53domains.list-domains-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.route53domains/tag-key-list (clojure.spec.alpha/coll-of :portkey.aws.route53domains/tag-key))

(clojure.spec.alpha/def :portkey.aws.route53domains/glue-ip-list (clojure.spec.alpha/coll-of :portkey.aws.route53domains/glue-ip))

(clojure.spec.alpha/def :portkey.aws.route53domains.operation-summary/status (clojure.spec.alpha/and :portkey.aws.route53domains/operation-status))
(clojure.spec.alpha/def :portkey.aws.route53domains.operation-summary/type (clojure.spec.alpha/and :portkey.aws.route53domains/operation-type))
(clojure.spec.alpha/def :portkey.aws.route53domains.operation-summary/submitted-date (clojure.spec.alpha/and :portkey.aws.route53domains/timestamp))
(clojure.spec.alpha/def :portkey.aws.route53domains/operation-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.route53domains/operation-id :portkey.aws.route53domains.operation-summary/status :portkey.aws.route53domains.operation-summary/type :portkey.aws.route53domains.operation-summary/submitted-date] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53domains/update-domain-contact-privacy-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53domains/operation-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53domains.update-tags-for-domain-request/tags-to-update (clojure.spec.alpha/and :portkey.aws.route53domains/tag-list))
(clojure.spec.alpha/def :portkey.aws.route53domains/update-tags-for-domain-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53domains/domain-name] :opt-un [:portkey.aws.route53domains.update-tags-for-domain-request/tags-to-update]))

(clojure.spec.alpha/def :portkey.aws.route53domains/retrieve-domain-auth-code-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53domains/domain-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53domains/extra-param-name #{:uk-contact-type "CA_LEGAL_TYPE" "DOCUMENT_NUMBER" :es-identification :ca-business-entity-type :birth-date-in-yyyy-mm-dd :ca-legal-type "ES_IDENTIFICATION" "ES_IDENTIFICATION_TYPE" :es-legal-form "BIRTH_COUNTRY" "AU_ID_NUMBER" "BIRTH_CITY" :fi-nationality :uk-company-number :fi-organization-type "RU_PASSPORT_DATA" :birth-city "FI_BUSINESS_NUMBER" :it-registrant-entity-type "AU_ID_TYPE" :birth-department :se-id-number :vat-number "BIRTH_DATE_IN_YYYY_MM_DD" :es-identification-type "VAT_NUMBER" :document-number "IT_PIN" "ES_LEGAL_FORM" :ru-passport-data :au-id-type "BRAND_NUMBER" "FI_ID_NUMBER" "IT_REGISTRANT_ENTITY_TYPE" :duns-number "BIRTH_DEPARTMENT" :fi-id-number "UK_COMPANY_NUMBER" :birth-country :sg-id-number :au-id-number "UK_CONTACT_TYPE" "FI_ORGANIZATION_TYPE" :fi-business-number :it-pin "DUNS_NUMBER" "SG_ID_NUMBER" :brand-number "CA_BUSINESS_ENTITY_TYPE" "FI_NATIONALITY" "SE_ID_NUMBER"})

(clojure.spec.alpha/def :portkey.aws.route53domains/renew-domain-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53domains/domain-name :portkey.aws.route53domains/current-expiry-year] :opt-un [:portkey.aws.route53domains/duration-in-years]))

(clojure.spec.alpha/def :portkey.aws.route53domains/operation-summary-list (clojure.spec.alpha/coll-of :portkey.aws.route53domains/operation-summary))

(clojure.spec.alpha/def :portkey.aws.route53domains/tag-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.route53domains/domain-suggestions-list (clojure.spec.alpha/coll-of :portkey.aws.route53domains/domain-suggestion))

(clojure.spec.alpha/def :portkey.aws.route53domains/enable-domain-transfer-lock-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53domains/operation-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53domains/operation-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.route53domains.register-domain-request/admin-contact (clojure.spec.alpha/and :portkey.aws.route53domains/contact-detail))
(clojure.spec.alpha/def :portkey.aws.route53domains.register-domain-request/idn-lang-code (clojure.spec.alpha/and :portkey.aws.route53domains/lang-code))
(clojure.spec.alpha/def :portkey.aws.route53domains.register-domain-request/tech-contact (clojure.spec.alpha/and :portkey.aws.route53domains/contact-detail))
(clojure.spec.alpha/def :portkey.aws.route53domains.register-domain-request/registrant-contact (clojure.spec.alpha/and :portkey.aws.route53domains/contact-detail))
(clojure.spec.alpha/def :portkey.aws.route53domains.register-domain-request/privacy-protect-registrant-contact (clojure.spec.alpha/and :portkey.aws.route53domains/boolean))
(clojure.spec.alpha/def :portkey.aws.route53domains.register-domain-request/auto-renew (clojure.spec.alpha/and :portkey.aws.route53domains/boolean))
(clojure.spec.alpha/def :portkey.aws.route53domains.register-domain-request/privacy-protect-admin-contact (clojure.spec.alpha/and :portkey.aws.route53domains/boolean))
(clojure.spec.alpha/def :portkey.aws.route53domains.register-domain-request/privacy-protect-tech-contact (clojure.spec.alpha/and :portkey.aws.route53domains/boolean))
(clojure.spec.alpha/def :portkey.aws.route53domains/register-domain-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53domains/domain-name :portkey.aws.route53domains/duration-in-years :portkey.aws.route53domains.register-domain-request/admin-contact :portkey.aws.route53domains.register-domain-request/registrant-contact :portkey.aws.route53domains.register-domain-request/tech-contact] :opt-un [:portkey.aws.route53domains.register-domain-request/idn-lang-code :portkey.aws.route53domains.register-domain-request/privacy-protect-registrant-contact :portkey.aws.route53domains.register-domain-request/auto-renew :portkey.aws.route53domains.register-domain-request/privacy-protect-admin-contact :portkey.aws.route53domains.register-domain-request/privacy-protect-tech-contact]))

(clojure.spec.alpha/def :portkey.aws.route53domains/fi-auth-key (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.route53domains/operation-status #{"IN_PROGRESS" :in-progress :successful "ERROR" :submitted "SUBMITTED" "FAILED" :error :failed "SUCCESSFUL"})

(clojure.spec.alpha/def :portkey.aws.route53domains/dns-sec (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.route53domains/integer clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.route53domains/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.route53domains/address-line (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.route53domains.delete-tags-for-domain-request/tags-to-delete (clojure.spec.alpha/and :portkey.aws.route53domains/tag-key-list))
(clojure.spec.alpha/def :portkey.aws.route53domains/delete-tags-for-domain-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53domains/domain-name :portkey.aws.route53domains.delete-tags-for-domain-request/tags-to-delete] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53domains/registrar-url (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.route53domains/registrar-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.route53domains/domain-transferability (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53domains/transferable]))

(clojure.spec.alpha/def :portkey.aws.route53domains/renew-domain-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53domains/operation-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53domains/operation-type #{:change-domain-owner "EXPIRE_DOMAIN" :renew-domain :delete-domain :push-domain "CHANGE_DOMAIN_OWNER" :transfer-in-domain "CHANGE_PRIVACY_PROTECTION" "REMOVE_DNSSEC" :transfer-out-domain "REGISTER_DOMAIN" "DISABLE_AUTORENEW" "ADD_DNSSEC" "UPDATE_DOMAIN_CONTACT" "ENABLE_AUTORENEW" :expire-domain :enable-autorenew :register-domain "UPDATE_NAMESERVER" :update-domain-contact "DOMAIN_LOCK" :disable-autorenew :domain-lock "PUSH_DOMAIN" :change-privacy-protection "RENEW_DOMAIN" "TRANSFER_OUT_DOMAIN" :update-nameserver :add-dnssec "DELETE_DOMAIN" "TRANSFER_IN_DOMAIN" :remove-dnssec})

(clojure.spec.alpha/def :portkey.aws.route53domains.list-domains-response/domains (clojure.spec.alpha/and :portkey.aws.route53domains/domain-summary-list))
(clojure.spec.alpha/def :portkey.aws.route53domains.list-domains-response/next-page-marker (clojure.spec.alpha/and :portkey.aws.route53domains/page-marker))
(clojure.spec.alpha/def :portkey.aws.route53domains/list-domains-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53domains.list-domains-response/domains] :opt-un [:portkey.aws.route53domains.list-domains-response/next-page-marker]))

(clojure.spec.alpha/def :portkey.aws.route53domains/billing-records (clojure.spec.alpha/coll-of :portkey.aws.route53domains/billing-record))

(clojure.spec.alpha/def :portkey.aws.route53domains/glue-ip (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 45))))

(clojure.spec.alpha/def :portkey.aws.route53domains.check-domain-transferability-response/transferability (clojure.spec.alpha/and :portkey.aws.route53domains/domain-transferability))
(clojure.spec.alpha/def :portkey.aws.route53domains/check-domain-transferability-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53domains.check-domain-transferability-response/transferability] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53domains/nameserver-list (clojure.spec.alpha/coll-of :portkey.aws.route53domains/nameserver))

(clojure.spec.alpha/def :portkey.aws.route53domains/enable-domain-auto-renew-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53domains/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.route53domains/delete-tags-for-domain-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53domains.billing-record/operation (clojure.spec.alpha/and :portkey.aws.route53domains/operation-type))
(clojure.spec.alpha/def :portkey.aws.route53domains.billing-record/bill-date (clojure.spec.alpha/and :portkey.aws.route53domains/timestamp))
(clojure.spec.alpha/def :portkey.aws.route53domains/billing-record (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53domains/domain-name :portkey.aws.route53domains.billing-record/operation :portkey.aws.route53domains/invoice-id :portkey.aws.route53domains.billing-record/bill-date :portkey.aws.route53domains/price]))

(clojure.spec.alpha/def :portkey.aws.route53domains/city (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.route53domains/state (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.route53domains.tag/key (clojure.spec.alpha/and :portkey.aws.route53domains/tag-key))
(clojure.spec.alpha/def :portkey.aws.route53domains.tag/value (clojure.spec.alpha/and :portkey.aws.route53domains/tag-value))
(clojure.spec.alpha/def :portkey.aws.route53domains/tag (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53domains.tag/key :portkey.aws.route53domains.tag/value]))

(clojure.spec.alpha/def :portkey.aws.route53domains/domain-auth-code (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.route53domains/disable-domain-transfer-lock-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53domains/domain-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53domains/page-marker (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 4096))))

(clojure.spec.alpha/def :portkey.aws.route53domains.transfer-domain-request/admin-contact (clojure.spec.alpha/and :portkey.aws.route53domains/contact-detail))
(clojure.spec.alpha/def :portkey.aws.route53domains.transfer-domain-request/idn-lang-code (clojure.spec.alpha/and :portkey.aws.route53domains/lang-code))
(clojure.spec.alpha/def :portkey.aws.route53domains.transfer-domain-request/tech-contact (clojure.spec.alpha/and :portkey.aws.route53domains/contact-detail))
(clojure.spec.alpha/def :portkey.aws.route53domains.transfer-domain-request/registrant-contact (clojure.spec.alpha/and :portkey.aws.route53domains/contact-detail))
(clojure.spec.alpha/def :portkey.aws.route53domains.transfer-domain-request/nameservers (clojure.spec.alpha/and :portkey.aws.route53domains/nameserver-list))
(clojure.spec.alpha/def :portkey.aws.route53domains.transfer-domain-request/privacy-protect-registrant-contact (clojure.spec.alpha/and :portkey.aws.route53domains/boolean))
(clojure.spec.alpha/def :portkey.aws.route53domains.transfer-domain-request/auto-renew (clojure.spec.alpha/and :portkey.aws.route53domains/boolean))
(clojure.spec.alpha/def :portkey.aws.route53domains.transfer-domain-request/auth-code (clojure.spec.alpha/and :portkey.aws.route53domains/domain-auth-code))
(clojure.spec.alpha/def :portkey.aws.route53domains.transfer-domain-request/privacy-protect-admin-contact (clojure.spec.alpha/and :portkey.aws.route53domains/boolean))
(clojure.spec.alpha/def :portkey.aws.route53domains.transfer-domain-request/privacy-protect-tech-contact (clojure.spec.alpha/and :portkey.aws.route53domains/boolean))
(clojure.spec.alpha/def :portkey.aws.route53domains/transfer-domain-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53domains/domain-name :portkey.aws.route53domains/duration-in-years :portkey.aws.route53domains.transfer-domain-request/admin-contact :portkey.aws.route53domains.transfer-domain-request/registrant-contact :portkey.aws.route53domains.transfer-domain-request/tech-contact] :opt-un [:portkey.aws.route53domains.transfer-domain-request/idn-lang-code :portkey.aws.route53domains.transfer-domain-request/nameservers :portkey.aws.route53domains.transfer-domain-request/privacy-protect-registrant-contact :portkey.aws.route53domains.transfer-domain-request/auto-renew :portkey.aws.route53domains.transfer-domain-request/auth-code :portkey.aws.route53domains.transfer-domain-request/privacy-protect-admin-contact :portkey.aws.route53domains.transfer-domain-request/privacy-protect-tech-contact]))

(clojure.spec.alpha/def :portkey.aws.route53domains.tld-rules-violation/message (clojure.spec.alpha/and :portkey.aws.route53domains/error-message))
(clojure.spec.alpha/def :portkey.aws.route53domains/tld-rules-violation (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53domains.tld-rules-violation/message]))

(clojure.spec.alpha/def :portkey.aws.route53domains/domain-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.route53domains.domain-summary/auto-renew (clojure.spec.alpha/and :portkey.aws.route53domains/boolean))
(clojure.spec.alpha/def :portkey.aws.route53domains.domain-summary/transfer-lock (clojure.spec.alpha/and :portkey.aws.route53domains/boolean))
(clojure.spec.alpha/def :portkey.aws.route53domains.domain-summary/expiry (clojure.spec.alpha/and :portkey.aws.route53domains/timestamp))
(clojure.spec.alpha/def :portkey.aws.route53domains/domain-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.route53domains/domain-name] :opt-un [:portkey.aws.route53domains.domain-summary/auto-renew :portkey.aws.route53domains.domain-summary/transfer-lock :portkey.aws.route53domains.domain-summary/expiry]))

(clojure.spec.alpha/def :portkey.aws.route53domains/contact-type #{:reseller "PUBLIC_BODY" :person "ASSOCIATION" "COMPANY" "PERSON" "RESELLER" :association :public-body :company})

(clojure.spec.alpha/def :portkey.aws.route53domains/list-tags-for-domain-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53domains/tag-list] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53domains.unsupported-tld/message (clojure.spec.alpha/and :portkey.aws.route53domains/error-message))
(clojure.spec.alpha/def :portkey.aws.route53domains/unsupported-tld (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53domains.unsupported-tld/message]))

(clojure.spec.alpha/def :portkey.aws.route53domains/enable-domain-transfer-lock-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53domains/domain-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53domains/host-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 255)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_\-.]*" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.route53domains.retrieve-domain-auth-code-response/auth-code (clojure.spec.alpha/and :portkey.aws.route53domains/domain-auth-code))
(clojure.spec.alpha/def :portkey.aws.route53domains/retrieve-domain-auth-code-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53domains.retrieve-domain-auth-code-response/auth-code] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53domains.operation-limit-exceeded/message (clojure.spec.alpha/and :portkey.aws.route53domains/error-message))
(clojure.spec.alpha/def :portkey.aws.route53domains/operation-limit-exceeded (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53domains.operation-limit-exceeded/message]))

(clojure.spec.alpha/def :portkey.aws.route53domains/reachability-status #{:done "EXPIRED" "DONE" :pending "PENDING" :expired})

(clojure.spec.alpha/def :portkey.aws.route53domains/transfer-domain-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53domains/operation-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53domains/reseller (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.route53domains.get-operation-detail-response/status (clojure.spec.alpha/and :portkey.aws.route53domains/operation-status))
(clojure.spec.alpha/def :portkey.aws.route53domains.get-operation-detail-response/message (clojure.spec.alpha/and :portkey.aws.route53domains/error-message))
(clojure.spec.alpha/def :portkey.aws.route53domains.get-operation-detail-response/type (clojure.spec.alpha/and :portkey.aws.route53domains/operation-type))
(clojure.spec.alpha/def :portkey.aws.route53domains.get-operation-detail-response/submitted-date (clojure.spec.alpha/and :portkey.aws.route53domains/timestamp))
(clojure.spec.alpha/def :portkey.aws.route53domains/get-operation-detail-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53domains/operation-id :portkey.aws.route53domains.get-operation-detail-response/status :portkey.aws.route53domains.get-operation-detail-response/message :portkey.aws.route53domains/domain-name :portkey.aws.route53domains.get-operation-detail-response/type :portkey.aws.route53domains.get-operation-detail-response/submitted-date]))

(clojure.spec.alpha/def :portkey.aws.route53domains/update-domain-nameservers-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53domains/operation-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53domains.duplicate-request/message (clojure.spec.alpha/and :portkey.aws.route53domains/error-message))
(clojure.spec.alpha/def :portkey.aws.route53domains/duplicate-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53domains.duplicate-request/message]))

(clojure.spec.alpha/def :portkey.aws.route53domains/current-expiry-year clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.route53domains/page-max-items (clojure.spec.alpha/int-in Long/MIN_VALUE 100))

(clojure.spec.alpha/def :portkey.aws.route53domains/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.route53domains/registrar-who-is-server (clojure.spec.alpha/and clojure.core/string?))

(clojure.core/defn transfer-domain ([transfer-domain-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-transfer-domain-request transfer-domain-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.route53domains/endpoints, :http.request.spec/output-spec :portkey.aws.route53domains/transfer-domain-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-05-15", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.route53domains/transfer-domain-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "TransferDomain", :http.request.spec/error-spec {"InvalidInput" :portkey.aws.route53domains/invalid-input, "UnsupportedTLD" :portkey.aws.route53domains/unsupported-tld, "DuplicateRequest" :portkey.aws.route53domains/duplicate-request, "TLDRulesViolation" :portkey.aws.route53domains/tld-rules-violation, "DomainLimitExceeded" :portkey.aws.route53domains/domain-limit-exceeded, "OperationLimitExceeded" :portkey.aws.route53domains/operation-limit-exceeded}})))))
(clojure.spec.alpha/fdef transfer-domain :args (clojure.spec.alpha/tuple :portkey.aws.route53domains/transfer-domain-request) :ret (clojure.spec.alpha/and :portkey.aws.route53domains/transfer-domain-response))

(clojure.core/defn update-tags-for-domain ([update-tags-for-domain-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-update-tags-for-domain-request update-tags-for-domain-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.route53domains/endpoints, :http.request.spec/output-spec :portkey.aws.route53domains/update-tags-for-domain-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-05-15", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.route53domains/update-tags-for-domain-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateTagsForDomain", :http.request.spec/error-spec {"InvalidInput" :portkey.aws.route53domains/invalid-input, "OperationLimitExceeded" :portkey.aws.route53domains/operation-limit-exceeded, "UnsupportedTLD" :portkey.aws.route53domains/unsupported-tld}})))))
(clojure.spec.alpha/fdef update-tags-for-domain :args (clojure.spec.alpha/tuple :portkey.aws.route53domains/update-tags-for-domain-request) :ret (clojure.spec.alpha/and :portkey.aws.route53domains/update-tags-for-domain-response))

(clojure.core/defn register-domain ([register-domain-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-register-domain-request register-domain-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.route53domains/endpoints, :http.request.spec/output-spec :portkey.aws.route53domains/register-domain-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-05-15", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.route53domains/register-domain-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "RegisterDomain", :http.request.spec/error-spec {"InvalidInput" :portkey.aws.route53domains/invalid-input, "UnsupportedTLD" :portkey.aws.route53domains/unsupported-tld, "DuplicateRequest" :portkey.aws.route53domains/duplicate-request, "TLDRulesViolation" :portkey.aws.route53domains/tld-rules-violation, "DomainLimitExceeded" :portkey.aws.route53domains/domain-limit-exceeded, "OperationLimitExceeded" :portkey.aws.route53domains/operation-limit-exceeded}})))))
(clojure.spec.alpha/fdef register-domain :args (clojure.spec.alpha/tuple :portkey.aws.route53domains/register-domain-request) :ret (clojure.spec.alpha/and :portkey.aws.route53domains/register-domain-response))

(clojure.core/defn list-domains ([] (list-domains {})) ([list-domains-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-list-domains-request list-domains-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.route53domains/endpoints, :http.request.spec/output-spec :portkey.aws.route53domains/list-domains-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-05-15", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.route53domains/list-domains-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListDomains", :http.request.spec/error-spec {"InvalidInput" :portkey.aws.route53domains/invalid-input}})))))
(clojure.spec.alpha/fdef list-domains :args (clojure.spec.alpha/? :portkey.aws.route53domains/list-domains-request) :ret (clojure.spec.alpha/and :portkey.aws.route53domains/list-domains-response))

(clojure.core/defn get-domain-suggestions ([get-domain-suggestions-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-get-domain-suggestions-request get-domain-suggestions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.route53domains/endpoints, :http.request.spec/output-spec :portkey.aws.route53domains/get-domain-suggestions-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-05-15", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.route53domains/get-domain-suggestions-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetDomainSuggestions", :http.request.spec/error-spec {"InvalidInput" :portkey.aws.route53domains/invalid-input, "UnsupportedTLD" :portkey.aws.route53domains/unsupported-tld}})))))
(clojure.spec.alpha/fdef get-domain-suggestions :args (clojure.spec.alpha/tuple :portkey.aws.route53domains/get-domain-suggestions-request) :ret (clojure.spec.alpha/and :portkey.aws.route53domains/get-domain-suggestions-response))

(clojure.core/defn enable-domain-auto-renew ([enable-domain-auto-renew-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-enable-domain-auto-renew-request enable-domain-auto-renew-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.route53domains/endpoints, :http.request.spec/output-spec :portkey.aws.route53domains/enable-domain-auto-renew-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-05-15", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.route53domains/enable-domain-auto-renew-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "EnableDomainAutoRenew", :http.request.spec/error-spec {"InvalidInput" :portkey.aws.route53domains/invalid-input, "UnsupportedTLD" :portkey.aws.route53domains/unsupported-tld, "TLDRulesViolation" :portkey.aws.route53domains/tld-rules-violation}})))))
(clojure.spec.alpha/fdef enable-domain-auto-renew :args (clojure.spec.alpha/tuple :portkey.aws.route53domains/enable-domain-auto-renew-request) :ret (clojure.spec.alpha/and :portkey.aws.route53domains/enable-domain-auto-renew-response))

(clojure.core/defn renew-domain ([renew-domain-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-renew-domain-request renew-domain-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.route53domains/endpoints, :http.request.spec/output-spec :portkey.aws.route53domains/renew-domain-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-05-15", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.route53domains/renew-domain-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "RenewDomain", :http.request.spec/error-spec {"InvalidInput" :portkey.aws.route53domains/invalid-input, "UnsupportedTLD" :portkey.aws.route53domains/unsupported-tld, "DuplicateRequest" :portkey.aws.route53domains/duplicate-request, "TLDRulesViolation" :portkey.aws.route53domains/tld-rules-violation, "OperationLimitExceeded" :portkey.aws.route53domains/operation-limit-exceeded}})))))
(clojure.spec.alpha/fdef renew-domain :args (clojure.spec.alpha/tuple :portkey.aws.route53domains/renew-domain-request) :ret (clojure.spec.alpha/and :portkey.aws.route53domains/renew-domain-response))

(clojure.core/defn update-domain-contact-privacy ([update-domain-contact-privacy-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-update-domain-contact-privacy-request update-domain-contact-privacy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.route53domains/endpoints, :http.request.spec/output-spec :portkey.aws.route53domains/update-domain-contact-privacy-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-05-15", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.route53domains/update-domain-contact-privacy-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateDomainContactPrivacy", :http.request.spec/error-spec {"InvalidInput" :portkey.aws.route53domains/invalid-input, "DuplicateRequest" :portkey.aws.route53domains/duplicate-request, "TLDRulesViolation" :portkey.aws.route53domains/tld-rules-violation, "OperationLimitExceeded" :portkey.aws.route53domains/operation-limit-exceeded, "UnsupportedTLD" :portkey.aws.route53domains/unsupported-tld}})))))
(clojure.spec.alpha/fdef update-domain-contact-privacy :args (clojure.spec.alpha/tuple :portkey.aws.route53domains/update-domain-contact-privacy-request) :ret (clojure.spec.alpha/and :portkey.aws.route53domains/update-domain-contact-privacy-response))

(clojure.core/defn view-billing ([] (view-billing {})) ([view-billing-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-view-billing-request view-billing-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.route53domains/endpoints, :http.request.spec/output-spec :portkey.aws.route53domains/view-billing-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-05-15", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.route53domains/view-billing-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ViewBilling", :http.request.spec/error-spec {"InvalidInput" :portkey.aws.route53domains/invalid-input}})))))
(clojure.spec.alpha/fdef view-billing :args (clojure.spec.alpha/? :portkey.aws.route53domains/view-billing-request) :ret (clojure.spec.alpha/and :portkey.aws.route53domains/view-billing-response))

(clojure.core/defn disable-domain-auto-renew ([disable-domain-auto-renew-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-disable-domain-auto-renew-request disable-domain-auto-renew-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.route53domains/endpoints, :http.request.spec/output-spec :portkey.aws.route53domains/disable-domain-auto-renew-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-05-15", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.route53domains/disable-domain-auto-renew-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DisableDomainAutoRenew", :http.request.spec/error-spec {"InvalidInput" :portkey.aws.route53domains/invalid-input, "UnsupportedTLD" :portkey.aws.route53domains/unsupported-tld}})))))
(clojure.spec.alpha/fdef disable-domain-auto-renew :args (clojure.spec.alpha/tuple :portkey.aws.route53domains/disable-domain-auto-renew-request) :ret (clojure.spec.alpha/and :portkey.aws.route53domains/disable-domain-auto-renew-response))

(clojure.core/defn disable-domain-transfer-lock ([disable-domain-transfer-lock-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-disable-domain-transfer-lock-request disable-domain-transfer-lock-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.route53domains/endpoints, :http.request.spec/output-spec :portkey.aws.route53domains/disable-domain-transfer-lock-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-05-15", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.route53domains/disable-domain-transfer-lock-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DisableDomainTransferLock", :http.request.spec/error-spec {"InvalidInput" :portkey.aws.route53domains/invalid-input, "DuplicateRequest" :portkey.aws.route53domains/duplicate-request, "TLDRulesViolation" :portkey.aws.route53domains/tld-rules-violation, "OperationLimitExceeded" :portkey.aws.route53domains/operation-limit-exceeded, "UnsupportedTLD" :portkey.aws.route53domains/unsupported-tld}})))))
(clojure.spec.alpha/fdef disable-domain-transfer-lock :args (clojure.spec.alpha/tuple :portkey.aws.route53domains/disable-domain-transfer-lock-request) :ret (clojure.spec.alpha/and :portkey.aws.route53domains/disable-domain-transfer-lock-response))

(clojure.core/defn check-domain-transferability ([check-domain-transferability-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-check-domain-transferability-request check-domain-transferability-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.route53domains/endpoints, :http.request.spec/output-spec :portkey.aws.route53domains/check-domain-transferability-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-05-15", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.route53domains/check-domain-transferability-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CheckDomainTransferability", :http.request.spec/error-spec {"InvalidInput" :portkey.aws.route53domains/invalid-input, "UnsupportedTLD" :portkey.aws.route53domains/unsupported-tld}})))))
(clojure.spec.alpha/fdef check-domain-transferability :args (clojure.spec.alpha/tuple :portkey.aws.route53domains/check-domain-transferability-request) :ret (clojure.spec.alpha/and :portkey.aws.route53domains/check-domain-transferability-response))

(clojure.core/defn get-domain-detail ([get-domain-detail-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-get-domain-detail-request get-domain-detail-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.route53domains/endpoints, :http.request.spec/output-spec :portkey.aws.route53domains/get-domain-detail-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-05-15", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.route53domains/get-domain-detail-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetDomainDetail", :http.request.spec/error-spec {"InvalidInput" :portkey.aws.route53domains/invalid-input, "UnsupportedTLD" :portkey.aws.route53domains/unsupported-tld}})))))
(clojure.spec.alpha/fdef get-domain-detail :args (clojure.spec.alpha/tuple :portkey.aws.route53domains/get-domain-detail-request) :ret (clojure.spec.alpha/and :portkey.aws.route53domains/get-domain-detail-response))

(clojure.core/defn list-operations ([] (list-operations {})) ([list-operations-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-list-operations-request list-operations-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.route53domains/endpoints, :http.request.spec/output-spec :portkey.aws.route53domains/list-operations-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-05-15", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.route53domains/list-operations-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListOperations", :http.request.spec/error-spec {"InvalidInput" :portkey.aws.route53domains/invalid-input}})))))
(clojure.spec.alpha/fdef list-operations :args (clojure.spec.alpha/? :portkey.aws.route53domains/list-operations-request) :ret (clojure.spec.alpha/and :portkey.aws.route53domains/list-operations-response))

(clojure.core/defn check-domain-availability ([check-domain-availability-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-check-domain-availability-request check-domain-availability-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.route53domains/endpoints, :http.request.spec/output-spec :portkey.aws.route53domains/check-domain-availability-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-05-15", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.route53domains/check-domain-availability-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CheckDomainAvailability", :http.request.spec/error-spec {"InvalidInput" :portkey.aws.route53domains/invalid-input, "UnsupportedTLD" :portkey.aws.route53domains/unsupported-tld}})))))
(clojure.spec.alpha/fdef check-domain-availability :args (clojure.spec.alpha/tuple :portkey.aws.route53domains/check-domain-availability-request) :ret (clojure.spec.alpha/and :portkey.aws.route53domains/check-domain-availability-response))

(clojure.core/defn get-contact-reachability-status ([] (get-contact-reachability-status {})) ([get-contact-reachability-status-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-get-contact-reachability-status-request get-contact-reachability-status-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.route53domains/endpoints, :http.request.spec/output-spec :portkey.aws.route53domains/get-contact-reachability-status-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-05-15", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.route53domains/get-contact-reachability-status-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetContactReachabilityStatus", :http.request.spec/error-spec {"InvalidInput" :portkey.aws.route53domains/invalid-input, "OperationLimitExceeded" :portkey.aws.route53domains/operation-limit-exceeded, "UnsupportedTLD" :portkey.aws.route53domains/unsupported-tld}})))))
(clojure.spec.alpha/fdef get-contact-reachability-status :args (clojure.spec.alpha/? :portkey.aws.route53domains/get-contact-reachability-status-request) :ret (clojure.spec.alpha/and :portkey.aws.route53domains/get-contact-reachability-status-response))

(clojure.core/defn list-tags-for-domain ([list-tags-for-domain-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-list-tags-for-domain-request list-tags-for-domain-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.route53domains/endpoints, :http.request.spec/output-spec :portkey.aws.route53domains/list-tags-for-domain-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-05-15", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.route53domains/list-tags-for-domain-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListTagsForDomain", :http.request.spec/error-spec {"InvalidInput" :portkey.aws.route53domains/invalid-input, "OperationLimitExceeded" :portkey.aws.route53domains/operation-limit-exceeded, "UnsupportedTLD" :portkey.aws.route53domains/unsupported-tld}})))))
(clojure.spec.alpha/fdef list-tags-for-domain :args (clojure.spec.alpha/tuple :portkey.aws.route53domains/list-tags-for-domain-request) :ret (clojure.spec.alpha/and :portkey.aws.route53domains/list-tags-for-domain-response))

(clojure.core/defn enable-domain-transfer-lock ([enable-domain-transfer-lock-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-enable-domain-transfer-lock-request enable-domain-transfer-lock-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.route53domains/endpoints, :http.request.spec/output-spec :portkey.aws.route53domains/enable-domain-transfer-lock-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-05-15", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.route53domains/enable-domain-transfer-lock-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "EnableDomainTransferLock", :http.request.spec/error-spec {"InvalidInput" :portkey.aws.route53domains/invalid-input, "DuplicateRequest" :portkey.aws.route53domains/duplicate-request, "TLDRulesViolation" :portkey.aws.route53domains/tld-rules-violation, "OperationLimitExceeded" :portkey.aws.route53domains/operation-limit-exceeded, "UnsupportedTLD" :portkey.aws.route53domains/unsupported-tld}})))))
(clojure.spec.alpha/fdef enable-domain-transfer-lock :args (clojure.spec.alpha/tuple :portkey.aws.route53domains/enable-domain-transfer-lock-request) :ret (clojure.spec.alpha/and :portkey.aws.route53domains/enable-domain-transfer-lock-response))

(clojure.core/defn update-domain-nameservers ([update-domain-nameservers-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-update-domain-nameservers-request update-domain-nameservers-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.route53domains/endpoints, :http.request.spec/output-spec :portkey.aws.route53domains/update-domain-nameservers-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-05-15", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.route53domains/update-domain-nameservers-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateDomainNameservers", :http.request.spec/error-spec {"InvalidInput" :portkey.aws.route53domains/invalid-input, "DuplicateRequest" :portkey.aws.route53domains/duplicate-request, "TLDRulesViolation" :portkey.aws.route53domains/tld-rules-violation, "OperationLimitExceeded" :portkey.aws.route53domains/operation-limit-exceeded, "UnsupportedTLD" :portkey.aws.route53domains/unsupported-tld}})))))
(clojure.spec.alpha/fdef update-domain-nameservers :args (clojure.spec.alpha/tuple :portkey.aws.route53domains/update-domain-nameservers-request) :ret (clojure.spec.alpha/and :portkey.aws.route53domains/update-domain-nameservers-response))

(clojure.core/defn get-operation-detail ([get-operation-detail-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-get-operation-detail-request get-operation-detail-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.route53domains/endpoints, :http.request.spec/output-spec :portkey.aws.route53domains/get-operation-detail-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-05-15", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.route53domains/get-operation-detail-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetOperationDetail", :http.request.spec/error-spec {"InvalidInput" :portkey.aws.route53domains/invalid-input}})))))
(clojure.spec.alpha/fdef get-operation-detail :args (clojure.spec.alpha/tuple :portkey.aws.route53domains/get-operation-detail-request) :ret (clojure.spec.alpha/and :portkey.aws.route53domains/get-operation-detail-response))

(clojure.core/defn delete-tags-for-domain ([delete-tags-for-domain-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-delete-tags-for-domain-request delete-tags-for-domain-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.route53domains/endpoints, :http.request.spec/output-spec :portkey.aws.route53domains/delete-tags-for-domain-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-05-15", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.route53domains/delete-tags-for-domain-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteTagsForDomain", :http.request.spec/error-spec {"InvalidInput" :portkey.aws.route53domains/invalid-input, "OperationLimitExceeded" :portkey.aws.route53domains/operation-limit-exceeded, "UnsupportedTLD" :portkey.aws.route53domains/unsupported-tld}})))))
(clojure.spec.alpha/fdef delete-tags-for-domain :args (clojure.spec.alpha/tuple :portkey.aws.route53domains/delete-tags-for-domain-request) :ret (clojure.spec.alpha/and :portkey.aws.route53domains/delete-tags-for-domain-response))

(clojure.core/defn resend-contact-reachability-email ([] (resend-contact-reachability-email {})) ([resend-contact-reachability-email-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-resend-contact-reachability-email-request resend-contact-reachability-email-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.route53domains/endpoints, :http.request.spec/output-spec :portkey.aws.route53domains/resend-contact-reachability-email-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-05-15", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.route53domains/resend-contact-reachability-email-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ResendContactReachabilityEmail", :http.request.spec/error-spec {"InvalidInput" :portkey.aws.route53domains/invalid-input, "OperationLimitExceeded" :portkey.aws.route53domains/operation-limit-exceeded, "UnsupportedTLD" :portkey.aws.route53domains/unsupported-tld}})))))
(clojure.spec.alpha/fdef resend-contact-reachability-email :args (clojure.spec.alpha/? :portkey.aws.route53domains/resend-contact-reachability-email-request) :ret (clojure.spec.alpha/and :portkey.aws.route53domains/resend-contact-reachability-email-response))

(clojure.core/defn update-domain-contact ([update-domain-contact-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-update-domain-contact-request update-domain-contact-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.route53domains/endpoints, :http.request.spec/output-spec :portkey.aws.route53domains/update-domain-contact-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-05-15", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.route53domains/update-domain-contact-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateDomainContact", :http.request.spec/error-spec {"InvalidInput" :portkey.aws.route53domains/invalid-input, "DuplicateRequest" :portkey.aws.route53domains/duplicate-request, "TLDRulesViolation" :portkey.aws.route53domains/tld-rules-violation, "OperationLimitExceeded" :portkey.aws.route53domains/operation-limit-exceeded, "UnsupportedTLD" :portkey.aws.route53domains/unsupported-tld}})))))
(clojure.spec.alpha/fdef update-domain-contact :args (clojure.spec.alpha/tuple :portkey.aws.route53domains/update-domain-contact-request) :ret (clojure.spec.alpha/and :portkey.aws.route53domains/update-domain-contact-response))

(clojure.core/defn retrieve-domain-auth-code ([retrieve-domain-auth-code-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-retrieve-domain-auth-code-request retrieve-domain-auth-code-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.route53domains/endpoints, :http.request.spec/output-spec :portkey.aws.route53domains/retrieve-domain-auth-code-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-05-15", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.route53domains/retrieve-domain-auth-code-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "RetrieveDomainAuthCode", :http.request.spec/error-spec {"InvalidInput" :portkey.aws.route53domains/invalid-input, "UnsupportedTLD" :portkey.aws.route53domains/unsupported-tld}})))))
(clojure.spec.alpha/fdef retrieve-domain-auth-code :args (clojure.spec.alpha/tuple :portkey.aws.route53domains/retrieve-domain-auth-code-request) :ret (clojure.spec.alpha/and :portkey.aws.route53domains/retrieve-domain-auth-code-response))
