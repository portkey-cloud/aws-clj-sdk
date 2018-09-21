(defproject portkey/aws-clj-sdk "0.1.0-SNAPSHOT"
  :description "Clojure bindings for AWS"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [net.cgrand/xforms "0.16.0"]
                 [cheshire "5.8.0"]]
  :profiles {:dev {:dependencies [[org.clojure/java.classpath "0.2.3"]
                                  [org.jsoup/jsoup "1.11.2"]]
                   :source-paths ["dev"]
  ;;                 :resource-paths ["test-resources"]
;;                   :aliases {"gen-aws-api" ["run" "-m" "portkey.awsgen/generate-files!"]}
                   }})
