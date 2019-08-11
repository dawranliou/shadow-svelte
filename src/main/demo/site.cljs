(ns demo.site)

(defn page-index
  {:export true
   :svelte/page "index"}
  []
  [:div
   [:h1 "Hi people!"]

   [:p "Welcome to your new svelte site."]
   [:p "Now go build something great with ClojureScript."]])
