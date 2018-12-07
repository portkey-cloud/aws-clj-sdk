(defproject portkey/aws-clj-sdk "0.1.0-SNAPSHOT"
  :description "Clojure bindings for AWS"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [net.cgrand/xforms "0.16.0"]
                 [clj-http "3.9.1"]
                 [org.clojure/core.async "0.4.474"]
                 [cheshire "5.8.0"]
                 [org.clojure/data.xml "0.2.0-alpha5"]
                 [ring/ring-codec "1.1.1"]]
  :profiles {:dev {:dependencies   [[org.clojure/java.classpath "0.2.3"]
                                    [org.jsoup/jsoup "1.11.2"]
                                    [camel-snake-kebab "0.4.0"]
                                    [ring/ring-spec "0.0.4"]
                                    [org.clojure/test.check "0.10.0-alpha3"]]
                   :source-paths   ["dev"]
                   :resource-paths ["test-resources"]
                   ;;                 :resource-paths ["test-resources"]
                   ;;                   :aliases {"gen-aws-api" ["run" "-m" "portkey.awsgen/generate-files!"]}
                   }})
