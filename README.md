# musical-umbrella
Funny name. However; this is an exercise in multimodule Maven with 
an external dependency bringing part of properties.

Additionally there is a Python script, `simple-zipkin`, that receives 
trace data from `spring-cloud-sleuth-zipkin`.  I added it because I
wanted to see if data really is sent to port 9411.

Next up: I'm going to add Grafana Tempo into the mix, and see if I
can get an UI for traces, too.
