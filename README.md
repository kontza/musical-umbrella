# musical-umbrella
Funny name. However; this is an exercise in multimodule Maven with 
an external dependency bringing part of properties.

# Bonus Content
There's a Docker composition in `grafana` directory. It contains Grafana, Loki, and Tempo.
Start it up, then run `SPRING_PROFILES_ACTIVE=loki mvn spring-boot:run -pl :musical-umbrella-back`.
Once the app is running, run `http http://localhost:3003`. Now you can check logs from Loki using
`{app="MusicalUmbrella"}` query statement. If you find a line containing a trace ID, there should
be a button next to it taking you to the corresponding trace in Tempo.
