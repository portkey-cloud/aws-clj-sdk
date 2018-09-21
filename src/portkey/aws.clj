(ns portkey.aws)

(defn dashed [^String s]
  (-> s (.replaceAll "(?<=[a-z0-9])(?=[A-Z]([a-z]|$))|_" "-") .toLowerCase))
