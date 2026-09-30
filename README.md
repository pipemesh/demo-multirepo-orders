# demo-multirepo-orders

The orders service, and the client library other services use to call it.
Part of the multi-repository PipeMesh demo: the pipeline lives in
[demo-multirepo-pipeline](https://github.com/pipemesh/demo-multirepo-pipeline),
which declares this repository and builds it.

- `client/` is the client library. The pipeline builds it into
  `orders-client.jar` and produces it as an entry; billing builds against
  that jar.
- `service/` is the service itself.

This repository has no `pipemesh.yaml`: it is added to the org, and the
pipeline repository declares it.
